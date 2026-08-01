package z1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends v1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4459e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f4460f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4461g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f4460f = oVar;
        this.f4461g = i;
    }

    @Override // v1.a
    public final long a() {
        switch (this.f4459e) {
            case 0:
                this.f4460f.f4474k.getClass();
                try {
                    this.f4460f.f4486w.m(this.f4461g, 9);
                    synchronized (this.f4460f) {
                        this.f4460f.f4488y.remove(Integer.valueOf(this.f4461g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f4460f.f4474k.getClass();
                try {
                    this.f4460f.f4486w.m(this.f4461g, 9);
                    synchronized (this.f4460f) {
                        this.f4460f.f4488y.remove(Integer.valueOf(this.f4461g));
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
        this.f4460f = oVar;
        this.f4461g = i;
    }
}
