package O0;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.Calendar;
import java.util.UUID;

/* loaded from: classes.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    private long f1149a = 1800000;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f1150b = false;

    /* renamed from: c, reason: collision with root package name */
    private a f1151c = null;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        String f1152a = UUID.randomUUID().toString().replace("-", "");

        /* renamed from: b, reason: collision with root package name */
        boolean f1153b;

        /* renamed from: c, reason: collision with root package name */
        private long f1154c;

        a(long j4) {
            this.f1152a += BundleUtil.UNDERLINE_TAG + j4;
            this.f1154c = j4;
            this.f1153b = true;
            V.this.f1150b = false;
        }

        private boolean b(long j4, long j5) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j4);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j5);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        private void c(long j4) {
            j0.h("hmsSdk", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.f1152a = uuid;
            this.f1152a = uuid.replace("-", "");
            this.f1152a += BundleUtil.UNDERLINE_TAG + j4;
            this.f1154c = j4;
            this.f1153b = true;
        }

        private boolean d(long j4, long j5) {
            return j5 - j4 >= V.this.f1149a;
        }

        void a(long j4) {
            if (V.this.f1150b) {
                V.this.f1150b = false;
                c(j4);
            } else if (d(this.f1154c, j4) || b(this.f1154c, j4)) {
                c(j4);
            } else {
                this.f1154c = j4;
                this.f1153b = false;
            }
        }
    }

    public String a() {
        a aVar = this.f1151c;
        if (aVar != null) {
            return aVar.f1152a;
        }
        j0.m("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    void b(long j4) {
        a aVar = this.f1151c;
        if (aVar != null) {
            aVar.a(j4);
        } else {
            j0.h("hmsSdk", "Session is first flush");
            this.f1151c = new a(j4);
        }
    }

    public boolean f() {
        a aVar = this.f1151c;
        if (aVar != null) {
            return aVar.f1153b;
        }
        j0.m("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}
