package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class tn extends d50 {
    public final /* synthetic */ xn e;
    public final /* synthetic */ int f;
    public final /* synthetic */ u8 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(String str, xn xnVar, int i, u8 u8Var, int i2, boolean z) {
        super(str, true);
        this.e = xnVar;
        this.f = i;
        this.g = u8Var;
        this.h = i2;
    }

    @Override // defpackage.d50
    public final long a() {
        try {
            dh dhVar = this.e.p;
            u8 u8Var = this.g;
            int i = this.h;
            dhVar.getClass();
            u8Var.skip(i);
            this.e.B.s(this.f, 9);
            synchronized (this.e) {
                this.e.D.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
