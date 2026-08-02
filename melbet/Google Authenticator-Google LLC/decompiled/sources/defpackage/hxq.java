package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hxq implements hyw {
    private final /* synthetic */ int a;

    @Override // defpackage.hyw
    public final Object a() {
        switch (this.a) {
            case 0:
                hwz hwzVar = hxr.a;
                ids idsVar = new ids((char[]) null);
                idsVar.e();
                idsVar.f(32);
                idsVar.g();
                idsVar.a = hwy.a;
                return idsVar.d();
            case 1:
                hwz hwzVar2 = hxr.a;
                ids idsVar2 = new ids((char[]) null);
                idsVar2.e();
                idsVar2.f(16);
                idsVar2.g();
                idsVar2.a = hwy.a;
                return idsVar2.d();
            case 2:
                hwz hwzVar3 = hxr.a;
                ids idsVar3 = new ids((byte[]) null, (byte[]) null);
                idsVar3.i();
                idsVar3.j(16);
                idsVar3.k();
                idsVar3.a = hwt.a;
                return idsVar3.h();
            case 3:
                hwz hwzVar4 = hxr.a;
                ids idsVar4 = new ids((byte[]) null, (byte[]) null);
                idsVar4.i();
                idsVar4.j(32);
                idsVar4.k();
                idsVar4.a = hwt.a;
                return idsVar4.h();
            case 4:
                hwz hwzVar5 = hxr.a;
                hwm hwmVar = new hwm();
                hwmVar.b(16);
                hwmVar.c();
                hwmVar.e(16);
                hwmVar.d();
                hwmVar.e = hwn.c;
                hwmVar.f = hwo.a;
                return hwmVar.a();
            case 5:
                hwz hwzVar6 = hxr.a;
                hwm hwmVar2 = new hwm();
                hwmVar2.b(32);
                hwmVar2.c();
                hwmVar2.e(32);
                hwmVar2.d();
                hwmVar2.e = hwn.c;
                hwmVar2.f = hwo.a;
                return hwmVar2.a();
            case 6:
                hwz hwzVar7 = hxr.a;
                return new hxv(hxu.a, 12);
            case 7:
                hwz hwzVar8 = hxr.a;
                return new hxv(hxu.b, 12);
            case 8:
                hwz hwzVar9 = hxr.a;
                return new hxv(hxu.b, 8);
            case 9:
                hyt hytVar = new hyt();
                hytVar.c(new bry(hym.class, (char[]) null));
                hytVar.a(new bry(hyn.class, (char[]) null));
                return hytVar;
            case 10:
                hzi hziVar = hzl.a;
                ids idsVar5 = new ids((byte[]) null);
                idsVar5.b(32);
                idsVar5.c(16);
                idsVar5.a = hzh.a;
                idsVar5.d = hzg.c;
                return idsVar5.a();
            case 11:
                hzi hziVar2 = hzl.a;
                ids idsVar6 = new ids((byte[]) null);
                idsVar6.b(32);
                idsVar6.c(16);
                idsVar6.a = hzh.d;
                idsVar6.d = hzg.c;
                return idsVar6.a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                hzi hziVar3 = hzl.a;
                ids idsVar7 = new ids((byte[]) null);
                idsVar7.b(32);
                idsVar7.c(32);
                idsVar7.a = hzh.a;
                idsVar7.d = hzg.c;
                return idsVar7.a();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                hzi hziVar4 = hzl.a;
                ids idsVar8 = new ids((byte[]) null);
                idsVar8.b(64);
                idsVar8.c(32);
                idsVar8.a = hzh.a;
                idsVar8.d = hzg.e;
                return idsVar8.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                hzi hziVar5 = hzl.a;
                ids idsVar9 = new ids((byte[]) null);
                idsVar9.b(64);
                idsVar9.c(64);
                idsVar9.a = hzh.a;
                idsVar9.d = hzg.e;
                return idsVar9.a();
            case 15:
                hzi hziVar6 = hzl.a;
                iyh iyhVar = new iyh(null);
                iyhVar.b();
                iyhVar.c();
                iyhVar.a = hza.a;
                return iyhVar.a();
            default:
                hzi hziVar7 = hzl.a;
                iyh iyhVar2 = new iyh(null);
                iyhVar2.b();
                iyhVar2.c();
                iyhVar2.a = hza.d;
                return iyhVar2.a();
        }
    }
}
