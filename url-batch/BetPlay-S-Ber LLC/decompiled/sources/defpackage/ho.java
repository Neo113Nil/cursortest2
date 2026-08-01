package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ho extends k50 {
    public final /* synthetic */ int e;
    public final /* synthetic */ no f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho(String str, no noVar, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = noVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.k50
    public final long a() {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                no noVar = this.f;
                try {
                    noVar.B.r(this.g, true, this.h);
                } catch (IOException e) {
                    noVar.m(2, 2, e);
                }
                return -1L;
            case 1:
                vg vgVar = this.f.p;
                int i3 = this.h;
                vgVar.getClass();
                if (i3 == 0) {
                    throw null;
                }
                synchronized (this.f) {
                    this.f.D.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                no noVar2 = this.f;
                try {
                    i = this.g;
                    i2 = this.h;
                } catch (IOException e2) {
                    noVar2.m(2, 2, e2);
                }
                if (i2 == 0) {
                    throw null;
                }
                noVar2.B.s(i, i2);
                return -1L;
        }
    }
}
