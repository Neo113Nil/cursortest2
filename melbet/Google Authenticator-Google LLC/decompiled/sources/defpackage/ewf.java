package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import com.google.apps.tiktok.concurrent.InternalForegroundService;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ewf implements hac {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ewf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [hac, java.lang.Object] */
    @Override // defpackage.hac
    public final Object bB() {
        int i = 5;
        int i2 = 4;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ewg ewgVar = (ewg) obj;
                hvm hvmVar = (hvm) ewgVar.d.bB();
                hvmVar.getClass();
                etp etpVar = (etp) ewgVar.c.bB();
                etpVar.getClass();
                hvi f = hti.f(hso.f(hvc.v(etpVar.d()), etq.class, new esh(i), hvmVar), new euy(obj, i), hvmVar);
                f.c(new evp(f, i2), hvmVar);
                return f;
            case 1:
                eth ethVar = eti.a;
                return esz.a((Context) this.a);
            case 2:
                hvm hvmVar2 = (hvm) this.a.bB();
                hvmVar2.getClass();
                return hvmVar2.schedule(new bws(6), 10000L, TimeUnit.MILLISECONDS);
            case 3:
                gaj gajVar = (gaj) this.a;
                Map map = gajVar.c;
                String a = gajVar.a();
                hoq.K(map.containsKey(a), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", a);
                return new Intent(gajVar.b, (Class<?>) ((koe) map.get(a)).b());
            case 4:
                gaj gajVar2 = (gaj) this.a;
                koe koeVar = (koe) gajVar2.d.get(gajVar2.a());
                if (koeVar != null) {
                    return (Class) koeVar.b();
                }
                ((hkf) ((hkf) gaj.a.g()).i("com/google/apps/tiktok/concurrent/AndroidFutures", "getForegroundService", 345, "AndroidFutures.java")).s("Calling attachForegroundService from non-main-process opens the main process which might be unintentional. Instead load and call the generated_android_futures_services macro for this process.");
                return InternalForegroundService.class;
            case 5:
                Object obj2 = this.a;
                return ((LayoutInflater) ((glx) obj2).getBaseContext().getSystemService("layout_inflater")).cloneInContext((Context) obj2);
            case 6:
                fea e = ((fee) ((ldt) this.a).a).e("/client_streamz/tiktok/package_replaced/listener/count", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("listener_key", String.class), new fdz("impl", String.class), new fdz("status", String.class));
                e.c();
                return e;
            case 7:
                fdx c = ((fee) ((ldt) this.a).a).c("/client_streamz/tiktok/package_replaced/listener/duration", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("listener_key", String.class), new fdz("impl", String.class), new fdz("status", String.class));
                c.c();
                return c;
            case 8:
                fea e2 = ((fee) ((ldt) this.a).a).e("/client_streamz/tiktok/package_replaced/system/count", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("impl", String.class), new fdz("status", String.class));
                e2.c();
                return e2;
            case 9:
                fdx c2 = ((fee) ((iee) this.a).b).c("/client_streamz/tiktok/grpc/global/duration", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("status", Integer.class), new fdz("is_force_refresh", Boolean.class));
                c2.c();
                return c2;
            case 10:
                fea e3 = ((fee) ((iee) this.a).b).e("/client_streamz/tiktok/grpc/global/transport", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("transport_type", String.class), new fdz("status", String.class));
                e3.c();
                return e3;
            case 11:
                fea e4 = ((fee) ((iee) this.a).b).e("/client_streamz/tiktok/grpc/auth/refresh", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("status", String.class));
                e4.c();
                return e4;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                fea e5 = ((fee) ((iee) this.a).b).e("/client_streamz/tiktok/grpc/auth/expiry_null", new fdz("app_package", String.class), new fdz("process_name", String.class));
                e5.c();
                return e5;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                fdx c3 = ((fee) ((iee) this.a).b).c("/client_streamz/tiktok/grpc/auth/get_token_duration", new fdz("app_package", String.class), new fdz("process_name", String.class));
                c3.c();
                return c3;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fea e6 = ((goh) this.a).a.e("/client_streamz/tiktok/sync/synclet/count", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("synclet_key_name", String.class), new fdz("status", String.class));
                e6.c();
                return e6;
            case 15:
                fdx c4 = ((goh) this.a).a.c("/client_streamz/tiktok/sync/synclet/duration", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("synclet_key_name", String.class), new fdz("status", String.class));
                c4.c();
                return c4;
            case 16:
                fdx c5 = ((goh) this.a).a.c("/client_streamz/tiktok/sync/synclet/observed_interval", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("synclet_key_name", String.class));
                c5.c();
                return c5;
            case 17:
                fdx c6 = ((goh) this.a).a.c("/client_streamz/tiktok/sync/synclet/configured_interval", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("synclet_key_name", String.class));
                c6.c();
                return c6;
            case 18:
                fea e7 = ((goh) this.a).a.e("/client_streamz/tiktok/sync/system/count", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("invocation_type", String.class));
                e7.c();
                return e7;
            case 19:
                fdx c7 = ((goh) this.a).a.c("/client_streamz/tiktok/sync/worker/configured_wakeup_delay", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("worker_type", String.class), new fdz("constraints", String.class));
                c7.c();
                return c7;
            default:
                fdx c8 = ((goh) this.a).a.c("/client_streamz/tiktok/sync/worker/actual_wakeup_delay", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("worker_type", String.class), new fdz("constraints", String.class));
                c8.c();
                return c8;
        }
    }
}
