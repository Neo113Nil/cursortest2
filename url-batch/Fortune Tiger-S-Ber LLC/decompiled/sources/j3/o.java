package j3;

import java.io.IOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o extends f3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f2440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2441f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, p pVar, int i4, long j4) {
        super(str, true);
        this.f2440e = pVar;
        this.f2441f = i4;
        this.g = j4;
    }

    @Override // f3.a
    public final long a() {
        p pVar = this.f2440e;
        try {
            pVar.B.t(this.f2441f, this.g);
            return -1L;
        } catch (IOException e4) {
            pVar.m(2, 2, e4);
            return -1L;
        }
    }
}
