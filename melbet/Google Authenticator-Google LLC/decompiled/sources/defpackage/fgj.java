package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgj {
    public final MaterialButton a;
    public fof b;
    public acu c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public boolean p;
    public RippleDrawable r;
    public int s;
    public kee t;
    public boolean o = false;
    public boolean q = true;

    public fgj(MaterialButton materialButton, fof fofVar) {
        this.a = materialButton;
        this.b = fofVar;
    }

    public final fob a(boolean z) {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (fob) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b() {
        this.o = true;
        MaterialButton materialButton = this.a;
        materialButton.e(this.k);
        materialButton.f(this.j);
    }

    public final void c(fof fofVar) {
        this.b = fofVar;
        d();
    }

    public final void d() {
        fob a = a(false);
        if (a != null) {
            a.Q(this.b);
            acu acuVar = this.c;
            if (acuVar != null) {
                a.K(acuVar);
            }
        }
        fob a2 = a(true);
        if (a2 != null) {
            a2.Q(this.b);
            acu acuVar2 = this.c;
            if (acuVar2 != null) {
                a2.K(acuVar2);
            }
        }
        RippleDrawable rippleDrawable = this.r;
        Cfor cfor = null;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
            if (findDrawableByLayerId instanceof Cfor) {
                cfor = (Cfor) findDrawableByLayerId;
            }
        }
        if (cfor != null) {
            if (!(cfor instanceof fob)) {
                cfor.bz(this.b.a());
                return;
            }
            fob fobVar = (fob) cfor;
            fobVar.Q(this.b);
            acu acuVar3 = this.c;
            if (acuVar3 != null) {
                fobVar.K(acuVar3);
            }
        }
    }

    public final void e(kee keeVar) {
        this.t = keeVar;
        fob a = a(false);
        if (a != null) {
            a.A = keeVar;
        }
    }
}
