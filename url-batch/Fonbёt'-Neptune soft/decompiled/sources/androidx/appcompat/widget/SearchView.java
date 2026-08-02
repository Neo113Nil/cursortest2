package androidx.appcompat.widget;

import A.z;
import B0.C0031i;
import J0.e;
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
import c.AbstractC0165a;
import com.neptunesoft.languesbacdz.R;
import h.InterfaceC0190a;
import j.AbstractC0237m;
import j.G;
import j.H;
import j.V;
import j.W;
import j.X;
import j.Y;
import j.Z;
import j.a0;
import j.b0;
import j.c0;
import j.d0;
import j.e0;
import j.f0;
import j.h0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends G implements InterfaceC0190a {

    /* renamed from: k0, reason: collision with root package name */
    public static final e f1427k0;

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f1428A;

    /* renamed from: B, reason: collision with root package name */
    public final View f1429B;

    /* renamed from: C, reason: collision with root package name */
    public f0 f1430C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f1431D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f1432E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f1433F;

    /* renamed from: G, reason: collision with root package name */
    public final int[] f1434G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f1435H;

    /* renamed from: I, reason: collision with root package name */
    public final Drawable f1436I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f1437K;

    /* renamed from: L, reason: collision with root package name */
    public final Intent f1438L;

    /* renamed from: M, reason: collision with root package name */
    public final Intent f1439M;

    /* renamed from: N, reason: collision with root package name */
    public final CharSequence f1440N;

    /* renamed from: O, reason: collision with root package name */
    public View.OnFocusChangeListener f1441O;

    /* renamed from: P, reason: collision with root package name */
    public View.OnClickListener f1442P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f1443Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f1444R;

    /* renamed from: S, reason: collision with root package name */
    public G.c f1445S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f1446T;

    /* renamed from: U, reason: collision with root package name */
    public CharSequence f1447U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1448V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f1449W;

    /* renamed from: a0, reason: collision with root package name */
    public int f1450a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1451b0;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f1452c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1453d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f1454e0;
    public SearchableInfo f0;

    /* renamed from: g0, reason: collision with root package name */
    public Bundle f1455g0;

    /* renamed from: h0, reason: collision with root package name */
    public final W f1456h0;

    /* renamed from: i0, reason: collision with root package name */
    public final W f1457i0;

    /* renamed from: j0, reason: collision with root package name */
    public final WeakHashMap f1458j0;

    /* renamed from: t, reason: collision with root package name */
    public final SearchAutoComplete f1459t;

    /* renamed from: u, reason: collision with root package name */
    public final View f1460u;
    public final View v;

    /* renamed from: w, reason: collision with root package name */
    public final View f1461w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f1462x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f1463y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f1464z;

    public static class SearchAutoComplete extends AbstractC0237m {

        /* renamed from: h, reason: collision with root package name */
        public int f1465h;

        /* renamed from: i, reason: collision with root package name */
        public SearchView f1466i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f1467j;

        /* renamed from: k, reason: collision with root package name */
        public final c f1468k;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1468k = new c(this);
            this.f1465h = getThreshold();
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
            return this.f1465h <= 0 || super.enoughToFilter();
        }

        @Override // j.AbstractC0237m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1467j) {
                c cVar = this.f1468k;
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
            SearchView searchView = this.f1466i;
            searchView.u(searchView.f1444R);
            searchView.post(searchView.f1456h0);
            if (searchView.f1459t.hasFocus()) {
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
                        this.f1466i.clearFocus();
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
            if (z2 && this.f1466i.hasFocus() && getVisibility() == 0) {
                this.f1467j = true;
                Context context = getContext();
                e eVar = SearchView.f1427k0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = SearchView.f1427k0.f741c) == null) {
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
            c cVar = this.f1468k;
            if (!z2) {
                this.f1467j = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1467j = true;
                    return;
                }
                this.f1467j = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1466i = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1465h = i2;
        }
    }

    static {
        e eVar = new e();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            eVar.f739a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            eVar.f740b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            eVar.f741c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f1427k0 = eVar;
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
        SearchAutoComplete searchAutoComplete = this.f1459t;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1449W = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1459t;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1449W = false;
    }

    public int getImeOptions() {
        return this.f1459t.getImeOptions();
    }

    public int getInputType() {
        return this.f1459t.getInputType();
    }

    public int getMaxWidth() {
        return this.f1450a0;
    }

    public CharSequence getQuery() {
        return this.f1459t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1447U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1440N : getContext().getText(this.f0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1437K;
    }

    public int getSuggestionRowLayout() {
        return this.J;
    }

    public G.c getSuggestionsAdapter() {
        return this.f1445S;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1452c0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1455g0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1455g0;
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
        SearchAutoComplete searchAutoComplete = this.f1459t;
        if (i2 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        e eVar = f1427k0;
        Method method = eVar.f739a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        Method method2 = eVar.f740b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f1459t;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f1443Q) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i2) {
        int i3;
        String h2;
        Cursor cursor = this.f1445S.f476g;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = h0.f2949C;
                String h3 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.f0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String h4 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.f0.getSuggestIntentData();
                }
                if (h4 != null && (h2 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                intent = h(h3, h4 == null ? null : Uri.parse(h4), h0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), h0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
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
        SearchAutoComplete searchAutoComplete = this.f1459t;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i2) {
        Editable text = this.f1459t.getText();
        Cursor cursor = this.f1445S.f476g;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String c2 = this.f1445S.c(cursor);
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
        SearchAutoComplete searchAutoComplete = this.f1459t;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1456h0);
        post(this.f1457i0);
        super.onDetachedFromWindow();
    }

    @Override // j.G, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.f1433F;
            SearchAutoComplete searchAutoComplete = this.f1459t;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f1434G;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.f1431D;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.f1432E;
            rect2.set(i8, 0, i9, i10);
            f0 f0Var = this.f1430C;
            if (f0Var == null) {
                f0 f0Var2 = new f0(rect2, rect, searchAutoComplete);
                this.f1430C = f0Var2;
                setTouchDelegate(f0Var2);
            } else {
                f0Var.f2937b.set(rect2);
                Rect rect3 = f0Var.f2939d;
                rect3.set(rect2);
                int i11 = -f0Var.f2940e;
                rect3.inset(i11, i11);
                f0Var.f2938c.set(rect);
            }
        }
    }

    @Override // j.G, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1444R) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f1450a0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1450a0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f1450a0) > 0) {
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
        if (!(parcelable instanceof e0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e0 e0Var = (e0) parcelable;
        super.onRestoreInstanceState(e0Var.f495a);
        u(e0Var.f2933c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e0 e0Var = new e0(super.onSaveInstanceState());
        e0Var.f2933c = this.f1444R;
        return e0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f1456h0);
    }

    public final void p() {
        boolean isEmpty = TextUtils.isEmpty(this.f1459t.getText());
        int i2 = (!isEmpty || (this.f1443Q && !this.f1453d0)) ? 0 : 8;
        ImageView imageView = this.f1464z;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f1459t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1461w.getBackground();
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
        boolean z2 = this.f1443Q;
        SearchAutoComplete searchAutoComplete = this.f1459t;
        if (z2 && (drawable = this.f1436I) != null) {
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
        if (this.f1449W || !isFocusable()) {
            return false;
        }
        if (this.f1444R) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f1459t.requestFocus(i2, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f1461w.setVisibility(((this.f1446T || this.f1451b0) && !this.f1444R && (this.f1463y.getVisibility() == 0 || this.f1428A.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1455g0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f1459t;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1442P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f1443Q == z2) {
            return;
        }
        this.f1443Q = z2;
        u(z2);
        r();
    }

    public void setImeOptions(int i2) {
        this.f1459t.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f1459t.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f1450a0 = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1441O = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1442P = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1447U = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f1448V = z2;
        G.c cVar = this.f1445S;
        if (cVar instanceof h0) {
            ((h0) cVar).f2960u = z2 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f1459t;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f0.getImeOptions());
            int inputType = this.f0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            G.c cVar = this.f1445S;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f0.getSuggestAuthority() != null) {
                h0 h0Var = new h0(getContext(), this, this.f0, this.f1458j0);
                this.f1445S = h0Var;
                searchAutoComplete.setAdapter(h0Var);
                ((h0) this.f1445S).f2960u = this.f1448V ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f0;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1438L;
            } else if (this.f0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1439M;
            }
            if (intent != null) {
                z2 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f1451b0 = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f1444R);
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f1446T = z2;
        u(this.f1444R);
    }

    public void setSuggestionsAdapter(G.c cVar) {
        this.f1445S = cVar;
        this.f1459t.setAdapter(cVar);
    }

    public final void t(boolean z2) {
        boolean z3 = this.f1446T;
        this.f1463y.setVisibility((!z3 || !(z3 || this.f1451b0) || this.f1444R || !hasFocus() || (!z2 && this.f1451b0)) ? 8 : 0);
    }

    public final void u(boolean z2) {
        this.f1444R = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f1459t.getText());
        this.f1462x.setVisibility(i3);
        t(!isEmpty);
        this.f1460u.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f1435H;
        imageView.setVisibility((imageView.getDrawable() == null || this.f1443Q) ? 8 : 0);
        p();
        if (this.f1451b0 && !this.f1444R && isEmpty) {
            this.f1463y.setVisibility(8);
            i2 = 0;
        }
        this.f1428A.setVisibility(i2);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1431D = new Rect();
        this.f1432E = new Rect();
        this.f1433F = new int[2];
        this.f1434G = new int[2];
        this.f1456h0 = new W(this, 0);
        int i3 = 1;
        this.f1457i0 = new W(this, i3);
        this.f1458j0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        Z z2 = new Z(this);
        a0 a0Var = new a0(this);
        H h2 = new H(i3, this);
        V v = new V(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0165a.f1979q, i2, 0);
        C0031i c0031i = new C0031i(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1459t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1460u = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.v = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f1461w = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1462x = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1463y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1464z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1428A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1435H = imageView5;
        Drawable A2 = c0031i.A(10);
        Field field = z.f58a;
        findViewById.setBackground(A2);
        findViewById2.setBackground(c0031i.A(14));
        imageView.setImageDrawable(c0031i.A(13));
        imageView2.setImageDrawable(c0031i.A(7));
        imageView3.setImageDrawable(c0031i.A(4));
        imageView4.setImageDrawable(c0031i.A(16));
        imageView5.setImageDrawable(c0031i.A(13));
        this.f1436I = c0031i.A(12);
        i1.a.z(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.J = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1437K = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(v);
        searchAutoComplete.setOnEditorActionListener(z2);
        searchAutoComplete.setOnItemClickListener(a0Var);
        searchAutoComplete.setOnItemSelectedListener(h2);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new X(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f1440N = obtainStyledAttributes.getText(6);
        this.f1447U = obtainStyledAttributes.getText(11);
        int i4 = obtainStyledAttributes.getInt(3, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = obtainStyledAttributes.getInt(2, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        c0031i.N();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1438L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1439M = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1429B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new Y(this));
        }
        u(this.f1443Q);
        r();
    }

    public void setOnCloseListener(b0 b0Var) {
    }

    public void setOnQueryTextListener(c0 c0Var) {
    }

    public void setOnSuggestionListener(d0 d0Var) {
    }
}
