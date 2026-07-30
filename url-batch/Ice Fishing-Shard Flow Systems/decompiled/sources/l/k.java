package l;

import I.Z;
import j4.C0573b;
import java.util.ArrayList;
import n.s1;

/* loaded from: classes.dex */
public final class k extends d4.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6257i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f6258k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6259l;

    public k(C0573b c0573b) {
        this.f6257i = 0;
        this.f6259l = c0573b;
        this.j = false;
        this.f6258k = 0;
    }

    @Override // I.Z
    public final void a() {
        switch (this.f6257i) {
            case 0:
                int i2 = this.f6258k + 1;
                this.f6258k = i2;
                C0573b c0573b = (C0573b) this.f6259l;
                if (i2 == ((ArrayList) c0573b.f5957i).size()) {
                    Z z7 = (Z) c0573b.f5959m;
                    if (z7 != null) {
                        z7.a();
                    }
                    this.f6258k = 0;
                    this.j = false;
                    c0573b.f5956e = false;
                    break;
                }
                break;
            default:
                if (!this.j) {
                    ((s1) this.f6259l).f6886a.setVisibility(this.f6258k);
                    break;
                }
                break;
        }
    }

    @Override // d4.c, I.Z
    public void b() {
        switch (this.f6257i) {
            case 1:
                this.j = true;
                break;
        }
    }

    @Override // d4.c, I.Z
    public final void c() {
        switch (this.f6257i) {
            case 0:
                if (!this.j) {
                    this.j = true;
                    Z z7 = (Z) ((C0573b) this.f6259l).f5959m;
                    if (z7 != null) {
                        z7.c();
                        break;
                    }
                }
                break;
            default:
                ((s1) this.f6259l).f6886a.setVisibility(0);
                break;
        }
    }

    public k(s1 s1Var, int i2) {
        this.f6257i = 1;
        this.f6259l = s1Var;
        this.f6258k = i2;
        this.j = false;
    }
}
