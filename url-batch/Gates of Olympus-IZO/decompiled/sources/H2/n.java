package H2;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends D2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1977e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f1978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1979g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, p pVar, int i3, List list) {
        super(str, true);
        this.f1978f = pVar;
        this.f1979g = i3;
    }

    @Override // D2.a
    public final long a() {
        switch (this.f1977e) {
            case 0:
                this.f1978f.f1994n.getClass();
                try {
                    this.f1978f.f2005z.k(this.f1979g, 9);
                    synchronized (this.f1978f) {
                        this.f1978f.B.remove(Integer.valueOf(this.f1979g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f1978f.f1994n.getClass();
                try {
                    this.f1978f.f2005z.k(this.f1979g, 9);
                    synchronized (this.f1978f) {
                        this.f1978f.B.remove(Integer.valueOf(this.f1979g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, p pVar, int i3, List list, boolean z3) {
        super(str, true);
        this.f1978f = pVar;
        this.f1979g = i3;
    }
}
