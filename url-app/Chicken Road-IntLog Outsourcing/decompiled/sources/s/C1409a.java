package s;

import java.util.concurrent.CancellationException;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1409a {

    /* renamed from: c, reason: collision with root package name */
    public static final C1409a f11724c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1409a f11725d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11726a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f11727b;

    static {
        if (g.f11741d) {
            f11725d = null;
            f11724c = null;
        } else {
            f11725d = new C1409a(false, null);
            f11724c = new C1409a(true, null);
        }
    }

    public C1409a(boolean z, CancellationException cancellationException) {
        this.f11726a = z;
        this.f11727b = cancellationException;
    }
}
