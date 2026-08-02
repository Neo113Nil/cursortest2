package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apl extends ape {
    private ape[] A;
    ArrayList v;
    int w;
    boolean x;
    private boolean y;
    private int z;

    public apl(byte[] bArr) {
        this.v = new ArrayList();
        this.x = false;
        this.z = 0;
        this.y = false;
        e(new aow(2));
        e(new aou());
        e(new aow(1));
    }

    private final void f(ape apeVar) {
        this.v.add(apeVar);
        apeVar.g = this;
    }

    @Override // defpackage.ape
    public final /* bridge */ /* synthetic */ void A(TimeInterpolator timeInterpolator) {
        this.z |= 1;
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ape) this.v.get(i)).A(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.ape
    public final void B() {
        this.z |= 2;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((ape) this.v.get(i)).B();
        }
    }

    @Override // defpackage.ape
    public final /* synthetic */ void C(long j) {
        this.b = j;
    }

    @Override // defpackage.ape
    public final void D(yl ylVar) {
        this.r = null;
        this.z |= 8;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((ape) this.v.get(i)).D(null);
        }
    }

    @Override // defpackage.ape
    public final void E(yl ylVar) {
        super.E(ylVar);
        this.z |= 4;
        if (this.v != null) {
            for (int i = 0; i < this.v.size(); i++) {
                ((ape) this.v.get(i)).E(ylVar);
            }
        }
    }

    @Override // defpackage.ape
    public final void F(ViewGroup viewGroup, cfz cfzVar, cfz cfzVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.v.size();
        int i = 0;
        while (i < size) {
            ape apeVar = (ape) this.v.get(i);
            if (j > 0) {
                if (!this.y) {
                    if (i == 0) {
                        i = 0;
                    }
                }
                long j2 = apeVar.b;
                if (j2 > 0) {
                    apeVar.C(j2 + j);
                } else {
                    apeVar.C(j);
                }
            }
            apeVar.F(viewGroup, cfzVar, cfzVar2, arrayList, arrayList2);
            i++;
        }
    }

    @Override // defpackage.ape
    public final void b(apm apmVar) {
        if (w(apmVar.b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ape apeVar = (ape) arrayList.get(i);
                if (apeVar.w(apmVar.b)) {
                    apeVar.b(apmVar);
                    apmVar.c.add(apeVar);
                }
            }
        }
    }

    @Override // defpackage.ape
    public final void c(apm apmVar) {
        if (w(apmVar.b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ape apeVar = (ape) arrayList.get(i);
                if (apeVar.w(apmVar.b)) {
                    apeVar.c(apmVar);
                    apmVar.c.add(apeVar);
                }
            }
        }
    }

    @Override // defpackage.ape
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    public final void e(ape apeVar) {
        f(apeVar);
        long j = this.c;
        if (j >= 0) {
            apeVar.z(j);
        }
        if ((this.z & 1) != 0) {
            apeVar.A(this.d);
        }
        if ((this.z & 2) != 0) {
            apeVar.B();
        }
        if ((this.z & 4) != 0) {
            apeVar.E(this.s);
        }
        if ((this.z & 8) != 0) {
            apeVar.D(null);
        }
    }

    @Override // defpackage.ape
    /* renamed from: h */
    public final ape clone() {
        apl aplVar = (apl) super.clone();
        aplVar.v = new ArrayList();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            aplVar.f(((ape) this.v.get(i)).clone());
        }
        return aplVar;
    }

    @Override // defpackage.ape
    public final String l(String str) {
        String l = super.l(str);
        for (int i = 0; i < this.v.size(); i++) {
            l = l + "\n" + ((ape) this.v.get(i)).l(str.concat("  "));
        }
        return l;
    }

    @Override // defpackage.ape
    public final void m(apm apmVar) {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((ape) this.v.get(i)).m(apmVar);
        }
    }

    @Override // defpackage.ape
    public final void r(View view) {
        super.r(view);
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((ape) this.v.get(i)).r(view);
        }
    }

    @Override // defpackage.ape
    public final void s(View view) {
        super.s(view);
        ape[] apeVarArr = this.A;
        this.A = null;
        if (apeVarArr == null) {
            apeVarArr = new ape[this.v.size()];
        }
        ape[] apeVarArr2 = (ape[]) this.v.toArray(apeVarArr);
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            apeVarArr2[i].s(view);
        }
        Arrays.fill(apeVarArr2, (Object) null);
        this.A = apeVarArr2;
    }

    @Override // defpackage.ape
    protected final void t() {
        ArrayList arrayList;
        if (this.v.isEmpty()) {
            u();
            p();
            return;
        }
        apk apkVar = new apk(this);
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((ape) arrayList2.get(i)).x(apkVar);
        }
        this.w = this.v.size();
        if (this.y) {
            ArrayList arrayList3 = this.v;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((ape) arrayList3.get(i2)).t();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.v.size();
            arrayList = this.v;
            if (i3 >= size3) {
                break;
            }
            ((ape) arrayList.get(i3 - 1)).x(new apj((ape) this.v.get(i3)));
            i3++;
        }
        ape apeVar = (ape) arrayList.get(0);
        if (apeVar != null) {
            apeVar.t();
        }
    }

    @Override // defpackage.ape
    public final /* bridge */ /* synthetic */ void z(long j) {
        ArrayList arrayList;
        this.c = j;
        if (this.c < 0 || (arrayList = this.v) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ape) this.v.get(i)).z(j);
        }
    }

    public apl() {
        this.v = new ArrayList();
        this.y = true;
        this.x = false;
        this.z = 0;
    }
}
