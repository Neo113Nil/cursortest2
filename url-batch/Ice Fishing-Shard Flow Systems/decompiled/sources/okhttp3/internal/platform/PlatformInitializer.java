package okhttp3.internal.platform;

import N6.d;
import N6.e;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;
import o0.InterfaceC0797b;

@Metadata
/* loaded from: classes.dex */
public final class PlatformInitializer implements InterfaceC0797b {
    @Override // o0.InterfaceC0797b
    public final Object create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        e eVar = e.f1879a;
        Object obj = e.f1879a;
        d dVar = obj != null ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.f1879a;
    }

    @Override // o0.InterfaceC0797b
    public final List dependencies() {
        return A.f6115d;
    }
}
