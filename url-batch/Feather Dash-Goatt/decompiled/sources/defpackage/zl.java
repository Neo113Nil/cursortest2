package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zl extends m01 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public zl(Function1 function1) {
        super(new dd(4));
        this.c = new am(function1);
    }

    @Override // defpackage.m01
    public final n01 a(Object obj) {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new n01(this, obj, obj == null, null, true);
            default:
                return new n01(this, obj, obj == null, (vb1) this.c, true);
        }
    }

    @Override // defpackage.m01
    public gm1 b() {
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (am) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(Function0 function0) {
        super(function0);
        j41 j41Var = j41.o;
        this.c = j41Var;
    }
}
