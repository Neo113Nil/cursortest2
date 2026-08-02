package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eka extends hmx {
    private final fwm a;

    public eka(fwm fwmVar, gzp gzpVar) {
        super("");
        this.a = fwmVar;
    }

    @Override // defpackage.hmx, defpackage.hlw
    public final void a(RuntimeException runtimeException, hlu hluVar) {
        Log.e("PrimesFloggerBackend", "Internal logging error", runtimeException);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    @Override // defpackage.hlw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(hlu hluVar) {
        ejy ejyVar;
        ejz ejzVar;
        int i;
        int i2;
        Long l;
        Boolean bool = (Boolean) hluVar.k().d(ejx.a);
        if (bool != null && bool.booleanValue()) {
            hmw l2 = hluVar.l();
            String obj = l2 == null ? hluVar.m().toString() : l2.b;
            String e = hluVar.f().e();
            if (e != null && (l = (Long) hluVar.k().d(ejx.c)) != null) {
                ejyVar = new ejy(hluVar.o(), obj, e, l.longValue());
                if (hluVar.l() != null) {
                    ejzVar = new ejz(hluVar.f().b(), hluVar.f().d(), hluVar.f().a(), hluVar.e(), ejyVar);
                } else {
                    Object[] B = hluVar.B();
                    int i3 = 0;
                    for (Object obj2 : B) {
                        if (ejz.a(obj2)) {
                            i3++;
                        }
                    }
                    if (i3 == 0) {
                        ejzVar = new ejz(hluVar.f().b(), hluVar.f().d(), hluVar.f().a(), hluVar.e(), ejyVar);
                    } else {
                        int[] iArr = new int[i3];
                        String[] strArr = new String[i3];
                        int i4 = 0;
                        for (int i5 = 0; i5 < B.length; i5++) {
                            Object obj3 = B[i5];
                            if (ejz.a(obj3)) {
                                iArr[i4] = i5;
                                strArr[i4] = obj3 == null ? "null" : ((ekl) obj3).b();
                                i4++;
                            }
                        }
                        ejzVar = new ejz(hluVar.f().b(), hluVar.f().d(), hluVar.f().a(), hluVar.e(), iArr, strArr, ejyVar);
                    }
                }
                ekg ekgVar = (ekg) ((ThreadLocal) this.a.a).get();
                i = ekgVar.b;
                ekgVar.a.set(i % 20, ejzVar);
                if (i != Integer.MAX_VALUE) {
                    int i6 = ekgVar.d;
                    i2 = 28;
                } else {
                    i2 = i + 1;
                }
                ekgVar.b = i2;
                ekgVar.c = i2;
            }
        }
        ejyVar = null;
        if (hluVar.l() != null) {
        }
        ekg ekgVar2 = (ekg) ((ThreadLocal) this.a.a).get();
        i = ekgVar2.b;
        ekgVar2.a.set(i % 20, ejzVar);
        if (i != Integer.MAX_VALUE) {
        }
        ekgVar2.b = i2;
        ekgVar2.c = i2;
    }

    @Override // defpackage.hlw
    public final boolean c(Level level) {
        return true;
    }
}
