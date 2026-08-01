package K0;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f378a;

    /* renamed from: b, reason: collision with root package name */
    public final float f379b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f378a;
            f2 += ((b) cVar).f379b;
        }
        this.f378a = cVar;
        this.f379b = f2;
    }

    @Override // K0.c
    public final float a(RectF rectF) {
        return Math.max(RecyclerView.A0, this.f378a.a(rectF) + this.f379b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f378a.equals(bVar.f378a) && this.f379b == bVar.f379b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f378a, Float.valueOf(this.f379b)});
    }
}
