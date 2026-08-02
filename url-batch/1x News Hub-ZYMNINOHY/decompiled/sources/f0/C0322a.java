package f0;

import C0.n;
import E1.A;
import E1.AbstractActivityC0029e;
import K.C0050n;
import K.C0051o;
import K.C0052p;
import O1.e;
import O1.i;
import P1.m;
import U1.C0080a;
import W1.C0102n;
import a.AbstractC0129a;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ImageView;
import b0.r;
import b0.s;
import b2.C0195i;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.W1;
import com.google.android.gms.internal.play_billing.Z1;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.h2;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.m2;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import g.AbstractC0328a;
import g0.C0330b;
import g0.h;
import h.AbstractC0337a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.q;
import j1.EnumC1055d;
import j1.g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import l.AbstractC1103z;
import l.C1093o;
import l.j0;
import m1.c;
import n0.C1158t;
import n0.InterfaceC1134N;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.C1177b;
import s0.C1185b;
import t0.C1189a;
import w0.C1236e;
import w0.f;
import w2.d;
import w2.j;
import w2.l;
import w2.p;
import x0.InterfaceC1239b;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322a implements h, k, i, InterfaceC1134N, m, InterfaceC1239b, d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4976a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4977b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4978c;

    public C0322a() {
        this.f4976a = 11;
        r rVar = new r();
        rVar.f2543a = new int[2];
        this.f4977b = rVar;
        this.f4978c = new s(rVar);
    }

    public static C0322a s(EnumC1055d enumC1055d, g gVar) {
        if (enumC1055d != EnumC1055d.DEFINED_BY_JAVASCRIPT) {
            return new C0322a(enumC1055d, gVar);
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }

    public void A(m2 m2Var) {
        if (m2Var == null) {
            return;
        }
        try {
            h2 t3 = i2.t();
            t3.e((a2) this.f4977b);
            t3.d();
            i2.s((i2) t3.f2860b, m2Var);
            ((A) this.f4978c).b((i2) t3.b());
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // O1.i
    public void a(O1.h hVar, O1.g gVar) {
        if (((q) this.f4978c).j(hVar.f1174a) != null) {
            return;
        }
        ((io.flutter.plugin.platform.r) this.f4977b).f9314w.a(hVar, gVar);
    }

    @Override // O1.i
    public void b(boolean z) {
        ((io.flutter.plugin.platform.r) ((io.flutter.plugin.platform.r) this.f4977b).f9314w.f9273b).f9310r = z;
    }

    @Override // io.flutter.plugin.platform.k
    public void c(io.flutter.view.i iVar) {
        ((io.flutter.plugin.platform.r) this.f4977b).f9302i.f9244a = iVar;
        ((q) this.f4978c).f9285h.f9244a = iVar;
    }

    @Override // O1.i
    public void d(int i3, double d3, double d4) {
        if (((q) this.f4978c).j(i3) != null) {
            return;
        }
        ((io.flutter.plugin.platform.r) this.f4977b).f9314w.d(i3, d3, d4);
    }

    @Override // O1.i
    public void e(int i3, int i4) {
        q qVar = (q) this.f4978c;
        if (qVar.j(i3) != null) {
            qVar.f9293q.e(i3, i4);
        } else {
            ((io.flutter.plugin.platform.r) this.f4977b).f9314w.e(i3, i4);
        }
    }

    @Override // io.flutter.plugin.platform.k
    public boolean f(int i3) {
        q qVar = (q) this.f4978c;
        if (qVar.j(i3) == null) {
            return ((io.flutter.plugin.platform.r) this.f4977b).f(i3);
        }
        qVar.getClass();
        return false;
    }

    @Override // O1.i
    public void g(e eVar) {
        ((io.flutter.plugin.platform.r) this.f4977b).f9314w.g(eVar);
    }

    @Override // a2.InterfaceC0133a
    public Object get() {
        return new f((Context) ((r) this.f4977b).f2543a, (C1236e) ((n) this.f4978c).get());
    }

    @Override // O1.i
    public void h(e eVar) {
        ((q) this.f4978c).f9293q.f(eVar);
    }

    @Override // io.flutter.plugin.platform.k
    public View j(int i3) {
        q qVar = (q) this.f4978c;
        return qVar.j(i3) != null ? qVar.j(i3) : ((io.flutter.plugin.platform.r) this.f4977b).j(i3);
    }

    @Override // O1.i
    public void k(O1.f fVar) {
        q qVar = (q) this.f4978c;
        if (qVar.j(fVar.f1159a) != null) {
            qVar.f9293q.k(fVar);
        } else {
            ((io.flutter.plugin.platform.r) this.f4977b).f9314w.k(fVar);
        }
    }

    @Override // O1.i
    public void l(int i3) {
        q qVar = (q) this.f4978c;
        if (qVar.j(i3) != null) {
            qVar.f9293q.l(i3);
        } else {
            ((io.flutter.plugin.platform.r) this.f4977b).f9314w.l(i3);
        }
    }

    @Override // io.flutter.plugin.platform.k
    public void m() {
        ((io.flutter.plugin.platform.r) this.f4977b).m();
        ((q) this.f4978c).m();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    @Override // w2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(w2.e eVar, InterfaceC0300c interfaceC0300c) {
        j jVar;
        int i3;
        Throwable th;
        x2.m mVar;
        C0322a c0322a;
        w2.e eVar2;
        l lVar;
        int i4;
        C0102n c0102n;
        switch (this.f4976a) {
            case 17:
                if (interfaceC0300c instanceof j) {
                    jVar = (j) interfaceC0300c;
                    int i5 = jVar.f10661e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jVar.f10661e = i5 - Integer.MIN_VALUE;
                        Object obj = jVar.f10660d;
                        EnumC0317a enumC0317a = EnumC0317a.f4969a;
                        i3 = jVar.f10661e;
                        if (i3 != 0) {
                            android.support.v4.media.session.a.T(obj);
                            d2.h hVar = jVar.f4981b;
                            kotlin.jvm.internal.j.b(hVar);
                            x2.m mVar2 = new x2.m(eVar, hVar);
                            try {
                                C0050n c0050n = (C0050n) this.f4977b;
                                jVar.f10662g = this;
                                jVar.f10663h = eVar;
                                jVar.f10664i = mVar2;
                                jVar.f10661e = 1;
                                if (c0050n.invoke(mVar2, jVar) == enumC0317a) {
                                    return enumC0317a;
                                }
                                c0322a = this;
                                eVar2 = eVar;
                                mVar = mVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                mVar = mVar2;
                                mVar.h();
                                throw th;
                            }
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                android.support.v4.media.session.a.T(obj);
                                return C0195i.f2555a;
                            }
                            mVar = jVar.f10664i;
                            eVar2 = jVar.f10663h;
                            c0322a = jVar.f10662g;
                            try {
                                android.support.v4.media.session.a.T(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                mVar.h();
                                throw th;
                            }
                        }
                        mVar.h();
                        p pVar = (p) c0322a.f4978c;
                        jVar.f10662g = null;
                        jVar.f10663h = null;
                        jVar.f10664i = null;
                        jVar.f10661e = 2;
                        pVar.n(eVar2, jVar);
                        return enumC0317a;
                    }
                }
                jVar = new j(this, interfaceC0300c);
                Object obj2 = jVar.f10660d;
                EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
                i3 = jVar.f10661e;
                if (i3 != 0) {
                }
                mVar.h();
                p pVar2 = (p) c0322a.f4978c;
                jVar.f10662g = null;
                jVar.f10663h = null;
                jVar.f10664i = null;
                jVar.f10661e = 2;
                pVar2.n(eVar2, jVar);
                return enumC0317a2;
            case 18:
                Object n3 = ((C0322a) this.f4977b).n(new W1.r(new o(), eVar, (C0052p) this.f4978c), interfaceC0300c);
                return n3 == EnumC0317a.f4969a ? n3 : C0195i.f2555a;
            default:
                if (interfaceC0300c instanceof l) {
                    lVar = (l) interfaceC0300c;
                    int i6 = lVar.f10670e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        lVar.f10670e = i6 - Integer.MIN_VALUE;
                        Object obj3 = lVar.f10669d;
                        EnumC0317a enumC0317a3 = EnumC0317a.f4969a;
                        i4 = lVar.f10670e;
                        if (i4 != 0) {
                            android.support.v4.media.session.a.T(obj3);
                            C0322a c0322a2 = (C0322a) this.f4977b;
                            C0102n c0102n2 = new C0102n((C0051o) this.f4978c, eVar);
                            try {
                                lVar.f10671g = c0102n2;
                                lVar.f10670e = 1;
                                if (c0322a2.n(c0102n2, lVar) == enumC0317a3) {
                                    return enumC0317a3;
                                }
                            } catch (x2.a e3) {
                                e = e3;
                                c0102n = c0102n2;
                                if (e.f10770a != c0102n) {
                                }
                                return C0195i.f2555a;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0102n = lVar.f10671g;
                            try {
                                android.support.v4.media.session.a.T(obj3);
                            } catch (x2.a e4) {
                                e = e4;
                                if (e.f10770a != c0102n) {
                                    throw e;
                                }
                                return C0195i.f2555a;
                            }
                        }
                        return C0195i.f2555a;
                    }
                }
                lVar = new l(this, interfaceC0300c);
                Object obj32 = lVar.f10669d;
                EnumC0317a enumC0317a32 = EnumC0317a.f4969a;
                i4 = lVar.f10670e;
                if (i4 != 0) {
                }
                return C0195i.f2555a;
        }
    }

    @Override // O1.i
    public void o(int i3) {
        q qVar = (q) this.f4978c;
        if (qVar.j(i3) != null) {
            qVar.f9293q.o(i3);
        } else {
            ((io.flutter.plugin.platform.r) this.f4977b).f9314w.o(i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P1.m
    public void onMethodCall(P1.l lVar, P1.n nVar) {
        Context context;
        C1177b c1177b;
        Object obj;
        int i3;
        boolean isLocationEnabled;
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        String str = lVar.f1266a;
        str.getClass();
        context = (Context) this.f4977b;
        c1177b = (C1177b) this.f4978c;
        obj = lVar.f1267b;
        switch (str) {
            case "checkServiceStatus":
                int parseInt = Integer.parseInt(obj.toString());
                if (context == null) {
                    Log.d("permissions_handler", "Context cannot be null.");
                    ((O1.j) nVar).b("PermissionHandler.ServiceManager", "Android context cannot be null.", null);
                    break;
                } else if (parseInt != 3 && parseInt != 4 && parseInt != 5) {
                    if (parseInt == 21) {
                        ((O1.j) nVar).success(Integer.valueOf(((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled() ? 1 : 0));
                        break;
                    } else if (parseInt == 8) {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager.hasSystemFeature("android.hardware.telephony")) {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            if (telephonyManager != null && telephonyManager.getPhoneType() != 0) {
                                Intent intent = new Intent("android.intent.action.CALL");
                                intent.setData(Uri.parse("tel:123123"));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    of = PackageManager.ResolveInfoFlags.of(0L);
                                    queryIntentActivities = packageManager.queryIntentActivities(intent, of);
                                } else {
                                    queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                                }
                                if (queryIntentActivities.isEmpty()) {
                                    ((O1.j) nVar).success(2);
                                    break;
                                } else if (telephonyManager.getSimState() != 5) {
                                    ((O1.j) nVar).success(0);
                                    break;
                                } else {
                                    ((O1.j) nVar).success(1);
                                    break;
                                }
                            } else {
                                ((O1.j) nVar).success(2);
                                break;
                            }
                        } else {
                            ((O1.j) nVar).success(2);
                            break;
                        }
                    } else if (parseInt == 16) {
                        ((O1.j) nVar).success(1);
                        break;
                    } else {
                        ((O1.j) nVar).success(2);
                        break;
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 28) {
                        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
                        if (locationManager != null) {
                            isLocationEnabled = locationManager.isLocationEnabled();
                            i3 = isLocationEnabled;
                        }
                        i3 = 0;
                    } else {
                        try {
                            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                                i3 = 1;
                            }
                        } catch (Settings.SettingNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        i3 = 0;
                    }
                    ((O1.j) nVar).success(Integer.valueOf(i3));
                    break;
                }
                break;
            case "shouldShowRequestPermissionRationale":
                int parseInt2 = Integer.parseInt(obj.toString());
                AbstractActivityC0029e abstractActivityC0029e = c1177b.f10215c;
                if (abstractActivityC0029e == null) {
                    Log.d("permissions_handler", "Unable to detect current Activity.");
                    ((O1.j) nVar).b("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                    break;
                } else {
                    ArrayList n3 = S0.a.n(abstractActivityC0029e, parseInt2);
                    if (n3 == null) {
                        Log.d("permissions_handler", "No android specific permissions needed for: " + parseInt2);
                        ((O1.j) nVar).success(Boolean.FALSE);
                        break;
                    } else if (n3.isEmpty()) {
                        Log.d("permissions_handler", "No permissions found in manifest for: " + parseInt2 + " no need to show request rationale");
                        ((O1.j) nVar).success(Boolean.FALSE);
                        break;
                    } else {
                        ((O1.j) nVar).success(Boolean.valueOf(AbstractC0129a.C(c1177b.f10215c, (String) n3.get(0))));
                        break;
                    }
                }
            case "checkPermissionStatus":
                ((O1.j) nVar).success(Integer.valueOf(c1177b.c(Integer.parseInt(obj.toString()))));
                break;
            case "openAppSettings":
                if (context == null) {
                    Log.d("permissions_handler", "Context cannot be null.");
                    ((O1.j) nVar).b("PermissionHandler.AppSettingsManager", "Android context cannot be null.", null);
                    break;
                } else {
                    try {
                        Intent intent2 = new Intent();
                        intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent2.addCategory("android.intent.category.DEFAULT");
                        intent2.setData(Uri.parse("package:" + context.getPackageName()));
                        intent2.addFlags(268435456);
                        intent2.addFlags(1073741824);
                        intent2.addFlags(8388608);
                        context.startActivity(intent2);
                        ((O1.j) nVar).success(Boolean.TRUE);
                        break;
                    } catch (Exception unused) {
                        ((O1.j) nVar).success(Boolean.FALSE);
                        return;
                    }
                }
            case "requestPermissions":
                List<Integer> list = (List) obj;
                O1.j jVar = (O1.j) nVar;
                O1.g gVar = new O1.g(jVar);
                if (c1177b.f10216d > 0) {
                    jVar.b("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).", null);
                    break;
                } else if (c1177b.f10215c == null) {
                    Log.d("permissions_handler", "Unable to detect current Activity.");
                    jVar.b("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                    break;
                } else {
                    c1177b.f10214b = gVar;
                    c1177b.f10217e = new HashMap();
                    c1177b.f10216d = 0;
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : list) {
                        if (c1177b.c(num.intValue()) != 1) {
                            ArrayList n4 = S0.a.n(c1177b.f10215c, num.intValue());
                            if (n4 != null && !n4.isEmpty()) {
                                int i4 = Build.VERSION.SDK_INT;
                                if (num.intValue() == 16) {
                                    c1177b.e(209, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                } else if (i4 >= 30 && num.intValue() == 22) {
                                    c1177b.e(210, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                                } else if (num.intValue() == 23) {
                                    c1177b.e(211, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
                                } else if (i4 >= 26 && num.intValue() == 24) {
                                    c1177b.e(212, "android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                                } else if (num.intValue() == 27) {
                                    c1177b.e(213, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                                } else if (i4 >= 31 && num.intValue() == 34) {
                                    c1177b.e(214, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                                } else if (num.intValue() != 37 && num.intValue() != 0) {
                                    arrayList.addAll(n4);
                                    c1177b.f10216d = n4.size() + c1177b.f10216d;
                                } else if (c1177b.d()) {
                                    arrayList.add("android.permission.WRITE_CALENDAR");
                                    arrayList.add("android.permission.READ_CALENDAR");
                                    c1177b.f10216d += 2;
                                } else {
                                    c1177b.f10217e.put(num, 0);
                                }
                            } else if (!c1177b.f10217e.containsKey(num)) {
                                c1177b.f10217e.put(num, 0);
                                if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                    c1177b.f10217e.put(num, 0);
                                } else {
                                    c1177b.f10217e.put(num, 2);
                                }
                            }
                        } else if (!c1177b.f10217e.containsKey(num)) {
                            c1177b.f10217e.put(num, 1);
                        }
                    }
                    if (arrayList.size() > 0) {
                        AbstractC0129a.w(c1177b.f10215c, (String[]) arrayList.toArray(new String[0]), 24);
                    }
                    O1.g gVar2 = c1177b.f10214b;
                    if (gVar2 != null && c1177b.f10216d == 0) {
                        gVar2.f1173a.success(c1177b.f10217e);
                        break;
                    }
                }
                break;
            default:
                ((O1.j) nVar).a();
                break;
        }
    }

    @Override // O1.i
    public long p(e eVar) {
        return ((io.flutter.plugin.platform.r) this.f4977b).f9314w.p(eVar);
    }

    @Override // O1.i
    public boolean q() {
        FlutterJNI flutterJNI = ((q) this.f4978c).f9283e;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }

    public void r() {
        j0 j0Var;
        ImageView imageView = (ImageView) this.f4977b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = AbstractC1103z.f9932a;
        }
        if (drawable == null || (j0Var = (j0) this.f4978c) == null) {
            return;
        }
        C1093o.c(drawable, j0Var, imageView.getDrawableState());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory t(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f4978c) == null) {
            Context context = (Context) this.f4977b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(StringUtils.COMMA, -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f4978c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f4978c = map;
        }
        String str4 = (String) ((Map) this.f4978c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e3) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e3);
            return null;
        } catch (IllegalAccessException e4) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e4);
            return null;
        } catch (InstantiationException e5) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e7);
            return null;
        }
    }

    public void u(int i3) {
        int resourceId;
        ImageView imageView = (ImageView) this.f4977b;
        A0.f K2 = A0.f.K(imageView.getContext(), null, AbstractC0328a.f4993e, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) K2.f24c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0337a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC1103z.f9932a;
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(K2.B(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1103z.c(typedArray.getInt(3, -1), null));
            }
            K2.O();
        } catch (Throwable th) {
            K2.O();
            throw th;
        }
    }

    public void v(Q1 q12) {
        if (q12 == null) {
            return;
        }
        try {
            h2 t3 = i2.t();
            t3.e((a2) this.f4977b);
            t3.d();
            i2.n((i2) t3.f2860b, q12);
            ((A) this.f4978c).b((i2) t3.b());
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void w(Q1 q12, int i3) {
        try {
            Z1 z12 = (Z1) ((a2) this.f4977b).g();
            z12.d();
            a2.n((a2) z12.f2860b, i3);
            this.f4977b = (a2) z12.b();
            v(q12);
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(S1 s12) {
        if (s12 == null) {
            return;
        }
        try {
            h2 t3 = i2.t();
            t3.e((a2) this.f4977b);
            t3.d();
            i2.o((i2) t3.f2860b, s12);
            ((A) this.f4978c).b((i2) t3.b());
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void y(W1 w1) {
        try {
            h2 t3 = i2.t();
            t3.e((a2) this.f4977b);
            t3.d();
            i2.p((i2) t3.f2860b, w1);
            ((A) this.f4978c).b((i2) t3.b());
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void z(l2 l2Var) {
        try {
            A a3 = (A) this.f4978c;
            h2 t3 = i2.t();
            t3.e((a2) this.f4977b);
            t3.d();
            i2.r((i2) t3.f2860b, l2Var);
            a3.b((i2) t3.b());
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingLogger", "Unable to log.", th);
        }
    }

    public /* synthetic */ C0322a(int i3) {
        this.f4976a = i3;
    }

    public C0322a(A0.f fVar) {
        this.f4976a = 13;
        this.f4978c = fVar;
    }

    public C0322a(WebView webView, C0080a c0080a) {
        this.f4976a = 9;
        AbstractC0129a.b(webView, "WebView is null");
        this.f4977b = webView;
        this.f4978c = c0080a;
    }

    public C0322a(EnumC1055d enumC1055d, g gVar) {
        this.f4976a = 3;
        this.f4978c = enumC1055d;
        this.f4977b = gVar;
    }

    public /* synthetic */ C0322a(Object obj, int i3, Object obj2) {
        this.f4976a = i3;
        this.f4977b = obj;
        this.f4978c = obj2;
    }

    public C0322a(Context context, a2 a2Var) {
        A0.f c3;
        C1185b c1185b;
        c cVar;
        Set set;
        this.f4976a = 8;
        A a3 = new A();
        try {
            v0.n.b(context);
            c3 = v0.n.a().c(C1189a.f10358e);
            c1185b = new C1185b("proto");
            cVar = new c();
            set = (Set) c3.f23b;
        } catch (Throwable unused) {
            a3.f308a = true;
        }
        if (set.contains(c1185b)) {
            a3.f309b = new A0.f((v0.i) c3.f24c, c1185b, cVar, (v0.n) c3.f25d);
            this.f4978c = a3;
            this.f4977b = a2Var;
            return;
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c1185b, set));
    }

    public C0322a(String str) {
        this.f4976a = 7;
        JSONObject jSONObject = new JSONObject(str);
        this.f4977b = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                if (optJSONObject != null) {
                    arrayList.add(new C1158t(optJSONObject));
                }
            }
        }
        this.f4978c = arrayList;
    }

    public C0322a(Context context, c cVar, C1177b c1177b, c cVar2) {
        this.f4976a = 10;
        this.f4977b = context;
        this.f4978c = c1177b;
    }

    public C0322a(View view, InputMethodManager inputMethodManager, C0.e eVar) {
        this.f4976a = 1;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f4978c = view;
        this.f4977b = inputMethodManager;
        eVar.f201b = this;
    }

    public C0322a(C0330b c0330b) {
        this.f4976a = 0;
        V0.e eVar = new V0.e(29);
        this.f4977b = c0330b;
        this.f4978c = eVar;
    }

    public C0322a(ImageView imageView) {
        this.f4976a = 4;
        this.f4977b = imageView;
    }

    public C0322a(Context context) {
        this.f4976a = 15;
        this.f4978c = null;
        this.f4977b = context;
    }
}
