package C0;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends n implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowLayoutInfo p02 = (WindowLayoutInfo) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((f) this.receiver).accept(p02);
        return Unit.f6114a;
    }
}
