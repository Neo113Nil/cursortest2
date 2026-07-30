package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class rb implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ Object o;

    public /* synthetic */ rb(int i, long j, Object obj) {
        this.m = i;
        this.o = obj;
        this.n = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        long j = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((bk2) ((cq) obj)).b(j);
            default:
                ((Function1) obj).invoke(Long.valueOf(j));
                return Unit.a;
        }
    }
}
