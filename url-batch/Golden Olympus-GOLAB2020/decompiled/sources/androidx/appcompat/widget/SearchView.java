package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC1281a0;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e.AbstractC2405a;
import e.AbstractC2408d;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends J implements androidx.appcompat.view.c {

    /* renamed from: W, reason: collision with root package name */
    static final o f10731W;

    /* renamed from: A, reason: collision with root package name */
    L.a f10732A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f10733B;

    /* renamed from: C, reason: collision with root package name */
    private CharSequence f10734C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f10735D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f10736E;

    /* renamed from: F, reason: collision with root package name */
    private int f10737F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f10738G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f10739H;

    /* renamed from: I, reason: collision with root package name */
    private CharSequence f10740I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f10741J;

    /* renamed from: K, reason: collision with root package name */
    private int f10742K;

    /* renamed from: L, reason: collision with root package name */
    SearchableInfo f10743L;

    /* renamed from: M, reason: collision with root package name */
    private Bundle f10744M;

    /* renamed from: N, reason: collision with root package name */
    private final Runnable f10745N;

    /* renamed from: O, reason: collision with root package name */
    private Runnable f10746O;

    /* renamed from: P, reason: collision with root package name */
    private final WeakHashMap f10747P;

    /* renamed from: Q, reason: collision with root package name */
    private final View.OnClickListener f10748Q;

    /* renamed from: R, reason: collision with root package name */
    View.OnKeyListener f10749R;

    /* renamed from: S, reason: collision with root package name */
    private final TextView.OnEditorActionListener f10750S;

    /* renamed from: T, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f10751T;

    /* renamed from: U, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f10752U;

    /* renamed from: V, reason: collision with root package name */
    private TextWatcher f10753V;

    /* renamed from: a, reason: collision with root package name */
    final SearchAutoComplete f10754a;

    /* renamed from: b, reason: collision with root package name */
    private final View f10755b;

    /* renamed from: c, reason: collision with root package name */
    private final View f10756c;

    /* renamed from: d, reason: collision with root package name */
    private final View f10757d;

    /* renamed from: e, reason: collision with root package name */
    final ImageView f10758e;

    /* renamed from: f, reason: collision with root package name */
    final ImageView f10759f;

    /* renamed from: g, reason: collision with root package name */
    final ImageView f10760g;

    /* renamed from: h, reason: collision with root package name */
    final ImageView f10761h;

    /* renamed from: i, reason: collision with root package name */
    private final View f10762i;

    /* renamed from: j, reason: collision with root package name */
    private p f10763j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f10764k;

    /* renamed from: l, reason: collision with root package name */
    private Rect f10765l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f10766m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f10767n;

    /* renamed from: o, reason: collision with root package name */
    private final ImageView f10768o;

    /* renamed from: p, reason: collision with root package name */
    private final Drawable f10769p;

    /* renamed from: q, reason: collision with root package name */
    private final int f10770q;

    /* renamed from: r, reason: collision with root package name */
    private final int f10771r;

    /* renamed from: s, reason: collision with root package name */
    private final Intent f10772s;

    /* renamed from: t, reason: collision with root package name */
    private final Intent f10773t;

    /* renamed from: u, reason: collision with root package name */
    private final CharSequence f10774u;

    /* renamed from: v, reason: collision with root package name */
    private m f10775v;

    /* renamed from: w, reason: collision with root package name */
    View.OnFocusChangeListener f10776w;

    /* renamed from: x, reason: collision with root package name */
    private View.OnClickListener f10777x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10778y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f10779z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        boolean f10780b;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f10780b + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeValue(Boolean.valueOf(this.f10780b));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10780b = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends C1254c {

        /* renamed from: a, reason: collision with root package name */
        private int f10781a;

        /* renamed from: b, reason: collision with root package name */
        private SearchView f10782b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10783c;

        /* renamed from: d, reason: collision with root package name */
        final Runnable f10784d;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC2405a.f36199m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            if (i4 < 600) {
                return (i4 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        void a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f10731W.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void c() {
            if (this.f10783c) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f10783c = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f10781a <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C1254c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f10783c) {
                removeCallbacks(this.f10784d);
                post(this.f10784d);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z4, int i4, Rect rect) {
            super.onFocusChanged(z4, i4, rect);
            this.f10782b.E();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
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
                        this.f10782b.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f10782b.hasFocus() && getVisibility() == 0) {
                this.f10783c = true;
                if (SearchView.r(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z4) {
                this.f10783c = false;
                removeCallbacks(this.f10784d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f10783c = true;
                    return;
                }
                this.f10783c = false;
                removeCallbacks(this.f10784d);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f10782b = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f10781a = i4;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f10784d = new a();
            this.f10781a = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            SearchView.this.D(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.K();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            L.a aVar = SearchView.this.f10732A;
            if (aVar instanceof T) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f10776w;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z4);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            SearchView.this.g();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f10758e) {
                searchView.A();
                return;
            }
            if (view == searchView.f10760g) {
                searchView.w();
                return;
            }
            if (view == searchView.f10759f) {
                searchView.B();
            } else if (view == searchView.f10761h) {
                searchView.F();
            } else if (view == searchView.f10754a) {
                searchView.m();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f10743L == null) {
                return false;
            }
            if (searchView.f10754a.isPopupShowing() && SearchView.this.f10754a.getListSelection() != -1) {
                return SearchView.this.C(view, i4, keyEvent);
            }
            if (SearchView.this.f10754a.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i4 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.u(0, null, searchView2.f10754a.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
            SearchView.this.B();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
            SearchView.this.x(i4, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
            SearchView.this.y(i4);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i4) {
            searchAutoComplete.setInputMethodMode(i4);
        }
    }

    public interface l {
    }

    public interface m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface n {
    }

    private static class o {

        /* renamed from: a, reason: collision with root package name */
        private Method f10796a;

        /* renamed from: b, reason: collision with root package name */
        private Method f10797b;

        /* renamed from: c, reason: collision with root package name */
        private Method f10798c;

        o() {
            this.f10796a = null;
            this.f10797b = null;
            this.f10798c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f10796a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f10797b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f10798c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f10797b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f10796a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f10798c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    private static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f10799a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f10800b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f10801c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f10802d;

        /* renamed from: e, reason: collision with root package name */
        private final int f10803e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f10804f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f10803e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f10800b = new Rect();
            this.f10802d = new Rect();
            this.f10801c = new Rect();
            a(rect, rect2);
            this.f10799a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f10800b.set(rect);
            this.f10802d.set(rect);
            Rect rect3 = this.f10802d;
            int i4 = this.f10803e;
            rect3.inset(-i4, -i4);
            this.f10801c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z4;
            boolean z5;
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z6 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z5 = this.f10804f;
                    if (z5 && !this.f10802d.contains(x4, y4)) {
                        z6 = z5;
                        z4 = false;
                    }
                } else {
                    if (action == 3) {
                        z5 = this.f10804f;
                        this.f10804f = false;
                    }
                    z4 = true;
                    z6 = false;
                }
                z6 = z5;
                z4 = true;
            } else {
                if (this.f10800b.contains(x4, y4)) {
                    this.f10804f = true;
                    z4 = true;
                }
                z4 = true;
                z6 = false;
            }
            if (!z6) {
                return false;
            }
            if (!z4 || this.f10801c.contains(x4, y4)) {
                Rect rect = this.f10801c;
                motionEvent.setLocation(x4 - rect.left, y4 - rect.top);
            } else {
                motionEvent.setLocation(this.f10799a.getWidth() / 2, this.f10799a.getHeight() / 2);
            }
            return this.f10799a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f10731W = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2405a.f36180G);
    }

    private void G() {
        post(this.f10745N);
    }

    private void H(int i4) {
        Editable text = this.f10754a.getText();
        Cursor b4 = this.f10732A.b();
        if (b4 == null) {
            return;
        }
        if (!b4.moveToPosition(i4)) {
            setQuery(text);
            return;
        }
        CharSequence c4 = this.f10732A.c(b4);
        if (c4 != null) {
            setQuery(c4);
        } else {
            setQuery(text);
        }
    }

    private void J() {
        boolean isEmpty = TextUtils.isEmpty(this.f10754a.getText());
        this.f10760g.setVisibility(!isEmpty || (this.f10778y && !this.f10741J) ? 0 : 8);
        Drawable drawable = this.f10760g.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void L() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f10754a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(o(queryHint));
    }

    private void M() {
        this.f10754a.setThreshold(this.f10743L.getSuggestThreshold());
        this.f10754a.setImeOptions(this.f10743L.getImeOptions());
        int inputType = this.f10743L.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f10743L.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f10754a.setInputType(inputType);
        L.a aVar = this.f10732A;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f10743L.getSuggestAuthority() != null) {
            T t4 = new T(getContext(), this, this.f10743L, this.f10747P);
            this.f10732A = t4;
            this.f10754a.setAdapter(t4);
            ((T) this.f10732A).x(this.f10735D ? 2 : 1);
        }
    }

    private void N() {
        this.f10757d.setVisibility((s() && (this.f10759f.getVisibility() == 0 || this.f10761h.getVisibility() == 0)) ? 0 : 8);
    }

    private void O(boolean z4) {
        this.f10759f.setVisibility((this.f10733B && s() && hasFocus() && (z4 || !this.f10738G)) ? 0 : 8);
    }

    private void P(boolean z4) {
        this.f10779z = z4;
        int i4 = 8;
        int i5 = z4 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f10754a.getText());
        this.f10758e.setVisibility(i5);
        O(!isEmpty);
        this.f10755b.setVisibility(z4 ? 8 : 0);
        if (this.f10768o.getDrawable() != null && !this.f10778y) {
            i4 = 0;
        }
        this.f10768o.setVisibility(i4);
        J();
        Q(isEmpty);
        N();
    }

    private void Q(boolean z4) {
        int i4 = 8;
        if (this.f10738G && !q() && z4) {
            this.f10759f.setVisibility(8);
            i4 = 0;
        }
        this.f10761h.setVisibility(i4);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC2408d.f36226e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC2408d.f36227f);
    }

    private Intent h(String str, Uri uri, String str2, String str3, int i4, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f10740I);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f10744M;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i4 != 0) {
            intent.putExtra("action_key", i4);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f10743L.getSearchActivity());
        return intent;
    }

    private Intent i(Cursor cursor, int i4, String str) {
        int i5;
        String o4;
        try {
            String o5 = T.o(cursor, "suggest_intent_action");
            if (o5 == null) {
                o5 = this.f10743L.getSuggestIntentAction();
            }
            if (o5 == null) {
                o5 = "android.intent.action.SEARCH";
            }
            String str2 = o5;
            String o6 = T.o(cursor, "suggest_intent_data");
            if (o6 == null) {
                o6 = this.f10743L.getSuggestIntentData();
            }
            if (o6 != null && (o4 = T.o(cursor, "suggest_intent_data_id")) != null) {
                o6 = o6 + "/" + Uri.encode(o4);
            }
            return h(str2, o6 == null ? null : Uri.parse(o6), T.o(cursor, "suggest_intent_extra_data"), T.o(cursor, "suggest_intent_query"), i4, str);
        } catch (RuntimeException e4) {
            try {
                i5 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i5 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i5 + " returned exception.", e4);
            return null;
        }
    }

    private Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f10744M;
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

    private Intent k(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void l() {
        this.f10754a.dismissDropDown();
    }

    private void n(View view, Rect rect) {
        view.getLocationInWindow(this.f10766m);
        getLocationInWindow(this.f10767n);
        int[] iArr = this.f10766m;
        int i4 = iArr[1];
        int[] iArr2 = this.f10767n;
        int i5 = i4 - iArr2[1];
        int i6 = iArr[0] - iArr2[0];
        rect.set(i6, i5, view.getWidth() + i6, view.getHeight() + i5);
    }

    private CharSequence o(CharSequence charSequence) {
        if (!this.f10778y || this.f10769p == null) {
            return charSequence;
        }
        int textSize = (int) (this.f10754a.getTextSize() * 1.25d);
        this.f10769p.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f10769p), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean p() {
        SearchableInfo searchableInfo = this.f10743L;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f10743L.getVoiceSearchLaunchWebSearch() ? this.f10772s : this.f10743L.getVoiceSearchLaunchRecognizer() ? this.f10773t : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean r(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean s() {
        return (this.f10733B || this.f10738G) && !q();
    }

    private void setQuery(CharSequence charSequence) {
        this.f10754a.setText(charSequence);
        this.f10754a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private void t(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e4) {
            Log.e("SearchView", "Failed launch activity: " + intent, e4);
        }
    }

    private boolean v(int i4, int i5, String str) {
        Cursor b4 = this.f10732A.b();
        if (b4 == null || !b4.moveToPosition(i4)) {
            return false;
        }
        t(i(b4, i5, str));
        return true;
    }

    void A() {
        P(false);
        this.f10754a.requestFocus();
        this.f10754a.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f10777x;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void B() {
        Editable text = this.f10754a.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f10775v;
        if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
            if (this.f10743L != null) {
                u(0, null, text.toString());
            }
            this.f10754a.setImeVisibility(false);
            l();
        }
    }

    boolean C(View view, int i4, KeyEvent keyEvent) {
        if (this.f10743L != null && this.f10732A != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i4 == 66 || i4 == 84 || i4 == 61) {
                return x(this.f10754a.getListSelection(), 0, null);
            }
            if (i4 == 21 || i4 == 22) {
                this.f10754a.setSelection(i4 == 21 ? 0 : this.f10754a.length());
                this.f10754a.setListSelection(0);
                this.f10754a.clearListSelection();
                this.f10754a.a();
                return true;
            }
            if (i4 == 19) {
                this.f10754a.getListSelection();
                return false;
            }
        }
        return false;
    }

    void D(CharSequence charSequence) {
        Editable text = this.f10754a.getText();
        this.f10740I = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        O(!isEmpty);
        Q(isEmpty);
        J();
        N();
        if (this.f10775v != null && !TextUtils.equals(charSequence, this.f10739H)) {
            this.f10775v.onQueryTextChange(charSequence.toString());
        }
        this.f10739H = charSequence.toString();
    }

    void E() {
        P(q());
        G();
        if (this.f10754a.hasFocus()) {
            m();
        }
    }

    void F() {
        SearchableInfo searchableInfo = this.f10743L;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(k(this.f10772s, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(j(this.f10773t, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void I(CharSequence charSequence, boolean z4) {
        this.f10754a.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f10754a;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f10740I = charSequence;
        }
        if (!z4 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        B();
    }

    void K() {
        int[] iArr = this.f10754a.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f10756c.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f10757d.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // androidx.appcompat.view.c
    public void b() {
        if (this.f10741J) {
            return;
        }
        this.f10741J = true;
        int imeOptions = this.f10754a.getImeOptions();
        this.f10742K = imeOptions;
        this.f10754a.setImeOptions(imeOptions | 33554432);
        this.f10754a.setText("");
        setIconified(false);
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        I("", false);
        clearFocus();
        P(true);
        this.f10754a.setImeOptions(this.f10742K);
        this.f10741J = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f10736E = true;
        super.clearFocus();
        this.f10754a.clearFocus();
        this.f10754a.setImeVisibility(false);
        this.f10736E = false;
    }

    void g() {
        if (this.f10762i.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f10756c.getPaddingLeft();
            Rect rect = new Rect();
            boolean b4 = k0.b(this);
            int dimensionPixelSize = this.f10778y ? resources.getDimensionPixelSize(AbstractC2408d.f36224c) + resources.getDimensionPixelSize(AbstractC2408d.f36225d) : 0;
            this.f10754a.getDropDownBackground().getPadding(rect);
            this.f10754a.setDropDownHorizontalOffset(b4 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f10754a.setDropDownWidth((((this.f10762i.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public int getImeOptions() {
        return this.f10754a.getImeOptions();
    }

    public int getInputType() {
        return this.f10754a.getInputType();
    }

    public int getMaxWidth() {
        return this.f10737F;
    }

    public CharSequence getQuery() {
        return this.f10754a.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f10734C;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f10743L;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f10774u : getContext().getText(this.f10743L.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f10771r;
    }

    int getSuggestionRowLayout() {
        return this.f10770q;
    }

    public L.a getSuggestionsAdapter() {
        return this.f10732A;
    }

    void m() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f10754a);
            return;
        }
        o oVar = f10731W;
        oVar.b(this.f10754a);
        oVar.a(this.f10754a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f10745N);
        post(this.f10746O);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.J, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            n(this.f10754a, this.f10764k);
            Rect rect = this.f10765l;
            Rect rect2 = this.f10764k;
            rect.set(rect2.left, 0, rect2.right, i7 - i5);
            p pVar = this.f10763j;
            if (pVar != null) {
                pVar.a(this.f10765l, this.f10764k);
                return;
            }
            p pVar2 = new p(this.f10765l, this.f10764k, this.f10754a);
            this.f10763j = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.J, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        if (q()) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f10737F;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f10737F;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f10737F) > 0) {
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
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        P(savedState.f10780b);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10780b = q();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        G();
    }

    public boolean q() {
        return this.f10779z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i4, Rect rect) {
        if (this.f10736E || !isFocusable()) {
            return false;
        }
        if (q()) {
            return super.requestFocus(i4, rect);
        }
        boolean requestFocus = this.f10754a.requestFocus(i4, rect);
        if (requestFocus) {
            P(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f10744M = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            w();
        } else {
            A();
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.f10778y == z4) {
            return;
        }
        this.f10778y = z4;
        P(z4);
        L();
    }

    public void setImeOptions(int i4) {
        this.f10754a.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f10754a.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f10737F = i4;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f10776w = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f10775v = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f10777x = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f10734C = charSequence;
        L();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.f10735D = z4;
        L.a aVar = this.f10732A;
        if (aVar instanceof T) {
            ((T) aVar).x(z4 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f10743L = searchableInfo;
        if (searchableInfo != null) {
            M();
            L();
        }
        boolean p4 = p();
        this.f10738G = p4;
        if (p4) {
            this.f10754a.setPrivateImeOptions("nm");
        }
        P(q());
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f10733B = z4;
        P(q());
    }

    public void setSuggestionsAdapter(L.a aVar) {
        this.f10732A = aVar;
        this.f10754a.setAdapter(aVar);
    }

    void u(int i4, String str, String str2) {
        getContext().startActivity(h("android.intent.action.SEARCH", null, null, str2, i4, str));
    }

    void w() {
        if (!TextUtils.isEmpty(this.f10754a.getText())) {
            this.f10754a.setText("");
            this.f10754a.requestFocus();
            this.f10754a.setImeVisibility(true);
        } else if (this.f10778y) {
            clearFocus();
            P(true);
        }
    }

    boolean x(int i4, int i5, String str) {
        v(i4, 0, null);
        this.f10754a.setImeVisibility(false);
        l();
        return true;
    }

    boolean y(int i4) {
        H(i4);
        return true;
    }

    protected void z(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f10764k = new Rect();
        this.f10765l = new Rect();
        this.f10766m = new int[2];
        this.f10767n = new int[2];
        this.f10745N = new b();
        this.f10746O = new c();
        this.f10747P = new WeakHashMap();
        f fVar = new f();
        this.f10748Q = fVar;
        this.f10749R = new g();
        h hVar = new h();
        this.f10750S = hVar;
        i iVar = new i();
        this.f10751T = iVar;
        j jVar = new j();
        this.f10752U = jVar;
        this.f10753V = new a();
        Z v4 = Z.v(context, attributeSet, e.j.f36498f2, i4, 0);
        AbstractC1281a0.m0(this, context, e.j.f36498f2, attributeSet, v4.r(), i4, 0);
        LayoutInflater.from(context).inflate(v4.n(e.j.f36548p2, e.g.f36339r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(e.f.f36283D);
        this.f10754a = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f10755b = findViewById(e.f.f36321z);
        View findViewById = findViewById(e.f.f36282C);
        this.f10756c = findViewById;
        View findViewById2 = findViewById(e.f.f36289J);
        this.f10757d = findViewById2;
        ImageView imageView = (ImageView) findViewById(e.f.f36319x);
        this.f10758e = imageView;
        ImageView imageView2 = (ImageView) findViewById(e.f.f36280A);
        this.f10759f = imageView2;
        ImageView imageView3 = (ImageView) findViewById(e.f.f36320y);
        this.f10760g = imageView3;
        ImageView imageView4 = (ImageView) findViewById(e.f.f36284E);
        this.f10761h = imageView4;
        ImageView imageView5 = (ImageView) findViewById(e.f.f36281B);
        this.f10768o = imageView5;
        AbstractC1281a0.s0(findViewById, v4.g(e.j.f36553q2));
        AbstractC1281a0.s0(findViewById2, v4.g(e.j.f36573u2));
        imageView.setImageDrawable(v4.g(e.j.f36568t2));
        imageView2.setImageDrawable(v4.g(e.j.f36538n2));
        imageView3.setImageDrawable(v4.g(e.j.f36523k2));
        imageView4.setImageDrawable(v4.g(e.j.f36583w2));
        imageView5.setImageDrawable(v4.g(e.j.f36568t2));
        this.f10769p = v4.g(e.j.f36563s2);
        e0.a(imageView, getResources().getString(e.h.f36355n));
        this.f10770q = v4.n(e.j.f36578v2, e.g.f36338q);
        this.f10771r = v4.n(e.j.f36528l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f10753V);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f10749R);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v4.a(e.j.f36543o2, true));
        int f4 = v4.f(e.j.f36508h2, -1);
        if (f4 != -1) {
            setMaxWidth(f4);
        }
        this.f10774u = v4.p(e.j.f36533m2);
        this.f10734C = v4.p(e.j.f36558r2);
        int k4 = v4.k(e.j.f36518j2, -1);
        if (k4 != -1) {
            setImeOptions(k4);
        }
        int k5 = v4.k(e.j.f36513i2, -1);
        if (k5 != -1) {
            setInputType(k5);
        }
        setFocusable(v4.a(e.j.f36503g2, true));
        v4.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f10772s = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f10773t = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f10762i = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        P(this.f10778y);
        L();
    }
}
