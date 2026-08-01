package u;

import a.AbstractC0016a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090d extends e0.i implements d0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1271c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0091e f1272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0090d(C0091e c0091e, int i2) {
        super(0);
        this.f1271c = i2;
        this.f1272d = c0091e;
    }

    @Override // d0.a
    public final Object a() {
        boolean z;
        Class cls;
        boolean z2;
        boolean z3;
        switch (this.f1271c) {
            case 0:
                Class<?> loadClass = this.f1272d.f1273a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                e0.h.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                e0.h.d(method, "getBoundsMethod");
                if (AbstractC0016a.j(method, e0.l.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    e0.h.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (AbstractC0016a.j(method2, e0.l.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        e0.h.d(method3, "getStateMethod");
                        if (AbstractC0016a.j(method3, e0.l.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 1:
                C0091e c0091e = this.f1272d;
                try {
                    cls = c0091e.f1274b.b();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = c0091e.f1273a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                e0.h.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                e0.h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    e0.h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 2:
                Class<?> loadClass3 = this.f1272d.f1273a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                e0.h.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                e0.h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    e0.h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            default:
                C0091e c0091e2 = this.f1272d;
                Class<?> loadClass4 = c0091e2.f1275c.f1189a.loadClass("androidx.window.extensions.WindowExtensions");
                e0.h.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = c0091e2.f1273a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                e0.h.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                e0.h.d(method8, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
