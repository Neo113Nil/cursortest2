package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class jn extends zp implements vl {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jn(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.vl
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return (List) obj;
            case 1:
                try {
                    return (List) ((vl) obj).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return vh.f;
                }
            default:
                return j8.u((r90) obj);
        }
    }
}
