package o2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r extends x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3003c;
    public final /* synthetic */ Matrix d;

    public r(ArrayList arrayList, Matrix matrix) {
        this.f3003c = arrayList;
        this.d = matrix;
    }

    @Override // o2.x
    public final void a(Matrix matrix, n2.a aVar, int i, Canvas canvas) {
        ArrayList arrayList = this.f3003c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((x) obj).a(this.d, aVar, i, canvas);
        }
    }
}
