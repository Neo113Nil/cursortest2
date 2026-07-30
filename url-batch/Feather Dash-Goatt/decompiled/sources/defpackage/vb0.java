package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vb0 implements uv {
    public static final tb0 f;
    public static final tb0 g;
    public final HashMap a;
    public final HashMap b;
    public final sb0 c;
    public boolean d;
    public static final sb0 e = new sb0(0);
    public static final ub0 h = new ub0();

    /* JADX WARN: Type inference failed for: r0v1, types: [tb0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [tb0] */
    static {
        final int i = 0;
        f = new em1() { // from class: tb0
            @Override // defpackage.tv
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((fm1) obj2).b((String) obj);
                        break;
                    default:
                        ((fm1) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new em1() { // from class: tb0
            @Override // defpackage.tv
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((fm1) obj2).b((String) obj);
                        break;
                    default:
                        ((fm1) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public vb0() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final uv a(Class cls, oq0 oq0Var) {
        this.a.put(cls, oq0Var);
        this.b.remove(cls);
        return this;
    }
}
