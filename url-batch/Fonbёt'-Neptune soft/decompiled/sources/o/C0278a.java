package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0278a f3305b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0278a f3306c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3307a;

    static {
        if (g.f3318d) {
            f3306c = null;
            f3305b = null;
        } else {
            f3306c = new C0278a(false, null);
            f3305b = new C0278a(true, null);
        }
    }

    public C0278a(boolean z2, CancellationException cancellationException) {
        this.f3307a = cancellationException;
    }
}
