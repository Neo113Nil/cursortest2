package m2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public static final w f6517d = new w();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.a(obj, Boolean.FALSE)) {
            return new k1.p(k1.p.g);
        }
        obj.getClass();
        return new k1.p(k1.v.b(((Integer) obj).intValue()));
    }
}
