package b0;

import E.C0009j;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.Intent;
import android.graphics.Rect;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.view.View;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import d0.C0296c;
import e.C0304a;
import e.InterfaceC0305b;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import k.C1061f;
import k.MenuC1065j;
import k.MenuItemC1066k;
import k.RunnableC1060e;
import k.ViewOnKeyListenerC1062g;
import l.L;
import org.json.JSONException;
import org.json.JSONObject;
import r1.AbstractC1182a;

/* loaded from: classes.dex */
public final class s implements L, InterfaceC0305b {

    /* renamed from: a, reason: collision with root package name */
    public Object f2544a;

    public /* synthetic */ s(Object obj) {
        this.f2544a = obj;
    }

    public static boolean f(int i3) {
        return (48 <= i3 && i3 <= 57) || i3 == 35 || i3 == 42;
    }

    @Override // l.L
    public void a(MenuC1065j menuC1065j, MenuItemC1066k menuItemC1066k) {
        ViewOnKeyListenerC1062g viewOnKeyListenerC1062g = (ViewOnKeyListenerC1062g) this.f2544a;
        viewOnKeyListenerC1062g.f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1062g.f9576h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (menuC1065j == ((C1061f) arrayList.get(i3)).f9569b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i4 = i3 + 1;
        viewOnKeyListenerC1062g.f.postAtTime(new RunnableC1060e(this, i4 < arrayList.size() ? (C1061f) arrayList.get(i4) : null, menuItemC1066k, menuC1065j, 0), menuC1065j, SystemClock.uptimeMillis() + 200);
    }

    @Override // l.L
    public void b(MenuC1065j menuC1065j, MenuItemC1066k menuItemC1066k) {
        ((ViewOnKeyListenerC1062g) this.f2544a).f.removeCallbacksAndMessages(menuC1065j);
    }

    @Override // e.InterfaceC0305b
    public void c(Object obj) {
        C0304a c0304a = (C0304a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f2544a;
        proxyBillingActivityV2.getClass();
        Intent intent = c0304a.f4953b;
        int i3 = AbstractC0248o0.d(intent, "ProxyBillingActivityV2").f10092a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2647w;
        if (resultReceiver != null) {
            resultReceiver.send(i3, intent == null ? null : intent.getExtras());
        }
        int i4 = c0304a.f4952a;
        if (i4 != -1 || i3 != 0) {
            AbstractC0248o0.g("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i4 + " and billing's responseCode: " + i3);
        }
        proxyBillingActivityV2.finish();
    }

    public JSONObject d(View view) {
        int currentModeType;
        JSONObject a3 = r1.b.a(0, 0, 0, 0);
        UiModeManager uiModeManager = C2.b.f223a;
        try {
            a3.put("noOutputDevice", AbstractC1182a.f10260a[M.j.b((uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : S0.a.f1332h)] == 1);
        } catch (JSONException unused) {
        }
        return a3;
    }

    public d0.d e(Object obj, kotlin.jvm.internal.e eVar, Activity activity, i0.b bVar) {
        C0296c c0296c = new C0296c(eVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f2544a, new Class[]{j()}, c0296c);
        kotlin.jvm.internal.j.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, j()).invoke(obj, activity, newProxyInstance);
        return new d0.d(obj.getClass().getMethod("removeWindowLayoutInfoListener", j()), obj, newProxyInstance);
    }

    public void g(int i3, O1.n nVar) {
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f2544a;
        kVar.d();
        kVar.f = nVar;
        kVar.f9217e = new C0009j(2, i3);
        kVar.f9219h.e(kVar);
        B0.p pVar = nVar.f1198j;
        kVar.f9219h = new io.flutter.plugin.editing.g(pVar != null ? (O1.p) pVar.f164c : null, kVar.f9213a);
        kVar.e(nVar);
        kVar.f9220i = true;
        if (kVar.f9217e.f291b == 3) {
            kVar.f9226p = false;
        }
        kVar.f9224m = null;
        kVar.f9219h.a(kVar);
    }

    public void h(double d3, double d4, double[] dArr) {
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f2544a;
        kVar.getClass();
        double[] dArr2 = new double[4];
        boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d5 = dArr[12];
        double d6 = dArr[15];
        double d7 = d5 / d6;
        dArr2[1] = d7;
        dArr2[0] = d7;
        double d8 = dArr[13] / d6;
        dArr2[3] = d8;
        dArr2[2] = d8;
        V.e eVar = new V.e(z, dArr, dArr2);
        eVar.a(d3, 0.0d);
        eVar.a(d3, d4);
        eVar.a(0.0d, d4);
        double d9 = kVar.f9213a.getContext().getResources().getDisplayMetrics().density;
        kVar.f9224m = new Rect((int) (dArr2[0] * d9), (int) (dArr2[2] * d9), (int) Math.ceil(dArr2[1] * d9), (int) Math.ceil(dArr2[3] * d9));
    }

    public void i(O1.p pVar) {
        O1.p pVar2;
        int i3;
        int i4;
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f2544a;
        View view = kVar.f9213a;
        if (!kVar.f9220i && (pVar2 = kVar.o) != null && (i3 = pVar2.f1208d) >= 0 && (i4 = pVar2.f1209e) > i3) {
            int i5 = i4 - i3;
            int i6 = pVar.f1209e;
            int i7 = pVar.f1208d;
            boolean z = true;
            if (i5 == i6 - i7) {
                int i8 = 0;
                while (true) {
                    if (i8 >= i5) {
                        z = false;
                        break;
                    } else if (pVar2.f1205a.charAt(i8 + i3) != pVar.f1205a.charAt(i8 + i7)) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            kVar.f9220i = z;
        }
        kVar.o = pVar;
        kVar.f9219h.f(pVar);
        if (kVar.f9220i) {
            kVar.f9214b.restartInput(view);
            kVar.f9220i = false;
        }
    }

    public Class j() {
        Class<?> loadClass = ((ClassLoader) this.f2544a).loadClass("java.util.function.Consumer");
        kotlin.jvm.internal.j.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }

    public s(HashMap hashMap) {
        this.f2544a = Collections.unmodifiableMap(new HashMap(hashMap));
    }
}
