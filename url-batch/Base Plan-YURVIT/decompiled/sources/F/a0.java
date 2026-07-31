package F;

import a.AbstractC0086a;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class a0 extends S {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(I0.b bVar, Object obj) {
        Z z2;
        int i2;
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2;
        if (bVar instanceof Z) {
            z2 = (Z) bVar;
            int i3 = z2.f336l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z2.f336l = i3 - Integer.MIN_VALUE;
                Object obj2 = z2.f334j;
                i2 = z2.f336l;
                D0.h hVar = D0.h.f206a;
                if (i2 != 0) {
                    AbstractC0086a.I(obj2);
                    if (this.f306b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f305a);
                    try {
                        I.g gVar = I.g.f521a;
                        n0 n0Var = new n0(fileOutputStream3);
                        z2.f332h = fileOutputStream3;
                        z2.f333i = fileOutputStream3;
                        z2.f336l = 1;
                        gVar.b(obj, n0Var);
                        H0.a aVar = H0.a.f511e;
                        if (hVar == aVar) {
                            return aVar;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th2) {
                        fileOutputStream = fileOutputStream3;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = z2.f333i;
                    fileOutputStream = z2.f332h;
                    try {
                        AbstractC0086a.I(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            AbstractC0086a.g(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                AbstractC0086a.g(fileOutputStream, null);
                return hVar;
            }
        }
        z2 = new Z(this, bVar);
        Object obj22 = z2.f334j;
        i2 = z2.f336l;
        D0.h hVar2 = D0.h.f206a;
        if (i2 != 0) {
        }
        fileOutputStream2.getFD().sync();
        AbstractC0086a.g(fileOutputStream, null);
        return hVar2;
    }
}
