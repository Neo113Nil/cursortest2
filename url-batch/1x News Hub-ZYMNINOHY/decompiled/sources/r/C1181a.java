package r;

import java.util.concurrent.CancellationException;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1181a {

    /* renamed from: b, reason: collision with root package name */
    public static final C1181a f10241b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1181a f10242c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f10243a;

    static {
        if (g.f10253d) {
            f10242c = null;
            f10241b = null;
        } else {
            f10242c = new C1181a(false, null);
            f10241b = new C1181a(true, null);
        }
    }

    public C1181a(boolean z, CancellationException cancellationException) {
        this.f10243a = cancellationException;
    }
}
