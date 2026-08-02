package kotlin.reflect.jvm.internal.impl.types.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* loaded from: classes9.dex */
public /* synthetic */ class TypeCheckerProviderContext$$Util {
    public static /* synthetic */ TypeCheckerState newTypeCheckerState$default(TypeCheckerProviderContext typeCheckerProviderContext, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: newTypeCheckerState");
            return null;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return typeCheckerProviderContext.newTypeCheckerState(z, z2, z3);
    }
}
