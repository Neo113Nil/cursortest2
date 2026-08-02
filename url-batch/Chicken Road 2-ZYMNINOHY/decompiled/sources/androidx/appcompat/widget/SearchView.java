package androidx.appcompat.widget;

import B1.j;
import E.H;
import P3.i;
import a.AbstractC0124a;
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
import com.rockchicken.pump.up.road.R;
import f.AbstractC0410a;
import i.InterfaceC0450a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.AbstractC1180D;
import k.AbstractC1226m;
import k.C1181E;
import k.C1193Q;
import k.C1197V;
import k.C1198W;
import k.C1203a0;
import k.C1205b0;
import k.InterfaceC1199X;
import k.InterfaceC1200Y;
import k.InterfaceC1201Z;
import k.RunnableC1194S;
import k.ViewOnClickListenerC1209d0;
import k.ViewOnFocusChangeListenerC1195T;
import k.ViewOnLayoutChangeListenerC1196U;

/* loaded from: classes.dex */
public class SearchView extends AbstractC1180D implements InterfaceC0450a {

    /* renamed from: g0, reason: collision with root package name */
    public static final i f4382g0;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f4383A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f4384B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f4385C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f4386D;

    /* renamed from: E, reason: collision with root package name */
    public final Drawable f4387E;

    /* renamed from: F, reason: collision with root package name */
    public final int f4388F;

    /* renamed from: G, reason: collision with root package name */
    public final int f4389G;

    /* renamed from: H, reason: collision with root package name */
    public final Intent f4390H;

    /* renamed from: I, reason: collision with root package name */
    public final Intent f4391I;

    /* renamed from: J, reason: collision with root package name */
    public final CharSequence f4392J;

    /* renamed from: K, reason: collision with root package name */
    public View.OnFocusChangeListener f4393K;
    public View.OnClickListener L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f4394M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f4395N;

    /* renamed from: O, reason: collision with root package name */
    public I.c f4396O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f4397P;

    /* renamed from: Q, reason: collision with root package name */
    public CharSequence f4398Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4399R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f4400S;

    /* renamed from: T, reason: collision with root package name */
    public int f4401T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4402U;

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f4403V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4404W;

    /* renamed from: a0, reason: collision with root package name */
    public int f4405a0;

    /* renamed from: b0, reason: collision with root package name */
    public SearchableInfo f4406b0;

    /* renamed from: c0, reason: collision with root package name */
    public Bundle f4407c0;

    /* renamed from: d0, reason: collision with root package name */
    public final RunnableC1194S f4408d0;

    /* renamed from: e0, reason: collision with root package name */
    public final RunnableC1194S f4409e0;

    /* renamed from: f0, reason: collision with root package name */
    public final WeakHashMap f4410f0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f4411p;

    /* renamed from: q, reason: collision with root package name */
    public final View f4412q;

    /* renamed from: r, reason: collision with root package name */
    public final View f4413r;

    /* renamed from: s, reason: collision with root package name */
    public final View f4414s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4415t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4416u;
    public final ImageView v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f4417w;

    /* renamed from: x, reason: collision with root package name */
    public final View f4418x;

    /* renamed from: y, reason: collision with root package name */
    public C1205b0 f4419y;
    public final Rect z;

    public static class SearchAutoComplete extends AbstractC1226m {

        /* renamed from: d, reason: collision with root package name */
        public int f4420d;

        /* renamed from: e, reason: collision with root package name */
        public SearchView f4421e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f4422f;

        /* renamed from: g, reason: collision with root package name */
        public final c f4423g;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4423g = new c(this);
            this.f4420d = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                return (i4 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f4420d <= 0 || super.enoughToFilter();
        }

        @Override // k.AbstractC1226m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4422f) {
                c cVar = this.f4423g;
                removeCallbacks(cVar);
                post(cVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i4, Rect rect) {
            super.onFocusChanged(z, i4, rect);
            SearchView searchView = this.f4421e;
            searchView.u(searchView.f4395N);
            searchView.post(searchView.f4408d0);
            if (searchView.f4411p.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
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
                        this.f4421e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.f4421e.hasFocus() && getVisibility() == 0) {
                this.f4422f = true;
                Context context = getContext();
                i iVar = SearchView.f4382g0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = SearchView.f4382g0.f2107c) == null) {
                    return;
                }
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f4423g;
            if (!z) {
                this.f4422f = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f4422f = true;
                    return;
                }
                this.f4422f = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f4421e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f4420d = i4;
        }
    }

    static {
        i iVar = new i();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            iVar.f2105a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            iVar.f2106b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            iVar.f2107c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f4382g0 = iVar;
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
        SearchAutoComplete searchAutoComplete = this.f4411p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f4400S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f4411p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f4400S = false;
    }

    public int getImeOptions() {
        return this.f4411p.getImeOptions();
    }

    public int getInputType() {
        return this.f4411p.getInputType();
    }

    public int getMaxWidth() {
        return this.f4401T;
    }

    public CharSequence getQuery() {
        return this.f4411p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f4398Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f4406b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f4392J : getContext().getText(this.f4406b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f4389G;
    }

    public int getSuggestionRowLayout() {
        return this.f4388F;
    }

    public I.c getSuggestionsAdapter() {
        return this.f4396O;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f4403V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f4407c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f4406b0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4407c0;
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

    public final void j() {
        int i4 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f4411p;
        if (i4 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        i iVar = f4382g0;
        Method method = iVar.f2105a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        Method method2 = iVar.f2106b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f4411p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f4394M) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i4) {
        int i5;
        String h2;
        Cursor cursor = this.f4396O.f1114c;
        if (cursor != null && cursor.moveToPosition(i4)) {
            Intent intent = null;
            try {
                int i6 = ViewOnClickListenerC1209d0.f13985y;
                String h4 = ViewOnClickListenerC1209d0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h4 == null) {
                    h4 = this.f4406b0.getSuggestIntentAction();
                }
                if (h4 == null) {
                    h4 = "android.intent.action.SEARCH";
                }
                String h5 = ViewOnClickListenerC1209d0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h5 == null) {
                    h5 = this.f4406b0.getSuggestIntentData();
                }
                if (h5 != null && (h2 = ViewOnClickListenerC1209d0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h5 = h5 + "/" + Uri.encode(h2);
                }
                intent = h(h4, h5 == null ? null : Uri.parse(h5), ViewOnClickListenerC1209d0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC1209d0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e4) {
                try {
                    i5 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i5 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i5 + " returned exception.", e4);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e5) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e5);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f4411p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i4) {
        Editable text = this.f4411p.getText();
        Cursor cursor = this.f4396O.f1114c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i4)) {
            setQuery(text);
            return;
        }
        String c4 = this.f4396O.c(cursor);
        if (c4 != null) {
            setQuery(c4);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f4411p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f4406b0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f4408d0);
        post(this.f4409e0);
        super.onDetachedFromWindow();
    }

    @Override // k.AbstractC1180D, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        super.onLayout(z, i4, i5, i6, i7);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f4411p;
            int[] iArr = this.f4384B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f4385C;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i9;
            int height = searchAutoComplete.getHeight() + i8;
            Rect rect = this.z;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i5;
            Rect rect2 = this.f4383A;
            rect2.set(i10, 0, i11, i12);
            C1205b0 c1205b0 = this.f4419y;
            if (c1205b0 == null) {
                C1205b0 c1205b02 = new C1205b0(rect2, rect, searchAutoComplete);
                this.f4419y = c1205b02;
                setTouchDelegate(c1205b02);
            } else {
                c1205b0.f13973b.set(rect2);
                Rect rect3 = c1205b0.f13975d;
                rect3.set(rect2);
                int i13 = -c1205b0.f13976e;
                rect3.inset(i13, i13);
                c1205b0.f13974c.set(rect);
            }
        }
    }

    @Override // k.AbstractC1180D, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.f4395N) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f4401T;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f4401T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f4401T) > 0) {
            size = Math.min(i6, size);
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
        if (!(parcelable instanceof C1203a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1203a0 c1203a0 = (C1203a0) parcelable;
        super.onRestoreInstanceState(c1203a0.f1142a);
        u(c1203a0.f13969c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1203a0 c1203a0 = new C1203a0(super.onSaveInstanceState());
        c1203a0.f13969c = this.f4395N;
        return c1203a0;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f4408d0);
    }

    public final void p() {
        boolean isEmpty = TextUtils.isEmpty(this.f4411p.getText());
        int i4 = (!isEmpty || (this.f4394M && !this.f4404W)) ? 0 : 8;
        ImageView imageView = this.v;
        imageView.setVisibility(i4);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f4411p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f4413r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f4414s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void r() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.f4394M;
        SearchAutoComplete searchAutoComplete = this.f4411p;
        if (z && (drawable = this.f4387E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i4, Rect rect) {
        if (this.f4400S || !isFocusable()) {
            return false;
        }
        if (this.f4395N) {
            return super.requestFocus(i4, rect);
        }
        boolean requestFocus = this.f4411p.requestFocus(i4, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f4414s.setVisibility(((this.f4397P || this.f4402U) && !this.f4395N && (this.f4416u.getVisibility() == 0 || this.f4417w.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f4407c0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f4411p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f4394M == z) {
            return;
        }
        this.f4394M = z;
        u(z);
        r();
    }

    public void setImeOptions(int i4) {
        this.f4411p.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f4411p.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f4401T = i4;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f4393K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f4398Q = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f4399R = z;
        I.c cVar = this.f4396O;
        if (cVar instanceof ViewOnClickListenerC1209d0) {
            ((ViewOnClickListenerC1209d0) cVar).f13992q = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f4406b0 = searchableInfo;
        Intent intent = null;
        boolean z = true;
        SearchAutoComplete searchAutoComplete = this.f4411p;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f4406b0.getImeOptions());
            int inputType = this.f4406b0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f4406b0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            I.c cVar = this.f4396O;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f4406b0.getSuggestAuthority() != null) {
                ViewOnClickListenerC1209d0 viewOnClickListenerC1209d0 = new ViewOnClickListenerC1209d0(getContext(), this, this.f4406b0, this.f4410f0);
                this.f4396O = viewOnClickListenerC1209d0;
                searchAutoComplete.setAdapter(viewOnClickListenerC1209d0);
                ((ViewOnClickListenerC1209d0) this.f4396O).f13992q = this.f4399R ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f4406b0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f4406b0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f4390H;
            } else if (this.f4406b0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f4391I;
            }
            if (intent != null) {
            }
        }
        z = false;
        this.f4402U = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f4395N);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f4397P = z;
        u(this.f4395N);
    }

    public void setSuggestionsAdapter(I.c cVar) {
        this.f4396O = cVar;
        this.f4411p.setAdapter(cVar);
    }

    public final void t(boolean z) {
        boolean z4 = this.f4397P;
        this.f4416u.setVisibility((!z4 || !(z4 || this.f4402U) || this.f4395N || !hasFocus() || (!z && this.f4402U)) ? 8 : 0);
    }

    public final void u(boolean z) {
        this.f4395N = z;
        int i4 = 8;
        int i5 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f4411p.getText());
        this.f4415t.setVisibility(i5);
        t(!isEmpty);
        this.f4412q.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f4386D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f4394M) ? 8 : 0);
        p();
        if (this.f4402U && !this.f4395N && isEmpty) {
            this.f4416u.setVisibility(8);
            i4 = 0;
        }
        this.f4417w.setVisibility(i4);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.z = new Rect();
        this.f4383A = new Rect();
        this.f4384B = new int[2];
        this.f4385C = new int[2];
        this.f4408d0 = new RunnableC1194S(this, 0);
        this.f4409e0 = new RunnableC1194S(this, 1);
        this.f4410f0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        C1197V c1197v = new C1197V(this);
        C1198W c1198w = new C1198W(this);
        C1181E c1181e = new C1181E(1, this);
        C1193Q c1193q = new C1193Q(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0410a.f8484q, i4, 0);
        j jVar = new j(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f4411p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f4412q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f4413r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f4414s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f4415t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f4416u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f4417w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f4386D = imageView5;
        Drawable o = jVar.o(10);
        Field field = H.f375a;
        findViewById.setBackground(o);
        findViewById2.setBackground(jVar.o(14));
        imageView.setImageDrawable(jVar.o(13));
        imageView2.setImageDrawable(jVar.o(7));
        imageView3.setImageDrawable(jVar.o(4));
        imageView4.setImageDrawable(jVar.o(16));
        imageView5.setImageDrawable(jVar.o(13));
        this.f4387E = jVar.o(12);
        AbstractC0124a.O(getResources().getString(R.string.abc_searchview_description_search), imageView);
        this.f4388F = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f4389G = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(c1193q);
        searchAutoComplete.setOnEditorActionListener(c1197v);
        searchAutoComplete.setOnItemClickListener(c1198w);
        searchAutoComplete.setOnItemSelectedListener(c1181e);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1195T(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f4392J = obtainStyledAttributes.getText(6);
        this.f4398Q = obtainStyledAttributes.getText(11);
        int i5 = obtainStyledAttributes.getInt(3, -1);
        if (i5 != -1) {
            setImeOptions(i5);
        }
        int i6 = obtainStyledAttributes.getInt(2, -1);
        if (i6 != -1) {
            setInputType(i6);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        jVar.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f4390H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4391I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f4418x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1196U(this));
        }
        u(this.f4394M);
        r();
    }

    public void setOnCloseListener(InterfaceC1199X interfaceC1199X) {
    }

    public void setOnQueryTextListener(InterfaceC1200Y interfaceC1200Y) {
    }

    public void setOnSuggestionListener(InterfaceC1201Z interfaceC1201Z) {
    }
}
