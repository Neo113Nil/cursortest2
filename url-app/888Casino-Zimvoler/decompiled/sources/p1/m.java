package p1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3416e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f3417f = oVar;
        this.f3418g = i;
    }

    @Override // l1.a
    public final long a() {
        switch (this.f3416e) {
            case 0:
                this.f3417f.f3430k.getClass();
                try {
                    this.f3417f.f3442w.k(this.f3418g, 9);
                    synchronized (this.f3417f) {
                        this.f3417f.f3444y.remove(Integer.valueOf(this.f3418g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3417f.f3430k.getClass();
                try {
                    this.f3417f.f3442w.k(this.f3418g, 9);
                    synchronized (this.f3417f) {
                        this.f3417f.f3444y.remove(Integer.valueOf(this.f3418g));
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
        this.f3417f = oVar;
        this.f3418g = i;
    }
}
