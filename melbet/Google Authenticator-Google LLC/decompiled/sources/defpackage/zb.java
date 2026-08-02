package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zb implements View.OnApplyWindowInsetsListener {
    final yy a;
    private zz b;

    public zb(View view, yy yyVar) {
        zz zzVar;
        this.a = yyVar;
        int i = yq.a;
        zz a = yj.a(view);
        if (a != null) {
            zzVar = (Build.VERSION.SDK_INT >= 36 ? new zm(a) : Build.VERSION.SDK_INT >= 35 ? new zl(a) : Build.VERSION.SDK_INT >= 34 ? new zk(a) : Build.VERSION.SDK_INT >= 31 ? new zj(a) : Build.VERSION.SDK_INT >= 30 ? new zi(a) : Build.VERSION.SDK_INT >= 29 ? new zh(a) : new zg(a)).a();
        } else {
            zzVar = null;
        }
        this.b = zzVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.b = zz.q(windowInsets, view);
            return zc.a(view, windowInsets);
        }
        zz q = zz.q(windowInsets, view);
        zz zzVar = this.b;
        if (zzVar == null) {
            int i = yq.a;
            zzVar = yj.a(view);
            this.b = zzVar;
        }
        if (zzVar == null) {
            this.b = q;
            return zc.a(view, windowInsets);
        }
        yy b = zc.b(view);
        if (b != null && Objects.equals(b.a, q)) {
            return zc.a(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        zz zzVar2 = this.b;
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            vb f = q.f(i2);
            vb f2 = zzVar2.f(i2);
            int i3 = f.b;
            int i4 = f2.b;
            boolean z = i3 > i4 || f.c > f2.c || f.d > f2.d || f.e > f2.e;
            if (z != (i3 < i4 || f.c < f2.c || f.d < f2.d || f.e < f2.e)) {
                if (z) {
                    iArr[0] = iArr[0] | i2;
                } else {
                    iArr2[0] = iArr2[0] | i2;
                }
            }
        }
        int i5 = iArr[0];
        int i6 = iArr2[0];
        int i7 = i5 | i6;
        if (i7 == 0) {
            this.b = q;
            return zc.a(view, windowInsets);
        }
        zz zzVar3 = this.b;
        brn brnVar = new brn(i7, (i5 & 8) != 0 ? zc.a : (i6 & 8) != 0 ? zc.b : (i5 & 519) != 0 ? zc.c : (i6 & 519) != 0 ? zc.d : null, (i7 & 8) != 0 ? 160L : 250L);
        brnVar.L(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(((zf) brnVar.a).j());
        vb f3 = q.f(i7);
        vb f4 = zzVar3.f(i7);
        int i8 = f3.b;
        int i9 = f4.b;
        int i10 = f3.c;
        int i11 = f4.c;
        int i12 = f3.d;
        int i13 = f4.d;
        int i14 = f3.e;
        int i15 = f4.e;
        yx yxVar = new yx(vb.d(Math.min(i8, i9), Math.min(i10, i11), Math.min(i12, i13), Math.min(i14, i15)), vb.d(Math.max(i8, i9), Math.max(i10, i11), Math.max(i12, i13), Math.max(i14, i15)));
        zc.e(view, brnVar, q, false);
        duration.addUpdateListener(new yz(brnVar, q, zzVar3, i7, view));
        duration.addListener(new za(brnVar, view));
        xs.b(view, new fv(view, brnVar, yxVar, duration, 2));
        this.b = q;
        return zc.a(view, windowInsets);
    }
}
