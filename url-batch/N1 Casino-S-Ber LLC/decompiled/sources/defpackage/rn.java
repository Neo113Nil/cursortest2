package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class rn extends d50 {
    public final /* synthetic */ int e;
    public final /* synthetic */ xn f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rn(String str, xn xnVar, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = xnVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.d50
    public final long a() {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                xn xnVar = this.f;
                try {
                    xnVar.B.r(this.g, this.h, true);
                } catch (IOException e) {
                    xnVar.m(2, 2, e);
                }
                return -1L;
            case 1:
                dh dhVar = this.f.p;
                int i3 = this.h;
                dhVar.getClass();
                if (i3 == 0) {
                    throw null;
                }
                synchronized (this.f) {
                    this.f.D.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                xn xnVar2 = this.f;
                try {
                    i = this.g;
                    i2 = this.h;
                } catch (IOException e2) {
                    xnVar2.m(2, 2, e2);
                }
                if (i2 == 0) {
                    throw null;
                }
                xnVar2.B.s(i, i2);
                return -1L;
        }
    }
}
