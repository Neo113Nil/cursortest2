package C2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class O extends AbstractC0304d0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(A2.f elementDesc) {
        super(elementDesc, null);
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
    }

    @Override // A2.f
    public String a() {
        return "kotlin.collections.HashSet";
    }
}
