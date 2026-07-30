package e4;

import B2.N;
import M3.b;
import M3.c;
import M3.d;
import N3.e;
import N3.r;
import O7.S;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.h;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4472a implements e {

    /* renamed from: u, reason: collision with root package name */
    public static final C4472a f37328u = new C4472a(0);

    /* renamed from: v, reason: collision with root package name */
    public static final C4472a f37329v = new C4472a(1);

    /* renamed from: w, reason: collision with root package name */
    public static final C4472a f37330w = new C4472a(2);

    /* renamed from: x, reason: collision with root package name */
    public static final C4472a f37331x = new C4472a(3);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37332n;

    public /* synthetic */ C4472a(int i) {
        this.f37332n = i;
    }

    @Override // N3.e
    public final Object b(N n9) {
        switch (this.f37332n) {
            case 0:
                Object e6 = n9.e(new r(M3.a.class, Executor.class));
                h.d(e6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e6);
            case 1:
                Object e9 = n9.e(new r(c.class, Executor.class));
                h.d(e9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e9);
            case 2:
                Object e10 = n9.e(new r(b.class, Executor.class));
                h.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e10);
            default:
                Object e11 = n9.e(new r(d.class, Executor.class));
                h.d(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) e11);
        }
    }
}
