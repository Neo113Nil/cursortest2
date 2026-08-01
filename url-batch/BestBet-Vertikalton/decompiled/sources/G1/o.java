package G1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends C1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f408g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, q qVar, int i, List list) {
        super(str, true);
        this.f407f = qVar;
        this.f408g = i;
    }

    @Override // C1.a
    public final long a() {
        switch (this.f406e) {
            case 0:
                this.f407f.f420k.getClass();
                try {
                    this.f407f.f432w.s(this.f408g, 9);
                    synchronized (this.f407f) {
                        this.f407f.f434y.remove(Integer.valueOf(this.f408g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f407f.f420k.getClass();
                try {
                    this.f407f.f432w.s(this.f408g, 9);
                    synchronized (this.f407f) {
                        this.f407f.f434y.remove(Integer.valueOf(this.f408g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, q qVar, int i, List list, boolean z2) {
        super(str, true);
        this.f407f = qVar;
        this.f408g = i;
    }
}
