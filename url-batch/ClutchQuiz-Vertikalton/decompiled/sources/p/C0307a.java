package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0307a f3371b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0307a f3372c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3373a;

    static {
        if (g.d) {
            f3372c = null;
            f3371b = null;
        } else {
            f3372c = new C0307a(false, null);
            f3371b = new C0307a(true, null);
        }
    }

    public C0307a(boolean z2, CancellationException cancellationException) {
        this.f3373a = cancellationException;
    }
}
