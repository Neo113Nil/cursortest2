package a4;

import java.io.IOException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q extends w3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f199g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, r rVar, int i, long j2) {
        super(str, true);
        this.f197e = rVar;
        this.f198f = i;
        this.f199g = j2;
    }

    @Override // w3.a
    public final long a() {
        r rVar = this.f197e;
        try {
            rVar.B.t(this.f198f, this.f199g);
            return -1L;
        } catch (IOException e4) {
            rVar.m(2, 2, e4);
            return -1L;
        }
    }
}
