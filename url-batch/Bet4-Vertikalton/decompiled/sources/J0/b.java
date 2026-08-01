package J0;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f317a;

    /* renamed from: b, reason: collision with root package name */
    public final float f318b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f317a;
            f2 += ((b) cVar).f318b;
        }
        this.f317a = cVar;
        this.f318b = f2;
    }

    @Override // J0.c
    public final float a(RectF rectF) {
        return Math.max(RecyclerView.f1530C0, this.f317a.a(rectF) + this.f318b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f317a.equals(bVar.f317a) && this.f318b == bVar.f318b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f317a, Float.valueOf(this.f318b)});
    }
}
