package L0;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Status f876a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(Status status) {
        super(r0 + ": " + (r1 == null ? "" : r1));
        int i3 = status.f2677a;
        String str = status.f2678b;
        this.f876a = status;
    }
}
