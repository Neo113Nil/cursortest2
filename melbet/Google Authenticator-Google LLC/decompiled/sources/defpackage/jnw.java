package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnw implements jks {
    private final /* synthetic */ int v;
    public static final jks u = new jnw(20);
    public static final jks t = new jnw(19);
    public static final jks s = new jnw(18);
    public static final jks r = new jnw(17);
    public static final jks q = new jnw(16);
    public static final jks p = new jnw(15);
    public static final jks o = new jnw(14);
    public static final jks n = new jnw(13);
    public static final jks m = new jnw(12);
    public static final jks l = new jnw(11);
    public static final jks k = new jnw(10);
    public static final jks j = new jnw(9);
    public static final jks i = new jnw(8);
    public static final jks h = new jnw(7);
    public static final jks g = new jnw(6);
    public static final jks f = new jnw(5);
    public static final jks e = new jnw(4);
    public static final jks d = new jnw(3);
    public static final jks c = new jnw(2);
    public static final jks b = new jnw(1);
    public static final jks a = new jnw(0);

    private jnw(int i2) {
        this.v = i2;
    }

    @Override // defpackage.jks
    public final boolean a(int i2) {
        jkr jkrVar = null;
        switch (this.v) {
            case 0:
                return imm.a(i2) != 0;
            case 1:
                return a.B(i2) != 0;
            case 2:
                return a.F(i2);
            case 3:
                return imn.a(i2) != 0;
            case 4:
                return a.G(i2);
            case 5:
                switch (i2) {
                    case 0:
                        jkrVar = jom.NOT_SET;
                        break;
                    case 1:
                        jkrVar = jom.CPS_APP_PROCESS_GLOBAL_PROVIDER;
                        break;
                    case 2:
                        jkrVar = jom.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER;
                        break;
                    case 3:
                        jkrVar = jom.LOGGER_OVERRIDE_PROVIDER;
                        break;
                    case 4:
                        jkrVar = jom.LOGGER_DEFERRING_PROVIDER;
                        break;
                    case 5:
                        jkrVar = jom.EVENT_OVERRIDE;
                        break;
                    case 6:
                        jkrVar = jom.EVENT_DEFERRING;
                        break;
                    case 7:
                        jkrVar = jom.LOG_SOURCE_MAPPED;
                        break;
                    case 8:
                        jkrVar = jom.SERVER_INFRASTRUCTURE;
                        break;
                    case 9:
                        jkrVar = jom.LOG_REQUEST_SETTER_WEB;
                        break;
                    case 10:
                        jkrVar = jom.PRIVACY_CONTEXT_RESOLVER;
                        break;
                }
                return jkrVar != null;
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return true;
                    default:
                        return false;
                }
            case 7:
                return jav.h(i2) != 0;
            case 8:
                return a.z(i2) != 0;
            case 9:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 10:
                switch (i2) {
                    case 0:
                        jkrVar = leu.UNKNOWN;
                        break;
                    case 1:
                        jkrVar = leu.SUCCESS;
                        break;
                    case 2:
                        jkrVar = leu.FAILURE;
                        break;
                    case 3:
                        jkrVar = leu.CANCELED;
                        break;
                    case 4:
                        jkrVar = leu.TIMEOUT;
                        break;
                    case 5:
                        jkrVar = leu.INTERRUPTED;
                        break;
                    case 6:
                        jkrVar = leu.INCOMPLETE;
                        break;
                }
                return jkrVar != null;
            case 11:
                return a.C(i2) != 0;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return jav.g(i2) != 0;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return i2 == 0 || i2 == 1;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.E(i2);
            case 15:
                return a.B(i2) != 0;
            case 16:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        return true;
                    default:
                        return false;
                }
            case 17:
                return a.F(i2);
            case 18:
                return a.E(i2);
            case 19:
                return a.G(i2);
            default:
                return a.E(i2);
        }
    }
}
