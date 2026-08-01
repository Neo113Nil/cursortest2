package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0278a f3269b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0278a f3270c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3271a;

    static {
        if (g.d) {
            f3270c = null;
            f3269b = null;
        } else {
            f3270c = new C0278a(false, null);
            f3269b = new C0278a(true, null);
        }
    }

    public C0278a(boolean z2, CancellationException cancellationException) {
        this.f3271a = cancellationException;
    }
}
