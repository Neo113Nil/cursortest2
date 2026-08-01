package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class f50 extends za0 {
    public final HashMap a = new HashMap();
    public final /* synthetic */ h50 b;

    public f50(h50 h50Var) {
        this.b = h50Var;
    }

    @Override // defpackage.za0
    public final void onEnd(gb0 gb0Var) {
        ArrayList arrayList = this.b.b;
        if ((gb0Var.a.d() & 519) != 0) {
            this.a.remove(gb0Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                cy cyVar = (cy) arrayList.get(size);
                int i = cyVar.e;
                boolean z = i > 0;
                int i2 = i - 1;
                cyVar.e = i2;
                if (z && i2 == 0) {
                    cyVar.b();
                }
            }
        }
    }

    @Override // defpackage.za0
    public final void onPrepare(gb0 gb0Var) {
        ArrayList arrayList = this.b.b;
        if ((gb0Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((cy) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.za0
    public final ac0 onProgress(ac0 ac0Var, List list) {
        ArrayList arrayList = this.b.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            gb0 gb0Var = (gb0) list.get(size);
            Integer num = (Integer) this.a.get(gb0Var);
            if (num != null) {
                int intValue = num.intValue();
                float a = gb0Var.a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a;
                }
                i |= intValue;
            }
        }
        ip b = ip.b(ac0Var.a.h(519), ac0Var.a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            cy cyVar = (cy) arrayList.get(size2);
            ip ipVar = cyVar.d;
            ArrayList arrayList2 = cyVar.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ay ayVar = (ay) arrayList2.get(size3);
                int i2 = ayVar.a;
                if ((i2 & i) != 0) {
                    zx zxVar = ayVar.b;
                    if (!zxVar.d) {
                        zxVar.d = true;
                        h5 h5Var = zxVar.i;
                        if (h5Var != null) {
                            ((View) h5Var.h).setVisibility(0);
                        }
                    }
                    if (i2 == 1) {
                        int i3 = ipVar.a;
                        if (i3 > 0) {
                            ayVar.d(b.a / i3);
                        }
                        ayVar.c(rectF.left);
                    } else if (i2 == 2) {
                        int i4 = ipVar.b;
                        if (i4 > 0) {
                            ayVar.d(b.b / i4);
                        }
                        ayVar.c(rectF.top);
                    } else if (i2 == 4) {
                        int i5 = ipVar.c;
                        if (i5 > 0) {
                            ayVar.d(b.c / i5);
                        }
                        ayVar.c(rectF.right);
                    } else if (i2 == 8) {
                        int i6 = ipVar.d;
                        if (i6 > 0) {
                            ayVar.d(b.d / i6);
                        }
                        ayVar.c(rectF.bottom);
                    }
                }
            }
        }
        return ac0Var;
    }

    @Override // defpackage.za0
    public final ya0 onStart(gb0 gb0Var, ya0 ya0Var) {
        if ((gb0Var.a.d() & 519) != 0) {
            ip ipVar = ya0Var.b;
            ip ipVar2 = ya0Var.a;
            int i = ipVar.a != ipVar2.a ? 1 : 0;
            if (ipVar.b != ipVar2.b) {
                i |= 2;
            }
            if (ipVar.c != ipVar2.c) {
                i |= 4;
            }
            if (ipVar.d != ipVar2.d) {
                i |= 8;
            }
            this.a.put(gb0Var, Integer.valueOf(i));
        }
        return ya0Var;
    }
}
