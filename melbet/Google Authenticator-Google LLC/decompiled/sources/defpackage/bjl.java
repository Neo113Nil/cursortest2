package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjl extends bjd implements bds {
    public bjl(bjj bjjVar) {
        super(bjjVar);
    }

    @Override // defpackage.bdv
    public final int a() {
        bjn bjnVar = ((bjj) this.a).a.a;
        bav bavVar = (bav) bjnVar.a;
        return bavVar.a.limit() + bavVar.c.length + (bavVar.d.length * 4) + bjnVar.g;
    }

    @Override // defpackage.bdv
    public final Class b() {
        return bjj.class;
    }

    @Override // defpackage.bjd, defpackage.bds
    public final void d() {
        ((bjj) this.a).a().prepareToDraw();
    }

    @Override // defpackage.bdv
    public final void e() {
        bjj bjjVar = (bjj) this.a;
        bjjVar.stop();
        bjjVar.b = true;
        bjn bjnVar = bjjVar.a.a;
        bjnVar.b.clear();
        bjnVar.c();
        bjnVar.e();
        blk blkVar = bjnVar.j;
        if (blkVar != null) {
            bjnVar.c.f(blkVar);
            bjnVar.j = null;
        }
        blk blkVar2 = bjnVar.k;
        if (blkVar2 != null) {
            bjnVar.c.f(blkVar2);
            bjnVar.k = null;
        }
        blk blkVar3 = bjnVar.l;
        if (blkVar3 != null) {
            bjnVar.c.f(blkVar3);
            bjnVar.l = null;
        }
        bav bavVar = (bav) bjnVar.a;
        bavVar.f = null;
        byte[] bArr = bavVar.c;
        if (bArr != null) {
            bavVar.j.z(bArr);
        }
        int[] iArr = bavVar.d;
        if (iArr != null) {
            ((bek) bavVar.j.a).c(iArr);
        }
        Bitmap bitmap = bavVar.g;
        if (bitmap != null) {
            bavVar.j.y(bitmap);
        }
        bavVar.g = null;
        bavVar.a = null;
        bavVar.h = null;
        byte[] bArr2 = bavVar.b;
        if (bArr2 != null) {
            bavVar.j.z(bArr2);
        }
        bjnVar.e = true;
    }
}
