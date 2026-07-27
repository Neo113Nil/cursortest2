package androidx.appcompat.widget;

import B4.i;
import E.G;
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
import com.chickyneer.roadway.R;
import g.AbstractC0444a;
import j.InterfaceC1194a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.AbstractC1228C;
import l.AbstractC1241m;
import l.D;
import l.P;
import l.Q;
import l.S;
import l.T;
import l.U;
import l.V;
import l.W;
import l.X;
import l.Y;
import l.Z;
import l.a0;
import l.b0;
import l.d0;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public class SearchView extends AbstractC1228C implements InterfaceC1194a {

    /* renamed from: n0, reason: collision with root package name */
    public static final W f4174n0;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f4175A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f4176B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f4177C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f4178D;

    /* renamed from: E, reason: collision with root package name */
    public final Drawable f4179E;

    /* renamed from: F, reason: collision with root package name */
    public final int f4180F;

    /* renamed from: G, reason: collision with root package name */
    public final int f4181G;

    /* renamed from: H, reason: collision with root package name */
    public final Intent f4182H;

    /* renamed from: I, reason: collision with root package name */
    public final Intent f4183I;

    /* renamed from: J, reason: collision with root package name */
    public final CharSequence f4184J;

    /* renamed from: K, reason: collision with root package name */
    public View.OnFocusChangeListener f4185K;

    /* renamed from: L, reason: collision with root package name */
    public View.OnClickListener f4186L;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4187T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4188U;

    /* renamed from: V, reason: collision with root package name */
    public J.c f4189V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4190W;

    /* renamed from: a0, reason: collision with root package name */
    public CharSequence f4191a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4192b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4193c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f4194d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4195e0;

    /* renamed from: f0, reason: collision with root package name */
    public CharSequence f4196f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f4197g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f4198h0;

    /* renamed from: i0, reason: collision with root package name */
    public SearchableInfo f4199i0;

    /* renamed from: j0, reason: collision with root package name */
    public Bundle f4200j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Q f4201k0;
    public final Q l0;

    /* renamed from: m0, reason: collision with root package name */
    public final WeakHashMap f4202m0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f4203p;

    /* renamed from: q, reason: collision with root package name */
    public final View f4204q;

    /* renamed from: r, reason: collision with root package name */
    public final View f4205r;

    /* renamed from: s, reason: collision with root package name */
    public final View f4206s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4207t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4208u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f4209v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f4210w;

    /* renamed from: x, reason: collision with root package name */
    public final View f4211x;

    /* renamed from: y, reason: collision with root package name */
    public b0 f4212y;
    public final Rect z;

    public static class SearchAutoComplete extends AbstractC1241m {

        /* renamed from: d, reason: collision with root package name */
        public int f4213d;

        /* renamed from: e, reason: collision with root package name */
        public SearchView f4214e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f4215f;

        /* renamed from: g, reason: collision with root package name */
        public final c f4216g;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4216g = new c(this);
            this.f4213d = getThreshold();
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
            return this.f4213d <= 0 || super.enoughToFilter();
        }

        @Override // l.AbstractC1241m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4215f) {
                c cVar = this.f4216g;
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
        public final void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            SearchView searchView = this.f4214e;
            searchView.u(searchView.f4188U);
            searchView.post(searchView.f4201k0);
            if (searchView.f4203p.hasFocus()) {
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
                        this.f4214e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.f4214e.hasFocus() && getVisibility() == 0) {
                this.f4215f = true;
                Context context = getContext();
                W w3 = SearchView.f4174n0;
                if (context.getResources().getConfiguration().orientation != 2 || (method = SearchView.f4174n0.f10822c) == null) {
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
            c cVar = this.f4216g;
            if (!z) {
                this.f4215f = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f4215f = true;
                    return;
                }
                this.f4215f = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f4214e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f4213d = i2;
        }
    }

    static {
        W w3 = new W();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            w3.f10820a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            w3.f10821b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            w3.f10822c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f4174n0 = w3;
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
        SearchAutoComplete searchAutoComplete = this.f4203p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f4193c0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f4203p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f4193c0 = false;
    }

    public int getImeOptions() {
        return this.f4203p.getImeOptions();
    }

    public int getInputType() {
        return this.f4203p.getInputType();
    }

    public int getMaxWidth() {
        return this.f4194d0;
    }

    public CharSequence getQuery() {
        return this.f4203p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f4191a0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f4199i0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f4184J : getContext().getText(this.f4199i0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f4181G;
    }

    public int getSuggestionRowLayout() {
        return this.f4180F;
    }

    public J.c getSuggestionsAdapter() {
        return this.f4189V;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f4196f0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f4200j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f4199i0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4200j0;
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
        SearchAutoComplete searchAutoComplete = this.f4203p;
        if (i2 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        W w3 = f4174n0;
        Method method = w3.f10820a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        Method method2 = w3.f10821b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f4203p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f4187T) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i2) {
        int i3;
        String h3;
        Cursor cursor = this.f4189V.f1340c;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i6 = d0.f10839y;
                String h6 = d0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h6 == null) {
                    h6 = this.f4199i0.getSuggestIntentAction();
                }
                if (h6 == null) {
                    h6 = "android.intent.action.SEARCH";
                }
                String h7 = d0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h7 == null) {
                    h7 = this.f4199i0.getSuggestIntentData();
                }
                if (h7 != null && (h3 = d0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h7 = h7 + "/" + Uri.encode(h3);
                }
                intent = h(h6, h7 == null ? null : Uri.parse(h7), d0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), d0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e3) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e3);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e6) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e6);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f4203p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i2) {
        Editable text = this.f4203p.getText();
        Cursor cursor = this.f4189V.f1340c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String c2 = this.f4189V.c(cursor);
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
        SearchAutoComplete searchAutoComplete = this.f4203p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f4199i0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f4201k0);
        post(this.l0);
        super.onDetachedFromWindow();
    }

    @Override // l.AbstractC1228C, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        super.onLayout(z, i2, i3, i6, i7);
        if (z) {
            int[] iArr = this.f4176B;
            SearchAutoComplete searchAutoComplete = this.f4203p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f4177C;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i9;
            int height = searchAutoComplete.getHeight() + i8;
            Rect rect = this.z;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i3;
            Rect rect2 = this.f4175A;
            rect2.set(i10, 0, i11, i12);
            b0 b0Var = this.f4212y;
            if (b0Var == null) {
                b0 b0Var2 = new b0(rect2, rect, searchAutoComplete);
                this.f4212y = b0Var2;
                setTouchDelegate(b0Var2);
            } else {
                b0Var.f10827b.set(rect2);
                Rect rect3 = b0Var.f10829d;
                rect3.set(rect2);
                int i13 = -b0Var.f10830e;
                rect3.inset(i13, i13);
                b0Var.f10828c.set(rect);
            }
        }
    }

    @Override // l.AbstractC1228C, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i6;
        if (this.f4188U) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f4194d0;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f4194d0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f4194d0) > 0) {
            size = Math.min(i6, size);
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
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        super.onRestoreInstanceState(a0Var.f1370a);
        u(a0Var.f10824c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a0 a0Var = new a0(super.onSaveInstanceState());
        a0Var.f10824c = this.f4188U;
        return a0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f4201k0);
    }

    public final void p() {
        boolean isEmpty = TextUtils.isEmpty(this.f4203p.getText());
        int i2 = (!isEmpty || (this.f4187T && !this.f4197g0)) ? 0 : 8;
        ImageView imageView = this.f4209v;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f4203p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f4205r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f4206s.getBackground();
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
        boolean z = this.f4187T;
        SearchAutoComplete searchAutoComplete = this.f4203p;
        if (z && (drawable = this.f4179E) != null) {
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
        if (this.f4193c0 || !isFocusable()) {
            return false;
        }
        if (this.f4188U) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f4203p.requestFocus(i2, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f4206s.setVisibility(((this.f4190W || this.f4195e0) && !this.f4188U && (this.f4208u.getVisibility() == 0 || this.f4210w.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f4200j0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f4203p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f4186L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f4187T == z) {
            return;
        }
        this.f4187T = z;
        u(z);
        r();
    }

    public void setImeOptions(int i2) {
        this.f4203p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f4203p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f4194d0 = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f4185K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f4186L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f4191a0 = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f4192b0 = z;
        J.c cVar = this.f4189V;
        if (cVar instanceof d0) {
            ((d0) cVar).f10848q = z ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f4199i0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f4203p;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f4199i0.getImeOptions());
            int inputType = this.f4199i0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f4199i0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            J.c cVar = this.f4189V;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f4199i0.getSuggestAuthority() != null) {
                d0 d0Var = new d0(getContext(), this, this.f4199i0, this.f4202m0);
                this.f4189V = d0Var;
                searchAutoComplete.setAdapter(d0Var);
                ((d0) this.f4189V).f10848q = this.f4192b0 ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f4199i0;
        boolean z = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f4199i0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f4182H;
            } else if (this.f4199i0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f4183I;
            }
            if (intent != null) {
                z = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f4195e0 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f4188U);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f4190W = z;
        u(this.f4188U);
    }

    public void setSuggestionsAdapter(J.c cVar) {
        this.f4189V = cVar;
        this.f4203p.setAdapter(cVar);
    }

    public final void t(boolean z) {
        boolean z5 = this.f4190W;
        this.f4208u.setVisibility((!z5 || !(z5 || this.f4195e0) || this.f4188U || !hasFocus() || (!z && this.f4195e0)) ? 8 : 0);
    }

    public final void u(boolean z) {
        this.f4188U = z;
        int i2 = 8;
        int i3 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f4203p.getText());
        this.f4207t.setVisibility(i3);
        t(!isEmpty);
        this.f4204q.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f4178D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f4187T) ? 8 : 0);
        p();
        if (this.f4195e0 && !this.f4188U && isEmpty) {
            this.f4208u.setVisibility(8);
            i2 = 0;
        }
        this.f4210w.setVisibility(i2);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.z = new Rect();
        this.f4175A = new Rect();
        this.f4176B = new int[2];
        this.f4177C = new int[2];
        this.f4201k0 = new Q(this, 0);
        this.l0 = new Q(this, 1);
        this.f4202m0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        U u5 = new U(this);
        V v4 = new V(this);
        D d6 = new D(1, this);
        P p5 = new P(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0444a.f5709q, i2, 0);
        i iVar = new i(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f4203p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f4204q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f4205r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f4206s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f4207t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f4208u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f4209v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f4210w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f4178D = imageView5;
        Drawable F2 = iVar.F(10);
        Field field = G.f566a;
        findViewById.setBackground(F2);
        findViewById2.setBackground(iVar.F(14));
        imageView.setImageDrawable(iVar.F(13));
        imageView2.setImageDrawable(iVar.F(7));
        imageView3.setImageDrawable(iVar.F(4));
        imageView4.setImageDrawable(iVar.F(16));
        imageView5.setImageDrawable(iVar.F(13));
        this.f4179E = iVar.F(12);
        AbstractC1477a.z(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f4180F = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f4181G = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(p5);
        searchAutoComplete.setOnEditorActionListener(u5);
        searchAutoComplete.setOnItemClickListener(v4);
        searchAutoComplete.setOnItemSelectedListener(d6);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new S(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f4184J = obtainStyledAttributes.getText(6);
        this.f4191a0 = obtainStyledAttributes.getText(11);
        int i3 = obtainStyledAttributes.getInt(3, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i6 = obtainStyledAttributes.getInt(2, -1);
        if (i6 != -1) {
            setInputType(i6);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        iVar.P();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f4182H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4183I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f4211x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new T(this));
        }
        u(this.f4187T);
        r();
    }

    public void setOnCloseListener(X x5) {
    }

    public void setOnQueryTextListener(Y y5) {
    }

    public void setOnSuggestionListener(Z z) {
    }
}
