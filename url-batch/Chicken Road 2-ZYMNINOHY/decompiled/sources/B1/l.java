package B1;

import B1.g;
import B1.j;
import B1.l;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d3.q;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import u.InterfaceC1444a;
import y1.k;

/* loaded from: classes.dex */
public final class l implements a {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f206a;

    /* renamed from: b, reason: collision with root package name */
    public final g f207b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f208c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f209d;

    /* renamed from: e, reason: collision with root package name */
    public j f210e;

    public l(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        SidecarInterface a3 = i.a(context);
        g gVar = new g();
        this.f206a = a3;
        this.f207b = gVar;
        this.f208c = new LinkedHashMap();
        this.f209d = new LinkedHashMap();
    }

    public final y1.k a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new y1.k(q.f8333a);
        }
        SidecarInterface sidecarInterface = this.f206a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
        SidecarInterface sidecarInterface2 = this.f206a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f207b.d(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f206a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f209d;
        D.a aVar = (D.a) linkedHashMap.get(activity);
        if (aVar != null) {
            if (activity instanceof InterfaceC1444a) {
                ((InterfaceC1444a) activity).removeOnConfigurationChangedListener(aVar);
            }
            linkedHashMap.remove(activity);
        }
        j jVar = this.f210e;
        if (jVar != null) {
            ReentrantLock reentrantLock = (ReentrantLock) jVar.f202c;
            reentrantLock.lock();
            try {
                ((WeakHashMap) jVar.f203d).put(activity, null);
            } finally {
                reentrantLock.unlock();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f208c;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.f206a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f208c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f206a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f206a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        j jVar = this.f210e;
        if (jVar != null) {
            jVar.w(activity, a(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f209d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof InterfaceC1444a)) {
            D.a aVar = new D.a() { // from class: B1.h
                @Override // D.a, androidx.window.extensions.core.util.function.Consumer
                public final void accept(Object obj) {
                    l this$0 = l.this;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    Activity activity2 = activity;
                    kotlin.jvm.internal.i.e(activity2, "$activity");
                    j jVar2 = this$0.f210e;
                    if (jVar2 != null) {
                        jVar2.w(activity2, this$0.a(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, aVar);
            ((InterfaceC1444a) activity).addOnConfigurationChangedListener(aVar);
        }
    }

    public final void d(t1.h hVar) {
        this.f210e = new j(hVar);
        SidecarInterface sidecarInterface = this.f206a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f207b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    SidecarInterface sidecarInterface2;
                    Window window;
                    WindowManager.LayoutParams attributes;
                    i.e(newDeviceState, "newDeviceState");
                    Collection<Activity> values = l.this.f208c.values();
                    l lVar = l.this;
                    for (Activity activity : values) {
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                        if (iBinder != null && (sidecarInterface2 = lVar.f206a) != null) {
                            sidecarWindowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                        }
                        j jVar = lVar.f210e;
                        if (jVar != null) {
                            jVar.w(activity, lVar.f207b.d(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                    SidecarDeviceState sidecarDeviceState;
                    i.e(windowToken, "windowToken");
                    i.e(newLayout, "newLayout");
                    Activity activity = (Activity) l.this.f208c.get(windowToken);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    l lVar = l.this;
                    g gVar = lVar.f207b;
                    SidecarInterface sidecarInterface2 = lVar.f206a;
                    if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    k d4 = gVar.d(newLayout, sidecarDeviceState);
                    j jVar = l.this.f210e;
                    if (jVar != null) {
                        jVar.w(activity, d4);
                    }
                }
            }));
        }
    }

    public final boolean e() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f206a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!kotlin.jvm.internal.i.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f206a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f206a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f206a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f206a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!kotlin.jvm.internal.i.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f206a;
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
                if (arrayList.equals((List) invoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
