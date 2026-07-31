package H2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends D2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f1980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1982g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, p pVar, int i3, long j3) {
        super(str, true);
        this.f1980e = pVar;
        this.f1981f = i3;
        this.f1982g = j3;
    }

    @Override // D2.a
    public final long a() {
        p pVar = this.f1980e;
        try {
            pVar.f2005z.m(this.f1982g, this.f1981f);
            return -1L;
        } catch (IOException e3) {
            pVar.a(2, 2, e3);
            return -1L;
        }
    }
}
