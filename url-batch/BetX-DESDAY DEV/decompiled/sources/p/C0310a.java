package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0310a f3750b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0310a f3751c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3752a;

    static {
        if (g.f3762d) {
            f3751c = null;
            f3750b = null;
        } else {
            f3751c = new C0310a(false, null);
            f3750b = new C0310a(true, null);
        }
    }

    public C0310a(boolean z2, CancellationException cancellationException) {
        this.f3752a = cancellationException;
    }
}
