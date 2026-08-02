package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kw implements mm {
    final /* synthetic */ ky a;
    private final /* synthetic */ int b;

    public kw(ky kyVar, int i) {
        this.b = i;
        this.a = kyVar;
    }

    @Override // defpackage.mm
    public final int a(View view) {
        int bv;
        int i;
        if (this.b != 0) {
            kz kzVar = (kz) view.getLayoutParams();
            bv = ky.bx(view);
            i = kzVar.rightMargin;
        } else {
            kz kzVar2 = (kz) view.getLayoutParams();
            bv = ky.bv(view);
            i = kzVar2.bottomMargin;
        }
        return bv + i;
    }

    @Override // defpackage.mm
    public final int b(View view) {
        int by;
        int i;
        if (this.b != 0) {
            kz kzVar = (kz) view.getLayoutParams();
            by = ky.bw(view);
            i = kzVar.leftMargin;
        } else {
            kz kzVar2 = (kz) view.getLayoutParams();
            by = ky.by(view);
            i = kzVar2.topMargin;
        }
        return by - i;
    }

    @Override // defpackage.mm
    public final int c() {
        int i;
        int az;
        int i2 = this.b;
        ky kyVar = this.a;
        if (i2 != 0) {
            i = kyVar.C;
            az = kyVar.aB();
        } else {
            i = kyVar.D;
            az = kyVar.az();
        }
        return i - az;
    }

    @Override // defpackage.mm
    public final int d() {
        int i = this.b;
        ky kyVar = this.a;
        return i != 0 ? kyVar.aA() : kyVar.aC();
    }

    @Override // defpackage.mm
    public final View e(int i) {
        int i2 = this.b;
        ky kyVar = this.a;
        return i2 != 0 ? kyVar.aF(i) : kyVar.aF(i);
    }
}
