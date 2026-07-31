package c4;

import java.io.PrintStream;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    private static final l1 f2038a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f2039b;

    static final class a extends l1 {
        a() {
        }

        @Override // c4.l1
        public final void a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    static {
        Integer num;
        l1 aVar;
        try {
            num = a();
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        if (num != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                PrintStream printStream = System.err;
                String name = a.class.getName();
                StringBuilder sb = new StringBuilder(name.length() + 133);
                sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb.append(name);
                sb.append("will be used. The error is: ");
                printStream.println(sb.toString());
                th.printStackTrace(System.err);
                aVar = new a();
                f2038a = aVar;
                f2039b = num != null ? num.intValue() : 1;
            }
            if (num.intValue() >= 19) {
                aVar = new r1();
                f2038a = aVar;
                f2039b = num != null ? num.intValue() : 1;
            }
        }
        aVar = Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true ? new p1() : new a();
        f2038a = aVar;
        f2039b = num != null ? num.intValue() : 1;
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e7) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e7.printStackTrace(System.err);
            return null;
        }
    }

    public static void b(Throwable th, Throwable th2) {
        f2038a.a(th, th2);
    }
}
