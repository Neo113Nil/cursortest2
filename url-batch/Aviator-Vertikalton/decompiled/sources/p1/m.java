package p1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3807e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3809g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f3808f = oVar;
        this.f3809g = i;
    }

    @Override // l1.a
    public final long a() {
        switch (this.f3807e) {
            case 0:
                this.f3808f.f3822k.getClass();
                try {
                    this.f3808f.f3834w.m(this.f3809g, 9);
                    synchronized (this.f3808f) {
                        this.f3808f.f3836y.remove(Integer.valueOf(this.f3809g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f3808f.f3822k.getClass();
                try {
                    this.f3808f.f3834w.m(this.f3809g, 9);
                    synchronized (this.f3808f) {
                        this.f3808f.f3836y.remove(Integer.valueOf(this.f3809g));
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
        this.f3808f = oVar;
        this.f3809g = i;
    }
}
