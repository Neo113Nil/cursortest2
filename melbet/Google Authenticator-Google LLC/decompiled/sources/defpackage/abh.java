package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abh implements xe {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public abh(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.xe
    public final float a() {
        float a;
        int i = this.b;
        ViewGroup viewGroup = this.a;
        if (i != 0) {
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            if (recyclerView.m.ae()) {
                a = recyclerView.I;
            } else {
                if (!recyclerView.m.ad()) {
                    return 0.0f;
                }
                a = recyclerView.H;
            }
        } else {
            a = ((NestedScrollView) viewGroup).a();
        }
        return -a;
    }

    @Override // defpackage.xe
    public final void b() {
        int i = this.b;
        ViewGroup viewGroup = this.a;
        if (i != 0) {
            ((RecyclerView) viewGroup).ae();
        } else {
            ((NestedScrollView) viewGroup).a.abortAnimation();
        }
    }

    @Override // defpackage.xe
    public final boolean c(float f) {
        int i;
        int i2;
        if (this.b == 0) {
            if (f == 0.0f) {
                return false;
            }
            b();
            ((NestedScrollView) this.a).j((int) f);
            return true;
        }
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.m.ae()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.m.ad()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        recyclerView.ae();
        return recyclerView.ah(i, i2, 0, Integer.MAX_VALUE);
    }
}
