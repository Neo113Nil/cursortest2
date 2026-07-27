package t3;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends p3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f10791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10793g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, p pVar, int i2, int i4) {
        super(str, true);
        this.f10791e = pVar;
        this.f10792f = i2;
        this.f10793g = i4;
    }

    @Override // p3.a
    public final long a() {
        int i2 = this.f10792f;
        int i4 = this.f10793g;
        p pVar = this.f10791e;
        pVar.getClass();
        try {
            pVar.f10811C.h(i2, i4, true);
            return -1L;
        } catch (IOException e4) {
            pVar.b(e4);
            return -1L;
        }
    }
}
