package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class dp extends as implements rn {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ dp(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.rn
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return (List) obj;
            case 1:
                try {
                    return (List) ((rn) obj).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return ik.f;
                }
            default:
                return kr.C((uc0) obj);
        }
    }
}
