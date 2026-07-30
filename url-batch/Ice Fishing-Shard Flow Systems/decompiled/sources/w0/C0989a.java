package w0;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989a extends p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L4.a f8280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0989a(L4.a aVar, int i2) {
        super(0);
        this.f8279d = i2;
        this.f8280e = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z7;
        switch (this.f8279d) {
            case 0:
                Class<?> loadClass = this.f8280e.f1684b.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                L4.a aVar = this.f8280e;
                Class<?> loadClass2 = aVar.f1684b.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                Intrinsics.checkNotNullExpressionValue(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clazz = aVar.f1684b.loadClass("androidx.window.extensions.WindowExtensions");
                Intrinsics.checkNotNullExpressionValue(clazz, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                Intrinsics.checkNotNullParameter(getWindowExtensionsMethod, "<this>");
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                if (getWindowExtensionsMethod.getReturnType().equals(clazz)) {
                    Intrinsics.checkNotNullParameter(getWindowExtensionsMethod, "<this>");
                    if (Modifier.isPublic(getWindowExtensionsMethod.getModifiers())) {
                        z7 = true;
                        return Boolean.valueOf(z7);
                    }
                }
                z7 = false;
                return Boolean.valueOf(z7);
        }
    }
}
