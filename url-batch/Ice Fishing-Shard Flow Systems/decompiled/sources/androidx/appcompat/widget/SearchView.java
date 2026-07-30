package androidx.appcompat.widget;

import D0.j;
import I.T;
import X5.f;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.icefishing.icefish.ice.fishing.s294s.R;
import h.AbstractC0454a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.InterfaceC0647c;
import n.B0;
import n.C0;
import n.C0724n;
import n.M;
import n.U0;
import n.V0;
import n.W0;
import n.X0;
import n.Y0;
import n.Z0;
import n.a1;
import n.b1;
import n.c1;
import n.d1;
import n.f1;

/* loaded from: classes.dex */
public class SearchView extends B0 implements InterfaceC0647c {

    /* renamed from: o0, reason: collision with root package name */
    public static final f f3219o0;

    /* renamed from: A, reason: collision with root package name */
    public final View f3220A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f3221B;

    /* renamed from: C, reason: collision with root package name */
    public final ImageView f3222C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f3223D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f3224E;

    /* renamed from: F, reason: collision with root package name */
    public final View f3225F;

    /* renamed from: G, reason: collision with root package name */
    public d1 f3226G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f3227H;

    /* renamed from: I, reason: collision with root package name */
    public final Rect f3228I;

    /* renamed from: J, reason: collision with root package name */
    public final int[] f3229J;

    /* renamed from: K, reason: collision with root package name */
    public final int[] f3230K;

    /* renamed from: L, reason: collision with root package name */
    public final ImageView f3231L;

    /* renamed from: M, reason: collision with root package name */
    public final Drawable f3232M;

    /* renamed from: N, reason: collision with root package name */
    public final int f3233N;

    /* renamed from: O, reason: collision with root package name */
    public final int f3234O;

    /* renamed from: P, reason: collision with root package name */
    public final Intent f3235P;
    public final Intent Q;

    /* renamed from: R, reason: collision with root package name */
    public final CharSequence f3236R;

    /* renamed from: S, reason: collision with root package name */
    public View.OnFocusChangeListener f3237S;

    /* renamed from: T, reason: collision with root package name */
    public View.OnClickListener f3238T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3239U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f3240V;

    /* renamed from: W, reason: collision with root package name */
    public M.c f3241W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3242a0;

    /* renamed from: b0, reason: collision with root package name */
    public CharSequence f3243b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3244c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3245d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f3246e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3247f0;

    /* renamed from: g0, reason: collision with root package name */
    public CharSequence f3248g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f3249h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f3250i0;

    /* renamed from: j0, reason: collision with root package name */
    public SearchableInfo f3251j0;

    /* renamed from: k0, reason: collision with root package name */
    public Bundle f3252k0;

    /* renamed from: l0, reason: collision with root package name */
    public final V0 f3253l0;

    /* renamed from: m0, reason: collision with root package name */
    public final V0 f3254m0;

    /* renamed from: n0, reason: collision with root package name */
    public final WeakHashMap f3255n0;

    /* renamed from: x, reason: collision with root package name */
    public final SearchAutoComplete f3256x;

    /* renamed from: y, reason: collision with root package name */
    public final View f3257y;

    /* renamed from: z, reason: collision with root package name */
    public final View f3258z;

    public static class SearchAutoComplete extends C0724n {

        /* renamed from: m, reason: collision with root package name */
        public int f3259m;

        /* renamed from: n, reason: collision with root package name */
        public SearchView f3260n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f3261o;

        /* renamed from: p, reason: collision with root package name */
        public final d f3262p;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3262p = new d(this);
            this.f3259m = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i2 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            f fVar = SearchView.f3219o0;
            fVar.getClass();
            f.a();
            Method method = fVar.f2888c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f3259m <= 0 || super.enoughToFilter();
        }

        @Override // n.C0724n, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3261o) {
                d dVar = this.f3262p;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z7, int i2, Rect rect) {
            super.onFocusChanged(z7, i2, rect);
            SearchView searchView = this.f3260n;
            searchView.v(searchView.f3240V);
            searchView.post(searchView.f3253l0);
            if (searchView.f3256x.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3260n.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z7) {
            super.onWindowFocusChanged(z7);
            if (z7 && this.f3260n.hasFocus() && getVisibility() == 0) {
                this.f3261o = true;
                Context context = getContext();
                f fVar = SearchView.f3219o0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z7) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f3262p;
            if (!z7) {
                this.f3261o = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f3261o = true;
                    return;
                }
                this.f3261o = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f3260n = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f3259m = i2;
        }
    }

    static {
        f fVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            f fVar2 = new f();
            fVar2.f2886a = null;
            fVar2.f2887b = null;
            fVar2.f2888c = null;
            f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                fVar2.f2886a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                fVar2.f2887b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                fVar2.f2888c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            fVar = fVar2;
        }
        f3219o0 = fVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f3256x;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f3245d0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f3256x;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f3245d0 = false;
    }

    public int getImeOptions() {
        return this.f3256x.getImeOptions();
    }

    public int getInputType() {
        return this.f3256x.getInputType();
    }

    public int getMaxWidth() {
        return this.f3246e0;
    }

    public CharSequence getQuery() {
        return this.f3256x.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3243b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3251j0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f3236R : getContext().getText(this.f3251j0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f3234O;
    }

    public int getSuggestionRowLayout() {
        return this.f3233N;
    }

    public M.c getSuggestionsAdapter() {
        return this.f3241W;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3248g0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3252k0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f3251j0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3252k0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void k() {
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f3256x;
        if (i2 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        f fVar = f3219o0;
        fVar.getClass();
        f.a();
        Method method = fVar.f2886a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        fVar.getClass();
        f.a();
        Method method2 = fVar.f2887b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void l() {
        SearchAutoComplete searchAutoComplete = this.f3256x;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f3239U) {
            clearFocus();
            v(true);
        }
    }

    public final void m(int i2) {
        int i5;
        String h7;
        Cursor cursor = this.f3241W.f1713i;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i7 = f1.f6765F;
                String h8 = f1.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h8 == null) {
                    h8 = this.f3251j0.getSuggestIntentAction();
                }
                if (h8 == null) {
                    h8 = "android.intent.action.SEARCH";
                }
                String h9 = f1.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h9 == null) {
                    h9 = this.f3251j0.getSuggestIntentData();
                }
                if (h9 != null && (h7 = f1.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h9 = h9 + "/" + Uri.encode(h7);
                }
                intent = i(h8, h9 == null ? null : Uri.parse(h9), f1.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), f1.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e7) {
                try {
                    i5 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i5 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i5 + " returned exception.", e7);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e8) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e8);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f3256x;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(int i2) {
        Editable text = this.f3256x.getText();
        Cursor cursor = this.f3241W.f1713i;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String c7 = this.f3241W.c(cursor);
        if (c7 != null) {
            setQuery(c7);
        } else {
            setQuery(text);
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // l.InterfaceC0647c
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f3256x;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f3248g0 = "";
        clearFocus();
        v(true);
        searchAutoComplete.setImeOptions(this.f3250i0);
        this.f3249h0 = false;
    }

    @Override // l.InterfaceC0647c
    public final void onActionViewExpanded() {
        if (this.f3249h0) {
            return;
        }
        this.f3249h0 = true;
        SearchAutoComplete searchAutoComplete = this.f3256x;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f3250i0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3253l0);
        post(this.f3254m0);
        super.onDetachedFromWindow();
    }

    @Override // n.B0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        super.onLayout(z7, i2, i5, i7, i8);
        if (z7) {
            SearchAutoComplete searchAutoComplete = this.f3256x;
            int[] iArr = this.f3229J;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f3230K;
            getLocationInWindow(iArr2);
            int i9 = iArr[1] - iArr2[1];
            int i10 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i10;
            int height = searchAutoComplete.getHeight() + i9;
            Rect rect = this.f3227H;
            rect.set(i10, i9, width, height);
            int i11 = rect.left;
            int i12 = rect.right;
            int i13 = i8 - i5;
            Rect rect2 = this.f3228I;
            rect2.set(i11, 0, i12, i13);
            d1 d1Var = this.f3226G;
            if (d1Var == null) {
                d1 d1Var2 = new d1(rect2, rect, searchAutoComplete);
                this.f3226G = d1Var2;
                setTouchDelegate(d1Var2);
            } else {
                d1Var.f6753b.set(rect2);
                Rect rect3 = d1Var.f6755d;
                rect3.set(rect2);
                int i14 = -d1Var.f6756e;
                rect3.inset(i14, i14);
                d1Var.f6754c.set(rect);
            }
        }
    }

    @Override // n.B0, android.view.View
    public final void onMeasure(int i2, int i5) {
        int i7;
        if (this.f3240V) {
            super.onMeasure(i2, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i8 = this.f3246e0;
            size = i8 > 0 ? Math.min(i8, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3246e0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i7 = this.f3246e0) > 0) {
            size = Math.min(i7, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c1 c1Var = (c1) parcelable;
        super.onRestoreInstanceState(c1Var.f1776d);
        v(c1Var.f6751i);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c1 c1Var = new c1(super.onSaveInstanceState());
        c1Var.f6751i = this.f3240V;
        return c1Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        post(this.f3253l0);
    }

    public final void p() {
        SearchAutoComplete searchAutoComplete = this.f3256x;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f3251j0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q() {
        boolean isEmpty = TextUtils.isEmpty(this.f3256x.getText());
        int i2 = (!isEmpty || (this.f3239U && !this.f3249h0)) ? 0 : 8;
        ImageView imageView = this.f3223D;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void r() {
        int[] iArr = this.f3256x.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f3258z.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3220A.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.f3245d0 || !isFocusable()) {
            return false;
        }
        if (this.f3240V) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f3256x.requestFocus(i2, rect);
        if (requestFocus) {
            v(false);
        }
        return requestFocus;
    }

    public final void s() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z7 = this.f3239U;
        SearchAutoComplete searchAutoComplete = this.f3256x;
        if (z7 && (drawable = this.f3232M) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3252k0 = bundle;
    }

    public void setIconified(boolean z7) {
        if (z7) {
            l();
            return;
        }
        v(false);
        SearchAutoComplete searchAutoComplete = this.f3256x;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3238T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z7) {
        if (this.f3239U == z7) {
            return;
        }
        this.f3239U = z7;
        v(z7);
        s();
    }

    public void setImeOptions(int i2) {
        this.f3256x.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f3256x.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f3246e0 = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3237S = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3238T = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3243b0 = charSequence;
        s();
    }

    public void setQueryRefinementEnabled(boolean z7) {
        this.f3244c0 = z7;
        M.c cVar = this.f3241W;
        if (cVar instanceof f1) {
            ((f1) cVar).f6779x = z7 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3251j0 = searchableInfo;
        Intent intent = null;
        boolean z7 = true;
        SearchAutoComplete searchAutoComplete = this.f3256x;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f3251j0.getImeOptions());
            int inputType = this.f3251j0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f3251j0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            M.c cVar = this.f3241W;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f3251j0.getSuggestAuthority() != null) {
                f1 f1Var = new f1(getContext(), this, this.f3251j0, this.f3255n0);
                this.f3241W = f1Var;
                searchAutoComplete.setAdapter(f1Var);
                ((f1) this.f3241W).f6779x = this.f3244c0 ? 2 : 1;
            }
            s();
        }
        SearchableInfo searchableInfo2 = this.f3251j0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f3251j0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f3235P;
            } else if (this.f3251j0.getVoiceSearchLaunchRecognizer()) {
                intent = this.Q;
            }
            if (intent != null) {
            }
        }
        z7 = false;
        this.f3247f0 = z7;
        if (z7) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        v(this.f3240V);
    }

    public void setSubmitButtonEnabled(boolean z7) {
        this.f3242a0 = z7;
        v(this.f3240V);
    }

    public void setSuggestionsAdapter(M.c cVar) {
        this.f3241W = cVar;
        this.f3256x.setAdapter(cVar);
    }

    public final void t() {
        this.f3220A.setVisibility(((this.f3242a0 || this.f3247f0) && !this.f3240V && (this.f3222C.getVisibility() == 0 || this.f3224E.getVisibility() == 0)) ? 0 : 8);
    }

    public final void u(boolean z7) {
        boolean z8 = this.f3242a0;
        this.f3222C.setVisibility((!z8 || !(z8 || this.f3247f0) || this.f3240V || !hasFocus() || (!z7 && this.f3247f0)) ? 8 : 0);
    }

    public final void v(boolean z7) {
        this.f3240V = z7;
        int i2 = 8;
        int i5 = z7 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f3256x.getText());
        this.f3221B.setVisibility(i5);
        u(!isEmpty);
        this.f3257y.setVisibility(z7 ? 8 : 0);
        ImageView imageView = this.f3231L;
        imageView.setVisibility((imageView.getDrawable() == null || this.f3239U) ? 8 : 0);
        q();
        if (this.f3247f0 && !this.f3240V && isEmpty) {
            this.f3222C.setVisibility(8);
            i2 = 0;
        }
        this.f3224E.setVisibility(i2);
        t();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3227H = new Rect();
        this.f3228I = new Rect();
        this.f3229J = new int[2];
        this.f3230K = new int[2];
        this.f3253l0 = new V0(this, 0);
        this.f3254m0 = new V0(this, 1);
        this.f3255n0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        Y0 y02 = new Y0(this);
        M m2 = new M(1, this);
        C0 c02 = new C0(1, this);
        U0 u02 = new U0(this);
        int[] iArr = AbstractC0454a.f5056u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        j jVar = new j(context, obtainStyledAttributes);
        T.h(this, context, iArr, attributeSet, obtainStyledAttributes, i2);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f3256x = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3257y = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f3258z = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f3220A = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f3221B = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f3222C = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f3223D = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f3224E = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f3231L = imageView5;
        findViewById.setBackground(jVar.J(10));
        findViewById2.setBackground(jVar.J(14));
        imageView.setImageDrawable(jVar.J(13));
        imageView2.setImageDrawable(jVar.J(7));
        imageView3.setImageDrawable(jVar.J(4));
        imageView4.setImageDrawable(jVar.J(16));
        imageView5.setImageDrawable(jVar.J(13));
        this.f3232M = jVar.J(12);
        P0.f.M(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f3233N = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f3234O = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(u02);
        searchAutoComplete.setOnEditorActionListener(y02);
        searchAutoComplete.setOnItemClickListener(m2);
        searchAutoComplete.setOnItemSelectedListener(c02);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new W0(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f3236R = obtainStyledAttributes.getText(6);
        this.f3243b0 = obtainStyledAttributes.getText(11);
        int i5 = obtainStyledAttributes.getInt(3, -1);
        if (i5 != -1) {
            setImeOptions(i5);
        }
        int i7 = obtainStyledAttributes.getInt(2, -1);
        if (i7 != -1) {
            setInputType(i7);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        jVar.W();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f3235P = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.Q = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f3225F = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new X0(this));
        }
        v(this.f3239U);
        s();
    }

    public void setOnCloseListener(Z0 z0) {
    }

    public void setOnQueryTextListener(a1 a1Var) {
    }

    public void setOnSuggestionListener(b1 b1Var) {
    }
}
