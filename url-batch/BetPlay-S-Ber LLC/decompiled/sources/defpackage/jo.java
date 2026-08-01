package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class jo extends k50 {
    public final /* synthetic */ no e;
    public final /* synthetic */ int f;
    public final /* synthetic */ p8 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(String str, no noVar, int i, p8 p8Var, int i2, boolean z) {
        super(str, true);
        this.e = noVar;
        this.f = i;
        this.g = p8Var;
        this.h = i2;
    }

    @Override // defpackage.k50
    public final long a() {
        try {
            vg vgVar = this.e.p;
            p8 p8Var = this.g;
            int i = this.h;
            vgVar.getClass();
            p8Var.skip(i);
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
