package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class wn extends d50 {
    public final /* synthetic */ xn e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(String str, xn xnVar, int i, long j) {
        super(str, true);
        this.e = xnVar;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.d50
    public final long a() {
        xn xnVar = this.e;
        try {
            xnVar.B.t(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            xnVar.m(2, 2, e);
            return -1L;
        }
    }
}
