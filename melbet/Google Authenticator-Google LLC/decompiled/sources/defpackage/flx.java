package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.google.android.apps.authenticator2.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class flx extends flt {
    public static final /* synthetic */ int c = 0;
    public final flv a;
    public final flw b;
    private Drawable d;

    public flx(Context context, flb flbVar, flv flvVar, flw flwVar) {
        super(context, flbVar);
        this.a = flvVar;
        this.b = flwVar;
        flwVar.j = this;
    }

    public static flx a(Context context, fln flnVar, flc flcVar) {
        flx flxVar = new flx(context, flnVar, flcVar, flnVar.q == 1 ? new flm(context, flnVar) : new flh(flnVar));
        flxVar.d = aqq.b(context.getResources(), R.drawable.ic_mtrl_arrow_circle, null);
        return flxVar;
    }

    private final boolean b() {
        return this.p != null && fny.o(this.i.getContentResolver()) == 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123 A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        List list;
        Drawable drawable;
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(this.o)) {
            return;
        }
        if (b() && (drawable = this.d) != null) {
            drawable.setBounds(getBounds());
            this.d.setTint(this.j.e[0]);
            this.d.draw(canvas);
            return;
        }
        canvas.save();
        flv flvVar = this.a;
        Canvas canvas2 = canvas;
        flvVar.h(canvas2, getBounds(), f(), k(), j());
        flb flbVar = this.j;
        int i3 = flbVar.i;
        int i4 = this.n;
        boolean z2 = (flbVar instanceof fmg) || ((flbVar instanceof fln) && ((fln) flbVar).u);
        if (!z2 || i3 != 0) {
            z = false;
        } else if (flbVar.c(false)) {
            i3 = 0;
            z = false;
        } else {
            i3 = 0;
            z = true;
        }
        if (z) {
            flvVar.f(canvas2, this.m, 0.0f, 1.0f, flbVar.f, i4, 0);
        } else if (z2) {
            List list2 = this.b.k;
            flu fluVar = (flu) list2.get(0);
            flu fluVar2 = (flu) list2.get(list2.size() - 1);
            if (flvVar instanceof fly) {
                Paint paint = this.m;
                i = i3;
                flvVar.f(canvas2, paint, 0.0f, fluVar.a, flbVar.f, i4, i);
                flvVar.f(canvas2, paint, fluVar2.b, 1.0f, flbVar.f, i4, i);
            } else {
                i = i3;
                canvas2.save();
                canvas2.rotate(fluVar2.g);
                flvVar.f(canvas2, this.m, fluVar2.b, 1.0f + fluVar.a, flbVar.f, i4, i);
                canvas2.restore();
            }
            i2 = 0;
            while (true) {
                list = this.b.k;
                if (i2 < list.size()) {
                    canvas2.restore();
                    return;
                }
                flu fluVar3 = (flu) list.get(i2);
                fluVar3.f = g();
                flv flvVar2 = flvVar;
                Paint paint2 = this.m;
                flvVar2.e(canvas2, paint2, fluVar3, this.n);
                if (i2 <= 0 || z || !z2) {
                    flvVar = flvVar2;
                } else {
                    Canvas canvas3 = canvas2;
                    flvVar2.f(canvas3, paint2, ((flu) list.get(i2 - 1)).b, fluVar3.a, flbVar.f, i4, i);
                    flvVar = flvVar2;
                    canvas2 = canvas3;
                }
                i2++;
            }
        }
        i = i3;
        i2 = 0;
        while (true) {
            list = this.b.k;
            if (i2 < list.size()) {
            }
            i2++;
        }
    }

    @Override // defpackage.flt
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean e = super.e(z, z2, z3);
        if (b() && (drawable = this.d) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.b.a();
        }
        if (z && z3) {
            this.b.f();
        }
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.flt, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
