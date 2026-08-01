package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0295a f3607b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0295a f3608c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3609a;

    static {
        if (g.d) {
            f3608c = null;
            f3607b = null;
        } else {
            f3608c = new C0295a(false, null);
            f3607b = new C0295a(true, null);
        }
    }

    public C0295a(boolean z2, CancellationException cancellationException) {
        this.f3609a = cancellationException;
    }
}
