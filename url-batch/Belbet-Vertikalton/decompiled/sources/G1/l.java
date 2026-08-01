package G1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends C1.a {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f383g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f384h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, q qVar, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f382f = qVar;
        this.f383g = i;
        this.f384h = i2;
    }

    @Override // C1.a
    public final long a() {
        switch (this.e) {
            case 0:
                int i = this.f383g;
                int i2 = this.f384h;
                q qVar = this.f382f;
                qVar.getClass();
                try {
                    qVar.f414w.D(i, i2, true);
                    return -1L;
                } catch (IOException e) {
                    qVar.a(2, 2, e);
                    return -1L;
                }
            case 1:
                C c2 = this.f382f.f402k;
                int i3 = this.f384h;
                c2.getClass();
                AbstractC0001b.j("errorCode", i3);
                synchronized (this.f382f) {
                    this.f382f.f416y.remove(Integer.valueOf(this.f383g));
                }
                return -1L;
            default:
                q qVar2 = this.f382f;
                try {
                    int i4 = this.f383g;
                    int i5 = this.f384h;
                    qVar2.getClass();
                    AbstractC0001b.j("statusCode", i5);
                    qVar2.f414w.E(i4, i5);
                    return -1L;
                } catch (IOException e2) {
                    qVar2.a(2, 2, e2);
                    return -1L;
                }
        }
    }
}
