package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0283a f3304b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0283a f3305c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3306a;

    static {
        if (g.d) {
            f3305c = null;
            f3304b = null;
        } else {
            f3305c = new C0283a(false, null);
            f3304b = new C0283a(true, null);
        }
    }

    public C0283a(boolean z2, CancellationException cancellationException) {
        this.f3306a = cancellationException;
    }
}
