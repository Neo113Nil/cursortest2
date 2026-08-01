package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class un extends d50 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ xn f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(String str, xn xnVar, int i, List list, boolean z) {
        super(str, true);
        this.f = xnVar;
        this.g = i;
    }

    @Override // defpackage.d50
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.p.getClass();
                try {
                    this.f.B.s(this.g, 9);
                    synchronized (this.f) {
                        this.f.D.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            default:
                this.f.p.getClass();
                try {
                    this.f.B.s(this.g, 9);
                    synchronized (this.f) {
                        this.f.D.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(String str, xn xnVar, int i, List list) {
        super(str, true);
        this.f = xnVar;
        this.g = i;
    }
}
