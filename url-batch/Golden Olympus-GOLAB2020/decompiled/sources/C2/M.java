package C2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class M extends AbstractC0314i0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(A2.f keyDesc, A2.f valueDesc) {
        super("kotlin.collections.HashMap", keyDesc, valueDesc, null);
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
    }
}
