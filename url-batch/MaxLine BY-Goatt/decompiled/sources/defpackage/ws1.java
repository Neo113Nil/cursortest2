package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ws1 extends Error {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ws1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
        str = (i & 1) != 0 ? "An operation is not implemented." : str;
        str.getClass();
    }

    public ws1() {
        this(null, 1, null);
    }
}
