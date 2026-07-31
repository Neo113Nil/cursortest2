package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: RecomposeScopeImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "flags", "updateChangedFlags", "(I)I", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "callbackLock", "Ljava/lang/Object;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RecomposeScopeImplKt {
    private static final Object callbackLock = new Object();

    public static final int updateChangedFlags(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
