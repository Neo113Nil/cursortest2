package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p7 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7(int i, int i2) {
        super(1);
        this.m = i2;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        int i2 = this.n;
        switch (i) {
            case 0:
                return Boolean.valueOf(((yo0) obj).K0(i2));
            case 1:
                return Boolean.valueOf(((View) obj).getId() == i2);
            case 2:
                return Boolean.valueOf(((yo0) obj).K0(i2));
            default:
                return Integer.valueOf(((qa1) obj).a - i2);
        }
    }
}
