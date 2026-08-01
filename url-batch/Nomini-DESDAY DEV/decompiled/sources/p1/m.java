package p1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3415e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3417g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f3416f = oVar;
        this.f3417g = i;
    }

    @Override // l1.a
    public final long a() {
        switch (this.f3415e) {
            case 0:
                this.f3416f.f3429k.getClass();
                try {
                    this.f3416f.f3441w.k(this.f3417g, 9);
                    synchronized (this.f3416f) {
                        this.f3416f.f3443y.remove(Integer.valueOf(this.f3417g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3416f.f3429k.getClass();
                try {
                    this.f3416f.f3441w.k(this.f3417g, 9);
                    synchronized (this.f3416f) {
                        this.f3416f.f3443y.remove(Integer.valueOf(this.f3417g));
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
        this.f3416f = oVar;
        this.f3417g = i;
    }
}
