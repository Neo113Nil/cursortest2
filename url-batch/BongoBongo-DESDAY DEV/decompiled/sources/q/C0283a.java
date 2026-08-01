package q;

import java.util.concurrent.CancellationException;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0283a f3479b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0283a f3480c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3481a;

    static {
        if (g.d) {
            f3480c = null;
            f3479b = null;
        } else {
            f3480c = new C0283a(false, null);
            f3479b = new C0283a(true, null);
        }
    }

    public C0283a(boolean z2, CancellationException cancellationException) {
        this.f3481a = cancellationException;
    }
}
