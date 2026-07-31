package Q2;

import I2.f;
import O2.d;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        r0 = O2.a.a(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static R2.a a(String str) {
        d h4 = P2.a.h(str);
        if (h4 == null) {
            try {
                h4 = P2.a.i(new f(str));
            } catch (IllegalArgumentException unused) {
            }
            if (h4 == null && h4 == null) {
                try {
                    h4 = O2.a.b(new f(str));
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        if (h4 == null) {
            return null;
        }
        d dVar = h4;
        return new R2.a(str, dVar.d(), dVar.e(), dVar.g(), dVar.f(), dVar.h());
    }
}
