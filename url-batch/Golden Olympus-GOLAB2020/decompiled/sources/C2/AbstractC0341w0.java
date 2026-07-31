package C2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import y2.C3528c;

/* renamed from: C2.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0341w0 {
    public static final void a(int i4, int i5, A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i6 = (~i4) & i5;
        for (int i7 = 0; i7 < 32; i7++) {
            if ((i6 & 1) != 0) {
                arrayList.add(descriptor.g(i7));
            }
            i6 >>>= 1;
        }
        throw new C3528c(arrayList, descriptor.a());
    }
}
