package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class gx0 extends CancellationException {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx0(String str, int i) {
        super(str);
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                setStackTrace(op.m);
                break;
            case 1:
                setStackTrace(m90.l);
                break;
            default:
                setStackTrace(la0.r);
                break;
        }
        return this;
    }
}
