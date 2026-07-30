package w;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d extends d1.i implements c1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1210c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f1211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i2) {
        super(0);
        this.f1210c = i2;
        this.f1211d = eVar;
    }

    @Override // c1.a
    public final Object a() {
        boolean z2;
        Class<?> cls;
        boolean z3;
        boolean z4;
        switch (this.f1210c) {
            case 0:
                Class<?> loadClass = this.f1211d.f1212a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                loadClass.getClass();
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                method.getClass();
                if (a.a.i(method, d1.l.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    method2.getClass();
                    Class cls2 = Integer.TYPE;
                    if (a.a.i(method2, d1.l.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        method3.getClass();
                        if (a.a.i(method3, d1.l.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z2 = true;
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 1:
                e eVar = this.f1211d;
                try {
                    cls = eVar.f1213b.f1147a.loadClass("java.util.function.Consumer");
                    cls.getClass();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f1212a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass2.getClass();
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                method4.getClass();
                if (Modifier.isPublic(method4.getModifiers())) {
                    method5.getClass();
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case 2:
                Class<?> loadClass3 = this.f1211d.f1212a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass3.getClass();
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                method6.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    method7.getClass();
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            default:
                e eVar2 = this.f1211d;
                Class<?> loadClass4 = eVar2.f1214c.f1147a.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass4.getClass();
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = eVar2.f1212a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass5.getClass();
                method8.getClass();
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
