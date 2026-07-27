package t3;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends p3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f10806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f10808g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, p pVar, int i2, long j4) {
        super(str, true);
        this.f10806e = pVar;
        this.f10807f = i2;
        this.f10808g = j4;
    }

    @Override // p3.a
    public final long a() {
        p pVar = this.f10806e;
        try {
            pVar.f10811C.j(this.f10808g, this.f10807f);
            return -1L;
        } catch (IOException e4) {
            pVar.b(e4);
            return -1L;
        }
    }
}
