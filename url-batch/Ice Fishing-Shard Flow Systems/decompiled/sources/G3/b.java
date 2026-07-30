package G3;

import A.j;
import B5.f;
import android.util.Log;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import o5.C0804b;
import v5.C0977c;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: d, reason: collision with root package name */
    public final C0804b f842d;

    public b(C0804b delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f842d = delegate;
    }

    @Override // B5.f
    public final C0977c p(Collection logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        Log.d("OneSignalOtel", "OTEL export request sent to backend. count=" + logs.size());
        C0977c p7 = this.f842d.p(logs);
        p7.f(new j(p7, 2, this));
        return p7;
    }

    @Override // B5.f
    public final C0977c shutdown() {
        C0977c shutdown = this.f842d.shutdown();
        Intrinsics.checkNotNullExpressionValue(shutdown, "shutdown(...)");
        return shutdown;
    }
}
