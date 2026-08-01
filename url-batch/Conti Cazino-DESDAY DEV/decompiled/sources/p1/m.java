package p1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3437e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3439g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f3438f = oVar;
        this.f3439g = i;
    }

    @Override // l1.a
    public final long a() {
        switch (this.f3437e) {
            case 0:
                this.f3438f.f3451k.getClass();
                try {
                    this.f3438f.f3463w.k(this.f3439g, 9);
                    synchronized (this.f3438f) {
                        this.f3438f.f3465y.remove(Integer.valueOf(this.f3439g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3438f.f3451k.getClass();
                try {
                    this.f3438f.f3463w.k(this.f3439g, 9);
                    synchronized (this.f3438f) {
                        this.f3438f.f3465y.remove(Integer.valueOf(this.f3439g));
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
        this.f3438f = oVar;
        this.f3439g = i;
    }
}
