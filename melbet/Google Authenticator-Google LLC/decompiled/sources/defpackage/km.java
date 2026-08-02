package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class km extends ko {
    @Override // defpackage.ko
    public final int a(View view) {
        return ky.bx(view) + ((kz) view.getLayoutParams()).rightMargin;
    }

    @Override // defpackage.ko
    public final int b(View view) {
        kz kzVar = (kz) view.getLayoutParams();
        return ky.bj(view) + kzVar.leftMargin + kzVar.rightMargin;
    }

    @Override // defpackage.ko
    public final int c(View view) {
        kz kzVar = (kz) view.getLayoutParams();
        return ky.bi(view) + kzVar.topMargin + kzVar.bottomMargin;
    }

    @Override // defpackage.ko
    public final int d(View view) {
        return ky.bw(view) - ((kz) view.getLayoutParams()).leftMargin;
    }

    @Override // defpackage.ko
    public final int e() {
        return this.a.C;
    }

    @Override // defpackage.ko
    public final int f() {
        ky kyVar = this.a;
        return kyVar.C - kyVar.aB();
    }

    @Override // defpackage.ko
    public final int g() {
        return this.a.aB();
    }

    @Override // defpackage.ko
    public final int h() {
        return this.a.A;
    }

    @Override // defpackage.ko
    public final int i() {
        return this.a.B;
    }

    @Override // defpackage.ko
    public final int j() {
        return this.a.aA();
    }

    @Override // defpackage.ko
    public final int k() {
        ky kyVar = this.a;
        return (kyVar.C - kyVar.aA()) - kyVar.aB();
    }

    @Override // defpackage.ko
    public final int l(View view) {
        Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.right;
    }

    @Override // defpackage.ko
    public final int m(View view) {
        Rect rect = this.c;
        this.a.bo(view, rect);
        return rect.left;
    }

    @Override // defpackage.ko
    public final void n(int i) {
        this.a.aL(i);
    }
}
