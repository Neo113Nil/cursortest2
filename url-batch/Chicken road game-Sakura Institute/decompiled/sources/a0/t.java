package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final t f139b = new t(0);

    /* renamed from: c, reason: collision with root package name */
    public static final t f140c = new t(1);

    /* renamed from: d, reason: collision with root package name */
    public static final s f141d = new s(0);

    /* renamed from: e, reason: collision with root package name */
    public static final s f142e = new s(1);

    /* renamed from: f, reason: collision with root package name */
    public static final s f143f = new s(2);

    /* renamed from: g, reason: collision with root package name */
    public static final s f144g = new s(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145a;

    public /* synthetic */ t(int i7) {
        this.f145a = i7;
    }

    @Override // a0.k
    public long a(p pVar, int i7) {
        switch (this.f145a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = ((a2.h0) pVar.f121e).f388a.f377a.f373f;
                return r4.a.h(w.g0.o(str, i7), w.g0.n(str, i7));
            default:
                return ((a2.h0) pVar.f121e).k(i7);
        }
    }
}
