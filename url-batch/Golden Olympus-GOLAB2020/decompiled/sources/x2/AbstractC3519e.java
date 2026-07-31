package x2;

import t2.G;
import t2.J;

/* renamed from: x2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3519e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f46703a;

    /* renamed from: b, reason: collision with root package name */
    private static final G f46704b;

    /* renamed from: c, reason: collision with root package name */
    private static final G f46705c;

    /* renamed from: d, reason: collision with root package name */
    private static final G f46706d;

    /* renamed from: e, reason: collision with root package name */
    private static final G f46707e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f46708f;

    static {
        int e4;
        int e5;
        e4 = J.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f46703a = e4;
        f46704b = new G("PERMIT");
        f46705c = new G("TAKEN");
        f46706d = new G("BROKEN");
        f46707e = new G("CANCELLED");
        e5 = J.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f46708f = e5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3520f h(long j4, C3520f c3520f) {
        return new C3520f(j4, c3520f, 0);
    }
}
