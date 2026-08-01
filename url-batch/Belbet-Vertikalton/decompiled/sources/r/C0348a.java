package r;

import java.util.concurrent.CancellationException;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0348a f4011b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0348a f4012c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f4013a;

    static {
        if (g.f4022d) {
            f4012c = null;
            f4011b = null;
        } else {
            f4012c = new C0348a(false, null);
            f4011b = new C0348a(true, null);
        }
    }

    public C0348a(boolean z2, CancellationException cancellationException) {
        this.f4013a = cancellationException;
    }
}
