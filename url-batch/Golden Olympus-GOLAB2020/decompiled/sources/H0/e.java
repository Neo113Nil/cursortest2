package H0;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import com.ironsource.b9;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e {

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f747b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f748c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONArray f749d;

        a(long j4, ArrayList arrayList, JSONArray jSONArray) {
            this.f747b = j4;
            this.f748c = arrayList;
            this.f749d = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            J0.a aVar = new J0.a();
            aVar.put("total_time", this.f747b);
            Iterator it = this.f748c.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.D() || dVar.B()) {
                    aVar.put(e.c(dVar));
                    it.remove();
                    break;
                }
            }
            if (this.f748c.size() > 0) {
                d dVar2 = (d) this.f748c.get(r1.size() - 1);
                aVar.put(e.c(dVar2));
                this.f748c.remove(dVar2);
            }
            if (this.f748c.size() > 0) {
                ArrayList arrayList = this.f748c;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    this.f749d.put(new JSONObject(e.c((d) obj)));
                }
            }
            if (this.f749d.length() > 0) {
                aVar.put("failed_info", this.f749d.toString());
            }
            Logger.d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(aVar.get()));
            HianalyticsHelper.getInstance().onEvent(aVar.get(), "grs_request");
        }
    }

    public static void b(ArrayList arrayList, long j4, JSONArray jSONArray, Context context) {
        if (context == null || arrayList == null || arrayList.size() <= 0 || !HianalyticsHelper.getInstance().isEnableReport(context)) {
            return;
        }
        HianalyticsHelper.getInstance().getReportExecutor().submit(new a(j4, arrayList, jSONArray));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkedHashMap c(d dVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception p4 = dVar.p();
        if (p4 != null) {
            linkedHashMapPack.put("error_code", ExceptionCode.getErrorCodeFromException(p4));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, p4.getClass().getSimpleName());
            linkedHashMapPack.put(CrashHianalyticsData.MESSAGE, StringUtils.anonymizeMessage(p4.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", dVar.f());
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, dVar.k());
        }
        try {
            linkedHashMapPack.put(b9.i.f15522D, new URL(dVar.A()).getHost());
        } catch (MalformedURLException e4) {
            Logger.w("HaReportHelper", "report host MalformedURLException", e4);
        }
        linkedHashMapPack.put("req_start_time", dVar.w());
        linkedHashMapPack.put("req_end_time", dVar.v());
        linkedHashMapPack.put("req_total_time", dVar.x());
        return linkedHashMapPack.getAll();
    }
}
