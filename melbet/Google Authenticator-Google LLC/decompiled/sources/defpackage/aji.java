package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;
import java.util.logging.Logger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aji implements kri {
    private final /* synthetic */ int a;

    @Override // defpackage.kri
    public final Object a() {
        Class<?> returnType;
        switch (this.a) {
            case 0:
                return kow.a;
            case 1:
                return oh.c();
            case 2:
                return kow.a;
            case 3:
                int i = akt.h;
                return true;
            case 4:
                String[] strArr = ams.a;
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 5:
                String[] strArr2 = ams.a;
                try {
                    Method l = yj.l();
                    if (l != null && (returnType = l.getReturnType()) != null) {
                        Class<?> cls = Integer.TYPE;
                        return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                    }
                } catch (Throwable unused2) {
                }
                return null;
            case 6:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 7:
                avy avyVar = avy.a;
                return kow.a;
            case 8:
                return kow.a;
            case 9:
                Logger logger = gdi.a;
                return hkh.l("com/google/apps/tiktok/coroutines/TikTokExceptionHandlerKt");
            case 10:
                return true;
            case 11:
                return false;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return false;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "";
            case 15:
                return hkh.l("com/google/apps/tiktok/experiments/phenotype/PackageChangedListener");
            case 16:
                return "";
            default:
                return null;
        }
    }
}
