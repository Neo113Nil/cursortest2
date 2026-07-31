package W;

import P0.p;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.datastore.preferences.protobuf.k0;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class d extends P0.i implements O0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f884g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i2) {
        super(0);
        this.f883f = i2;
        this.f884g = eVar;
    }

    @Override // O0.a
    public final Object h() {
        boolean z2;
        Class cls;
        boolean z3;
        boolean z4;
        switch (this.f883f) {
            case 0:
                Class<?> loadClass = this.f884g.f885a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                P0.h.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                P0.h.d(method, "getBoundsMethod");
                if (k0.p(method, p.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    P0.h.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (k0.p(method2, p.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        P0.h.d(method3, "getStateMethod");
                        if (k0.p(method3, p.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z2 = true;
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 1:
                e eVar = this.f884g;
                try {
                    cls = eVar.f886b.b();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f885a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                P0.h.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                P0.h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    P0.h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                Class<?> loadClass3 = this.f884g.f885a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                P0.h.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                P0.h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    P0.h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            default:
                e eVar2 = this.f884g;
                Class<?> loadClass4 = eVar2.f887c.f822a.loadClass("androidx.window.extensions.WindowExtensions");
                P0.h.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = eVar2.f885a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                P0.h.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                P0.h.d(method8, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
