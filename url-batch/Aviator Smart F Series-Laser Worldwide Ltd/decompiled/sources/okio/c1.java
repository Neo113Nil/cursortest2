package okio;

/* loaded from: classes5.dex */
public abstract class c1 {
    public static final byte[] asUtf8ToByteArray(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(kotlin.text.d.UTF_8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m1451synchronized(Object lock, f6.a block) {
        R r8;
        kotlin.jvm.internal.s.checkNotNullParameter(lock, "lock");
        kotlin.jvm.internal.s.checkNotNullParameter(block, "block");
        synchronized (lock) {
            try {
                r8 = (R) block.invoke();
                kotlin.jvm.internal.r.finallyStart(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.r.finallyStart(1);
                kotlin.jvm.internal.r.finallyEnd(1);
                throw th;
            }
        }
        kotlin.jvm.internal.r.finallyEnd(1);
        return r8;
    }

    public static final String toUtf8String(byte[] bArr) {
        kotlin.jvm.internal.s.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, kotlin.text.d.UTF_8);
    }
}
