package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0308a f3746b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0308a f3747c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3748a;

    static {
        if (g.f3758d) {
            f3747c = null;
            f3746b = null;
        } else {
            f3747c = new C0308a(false, null);
            f3746b = new C0308a(true, null);
        }
    }

    public C0308a(boolean z2, CancellationException cancellationException) {
        this.f3748a = cancellationException;
    }
}
