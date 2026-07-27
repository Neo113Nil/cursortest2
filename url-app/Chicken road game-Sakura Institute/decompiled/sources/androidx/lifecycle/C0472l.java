package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472l {
    public static EnumC0474n a(EnumC0475o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            return EnumC0474n.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0474n.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0474n.ON_RESUME;
    }
}
