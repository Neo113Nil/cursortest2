package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0276a f3437b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0276a f3438c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3439a;

    static {
        if (g.d) {
            f3438c = null;
            f3437b = null;
        } else {
            f3438c = new C0276a(false, null);
            f3437b = new C0276a(true, null);
        }
    }

    public C0276a(boolean z2, CancellationException cancellationException) {
        this.f3439a = cancellationException;
    }
}
