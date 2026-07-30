package A0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f61d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f62e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i2) {
        super(0);
        this.f61d = i2;
        this.f62e = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z7;
        Class cls;
        boolean z8;
        boolean z9;
        boolean z10;
        switch (this.f61d) {
            case 0:
                Class<?> loadClass = this.f62e.f63a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method getBoundsMethod = loadClass.getMethod("getBounds", null);
                Method getTypeMethod = loadClass.getMethod("getType", null);
                Method getStateMethod = loadClass.getMethod("getState", null);
                Intrinsics.checkNotNullExpressionValue(getBoundsMethod, "getBoundsMethod");
                if (V6.b.w(getBoundsMethod, E.a(Rect.class))) {
                    Intrinsics.checkNotNullParameter(getBoundsMethod, "<this>");
                    if (Modifier.isPublic(getBoundsMethod.getModifiers())) {
                        Intrinsics.checkNotNullExpressionValue(getTypeMethod, "getTypeMethod");
                        Class cls2 = Integer.TYPE;
                        if (V6.b.w(getTypeMethod, E.a(cls2))) {
                            Intrinsics.checkNotNullParameter(getTypeMethod, "<this>");
                            if (Modifier.isPublic(getTypeMethod.getModifiers())) {
                                Intrinsics.checkNotNullExpressionValue(getStateMethod, "getStateMethod");
                                if (V6.b.w(getStateMethod, E.a(cls2))) {
                                    Intrinsics.checkNotNullParameter(getStateMethod, "<this>");
                                    if (Modifier.isPublic(getStateMethod.getModifiers())) {
                                        z7 = true;
                                        return Boolean.valueOf(z7);
                                    }
                                }
                            }
                        }
                    }
                }
                z7 = false;
                return Boolean.valueOf(z7);
            case 1:
                e eVar = this.f62e;
                try {
                    cls = eVar.f64b.u();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f63a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                Intrinsics.checkNotNullExpressionValue(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method removeListenerMethod = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                Intrinsics.checkNotNullExpressionValue(addListenerMethod, "addListenerMethod");
                Intrinsics.checkNotNullParameter(addListenerMethod, "<this>");
                if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                    Intrinsics.checkNotNullExpressionValue(removeListenerMethod, "removeListenerMethod");
                    Intrinsics.checkNotNullParameter(removeListenerMethod, "<this>");
                    if (Modifier.isPublic(removeListenerMethod.getModifiers())) {
                        z8 = true;
                        return Boolean.valueOf(z8);
                    }
                }
                z8 = false;
                return Boolean.valueOf(z8);
            case 2:
                Class<?> loadClass3 = this.f62e.f63a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                Intrinsics.checkNotNullExpressionValue(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod2 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method removeListenerMethod2 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                Intrinsics.checkNotNullExpressionValue(addListenerMethod2, "addListenerMethod");
                Intrinsics.checkNotNullParameter(addListenerMethod2, "<this>");
                if (Modifier.isPublic(addListenerMethod2.getModifiers())) {
                    Intrinsics.checkNotNullExpressionValue(removeListenerMethod2, "removeListenerMethod");
                    Intrinsics.checkNotNullParameter(removeListenerMethod2, "<this>");
                    if (Modifier.isPublic(removeListenerMethod2.getModifiers())) {
                        z9 = true;
                        return Boolean.valueOf(z9);
                    }
                }
                z9 = false;
                return Boolean.valueOf(z9);
            default:
                e eVar2 = this.f62e;
                Class<?> loadClass4 = eVar2.f65c.f1684b.loadClass("androidx.window.extensions.WindowExtensions");
                Intrinsics.checkNotNullExpressionValue(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method getWindowLayoutComponentMethod = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> clazz = eVar2.f63a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                Intrinsics.checkNotNullExpressionValue(clazz, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Intrinsics.checkNotNullExpressionValue(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                Intrinsics.checkNotNullParameter(getWindowLayoutComponentMethod, "<this>");
                if (Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers())) {
                    Intrinsics.checkNotNullParameter(getWindowLayoutComponentMethod, "<this>");
                    Intrinsics.checkNotNullParameter(clazz, "clazz");
                    if (getWindowLayoutComponentMethod.getReturnType().equals(clazz)) {
                        z10 = true;
                        return Boolean.valueOf(z10);
                    }
                }
                z10 = false;
                return Boolean.valueOf(z10);
        }
    }
}
