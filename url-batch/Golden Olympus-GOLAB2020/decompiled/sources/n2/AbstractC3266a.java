package n2;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3266a {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f41377a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f41378b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i4 = 0; i4 < 4; i4++) {
            threadLocalArr[i4] = new ThreadLocal();
        }
        f41378b = threadLocalArr;
    }

    public static final boolean a() {
        return f41377a;
    }
}
