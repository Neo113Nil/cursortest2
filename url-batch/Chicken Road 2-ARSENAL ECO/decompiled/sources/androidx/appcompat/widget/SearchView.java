package androidx.appcompat.widget;

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
import com.strategylink.Row.Five.R;
import g.AbstractC0389a;
import i.InterfaceC0414a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.AbstractC0454m;
import k.I;
import k.J;
import k.W;
import k.X;
import k.Y;
import k.Z;
import k.a0;
import k.b0;
import k.c0;
import k.d0;
import k.e0;
import k.f0;
import k.g0;
import k.h0;
import k.j0;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public class SearchView extends I implements InterfaceC0414a {

    /* renamed from: l0, reason: collision with root package name */
    public static final f0 f3313l0;

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f3314A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f3315B;

    /* renamed from: C, reason: collision with root package name */
    public final View f3316C;

    /* renamed from: D, reason: collision with root package name */
    public h0 f3317D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f3318E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f3319F;

    /* renamed from: G, reason: collision with root package name */
    public final int[] f3320G;

    /* renamed from: H, reason: collision with root package name */
    public final int[] f3321H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f3322I;

    /* renamed from: J, reason: collision with root package name */
    public final Drawable f3323J;

    /* renamed from: K, reason: collision with root package name */
    public final int f3324K;

    /* renamed from: L, reason: collision with root package name */
    public final int f3325L;

    /* renamed from: M, reason: collision with root package name */
    public final Intent f3326M;

    /* renamed from: N, reason: collision with root package name */
    public final Intent f3327N;

    /* renamed from: O, reason: collision with root package name */
    public final CharSequence f3328O;

    /* renamed from: P, reason: collision with root package name */
    public View.OnFocusChangeListener f3329P;

    /* renamed from: Q, reason: collision with root package name */
    public View.OnClickListener f3330Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f3331R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3332S;

    /* renamed from: T, reason: collision with root package name */
    public J.b f3333T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3334U;

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f3335V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3336W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3337a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f3338b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3339c0;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f3340d0;
    public boolean e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f3341f0;

    /* renamed from: g0, reason: collision with root package name */
    public SearchableInfo f3342g0;

    /* renamed from: h0, reason: collision with root package name */
    public Bundle f3343h0;

    /* renamed from: i0, reason: collision with root package name */
    public final X f3344i0;

    /* renamed from: j0, reason: collision with root package name */
    public final X f3345j0;
    public final WeakHashMap k0;

    /* renamed from: u, reason: collision with root package name */
    public final SearchAutoComplete f3346u;

    /* renamed from: v, reason: collision with root package name */
    public final View f3347v;

    /* renamed from: w, reason: collision with root package name */
    public final View f3348w;

    /* renamed from: x, reason: collision with root package name */
    public final View f3349x;
    public final ImageView y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f3350z;

    public static class SearchAutoComplete extends AbstractC0454m {

        /* renamed from: i, reason: collision with root package name */
        public int f3351i;

        /* renamed from: j, reason: collision with root package name */
        public SearchView f3352j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f3353k;

        /* renamed from: l, reason: collision with root package name */
        public final c f3354l;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3354l = new c(this);
            this.f3351i = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i7 < 600) {
                return (i7 < 640 || i8 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            f0 f0Var = SearchView.f3313l0;
            f0Var.getClass();
            f0.a();
            Method method = f0Var.f4993c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f3351i <= 0 || super.enoughToFilter();
        }

        @Override // k.AbstractC0454m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3353k) {
                c cVar = this.f3354l;
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
        public final void onFocusChanged(boolean z5, int i7, Rect rect) {
            super.onFocusChanged(z5, i7, rect);
            SearchView searchView = this.f3352j;
            searchView.u(searchView.f3332S);
            searchView.post(searchView.f3344i0);
            if (searchView.f3346u.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
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
                        this.f3352j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z5) {
            super.onWindowFocusChanged(z5);
            if (z5 && this.f3352j.hasFocus() && getVisibility() == 0) {
                this.f3353k = true;
                Context context = getContext();
                f0 f0Var = SearchView.f3313l0;
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

        public void setImeVisibility(boolean z5) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f3354l;
            if (!z5) {
                this.f3353k = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f3353k = true;
                    return;
                }
                this.f3353k = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f3352j = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f3351i = i7;
        }
    }

    static {
        f0 f0Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            f0 f0Var2 = new f0();
            f0Var2.f4991a = null;
            f0Var2.f4992b = null;
            f0Var2.f4993c = null;
            f0.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                f0Var2.f4991a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                f0Var2.f4992b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                f0Var2.f4993c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            f0Var = f0Var2;
        }
        f3313l0 = f0Var;
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
        SearchAutoComplete searchAutoComplete = this.f3346u;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f3337a0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f3346u;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f3337a0 = false;
    }

    public int getImeOptions() {
        return this.f3346u.getImeOptions();
    }

    public int getInputType() {
        return this.f3346u.getInputType();
    }

    public int getMaxWidth() {
        return this.f3338b0;
    }

    public CharSequence getQuery() {
        return this.f3346u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3335V;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3342g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f3328O : getContext().getText(this.f3342g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f3325L;
    }

    public int getSuggestionRowLayout() {
        return this.f3324K;
    }

    public J.b getSuggestionsAdapter() {
        return this.f3333T;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3340d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3343h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f3342g0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3343h0;
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
        int i7 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f3346u;
        if (i7 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        f0 f0Var = f3313l0;
        f0Var.getClass();
        f0.a();
        Method method = f0Var.f4991a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        f0.a();
        Method method2 = f0Var.f4992b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f3346u;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f3331R) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i7) {
        int i8;
        String h7;
        Cursor cursor = this.f3333T.f1232h;
        if (cursor != null && cursor.moveToPosition(i7)) {
            Intent intent = null;
            try {
                int i9 = j0.f5029C;
                String h8 = j0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h8 == null) {
                    h8 = this.f3342g0.getSuggestIntentAction();
                }
                if (h8 == null) {
                    h8 = "android.intent.action.SEARCH";
                }
                String h9 = j0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h9 == null) {
                    h9 = this.f3342g0.getSuggestIntentData();
                }
                if (h9 != null && (h7 = j0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h9 = h9 + "/" + Uri.encode(h7);
                }
                intent = h(h8, h9 == null ? null : Uri.parse(h9), j0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), j0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e4) {
                try {
                    i8 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i8 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i8 + " returned exception.", e4);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e7) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e7);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f3346u;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i7) {
        Editable text = this.f3346u.getText();
        Cursor cursor = this.f3333T.f1232h;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i7)) {
            setQuery(text);
            return;
        }
        String c7 = this.f3333T.c(cursor);
        if (c7 != null) {
            setQuery(c7);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f3346u;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f3342g0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3344i0);
        post(this.f3345j0);
        super.onDetachedFromWindow();
    }

    @Override // k.I, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i8, int i9, int i10) {
        super.onLayout(z5, i7, i8, i9, i10);
        if (z5) {
            SearchAutoComplete searchAutoComplete = this.f3346u;
            int[] iArr = this.f3320G;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f3321H;
            getLocationInWindow(iArr2);
            int i11 = iArr[1] - iArr2[1];
            int i12 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i12;
            int height = searchAutoComplete.getHeight() + i11;
            Rect rect = this.f3318E;
            rect.set(i12, i11, width, height);
            int i13 = rect.left;
            int i14 = rect.right;
            int i15 = i10 - i8;
            Rect rect2 = this.f3319F;
            rect2.set(i13, 0, i14, i15);
            h0 h0Var = this.f3317D;
            if (h0Var == null) {
                h0 h0Var2 = new h0(rect2, rect, searchAutoComplete);
                this.f3317D = h0Var2;
                setTouchDelegate(h0Var2);
            } else {
                h0Var.f4998b.set(rect2);
                Rect rect3 = h0Var.f5000d;
                rect3.set(rect2);
                int i16 = -h0Var.f5001e;
                rect3.inset(i16, i16);
                h0Var.f4999c.set(rect);
            }
        }
    }

    @Override // k.I, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        if (this.f3332S) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            int i10 = this.f3338b0;
            size = i10 > 0 ? Math.min(i10, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3338b0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i9 = this.f3338b0) > 0) {
            size = Math.min(i9, size);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g0 g0Var = (g0) parcelable;
        super.onRestoreInstanceState(g0Var.f1342f);
        u(g0Var.f4995h);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g0 g0Var = new g0(super.onSaveInstanceState());
        g0Var.f4995h = this.f3332S;
        return g0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        post(this.f3344i0);
    }

    public final void p() {
        boolean isEmpty = TextUtils.isEmpty(this.f3346u.getText());
        int i7 = (!isEmpty || (this.f3331R && !this.e0)) ? 0 : 8;
        ImageView imageView = this.f3314A;
        imageView.setVisibility(i7);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f3346u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f3348w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3349x.getBackground();
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
        boolean z5 = this.f3331R;
        SearchAutoComplete searchAutoComplete = this.f3346u;
        if (z5 && (drawable = this.f3323J) != null) {
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
    public final boolean requestFocus(int i7, Rect rect) {
        if (this.f3337a0 || !isFocusable()) {
            return false;
        }
        if (this.f3332S) {
            return super.requestFocus(i7, rect);
        }
        boolean requestFocus = this.f3346u.requestFocus(i7, rect);
        if (requestFocus) {
            u(false);
        }
        return requestFocus;
    }

    public final void s() {
        this.f3349x.setVisibility(((this.f3334U || this.f3339c0) && !this.f3332S && (this.f3350z.getVisibility() == 0 || this.f3315B.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3343h0 = bundle;
    }

    public void setIconified(boolean z5) {
        if (z5) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f3346u;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3330Q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z5) {
        if (this.f3331R == z5) {
            return;
        }
        this.f3331R = z5;
        u(z5);
        r();
    }

    public void setImeOptions(int i7) {
        this.f3346u.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.f3346u.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f3338b0 = i7;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3329P = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3330Q = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3335V = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z5) {
        this.f3336W = z5;
        J.b bVar = this.f3333T;
        if (bVar instanceof j0) {
            ((j0) bVar).f5040u = z5 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3342g0 = searchableInfo;
        Intent intent = null;
        boolean z5 = true;
        SearchAutoComplete searchAutoComplete = this.f3346u;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f3342g0.getImeOptions());
            int inputType = this.f3342g0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f3342g0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            J.b bVar = this.f3333T;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f3342g0.getSuggestAuthority() != null) {
                j0 j0Var = new j0(getContext(), this, this.f3342g0, this.k0);
                this.f3333T = j0Var;
                searchAutoComplete.setAdapter(j0Var);
                ((j0) this.f3333T).f5040u = this.f3336W ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f3342g0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f3342g0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f3326M;
            } else if (this.f3342g0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f3327N;
            }
            if (intent != null) {
            }
        }
        z5 = false;
        this.f3339c0 = z5;
        if (z5) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f3332S);
    }

    public void setSubmitButtonEnabled(boolean z5) {
        this.f3334U = z5;
        u(this.f3332S);
    }

    public void setSuggestionsAdapter(J.b bVar) {
        this.f3333T = bVar;
        this.f3346u.setAdapter(bVar);
    }

    public final void t(boolean z5) {
        boolean z6 = this.f3334U;
        this.f3350z.setVisibility((!z6 || !(z6 || this.f3339c0) || this.f3332S || !hasFocus() || (!z5 && this.f3339c0)) ? 8 : 0);
    }

    public final void u(boolean z5) {
        this.f3332S = z5;
        int i7 = 8;
        int i8 = z5 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f3346u.getText());
        this.y.setVisibility(i8);
        t(!isEmpty);
        this.f3347v.setVisibility(z5 ? 8 : 0);
        ImageView imageView = this.f3322I;
        imageView.setVisibility((imageView.getDrawable() == null || this.f3331R) ? 8 : 0);
        p();
        if (this.f3339c0 && !this.f3332S && isEmpty) {
            this.f3350z.setVisibility(8);
            i7 = 0;
        }
        this.f3315B.setVisibility(i7);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f3318E = new Rect();
        this.f3319F = new Rect();
        this.f3320G = new int[2];
        this.f3321H = new int[2];
        this.f3344i0 = new X(this, 0);
        this.f3345j0 = new X(this, 1);
        this.k0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        a0 a0Var = new a0(this);
        b0 b0Var = new b0(this);
        J j4 = new J(1, this);
        W w5 = new W(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0389a.f4270q, i7, 0);
        B0.c cVar = new B0.c(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f3346u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3347v = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f3348w = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f3349x = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.y = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f3350z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f3314A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f3315B = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f3322I = imageView5;
        findViewById.setBackground(cVar.m(10));
        findViewById2.setBackground(cVar.m(14));
        imageView.setImageDrawable(cVar.m(13));
        imageView2.setImageDrawable(cVar.m(7));
        imageView3.setImageDrawable(cVar.m(4));
        imageView4.setImageDrawable(cVar.m(16));
        imageView5.setImageDrawable(cVar.m(13));
        this.f3323J = cVar.m(12);
        AbstractC0676f.t(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f3324K = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f3325L = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(w5);
        searchAutoComplete.setOnEditorActionListener(a0Var);
        searchAutoComplete.setOnItemClickListener(b0Var);
        searchAutoComplete.setOnItemSelectedListener(j4);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new Y(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f3328O = obtainStyledAttributes.getText(6);
        this.f3335V = obtainStyledAttributes.getText(11);
        int i8 = obtainStyledAttributes.getInt(3, -1);
        if (i8 != -1) {
            setImeOptions(i8);
        }
        int i9 = obtainStyledAttributes.getInt(2, -1);
        if (i9 != -1) {
            setInputType(i9);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        cVar.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f3326M = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3327N = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f3316C = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new Z(this));
        }
        u(this.f3331R);
        r();
    }

    public void setOnCloseListener(c0 c0Var) {
    }

    public void setOnQueryTextListener(d0 d0Var) {
    }

    public void setOnSuggestionListener(e0 e0Var) {
    }
}
