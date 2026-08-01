package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class rm extends op implements ml {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rm(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ml
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return (List) obj;
            case 1:
                try {
                    return (List) ((ml) obj).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return di.f;
                }
            default:
                return jw.z((j90) obj);
        }
    }
}
