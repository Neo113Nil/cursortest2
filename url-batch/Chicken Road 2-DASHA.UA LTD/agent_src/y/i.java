package y;

import C.b;
import V.m;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import e0.h;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import k.InterfaceC0041a;
import v.C0108k;
import y.C0119f;
import y.g;
import y.i;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f1316a;

    /* renamed from: b, reason: collision with root package name */
    public final C0119f f1317b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1318c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1319d;

    /* renamed from: e, reason: collision with root package name */
    public C.b f1320e;

    public i(Context context) {
        e0.h.e(context, "context");
        SidecarInterface b2 = g.b(context);
        C0119f c0119f = new C0119f();
        this.f1316a = b2;
        this.f1317b = c0119f;
        this.f1318c = new LinkedHashMap();
        this.f1319d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f1316a;
    }

    public final C0108k e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder a2 = g.a(activity);
        if (a2 == null) {
            return new C0108k(m.f386b);
        }
        SidecarInterface sidecarInterface = this.f1316a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a2) : null;
        SidecarInterface sidecarInterface2 = this.f1316a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f1317b.f(windowLayoutInfo, sidecarDeviceState);
    }

    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder a2 = g.a(activity);
        if (a2 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f1316a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a2);
        }
        LinkedHashMap linkedHashMap = this.f1319d;
        if (((InterfaceC0041a) linkedHashMap.get(activity)) != null) {
            linkedHashMap.remove(activity);
        }
        C.b bVar = this.f1320e;
        if (bVar != null) {
            bVar.a(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f1318c;
        boolean z2 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(a2);
        if (!z2 || (sidecarInterface = this.f1316a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void g(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f1318c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f1316a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f1316a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C.b bVar = this.f1320e;
        if (bVar != null) {
            bVar.h(activity, e(activity));
        }
        this.f1319d.get(activity);
    }

    public final void h(io.flutter.plugin.platform.c cVar) {
        this.f1320e = new C.b(cVar);
        SidecarInterface sidecarInterface = this.f1316a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f1317b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    LinkedHashMap linkedHashMap;
                    b bVar;
                    C0119f c0119f;
                    SidecarInterface d2;
                    h.e(sidecarDeviceState, "newDeviceState");
                    linkedHashMap = i.this.f1318c;
                    Collection<Activity> values = linkedHashMap.values();
                    i iVar = i.this;
                    for (Activity activity : values) {
                        IBinder a2 = g.a(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a2 != null && (d2 = iVar.d()) != null) {
                            sidecarWindowLayoutInfo = d2.getWindowLayoutInfo(a2);
                        }
                        bVar = iVar.f1320e;
                        if (bVar != null) {
                            c0119f = iVar.f1317b;
                            bVar.h(activity, c0119f.f(sidecarWindowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    LinkedHashMap linkedHashMap;
                    C0119f c0119f;
                    SidecarDeviceState sidecarDeviceState;
                    b bVar;
                    h.e(iBinder, "windowToken");
                    h.e(sidecarWindowLayoutInfo, "newLayout");
                    linkedHashMap = i.this.f1318c;
                    Activity activity = (Activity) linkedHashMap.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    c0119f = i.this.f1317b;
                    SidecarInterface d2 = i.this.d();
                    if (d2 == null || (sidecarDeviceState = d2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    C0108k f2 = c0119f.f(sidecarWindowLayoutInfo, sidecarDeviceState);
                    bVar = i.this.f1320e;
                    if (bVar != null) {
                        bVar.h(activity, f2);
                    }
                }
            }));
        }
    }

    public final boolean i() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f1316a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!e0.h.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f1316a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f1316a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f1316a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!e0.h.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f1316a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!e0.h.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f1316a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!e0.h.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                e0.h.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            e0.h.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                e0.h.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (e0.h.a(arrayList, (List) invoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
