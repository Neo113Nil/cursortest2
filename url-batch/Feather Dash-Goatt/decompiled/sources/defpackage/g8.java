package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class g8 extends Exception {
    public final Status d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g8(Status status) {
        super(r0 + ": " + (r1 == null ? "" : r1));
        int i = status.d;
        String str = status.e;
        this.d = status;
    }
}
