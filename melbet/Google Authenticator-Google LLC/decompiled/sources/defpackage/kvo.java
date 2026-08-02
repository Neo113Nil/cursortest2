package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvo {
    public static final boolean a;
    public static final boolean b;
    public static final AtomicLong c;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r0.equals("on") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    static {
        boolean z;
        String a2 = ldc.a("kotlinx.coroutines.debug");
        boolean z2 = true;
        if (a2 != null) {
            int hashCode = a2.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    if (hashCode == 109935) {
                    }
                }
                throw new IllegalStateException(a.Z(a2, "System property 'kotlinx.coroutines.debug' has unrecognized value '", "'"));
            }
            a = z;
            boolean z3 = lbp.a;
            if (!lbp.a && (!z || !jav.m("kotlinx.coroutines.stacktrace.recovery", false))) {
                z2 = false;
            }
            b = z2;
            c = new AtomicLong(0L);
        }
        z = false;
        a = z;
        boolean z32 = lbp.a;
        if (!lbp.a) {
            z2 = false;
        }
        b = z2;
        c = new AtomicLong(0L);
    }
}
