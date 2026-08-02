package defpackage;

import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class eig implements koe {
    private final /* synthetic */ int a;

    public /* synthetic */ eig(int i) {
        this.a = i;
    }

    @Override // defpackage.koe, defpackage.kod
    public final Object b() {
        switch (this.a) {
            case 0:
                return new ent(null);
            case 1:
                return new eob(null);
            case 2:
                return new eoy(null);
            case 3:
                return eqr.d().a();
            case 4:
                epy d = epz.d();
                d.d = 2;
                return d.a();
            case 5:
                eqv d2 = eqw.d();
                d2.e = 2;
                return d2.a();
            case 6:
                eqq d3 = ell.d();
                d3.b = 2;
                return d3.b();
            case 7:
                era d4 = erc.d();
                d4.c = 2;
                return d4.a();
            case 8:
                emy d5 = emz.d();
                d5.d = 2;
                return d5.a();
            case 9:
                return new emu(null);
            case 10:
                return epk.d().a();
            case 11:
                return ggo.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return hjb.a;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return hjb.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return hel.q(new ieo());
            case 15:
                return hel.q(new ieo());
            default:
                ifv ifvVar = ifv.a;
                return Optional.empty();
        }
    }
}
