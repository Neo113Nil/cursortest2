package r;

import java.util.concurrent.CancellationException;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0258a f3403b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0258a f3404c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3405a;

    static {
        if (g.d) {
            f3404c = null;
            f3403b = null;
        } else {
            f3404c = new C0258a(false, null);
            f3403b = new C0258a(true, null);
        }
    }

    public C0258a(boolean z2, CancellationException cancellationException) {
        this.f3405a = cancellationException;
    }
}
