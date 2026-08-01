package G1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends C1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f411g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, q qVar, int i, long j2) {
        super(str, true);
        this.f409e = qVar;
        this.f410f = i;
        this.f411g = j2;
    }

    @Override // C1.a
    public final long a() {
        q qVar = this.f409e;
        try {
            qVar.f432w.t(this.f410f, this.f411g);
            return -1L;
        } catch (IOException e2) {
            qVar.a(2, 2, e2);
            return -1L;
        }
    }
}
