package N3;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends J3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f1877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, q qVar, int i4, long j4) {
        super(str, true);
        this.f1877e = qVar;
        this.f1878f = i4;
        this.f1879g = j4;
    }

    @Override // J3.a
    public final long a() {
        q qVar = this.f1877e;
        try {
            qVar.f1899w.t(this.f1878f, this.f1879g);
            return -1L;
        } catch (IOException e4) {
            qVar.b(e4);
            return -1L;
        }
    }
}
