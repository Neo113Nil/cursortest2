package c0;

import b0.r;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200a extends k implements l2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2616e;
    public final /* synthetic */ r f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0200a(r rVar, int i3) {
        super(0);
        this.f2616e = i3;
        this.f = rVar;
    }

    @Override // l2.a
    public final Object invoke() {
        switch (this.f2616e) {
            case 0:
                Class<?> loadClass = ((ClassLoader) this.f.f2543a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                j.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                r rVar = this.f;
                Class<?> loadClass2 = ((ClassLoader) rVar.f2543a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                j.d(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                boolean z = false;
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", new Class[0]);
                Class<?> loadClass3 = ((ClassLoader) rVar.f2543a).loadClass("androidx.window.extensions.WindowExtensions");
                j.d(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                j.d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                if (getWindowExtensionsMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers())) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
