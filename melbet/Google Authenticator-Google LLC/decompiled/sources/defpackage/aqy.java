package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqy {
    public aep a;
    public ViewPager2 b;
    final /* synthetic */ ara c;
    public kt d;
    public yn e;
    private long f = -1;

    public aqy(ara araVar) {
        this.c = araVar;
    }

    public static final ViewPager2 b(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        Objects.toString(parent);
        throw new IllegalStateException("Expected ViewPager2 instance. Got: ".concat(String.valueOf(parent)));
    }

    public final void a(boolean z) {
        int i;
        bd bdVar;
        ara araVar = this.c;
        if (!araVar.w() && this.b.b() == 0) {
            qq qqVar = araVar.f;
            if (qqVar.j() || (i = this.b.b) >= 4) {
                return;
            }
            long j = i;
            if ((j != this.f || z) && (bdVar = (bd) qqVar.d(j)) != null && bdVar.ao()) {
                this.f = j;
                ae aeVar = new ae(araVar.e);
                ArrayList arrayList = new ArrayList();
                bd bdVar2 = null;
                for (int i2 = 0; i2 < qqVar.b(); i2++) {
                    long c = qqVar.c(i2);
                    bd bdVar3 = (bd) qqVar.e(i2);
                    if (bdVar3.ao()) {
                        if (c != this.f) {
                            aeVar.j(bdVar3, aek.d);
                            arrayList.add(araVar.j.D());
                        } else {
                            bdVar2 = bdVar3;
                        }
                        bdVar3.aj(c == this.f);
                    }
                }
                if (bdVar2 != null) {
                    aeVar.j(bdVar2, aek.e);
                    arrayList.add(araVar.j.D());
                }
                if (aeVar.g()) {
                    return;
                }
                aeVar.c();
                Collections.reverse(arrayList);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    brn.C((List) arrayList.get(i3));
                }
            }
        }
    }
}
