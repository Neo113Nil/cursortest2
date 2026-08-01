package f;

import java.util.concurrent.CancellationException;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0030a f506b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0030a f507c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f508a;

    static {
        if (AbstractFutureC0036g.f519d) {
            f507c = null;
            f506b = null;
        } else {
            f507c = new C0030a(false, null);
            f506b = new C0030a(true, null);
        }
    }

    public C0030a(boolean z2, CancellationException cancellationException) {
        this.f508a = cancellationException;
    }
}
