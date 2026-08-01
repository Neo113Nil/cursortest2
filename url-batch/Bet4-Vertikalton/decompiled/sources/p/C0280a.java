package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0280a f3411b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0280a f3412c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3413a;

    static {
        if (g.d) {
            f3412c = null;
            f3411b = null;
        } else {
            f3412c = new C0280a(false, null);
            f3411b = new C0280a(true, null);
        }
    }

    public C0280a(boolean z2, CancellationException cancellationException) {
        this.f3413a = cancellationException;
    }
}
