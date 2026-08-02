package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.common.LockableNestedScrollView;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eea extends FrameLayout implements efw {
    public static final String a = "eea";
    private boolean B;
    private int C;
    private final boolean D;
    private final float E;
    private final float F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private final View L;
    private final ViewGroup M;
    private final ViewGroup N;
    private final LockableNestedScrollView O;
    private final View P;
    private final OverScrollControlledNestedScrollView Q;
    private final View R;
    private final View S;
    private final View T;
    private final View U;
    private final View V;
    private final fob W;
    private final fob aa;
    private final fob ab;
    private final gzp ac;
    private final ns ad;
    private final FrameLayout ae;
    private final fhs af;
    private final TextView ag;
    private final Rect ah;
    private final boolean ai;
    private gzp aj;
    private int ak;
    public boolean b;
    public boolean c;
    public boolean d;
    public eed e;
    public final edg f;
    public final View g;
    public final RecyclerView h;
    public final RecyclerView i;
    public final SelectedAccountView j;
    public final Button k;
    public final ViewGroup l;
    public final MaterialCardView m;
    public final ViewGroup n;
    public final TextView o;
    public Button p;
    public Button q;
    public edb r;
    public edb s;
    public eeh t;
    public nw u;
    public AnimatorSet v;
    public final dja w;
    public dih x;
    private static final Property y = Property.of(View.class, Float.class, "alpha");
    private static final Property z = Property.of(fob.class, Integer.class, "alpha");
    private static final Interpolator A = new PathInterpolator(0.54f, 0.01f, 0.61f, 0.99f);

    public eea(Context context, eel eelVar) {
        super(new ContextThemeWrapper(context, eelVar.c()), null, 0);
        int dimensionPixelSize;
        this.ad = new edt(this);
        this.ah = new Rect();
        this.aj = gyf.a;
        this.ak = 0;
        this.w = new edw(this);
        setId(R.id.express_sign_in_layout_internal);
        if (!dih.ab(getContext())) {
            throw new IllegalStateException("ExpressSignInLayout has to be used with a Google Material theme");
        }
        LayoutInflater.from(getContext()).inflate(R.layout.express_sign_in_layout, this);
        boolean c = ecy.c(getContext());
        this.ai = c;
        gzp f = eelVar.f(getContext());
        this.ac = f;
        this.af = new fhs(getContext());
        Context context2 = getContext();
        edg edgVar = new edg(dih.an(context2, R.attr.ogContentContainerPaddingTop), dih.an(context2, R.attr.ogContainerExternalHorizontalSpacing), dih.an(context2, R.attr.ogContainerInternalAdditionalHorizontalSpacing), dih.ao(context2, R.attr.ogDialogCornerRadius).getDimension(context2.getResources().getDisplayMetrics()), dih.am(context2, R.attr.ogImportantBoxBackgroundColor), dih.an(context2, R.attr.ogImportantBoxCornerRadius), dih.an(context2, R.attr.ogImportantBoxMarginTop), dih.an(context2, R.attr.ogDialogMarginBottom), dih.an(context2, R.attr.ogLegalDisclaimerBottomPadding), dih.an(context2, R.attr.ogLegalDisclaimerTopPadding), dih.an(context2, R.attr.ogSelectedAccountViewMarginVertical));
        this.f = edgVar;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.J = getResources().getColor(true != c ? R.color.og_elevation_shadow_color_dark : R.color.og_elevation_shadow_color_light);
        this.E = dih.Z(displayMetrics, true != c ? 5 : 8);
        float Z = dih.Z(displayMetrics, true != c ? 3 : 8);
        this.F = Z;
        this.G = dih.aa(displayMetrics, 20);
        this.H = dih.aa(displayMetrics, 8);
        this.I = dih.aa(displayMetrics, 6);
        boolean g = eelVar.g();
        this.D = g;
        this.g = findViewById(R.id.scrim_view);
        View findViewById = findViewById(R.id.fake_scrim_view);
        this.L = findViewById;
        SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account);
        this.j = selectedAccountView;
        this.m = (MaterialCardView) findViewById(R.id.important_box_card_view);
        selectedAccountView.m.setDuration(150L);
        Interpolator interpolator = A;
        selectedAccountView.m.setInterpolator(interpolator);
        this.h = (RecyclerView) findViewById(R.id.accounts_list);
        this.i = (RecyclerView) findViewById(R.id.account_management_actions_list);
        View findViewById2 = findViewById(R.id.og_selected_account_to_account_management_divider);
        this.V = findViewById2;
        if (g) {
            dimensionPixelSize = 0;
        } else {
            Resources resources = getContext().getResources();
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_padding_start);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_margin);
            dimensionPixelSize = dimensionPixelSize2 + dimensionPixelSize3 + dimensionPixelSize3 + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_size) + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_title_margin_start) + edgVar.c;
        }
        this.K = dimensionPixelSize;
        D(dimensionPixelSize);
        this.k = (Button) findViewById(R.id.sign_in_button);
        this.p = (Button) findViewById(R.id.continue_as_button);
        this.q = (Button) findViewById(R.id.secondary_action_button);
        this.M = (ViewGroup) findViewById(R.id.main_container);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content_container);
        this.N = viewGroup;
        LockableNestedScrollView lockableNestedScrollView = (LockableNestedScrollView) findViewById(R.id.scrollable_container);
        this.O = lockableNestedScrollView;
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.footer_container);
        this.l = viewGroup2;
        this.P = findViewById(R.id.header_container);
        View findViewById3 = findViewById(R.id.selected_account_container);
        this.R = findViewById3;
        this.S = findViewById(R.id.selected_account_top_inset_spacing);
        this.T = findViewById(R.id.accounts_content_container);
        this.n = (ViewGroup) findViewById(R.id.progress_container);
        TextView textView = (TextView) findViewById(R.id.choose_an_account_a11y);
        this.ag = textView;
        this.o = (TextView) findViewById(R.id.disclaimer_text);
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = (OverScrollControlledNestedScrollView) findViewById(R.id.og_account_management_container);
        this.Q = overScrollControlledNestedScrollView;
        View findViewById4 = findViewById(R.id.account_management_list_container);
        this.U = findViewById4;
        fob x = x();
        x.L(Z);
        x.bz(y(edgVar.a(), true));
        if (!edgVar.a()) {
            x.W();
        }
        this.aa = x;
        lockableNestedScrollView.setBackgroundDrawable(x);
        viewGroup.setLayoutTransition(t());
        ViewGroup viewGroup3 = (ViewGroup) findViewById4.getParent();
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setAnimator(2, null);
        layoutTransition.setAnimator(3, ValueAnimator.ofInt(0));
        layoutTransition.setStartDelay(1, 0L);
        viewGroup3.setLayoutTransition(layoutTransition);
        ((ViewGroup) findViewById3).setLayoutTransition(t());
        fob x2 = x();
        this.W = x2;
        x2.bz(y(false, true));
        findViewById3.setBackgroundDrawable(x2);
        if (f.f()) {
            x2.setAlpha(0);
            findViewById2.setBackgroundColor(((Integer) f.b()).intValue());
        }
        fob x3 = x();
        this.ab = x3;
        x3.W();
        viewGroup2.setBackgroundDrawable(x3);
        x2.O(Z);
        x3.O(Z);
        overScrollControlledNestedScrollView.d = new abi() { // from class: edn
            @Override // defpackage.abi
            public final void a(NestedScrollView nestedScrollView, int i) {
                eea.this.n();
            }
        };
        overScrollControlledNestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new gu(this, 5));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.ae = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        findViewById.setVisibility(8);
        findViewById(R.id.esi_custom_header_separator).setVisibility(true != g ? 0 : 8);
        yq.l(textView, new doz());
        yq.n(textView, getResources().getString(R.string.og_account_picker_dialog_a11y));
        if (J()) {
            dih.T(this);
        }
        I(getResources().getConfiguration());
    }

    private final void A() {
        this.m.setVisibility(0);
        this.k.setVisibility(8);
        this.p.setVisibility(0);
        F(this.b, true);
        K();
        H(false);
    }

    private final void B(boolean z2) {
        if (this.B == z2) {
            return;
        }
        this.B = z2;
        fob fobVar = this.aa;
        if (fobVar.w() > 0.0f) {
            heg hegVar = new heg(4);
            fob fobVar2 = this.W;
            Object[] objArr = new Animator[2];
            int i = true != z2 ? 0 : 255;
            objArr[0] = ObjectAnimator.ofInt(fobVar2, (Property<fob, Integer>) z, 255 - i, i).setDuration(150L);
            MaterialCardView materialCardView = this.m;
            edg edgVar = this.f;
            float f = edgVar.f;
            float f2 = true != z2 ? f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f - f2, f2);
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new mu(materialCardView, 7, null));
            objArr[1] = ofFloat;
            hegVar.i(objArr);
            if (!edgVar.a()) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(true != z2 ? 1.0f : 0.0f);
                ofFloat2.setDuration(100L);
                ofFloat2.setStartDelay(true != z2 ? 0L : 50L);
                ofFloat2.addUpdateListener(new edm((Object) fobVar, fobVar2, r3));
                hegVar.h(ofFloat2);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(hegVar.g());
            animatorSet.addListener(new edy(this, z2));
            animatorSet.start();
        }
        if (((ViewGroup.MarginLayoutParams) this.M.getLayoutParams()).topMargin == 0) {
            this.S.setVisibility(true != z2 ? 8 : 0);
            dih.U(this, z2, this.ai);
        }
        ViewGroup viewGroup = this.N;
        int i2 = true != z2 ? -2 : -1;
        viewGroup.getLayoutParams().height = i2;
        LockableNestedScrollView lockableNestedScrollView = this.O;
        lockableNestedScrollView.getLayoutParams().height = i2;
        lockableNestedScrollView.h = !z2;
        View view = this.P;
        int i3 = true != z2 ? 0 : 8;
        view.setVisibility(i3);
        if (this.ac.f()) {
            this.V.setVisibility(i3);
        }
        ((ViewGroup.MarginLayoutParams) this.m.getLayoutParams()).topMargin = z2 ? 0 : this.f.g;
        D(z2 ? 0 : this.K);
        k(viewGroup, z2 ? 0 : this.f.a);
    }

    private static void C(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i);
        view.setLayoutParams(marginLayoutParams);
    }

    private final void D(int i) {
        if (this.D) {
            return;
        }
        View view = this.V;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.setMarginStart(i);
        view.setLayoutParams(marginLayoutParams);
    }

    private final void E() {
        if (this.m.getVisibility() == 0) {
            z();
        } else {
            A();
        }
    }

    private final void F(boolean z2, boolean z3) {
        this.ag.setVisibility(true != (dih.X(getContext()) && !z2 && z3) ? 8 : 0);
    }

    private final void G(float f, fob fobVar, View view) {
        int visibility = this.U.getVisibility();
        int i = yq.a;
        if (visibility == 8) {
            f = 0.0f;
        }
        float f2 = this.E * f;
        view.setElevation(f2);
        gzp gzpVar = this.ac;
        if (gzpVar.f()) {
            fobVar.M(ColorStateList.valueOf(this.af.a(((Integer) gzpVar.b()).intValue(), f)));
        } else {
            fobVar.L(f2);
        }
    }

    private final void H(boolean z2) {
        this.ab.bz(y(this.f.a(), z2));
    }

    private final void I(Configuration configuration) {
        ViewGroup viewGroup = this.M;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (configuration == null || layoutParams == null) {
            return;
        }
        if (configuration.smallestScreenWidthDp >= 600) {
            layoutParams.width = dih.aa(getResources().getDisplayMetrics(), 540);
        } else {
            layoutParams.width = -1;
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    private final boolean J() {
        return !this.f.a();
    }

    private final void K() {
        this.o.setVisibility(8);
        findViewById(R.id.disclaimer_separator).setVisibility(8);
        findViewById(R.id.footer_bottom_padding).setVisibility(0);
    }

    static jnu a() {
        jkj k = jnu.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        jnu jnuVar = (jnu) jkpVar;
        jnuVar.d = 9;
        jnuVar.b |= 2;
        if (!jkpVar.M()) {
            k.t();
        }
        jkp jkpVar2 = k.b;
        jnu jnuVar2 = (jnu) jkpVar2;
        jnuVar2.f = 2;
        jnuVar2.b |= 32;
        if (!jkpVar2.M()) {
            k.t();
        }
        jnu jnuVar3 = (jnu) k.b;
        jnuVar3.e = 3;
        jnuVar3.b |= 8;
        return (jnu) k.q();
    }

    public static void j(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void k(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void l(RecyclerView recyclerView, kr krVar) {
        recyclerView.getContext();
        recyclerView.Y(new LinearLayoutManager(1));
        abb abbVar = new abb(recyclerView, krVar, 3);
        int i = yq.a;
        if (recyclerView.isAttachedToWindow()) {
            abbVar.onViewAttachedToWindow(recyclerView);
        }
        recyclerView.addOnAttachStateChangeListener(abbVar);
    }

    private final int r() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = this.l;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), 1073741824), makeMeasureSpec);
        j(this.T, viewGroup.getMeasuredHeight());
        ViewGroup viewGroup2 = this.N;
        viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(viewGroup2.getMeasuredWidth(), 1073741824), makeMeasureSpec);
        return viewGroup2.getMeasuredHeight() + this.f.h;
    }

    private static AnimatorSet s(Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(animatorListener);
        return animatorSet;
    }

    private static LayoutTransition t() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        Interpolator interpolator = A;
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.enableTransitionType(4);
        layoutTransition.setStartDelay(1, 0L);
        return layoutTransition;
    }

    private static ObjectAnimator u(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) y, 0.0f, 1.0f);
    }

    private static ObjectAnimator v(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) y, 1.0f, 0.0f);
    }

    private static ObjectAnimator w(boolean z2, View view, int i) {
        if (z2) {
            ObjectAnimator duration = u(view).setDuration(150L);
            duration.addListener(new edr(view));
            return duration;
        }
        ObjectAnimator duration2 = v(view).setDuration(150L);
        duration2.addListener(new eds(view));
        return duration2;
    }

    private final fob x() {
        fob E = fob.E(getContext(), 0.0f, null);
        E.X();
        E.P(this.J);
        gzp gzpVar = this.ac;
        if (gzpVar.f()) {
            E.M(ColorStateList.valueOf(((Integer) gzpVar.b()).intValue()));
        }
        return E;
    }

    private final fog y(boolean z2, boolean z3) {
        gbw gbwVar = new gbw((byte[]) null);
        if (z3) {
            edg edgVar = this.f;
            gbwVar.n(fhq.z(0));
            float f = edgVar.d;
            gbwVar.i(f);
            gbwVar.o(fhq.z(0));
            gbwVar.j(f);
        }
        if (z2) {
            edg edgVar2 = this.f;
            gbwVar.l(fhq.z(0));
            float f2 = edgVar2.d;
            gbwVar.g(f2);
            gbwVar.m(fhq.z(0));
            gbwVar.h(f2);
        }
        return new fog(gbwVar);
    }

    private final void z() {
        this.m.setVisibility(8);
        this.k.setVisibility(0);
        this.p.setVisibility(8);
        F(false, false);
        h(false);
        K();
        H(true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount == 0) {
            hoq.I(view.getId() == R.id.express_sign_in_internal_view, "express_sign_in_internal_view must be added first");
            super.addView(view, -1, layoutParams);
        } else {
            hoq.I(childCount == 1, "ExpressSignInLayoutInternal must contain a single content view.");
            FrameLayout frameLayout = this.ae;
            frameLayout.addView(view, 0, layoutParams);
            super.addView(frameLayout, 0, frameLayout.getLayoutParams());
        }
    }

    @Override // defpackage.efw
    public final void b(efu efuVar) {
        efuVar.b(this.j, 90572);
        efuVar.b(this.g, 90573);
        efuVar.b(this.h, 90574);
        efuVar.b(this.p, 90570);
        efuVar.b(this.k, 90771);
        efuVar.b(this.q, 90571);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(dri driVar, edf edfVar) {
        boolean z2 = driVar.a() + edfVar.a() > 0 && this.d;
        SelectedAccountView selectedAccountView = this.j;
        Object[] objArr = z2 ? (char) 1 : (char) 3;
        selectedAccountView.k.setVisibility(8);
        selectedAccountView.j.setVisibility(objArr == 1 ? 0 : 8);
        selectedAccountView.l.setVisibility(objArr != 3 ? 0 : 8);
        selectedAccountView.e();
        selectedAccountView.setOnClickListener(z2 ? new cx(this, 9, 0 == true ? 1 : 0) : null);
        selectedAccountView.setClickable(z2);
        if (z2) {
            return;
        }
        i(false);
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [fzh, java.lang.Object] */
    public final void d(eeg eegVar, Object obj) {
        fuf fufVar;
        hvi aJ;
        fao.c();
        q(obj == null ? 31 : 52);
        q(38);
        eef eefVar = eegVar.a;
        gzp g = gzp.g(obj);
        gxb gxbVar = (gxb) eefVar;
        Object obj2 = gxbVar.c.a;
        String str = gxbVar.a;
        eef eefVar2 = gxbVar.b;
        gtt f = ((gva) obj2).f(str, 271);
        try {
            fzp fzpVar = ((fzj) eefVar2).a;
            if (g.f()) {
                fufVar = (fuf) g.b();
            } else {
                fufVar = fzpVar.o;
                fufVar.getClass();
            }
            hoq.H(fzpVar.n.f());
            hoq.H(((her) fzpVar.n.b()).containsKey(fufVar));
            if (((her) fzpVar.n.b()).get(fufVar) == fyi.b) {
                gzp gzpVar = fzpVar.j;
                hoq.H(gzpVar.f());
                gzpVar.b().a().p(fzpVar.f.F(), "$tiktok$account_ineligible_dialog");
                aJ = hnu.aJ(false);
            } else {
                frv frvVar = fufVar.a;
                cbp cbpVar = fzpVar.s;
                ful fulVar = fufVar.b;
                new fzu(fulVar.c, fulVar.g, fulVar.k);
                fzpVar.g.j(cbp.k(hti.g(cbpVar.i(), gvx.c(new egl(fzpVar, frvVar, 18, null)), fzpVar.m)), new cbp(frvVar), fzpVar.b);
                aJ = hnu.aJ(true);
            }
            f.close();
            fao.c();
            AnimatorSet s = s(new edv(this));
            s.playTogether(u(this.n), v(this.m), v(this.l));
            this.v = s;
            s.start();
            hnu.aS(aJ, new edz(this), huf.a);
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efw
    public final void e(efu efuVar) {
        efuVar.e(this.j);
        efuVar.e(this.g);
        efuVar.e(this.h);
        efuVar.e(this.p);
        efuVar.e(this.k);
        efuVar.e(this.q);
    }

    public final void f(boolean z2) {
        fao.c();
        edx edxVar = new edx(this);
        if (!z2) {
            edxVar.onAnimationStart(null);
            edxVar.onAnimationEnd(null);
        } else {
            AnimatorSet s = s(edxVar);
            s.playTogether(v(this.n), u(this.m), u(this.l));
            s.start();
        }
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        super.fitSystemWindows(rect);
        return J();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void g(View view) {
        q(11);
        eed eedVar = this.e;
        ede edeVar = eedVar.e;
        edeVar.c.a(new dsh(eedVar.a, edeVar.a, null)).onClick(view);
    }

    public final void h(boolean z2) {
        int i;
        boolean z3;
        this.b = z2;
        this.U.setVisibility(true != z2 ? 8 : 0);
        SelectedAccountView selectedAccountView = this.j;
        if (z2 != selectedAccountView.n) {
            selectedAccountView.n = z2;
            selectedAccountView.j(z2);
            if (z2) {
                selectedAccountView.m.start();
            } else {
                selectedAccountView.m.reverse();
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) selectedAccountView.getLayoutParams();
        if (z2) {
            i = this.f.k;
            z3 = true;
        } else {
            i = 0;
            z3 = false;
        }
        marginLayoutParams.bottomMargin = i;
        selectedAccountView.requestLayout();
        if (!this.D) {
            k(this.l, z3 ? this.H : 0);
        }
        View findViewById = findViewById(R.id.disclaimer_separator);
        ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin = this.I;
        findViewById.requestLayout();
        w(z3, this.g, 150).start();
        eed eedVar = this.e;
        F(z3, (eedVar == null || eedVar.a.g().isEmpty()) ? false : true);
        if (dih.X(getContext())) {
            B(z3);
            this.ae.setVisibility(true != z3 ? 0 : 4);
        }
        if (z3) {
            this.u.f().b(this.u, this.ad);
            return;
        }
        this.ad.e();
        B(false);
        this.h.V(0);
    }

    public final void i(boolean z2) {
        if (this.b != z2) {
            h(z2);
        }
    }

    public final void m(hel helVar, Object obj) {
        if (helVar.isEmpty()) {
            z();
            return;
        }
        if (obj != null) {
            SelectedAccountView selectedAccountView = this.j;
            hoq.I(selectedAccountView.s != null, "Initialize must be called before setting an account.");
            selectedAccountView.s.k(obj, selectedAccountView.r);
            A();
            String h = this.e.e.a.h(obj);
            edb edbVar = this.s;
            gzp h2 = hoq.R(h).trim().isEmpty() ? gyf.a : gzp.h(h);
            Context context = getContext();
            heg hegVar = new heg(4);
            if (h2.f()) {
                hegVar.h(context.getResources().getString(R.string.og_continue_as, h2.b()));
            }
            hegVar.h(context.getResources().getString(R.string.og_continue));
            edbVar.a(hegVar.g());
        }
    }

    public final void n() {
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = this.Q;
        float scrollY = overScrollControlledNestedScrollView.getScrollY();
        float f = this.G;
        G(Math.min(1.0f, scrollY / f), this.W, this.R);
        float scrollY2 = overScrollControlledNestedScrollView.getScrollY();
        float measuredHeight = overScrollControlledNestedScrollView.getChildAt(0).getMeasuredHeight() - overScrollControlledNestedScrollView.getMeasuredHeight();
        G(scrollY2 >= measuredHeight ? 0.0f : Math.min((measuredHeight - scrollY2) / f, 1.0f), this.ab, this.l);
    }

    public final void o(boolean z2) {
        this.m.f.e(ColorStateList.valueOf(z2 ? 0 : this.f.e));
        this.U.setBackgroundColor(z2 ? this.f.e : 0);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Rect rect = new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        if (J()) {
            this.ah.set(rect);
            ViewGroup viewGroup = this.M;
            viewGroup.setPadding(rect.left, viewGroup.getPaddingTop(), rect.right, viewGroup.getPaddingBottom());
            FrameLayout frameLayout = this.ae;
            frameLayout.setPadding(rect.left, rect.top, rect.right, frameLayout.getPaddingBottom());
            this.S.getLayoutParams().height = rect.top;
            j(this.l, rect.bottom);
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ae.getLayoutParams().height = 0;
        this.C = 0;
        I(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        edb edbVar = this.r;
        if (edbVar != null) {
            edbVar.b(this.l.getMeasuredWidth());
        }
        edb edbVar2 = this.s;
        if (edbVar2 != null) {
            edbVar2.b(this.l.getMeasuredWidth());
        }
        ViewGroup viewGroup = this.l;
        int measuredHeight = viewGroup.getVisibility() == 8 ? 0 : viewGroup.getMeasuredHeight();
        View view = this.T;
        if (view.getPaddingBottom() != measuredHeight) {
            j(view, measuredHeight);
            super.onMeasure(i, i2);
        }
        if (this.b) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.M.getLayoutParams();
            int measuredHeight2 = this.N.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            Rect rect = this.ah;
            if (measuredHeight2 + rect.top + rect.bottom >= getHeight() && getHeight() > 0 && this.P.getVisibility() == 0) {
                B(true);
                super.onMeasure(i, i2);
            }
        }
        FrameLayout frameLayout = this.ae;
        int i3 = yq.a;
        if (frameLayout.isAttachedToWindow()) {
            if (this.ak == 0) {
                E();
                int r = r();
                E();
                this.ak = Math.max(r, r());
            }
            int measuredHeight3 = this.N.getMeasuredHeight();
            if (!this.b && measuredHeight3 > this.ak) {
                this.ak = measuredHeight3;
            }
            int measuredHeight4 = getMeasuredHeight();
            int i4 = measuredHeight4 - this.ak;
            if (!this.aj.f() || (!this.b && (((Integer) this.aj.b()).intValue() > i4 || measuredHeight4 != this.C))) {
                this.aj = gzp.h(Integer.valueOf(i4));
                frameLayout.getLayoutParams().height = i4;
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
            this.C = measuredHeight4;
        }
    }

    public final void p(boolean z2) {
        C(this.m, z2 ? 0 : this.f.b);
        C(this.U, z2 ? this.f.b : 0);
        SelectedAccountView selectedAccountView = this.j;
        edg edgVar = this.f;
        int i = edgVar.c + (z2 ? edgVar.b : 0);
        selectedAccountView.setPadding(i, selectedAccountView.getPaddingTop(), i, selectedAccountView.getPaddingBottom());
    }

    public final void q(int i) {
        jkj C = a().C();
        if (!C.b.M()) {
            C.t();
        }
        jnu jnuVar = (jnu) C.b;
        jnuVar.c = i - 1;
        jnuVar.b |= 1;
        jnu jnuVar2 = (jnu) C.q();
        eed eedVar = this.e;
        eedVar.c.a(eedVar.a.a(), jnuVar2);
    }
}
