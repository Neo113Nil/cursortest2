package defpackage;

import java.io.IOException;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qy0 extends it2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ vy0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy0(String str, vy0 vy0Var, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = vy0Var;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.it2
    public final long a() {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                vy0 vy0Var = this.f;
                try {
                    vy0Var.I.p(this.g, this.h, true);
                } catch (IOException e) {
                    vy0Var.b(2, 2, e);
                }
                return -1L;
            case 1:
                by1 by1Var = this.f.w;
                int i3 = this.h;
                by1Var.getClass();
                if (i3 == 0) {
                    throw null;
                }
                synchronized (this.f) {
                    this.f.K.remove(Integer.valueOf(this.g));
                    Unit unit = Unit.a;
                }
                return -1L;
            default:
                vy0 vy0Var2 = this.f;
                try {
                    i = this.g;
                    i2 = this.h;
                } catch (IOException e2) {
                    vy0Var2.b(2, 2, e2);
                }
                if (i2 == 0) {
                    throw null;
                }
                vy0Var2.I.q(i, i2);
                return -1L;
        }
    }
}
