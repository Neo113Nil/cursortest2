package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import java.util.ArrayList;

/* loaded from: classes.dex */
class ListenableEditingState extends SpannableStringBuilder {
    private static final String TAG = "ListenableEditingState";
    private int mComposingEndWhenBeginBatchEdit;
    private int mComposingStartWhenBeginBatchEdit;
    private BaseInputConnection mDummyConnection;
    private int mSelectionEndWhenBeginBatchEdit;
    private int mSelectionStartWhenBeginBatchEdit;
    private String mTextWhenBeginBatchEdit;
    private String mToStringCache;
    private int mBatchEditNestDepth = 0;
    private int mChangeNotificationDepth = 0;
    private ArrayList<EditingStateWatcher> mListeners = new ArrayList<>();
    private ArrayList<EditingStateWatcher> mPendingListeners = new ArrayList<>();
    private ArrayList<TextEditingDelta> mBatchTextEditingDeltas = new ArrayList<>();

    public interface EditingStateWatcher {
        void didChangeEditingState(boolean z, boolean z4, boolean z5);
    }

    public ListenableEditingState(TextInputChannel.TextEditState textEditState, View view) {
        this.mDummyConnection = new BaseInputConnection(view, true) { // from class: io.flutter.plugin.editing.ListenableEditingState.1
            @Override // android.view.inputmethod.BaseInputConnection
            public Editable getEditable() {
                return this;
            }
        };
        if (textEditState != null) {
            setEditingState(textEditState);
        }
    }

    private void notifyListener(EditingStateWatcher editingStateWatcher, boolean z, boolean z4, boolean z5) {
        this.mChangeNotificationDepth++;
        editingStateWatcher.didChangeEditingState(z, z4, z5);
        this.mChangeNotificationDepth--;
    }

    private void notifyListenersIfNeeded(boolean z, boolean z4, boolean z5) {
        if (z || z4 || z5) {
            ArrayList<EditingStateWatcher> arrayList = this.mListeners;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                EditingStateWatcher editingStateWatcher = arrayList.get(i4);
                i4++;
                notifyListener(editingStateWatcher, z, z4, z5);
            }
        }
    }

    public void addEditingStateListener(EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "adding a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        if (this.mBatchEditNestDepth <= 0) {
            this.mListeners.add(editingStateWatcher);
        } else {
            Log.w(TAG, "a listener was added to EditingState while a batch edit was in progress");
            this.mPendingListeners.add(editingStateWatcher);
        }
    }

    public void beginBatchEdit() {
        this.mBatchEditNestDepth++;
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        if (this.mBatchEditNestDepth != 1 || this.mListeners.isEmpty()) {
            return;
        }
        this.mTextWhenBeginBatchEdit = toString();
        this.mSelectionStartWhenBeginBatchEdit = getSelectionStart();
        this.mSelectionEndWhenBeginBatchEdit = getSelectionEnd();
        this.mComposingStartWhenBeginBatchEdit = getComposingStart();
        this.mComposingEndWhenBeginBatchEdit = getComposingEnd();
    }

    public void clearBatchDeltas() {
        this.mBatchTextEditingDeltas.clear();
    }

    public void endBatchEdit() {
        int i4 = this.mBatchEditNestDepth;
        if (i4 == 0) {
            Log.e(TAG, "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i4 == 1) {
            ArrayList<EditingStateWatcher> arrayList = this.mPendingListeners;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                EditingStateWatcher editingStateWatcher = arrayList.get(i5);
                i5++;
                notifyListener(editingStateWatcher, true, true, true);
            }
            if (!this.mListeners.isEmpty()) {
                Log.v(TAG, "didFinishBatchEdit with " + this.mListeners.size() + " listener(s)");
                notifyListenersIfNeeded(!toString().equals(this.mTextWhenBeginBatchEdit), (this.mSelectionStartWhenBeginBatchEdit == getSelectionStart() && this.mSelectionEndWhenBeginBatchEdit == getSelectionEnd()) ? false : true, (this.mComposingStartWhenBeginBatchEdit == getComposingStart() && this.mComposingEndWhenBeginBatchEdit == getComposingEnd()) ? false : true);
            }
        }
        this.mListeners.addAll(this.mPendingListeners);
        this.mPendingListeners.clear();
        this.mBatchEditNestDepth--;
    }

    public ArrayList<TextEditingDelta> extractBatchTextEditingDeltas() {
        ArrayList<TextEditingDelta> arrayList = new ArrayList<>(this.mBatchTextEditingDeltas);
        this.mBatchTextEditingDeltas.clear();
        return arrayList;
    }

    public final int getComposingEnd() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int getComposingStart() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int getSelectionEnd() {
        return Selection.getSelectionEnd(this);
    }

    public final int getSelectionStart() {
        return Selection.getSelectionStart(this);
    }

    public void removeEditingStateListener(EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "removing a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        this.mListeners.remove(editingStateWatcher);
        if (this.mBatchEditNestDepth > 0) {
            this.mPendingListeners.remove(editingStateWatcher);
        }
    }

    public void setComposingRange(int i4, int i5) {
        if (i4 < 0 || i4 >= i5) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.mDummyConnection.setComposingRegion(i4, i5);
        }
    }

    public void setEditingState(TextInputChannel.TextEditState textEditState) {
        beginBatchEdit();
        replace(0, length(), (CharSequence) textEditState.text);
        if (textEditState.hasSelection()) {
            Selection.setSelection(this, textEditState.selectionStart, textEditState.selectionEnd);
        } else {
            Selection.removeSelection(this);
        }
        setComposingRange(textEditState.composingStart, textEditState.composingEnd);
        clearBatchDeltas();
        endBatchEdit();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i4, int i5, int i6) {
        super.setSpan(obj, i4, i5, i6);
        this.mBatchTextEditingDeltas.add(new TextEditingDelta(toString(), getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.mToStringCache;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.mToStringCache = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence, int i6, int i7) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        String listenableEditingState = toString();
        int i8 = i5 - i4;
        boolean z = i8 != i7 - i6;
        for (int i9 = 0; i9 < i8 && !z; i9++) {
            z |= charAt(i4 + i9) != charSequence.charAt(i6 + i9);
        }
        if (z) {
            this.mToStringCache = null;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int composingStart = getComposingStart();
        int composingEnd = getComposingEnd();
        SpannableStringBuilder replace = super.replace(i4, i5, charSequence, i6, i7);
        this.mBatchTextEditingDeltas.add(new TextEditingDelta(listenableEditingState, i4, i5, charSequence, getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
        if (this.mBatchEditNestDepth > 0) {
            return replace;
        }
        notifyListenersIfNeeded(z, (getSelectionStart() == selectionStart && getSelectionEnd() == selectionEnd) ? false : true, (getComposingStart() == composingStart && getComposingEnd() == composingEnd) ? false : true);
        return replace;
    }
}
