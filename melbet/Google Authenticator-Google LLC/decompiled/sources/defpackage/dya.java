package defpackage;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.accountmenu.bento.common.BentoRecyclerView;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.TextViewContainer;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards.CardStackRecyclerView;
import com.google.android.libraries.onegoogle.common.ConstraintLayoutInterceptingTouches;
import com.google.android.material.button.MaterialButton;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dya {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public dya(jiw jiwVar, iyh iyhVar, cwy cwyVar, Optional optional, Optional optional2, Context context, Optional optional3, bst bstVar) {
        optional.getClass();
        optional2.getClass();
        optional3.getClass();
        this.b = jiwVar;
        this.c = iyhVar;
        this.h = cwyVar;
        this.f = optional;
        this.g = optional2;
        this.d = context;
        this.a = optional3;
        this.e = bstVar;
    }

    public static final zz a(View view, zz zzVar) {
        view.getClass();
        vb f = zzVar.f(519);
        int aa = dih.aa(view.getContext().getResources().getDisplayMetrics(), 60);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.og_bento_menu_large_screen_bottom_margin);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = f.c + aa;
        int i = f.e;
        if (i >= dimensionPixelSize) {
            dimensionPixelSize += i;
        }
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        view.setLayoutParams(marginLayoutParams);
        return zz.a;
    }

    public static final LayoutTransition c() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        return layoutTransition;
    }

    private static final void d(View view, View view2) {
        yq.l(view, new dxz(view2));
    }

    private static final BentoRecyclerView e(ViewGroup viewGroup, int i, koe koeVar) {
        View findViewById = viewGroup.findViewById(i);
        BentoRecyclerView bentoRecyclerView = (BentoRecyclerView) findViewById;
        viewGroup.getContext();
        bentoRecyclerView.Y(new LinearLayoutManager(1));
        bentoRecyclerView.X((kr) koeVar.b());
        findViewById.getClass();
        return bentoRecyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, koe] */
    public final dyd b(ViewGroup viewGroup) {
        final int dimensionPixelSize;
        int i;
        Object[] objArr;
        int i2 = viewGroup.getResources().getConfiguration().smallestScreenWidthDp;
        int i3 = viewGroup.getResources().getConfiguration().orientation;
        boolean z = true;
        Object[] objArr2 = i2 >= 600;
        boolean z2 = objArr2 == true || i3 == 1 || ((bst) this.h).h();
        if (z2) {
            dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.toolbar_horizontal_padding_single_pane);
            i = R.layout.og_bento_content_single_pane;
        } else {
            dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.toolbar_horizontal_padding_two_panes);
            i = R.layout.og_bento_content_two_panes;
        }
        LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup);
        TextView textView = (TextView) viewGroup.findViewById(R.id.og_bento_selected_account_title);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.og_bento_container_with_toolbar);
        FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.og_bento_selected_account_title_button_container);
        final ViewGroup viewGroup2 = (ViewGroup) frameLayout.findViewById(R.id.og_bento_container);
        View findViewById = viewGroup.findViewById(R.id.og_bento_disable_content_view);
        findViewById.setOnClickListener(new dxu(0));
        findViewById.setFocusable(0);
        findViewById.setImportantForAccessibility(2);
        findViewById.setAlpha(0.5f);
        Context context = findViewById.getContext();
        findViewById.setBackgroundColor(new fhs(context).a(fhq.d(context, R.attr.colorSurface, 0), context.getResources().getDimension(R.dimen.gm3_sys_elevation_level2)));
        List D = ixc.D(new Integer[]{Integer.valueOf(R.id.og_bento_scroll_container), Integer.valueOf(R.id.og_bento_scroll_container_left_pane)});
        ArrayList<NestedScrollView> arrayList = new ArrayList();
        Iterator it = D.iterator();
        while (it.hasNext()) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewGroup2.findViewById(((Number) it.next()).intValue());
            if (nestedScrollView != null) {
                arrayList.add(nestedScrollView);
            }
        }
        ArrayList arrayList2 = new ArrayList(ixc.w(arrayList));
        for (NestedScrollView nestedScrollView2 : arrayList) {
            boolean z3 = z;
            dyb dybVar = new dyb((hrz) this.d);
            nestedScrollView2.d = dybVar;
            nestedScrollView2.getScrollX();
            dybVar.a(nestedScrollView2, nestedScrollView2.getScrollY());
            arrayList2.add(kow.a);
            z = z3;
        }
        boolean z4 = z;
        View findViewById2 = viewGroup2.findViewById(R.id.og_bento_accounts_state_layout_container);
        findViewById2.getClass();
        FrameLayout frameLayout3 = (FrameLayout) findViewById2;
        final FrameLayout frameLayout4 = (FrameLayout) frameLayout.findViewById(R.id.og_bento_toolbar);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.og_bento_product_space_container);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.og_bento_main_scroll_content);
        viewGroup4.getClass();
        viewGroup4.addOnLayoutChangeListener(new dxy(viewGroup4, viewGroup4, 0));
        ViewGroup viewGroup5 = (ViewGroup) viewGroup.findViewById(R.id.og_bento_accounts_cards_footer_container);
        if (viewGroup5 != null) {
            viewGroup5.addOnLayoutChangeListener(new dxy(viewGroup5, viewGroup5, 2));
        }
        Object obj = this.a;
        frameLayout4.getClass();
        View inflate = LayoutInflater.from(frameLayout4.getContext()).inflate(R.layout.og_bento_toolbar, frameLayout4);
        inflate.getClass();
        View findViewById3 = inflate.findViewById(R.id.og_bento_toolbar_selected_account_avatar);
        findViewById3.getClass();
        FrameLayout frameLayout5 = (FrameLayout) findViewById3;
        fwm fwmVar = (fwm) obj;
        if (((bst) fwmVar.b).j()) {
            objArr = objArr2;
        } else {
            int dimensionPixelSize2 = frameLayout5.getResources().getDimensionPixelSize(R.dimen.bento_toolbar_avatar_size_legacy);
            ViewGroup.LayoutParams layoutParams = frameLayout5.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            td tdVar = (td) layoutParams;
            tdVar.width = dimensionPixelSize2;
            tdVar.height = dimensionPixelSize2;
            objArr = objArr2;
            tdVar.setMarginEnd(frameLayout5.getResources().getDimensionPixelSize(R.dimen.bento_toolbar_avatar_margin_end_legacy));
            frameLayout5.setLayoutParams(tdVar);
        }
        ViewGroup viewGroup6 = (ViewGroup) inflate.findViewById(R.id.og_bento_toolbar_container);
        viewGroup6.getClass();
        viewGroup6.addOnLayoutChangeListener(new dxx(viewGroup6, 3));
        View findViewById4 = inflate.findViewById(R.id.og_bento_toolbar_close_button);
        findViewById4.getClass();
        ekx ekxVar = new ekx(inflate, (ImageView) findViewById4, ((fwm) fwmVar.a).H(frameLayout5), frameLayout5);
        FrameLayout frameLayout6 = (FrameLayout) viewGroup2.findViewById(R.id.og_bento_two_panes_account_menu_title_container);
        if (frameLayout6 == null) {
            View findViewById5 = frameLayout4.findViewById(R.id.og_bento_single_pane_account_menu_title_container);
            findViewById5.getClass();
            frameLayout6 = (FrameLayout) findViewById5;
        }
        if (objArr == true) {
            boh bohVar = new boh(11);
            zz a = (Build.VERSION.SDK_INT >= 36 ? new zm() : Build.VERSION.SDK_INT >= 35 ? new zl() : Build.VERSION.SDK_INT >= 34 ? new zk() : Build.VERSION.SDK_INT >= 31 ? new zj() : Build.VERSION.SDK_INT >= 30 ? new zi() : Build.VERSION.SDK_INT >= 29 ? new zh() : new zg()).a();
            a.getClass();
            a(viewGroup, a);
            int i4 = yq.a;
            yi.c(viewGroup, bohVar);
        } else {
            viewGroup2.getClass();
            Integer valueOf = Integer.valueOf(R.id.og_bento_main_scroll_content);
            Integer valueOf2 = Integer.valueOf(R.id.og_bento_secondary_scroll_content);
            Integer[] numArr = new Integer[2];
            numArr[0] = valueOf;
            numArr[z4 ? 1 : 0] = valueOf2;
            List D2 = ixc.D(numArr);
            final ArrayList arrayList3 = new ArrayList();
            Iterator it2 = D2.iterator();
            while (it2.hasNext()) {
                View findViewById6 = viewGroup2.findViewById(((Number) it2.next()).intValue());
                if (findViewById6 != null) {
                    arrayList3.add(findViewById6);
                }
            }
            xq xqVar = new xq() { // from class: dxw
                @Override // defpackage.xq
                public final zz a(View view, zz zzVar) {
                    view.getClass();
                    vb f = zzVar.f(647);
                    int i5 = f.c;
                    int i6 = f.b;
                    int i7 = f.d;
                    int i8 = dimensionPixelSize;
                    View view2 = frameLayout4;
                    view2.setPadding(i8 + i6, i5, i8 + i7, view2.getPaddingBottom());
                    View view3 = viewGroup2;
                    view3.setPadding(i6, view3.getPaddingTop(), i7, view3.getPaddingBottom());
                    for (View view4 : arrayList3) {
                        view4.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), view4.getPaddingRight(), f.e);
                    }
                    return zz.a;
                }
            };
            zz a2 = (Build.VERSION.SDK_INT >= 36 ? new zm() : Build.VERSION.SDK_INT >= 35 ? new zl() : Build.VERSION.SDK_INT >= 34 ? new zk() : Build.VERSION.SDK_INT >= 31 ? new zj() : Build.VERSION.SDK_INT >= 30 ? new zi() : Build.VERSION.SDK_INT >= 29 ? new zh() : new zg()).a();
            a2.getClass();
            xqVar.a(viewGroup, a2);
            int i5 = yq.a;
            yi.c(viewGroup, xqVar);
            dih.T(viewGroup);
            ehi ehiVar = (ehi) this.f;
            dih.U(viewGroup, z4, ehiVar.b());
            boolean b = ehiVar.b();
            if (Build.VERSION.SDK_INT >= 29) {
                viewGroup.setSystemUiVisibility(b ? viewGroup.getSystemUiVisibility() | 16 : viewGroup.getSystemUiVisibility() & (-17));
            }
        }
        viewGroup2.getClass();
        d(viewGroup2, frameLayout6);
        if (z2) {
            d(frameLayout6, (View) ekxVar.c);
        }
        View findViewById7 = viewGroup2.findViewById(R.id.og_bento_scroll_container);
        findViewById7.getClass();
        FrameLayout frameLayout7 = new FrameLayout(frameLayout6.getContext());
        frameLayout6.addView(frameLayout7, new ViewGroup.LayoutParams(-2, -2));
        fdp fdpVar = new fdp(frameLayout7, hoq.v(new cud(frameLayout7, 7)), hoq.v(new cud(frameLayout7, 8)));
        hac v = hoq.v(new dxi(this, frameLayout3, 3, null));
        hac v2 = hoq.v(new cud(frameLayout3, 9));
        View findViewById8 = viewGroup2.findViewById(R.id.og_bento_without_accounts_divider);
        hac v3 = hoq.v(new hac() { // from class: dxv
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, koe] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, koe] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, koe] */
            /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, jpt] */
            @Override // defpackage.hac
            public final Object bB() {
                View findViewById9 = viewGroup2.findViewById(R.id.og_bento_account_management_container);
                findViewById9.getClass();
                ViewGroup viewGroup7 = (ViewGroup) findViewById9;
                View inflate2 = LayoutInflater.from(viewGroup7.getContext()).inflate(R.layout.og_bento_account_management_content, viewGroup7);
                inflate2.getClass();
                iyi iyiVar = (iyi) dya.this.c;
                Object b2 = iyiVar.a.b();
                Context context2 = viewGroup7.getContext();
                context2.getClass();
                fho fhoVar = new fho(context2);
                fhoVar.d(fhq.d(context2, R.attr.colorSurfaceContainer, 0));
                fhoVar.a = context2.getResources().getDimensionPixelSize(R.dimen.bento_divider_thickness);
                fhoVar.b = true;
                RecyclerView recyclerView = (RecyclerView) inflate2.findViewById(R.id.accounts);
                viewGroup7.getContext();
                recyclerView.Y(new LinearLayoutManager(1));
                recyclerView.X((kr) b2);
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView.av(fhoVar);
                Object b3 = iyiVar.c.b();
                CardStackRecyclerView cardStackRecyclerView = (CardStackRecyclerView) inflate2.findViewById(R.id.account_management_actions);
                cardStackRecyclerView.X((kr) b3);
                LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(R.id.account_management_expandable_content);
                ViewGroup viewGroup8 = (ViewGroup) inflate2.findViewById(R.id.og_bento_account_management_header_container);
                ViewGroup viewGroup9 = (ViewGroup) inflate2.findViewById(R.id.og_account_management_content_root);
                inflate2.addOnLayoutChangeListener(new dxy(linearLayout, viewGroup8, 1));
                viewGroup9.getClass();
                viewGroup8.getClass();
                fwm fwmVar2 = (fwm) iyiVar.b;
                Object b4 = fwmVar2.b.b();
                View inflate3 = LayoutInflater.from(viewGroup8.getContext()).inflate(R.layout.og_bento_account_management_header, viewGroup8);
                inflate3.getClass();
                ConstraintLayoutInterceptingTouches constraintLayoutInterceptingTouches = (ConstraintLayoutInterceptingTouches) inflate3;
                RecyclerView recyclerView2 = (RecyclerView) constraintLayoutInterceptingTouches.findViewById(R.id.header_avatars);
                viewGroup8.getContext();
                recyclerView2.Y(new LinearLayoutManager(0));
                recyclerView2.X((kr) b4);
                recyclerView2.setVisibility(8);
                recyclerView2.ao();
                ImageView imageView = (ImageView) constraintLayoutInterceptingTouches.findViewById(R.id.og_collapsed_chevron);
                ImageView imageView2 = (ImageView) constraintLayoutInterceptingTouches.findViewById(R.id.og_compact_header_chevron_background);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, 360.0f, 180.0f);
                ofFloat.setDuration(200L);
                recyclerView2.getClass();
                imageView.getClass();
                imageView2.getClass();
                ofFloat.getClass();
                View findViewById10 = constraintLayoutInterceptingTouches.findViewById(R.id.og_bento_switch_account_header);
                findViewById10.getClass();
                Object obj2 = fwmVar2.a;
                TextView textView2 = (TextView) findViewById10;
                View findViewById11 = constraintLayoutInterceptingTouches.findViewById(R.id.og_compact_header);
                findViewById11.getClass();
                View findViewById12 = findViewById11.findViewById(R.id.og_compact_header_avatar);
                findViewById12.getClass();
                FrameLayout frameLayout8 = (FrameLayout) findViewById12;
                ViewGroup viewGroup10 = (ViewGroup) findViewById11.findViewById(R.id.og_compact_header_premium_decoration_container);
                viewGroup10.getClass();
                View inflate4 = LayoutInflater.from(viewGroup10.getContext()).inflate(R.layout.og_bento_premium_decoration_layout, viewGroup10, false);
                inflate4.getClass();
                fwm fwmVar3 = (fwm) obj2;
                ViewGroup viewGroup11 = (ViewGroup) inflate4;
                Object b5 = ((bst) fwmVar3.a).a.b();
                b5.getClass();
                viewGroup11.setBackground(new dyn((ehi) b5, viewGroup11.getResources().getDisplayMetrics().density));
                viewGroup10.addView(viewGroup11);
                View findViewById13 = viewGroup11.findViewById(R.id.bento_premium_decoration_text);
                findViewById13.getClass();
                cbp cbpVar = new cbp(new iyi((TextView) findViewById13, (TextViewContainer) null), (byte[]) null);
                dze H = ((fwm) fwmVar3.b).H(frameLayout8);
                View findViewById14 = findViewById11.findViewById(R.id.og_compact_header_primary_text);
                findViewById14.getClass();
                iyi iyiVar2 = new iyi((TextView) findViewById14, (TextViewContainer) null);
                View findViewById15 = findViewById11.findViewById(R.id.og_compact_header_secondary_text);
                findViewById15.getClass();
                dxf dxfVar = new dxf((dyk) b4, recyclerView2, imageView, imageView2, ofFloat, textView2, new iee(H, frameLayout8, iyiVar2, new iyi((TextView) findViewById15, (TextViewContainer) null), cbpVar, viewGroup10, findViewById11), constraintLayoutInterceptingTouches);
                recyclerView.getClass();
                cardStackRecyclerView.getClass();
                View findViewById16 = inflate2.findViewById(R.id.account_management_header_divider);
                findViewById16.getClass();
                View findViewById17 = inflate2.findViewById(R.id.account_management_card);
                findViewById17.getClass();
                return new dxp(viewGroup9, dxfVar, viewGroup8, (dxd) b2, recyclerView, cardStackRecyclerView, (dzo) b3, findViewById16, findViewById17, fhoVar);
            }
        });
        View findViewById9 = viewGroup2.findViewById(R.id.og_bento_policy_footer_container);
        findViewById9.getClass();
        ViewGroup viewGroup7 = (ViewGroup) findViewById9;
        Context context2 = viewGroup7.getContext();
        context2.getClass();
        dym dymVar = new dym(context2);
        viewGroup7.addView(dymVar);
        View findViewById10 = dymVar.findViewById(R.id.og_bento_privacy_policy_button);
        findViewById10.getClass();
        View findViewById11 = dymVar.findViewById(R.id.og_bento_tos_button);
        findViewById11.getClass();
        FrameLayout frameLayout8 = frameLayout6;
        View findViewById12 = dymVar.findViewById(R.id.og_bento_custom_button);
        findViewById12.getClass();
        ekx ekxVar2 = new ekx(dymVar, (MaterialButton) findViewById10, (MaterialButton) findViewById11, (MaterialButton) findViewById12);
        viewGroup3.getClass();
        hac v4 = hoq.v(new dxi(this, viewGroup3, 4, null));
        findViewById.getClass();
        textView.getClass();
        iyi iyiVar = new iyi(textView, (TextViewContainer) null);
        frameLayout2.getClass();
        hoq.v(new cud(frameLayout2, 10));
        ?? r0 = this.g;
        return new dyd(viewGroup, viewGroup2, (NestedScrollView) findViewById7, frameLayout8, fdpVar, frameLayout4, ekxVar, frameLayout3, v, v2, findViewById8, v3, ekxVar2, viewGroup3, v4, z2, findViewById, iyiVar, frameLayout2, e(viewGroup, R.id.og_bento_cards_above_account_switcher_container, r0), e(viewGroup, R.id.og_bento_cards_below_account_switcher_container, r0));
    }

    public dya(fwm fwmVar, cbp cbpVar, iyi iyiVar, hrz hrzVar, fwm fwmVar2, ehi ehiVar, koe koeVar, bst bstVar) {
        this.a = fwmVar;
        this.b = cbpVar;
        this.c = iyiVar;
        this.d = hrzVar;
        this.e = fwmVar2;
        this.f = ehiVar;
        this.g = koeVar;
        this.h = bstVar;
    }
}
