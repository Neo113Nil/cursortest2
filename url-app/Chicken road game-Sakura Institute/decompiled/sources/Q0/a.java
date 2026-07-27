package Q0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3917c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f3918d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3919a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f3920b;

    static {
        if (h.f3932j) {
            f3918d = null;
            f3917c = null;
        } else {
            f3918d = new a(false, null);
            f3917c = new a(true, null);
        }
    }

    public a(boolean z4, CancellationException cancellationException) {
        this.f3919a = z4;
        this.f3920b = cancellationException;
    }
}
