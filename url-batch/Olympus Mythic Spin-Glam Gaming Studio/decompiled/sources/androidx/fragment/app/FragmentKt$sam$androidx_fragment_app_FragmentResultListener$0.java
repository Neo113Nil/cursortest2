package androidx.fragment.app;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fragment.kt */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes5.dex */
final class FragmentKt$sam$androidx_fragment_app_FragmentResultListener$0 implements FragmentResultListener {
    private final /* synthetic */ Function2 function;

    @Override // androidx.fragment.app.FragmentResultListener
    public final /* synthetic */ void onFragmentResult(String p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullExpressionValue(this.function.invoke(p0, p1), "invoke(...)");
    }
}
