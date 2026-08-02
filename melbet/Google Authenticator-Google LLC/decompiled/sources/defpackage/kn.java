package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kn extends ko {
    @Override // defpackage.ko
    public final int a(View view) {
        return ky.bv(view) + ((kz) view.getLayoutParams()).bottomMargin;
    }

    @Override // defpackage.ko
    public final int b(View view) {
        kz kzVar = (kz) view.getLayoutParams();
        return ky.bi(view) + kzVar.topMargin + kzVar.bottomMargin;
    }

    @Override // defpackage.ko
    public final int c(View view) {
        kz kzVar = (kz) view.getLayoutParams();
        return ky.bj(view) + kzVar.leftMargin + kzVar.rightMargin;
    }

    @Override // defpackage.ko
    public final int d(View view) {
        return ky.by(view) - ((kz) view.getLayoutParams()).topMargin;
    }

    @Override // defpackage.ko
    public final int e() {
        return this.a.D;
    }

    @Override // defpackage.ko
    public final int f() {
        ky kyVar = this.a;
        return kyVar.D - kyVar.az();
    }

    @Override // defpackage.ko
    public final int g() {
        return this.a.az();
    }

    @Override // defpackage.ko
    public final int h() {
        return this.a.B;
    }

    @Override // defpackage.ko
    public final int i() {
        return this.a.A;
    }

    @Override // defpackage.ko
    public final int j() {
        return this.a.aC();
    }

    @Override // defpackage.ko
    public final int k() {
        ky kyVar = this.a;
        return (kyVar.D - kyVar.aC()) - kyVar.az();
    }

    @Override // defpackage.ko
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.bottom;
    }

    @Override // defpackage.ko
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.top;
    }

    @Override // defpackage.ko
    public final void n(int i) {
        this.a.aM(i);
    }
}
