package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class cy {
    public final ArrayList a;
    public final h50 b;
    public ip c;
    public ip d;
    public int e;
    public boolean f;

    public cy(h50 h50Var, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.a = arrayList2;
        ip ipVar = ip.e;
        this.c = ipVar;
        this.d = ipVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList3 = h50Var.b;
        if (!arrayList3.contains(this)) {
            arrayList3.add(this);
            ip ipVar2 = h50Var.c;
            ip ipVar3 = h50Var.d;
            this.c = ipVar2;
            this.d = ipVar3;
            b();
            int i = h50Var.e;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((ay) arrayList2.get(size)).a(i);
            }
        }
        this.b = h50Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ay ayVar = (ay) list.get(i);
            ayVar.getClass();
            if ((ayVar instanceof lb) == z) {
                cy cyVar = ayVar.e;
                if (cyVar != null) {
                    throw new IllegalStateException(ayVar + " (" + (i + 1) + "/" + size + ") is already controlled by " + cyVar + " but is still added to " + this);
                }
                ayVar.e = this;
                this.a.add(ayVar);
            }
        }
    }

    public final void b() {
        int i;
        ip c;
        ArrayList arrayList = this.a;
        ip ipVar = ip.e;
        ip ipVar2 = ipVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ay ayVar = (ay) arrayList.get(size);
            ip ipVar3 = this.c;
            ip ipVar4 = this.d;
            ayVar.c = ipVar3;
            zx zxVar = ayVar.b;
            ayVar.d = ipVar4;
            if (!zxVar.c.equals(ipVar2)) {
                zxVar.c = ipVar2;
                h5 h5Var = zxVar.i;
                if (h5Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h5Var.g;
                    layoutParams.leftMargin = ipVar2.a;
                    layoutParams.topMargin = ipVar2.b;
                    layoutParams.rightMargin = ipVar2.c;
                    layoutParams.bottomMargin = ipVar2.d;
                    ((View) h5Var.h).setLayoutParams(layoutParams);
                }
            }
            int i2 = ayVar.a;
            if (i2 == 1) {
                i = ayVar.c.a;
                int b = ayVar.b(ayVar.d.a);
                if (zxVar.a != b) {
                    zxVar.a = b;
                    h5 h5Var2 = zxVar.i;
                    if (h5Var2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h5Var2.g;
                        layoutParams2.width = b;
                        ((View) h5Var2.h).setLayoutParams(layoutParams2);
                    }
                }
                if (ayVar instanceof lb) {
                    c = ip.c(i, 0, 0, 0);
                }
                c = ipVar;
            } else if (i2 == 2) {
                i = ayVar.c.b;
                int b2 = ayVar.b(ayVar.d.b);
                if (zxVar.b != b2) {
                    zxVar.b = b2;
                    h5 h5Var3 = zxVar.i;
                    if (h5Var3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h5Var3.g;
                        layoutParams3.height = b2;
                        ((View) h5Var3.h).setLayoutParams(layoutParams3);
                    }
                }
                if (ayVar instanceof lb) {
                    c = ip.c(0, i, 0, 0);
                }
                c = ipVar;
            } else if (i2 == 4) {
                i = ayVar.c.c;
                int b3 = ayVar.b(ayVar.d.c);
                if (zxVar.a != b3) {
                    zxVar.a = b3;
                    h5 h5Var4 = zxVar.i;
                    if (h5Var4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) h5Var4.g;
                        layoutParams4.width = b3;
                        ((View) h5Var4.h).setLayoutParams(layoutParams4);
                    }
                }
                if (ayVar instanceof lb) {
                    c = ip.c(0, 0, i, 0);
                }
                c = ipVar;
            } else if (i2 != 8) {
                c = ipVar;
                i = 0;
            } else {
                i = ayVar.c.d;
                int b4 = ayVar.b(ayVar.d.d);
                if (zxVar.b != b4) {
                    zxVar.b = b4;
                    h5 h5Var5 = zxVar.i;
                    if (h5Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) h5Var5.g;
                        layoutParams5.height = b4;
                        ((View) h5Var5.h).setLayoutParams(layoutParams5);
                    }
                }
                if (ayVar instanceof lb) {
                    c = ip.c(0, 0, 0, i);
                }
                c = ipVar;
            }
            boolean z = i > 0;
            if (zxVar.d != z) {
                zxVar.d = z;
                h5 h5Var6 = zxVar.i;
                if (h5Var6 != null) {
                    ((View) h5Var6.h).setVisibility(z ? 0 : 8);
                }
            }
            float f = 0.0f;
            ayVar.c(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            ayVar.d(f);
            ipVar2 = ip.a(ipVar2, c);
        }
    }
}
