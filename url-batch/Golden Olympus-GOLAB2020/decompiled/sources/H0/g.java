package H0;

import K0.d;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f751b = ExecutorsUtils.newCachedThreadPool("GrsReqPool");

    /* renamed from: c, reason: collision with root package name */
    private static final Map f752c = new ConcurrentHashMap(16);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f753d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private F0.a f754a;

    class a implements Callable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J0.c f755b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f756c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ F0.c f757d;

        a(J0.c cVar, String str, F0.c cVar2) {
            this.f755b = cVar;
            this.f756c = str;
            this.f757d = cVar2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d call() {
            return new c(this.f755b, g.this.f754a).a(g.f751b, this.f756c, this.f757d);
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J0.c f759b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f760c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ F0.c f761d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f762e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ E0.b f763f;

        b(J0.c cVar, String str, F0.c cVar2, int i4, E0.b bVar) {
            this.f759b = cVar;
            this.f760c = str;
            this.f761d = cVar2;
            this.f762e = i4;
            this.f763f = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.e(gVar.b(this.f759b, this.f760c, this.f761d, this.f762e), this.f763f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(d dVar, E0.b bVar) {
        if (bVar != null) {
            if (dVar == null) {
                Logger.v("RequestController", "GrsResponse is null");
                bVar.a();
            } else {
                Logger.v("RequestController", "GrsResponse is not null");
                bVar.a(dVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
    
        if (r2.a() != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d b(J0.c cVar, String str, F0.c cVar2, int i4) {
        Future submit;
        String str2;
        String str3;
        Logger.d("RequestController", "request to server with service name is: " + str);
        String grsParasKey = cVar.c().getGrsParasKey(true, true, cVar.a());
        Logger.v("RequestController", "request spUrlKey: " + grsParasKey);
        synchronized (f753d) {
            try {
                if (NetworkUtil.isNetworkAvailable(cVar.a())) {
                    d.a a4 = K0.d.a(grsParasKey);
                    Map map = f752c;
                    J0.b bVar = (J0.b) map.get(grsParasKey);
                    try {
                        if (bVar != null && bVar.b()) {
                            submit = bVar.a();
                            if (i4 == -1) {
                                J0.d a5 = I0.a.a(cVar.a());
                                i4 = a5 != null ? a5.f() : 10;
                            }
                            Logger.i("RequestController", "use grsQueryTimeout %d", Integer.valueOf(i4));
                            return (d) submit.get(i4, TimeUnit.SECONDS);
                        }
                        return (d) submit.get(i4, TimeUnit.SECONDS);
                    } catch (InterruptedException e4) {
                        e = e4;
                        str2 = "RequestController";
                        str3 = "when check result, find InterruptedException, check others";
                        Logger.w(str2, str3, e);
                        return null;
                    } catch (CancellationException e5) {
                        e = e5;
                        str2 = "RequestController";
                        str3 = "when check result, find CancellationException, check others";
                        Logger.w(str2, str3, e);
                        return null;
                    } catch (ExecutionException e6) {
                        e = e6;
                        str2 = "RequestController";
                        str3 = "when check result, find ExecutionException, check others";
                        Logger.w(str2, str3, e);
                        return null;
                    } catch (TimeoutException e7) {
                        e = e7;
                        str2 = "RequestController";
                        str3 = "when check result, find TimeoutException, check others";
                        Logger.w(str2, str3, e);
                        return null;
                    } catch (Exception e8) {
                        e = e8;
                        str2 = "RequestController";
                        str3 = "when check result, find Other Exception, check others";
                        Logger.w(str2, str3, e);
                        return null;
                    }
                    Logger.d("RequestController", "hitGrsRequestBean == null or request block is released.");
                    submit = f751b.submit(new a(cVar, str, cVar2));
                    map.put(grsParasKey, new J0.b(submit));
                    if (i4 == -1) {
                    }
                    Logger.i("RequestController", "use grsQueryTimeout %d", Integer.valueOf(i4));
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(F0.a aVar) {
        this.f754a = aVar;
    }

    public void g(J0.c cVar, E0.b bVar, String str, F0.c cVar2, int i4) {
        f751b.execute(new b(cVar, str, cVar2, i4, bVar));
    }

    public void h(String str) {
        synchronized (f753d) {
            f752c.remove(str);
        }
    }
}
