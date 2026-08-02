package I;

import a.AbstractC0132a;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class a0 extends S {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, J0.b bVar) {
        Z z2;
        int i2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (bVar instanceof Z) {
            z2 = (Z) bVar;
            int i3 = z2.f617l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z2.f617l = i3 - Integer.MIN_VALUE;
                Object obj2 = z2.f615j;
                I0.a aVar = I0.a.f733e;
                i2 = z2.f617l;
                F0.h hVar = F0.h.f469a;
                if (i2 != 0) {
                    i1.a.G(obj2);
                    if (this.f587b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f586a);
                    try {
                        L.g gVar = L.g.f764a;
                        m0 m0Var = new m0(fileOutputStream3);
                        z2.f613h = fileOutputStream3;
                        z2.f614i = fileOutputStream3;
                        z2.f617l = 1;
                        gVar.b(obj, m0Var);
                        if (hVar == aVar) {
                            return aVar;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = z2.f614i;
                    fileOutputStream = z2.f613h;
                    try {
                        i1.a.G(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AbstractC0132a.k(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                AbstractC0132a.k(fileOutputStream, null);
                return hVar;
            }
        }
        z2 = new Z(this, bVar);
        Object obj22 = z2.f615j;
        I0.a aVar2 = I0.a.f733e;
        i2 = z2.f617l;
        F0.h hVar2 = F0.h.f469a;
        if (i2 != 0) {
        }
        fileOutputStream2.getFD().sync();
        AbstractC0132a.k(fileOutputStream, null);
        return hVar2;
    }
}
