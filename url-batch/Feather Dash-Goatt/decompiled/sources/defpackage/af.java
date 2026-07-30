package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.l;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class af implements uf, zs, ak, pu, en, DeepLinkListener {
    public final /* synthetic */ int d;

    public /* synthetic */ af(jb jbVar) {
        this.d = 27;
    }

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void d(int i, int i2, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void h(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // defpackage.zs
    public double b(double d) {
        switch (this.d) {
            case 2:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 3:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 4:
                float[] fArr = si.a;
                return si.b(si.c, d);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                float[] fArr2 = si.a;
                return si.a(si.c, d);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                float[] fArr3 = si.a;
                return si.d(si.d, d);
            default:
                float[] fArr4 = si.a;
                return si.c(si.d, d);
        }
    }

    @Override // defpackage.ak
    public Object f(mc mcVar) {
        iz lambda$getComponents$0;
        switch (this.d) {
            case RequestError.EVENT_TIMEOUT /* 10 */:
                Set c = mcVar.c(v01.a(pb.class));
                s40 s40Var = s40.g;
                if (s40Var == null) {
                    synchronized (s40.class) {
                        try {
                            s40Var = s40.g;
                            if (s40Var == null) {
                                s40Var = new s40(0);
                                s40.g = s40Var;
                            }
                        } finally {
                        }
                    }
                }
                return new sq(c, s40Var);
            case RequestError.STOP_TRACKING /* 11 */:
            case 12:
            default:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(mcVar);
                return lambda$getComponents$0;
            case 13:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 16:
                be0 be0Var = ExecutorsRegistrar.a;
                return uk1.d;
        }
    }

    @Override // defpackage.en
    public Object n(Task task) {
        int i;
        switch (this.d) {
            case 17:
                i = 403;
                break;
            case 18:
                i = -1;
                break;
            default:
                Bundle bundle = (Bundle) task.h();
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        hx hxVar = hx.a;
        deepLinkResult.getClass();
        int i = bx.a[deepLinkResult.getStatus().ordinal()];
        Map map = null;
        if (i != 1) {
            if (i == 2) {
                ov ovVar = ov.d;
                ovVar.getClass();
                ej ejVar = hx.c;
                if (ejVar.W()) {
                    return;
                }
                ejVar.Y(ovVar);
                return;
            }
            if (i != 3) {
                l.a();
                return;
            }
            DeepLinkResult.Error error = deepLinkResult.getError();
            if (error != null) {
                error.name();
            }
            DeepLinkResult.Error error2 = deepLinkResult.getError();
            String name = error2 != null ? error2.name() : null;
            if (name == null) {
                name = "";
            }
            Map b = hk0.b(new Pair("deep_link_error", name));
            ej ejVar2 = hx.c;
            if (ejVar2.W()) {
                return;
            }
            ejVar2.Y(b);
            return;
        }
        DeepLink deepLink = deepLinkResult.getDeepLink();
        if (deepLink != null) {
            Map c = hx.c(deepLink.getClickEvent());
            xj0 xj0Var = new xj0();
            xj0Var.putAll(c);
            hx.b(xj0Var, "deep_link_value", deepLink.getDeepLinkValue());
            hx.b(xj0Var, "click_http_referrer", deepLink.getClickHttpReferrer());
            hx.b(xj0Var, "media_source", deepLink.getMediaSource());
            hx.b(xj0Var, "campaign", deepLink.getCampaign());
            hx.b(xj0Var, "campaign_id", deepLink.getCampaignId());
            hx.b(xj0Var, "af_sub1", deepLink.getAfSub1());
            hx.b(xj0Var, "af_sub2", deepLink.getAfSub2());
            hx.b(xj0Var, "af_sub3", deepLink.getAfSub3());
            hx.b(xj0Var, "af_sub4", deepLink.getAfSub4());
            hx.b(xj0Var, "af_sub5", deepLink.getAfSub5());
            hx.b(xj0Var, "match_type", deepLink.getMatchType());
            xj0Var.put("is_deferred", deepLink.isDeferred());
            for (int i2 = 1; i2 < 11; i2++) {
                String i3 = qy0.i(i2, "deep_link_sub");
                hx.b(xj0Var, i3, deepLink.getStringValue(i3));
            }
            xj0Var.b();
            xj0Var.q = true;
            int i4 = xj0Var.m;
            map = xj0Var;
            if (i4 <= 0) {
                Map map2 = xj0.s;
                map2.getClass();
                map = map2;
            }
        }
        if (map == null) {
            map = ov.d;
            map.getClass();
        }
        hx.e = map;
        ej ejVar3 = hx.c;
        if (ejVar3.W()) {
            return;
        }
        ejVar3.Y(map);
    }

    public /* synthetic */ af(int i) {
        this.d = i;
    }

    @Override // defpackage.uf
    public void cancel() {
    }

    @Override // defpackage.pu
    public float a(float f) {
        return f;
    }
}
