package androidx.appcompat.widget;

import L.C0026b;
import a.AbstractC0069a;
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
import c.AbstractC0098a;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import f.InterfaceC0124a;
import h.AbstractC0145E;
import h.AbstractC0160m;
import h.C0146F;
import h.S;
import h.T;
import h.U;
import h.V;
import h.W;
import h.X;
import h.Y;
import h.Z;
import h.a0;
import h.b0;
import h.c0;
import h.d0;
import h.f0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import w.x;

/* loaded from: classes.dex */
public class SearchView extends AbstractC0145E implements InterfaceC0124a {

    /* renamed from: k0, reason: collision with root package name */
    public static final Y f1178k0;

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f1179A;

    /* renamed from: B, reason: collision with root package name */
    public final View f1180B;

    /* renamed from: C, reason: collision with root package name */
    public d0 f1181C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f1182D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f1183E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f1184F;

    /* renamed from: G, reason: collision with root package name */
    public final int[] f1185G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f1186H;

    /* renamed from: I, reason: collision with root package name */
    public final Drawable f1187I;

    /* renamed from: J, reason: collision with root package name */
    public final int f1188J;

    /* renamed from: K, reason: collision with root package name */
    public final int f1189K;

    /* renamed from: L, reason: collision with root package name */
    public final Intent f1190L;

    /* renamed from: M, reason: collision with root package name */
    public final Intent f1191M;

    /* renamed from: N, reason: collision with root package name */
    public final CharSequence f1192N;

    /* renamed from: O, reason: collision with root package name */
    public View.OnFocusChangeListener f1193O;

    /* renamed from: P, reason: collision with root package name */
    public View.OnClickListener f1194P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f1195Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f1196R;

    /* renamed from: S, reason: collision with root package name */
    public B.c f1197S;
    public boolean T;

    /* renamed from: U, reason: collision with root package name */
    public CharSequence f1198U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1199V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f1200W;

    /* renamed from: a0, reason: collision with root package name */
    public int f1201a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1202b0;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f1203c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1204d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f1205e0;

    /* renamed from: f0, reason: collision with root package name */
    public SearchableInfo f1206f0;

    /* renamed from: g0, reason: collision with root package name */
    public Bundle f1207g0;

    /* renamed from: h0, reason: collision with root package name */
    public final T f1208h0;
    public final T i0;

    /* renamed from: j0, reason: collision with root package name */
    public final WeakHashMap f1209j0;

    /* renamed from: t, reason: collision with root package name */
    public final SearchAutoComplete f1210t;

    /* renamed from: u, reason: collision with root package name */
    public final View f1211u;

    /* renamed from: v, reason: collision with root package name */
    public final View f1212v;

    /* renamed from: w, reason: collision with root package name */
    public final View f1213w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f1214x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f1215y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f1216z;

    public static class SearchAutoComplete extends AbstractC0160m {

        /* renamed from: h, reason: collision with root package name */
        public int f1217h;

        /* renamed from: i, reason: collision with root package name */
        public SearchView f1218i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f1219j;

        /* renamed from: k, reason: collision with root package name */
        public final c f1220k;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1220k = new c(this);
            this.f1217h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f1217h <= 0 || super.enoughToFilter();
        }

        @Override // h.AbstractC0160m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1219j) {
                c cVar = this.f1220k;
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
        public final void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f1218i;
            searchView.u(searchView.f1196R);
            searchView.post(searchView.f1208h0);
            if (searchView.f1210t.hasFocus()) {
                searchView.j();
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
                        this.f1218i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            Method method;
            super.onWindowFocusChanged(z2);
            if (z2 && this.f1218i.hasFocus() && getVisibility() == 0) {
                this.f1219j = true;
                Context context = getContext();
                Y y2 = SearchView.f1178k0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = SearchView.f1178k0.f2155c) == null) {
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

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f1220k;
            if (!z2) {
                this.f1219j = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1219j = true;
                    return;
                }
                this.f1219j = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1218i = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1217h = i2;
        }
    }

    static {
        Y y2 = new Y();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            y2.f2153a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            y2.f2154b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            y2.f2155c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f1178k0 = y2;
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
        SearchAutoComplete searchAutoComplete = this.f1210t;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1200W = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1210t;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1200W = false;
    }

    public int getImeOptions() {
        return this.f1210t.getImeOptions();
    }

    public int getInputType() {
        return this.f1210t.getInputType();
    }

    public int getMaxWidth() {
        return this.f1201a0;
    }

    public CharSequence getQuery() {
        return this.f1210t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1198U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1206f0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1192N : getContext().getText(this.f1206f0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1189K;
    }

    public int getSuggestionRowLayout() {
        return this.f1188J;
    }

    public B.c getSuggestionsAdapter() {
        return this.f1197S;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1203c0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1207g0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1206f0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1207g0;
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
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1210t;
        if (i2 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        Y y2 = f1178k0;
        Method method = y2.f2153a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        Method method2 = y2.f2154b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f1210t;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f1195Q) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i2) {
        int i3;
        String h2;
        Cursor cursor = this.f1197S.f46g;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = f0.f2174C;
                String h3 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.f1206f0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String h4 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.f1206f0.getSuggestIntentData();
                }
                if (h4 != null && (h2 = f0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                intent = h(h3, h4 == null ? null : Uri.parse(h4), f0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), f0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1210t;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i2) {
        Editable text = this.f1210t.getText();
        Cursor cursor = this.f1197S.f46g;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String c2 = this.f1197S.c(cursor);
        if (c2 != null) {
            setQuery(c2);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f1210t;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1206f0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1208h0);
        post(this.i0);
        super.onDetachedFromWindow();
    }

    @Override // h.AbstractC0145E, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.f1184F;
            SearchAutoComplete searchAutoComplete = this.f1210t;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f1185G;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.f1182D;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.f1183E;
            rect2.set(i8, 0, i9, i10);
            d0 d0Var = this.f1181C;
            if (d0Var == null) {
                d0 d0Var2 = new d0(rect2, rect, searchAutoComplete);
                this.f1181C = d0Var2;
                setTouchDelegate(d0Var2);
            } else {
                d0Var.f2162b.set(rect2);
                Rect rect3 = d0Var.f2164d;
                rect3.set(rect2);
                int i11 = -d0Var.f2165e;
                rect3.inset(i11, i11);
                d0Var.f2163c.set(rect);
            }
        }
    }

    @Override // h.AbstractC0145E, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1196R) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f1201a0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1201a0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f1201a0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
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
        super.onRestoreInstanceState(c0Var.f56a);
        u(c0Var.f2160c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c0 c0Var = new c0(super.onSaveInstanceState());
        c0Var.f2160c = this.f1196R;
        return c0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f1208h0);
    }

    public final void p() {
        boolean isEmpty = TextUtils.isEmpty(this.f1210t.getText());
        int i2 = (!isEmpty || (this.f1195Q && !this.f1204d0)) ? 0 : 8;
        ImageView imageView = this.f1216z;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f1210t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1212v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1213w.getBackground();
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
        boolean z2 = this.f1195Q;
        SearchAutoComplete searchAutoComplete = this.f1210t;
        if (z2 && (drawable = this.f1187I) != null) {
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
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.f1200W || !isFocusable()) {
            return false;
        }
        if (this.f1196R) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f1210t.requestFocus(i2, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f1213w.setVisibility(((this.T || this.f1202b0) && !this.f1196R && (this.f1215y.getVisibility() == 0 || this.f1179A.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1207g0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f1210t;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1194P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f1195Q == z2) {
            return;
        }
        this.f1195Q = z2;
        u(z2);
        r();
    }

    public void setImeOptions(int i2) {
        this.f1210t.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f1210t.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f1201a0 = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1193O = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1194P = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1198U = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f1199V = z2;
        B.c cVar = this.f1197S;
        if (cVar instanceof f0) {
            ((f0) cVar).f2184u = z2 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1206f0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f1210t;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1206f0.getImeOptions());
            int inputType = this.f1206f0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1206f0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            B.c cVar = this.f1197S;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f1206f0.getSuggestAuthority() != null) {
                f0 f0Var = new f0(getContext(), this, this.f1206f0, this.f1209j0);
                this.f1197S = f0Var;
                searchAutoComplete.setAdapter(f0Var);
                ((f0) this.f1197S).f2184u = this.f1199V ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f1206f0;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1206f0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1190L;
            } else if (this.f1206f0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1191M;
            }
            if (intent != null) {
                z2 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f1202b0 = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f1196R);
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.T = z2;
        u(this.f1196R);
    }

    public void setSuggestionsAdapter(B.c cVar) {
        this.f1197S = cVar;
        this.f1210t.setAdapter(cVar);
    }

    public final void t(boolean z2) {
        boolean z3 = this.T;
        this.f1215y.setVisibility((!z3 || !(z3 || this.f1202b0) || this.f1196R || !hasFocus() || (!z2 && this.f1202b0)) ? 8 : 0);
    }

    public final void u(boolean z2) {
        this.f1196R = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f1210t.getText());
        this.f1214x.setVisibility(i3);
        t(!isEmpty);
        this.f1211u.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f1186H;
        imageView.setVisibility((imageView.getDrawable() == null || this.f1195Q) ? 8 : 0);
        p();
        if (this.f1202b0 && !this.f1196R && isEmpty) {
            this.f1215y.setVisibility(8);
            i2 = 0;
        }
        this.f1179A.setVisibility(i2);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1182D = new Rect();
        this.f1183E = new Rect();
        this.f1184F = new int[2];
        this.f1185G = new int[2];
        this.f1208h0 = new T(this, 0);
        this.i0 = new T(this, 1);
        this.f1209j0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        W w2 = new W(this);
        X x2 = new X(this);
        C0146F c0146f = new C0146F(1, this);
        S s2 = new S(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0098a.f1656q, i2, 0);
        C0026b c0026b = new C0026b(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1210t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1211u = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f1212v = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f1213w = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1214x = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1215y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1216z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1179A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1186H = imageView5;
        Drawable x3 = c0026b.x(10);
        Field field = x.f3075a;
        findViewById.setBackground(x3);
        findViewById2.setBackground(c0026b.x(14));
        imageView.setImageDrawable(c0026b.x(13));
        imageView2.setImageDrawable(c0026b.x(7));
        imageView3.setImageDrawable(c0026b.x(4));
        imageView4.setImageDrawable(c0026b.x(16));
        imageView5.setImageDrawable(c0026b.x(13));
        this.f1187I = c0026b.x(12);
        AbstractC0069a.F(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f1188J = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1189K = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(s2);
        searchAutoComplete.setOnEditorActionListener(w2);
        searchAutoComplete.setOnItemClickListener(x2);
        searchAutoComplete.setOnItemSelectedListener(c0146f);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new U(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f1192N = obtainStyledAttributes.getText(6);
        this.f1198U = obtainStyledAttributes.getText(11);
        int i3 = obtainStyledAttributes.getInt(3, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = obtainStyledAttributes.getInt(2, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        c0026b.H();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1190L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1191M = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1180B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new V(this));
        }
        u(this.f1195Q);
        r();
    }

    public void setOnCloseListener(Z z2) {
    }

    public void setOnQueryTextListener(a0 a0Var) {
    }

    public void setOnSuggestionListener(b0 b0Var) {
    }
}
