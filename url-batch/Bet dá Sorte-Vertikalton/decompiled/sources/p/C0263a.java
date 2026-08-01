package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0263a f3399b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0263a f3400c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3401a;

    static {
        if (g.d) {
            f3400c = null;
            f3399b = null;
        } else {
            f3400c = new C0263a(false, null);
            f3399b = new C0263a(true, null);
        }
    }

    public C0263a(boolean z2, CancellationException cancellationException) {
        this.f3401a = cancellationException;
    }
}
