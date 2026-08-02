package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.button.MaterialButton;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eae extends dza {
    private final dzy a;
    private final ean b;
    private final dzh c;
    private final eac d;
    private final eap e;

    public eae(dzy dzyVar, ean eanVar, dzh dzhVar, eac eacVar, eap eapVar) {
        this.a = dzyVar;
        this.b = eanVar;
        this.c = dzhVar;
        this.d = eacVar;
        this.e = eapVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((eaf) obj).getClass();
        ((eai) obj2).getClass();
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int i;
        ti tiVar;
        eaf eafVar = (eaf) obj;
        eai eaiVar = (eai) obj2;
        eafVar.getClass();
        eaiVar.getClass();
        jim jimVar = eaiVar.a;
        jig jigVar = jimVar.j;
        jgn jgnVar = null;
        if (!ksp.b(jigVar, null)) {
            FrameLayout frameLayout = eafVar.H;
            int childCount = frameLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = frameLayout.getChildAt(i2);
                childAt.getClass();
                childAt.setVisibility(8);
            }
            cfe cfeVar = (cfe) eafVar.v.bB();
            dzy dzyVar = this.a;
            cfeVar.getClass();
            dzyVar.c(cfeVar, jigVar.a);
            ((ImageView) cfeVar.a).setVisibility(0);
        }
        ean eanVar = this.b;
        eanVar.c(eafVar.I, jimVar.a);
        ConstraintLayout constraintLayout = eafVar.t;
        constraintLayout.setContentDescription(null);
        jhq jhqVar = jimVar.b;
        if (jhqVar != null) {
            iyi iyiVar = eafVar.J;
            ((TextView) iyiVar.b).setVisibility(0);
            eanVar.c(iyiVar, jhqVar);
        } else {
            ((TextView) eafVar.J.b).setVisibility(8);
        }
        boolean z = true;
        if (jimVar.i - 1 != 1) {
            tn tnVar = eafVar.u;
            Integer valueOf = Integer.valueOf(R.id.og_bento_card_image_container);
            HashMap hashMap = tnVar.b;
            if (hashMap.containsKey(valueOf) && (tiVar = (ti) hashMap.get(valueOf)) != null) {
                tj tjVar = tiVar.d;
                tjVar.p = -1;
                tjVar.q = -1;
                tjVar.K = 0;
                tjVar.R = Integer.MIN_VALUE;
            }
        } else {
            eafVar.u.e(R.id.og_bento_card_image_container, 4, R.id.og_bento_card_top_content, 4);
        }
        eafVar.u.b(constraintLayout);
        if (jimVar.h - 1 != 1) {
            FrameLayout frameLayout2 = eafVar.H;
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            frameLayout2.setLayoutParams(marginLayoutParams);
        } else {
            FrameLayout frameLayout3 = eafVar.H;
            ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(constraintLayout.getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_account_management_card_icon_start_margin));
            marginLayoutParams2.setMarginEnd(constraintLayout.getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_account_management_card_icon_end_margin));
            frameLayout3.setLayoutParams(marginLayoutParams2);
        }
        jin jinVar = jimVar.e;
        if (jinVar != null) {
            eafVar.x.setVisibility(0);
            eap eapVar = this.e;
            Object bB = eafVar.y.bB();
            bB.getClass();
            eapVar.c(bB, jinVar);
        } else {
            eafVar.x.setVisibility(8);
        }
        jif jifVar = jimVar.c;
        if (jifVar instanceof jii) {
            eafVar.z.setVisibility(0);
            iyi iyiVar2 = eafVar.K;
            ((TextView) iyiVar2.b).setVisibility(0);
            eafVar.B.setVisibility(8);
            eanVar.c(iyiVar2, ((jii) jifVar).a);
        } else if (jifVar instanceof jij) {
            eafVar.z.setVisibility(0);
            ((TextView) eafVar.K.b).setVisibility(8);
            eafVar.B.setVisibility(0);
            eac eacVar = this.d;
            Object bB2 = eafVar.A.bB();
            bB2.getClass();
            eacVar.c(bB2, ((jij) jifVar).a);
        } else {
            if (jifVar != null) {
                throw new koj();
            }
            eafVar.z.setVisibility(8);
        }
        View view = eafVar.G;
        jgn jgnVar2 = jimVar.f;
        jgn jgnVar3 = jimVar.g;
        if (jgnVar2 == null) {
            i = jgnVar3 != null ? 0 : 8;
        } else {
            i = 0;
            jgnVar = jgnVar2;
        }
        view.setVisibility(i);
        if (jgnVar != null) {
            eafVar.D.setVisibility(0);
            dzh dzhVar = this.c;
            hac hacVar = eafVar.C;
            Object bB3 = hacVar.bB();
            bB3.getClass();
            dzhVar.c(bB3, jgnVar);
            Object bB4 = hacVar.bB();
            bB4.getClass();
            jiu jiuVar = eaiVar.b;
            Object obj3 = ((dzi) bB4).c;
            boolean b = ksp.b(jiuVar, jgnVar.b);
            dye dyeVar = (dye) obj3;
            if (dih.X(dyeVar.getContext()) && b) {
                z = false;
            }
            MaterialButton materialButton = dyeVar.a;
            if (materialButton != null) {
                materialButton.setFocusable(z);
                materialButton.setClickable(z);
            }
        } else {
            eafVar.D.setVisibility(8);
        }
        if (jgnVar3 != null) {
            eafVar.F.setVisibility(0);
            dzh dzhVar2 = this.c;
            Object bB5 = eafVar.E.bB();
            bB5.getClass();
            dzhVar2.c(bB5, jgnVar3);
        } else {
            eafVar.F.setVisibility(8);
        }
        ConstraintLayout constraintLayout2 = eafVar.w;
        ViewGroup.LayoutParams layoutParams3 = constraintLayout2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        td tdVar = (td) layoutParams3;
        if (jifVar == null && jgnVar2 == null && jgnVar3 == null) {
            tdVar.S = dih.aa(constraintLayout2.getResources().getDisplayMetrics(), 40);
            tdVar.topMargin = dih.aa(constraintLayout2.getResources().getDisplayMetrics(), 0);
        } else {
            tdVar.S = dih.aa(constraintLayout2.getResources().getDisplayMetrics(), 20);
            tdVar.topMargin = dih.aa(constraintLayout2.getResources().getDisplayMetrics(), 8);
        }
        constraintLayout2.setLayoutParams(tdVar);
    }
}
