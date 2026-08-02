package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.accountmenu.bento.common.BentoRecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyc extends dza {
    private final dxs a;
    private final dyx b;
    private final dyu c;
    private final dzh d;
    private final dxo e;
    private final dyf f;
    private final dyr g;

    public dyc(dxs dxsVar, dyx dyxVar, dyu dyuVar, dzh dzhVar, dxo dxoVar, dyf dyfVar, dyr dyrVar) {
        this.a = dxsVar;
        this.b = dyxVar;
        this.c = dyuVar;
        this.d = dzhVar;
        this.e = dxoVar;
        this.f = dyfVar;
        this.g = dyrVar;
    }

    private static final void d(BentoRecyclerView bentoRecyclerView, List list) {
        kr krVar = bentoRecyclerView.l;
        krVar.getClass();
        dzq dzqVar = (dzq) krVar;
        ArrayList arrayList = new ArrayList(ixc.w(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jhy jhyVar = (jhy) it.next();
            arrayList.add(new jia(ixc.b(new jic(jhyVar)), jhyVar.b));
        }
        dzqVar.t(arrayList);
        bentoRecyclerView.setVisibility(true != list.isEmpty() ? 0 : 8);
    }

    private static final void e(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int marginStart = marginLayoutParams.getMarginStart();
        int marginEnd = marginLayoutParams.getMarginEnd();
        int i2 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(marginStart);
        marginLayoutParams.topMargin = i;
        marginLayoutParams.setMarginEnd(marginEnd);
        marginLayoutParams.bottomMargin = i2;
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((dyd) obj).getClass();
        ((jgb) obj2).getClass();
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        boolean z;
        dyd dydVar = (dyd) obj;
        jgb jgbVar = (jgb) obj2;
        dydVar.getClass();
        jgbVar.getClass();
        jhh jhhVar = new jhh(R.string.og_bento_a11y_dialog);
        ViewGroup viewGroup = dydVar.a;
        Context context = viewGroup.getContext();
        context.getClass();
        String J = dih.J(jgbVar.f, context);
        Context context2 = viewGroup.getContext();
        context2.getClass();
        yq.n(viewGroup, J + "\n" + dih.J(jhhVar, context2));
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i = jgbVar.h - 1;
        if (i == 1) {
            Resources resources = viewGroup.getResources();
            layoutParams2.gravity = 8388613;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.og_bento_menu_large_screen_content_container_default_width);
            float f = resources.getConfiguration().screenWidthDp * resources.getDisplayMetrics().density;
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.og_bento_menu_content_container_horizontal_margin);
            layoutParams2.width = Math.min(dimensionPixelSize, (int) ((f / 2.0f) - (dimensionPixelSize2 + dimensionPixelSize2)));
        } else if (i == 2) {
            layoutParams2.gravity = 1;
        }
        viewGroup.setLayoutParams(layoutParams2);
        ekx ekxVar = dydVar.t;
        boolean z2 = dydVar.m;
        dym dymVar = (dym) ekxVar.a;
        MaterialButton materialButton = dymVar.i;
        int aa = dih.aa(materialButton.getResources().getDisplayMetrics(), true != z2 ? 8 : 16);
        materialButton.setPadding(aa, materialButton.getPaddingTop(), aa, materialButton.getPaddingBottom());
        MaterialButton materialButton2 = dymVar.j;
        materialButton2.setPadding(aa, materialButton2.getPaddingTop(), aa, materialButton2.getPaddingBottom());
        MaterialButton materialButton3 = dymVar.k;
        materialButton3.setPadding(aa, materialButton3.getPaddingTop(), aa, materialButton3.getPaddingBottom());
        this.f.c(ekxVar, jgbVar.c);
        jgf jgfVar = jgbVar.a;
        boolean z3 = jgfVar instanceof jhw;
        jhn jhnVar = null;
        jhn jhnVar2 = z3 ? ((jhw) jgfVar).b : null;
        if (z3) {
            dydVar.f.setVisibility(jhnVar2 != null ? 0 : 8);
            if (jhnVar2 != null) {
                dyu dyuVar = this.c;
                Object bB = dydVar.g.bB();
                bB.getClass();
                dyuVar.c(bB, jhnVar2);
                jhnVar = jhnVar2;
            }
            jhw jhwVar = (jhw) jgfVar;
            jfv jfvVar = jhwVar.c;
            if (jfvVar != null) {
                dxo dxoVar = this.e;
                Object bB2 = dydVar.j.bB();
                bB2.getClass();
                dxoVar.c(bB2, jfvVar);
            }
            View view = dydVar.i;
            if (view != null) {
                view.setVisibility(8);
            }
            d(dydVar.p, jhwVar.d);
            d(dydVar.q, jhwVar.e);
            z = true;
            jhnVar2 = jhnVar;
        } else {
            if (!(jgfVar instanceof jhx)) {
                throw new koj();
            }
            FrameLayout frameLayout = dydVar.f;
            ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = -2;
            frameLayout.setLayoutParams(layoutParams4);
            dzi dziVar = (dzi) dydVar.h.bB();
            dziVar.a = z2 ? dih.aa(((dye) dziVar.c).getContext().getResources().getDisplayMetrics(), 2) : dih.aa(((dye) dziVar.c).getContext().getResources().getDisplayMetrics(), 12);
            dzh dzhVar = this.d;
            dziVar.getClass();
            dzhVar.c(dziVar, ((jhx) jgfVar).a);
            View view2 = dydVar.i;
            if (view2 != null) {
                view2.setVisibility(true != z2 ? 8 : 0);
            }
            z = false;
        }
        this.a.c(dydVar.r, jgbVar.b);
        jge jgeVar = jgbVar.e;
        dydVar.d.setVisibility(true != (jgeVar.d && !jgeVar.c) ? 0 : 4);
        if (jhnVar2 == null && z2) {
            ViewGroup viewGroup2 = dydVar.b;
            e(viewGroup2, viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.account_menu_container_top_padding_without_selected_account));
        } else {
            e(dydVar.b, 0);
        }
        if (z) {
        }
        Object obj3 = dydVar.u.b;
        ((TextView) obj3).setVisibility(8);
        FrameLayout frameLayout2 = dydVar.o;
        frameLayout2.setVisibility(8);
        if (z2 && frameLayout2.getVisibility() == 0) {
            e(dydVar.f, 0);
        }
        ViewGroup viewGroup3 = dydVar.e;
        if (!viewGroup3.isLaidOut() || viewGroup3.isLayoutRequested()) {
            viewGroup3.addOnLayoutChangeListener(new dxy(dydVar, dydVar, 3));
        } else {
            dja.z(dydVar.b, viewGroup3, (View) obj3, z2, frameLayout2);
        }
        dyx dyxVar = this.b;
        ekx ekxVar2 = dydVar.s;
        if (!z2) {
            jgeVar = jge.a(jgeVar, false, 13);
        }
        dyxVar.c(ekxVar2, jgeVar);
        jhk jhkVar = jgbVar.d;
        if (jhkVar == null || jhkVar.b.isEmpty()) {
            dydVar.k.setVisibility(8);
        } else {
            dyr dyrVar = this.g;
            hac hacVar = dydVar.l;
            Object bB3 = hacVar.bB();
            bB3.getClass();
            dyrVar.c(bB3, jhkVar);
            dydVar.k.setVisibility(0);
            Object obj4 = ((fwm) hacVar.bB()).a;
            int i2 = 10;
            if (!z2 && (jgfVar instanceof jhx)) {
                i2 = 6;
            }
            e((View) obj4, dih.aa(((TextView) obj4).getContext().getResources().getDisplayMetrics(), i2));
        }
        dydVar.c.setVisibility((!z2 && jhkVar == null && jgfVar.a()) ? 8 : 0);
        dydVar.n.setVisibility(true != jgbVar.g ? 0 : 8);
    }
}
