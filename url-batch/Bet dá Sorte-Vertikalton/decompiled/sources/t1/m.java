package t1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends p1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3868e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3870g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f3869f = oVar;
        this.f3870g = i;
    }

    @Override // p1.a
    public final long a() {
        switch (this.f3868e) {
            case 0:
                this.f3869f.f3882k.getClass();
                try {
                    this.f3869f.f3894w.m(this.f3870g, 9);
                    synchronized (this.f3869f) {
                        this.f3869f.f3896y.remove(Integer.valueOf(this.f3870g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3869f.f3882k.getClass();
                try {
                    this.f3869f.f3894w.m(this.f3870g, 9);
                    synchronized (this.f3869f) {
                        this.f3869f.f3896y.remove(Integer.valueOf(this.f3870g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list, boolean z2) {
        super(str, true);
        this.f3869f = oVar;
        this.f3870g = i;
    }
}
