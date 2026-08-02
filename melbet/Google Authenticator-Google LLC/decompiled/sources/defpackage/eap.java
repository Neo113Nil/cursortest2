package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eap extends dza {
    private final dzy a;
    private final ean b;
    private final ehi c;

    public eap(dzy dzyVar, ean eanVar, ehi ehiVar) {
        this.a = dzyVar;
        this.b = eanVar;
        this.c = ehiVar;
    }

    private final void d(View view, jhb jhbVar) {
        view.setBackground(jhbVar != null ? dih.ac(view.getContext(), R.drawable.og_bento_trailing_chip, this.c.a(jhbVar)) : null);
        int aa = jhbVar != null ? dih.aa(view.getResources().getDisplayMetrics(), 4) : 0;
        view.setPadding(aa, view.getPaddingTop(), aa, view.getPaddingBottom());
        view.setMinimumHeight(jhbVar != null ? dih.aa(view.getResources().getDisplayMetrics(), 16) : 0);
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((eaq) obj).getClass();
        ((jin) obj2).getClass();
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        eaq eaqVar = (eaq) obj;
        jin jinVar = (jin) obj2;
        eaqVar.getClass();
        jinVar.getClass();
        if (ksp.b(jinVar, eaqVar.e)) {
            return;
        }
        eaqVar.e = jinVar;
        ViewGroup viewGroup = eaqVar.a;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            childAt.getClass();
            childAt.setVisibility(8);
            i++;
        }
        if (!(jinVar instanceof jip)) {
            if (!(jinVar instanceof jio)) {
                throw new koj();
            }
            Object bB = eaqVar.d.bB();
            bB.getClass();
            ekx ekxVar = (ekx) bB;
            Object obj3 = ekxVar.c;
            ((ViewGroup) obj3).setVisibility(0);
            jio jioVar = (jio) jinVar;
            d((View) obj3, null);
            c(ekxVar.a, jioVar.a);
            c(ekxVar.d, jioVar.b);
            Object obj4 = ekxVar.b;
            View view = (View) obj4;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(Integer.valueOf(dih.aa(((ViewGroup) obj4).getResources().getDisplayMetrics(), jioVar.c + (-1) == 0 ? 4 : 8)).intValue());
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        jip jipVar = (jip) jinVar;
        if (jipVar instanceof jir) {
            ean eanVar = this.b;
            Object bB2 = eaqVar.b.bB();
            Object obj5 = ((iyi) bB2).b;
            ((TextView) obj5).setVisibility(0);
            jir jirVar = (jir) jipVar;
            d((View) obj5, jirVar.b);
            bB2.getClass();
            eanVar.c(bB2, jirVar.a);
            return;
        }
        if (!(jipVar instanceof jiq)) {
            throw new koj();
        }
        dzy dzyVar = this.a;
        Object bB3 = eaqVar.c.bB();
        cfe cfeVar = (cfe) bB3;
        jiq jiqVar = (jiq) jipVar;
        int i2 = jiqVar.b + (-1) != 2 ? 32 : 24;
        Object obj6 = cfeVar.a;
        ImageView imageView = (ImageView) obj6;
        int aa = dih.aa(imageView.getResources().getDisplayMetrics(), i2);
        View view2 = (View) obj6;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.width = aa;
        layoutParams3.height = aa;
        view2.setLayoutParams(layoutParams3);
        imageView.setVisibility(0);
        bB3.getClass();
        dzyVar.c(bB3, jiqVar.a);
    }
}
