package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cmm extends Exception {

    @Deprecated
    public final Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cmm(Status status) {
        super(r0 + ": " + (r1 == null ? "" : r1));
        int i = status.f;
        String str = status.g;
        this.a = status;
    }

    public final int a() {
        return this.a.f;
    }
}
