package com.yandex.div.core.view2.divs.widgets;

import O1.C0860i3;
import O1.Z;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.core.content.a;
import com.yandex.div.R$attr;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.widget.SuperLineHeightEditText;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivInputView extends SuperLineHeightEditText implements DivHolderView<Z.j> {
    private final /* synthetic */ DivHolderViewMixin<Z.j> $$delegate_0;

    @Nullable
    private String _hint;
    private boolean _isFocusable;
    private boolean accessibilityEnabled;

    @Nullable
    private TextView.OnEditorActionListener editorActionListener;
    private boolean enabled;

    @Nullable
    private InputFocusTracker focusTracker;

    @Nullable
    private final Drawable nativeBackground;

    @NotNull
    private final List<Function1<Editable, Unit>> onTextChangedActions;

    @Nullable
    private TextWatcher textChangeWatcher;

    public /* synthetic */ DivInputView(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? R$attr.divInputStyle : i4);
    }

    private int getNativeBackgroundResId() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.editTextBackground, typedValue, true);
        return typedValue.resourceId;
    }

    public void addAfterTextChangeAction(@NotNull Function1<? super Editable, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.textChangeWatcher == null) {
            TextWatcher textWatcher = new TextWatcher() { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$addAfterTextChangeAction$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable editable) {
                    List list;
                    list = DivInputView.this.onTextChangedActions;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(editable);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
                }
            };
            addTextChangedListener(textWatcher);
            this.textChangeWatcher = textWatcher;
        }
        this.onTextChangedActions.add(action);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int save;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        if (scrollX == 0 && scrollY == 0) {
            save = canvas.save();
            try {
                divBorderDrawer.clipCorners(canvas);
                super.draw(canvas);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
            }
        }
        float f4 = scrollX;
        float f5 = scrollY;
        save = canvas.save();
        try {
            canvas.translate(f4, f5);
            divBorderDrawer.clipCorners(canvas);
            canvas.translate(-f4, -f5);
            super.draw(canvas);
            canvas.translate(f4, f5);
            divBorderDrawer.drawBorder(canvas);
        } finally {
        }
    }

    public boolean getAccessibilityEnabled$div_release() {
        return this.accessibilityEnabled;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public Z.j getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public InputFocusTracker getFocusTracker$div_release() {
        return this.focusTracker;
    }

    @Nullable
    public Drawable getNativeBackground$div_release() {
        return this.nativeBackground;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i4, int i5) {
        this.$$delegate_0.onBoundsChanged(i4, i5);
    }

    @Override // androidx.appcompat.widget.C1260i, android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection == null) {
            return null;
        }
        return (getInputType() & 131072) == 0 ? onCreateInputConnection : new InputConnectionWrapper(onCreateInputConnection) { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$onCreateInputConnection$1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitText(@Nullable CharSequence charSequence, int i4) {
                TextView.OnEditorActionListener onEditorActionListener;
                if (Intrinsics.areEqual(charSequence, "\n")) {
                    int imeOptions = this.getImeOptions() & KotlinVersion.MAX_COMPONENT_VALUE;
                    onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, null);
                    }
                }
                return super.commitText(charSequence, i4);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean sendKeyEvent(@NotNull KeyEvent event) {
                TextView.OnEditorActionListener onEditorActionListener;
                Intrinsics.checkNotNullParameter(event, "event");
                if ((event.getKeyCode() == 66 || event.getKeyCode() == 160) && event.getAction() == 0) {
                    int imeOptions = this.getImeOptions() & KotlinVersion.MAX_COMPONENT_VALUE;
                    onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, event);
                    }
                }
                return super.sendKeyEvent(event);
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z4, int i4, @Nullable Rect rect) {
        InputFocusTracker focusTracker$div_release = getFocusTracker$div_release();
        if (focusTracker$div_release != null) {
            focusTracker$div_release.inputFocusChanged(getTag(), this, z4);
        }
        super.onFocusChanged(z4, i4, rect);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, @Nullable KeyEvent keyEvent) {
        if ((getInputType() & 131072) != 0 && (i4 == 66 || i4 == 160)) {
            int imeOptions = getImeOptions() & KotlinVersion.MAX_COMPONENT_VALUE;
            TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
            if (onEditorActionListener != null) {
                return onEditorActionListener.onEditorAction(this, imeOptions, keyEvent);
            }
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightEditText, android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        onBoundsChanged(i4, i5);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void removeAfterTextChangeListener() {
        removeTextChangedListener(this.textChangeWatcher);
        this.onTextChangedActions.clear();
        this.textChangeWatcher = null;
    }

    public void setAccessibilityEnabled$div_release(boolean z4) {
        this.accessibilityEnabled = z4;
        setInputHint(this._hint);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable C0860i3 c0860i3, @NotNull View view) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0.setBorder(bindingContext, c0860i3, view);
    }

    @Override // android.view.View
    public void setContentDescription(@Nullable CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setInputHint(this._hint);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable Z.j jVar) {
        this.$$delegate_0.setDiv(jVar);
    }

    public void setEnabled$div_release(boolean z4) {
        this.enabled = z4;
        setFocusable(this._isFocusable);
    }

    public void setFocusTracker$div_release(@Nullable InputFocusTracker inputFocusTracker) {
        this.focusTracker = inputFocusTracker;
    }

    @Override // android.view.View
    public void setFocusable(boolean z4) {
        this._isFocusable = z4;
        boolean z5 = z4 && getEnabled();
        super.setFocusable(z5);
        setFocusableInTouchMode(z5);
    }

    public void setInputHint(@Nullable String str) {
        CharSequence contentDescription;
        this._hint = str;
        CharSequence charSequence = str;
        if (getAccessibilityEnabled$div_release()) {
            if ((str == null || str.length() == 0) && ((contentDescription = getContentDescription()) == null || contentDescription.length() == 0)) {
                charSequence = null;
            } else if (str == null || str.length() == 0) {
                charSequence = getContentDescription();
            } else {
                CharSequence contentDescription2 = getContentDescription();
                charSequence = str;
                if (contentDescription2 != null) {
                    charSequence = str;
                    if (contentDescription2.length() != 0) {
                        charSequence = StringsKt.Y0(str, JwtParser.SEPARATOR_CHAR) + ". " + ((Object) getContentDescription());
                    }
                }
            }
        }
        setHint(charSequence);
    }

    @Override // android.widget.TextView
    public void setInputType(int i4) {
        if (getInputType() == i4) {
            return;
        }
        super.setInputType(i4);
    }

    @Override // androidx.appcompat.widget.C1260i, android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        if (Intrinsics.areEqual(getKeyListener(), keyListener)) {
            return;
        }
        super.setKeyListener(keyListener);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z4) {
        this.$$delegate_0.setNeedClipping(z4);
    }

    @Override // android.widget.TextView
    public void setOnEditorActionListener(@Nullable TextView.OnEditorActionListener onEditorActionListener) {
        super.setOnEditorActionListener(onEditorActionListener);
        this.editorActionListener = onEditorActionListener;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0.transitionStarted(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.nativeBackground = a.g(context, getNativeBackgroundResId());
        this.onTextChangedActions = new ArrayList();
        this._isFocusable = true;
        this.enabled = true;
    }
}
