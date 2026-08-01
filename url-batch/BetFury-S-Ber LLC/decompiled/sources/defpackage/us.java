package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class us extends uw implements ir {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ us(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ir
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return (List) obj;
            default:
                try {
                    return (List) ((ir) obj).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return wm.f;
                }
        }
    }
}
