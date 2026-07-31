package a3;

import android.content.Context;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.io0;
import java.io.IOException;

/* loaded from: classes.dex */
final class c1 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private final Context f57c;

    c1(Context context) {
        this.f57c = context;
    }

    @Override // a3.b0
    public final void a() {
        boolean z6;
        try {
            z6 = v2.a.d(this.f57c);
        } catch (IOException | IllegalStateException | o3.g | o3.h e7) {
            io0.e("Fail to get isAdIdFakeForDebugLogging", e7);
            z6 = false;
        }
        ho0.j(z6);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z6);
        io0.g(sb.toString());
    }
}
