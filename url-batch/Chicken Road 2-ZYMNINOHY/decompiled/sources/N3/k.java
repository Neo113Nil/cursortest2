package N3;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends J3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f1862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1864g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, q qVar, int i4, int i5) {
        super(str, true);
        this.f1862e = qVar;
        this.f1863f = i4;
        this.f1864g = i5;
    }

    @Override // J3.a
    public final long a() {
        q qVar = this.f1862e;
        try {
            qVar.f1899w.n(this.f1863f, true, this.f1864g);
            return -1L;
        } catch (IOException e4) {
            qVar.b(e4);
            return -1L;
        }
    }
}
