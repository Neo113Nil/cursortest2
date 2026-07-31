package Q0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3093b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f3094c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3095a;

    static {
        if (g.f3106d) {
            f3094c = null;
            f3093b = null;
        } else {
            f3094c = new a(false, null);
            f3093b = new a(true, null);
        }
    }

    public a(boolean z3, CancellationException cancellationException) {
        this.f3095a = cancellationException;
    }
}
