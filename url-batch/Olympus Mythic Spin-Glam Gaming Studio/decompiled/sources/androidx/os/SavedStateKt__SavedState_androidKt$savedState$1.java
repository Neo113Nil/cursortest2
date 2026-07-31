package androidx.os;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedState.android.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes15.dex */
public final class SavedStateKt__SavedState_androidKt$savedState$1 implements Function1 {
    public static final SavedStateKt__SavedState_androidKt$savedState$1 INSTANCE = new SavedStateKt__SavedState_androidKt$savedState$1();

    /* renamed from: invoke-xApjlu4, reason: not valid java name */
    public final void m2799invokexApjlu4(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2799invokexApjlu4(((SavedStateWriter) obj).getSource());
        return Unit.INSTANCE;
    }
}
