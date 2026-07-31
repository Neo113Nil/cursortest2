package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: ActivityResultRegistry.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/compose/LocalActivityResultRegistryOwner;", "", "<init>", "()V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "LocalComposition", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalActivityResultRegistryOwner {
    public static final LocalActivityResultRegistryOwner INSTANCE = new LocalActivityResultRegistryOwner();
    private static final ProvidableCompositionLocal LocalComposition = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.activity.compose.LocalActivityResultRegistryOwner$LocalComposition$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final ActivityResultRegistryOwner mo4828invoke() {
            return null;
        }
    }, 1, null);

    private LocalActivityResultRegistryOwner() {
    }
}
