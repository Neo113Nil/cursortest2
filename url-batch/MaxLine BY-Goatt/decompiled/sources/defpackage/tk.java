package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tk extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk(int i, List list) {
        super(1);
        this.m = i;
        this.n = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                this.n.get(((Number) obj).intValue());
                break;
            default:
                this.n.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
