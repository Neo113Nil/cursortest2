package f;

import java.util.concurrent.CancellationException;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0028a f562b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0028a f563c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f564a;

    static {
        if (AbstractFutureC0034g.f575d) {
            f563c = null;
            f562b = null;
        } else {
            f563c = new C0028a(false, null);
            f562b = new C0028a(true, null);
        }
    }

    public C0028a(boolean z, CancellationException cancellationException) {
        this.f564a = cancellationException;
    }
}
