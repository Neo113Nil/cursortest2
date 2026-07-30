package D0;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class c extends p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public static final c f320d = new c(1);

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        Intrinsics.checkNotNullParameter(require, "$this$require");
        boolean z7 = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z7 = false;
        }
        return Boolean.valueOf(z7);
    }
}
