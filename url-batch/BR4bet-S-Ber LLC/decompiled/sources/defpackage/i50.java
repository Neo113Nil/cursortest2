package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class i50 extends o50 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public i50(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.o50
    public final void a(Matrix matrix, c50 c50Var, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((o50) obj).a(this.d, c50Var, i, canvas);
        }
    }
}
