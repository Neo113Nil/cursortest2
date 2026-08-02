package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hor implements hop {
    private static final int c(StackTraceElement[] stackTraceElementArr, Class cls, int i) {
        String name = cls.getName();
        boolean z = false;
        while (i < stackTraceElementArr.length) {
            if (stackTraceElementArr[i].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // defpackage.hop
    public final StackTraceElement a(Class cls, int i) {
        hoq.g(i >= 0, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int c = c(stackTrace, cls, i + 1);
        if (c != -1) {
            return stackTrace[c];
        }
        return null;
    }

    @Override // defpackage.hop
    public final StackTraceElement[] b(Class cls, int i, int i2) {
        hoq.g(i == -1 || i > 0, "maxDepth must be > 0 or -1");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int c = c(stackTrace, cls, i2 + 1);
        if (c == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - c;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, c, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
