package defpackage;

import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hnb extends hmt {
    @Override // defpackage.hmt
    public hkq a(Class cls, int i) {
        return hkq.a;
    }

    @Override // defpackage.hmt
    public String b(Class cls) {
        boolean z;
        boolean z2;
        StackTraceElement a;
        z = hnd.a;
        if (z) {
            try {
                if (cls.equals(hnd.p())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        z2 = hnd.b;
        if (!z2 || (a = hom.a(cls, 1)) == null) {
            return null;
        }
        return a.getClassName();
    }
}
