package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0279a f3363b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0279a f3364c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3365a;

    static {
        if (g.d) {
            f3364c = null;
            f3363b = null;
        } else {
            f3364c = new C0279a(false, null);
            f3363b = new C0279a(true, null);
        }
    }

    public C0279a(boolean z2, CancellationException cancellationException) {
        this.f3365a = cancellationException;
    }
}
