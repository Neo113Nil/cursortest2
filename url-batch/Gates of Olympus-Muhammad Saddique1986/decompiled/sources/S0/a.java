package S0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4286b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f4287c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f4288a;

    static {
        if (g.f4299d) {
            f4287c = null;
            f4286b = null;
        } else {
            f4287c = new a(false, null);
            f4286b = new a(true, null);
        }
    }

    public a(boolean z3, CancellationException cancellationException) {
        this.f4288a = cancellationException;
    }
}
