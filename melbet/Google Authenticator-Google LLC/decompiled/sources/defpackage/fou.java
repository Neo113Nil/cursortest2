package defpackage;

import android.graphics.RectF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fou extends fos {
    private boolean f = false;
    public float e = 0.0f;

    public fou(View view) {
        d(view);
    }

    private void d(View view) {
        view.setOutlineProvider(new fot(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0127  */
    @Override // defpackage.fos
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view) {
        boolean z;
        fog fogVar;
        fog fogVar2;
        RectF rectF;
        fog fogVar3 = this.b;
        this.e = (fogVar3 == null || (rectF = this.c) == null) ? 0.0f : fogVar3.c.a(rectF);
        if (this.c.isEmpty() || (fogVar2 = this.b) == null || !fogVar2.g(this.c)) {
            z = false;
            if (!this.c.isEmpty() && (fogVar = this.b) != null && this.a && !fogVar.g(this.c)) {
                fog fogVar4 = this.b;
                if ((fogVar4.j instanceof foe) && (fogVar4.k instanceof foe) && (fogVar4.m instanceof foe) && (fogVar4.l instanceof foe)) {
                    float a = fogVar4.b.a(this.c);
                    float a2 = this.b.c.a(this.c);
                    float a3 = this.b.e.a(this.c);
                    float a4 = this.b.d.a(this.c);
                    if (a == 0.0f && a3 == 0.0f && a2 == a4) {
                        RectF rectF2 = this.c;
                        rectF2.set(rectF2.left - a2, this.c.top, this.c.right, this.c.bottom);
                        this.e = a2;
                    } else if (a == 0.0f && a2 == 0.0f && a3 == a4) {
                        RectF rectF3 = this.c;
                        rectF3.set(rectF3.left, this.c.top - a3, this.c.right, this.c.bottom);
                        this.e = a3;
                    } else if (a2 == 0.0f && a4 == 0.0f && a == a3) {
                        RectF rectF4 = this.c;
                        rectF4.set(rectF4.left, this.c.top, this.c.right + a, this.c.bottom);
                        this.e = a;
                    } else if (a3 == 0.0f && a4 == 0.0f && a == a2) {
                        RectF rectF5 = this.c;
                        rectF5.set(rectF5.left, this.c.top, this.c.right, this.c.bottom + a);
                        this.e = a;
                    }
                }
            }
            this.f = z;
            view.setClipToOutline(!c());
            if (c()) {
                view.invalidateOutline();
                return;
            } else {
                view.invalidate();
                return;
            }
        }
        z = true;
        this.f = z;
        view.setClipToOutline(!c());
        if (c()) {
        }
    }

    @Override // defpackage.fos
    public final boolean c() {
        return !this.f;
    }
}
