package p0;

import B4.i;
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
import g4.C0471p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import m0.k;
import p0.f;
import p0.h;
import p0.j;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f11626a;

    /* renamed from: b, reason: collision with root package name */
    public final f f11627b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f11628c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f11629d;

    /* renamed from: e, reason: collision with root package name */
    public B4.i f11630e;

    public j(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        SidecarInterface b6 = h.b(context);
        f fVar = new f();
        this.f11626a = b6;
        this.f11627b = fVar;
        this.f11628c = new LinkedHashMap();
        this.f11629d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f11626a;
    }

    public final m0.k e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder a6 = h.a(activity);
        if (a6 == null) {
            return new m0.k(C0471p.f5750a);
        }
        SidecarInterface sidecarInterface = this.f11626a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a6) : null;
        SidecarInterface sidecarInterface2 = this.f11626a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f11627b.f(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder a6 = h.a(activity);
        if (a6 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f11626a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a6);
        }
        LinkedHashMap linkedHashMap = this.f11629d;
        D.a aVar = (D.a) linkedHashMap.get(activity);
        if (aVar != null) {
            if (activity instanceof v.g) {
                ((v.g) activity).removeOnConfigurationChangedListener(aVar);
            }
            linkedHashMap.remove(activity);
        }
        B4.i iVar = this.f11630e;
        if (iVar != null) {
            iVar.x(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f11628c;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(a6);
        if (!z || (sidecarInterface = this.f11626a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f11628c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f11626a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f11626a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        B4.i iVar = this.f11630e;
        if (iVar != null) {
            iVar.N(activity, e(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f11629d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof v.g)) {
            D.a aVar = new D.a() { // from class: p0.g
                @Override // D.a
                public final void accept(Object obj) {
                    j this$0 = j.this;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    Activity activity2 = activity;
                    kotlin.jvm.internal.i.e(activity2, "$activity");
                    B4.i iVar2 = this$0.f11630e;
                    if (iVar2 != null) {
                        iVar2.N(activity2, this$0.e(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, aVar);
            ((v.g) activity).addOnConfigurationChangedListener(aVar);
        }
    }

    public final void h(U.e eVar) {
        this.f11630e = new B4.i(eVar, (byte) 0);
        SidecarInterface sidecarInterface = this.f11626a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f11627b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    LinkedHashMap linkedHashMap;
                    i iVar;
                    f fVar;
                    SidecarInterface d6;
                    kotlin.jvm.internal.i.e(newDeviceState, "newDeviceState");
                    linkedHashMap = j.this.f11628c;
                    Collection<Activity> values = linkedHashMap.values();
                    j jVar = j.this;
                    for (Activity activity : values) {
                        IBinder a6 = h.a(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a6 != null && (d6 = jVar.d()) != null) {
                            sidecarWindowLayoutInfo = d6.getWindowLayoutInfo(a6);
                        }
                        iVar = jVar.f11630e;
                        if (iVar != null) {
                            fVar = jVar.f11627b;
                            iVar.N(activity, fVar.f(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                    LinkedHashMap linkedHashMap;
                    f fVar;
                    SidecarDeviceState sidecarDeviceState;
                    i iVar;
                    kotlin.jvm.internal.i.e(windowToken, "windowToken");
                    kotlin.jvm.internal.i.e(newLayout, "newLayout");
                    linkedHashMap = j.this.f11628c;
                    Activity activity = (Activity) linkedHashMap.get(windowToken);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    fVar = j.this.f11627b;
                    SidecarInterface d6 = j.this.d();
                    if (d6 == null || (sidecarDeviceState = d6.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    k f3 = fVar.f(newLayout, sidecarDeviceState);
                    iVar = j.this.f11630e;
                    if (iVar != null) {
                        iVar.N(activity, f3);
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
            SidecarInterface sidecarInterface = this.f11626a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!kotlin.jvm.internal.i.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f11626a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f11626a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f11626a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f11626a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f11626a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            kotlin.jvm.internal.i.d(rect, "displayFeature.rect");
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
                kotlin.jvm.internal.i.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (kotlin.jvm.internal.i.a(arrayList, (List) invoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
