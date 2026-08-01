package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zt extends gh0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ du f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt(String str, du duVar, int i, List list, boolean z) {
        super(str, true);
        this.e = 0;
        this.f = duVar;
        this.g = i;
    }

    @Override // defpackage.gh0
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.p.getClass();
                try {
                    this.f.B.P(this.g, kn.CANCEL);
                    synchronized (this.f) {
                        this.f.D.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            case 1:
                this.f.p.getClass();
                try {
                    this.f.B.P(this.g, kn.CANCEL);
                    synchronized (this.f) {
                        this.f.D.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
            default:
                this.f.p.getClass();
                synchronized (this.f) {
                    this.f.D.remove(Integer.valueOf(this.g));
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt(String str, du duVar, int i, Object obj, int i2) {
        super(str, true);
        this.e = i2;
        this.f = duVar;
        this.g = i;
    }
}
