package b0;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import x5.InterfaceC0732a;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262a extends j implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0263b f3604g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0262a(C0263b c0263b, int i7) {
        super(0);
        this.f3603f = i7;
        this.f3604g = c0263b;
    }

    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        switch (this.f3603f) {
            case 0:
                Class<?> loadClass = this.f3604g.f3605a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                i.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                C0263b c0263b = this.f3604g;
                Class<?> loadClass2 = c0263b.f3605a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                i.d(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass3 = c0263b.f3605a.loadClass("androidx.window.extensions.WindowExtensions");
                i.d(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                i.d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(getWindowExtensionsMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers()));
        }
    }
}
