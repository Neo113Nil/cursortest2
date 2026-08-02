package defpackage;

import android.os.Bundle;
import com.google.apps.tiktok.concurrent.AndroidFuturesService;
import com.google.apps.tiktok.concurrent.InternalForegroundService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fsq implements jrw {
    private final /* synthetic */ int a;

    public fsq(int i) {
        this.a = i;
    }

    public static final gpm a() {
        fva fvaVar = new fva();
        gpl a = gpm.a();
        a.a = "AccountSyncData";
        a.d(fuz.a);
        a.c(fvaVar);
        return a.a();
    }

    public static String c(Bundle bundle) {
        hoq.y(bundle.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "String @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(String argument) overload.");
        String string = bundle.getString("TIKTOK_FRAGMENT_ARGUMENT");
        string.getClass();
        return string;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.a) {
            case 0:
                return new fso();
            case 1:
                return new bst((byte[]) null);
            case 2:
                return true;
            case 3:
                throw null;
            case 4:
                return "google";
            case 5:
                return new fxg();
            case 6:
                return new hum();
            case 7:
                return AndroidFuturesService.class;
            case 8:
                return new gam();
            case 9:
                return InternalForegroundService.class;
            case 10:
                gdc gdcVar = gdc.a;
                gdcVar.getClass();
                return gdcVar;
            case 11:
                return new cfe();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new hnu(null);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new giq();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new jqg();
            case 15:
                return new jqg();
            case 16:
                return new jqg();
            case 17:
                throw null;
            case 18:
                return new gob();
            case 19:
                gty aC = hoq.aC(200, "provideExtensionRegistry");
                try {
                    jkd a = jkd.a();
                    aC.close();
                    a.getClass();
                    return a;
                } catch (Throwable th) {
                    try {
                        aC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                return new iet(1);
        }
    }
}
