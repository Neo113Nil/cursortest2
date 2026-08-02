package defpackage;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dvm implements krt {
    private final /* synthetic */ int a;

    public /* synthetic */ dvm(int i) {
        this.a = i;
    }

    @Override // defpackage.krt
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                Map map = dvq.a;
                ((View) obj).getClass();
                return jiv.a;
            case 1:
                Map map2 = dvq.a;
                ((View) obj).getClass();
                return jiv.a;
            case 2:
                duz duzVar = (duz) obj;
                duzVar.getClass();
                return Integer.valueOf(duzVar.a());
            case 3:
                return iwo.c(obj);
            case 4:
                return iwo.c(obj);
            case 5:
                return iwo.c(obj);
            case 6:
                return iwo.c(obj);
            case 7:
                return iwo.c(obj);
            case 8:
                return iwo.c(obj);
            case 9:
                return iwo.c(obj);
            case 10:
                Activity activity = (Activity) obj;
                activity.getClass();
                return activity.getIntent();
            case 11:
                Activity activity2 = (Activity) obj;
                activity2.getClass();
                return Boolean.valueOf(activity2.isFinishing());
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Activity activity3 = (Activity) obj;
                activity3.getClass();
                return Boolean.valueOf(activity3.isChangingConfigurations());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((String) obj).getClass();
                return new LinkedHashMap();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Exception) obj).getClass();
                return null;
            case 15:
                ghr ghrVar = (ghr) obj;
                ghrVar.getClass();
                return Boolean.valueOf(ghrVar.a());
            case 16:
                String str = (String) obj;
                str.getClass();
                return str;
            case 17:
                cnf cnfVar = (cnf) obj;
                cnfVar.getClass();
                return Integer.valueOf(Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot. GMS Core version too old.", cnfVar));
            case 18:
                etq etqVar = (etq) obj;
                etqVar.getClass();
                if (etqVar.a == 29501) {
                    return null;
                }
                throw etqVar;
            case 19:
                ghh ghhVar = (ghh) obj;
                ghhVar.getClass();
                return ghhVar.b().c;
            default:
                cnf cnfVar2 = (cnf) obj;
                cnfVar2.getClass();
                return Integer.valueOf(Log.w("RegisterInternal", "GMS Core version too old", cnfVar2));
        }
    }
}
