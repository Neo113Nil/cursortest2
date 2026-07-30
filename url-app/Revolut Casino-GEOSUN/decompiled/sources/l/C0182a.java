package l;

import java.util.concurrent.CancellationException;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0182a f2681b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0182a f2682c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f2683a;

    static {
        if (AbstractFutureC0188g.f2694d) {
            f2682c = null;
            f2681b = null;
        } else {
            f2682c = new C0182a(false, null);
            f2681b = new C0182a(true, null);
        }
    }

    public C0182a(boolean z2, CancellationException cancellationException) {
        this.f2683a = cancellationException;
    }
}
