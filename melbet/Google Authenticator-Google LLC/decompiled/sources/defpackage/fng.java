package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView$Behavior;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fng extends FrameLayout implements tv, fke {
    private final boolean A;
    private final boolean B;
    private Map C;
    private final ViewTreeObserver.OnTouchModeChangeListener D;
    private final iyi E;
    final View a;
    final ClippableRoundedCornerLayout b;
    final View c;
    public final View d;
    final FrameLayout e;
    final FrameLayout f;
    final MaterialToolbar g;
    final Toolbar h;
    final TextView i;
    public final TextView j;
    public final EditText k;
    public final ImageButton l;
    final View m;
    final TouchObserverFrameLayout n;
    public fmt o;
    public boolean p;
    public boolean q;
    public int r;
    private final boolean s;
    private final fnr t;
    private final boolean u;
    private final fhs v;
    private final Set w;
    private int x;
    private boolean y;
    private final int z;

    public fng(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, R.style.Widget_Material3_SearchView), attributeSet, i);
        this.E = new iyi(this);
        this.w = new LinkedHashSet();
        this.x = 16;
        this.r = 2;
        this.D = new fnd(this);
        Context context2 = getContext();
        TypedArray a = fjw.a(context2, attributeSet, fmr.b, i, R.style.Widget_Material3_SearchView, new int[0]);
        this.z = a.getColor(11, 0);
        int resourceId = a.getResourceId(18, -1);
        int resourceId2 = a.getResourceId(0, -1);
        String string = a.getString(3);
        String string2 = a.getString(4);
        String string3 = a.getString(26);
        boolean z = a.getBoolean(29, false);
        this.p = a.getBoolean(8, true);
        this.q = a.getBoolean(7, true);
        boolean z2 = a.getBoolean(19, false);
        this.y = a.getBoolean(9, true);
        this.u = a.getBoolean(10, true);
        boolean z3 = a.getBoolean(16, true);
        this.A = z3;
        boolean z4 = a.getBoolean(14, false);
        this.B = z4;
        a.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.s = true;
        this.a = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.b = clippableRoundedCornerLayout;
        this.c = findViewById(R.id.open_search_view_background);
        View findViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.d = findViewById;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.e = frameLayout;
        this.f = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.g = materialToolbar;
        Toolbar toolbar = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.h = toolbar;
        TextView textView = (TextView) findViewById(R.id.open_search_view_dummy_text_view);
        this.j = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.i = textView2;
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.k = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.l = imageButton;
        View findViewById2 = findViewById(R.id.open_search_view_divider);
        this.m = findViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.n = touchObserverFrameLayout;
        this.t = new fnr(context2, this, z4);
        this.v = new fhs(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new fnc());
        k();
        if (resourceId != -1) {
            frameLayout.addView(LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
        textView2.setText(string3);
        textView2.setVisibility(true != TextUtils.isEmpty(string3) ? 0 : 8);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        editText.setOnFocusChangeListener(new fmz());
        byte[] bArr = null;
        if (z2) {
            materialToolbar.q(null);
        } else {
            materialToolbar.r(new cx(this, 11, null));
            if (z) {
                eo eoVar = new eo(getContext());
                eoVar.a(fhq.c(this, R.attr.colorOnSurface));
                materialToolbar.q(eoVar);
            }
        }
        imageButton.setOnClickListener(new cx(this, 12, null));
        editText.addTextChangedListener(new brf(this, 4));
        findViewById2.setVisibility(true != z3 ? 8 : 0);
        touchObserverFrameLayout.a = new drk(this, 3);
        fik.g(materialToolbar, new fka() { // from class: fnb
            @Override // defpackage.fka
            public final void a(View view, zz zzVar, fkb fkbVar) {
                MaterialToolbar materialToolbar2 = fng.this.g;
                boolean i2 = fik.i(materialToolbar2);
                int i3 = i2 ? fkbVar.c : fkbVar.a;
                int i4 = i2 ? fkbVar.a : fkbVar.c;
                vb f = zzVar.f(647);
                materialToolbar2.setPadding(i3 + f.b, fkbVar.b, i4 + f.d, fkbVar.d);
            }
        });
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        final int i2 = marginLayoutParams.leftMargin;
        final int i3 = marginLayoutParams.rightMargin;
        xq xqVar = new xq() { // from class: fna
            @Override // defpackage.xq
            public final zz a(View view, zz zzVar) {
                vb f = zzVar.f(647);
                int i4 = f.b;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i2 + i4;
                marginLayoutParams2.rightMargin = i3 + f.d;
                return zzVar;
            }
        };
        int i4 = yq.a;
        yi.c(findViewById2, xqVar);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        f(identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0);
        yi.c(findViewById, new tu(this, 4, bArr));
        materialToolbar.setTouchscreenBlocksFocus(false);
        if (z4) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) toolbar.getLayoutParams();
            layoutParams.gravity = 8388611;
            toolbar.setLayoutParams(layoutParams);
            toolbar.setVisibility(4);
            if (resourceId2 != -1) {
                textView.setTextAppearance(resourceId2);
            }
            textView.setText(string);
            textView.setHint(string2);
        }
    }

    private final void k() {
        float dimension;
        fmt fmtVar = this.o;
        if (fmtVar != null) {
            fob fobVar = fmtVar.G;
            dimension = fobVar != null ? fobVar.u() : fmtVar.getElevation();
        } else {
            dimension = getResources().getDimension(R.dimen.m3_searchview_elevation);
        }
        l(dimension);
    }

    private final void l(float f) {
        View view;
        fhs fhsVar = this.v;
        if (fhsVar == null || (view = this.c) == null) {
            return;
        }
        view.setBackgroundColor(fhsVar.b(this.z, f));
    }

    private final void m(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.b.getId()) != null) {
                    m((ViewGroup) childAt, z);
                } else {
                    Map map = this.C;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.C.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    private final void n() {
        ImageButton b = fjx.b(this.g);
        if (b == null) {
            return;
        }
        int i = this.b.getVisibility() == 0 ? 1 : 0;
        Drawable k = pj.k(b.getDrawable());
        if (k instanceof eo) {
            ((eo) k).b(i);
        }
        if (k instanceof fis) {
            ((fis) k).a(i);
        }
    }

    private final boolean o() {
        int i = this.r;
        if (i != 0) {
            return i == 2 || i == 1;
        }
        throw null;
    }

    private final void p(int i) {
        if (this.o == null || !this.u) {
            return;
        }
        if (i == 0) {
            throw null;
        }
        if (i == 4) {
            this.E.p(false);
        } else if (i == 2) {
            this.E.q();
        }
    }

    private final void q(int i) {
        if (i == 4) {
            e(true);
        } else if (i == 2) {
            e(false);
        }
    }

    @Override // defpackage.fke
    public final void M() {
        if (o() || this.o == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        fnr fnrVar = this.t;
        fnrVar.n.f(fnrVar.p);
        AnimatorSet animatorSet = fnrVar.o;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        fnrVar.o = null;
    }

    @Override // defpackage.fke
    public final void O() {
        long totalDuration;
        if (o()) {
            return;
        }
        fnr fnrVar = this.t;
        fkm fkmVar = fnrVar.n;
        mx c = fkmVar.c();
        if (Build.VERSION.SDK_INT < 34 || this.o == null || c == null) {
            c();
            return;
        }
        totalDuration = fnrVar.h().getTotalDuration();
        AnimatorSet e = fkmVar.e(fnrVar.p);
        e.setDuration(totalDuration);
        e.start();
        fkmVar.g();
        if (fnrVar.o != null) {
            fnrVar.r.f();
            fnrVar.o.resume();
        }
        fnrVar.o = null;
    }

    @Override // defpackage.fke
    public final void T(mx mxVar) {
        fmt fmtVar;
        if (o() || (fmtVar = this.o) == null) {
            return;
        }
        if (!this.B) {
            fmtVar.H(this.k.getText().toString());
        }
        fnr fnrVar = this.t;
        fmt fmtVar2 = fnrVar.p;
        fkm fkmVar = fnrVar.n;
        fkmVar.e = mxVar;
        float f = mxVar.a;
        View view = fkmVar.a;
        fkmVar.g = fik.j(view);
        if (fmtVar2 != null) {
            fkmVar.h = fik.d(view, fmtVar2);
        }
        fkmVar.f = f;
    }

    @Override // defpackage.fke
    public final void V(mx mxVar) {
        if (o() || this.o == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        fnr fnrVar = this.t;
        float f = mxVar.b;
        if (f > 0.0f) {
            fkm fkmVar = fnrVar.n;
            fmt fmtVar = fnrVar.p;
            fkmVar.h(mxVar, fmtVar, fmtVar.D());
            AnimatorSet animatorSet = fnrVar.o;
            if (animatorSet != null) {
                animatorSet.setCurrentPlayTime((long) (f * animatorSet.getDuration()));
                return;
            }
            fng fngVar = fnrVar.a;
            if (fngVar.i()) {
                fnrVar.j.clearFocus();
            }
            if (fngVar.p) {
                fnrVar.o = fnrVar.e(false);
                fnrVar.o.start();
                fnrVar.o.pause();
            }
        }
    }

    @Override // defpackage.tv
    public final tw a() {
        return new SearchView$Behavior();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.s) {
            this.n.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    protected int b() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public final void c() {
        int i = this.r;
        if (i == 0) {
            throw null;
        }
        if (i == 2 || i == 1) {
            return;
        }
        fmt fmtVar = this.o;
        if (fmtVar == null || !fmtVar.isAttachedToWindow()) {
            this.t.h();
            return;
        }
        if (!this.B) {
            this.o.H(this.k.getText().toString());
        }
        fmt fmtVar2 = this.o;
        fnr fnrVar = this.t;
        fnrVar.getClass();
        fmtVar2.post(new evp(fnrVar, 17));
    }

    public final void d() {
        if (this.y) {
            this.k.postDelayed(new evp(this, 18), 100L);
        } else {
            if (isInTouchMode()) {
                return;
            }
            this.k.postDelayed(new evp(this, 20), 100L);
        }
    }

    public final void e(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.C = new HashMap(viewGroup.getChildCount());
        }
        m(viewGroup, z);
        if (z) {
            return;
        }
        this.C = null;
    }

    public final void f(int i) {
        View view = this.d;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    public final void g(fmt fmtVar) {
        this.o = fmtVar;
        this.t.p = fmtVar;
        if (fmtVar != null) {
            fmtVar.setOnClickListener(new cx(this, 13, null));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    fmtVar.setHandwritingDelegatorCallback(new evp(this, 19));
                    this.k.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.g;
        if (materialToolbar != null && !(pj.k(materialToolbar.e()) instanceof eo)) {
            int b = b();
            if (this.o == null) {
                materialToolbar.q(e.f(materialToolbar.getContext(), b));
            } else {
                Drawable mutate = e.f(getContext(), b).mutate();
                Integer num = materialToolbar.z;
                if (num != null) {
                    mutate.setTint(num.intValue());
                }
                mutate.setLayoutDirection(getLayoutDirection());
                materialToolbar.q(new fis(this.o.e(), mutate));
                n();
            }
        }
        k();
        p(this.r);
    }

    public final void h() {
        int i = this.r;
        if (i == 0) {
            throw null;
        }
        if (i != 4) {
            int i2 = 3;
            if (i == 3) {
                return;
            }
            fnr fnrVar = this.t;
            fnrVar.j();
            if (fnrVar.p == null) {
                fng fngVar = fnrVar.a;
                if (fngVar.i()) {
                    fngVar.postDelayed(new fnh(fngVar, 2), 150L);
                }
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = fnrVar.c;
                clippableRoundedCornerLayout.setVisibility(4);
                clippableRoundedCornerLayout.post(new fnh(fnrVar, i2));
                return;
            }
            fng fngVar2 = fnrVar.a;
            if (fngVar2.i()) {
                fngVar2.d();
            }
            fngVar2.j(3, true);
            fnrVar.r.e();
            EditText editText = fnrVar.j;
            editText.setText(fnrVar.p.G());
            editText.setSelection(editText.getText().length());
            ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = fnrVar.c;
            clippableRoundedCornerLayout2.setVisibility(4);
            clippableRoundedCornerLayout2.post(new fnh(fnrVar, 0));
        }
    }

    public final boolean i() {
        return this.x == 48;
    }

    public final void j(int i, boolean z) {
        int i2 = this.r;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == i) {
            return;
        }
        if (z) {
            q(i);
        }
        this.r = i;
        Iterator it = new LinkedHashSet(this.w).iterator();
        while (it.hasNext()) {
            ((fnf) it.next()).a();
        }
        p(i);
        fmt fmtVar = this.o;
        if (fmtVar == null || i != 2) {
            return;
        }
        fmtVar.sendAccessibilityEvent(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fhq.x(this);
        int i = this.r;
        q(i);
        p(i);
        getViewTreeObserver().addOnTouchModeChangeListener(this.D);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e(false);
        this.E.q();
        getViewTreeObserver().removeOnTouchModeChangeListener(this.D);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        Activity a = fik.a(getContext());
        Window window = a == null ? null : a.getWindow();
        if (window != null) {
            this.x = window.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fne)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fne fneVar = (fne) parcelable;
        super.onRestoreInstanceState(fneVar.d);
        String str = fneVar.a;
        this.k.setText(str);
        this.j.setText(str);
        int i = fneVar.b;
        boolean z = i == 0;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(i == 0 ? 0 : 8);
        n();
        j(z ? 4 : 2, z2 != z);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        fne fneVar = new fne(super.onSaveInstanceState());
        Editable text = this.k.getText();
        fneVar.a = text == null ? null : text.toString();
        fneVar.b = this.b.getVisibility();
        return fneVar;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        l(f);
    }

    public fng(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public fng(Context context) {
        this(context, null);
    }
}
