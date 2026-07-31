package A2;

import C2.G0;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public abstract class b {
    public static final m2.c a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f63b;
        }
        if (fVar instanceof G0) {
            return a(((G0) fVar).k());
        }
        return null;
    }

    public static final f b(F2.b bVar, f descriptor) {
        InterfaceC3527b c4;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        m2.c a4 = a(descriptor);
        if (a4 == null || (c4 = F2.b.c(bVar, a4, null, 2, null)) == null) {
            return null;
        }
        return c4.getDescriptor();
    }

    public static final f c(f fVar, m2.c context) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new c(fVar, context);
    }
}
