package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arl extends LinearLayoutManager {
    final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arl(ViewPager2 viewPager2) {
        super(1);
        this.a = viewPager2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void U(lm lmVar, int[] iArr) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.h == -1) {
            super.U(lmVar, iArr);
            return;
        }
        RecyclerView recyclerView = viewPager2.e;
        if (viewPager2.a() == 0) {
            recyclerView.getWidth();
            recyclerView.getPaddingLeft();
            recyclerView.getPaddingRight();
        } else {
            recyclerView.getHeight();
            recyclerView.getPaddingTop();
            recyclerView.getPaddingBottom();
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // defpackage.ky
    public final boolean be(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.ky
    public final void o(le leVar, lm lmVar, View view, aah aahVar) {
        ViewPager2 viewPager2 = ((aro) this.a.j).a;
        aahVar.r(brn.aa(viewPager2.a() == 1 ? LinearLayoutManager.bl(view) : 0, 1, viewPager2.a() == 0 ? LinearLayoutManager.bl(view) : 0, 1, false, false));
    }
}
