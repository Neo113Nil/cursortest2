package A0;

import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import x0.AbstractC0998e;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public static final f f66d = new f(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WindowLayoutComponent component;
        try {
            ClassLoader loader = h.class.getClassLoader();
            e eVar = loader != null ? new e(loader, new l4.b(loader)) : null;
            if (eVar == null || (component = eVar.a()) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(loader, "loader");
            l4.b adapter = new l4.b(loader);
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            int a7 = AbstractC0998e.a();
            return a7 >= 2 ? new C0.d(component) : a7 == 1 ? new C0.c(component, adapter) : new C0.a();
        } catch (Throwable unused) {
            g gVar = g.f67a;
            return null;
        }
    }
}
