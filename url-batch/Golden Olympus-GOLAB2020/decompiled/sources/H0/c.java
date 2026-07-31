package H0;

import K0.d;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class c {

    /* renamed from: l, reason: collision with root package name */
    private static final String f720l = "c";

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f721a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f722b;

    /* renamed from: c, reason: collision with root package name */
    private final F0.a f723c;

    /* renamed from: d, reason: collision with root package name */
    private d f724d;

    /* renamed from: i, reason: collision with root package name */
    private final J0.c f729i;

    /* renamed from: e, reason: collision with root package name */
    private final Map f725e = new ConcurrentHashMap(16);

    /* renamed from: f, reason: collision with root package name */
    private final List f726f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final JSONArray f727g = new JSONArray();

    /* renamed from: h, reason: collision with root package name */
    private final List f728h = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private String f730j = "";

    /* renamed from: k, reason: collision with root package name */
    private long f731k = 1;

    public c(J0.c cVar, F0.a aVar) {
        this.f729i = cVar;
        this.f721a = cVar.c();
        this.f722b = cVar.a();
        this.f723c = aVar;
        h();
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094 A[LOOP:0: B:2:0x0004->B:13:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private d b(ExecutorService executorService, List list, String str, F0.c cVar) {
        String str2;
        F0.c cVar2;
        boolean z4;
        ExecutionException executionException;
        d dVar;
        d dVar2 = null;
        int i4 = 0;
        while (true) {
            if (i4 >= list.size()) {
                break;
            }
            String str3 = (String) list.get(i4);
            if (TextUtils.isEmpty(str3)) {
                str2 = str;
                cVar2 = cVar;
            } else {
                str2 = str;
                cVar2 = cVar;
                Future submit = executorService.submit(new a(str3, i4, this, this.f722b, str2, this.f721a, cVar2).g());
                this.f725e.put(str3, submit);
                z4 = true;
                try {
                    dVar = (d) submit.get(this.f731k, TimeUnit.SECONDS);
                } catch (InterruptedException e4) {
                    e = e4;
                } catch (CancellationException unused) {
                } catch (ExecutionException e5) {
                    executionException = e5;
                } catch (TimeoutException unused2) {
                }
                if (dVar != null) {
                    try {
                        if (!dVar.D()) {
                            if (dVar.B()) {
                            }
                        }
                        Logger.i(f720l, "grs request return body is not null and is OK.");
                        dVar2 = dVar;
                    } catch (InterruptedException e6) {
                        e = e6;
                        dVar2 = dVar;
                        Logger.w(f720l, "the current thread was interrupted while waiting", e);
                        if (!z4) {
                        }
                    } catch (CancellationException unused3) {
                        dVar2 = dVar;
                        Logger.i(f720l, "{requestServer} the computation was cancelled");
                        if (!z4) {
                        }
                    } catch (ExecutionException e7) {
                        executionException = e7;
                        dVar2 = dVar;
                        Logger.w(f720l, "the computation threw an ExecutionException", executionException);
                        z4 = false;
                        if (!z4) {
                        }
                    } catch (TimeoutException unused4) {
                        dVar2 = dVar;
                        Logger.w(f720l, "the wait timed out");
                        z4 = false;
                        if (!z4) {
                        }
                    }
                    if (!z4) {
                        Logger.v(f720l, "needBreak is true so need break current circulation");
                        break;
                    }
                    i4++;
                    str = str2;
                    cVar = cVar2;
                }
                dVar2 = dVar;
            }
            z4 = false;
            if (!z4) {
            }
        }
        return g(dVar2);
    }

    private void f(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        String grsReqParamJoint = this.f721a.getGrsReqParamJoint(false, false, j(), this.f722b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sb.append("?");
            sb.append(grsReqParamJoint);
        }
        this.f728h.add(sb.toString());
    }

    private d g(d dVar) {
        String str;
        String str2;
        for (Map.Entry entry : this.f725e.entrySet()) {
            if (dVar != null && (dVar.D() || dVar.B())) {
                break;
            }
            try {
                dVar = (d) ((Future) entry.getValue()).get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e4) {
                e = e4;
                str = f720l;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(f720l, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e5) {
                e = e5;
                str = f720l;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(f720l, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!((Future) entry.getValue()).isCancelled()) {
                    ((Future) entry.getValue()).cancel(true);
                }
            }
        }
        return dVar;
    }

    private void h() {
        J0.d a4 = I0.a.a(this.f722b);
        if (a4 == null) {
            Logger.w(f720l, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        e(a4);
        List<String> a5 = a4.a();
        if (a5 == null || a5.size() <= 0) {
            Logger.v(f720l, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (a5.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        String e4 = a4.e();
        if (a5.size() > 0) {
            for (String str : a5) {
                if (str.startsWith("https://")) {
                    f(e4, str);
                } else {
                    Logger.w(f720l, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.v(f720l, "request to GRS server url is {%s}", this.f728h);
    }

    private void i() {
        String grsParasKey = this.f721a.getGrsParasKey(true, true, this.f722b);
        this.f730j = this.f723c.a().a(grsParasKey + "ETag", "");
    }

    private String j() {
        G0.b a4 = G0.b.a(this.f722b.getPackageName());
        N0.a b4 = a4 != null ? a4.b() : null;
        if (b4 == null) {
            return "";
        }
        String b5 = b4.b();
        Logger.v(f720l, "get appName from local assets is{%s}", b5);
        return b5;
    }

    public d a(ExecutorService executorService, String str, F0.c cVar) {
        if (this.f728h.isEmpty()) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d b4 = b(executorService, this.f728h, str, cVar);
        Logger.i(f720l, "use 2.0 interface return http's code is：{%d}", Integer.valueOf(b4 == null ? 0 : b4.f()));
        e.b(new ArrayList(this.f726f), SystemClock.elapsedRealtime() - elapsedRealtime, this.f727g, this.f722b);
        this.f726f.clear();
        return b4;
    }

    public String c() {
        return this.f730j;
    }

    public synchronized void d(d dVar) {
        try {
            this.f726f.add(dVar);
            d dVar2 = this.f724d;
            if (dVar2 == null || (!dVar2.D() && !this.f724d.B())) {
                if (dVar.C()) {
                    Logger.i(f720l, "GRS server open 503 limiting strategy.");
                    K0.d.b(this.f721a.getGrsParasKey(true, true, this.f722b), new d.a(dVar.z(), SystemClock.elapsedRealtime()));
                    return;
                }
                if (dVar.B()) {
                    Logger.i(f720l, "GRS server open 304 Not Modified.");
                }
                if (!dVar.D() && !dVar.B()) {
                    Logger.v(f720l, "grsResponseResult has exception so need return");
                    return;
                }
                this.f724d = dVar;
                this.f723c.d(this.f721a, dVar, this.f722b, this.f729i);
                for (Map.Entry entry : this.f725e.entrySet()) {
                    if (!((String) entry.getKey()).equals(dVar.A()) && !((Future) entry.getValue()).isCancelled()) {
                        Logger.i(f720l, "future cancel");
                        ((Future) entry.getValue()).cancel(true);
                    }
                }
                return;
            }
            Logger.v(f720l, "grsResponseResult is ok");
        } catch (Throwable th) {
            throw th;
        }
    }

    public void e(J0.d dVar) {
    }
}
