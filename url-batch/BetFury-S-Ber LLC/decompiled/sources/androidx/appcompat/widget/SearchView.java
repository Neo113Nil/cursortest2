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
import com.trembin.nirefon.betfury.R;
import defpackage.b9;
import defpackage.bc0;
import defpackage.cc0;
import defpackage.d70;
import defpackage.dc0;
import defpackage.ec0;
import defpackage.fc0;
import defpackage.gc0;
import defpackage.hc0;
import defpackage.hm0;
import defpackage.hy;
import defpackage.ic0;
import defpackage.jc0;
import defpackage.kh;
import defpackage.qc;
import defpackage.rx;
import defpackage.s6;
import defpackage.sc;
import defpackage.t5;
import defpackage.v3;
import defpackage.yf0;
import defpackage.zi0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class SearchView extends rx implements sc {
    public static final qc n0;
    public final ImageView A;
    public final ImageView B;
    public final View C;
    public jc0 D;
    public final Rect E;
    public final Rect F;
    public final int[] G;
    public final int[] H;
    public final ImageView I;
    public final Drawable J;
    public final int K;
    public final int L;
    public final Intent M;
    public final Intent N;
    public final CharSequence O;
    public gc0 P;
    public View.OnFocusChangeListener Q;
    public View.OnClickListener R;
    public boolean S;
    public boolean T;
    public kh U;
    public boolean V;
    public CharSequence W;
    public boolean a0;
    public boolean b0;
    public int c0;
    public boolean d0;
    public String e0;
    public CharSequence f0;
    public boolean g0;
    public int h0;
    public SearchableInfo i0;
    public Bundle j0;
    public final cc0 k0;
    public final cc0 l0;
    public final WeakHashMap m0;
    public final SearchAutoComplete u;
    public final View v;
    public final View w;
    public final View x;
    public final ImageView y;
    public final ImageView z;

    static {
        qc qcVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            qc qcVar2 = new qc();
            qcVar2.a = null;
            qcVar2.b = null;
            qcVar2.c = null;
            qc.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                qcVar2.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                qcVar2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                qcVar2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            qcVar = qcVar2;
        }
        n0 = qcVar;
    }

    public SearchView(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.k0 = new cc0(this, 0);
        this.l0 = new cc0(this, 1);
        this.m0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        ec0 ec0Var = new ec0(this);
        t5 t5Var = new t5(2, this);
        hy hyVar = new hy(1, this);
        bc0 bc0Var = new bc0(this);
        int[] iArr = d70.u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        s6 s6Var = new s6(context, obtainStyledAttributes);
        hm0.l(this, context, iArr, null, obtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(21, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.v = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.w = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.x = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.y = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.B = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.I = imageView5;
        findViewById.setBackground(s6Var.j(22));
        findViewById2.setBackground(s6Var.j(27));
        imageView.setImageDrawable(s6Var.j(25));
        imageView2.setImageDrawable(s6Var.j(17));
        imageView3.setImageDrawable(s6Var.j(12));
        imageView4.setImageDrawable(s6Var.j(30));
        imageView5.setImageDrawable(s6Var.j(25));
        this.J = s6Var.j(24);
        zi0.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.K = obtainStyledAttributes.getResourceId(28, R.layout.abc_search_dropdown_item_icons_2line);
        this.L = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(bc0Var);
        searchAutoComplete.setOnEditorActionListener(ec0Var);
        searchAutoComplete.setOnItemClickListener(t5Var);
        searchAutoComplete.setOnItemSelectedListener(hyVar);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new dc0(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(20, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.O = obtainStyledAttributes.getText(15);
        this.W = obtainStyledAttributes.getText(23);
        int i = obtainStyledAttributes.getInt(6, -1);
        if (i != -1) {
            setImeOptions(i);
        }
        int i2 = obtainStyledAttributes.getInt(5, -1);
        if (i2 != -1) {
            setInputType(i2);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        s6Var.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.M = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.N = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.C = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new b9(1, this));
        }
        w(this.S);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.b0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.b0 = false;
    }

    public int getImeOptions() {
        return this.u.getImeOptions();
    }

    public int getInputType() {
        return this.u.getInputType();
    }

    public int getMaxWidth() {
        return this.c0;
    }

    public CharSequence getQuery() {
        return this.u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.W;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.i0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.O : getContext().getText(this.i0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.L;
    }

    public int getSuggestionRowLayout() {
        return this.K;
    }

    public kh getSuggestionsAdapter() {
        return this.U;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.i0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.j0;
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

    public final void l() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.u;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        qc qcVar = n0;
        qcVar.getClass();
        qc.a();
        Method method = qcVar.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        qcVar.getClass();
        qc.a();
        Method method2 = qcVar.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.u;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.S) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i) {
        int i2;
        String h;
        Cursor cursor = this.U.h;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = yf0.C;
                String h2 = yf0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h2 == null) {
                    h2 = this.i0.getSuggestIntentAction();
                }
                if (h2 == null) {
                    h2 = "android.intent.action.SEARCH";
                }
                String h3 = yf0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h3 == null) {
                    h3 = this.i0.getSuggestIntentData();
                }
                if (h3 != null && (h = yf0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h3 = h3 + "/" + Uri.encode(h);
                }
                intent = j(h2, h3 == null ? null : Uri.parse(h3), yf0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), yf0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i) {
        Editable text = this.u.getText();
        Cursor cursor = this.U.h;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String c = this.U.c(cursor);
        if (c != null) {
            setQuery(c);
        } else {
            setQuery(text);
        }
    }

    @Override // defpackage.sc
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.h0);
        this.g0 = false;
    }

    @Override // defpackage.sc
    public final void onActionViewExpanded() {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        SearchAutoComplete searchAutoComplete = this.u;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.h0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.k0);
        post(this.l0);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.rx, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.u;
            int[] iArr = this.G;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.H;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.E;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.F;
            rect2.set(i7, 0, i8, i9);
            jc0 jc0Var = this.D;
            if (jc0Var == null) {
                jc0 jc0Var2 = new jc0(searchAutoComplete, rect2, rect);
                this.D = jc0Var2;
                setTouchDelegate(jc0Var2);
            } else {
                jc0Var.b.set(rect2);
                Rect rect3 = jc0Var.d;
                rect3.set(rect2);
                int i10 = -jc0Var.e;
                rect3.inset(i10, i10);
                jc0Var.c.set(rect);
            }
        }
    }

    @Override // defpackage.rx, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.T) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.c0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.c0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.c0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ic0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ic0 ic0Var = (ic0) parcelable;
        super.onRestoreInstanceState(ic0Var.f);
        w(ic0Var.h);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ic0 ic0Var = new ic0(super.onSaveInstanceState());
        ic0Var.h = this.T;
        return ic0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.k0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.u;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.P != null) {
            text.toString();
        }
        if (this.i0 != null) {
            getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean isEmpty = TextUtils.isEmpty(this.u.getText());
        int i = (!isEmpty || (this.S && !this.g0)) ? 0 : 8;
        ImageView imageView = this.A;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.b0 || !isFocusable()) {
            return false;
        }
        if (this.T) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.u.requestFocus(i, rect);
        if (requestFocus) {
            w(false);
        }
        return requestFocus;
    }

    public final void s() {
        int[] iArr = this.u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.j0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.R;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.S == z) {
            return;
        }
        this.S = z;
        w(z);
        t();
    }

    public void setImeOptions(int i) {
        this.u.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.u.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.c0 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.Q = onFocusChangeListener;
    }

    public void setOnQueryTextListener(gc0 gc0Var) {
        this.P = gc0Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.R = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.W = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.a0 = z;
        kh khVar = this.U;
        if (khVar instanceof yf0) {
            ((yf0) khVar).u = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.i0 = searchableInfo;
        Intent intent = null;
        boolean z = true;
        SearchAutoComplete searchAutoComplete = this.u;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.i0.getImeOptions());
            int inputType = this.i0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.i0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            kh khVar = this.U;
            if (khVar != null) {
                khVar.b(null);
            }
            if (this.i0.getSuggestAuthority() != null) {
                yf0 yf0Var = new yf0(getContext(), this, this.i0, this.m0);
                this.U = yf0Var;
                searchAutoComplete.setAdapter(yf0Var);
                ((yf0) this.U).u = this.a0 ? 2 : 1;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.i0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.i0.getVoiceSearchLaunchWebSearch()) {
                intent = this.M;
            } else if (this.i0.getVoiceSearchLaunchRecognizer()) {
                intent = this.N;
            }
            if (intent != null) {
            }
        }
        z = false;
        this.d0 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.T);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.V = z;
        w(this.T);
    }

    public void setSuggestionsAdapter(kh khVar) {
        this.U = khVar;
        this.u.setAdapter(khVar);
    }

    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.S;
        SearchAutoComplete searchAutoComplete = this.u;
        if (z && (drawable = this.J) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        this.x.setVisibility(((this.V || this.d0) && !this.T && (this.z.getVisibility() == 0 || this.B.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z) {
        boolean z2 = this.V;
        this.z.setVisibility((!z2 || !(z2 || this.d0) || this.T || !hasFocus() || (!z && this.d0)) ? 8 : 0);
    }

    public final void w(boolean z) {
        this.T = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.u.getText());
        this.y.setVisibility(i2);
        v(!isEmpty);
        this.v.setVisibility(z ? 8 : 0);
        ImageView imageView = this.I;
        imageView.setVisibility((imageView.getDrawable() == null || this.S) ? 8 : 0);
        r();
        if (this.d0 && !this.T && isEmpty) {
            this.z.setVisibility(8);
            i = 0;
        }
        this.B.setVisibility(i);
        u();
    }

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static class SearchAutoComplete extends v3 {
        public int j;
        public SearchView k;
        public boolean l;
        public final d m;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m = new d(this);
            this.j = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
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
            qc qcVar = SearchView.n0;
            qcVar.getClass();
            qc.a();
            Method method = qcVar.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.j <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.v3, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.l) {
                d dVar = this.m;
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
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.k;
            searchView.w(searchView.T);
            searchView.post(searchView.k0);
            if (searchView.u.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
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
                        this.k.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.k.hasFocus() && getVisibility() == 0) {
                this.l = true;
                Context context = getContext();
                qc qcVar = SearchView.n0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.m;
            if (!z) {
                this.l = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.l = true;
                    return;
                }
                this.l = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.k = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.j = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }
    }

    public void setOnCloseListener(fc0 fc0Var) {
    }

    public void setOnSuggestionListener(hc0 hc0Var) {
    }
}
