package y1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.q;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f16241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i4) {
        super(0);
        this.f16240e = i4;
        this.f16241f = eVar;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        boolean z;
        Class cls;
        boolean z4;
        boolean z5;
        switch (this.f16240e) {
            case 0:
                Class<?> loadClass = this.f16241f.f16242a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                kotlin.jvm.internal.i.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method getBoundsMethod = loadClass.getMethod("getBounds", null);
                Method getTypeMethod = loadClass.getMethod("getType", null);
                Method getStateMethod = loadClass.getMethod("getState", null);
                kotlin.jvm.internal.i.d(getBoundsMethod, "getBoundsMethod");
                if (U.i.g(getBoundsMethod, q.a(Rect.class)) && Modifier.isPublic(getBoundsMethod.getModifiers())) {
                    kotlin.jvm.internal.i.d(getTypeMethod, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (U.i.g(getTypeMethod, q.a(cls2)) && Modifier.isPublic(getTypeMethod.getModifiers())) {
                        kotlin.jvm.internal.i.d(getStateMethod, "getStateMethod");
                        if (U.i.g(getStateMethod, q.a(cls2)) && Modifier.isPublic(getStateMethod.getModifiers())) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 1:
                e eVar = this.f16241f;
                try {
                    cls = eVar.f16243b.b();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f16242a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method removeListenerMethod = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                kotlin.jvm.internal.i.d(addListenerMethod, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                    kotlin.jvm.internal.i.d(removeListenerMethod, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod.getModifiers())) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            case 2:
                Class<?> loadClass3 = this.f16241f.f16242a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod2 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method removeListenerMethod2 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                kotlin.jvm.internal.i.d(addListenerMethod2, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod2.getModifiers())) {
                    kotlin.jvm.internal.i.d(removeListenerMethod2, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod2.getModifiers())) {
                        z5 = true;
                        return Boolean.valueOf(z5);
                    }
                }
                z5 = false;
                return Boolean.valueOf(z5);
            default:
                e eVar2 = this.f16241f;
                Class<?> loadClass4 = eVar2.f16244c.f15506a.loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.i.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method getWindowLayoutComponentMethod = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = eVar2.f16242a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                kotlin.jvm.internal.i.d(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers()) && getWindowLayoutComponentMethod.getReturnType().equals(loadClass5));
        }
    }
}
