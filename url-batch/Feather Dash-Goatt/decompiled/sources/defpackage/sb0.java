package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb0 implements oq0 {
    public final /* synthetic */ int a;

    public /* synthetic */ sb0(int i) {
        this.a = i;
    }

    @Override // defpackage.tv
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new wv("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                pq0 pq0Var = (pq0) obj2;
                pq0Var.a(k01.g, entry.getKey());
                pq0Var.a(k01.h, entry.getValue());
                return;
            default:
                throw new wv("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
