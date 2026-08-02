package K;

import c3.C0297i;
import g3.EnumC0441a;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class W extends O {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h3.c cVar, Object obj) {
        V v;
        int i4;
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof V) {
            v = (V) cVar;
            int i5 = v.f1319e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                v.f1319e = i5 - Integer.MIN_VALUE;
                Object obj2 = v.f1317c;
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                i4 = v.f1319e;
                C0297i c0297i = C0297i.f5732a;
                if (i4 != 0) {
                    O3.l.w(obj2);
                    if (this.f1291b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f1290a);
                    try {
                        N.g gVar = N.g.f1792a;
                        j0 j0Var = new j0(fileOutputStream3);
                        v.f1315a = fileOutputStream3;
                        v.f1316b = fileOutputStream3;
                        v.f1319e = 1;
                        gVar.b(obj, j0Var);
                        if (c0297i == enumC0441a) {
                            return enumC0441a;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th2) {
                        fileOutputStream = fileOutputStream3;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = v.f1316b;
                    fileOutputStream = v.f1315a;
                    try {
                        O3.l.w(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            U.i.c(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                U.i.c(fileOutputStream, null);
                return c0297i;
            }
        }
        v = new V(this, cVar);
        Object obj22 = v.f1317c;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = v.f1319e;
        C0297i c0297i2 = C0297i.f5732a;
        if (i4 != 0) {
        }
        fileOutputStream2.getFD().sync();
        U.i.c(fileOutputStream, null);
        return c0297i2;
    }
}
