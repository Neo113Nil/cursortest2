package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class Rz implements XA {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Rz f27455b = new Rz(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Rz f27456c = new Rz(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Rz f27457d = new Rz(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Rz f27458e = new Rz(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Rz f27459f = new Rz(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Rz f27460g = new Rz(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27461a;

    public /* synthetic */ Rz(int i) {
        this.f27461a = i;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final Object apply(Object obj) {
        switch (this.f27461a) {
            case 0:
                return null;
            case 1:
                return Xz.b(5);
            case 2:
                C3904sQ c3904sQ = (C3904sQ) obj;
                int i = TP.f27747Q;
                String str = c3904sQ.f34244a;
                int length = String.valueOf(str).length();
                String str2 = c3904sQ.f34245b;
                return D.y.o(new StringBuilder(length + 2 + String.valueOf(str2).length()), str, ": ", str2);
            case 3:
                O0 o02 = (O0) obj;
                o02.getClass();
                return o02.getClass().getSimpleName();
            case 4:
                return UB.n(AbstractC2655Lg.s(((AQ) obj).p().f29711b, f27460g));
            default:
                C3041cR c3041cR = C3041cR.f29709d;
                return Integer.valueOf(((B8) obj).f23999c);
        }
    }
}
