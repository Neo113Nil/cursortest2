package hd;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends Error {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
        str = (i3 & 1) != 0 ? "An operation is not implemented." : str;
        str.getClass();
    }

    public k() {
        this(null, 1, null);
    }
}
