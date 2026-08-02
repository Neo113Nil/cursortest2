package kotlin.time;

/* loaded from: classes3.dex */
public abstract class DurationJvmKt {
    public static final ThreadLocal[] precisionFormats;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal();
        }
        precisionFormats = threadLocalArr;
    }
}
