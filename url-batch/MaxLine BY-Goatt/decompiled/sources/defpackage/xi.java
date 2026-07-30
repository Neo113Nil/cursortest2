package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xi extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Function0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi(int i, Function0 function0) {
        super(0);
        this.m = i;
        this.n = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        Function0 function0 = this.n;
        switch (i) {
            case 0:
                return function0.invoke();
            case 1:
                try {
                    return (List) function0.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return ah0.m;
                }
            default:
                return new q80(0, 0.0f, function0);
        }
    }
}
