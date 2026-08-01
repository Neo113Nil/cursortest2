package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0282a f3366b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0282a f3367c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3368a;

    static {
        if (g.d) {
            f3367c = null;
            f3366b = null;
        } else {
            f3367c = new C0282a(false, null);
            f3366b = new C0282a(true, null);
        }
    }

    public C0282a(boolean z2, CancellationException cancellationException) {
        this.f3368a = cancellationException;
    }
}
