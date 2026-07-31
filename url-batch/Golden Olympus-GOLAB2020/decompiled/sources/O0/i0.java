package O0;

import android.content.Context;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i0 implements InterfaceRunnableC0421v {

    /* renamed from: b, reason: collision with root package name */
    private Context f1224b = Y.q();

    /* renamed from: c, reason: collision with root package name */
    private String f1225c;

    /* renamed from: d, reason: collision with root package name */
    private String f1226d;

    /* renamed from: e, reason: collision with root package name */
    private String f1227e;

    public i0(String str, String str2, String str3) {
        this.f1225c = str;
        this.f1226d = str2;
        this.f1227e = str3;
    }

    private void a(String str, List list) {
        Pair b4 = P.b(str);
        new h0(list, (String) b4.first, (String) b4.second, this.f1227e).a();
    }

    @Override // java.lang.Runnable
    public void run() {
        Map b4;
        j0.b("hmsSdk", "eventReportTask is running");
        boolean a4 = AbstractC0408h.a(this.f1224b);
        if (a4) {
            j0.h("hmsSdk", "workKey is refresh,begin report all data");
            this.f1226d = "alltype";
        }
        try {
            try {
                b4 = AbstractC0409i.b(this.f1224b, this.f1225c, this.f1226d);
            } catch (IllegalArgumentException e4) {
                j0.l("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e4.getMessage());
                if ("alltype".equals(this.f1226d)) {
                    AbstractC0413m.d(this.f1224b, "stat_v2_1", new String[0]);
                    AbstractC0413m.d(this.f1224b, "cached_v2_1", new String[0]);
                } else {
                    String d4 = P.d(this.f1225c, this.f1226d);
                    AbstractC0413m.d(this.f1224b, "stat_v2_1", d4);
                    AbstractC0413m.d(this.f1224b, "cached_v2_1", d4);
                }
            } catch (Exception e5) {
                j0.l("hmsSdk", "readEventRecords handData Exception:" + e5.getMessage());
                if ("alltype".equals(this.f1226d)) {
                    AbstractC0413m.d(this.f1224b, "stat_v2_1", new String[0]);
                    AbstractC0413m.d(this.f1224b, "cached_v2_1", new String[0]);
                } else {
                    String d5 = P.d(this.f1225c, this.f1226d);
                    AbstractC0413m.d(this.f1224b, "stat_v2_1", d5);
                    AbstractC0413m.d(this.f1224b, "cached_v2_1", d5);
                }
            }
            if (b4.size() == 0) {
                j0.f("hmsSdk", "no events to report, tag: %s, type: %s", this.f1225c, this.f1226d);
                if ("alltype".equals(this.f1226d)) {
                    AbstractC0413m.d(this.f1224b, "stat_v2_1", new String[0]);
                    AbstractC0413m.d(this.f1224b, "cached_v2_1", new String[0]);
                    return;
                } else {
                    String d6 = P.d(this.f1225c, this.f1226d);
                    AbstractC0413m.d(this.f1224b, "stat_v2_1", d6);
                    AbstractC0413m.d(this.f1224b, "cached_v2_1", d6);
                    return;
                }
            }
            for (Map.Entry entry : b4.entrySet()) {
                a((String) entry.getKey(), (List) entry.getValue());
            }
            if ("alltype".equals(this.f1226d)) {
                AbstractC0413m.d(this.f1224b, "stat_v2_1", new String[0]);
                AbstractC0413m.d(this.f1224b, "cached_v2_1", new String[0]);
            } else {
                String d7 = P.d(this.f1225c, this.f1226d);
                AbstractC0413m.d(this.f1224b, "stat_v2_1", d7);
                AbstractC0413m.d(this.f1224b, "cached_v2_1", d7);
            }
            if (a4) {
                j0.h("hmsSdk", "refresh local key");
                T.g().d();
            }
        } catch (Throwable th) {
            if ("alltype".equals(this.f1226d)) {
                AbstractC0413m.d(this.f1224b, "stat_v2_1", new String[0]);
                AbstractC0413m.d(this.f1224b, "cached_v2_1", new String[0]);
            } else {
                String d8 = P.d(this.f1225c, this.f1226d);
                AbstractC0413m.d(this.f1224b, "stat_v2_1", d8);
                AbstractC0413m.d(this.f1224b, "cached_v2_1", d8);
            }
            throw th;
        }
    }
}
