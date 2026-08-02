package u1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class a extends j implements InterfaceC1328a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f15505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i4) {
        super(0);
        this.f15504e = i4;
        this.f15505f = bVar;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        switch (this.f15504e) {
            case 0:
                Class<?> loadClass = this.f15505f.f15506a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                i.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                b bVar = this.f15505f;
                Class<?> loadClass2 = bVar.f15506a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                i.d(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass3 = bVar.f15506a.loadClass("androidx.window.extensions.WindowExtensions");
                i.d(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                i.d(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(getWindowExtensionsMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers()));
        }
    }
}
