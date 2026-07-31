package o3;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    static final x f19877a = new r(v.O0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final x f19878b = new s(v.O0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final x f19879c = new t(v.O0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final x f19880d = new u(v.O0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: e, reason: collision with root package name */
    private static final Object f19881e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static Context f19882f;

    static synchronized void a(Context context) {
        synchronized (z.class) {
            if (f19882f != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f19882f = context.getApplicationContext();
            }
        }
    }
}
