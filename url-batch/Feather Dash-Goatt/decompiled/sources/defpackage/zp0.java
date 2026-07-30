package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zp0 extends Error {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zp0(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
        str = (i & 1) != 0 ? "An operation is not implemented." : str;
        str.getClass();
    }

    public zp0() {
        this(null, 1, null);
    }
}
