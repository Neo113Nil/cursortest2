package okhttp3.internal.platform;

import B0.b;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.h;
import o8.e;
import o8.f;
import r7.C4985p;

/* loaded from: classes2.dex */
public final class PlatformInitializer implements b {
    @Override // B0.b
    public final Object create(Context context) {
        h.e(context, "context");
        f fVar = f.f39739a;
        Object obj = f.f39739a;
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar != null) {
            eVar.a(context);
        }
        return f.f39739a;
    }

    @Override // B0.b
    public final List dependencies() {
        return C4985p.f40358n;
    }
}
