package v1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends r1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4093g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j2) {
        super(str, true);
        this.f4091e = oVar;
        this.f4092f = i;
        this.f4093g = j2;
    }

    @Override // r1.a
    public final long a() {
        o oVar = this.f4091e;
        try {
            oVar.f4114w.n(this.f4092f, this.f4093g);
            return -1L;
        } catch (IOException e2) {
            oVar.g(2, 2, e2);
            return -1L;
        }
    }
}
