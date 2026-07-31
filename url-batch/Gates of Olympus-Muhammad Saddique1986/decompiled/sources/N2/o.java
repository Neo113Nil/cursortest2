package N2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends J2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f3635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3637g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, p pVar, int i3, long j3) {
        super(str, true);
        this.f3635e = pVar;
        this.f3636f = i3;
        this.f3637g = j3;
    }

    @Override // J2.a
    public final long a() {
        p pVar = this.f3635e;
        try {
            pVar.f3662z.n(this.f3637g, this.f3636f);
            return -1L;
        } catch (IOException e3) {
            pVar.a(2, 2, e3);
            return -1L;
        }
    }
}
