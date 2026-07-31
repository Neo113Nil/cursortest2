package m6;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f19320a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f19321b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f19322c;

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLong f19323d;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r0.equals("auto") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r0.equals("on") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    static {
        boolean a7;
        String d7 = kotlinx.coroutines.internal.z.d("kotlinx.coroutines.debug");
        boolean z6 = false;
        if (d7 != null) {
            int hashCode = d7.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    if (hashCode != 109935) {
                        if (hashCode == 3005871) {
                        }
                    } else if (d7.equals("off")) {
                        a7 = false;
                    }
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.debug' has unrecognized value '" + ((Object) d7) + '\'').toString());
            }
            f19321b = a7;
            if (a7 && kotlinx.coroutines.internal.z.e("kotlinx.coroutines.stacktrace.recovery", true)) {
                z6 = true;
            }
            f19322c = z6;
            f19323d = new AtomicLong(0L);
        }
        a7 = a();
        f19321b = a7;
        if (a7) {
            z6 = true;
        }
        f19322c = z6;
        f19323d = new AtomicLong(0L);
    }

    public static final boolean a() {
        return f19320a;
    }

    public static final AtomicLong b() {
        return f19323d;
    }

    public static final boolean c() {
        return f19321b;
    }

    public static final boolean d() {
        return f19322c;
    }
}
