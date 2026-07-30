package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import q0.C4867b;
import q0.C4868c;

/* renamed from: com.google.android.gms.internal.ads.Ei, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2538Ei implements CD {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24790b = new C2538Ei(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24791c = new C2538Ei(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24792d = new C2538Ei(3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24793e = new C2538Ei(4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24794f = new C2538Ei(5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24795g = new C2538Ei(6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24796h = new C2538Ei(8);
    public static final /* synthetic */ C2538Ei i = new C2538Ei(9);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24797j = new C2538Ei(10);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24798k = new C2538Ei(11);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24799l = new C2538Ei(12);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24800m = new C2538Ei(13);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C2538Ei f24801n = new C2538Ei(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24802a;

    public /* synthetic */ C2538Ei(int i4) {
        this.f24802a = i4;
    }

    /* JADX WARN: Type inference failed for: r9v38, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        int i4 = 2;
        int i9 = -1;
        String str = "";
        int i10 = 0;
        String str2 = null;
        int i11 = 1;
        switch (this.f24802a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Pb)).booleanValue()) {
                    p2.j.f39798C.f39808h.f("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    p2.j.f39798C.f39808h.e("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                SB sb = UB.f27942u;
                return C3686oN.c(new C4867b(C3675oC.f33115x));
            case 1:
                t2.C.l("Error during loading assets.", (Exception) obj);
                return OD.f26665u;
            case 2:
                Throwable th2 = (ExecutionException) obj;
                if (th2.getCause() != null) {
                    th2 = th2.getCause();
                }
                return C3686oN.l(th2);
            case 3:
                return C3686oN.l(new C3275gp(5));
            case 4:
                return C3686oN.c(((C2511Cp) obj).f24249a);
            case 5:
                return OD.f26665u;
            case 6:
                Throwable th3 = (ExecutionException) obj;
                if (th3.getCause() != null) {
                    th3 = th3.getCause();
                }
                return C3686oN.l(th3);
            case 7:
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                AbstractC3212fg.f30738a.execute(new RunnableC3329hp(10, (InputStream) obj, createPipe[1]));
                return C3686oN.c(parcelFileDescriptor);
            case 8:
                return ((Throwable) obj) instanceof TimeoutException ? C3686oN.c(new Vr(Integer.toString(17), i11)) : C3686oN.c(new Vr(str2, i11));
            case 9:
                return C3686oN.c(new Vr((String) obj, i11));
            case 10:
                H2.b bVar = (H2.b) obj;
                return bVar == null ? C3686oN.c(new C3438js(str2, i9, i10)) : C3686oN.c(new C3438js(bVar.f1208a, bVar.f1209b, i10));
            case 11:
                C4867b c4867b = (C4867b) obj;
                if (c4867b == null) {
                    return C3686oN.c(new C3438js(str, i11, i11));
                }
                C3631nM A8 = C3685oM.A();
                for (C4868c c4868c : c4867b.f39880a) {
                    C3523lM A9 = C3577mM.A();
                    int i12 = c4868c.f39883c;
                    A9.h();
                    ((C3577mM) A9.f30000u).B(i12);
                    A9.h();
                    ((C3577mM) A9.f30000u).C(c4868c.f39882b);
                    A9.h();
                    ((C3577mM) A9.f30000u).D(c4868c.f39881a);
                    C3577mM c3577mM = (C3577mM) A9.j();
                    A8.h();
                    ((C3685oM) A8.f30000u).B(c3577mM);
                }
                return C3686oN.c(new C3438js(Base64.encodeToString(((C3685oM) A8.j()).b(), 1), i11, i11));
            case 12:
                H2.b bVar2 = (H2.b) obj;
                return bVar2 == null ? C3686oN.c(new C3438js(str2, i9, i4)) : C3686oN.c(new C3438js(bVar2.f1208a, bVar2.f1209b, i4));
            case 13:
                return OD.f26665u;
            case 14:
                return C3686oN.c("");
            default:
                Ny ny = (Ny) obj;
                return C3686oN.A(ny.d(), new C2670Me(8, ny), HD.f25326n);
        }
    }
}
