package z1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends v1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F1.f f4457g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4458h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i, F1.f fVar, int i2, boolean z2) {
        super(str, true);
        this.f4455e = oVar;
        this.f4456f = i;
        this.f4457g = fVar;
        this.f4458h = i2;
    }

    @Override // v1.a
    public final long a() {
        try {
            z zVar = this.f4455e.f4474k;
            F1.f fVar = this.f4457g;
            int i = this.f4458h;
            zVar.getClass();
            fVar.o(i);
            this.f4455e.f4486w.m(this.f4456f, 9);
            synchronized (this.f4455e) {
                this.f4455e.f4488y.remove(Integer.valueOf(this.f4456f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
