package R0;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f899a;

    /* renamed from: b, reason: collision with root package name */
    public final float f900b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f899a;
            f2 += ((b) cVar).f900b;
        }
        this.f899a = cVar;
        this.f900b = f2;
    }

    @Override // R0.c
    public final float a(RectF rectF) {
        return Math.max(RecyclerView.f1937A0, this.f899a.a(rectF) + this.f900b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f899a.equals(bVar.f899a) && this.f900b == bVar.f900b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f899a, Float.valueOf(this.f900b)});
    }
}
