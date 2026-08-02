package N3;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends J3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f1874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EnumC0078b f1876g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, q qVar, int i4, EnumC0078b enumC0078b) {
        super(str, true);
        this.f1874e = qVar;
        this.f1875f = i4;
        this.f1876g = enumC0078b;
    }

    @Override // J3.a
    public final long a() {
        q qVar = this.f1874e;
        try {
            qVar.f1899w.s(this.f1875f, this.f1876g);
            return -1L;
        } catch (IOException e4) {
            qVar.b(e4);
            return -1L;
        }
    }
}
