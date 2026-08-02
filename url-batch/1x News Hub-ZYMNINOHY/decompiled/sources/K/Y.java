package K;

import a.AbstractC0129a;
import b2.C0195i;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class Y extends P {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, AbstractC0326c abstractC0326c) {
        X x3;
        int i3;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (abstractC0326c instanceof X) {
            x3 = (X) abstractC0326c;
            int i4 = x3.f737h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x3.f737h = i4 - Integer.MIN_VALUE;
                Object obj2 = x3.f;
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                i3 = x3.f737h;
                C0195i c0195i = C0195i.f2555a;
                if (i3 != 0) {
                    android.support.v4.media.session.a.T(obj2);
                    if (this.f711b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f710a);
                    try {
                        N.g gVar = N.g.f983a;
                        k0 k0Var = new k0(fileOutputStream3);
                        x3.f734d = fileOutputStream3;
                        x3.f735e = fileOutputStream3;
                        x3.f737h = 1;
                        gVar.b(obj, k0Var);
                        if (c0195i == enumC0317a) {
                            return enumC0317a;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = x3.f735e;
                    fileOutputStream = x3.f734d;
                    try {
                        android.support.v4.media.session.a.T(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AbstractC0129a.h(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                AbstractC0129a.h(fileOutputStream, null);
                return c0195i;
            }
        }
        x3 = new X(this, abstractC0326c);
        Object obj22 = x3.f;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = x3.f737h;
        C0195i c0195i2 = C0195i.f2555a;
        if (i3 != 0) {
        }
        fileOutputStream2.getFD().sync();
        AbstractC0129a.h(fileOutputStream, null);
        return c0195i2;
    }
}
