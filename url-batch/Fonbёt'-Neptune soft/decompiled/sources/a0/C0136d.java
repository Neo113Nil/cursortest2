package a0;

import Q0.p;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136d extends Q0.i implements P0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0137e f1267g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0136d(C0137e c0137e, int i2) {
        super(0);
        this.f1266f = i2;
        this.f1267g = c0137e;
    }

    @Override // P0.a
    public final Object g() {
        Class<?> cls = null;
        C0137e c0137e = this.f1267g;
        boolean z2 = false;
        switch (this.f1266f) {
            case 0:
                Class<?> loadClass = c0137e.f1268a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                Q0.h.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                Q0.h.d(method, "getBoundsMethod");
                if (i1.a.h(method, p.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    Q0.h.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (i1.a.h(method2, p.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        Q0.h.d(method3, "getStateMethod");
                        if (i1.a.h(method3, p.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 1:
                try {
                    cls = c0137e.f1269b.b();
                } catch (ClassNotFoundException unused) {
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = c0137e.f1268a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                Q0.h.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                Q0.h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    Q0.h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 2:
                Class<?> loadClass3 = c0137e.f1268a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                Q0.h.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                Q0.h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    Q0.h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                Class<?> loadClass4 = c0137e.f1270c.f1113a.loadClass("androidx.window.extensions.WindowExtensions");
                Q0.h.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = c0137e.f1268a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                Q0.h.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Q0.h.d(method8, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
