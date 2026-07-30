package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p80 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p80(int i, List list) {
        super(0);
        this.m = i;
        this.n = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        List list = this.n;
        switch (i) {
            case 0:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            default:
                return list;
        }
    }
}
