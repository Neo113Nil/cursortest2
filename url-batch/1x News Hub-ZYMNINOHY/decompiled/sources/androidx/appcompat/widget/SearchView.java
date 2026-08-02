package androidx.appcompat.widget;

import E.A;
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
import com.fc.barca.football.R;
import f2.f;
import g.AbstractC0328a;
import j.InterfaceC1048a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.AbstractC1091m;
import l.F;
import l.G;
import l.T;
import l.U;
import l.V;
import l.W;
import l.X;
import l.Y;
import l.Z;
import l.a0;
import l.b0;
import l.c0;
import l.d0;
import l.f0;

/* loaded from: classes.dex */
public class SearchView extends F implements InterfaceC1048a {

    /* renamed from: g0, reason: collision with root package name */
    public static final f f2050g0;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f2051A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f2052B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f2053C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f2054D;

    /* renamed from: E, reason: collision with root package name */
    public final Drawable f2055E;

    /* renamed from: F, reason: collision with root package name */
    public final int f2056F;

    /* renamed from: G, reason: collision with root package name */
    public final int f2057G;

    /* renamed from: H, reason: collision with root package name */
    public final Intent f2058H;

    /* renamed from: I, reason: collision with root package name */
    public final Intent f2059I;

    /* renamed from: J, reason: collision with root package name */
    public final CharSequence f2060J;

    /* renamed from: K, reason: collision with root package name */
    public View.OnFocusChangeListener f2061K;
    public View.OnClickListener L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2062M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2063N;

    /* renamed from: O, reason: collision with root package name */
    public I.b f2064O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2065P;

    /* renamed from: Q, reason: collision with root package name */
    public CharSequence f2066Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2067R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2068S;

    /* renamed from: T, reason: collision with root package name */
    public int f2069T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f2070U;

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f2071V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2072W;

    /* renamed from: a0, reason: collision with root package name */
    public int f2073a0;

    /* renamed from: b0, reason: collision with root package name */
    public SearchableInfo f2074b0;

    /* renamed from: c0, reason: collision with root package name */
    public Bundle f2075c0;

    /* renamed from: d0, reason: collision with root package name */
    public final U f2076d0;

    /* renamed from: e0, reason: collision with root package name */
    public final U f2077e0;

    /* renamed from: f0, reason: collision with root package name */
    public final WeakHashMap f2078f0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f2079p;

    /* renamed from: q, reason: collision with root package name */
    public final View f2080q;

    /* renamed from: r, reason: collision with root package name */
    public final View f2081r;

    /* renamed from: s, reason: collision with root package name */
    public final View f2082s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f2083t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f2084u;
    public final ImageView v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f2085w;

    /* renamed from: x, reason: collision with root package name */
    public final View f2086x;

    /* renamed from: y, reason: collision with root package name */
    public d0 f2087y;
    public final Rect z;

    public static class SearchAutoComplete extends AbstractC1091m {

        /* renamed from: d, reason: collision with root package name */
        public int f2088d;

        /* renamed from: e, reason: collision with root package name */
        public SearchView f2089e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public final c f2090g;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2090g = new c(this);
            this.f2088d = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i3 = configuration.screenWidthDp;
            int i4 = configuration.screenHeightDp;
            if (i3 >= 960 && i4 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i3 < 600) {
                return (i3 < 640 || i4 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f2088d <= 0 || super.enoughToFilter();
        }

        @Override // l.AbstractC1091m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f) {
                c cVar = this.f2090g;
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
        public final void onFocusChanged(boolean z, int i3, Rect rect) {
            super.onFocusChanged(z, i3, rect);
            SearchView searchView = this.f2089e;
            searchView.u(searchView.f2063N);
            searchView.post(searchView.f2076d0);
            if (searchView.f2079p.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
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
                        this.f2089e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.f2089e.hasFocus() && getVisibility() == 0) {
                this.f = true;
                Context context = getContext();
                f fVar = SearchView.f2050g0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = SearchView.f2050g0.f4985c) == null) {
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
            c cVar = this.f2090g;
            if (!z) {
                this.f = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f = true;
                    return;
                }
                this.f = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2089e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.f2088d = i3;
        }
    }

    static {
        f fVar = new f();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            fVar.f4983a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            fVar.f4984b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            fVar.f4985c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f2050g0 = fVar;
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
        SearchAutoComplete searchAutoComplete = this.f2079p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f2068S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f2079p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f2068S = false;
    }

    public int getImeOptions() {
        return this.f2079p.getImeOptions();
    }

    public int getInputType() {
        return this.f2079p.getInputType();
    }

    public int getMaxWidth() {
        return this.f2069T;
    }

    public CharSequence getQuery() {
        return this.f2079p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2066Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2074b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2060J : getContext().getText(this.f2074b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f2057G;
    }

    public int getSuggestionRowLayout() {
        return this.f2056F;
    }

    public I.b getSuggestionsAdapter() {
        return this.f2064O;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2071V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2075c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f2074b0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2075c0;
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
        int i3 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f2079p;
        if (i3 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        f fVar = f2050g0;
        Method method = fVar.f4983a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        Method method2 = fVar.f4984b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f2079p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f2062M) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i3) {
        int i4;
        String h3;
        Cursor cursor = this.f2064O.f607c;
        if (cursor != null && cursor.moveToPosition(i3)) {
            Intent intent = null;
            try {
                int i5 = f0.f9794y;
                String h4 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h4 == null) {
                    h4 = this.f2074b0.getSuggestIntentAction();
                }
                if (h4 == null) {
                    h4 = "android.intent.action.SEARCH";
                }
                String h5 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h5 == null) {
                    h5 = this.f2074b0.getSuggestIntentData();
                }
                if (h5 != null && (h3 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h5 = h5 + "/" + Uri.encode(h3);
                }
                intent = h(h4, h5 == null ? null : Uri.parse(h5), f0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), f0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e3) {
                try {
                    i4 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i4 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i4 + " returned exception.", e3);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e4) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e4);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f2079p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i3) {
        Editable text = this.f2079p.getText();
        Cursor cursor = this.f2064O.f607c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i3)) {
            setQuery(text);
            return;
        }
        String c3 = this.f2064O.c(cursor);
        if (c3 != null) {
            setQuery(c3);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f2079p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f2074b0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2076d0);
        post(this.f2077e0);
        super.onDetachedFromWindow();
    }

    @Override // l.F, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        super.onLayout(z, i3, i4, i5, i6);
        if (z) {
            int[] iArr = this.f2052B;
            SearchAutoComplete searchAutoComplete = this.f2079p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f2053C;
            getLocationInWindow(iArr2);
            int i7 = iArr[1] - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i8;
            int height = searchAutoComplete.getHeight() + i7;
            Rect rect = this.z;
            rect.set(i8, i7, width, height);
            int i9 = rect.left;
            int i10 = rect.right;
            int i11 = i6 - i4;
            Rect rect2 = this.f2051A;
            rect2.set(i9, 0, i10, i11);
            d0 d0Var = this.f2087y;
            if (d0Var == null) {
                d0 d0Var2 = new d0(rect2, rect, searchAutoComplete);
                this.f2087y = d0Var2;
                setTouchDelegate(d0Var2);
            } else {
                d0Var.f9783b.set(rect2);
                Rect rect3 = d0Var.f9785d;
                rect3.set(rect2);
                int i12 = -d0Var.f9786e;
                rect3.inset(i12, i12);
                d0Var.f9784c.set(rect);
            }
        }
    }

    @Override // l.F, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f2063N) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            int i6 = this.f2069T;
            size = i6 > 0 ? Math.min(i6, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2069T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i5 = this.f2069T) > 0) {
            size = Math.min(i5, size);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c0 c0Var = (c0) parcelable;
        super.onRestoreInstanceState(c0Var.f624a);
        u(c0Var.f9781c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c0 c0Var = new c0(super.onSaveInstanceState());
        c0Var.f9781c = this.f2063N;
        return c0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f2076d0);
    }

    public final void p() {
        boolean isEmpty = TextUtils.isEmpty(this.f2079p.getText());
        int i3 = (!isEmpty || (this.f2062M && !this.f2072W)) ? 0 : 8;
        ImageView imageView = this.v;
        imageView.setVisibility(i3);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f2079p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f2081r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2082s.getBackground();
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
        boolean z = this.f2062M;
        SearchAutoComplete searchAutoComplete = this.f2079p;
        if (z && (drawable = this.f2055E) != null) {
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
    public final boolean requestFocus(int i3, Rect rect) {
        if (this.f2068S || !isFocusable()) {
            return false;
        }
        if (this.f2063N) {
            return super.requestFocus(i3, rect);
        }
        boolean requestFocus = this.f2079p.requestFocus(i3, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f2082s.setVisibility(((this.f2065P || this.f2070U) && !this.f2063N && (this.f2084u.getVisibility() == 0 || this.f2085w.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2075c0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f2079p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2062M == z) {
            return;
        }
        this.f2062M = z;
        u(z);
        r();
    }

    public void setImeOptions(int i3) {
        this.f2079p.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.f2079p.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.f2069T = i3;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2061K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2066Q = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f2067R = z;
        I.b bVar = this.f2064O;
        if (bVar instanceof f0) {
            ((f0) bVar).f9802q = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2074b0 = searchableInfo;
        Intent intent = null;
        boolean z = true;
        SearchAutoComplete searchAutoComplete = this.f2079p;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f2074b0.getImeOptions());
            int inputType = this.f2074b0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f2074b0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            I.b bVar = this.f2064O;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f2074b0.getSuggestAuthority() != null) {
                f0 f0Var = new f0(getContext(), this, this.f2074b0, this.f2078f0);
                this.f2064O = f0Var;
                searchAutoComplete.setAdapter(f0Var);
                ((f0) this.f2064O).f9802q = this.f2067R ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f2074b0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f2074b0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f2058H;
            } else if (this.f2074b0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f2059I;
            }
            if (intent != null) {
            }
        }
        z = false;
        this.f2070U = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f2063N);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2065P = z;
        u(this.f2063N);
    }

    public void setSuggestionsAdapter(I.b bVar) {
        this.f2064O = bVar;
        this.f2079p.setAdapter(bVar);
    }

    public final void t(boolean z) {
        boolean z2 = this.f2065P;
        this.f2084u.setVisibility((!z2 || !(z2 || this.f2070U) || this.f2063N || !hasFocus() || (!z && this.f2070U)) ? 8 : 0);
    }

    public final void u(boolean z) {
        this.f2063N = z;
        int i3 = 8;
        int i4 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f2079p.getText());
        this.f2083t.setVisibility(i4);
        t(!isEmpty);
        this.f2080q.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f2054D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f2062M) ? 8 : 0);
        p();
        if (this.f2070U && !this.f2063N && isEmpty) {
            this.f2084u.setVisibility(8);
            i3 = 0;
        }
        this.f2085w.setVisibility(i3);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.z = new Rect();
        this.f2051A = new Rect();
        this.f2052B = new int[2];
        this.f2053C = new int[2];
        this.f2076d0 = new U(this, 0);
        this.f2077e0 = new U(this, 1);
        this.f2078f0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        X x3 = new X(this);
        Y y3 = new Y(this);
        G g3 = new G(1, this);
        T t3 = new T(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0328a.f5003q, i3, 0);
        A0.f fVar = new A0.f(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f2079p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2080q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f2081r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f2082s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f2083t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f2084u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f2085w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f2054D = imageView5;
        Drawable C3 = fVar.C(10);
        Field field = A.f243a;
        findViewById.setBackground(C3);
        findViewById2.setBackground(fVar.C(14));
        imageView.setImageDrawable(fVar.C(13));
        imageView2.setImageDrawable(fVar.C(7));
        imageView3.setImageDrawable(fVar.C(4));
        imageView4.setImageDrawable(fVar.C(16));
        imageView5.setImageDrawable(fVar.C(13));
        this.f2055E = fVar.C(12);
        S0.a.C(getResources().getString(R.string.abc_searchview_description_search), imageView);
        this.f2056F = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f2057G = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(t3);
        searchAutoComplete.setOnEditorActionListener(x3);
        searchAutoComplete.setOnItemClickListener(y3);
        searchAutoComplete.setOnItemSelectedListener(g3);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new V(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f2060J = obtainStyledAttributes.getText(6);
        this.f2066Q = obtainStyledAttributes.getText(11);
        int i4 = obtainStyledAttributes.getInt(3, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = obtainStyledAttributes.getInt(2, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        fVar.O();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f2058H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2059I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2086x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new W(this));
        }
        u(this.f2062M);
        r();
    }

    public void setOnCloseListener(Z z) {
    }

    public void setOnQueryTextListener(a0 a0Var) {
    }

    public void setOnSuggestionListener(b0 b0Var) {
    }
}
