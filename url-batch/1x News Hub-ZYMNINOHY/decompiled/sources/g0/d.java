package g0;

import a.AbstractC0129a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5020e;
    public final /* synthetic */ e f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i3) {
        super(0);
        this.f5020e = i3;
        this.f = eVar;
    }

    @Override // l2.a
    public final Object invoke() {
        Class cls;
        boolean z;
        boolean z2;
        switch (this.f5020e) {
            case 0:
                Class<?> loadClass = this.f.f5021a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                kotlin.jvm.internal.j.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                boolean z3 = false;
                Method getBoundsMethod = loadClass.getMethod("getBounds", new Class[0]);
                Method getTypeMethod = loadClass.getMethod("getType", new Class[0]);
                Method getStateMethod = loadClass.getMethod("getState", new Class[0]);
                kotlin.jvm.internal.j.d(getBoundsMethod, "getBoundsMethod");
                if (AbstractC0129a.k(getBoundsMethod, r.a(Rect.class)) && Modifier.isPublic(getBoundsMethod.getModifiers())) {
                    kotlin.jvm.internal.j.d(getTypeMethod, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (AbstractC0129a.k(getTypeMethod, r.a(cls2)) && Modifier.isPublic(getTypeMethod.getModifiers())) {
                        kotlin.jvm.internal.j.d(getStateMethod, "getStateMethod");
                        if (AbstractC0129a.k(getStateMethod, r.a(cls2)) && Modifier.isPublic(getStateMethod.getModifiers())) {
                            z3 = true;
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case 1:
                e eVar = this.f;
                try {
                    cls = eVar.f5022b.j();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f5021a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.j.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method removeListenerMethod = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                kotlin.jvm.internal.j.d(addListenerMethod, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                    kotlin.jvm.internal.j.d(removeListenerMethod, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod.getModifiers())) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                Class<?> loadClass3 = this.f.f5021a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.j.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod2 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method removeListenerMethod2 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                kotlin.jvm.internal.j.d(addListenerMethod2, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod2.getModifiers())) {
                    kotlin.jvm.internal.j.d(removeListenerMethod2, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod2.getModifiers())) {
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            default:
                e eVar2 = this.f;
                Class<?> loadClass4 = ((ClassLoader) eVar2.f5023c.f2543a).loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.j.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                boolean z4 = false;
                Method getWindowLayoutComponentMethod = loadClass4.getMethod("getWindowLayoutComponent", new Class[0]);
                Class<?> loadClass5 = eVar2.f5021a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.j.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                kotlin.jvm.internal.j.d(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers()) && getWindowLayoutComponentMethod.getReturnType().equals(loadClass5)) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
        }
    }
}
