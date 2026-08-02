package defpackage;

import android.util.Log;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ghz implements krt {
    private final /* synthetic */ int a;

    public /* synthetic */ ghz(int i) {
        this.a = i;
    }

    @Override // defpackage.krt
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return ixc.k(list);
            case 1:
                ghr ghrVar = (ghr) obj;
                ghrVar.getClass();
                return Boolean.valueOf(ghrVar.a());
            case 2:
                ghr ghrVar2 = (ghr) obj;
                ghrVar2.getClass();
                return Boolean.valueOf(ghrVar2.a());
            case 3:
                iae iaeVar = (iae) obj;
                iaeVar.getClass();
                return iaeVar.g;
            case 4:
                iae iaeVar2 = (iae) obj;
                iaeVar2.getClass();
                return iaeVar2.g;
            case 5:
                cnf cnfVar = (cnf) obj;
                cnfVar.getClass();
                return Integer.valueOf(Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot", cnfVar));
            case 6:
                iwq iwqVar = gjw.m;
                ((Exception) obj).getClass();
                return false;
            case 7:
                iwq iwqVar2 = gjw.m;
                return hnu.aJ(true);
            case 8:
                jww jwwVar = (jww) obj;
                jwwVar.getClass();
                return jwwVar.d(idg.a, true);
            case 9:
                jww jwwVar2 = (jww) obj;
                jwwVar2.getClass();
                return jwwVar2;
            case 10:
                obj.getClass();
                return oh.c();
            case 11:
                return Boolean.valueOf(obj == null);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                String str = (String) obj;
                str.getClass();
                return str;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                kql kqlVar = (kql) obj;
                if (kqlVar instanceof kvj) {
                    return (kvj) kqlVar;
                }
                return null;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                kql kqlVar2 = (kql) obj;
                if (kqlVar2 instanceof kwm) {
                    return (kwm) kqlVar2;
                }
                return null;
            case 15:
                return obj;
            default:
                int i = lck.a;
                return null;
        }
    }
}
