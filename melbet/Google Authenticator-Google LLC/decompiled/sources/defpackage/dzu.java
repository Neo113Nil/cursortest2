package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.Button;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards.CardFrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzu extends dza {
    private final eae a;
    private final jpt b;
    private final ldt c;

    public dzu(eae eaeVar, jpt jptVar, ldt ldtVar) {
        jptVar.getClass();
        this.a = eaeVar;
        this.b = jptVar;
        this.c = ldtVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [dme, java.lang.Object] */
    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dzv dzvVar = (dzv) obj;
        jhy jhyVar = (jhy) obj2;
        dzvVar.getClass();
        jhyVar.getClass();
        jie jieVar = jhyVar.a;
        if (jieVar instanceof jih) {
            ldt ldtVar = this.c;
            CardFrameLayout cardFrameLayout = dzvVar.t;
            ldtVar.e.b().a(cardFrameLayout, ldtVar.q(jhyVar.f, jhyVar.g));
            cardFrameLayout.setOnClickListener(null);
            cardFrameLayout.setClickable(false);
            dih.I(cardFrameLayout, null);
            return;
        }
        if (!(jieVar instanceof jim)) {
            throw new koj();
        }
        ldt ldtVar2 = this.c;
        CardFrameLayout cardFrameLayout2 = dzvVar.t;
        ldtVar2.o(cardFrameLayout2, jhyVar.f, jhyVar.d, jhyVar.g);
        jim jimVar = (jim) jieVar;
        if (jimVar.f == null && jimVar.g == null) {
            dih.I(cardFrameLayout2, Button.class.getName());
        } else {
            dih.I(cardFrameLayout2, null);
        }
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        dzv dzvVar = (dzv) obj;
        jhy jhyVar = (jhy) obj2;
        dzvVar.getClass();
        jhyVar.getClass();
        kri kriVar = jhyVar.e;
        if (kriVar != null) {
            kriVar.a();
        }
        jie jieVar = jhyVar.a;
        if (jieVar instanceof jim) {
            this.a.c(dzvVar.u, new eai((jim) jieVar, jhyVar.d));
            dzvVar.v.setVisibility(0);
            dzvVar.w.setVisibility(8);
        } else {
            if (!(jieVar instanceof jih)) {
                throw new koj();
            }
            dzvVar.v.setVisibility(8);
            dzvVar.w.setVisibility(0);
        }
        CardFrameLayout cardFrameLayout = dzvVar.t;
        ColorDrawable colorDrawable = new ColorDrawable(((ehi) this.b.b()).a(jhyVar.c));
        Drawable drawable = cardFrameLayout.getContext().getDrawable(R.drawable.og_bento_ripple);
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        mutate.getClass();
        LayerDrawable layerDrawable = (LayerDrawable) mutate;
        layerDrawable.setDrawableByLayerId(R.id.ripple_background_color, colorDrawable);
        cardFrameLayout.setBackground(layerDrawable);
    }
}
