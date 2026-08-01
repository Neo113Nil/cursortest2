package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0281a f3383b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0281a f3384c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3385a;

    static {
        if (g.d) {
            f3384c = null;
            f3383b = null;
        } else {
            f3384c = new C0281a(false, null);
            f3383b = new C0281a(true, null);
        }
    }

    public C0281a(boolean z2, CancellationException cancellationException) {
        this.f3385a = cancellationException;
    }
}
