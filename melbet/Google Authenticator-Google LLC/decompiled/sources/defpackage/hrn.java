package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrn implements jks {
    private final /* synthetic */ int v;
    public static final jks u = new hrn(20);
    public static final jks t = new hrn(19);
    public static final jks s = new hrn(18);
    public static final jks r = new hrn(17);
    public static final jks q = new hrn(16);
    public static final jks p = new hrn(15);
    public static final jks o = new hrn(14);
    public static final jks n = new hrn(13);
    public static final jks m = new hrn(12);
    public static final jks l = new hrn(11);
    public static final jks k = new hrn(10);
    public static final jks j = new hrn(9);
    public static final jks i = new hrn(8);
    public static final jks h = new hrn(7);
    public static final jks g = new hrn(6);
    public static final jks f = new hrn(5);
    public static final jks e = new hrn(4);
    public static final jks d = new hrn(3);
    public static final jks c = new hrn(2);
    public static final jks b = new hrn(1);
    public static final jks a = new hrn(0);

    private hrn(int i2) {
        this.v = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0089 A[RETURN] */
    @Override // defpackage.jks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return hoq.q(i2) != 0;
            case 1:
                return a.G(i2);
            case 2:
                return iac.b(i2) != null;
            case 3:
                return a.F(i2);
            case 4:
                return a.E(i2);
            case 5:
                return a.F(i2);
            case 6:
                return ikg.m(i2) != 0;
            case 7:
                return a.E(i2);
            case 8:
                return a.F(i2);
            case 9:
                return a.E(i2);
            case 10:
                return a.C(i2) != 0;
            case 11:
                return ije.b(i2) != null;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return a.F(i2);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return a.F(i2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.E(i2);
            case 15:
                return a.H(i2) != 0;
            case 16:
                return a.F(i2);
            case 17:
                return ijq.b(i2) != null;
            case 18:
                return a.E(i2);
            case 19:
                return a.z(i2) != 0;
            default:
                if (a.H(i2) != 0) {
                    return true;
                }
                break;
        }
    }
}
