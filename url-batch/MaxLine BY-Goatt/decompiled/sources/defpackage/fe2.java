package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fe2 implements Function1 {
    public static final fe2 m = new fe2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.b(obj, Boolean.FALSE)) {
            return new aw(aw.g);
        }
        obj.getClass();
        return new aw(ap.c(((Integer) obj).intValue()));
    }
}
