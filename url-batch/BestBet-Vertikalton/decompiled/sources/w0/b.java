package w0;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import u0.C0384w;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public C0384w f4472a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f4473b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4474c;
    public float d;

    public b(C0384w c0384w, RectF rectF) {
        k1.e.e(c0384w, "habit");
        this.f4472a = c0384w;
        this.f4473b = rectF;
        this.f4474c = false;
        this.d = RecyclerView.f1937A0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k1.e.a(this.f4472a, bVar.f4472a) && k1.e.a(this.f4473b, bVar.f4473b) && this.f4474c == bVar.f4474c && Float.compare(this.d, bVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((Boolean.hashCode(this.f4474c) + ((this.f4473b.hashCode() + (this.f4472a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CardLayout(habit=" + this.f4472a + ", rect=" + this.f4473b + ", exploding=" + this.f4474c + ", explodeProgress=" + this.d + ")";
    }
}
