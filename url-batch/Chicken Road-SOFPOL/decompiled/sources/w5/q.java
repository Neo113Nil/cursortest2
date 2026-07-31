package w5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends w {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8161c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f8162d;

    public q(ArrayList arrayList, Matrix matrix) {
        this.f8161c = arrayList;
        this.f8162d = matrix;
    }

    @Override // w5.w
    public final void a(Matrix matrix, v5.a aVar, int i, Canvas canvas) {
        ArrayList arrayList = this.f8161c;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            ((w) obj).a(this.f8162d, aVar, i, canvas);
        }
    }
}
