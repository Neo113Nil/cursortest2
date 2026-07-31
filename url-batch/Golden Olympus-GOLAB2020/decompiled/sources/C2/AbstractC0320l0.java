package C2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: C2.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0320l0 extends N0 {
    protected abstract String Z(String str, String str2);

    protected String a0(A2.f descriptor, int i4) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.g(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.N0
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String V(A2.f fVar, int i4) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return c0(a0(fVar, i4));
    }

    protected final String c0(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String str = (String) U();
        if (str == null) {
            str = "";
        }
        return Z(str, nestedName);
    }
}
