package l2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q extends w {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2649c;
    public final /* synthetic */ Matrix d;

    public q(ArrayList arrayList, Matrix matrix) {
        this.f2649c = arrayList;
        this.d = matrix;
    }

    @Override // l2.w
    public final void a(Matrix matrix, k2.a aVar, int i, Canvas canvas) {
        ArrayList arrayList = this.f2649c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((w) obj).a(this.d, aVar, i, canvas);
        }
    }
}
