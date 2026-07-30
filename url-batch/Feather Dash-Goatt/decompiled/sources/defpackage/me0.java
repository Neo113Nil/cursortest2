package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class me0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ me0(u5 u5Var, int i) {
        this.a = i;
        this.b = u5Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        u5 u5Var = this.b;
        switch (i) {
        }
        return dj.a(Integer.valueOf(u5Var.b(((sf0) obj2).g)), Integer.valueOf(u5Var.b(((sf0) obj).g)));
    }
}
