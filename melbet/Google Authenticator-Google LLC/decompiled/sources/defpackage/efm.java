package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class efm implements hac {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ efm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, koe] */
    @Override // defpackage.hac
    public final Object bB() {
        int i = 9;
        switch (this.b) {
            case 0:
                fea e = ((efn) this.a).a.e("/client_streamz/og_android/load_owners_count", new fdz("implementation", String.class), new fdz("result", String.class), new fdz("number_of_owners", Integer.class), new fdz("app_package", String.class), new fdz("load_cached", Boolean.class));
                e.c();
                return e;
            case 1:
                fdx c = ((efn) this.a).a.c("/client_streamz/og_android/g1_capability_latency", new fdz("app_package", String.class), new fdz("result", String.class));
                c.c();
                return c;
            case 2:
                fea e2 = ((efn) this.a).a.e("/client_streamz/og_android/load_owner_count", new fdz("implementation", String.class), new fdz("result", String.class), new fdz("app_package", String.class));
                e2.c();
                return e2;
            case 3:
                fea e3 = ((efn) this.a).a.e("/client_streamz/og_android/legacy/load_owners", new fdz("app_package", String.class));
                e3.c();
                return e3;
            case 4:
                fea e4 = ((efn) this.a).a.e("/client_streamz/og_android/load_owner_avatar_count", new fdz("implementation", String.class), new fdz("avatar_size", String.class), new fdz("result", String.class), new fdz("app_package", String.class), new fdz("load_cached", Boolean.class));
                e4.c();
                return e4;
            case 5:
                fdx c2 = ((efn) this.a).a.c("/client_streamz/og_android/load_owners_latency", new fdz("implementation", String.class), new fdz("result", String.class), new fdz("number_of_owners", Integer.class), new fdz("app_package", String.class), new fdz("load_cached", Boolean.class));
                c2.c();
                return c2;
            case 6:
                fdx c3 = ((efn) this.a).a.c("/client_streamz/og_android/load_owner_avatar_latency", new fdz("implementation", String.class), new fdz("avatar_size", String.class), new fdz("result", String.class), new fdz("app_package", String.class), new fdz("load_cached", Boolean.class));
                c3.c();
                return c3;
            case 7:
                fea e5 = ((efn) this.a).a.e("/client_streamz/og_android/visual_elements_usage", new fdz("app_package", String.class), new fdz("ve_provided", Boolean.class));
                e5.c();
                return e5;
            case 8:
                fea e6 = ((efn) this.a).a.e("/client_streamz/og_android/profile_cache/get_people_me", new fdz("result", String.class), new fdz("app_package", String.class));
                e6.c();
                return e6;
            case 9:
                fea e7 = ((efn) this.a).a.e("/client_streamz/og_android/lazy_provider_count", new fdz("app_package", String.class));
                e7.c();
                return e7;
            case 10:
                fea e8 = ((efn) this.a).a.e("/client_streamz/og_android/safety_exp_account_menu_refresh", new fdz[0]);
                e8.c();
                return e8;
            case 11:
                fea e9 = ((efn) this.a).a.e("/client_streamz/og_android/safety_exp_default_entry_point", new fdz[0]);
                e9.c();
                return e9;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                fea e10 = ((efn) this.a).a.e("/client_streamz/og_android/safety_exp_color_resolve_crash", new fdz("app_package", String.class), new fdz("has_material", Boolean.class), new fdz("is_material3", Boolean.class), new fdz("is_light_theme", Boolean.class), new fdz("failing_attribute_index", Integer.class), new fdz("is_next_attribute_failing", Boolean.class));
                e10.c();
                return e10;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                fea e11 = ((efn) this.a).a.e("/client_streamz/og_android/anchor_view_is_shown_on_screen_data", new fdz("part_of_the_view_is_visible", Boolean.class), new fdz("is_laid_out", Boolean.class), new fdz("is_shown", Boolean.class));
                e11.c();
                return e11;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fea e12 = ((efn) this.a).a.e("/client_streamz/og_android/bento_unbound_flow_crash", new fdz("host_activity_or_fragment_name", String.class), new fdz("on_attach_called_count", Integer.class), new fdz("on_create_called_count", Integer.class), new fdz("on_view_created_called_count", Integer.class), new fdz("on_config_changed_called_count", Integer.class), new fdz("on_detach_called_count", Integer.class), new fdz("bento_intent_launcher_binder_bind_called_count", Integer.class), new fdz("package_name", String.class), new fdz("error_type", String.class), new fdz("bento_intent_launcher_source", String.class));
                e12.c();
                return e12;
            case 15:
                fea e13 = ((efn) this.a).a.e("/client_streamz/og_android/shared_prefs_access_before_unlock_crash", new fdz("ui_mode_type", Integer.class), new fdz("app_package", String.class), new fdz("android_sdk_version", Integer.class), new fdz("is_realme_device", Boolean.class), new fdz("storage_type", String.class), new fdz("status", String.class), new fdz("exception_type", String.class), new fdz("account_state", String.class));
                e13.c();
                return e13;
            case 16:
                fea e14 = ((efn) this.a).a.e("/client_streamz/og_android/add_account/flow_initiations", new fdz("flow_type", String.class), new fdz("app_package", String.class));
                e14.c();
                return e14;
            case 17:
                fea e15 = ((efn) this.a).a.e("/client_streamz/og_android/add_account/account_manager_flow/completions", new fdz("result", String.class), new fdz("app_package", String.class));
                e15.c();
                return e15;
            case 18:
                Object obj = this.a;
                egd egdVar = (egd) obj;
                fwm fwmVar = new fwm(egdVar.a, egdVar.c);
                dxi dxiVar = new dxi(obj, fwmVar, i, null);
                if (egdVar.e.l(egdVar.a, 19621000) != 0) {
                    return dxiVar.bB();
                }
                ehe eheVar = new ehe(egdVar.b, dxiVar, 1);
                if (egdVar.g == null) {
                    cxs cxsVar = new cxs(egdVar.a);
                    gwh gwhVar = new gwh(egdVar.a, (byte[]) null);
                    gwhVar.c = cxsVar;
                    iyi iyiVar = new iyi(hel.q(new fat(gwhVar)));
                    fcy fcyVar = fcy.a;
                    HashMap hashMap = new HashMap();
                    ExecutorService executorService = egdVar.b;
                    exf.n(fcm.a, hashMap);
                    fym fymVar = new fym(executorService, iyiVar, fcyVar, hashMap);
                    Context context = egdVar.a;
                    context.getClass();
                    ExecutorService executorService2 = egdVar.b;
                    executorService2.getClass();
                    Handler handler = egdVar.d;
                    if (handler == null) {
                        handler = null;
                    }
                    fwm fwmVar2 = new fwm((Object) context, (Object) new kee(context), (byte[]) null);
                    dih dihVar = new dih();
                    if (handler == null) {
                        HandlerThread handlerThread = new HandlerThread("ProtoDataStore-Message-Handler");
                        handlerThread.start();
                        handler = new Handler(handlerThread.getLooper());
                    }
                    fcc fccVar = new fcc();
                    fccVar.a = context.getApplicationContext();
                    fccVar.c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
                    fccVar.b = new bwu(i);
                    fccVar.d = handler;
                    egdVar.g = new jdd(context, executorService2, iyiVar, fymVar, fwmVar2, dihVar, new fcf(fccVar), new ddw(context));
                }
                Context context2 = egdVar.a;
                jdd jddVar = egdVar.g;
                efx efxVar = egdVar.f;
                if (efxVar == null) {
                    efxVar = new efy(egdVar.a, egdVar.b);
                }
                return new egq(new ehe(new egh(context2, jddVar, efxVar, gzp.h(fwmVar)), 1, fwmVar, egdVar.a.getPackageName(), 0), eheVar);
            case 19:
                return ((Context) this.a).getSharedPreferences("primes", 0);
            default:
                return (hvm) this.a.b();
        }
    }
}
