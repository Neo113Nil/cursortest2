package J0;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f334a;

    /* renamed from: b, reason: collision with root package name */
    public final float f335b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f334a;
            f2 += ((b) cVar).f335b;
        }
        this.f334a = cVar;
        this.f335b = f2;
    }

    @Override // J0.c
    public final float a(RectF rectF) {
        return Math.max(RecyclerView.f1559A0, this.f334a.a(rectF) + this.f335b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f334a.equals(bVar.f334a) && this.f335b == bVar.f335b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f334a, Float.valueOf(this.f335b)});
    }
}
