package a6;

import b5.b;
import b5.c;
import b5.d;
import c7.s0;
import com.android.installreferrer.api.InstallReferrerClient;
import e5.f;
import e5.t;
import e5.v;
import java.util.concurrent.Executor;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f519b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f520c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f521d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f522e = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f523a;

    public /* synthetic */ a(int i7) {
        this.f523a = i7;
    }

    @Override // e5.f
    public final Object b(v vVar) {
        switch (this.f523a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object d8 = vVar.d(new t(b5.a.class, Executor.class));
                k.e(d8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new s0((Executor) d8);
            case 1:
                Object d9 = vVar.d(new t(c.class, Executor.class));
                k.e(d9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new s0((Executor) d9);
            case 2:
                Object d10 = vVar.d(new t(b.class, Executor.class));
                k.e(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new s0((Executor) d10);
            default:
                Object d11 = vVar.d(new t(d.class, Executor.class));
                k.e(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new s0((Executor) d11);
        }
    }
}
