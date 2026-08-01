package G1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends C1.a {
    public final /* synthetic */ q e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f393g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, q qVar, int i, long j) {
        super(str, true);
        this.e = qVar;
        this.f392f = i;
        this.f393g = j;
    }

    @Override // C1.a
    public final long a() {
        q qVar = this.e;
        try {
            qVar.f414w.F(this.f392f, this.f393g);
            return -1L;
        } catch (IOException e) {
            qVar.a(2, 2, e);
            return -1L;
        }
    }
}
