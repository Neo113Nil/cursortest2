package f0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.t;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f4180g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i7) {
        super(0);
        this.f4179f = i7;
        this.f4180g = eVar;
    }

    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        boolean z5;
        Class cls;
        boolean z6;
        boolean z7;
        switch (this.f4179f) {
            case 0:
                Class<?> loadClass = this.f4180g.f4181a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                kotlin.jvm.internal.i.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method getBoundsMethod = loadClass.getMethod("getBounds", null);
                Method getTypeMethod = loadClass.getMethod("getType", null);
                Method getStateMethod = loadClass.getMethod("getState", null);
                kotlin.jvm.internal.i.d(getBoundsMethod, "getBoundsMethod");
                if (A3.c.M(getBoundsMethod, t.a(Rect.class)) && Modifier.isPublic(getBoundsMethod.getModifiers())) {
                    kotlin.jvm.internal.i.d(getTypeMethod, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (A3.c.M(getTypeMethod, t.a(cls2)) && Modifier.isPublic(getTypeMethod.getModifiers())) {
                        kotlin.jvm.internal.i.d(getStateMethod, "getStateMethod");
                        if (A3.c.M(getStateMethod, t.a(cls2)) && Modifier.isPublic(getStateMethod.getModifiers())) {
                            z5 = true;
                            return Boolean.valueOf(z5);
                        }
                    }
                }
                z5 = false;
                return Boolean.valueOf(z5);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                e eVar = this.f4180g;
                try {
                    cls = eVar.f4182b.b();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f4181a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method removeListenerMethod = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                kotlin.jvm.internal.i.d(addListenerMethod, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                    kotlin.jvm.internal.i.d(removeListenerMethod, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod.getModifiers())) {
                        z6 = true;
                        return Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return Boolean.valueOf(z6);
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                Class<?> loadClass3 = this.f4180g.f4181a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod2 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method removeListenerMethod2 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                kotlin.jvm.internal.i.d(addListenerMethod2, "addListenerMethod");
                if (Modifier.isPublic(addListenerMethod2.getModifiers())) {
                    kotlin.jvm.internal.i.d(removeListenerMethod2, "removeListenerMethod");
                    if (Modifier.isPublic(removeListenerMethod2.getModifiers())) {
                        z7 = true;
                        return Boolean.valueOf(z7);
                    }
                }
                z7 = false;
                return Boolean.valueOf(z7);
            default:
                e eVar2 = this.f4180g;
                Class<?> loadClass4 = eVar2.f4183c.f3605a.loadClass("androidx.window.extensions.WindowExtensions");
                kotlin.jvm.internal.i.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method getWindowLayoutComponentMethod = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = eVar2.f4181a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                kotlin.jvm.internal.i.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                kotlin.jvm.internal.i.d(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers()) && getWindowLayoutComponentMethod.getReturnType().equals(loadClass5));
        }
    }
}
