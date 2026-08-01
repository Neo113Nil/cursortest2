package g2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r extends x {
    public final /* synthetic */ ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f1905d;

    public r(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.f1905d = matrix;
    }

    @Override // g2.x
    public final void a(Matrix matrix, f2.a aVar, int i4, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((x) obj).a(this.f1905d, aVar, i4, canvas);
        }
    }
}
