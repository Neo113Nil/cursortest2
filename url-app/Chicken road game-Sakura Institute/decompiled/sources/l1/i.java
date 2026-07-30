package l1;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final i0.d f5811a;

    public i(int i7) {
        switch (i7) {
            case 1:
                this.f5811a = new i0.d(new o.h[16]);
                break;
            case 2:
                this.f5811a = new i0.d(new s.h[16]);
                break;
            default:
                this.f5811a = new i0.d(new h[16]);
                break;
        }
    }

    public boolean a(i.l lVar, p1.p pVar, androidx.room.c cVar, boolean z8) {
        i0.d dVar = this.f5811a;
        int i7 = dVar.f4842h;
        if (i7 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f4840f;
        int i8 = 0;
        boolean z9 = false;
        do {
            z9 = ((h) objArr[i8]).a(lVar, pVar, cVar, z8) || z9;
            i8++;
        } while (i8 < i7);
        return z9;
    }

    public void b(CancellationException cancellationException) {
        i0.d dVar = this.f5811a;
        int i7 = dVar.f4842h;
        c7.f[] fVarArr = new c7.f[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            fVarArr[i8] = ((o.h) dVar.f4840f[i8]).f6628b;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            fVarArr[i9].g(cancellationException);
        }
        if (!dVar.l()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public void c(androidx.room.c cVar) {
        i0.d dVar = this.f5811a;
        int i7 = dVar.f4842h;
        while (true) {
            i7--;
            if (-1 >= i7) {
                return;
            }
            if (((h) dVar.f4840f[i7]).f5804c.f5525b == 0) {
                dVar.o(i7);
            }
        }
    }

    public void d() {
        int i7 = 0;
        while (true) {
            i0.d dVar = this.f5811a;
            if (i7 >= dVar.f4842h) {
                return;
            }
            h hVar = (h) dVar.f4840f[i7];
            if (hVar.f5803b.f8116r) {
                i7++;
                hVar.d();
            } else {
                hVar.f();
                dVar.o(i7);
            }
        }
    }

    public void e() {
        i0.d dVar = this.f5811a;
        int i7 = 0;
        int i8 = new w6.d(0, dVar.f4842h - 1, 1).f9522g;
        if (i8 >= 0) {
            while (true) {
                ((o.h) dVar.f4840f[i7]).f6628b.resumeWith(d6.z.f2639a);
                if (i7 == i8) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        dVar.h();
    }
}
