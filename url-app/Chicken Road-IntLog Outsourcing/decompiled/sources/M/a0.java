package M;

import java.io.FileOutputStream;
import l4.EnumC1260a;
import m4.AbstractC1295c;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class a0 extends S {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, AbstractC1295c abstractC1295c) {
        Z z;
        int i2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (abstractC1295c instanceof Z) {
            z = (Z) abstractC1295c;
            int i3 = z.f1661e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z.f1661e = i3 - Integer.MIN_VALUE;
                Object obj2 = z.f1659c;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = z.f1661e;
                f4.v vVar = f4.v.f5689a;
                if (i2 != 0) {
                    e5.g.y(obj2);
                    if (this.f1631b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f1630a);
                    try {
                        P.g gVar = P.g.f2275a;
                        m0 m0Var = new m0(fileOutputStream3);
                        z.f1657a = fileOutputStream3;
                        z.f1658b = fileOutputStream3;
                        z.f1661e = 1;
                        gVar.b(obj, m0Var);
                        if (vVar == enumC1260a) {
                            return enumC1260a;
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
                    fileOutputStream2 = z.f1658b;
                    fileOutputStream = z.f1657a;
                    try {
                        e5.g.y(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AbstractC1477a.e(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                AbstractC1477a.e(fileOutputStream, null);
                return vVar;
            }
        }
        z = new Z(this, abstractC1295c);
        Object obj22 = z.f1659c;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = z.f1661e;
        f4.v vVar2 = f4.v.f5689a;
        if (i2 != 0) {
        }
        fileOutputStream2.getFD().sync();
        AbstractC1477a.e(fileOutputStream, null);
        return vVar2;
    }
}
