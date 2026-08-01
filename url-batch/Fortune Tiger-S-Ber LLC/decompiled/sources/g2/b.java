package g2;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f1828a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1829b;

    public b(float f4, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f1828a;
            f4 += ((b) dVar).f1829b;
        }
        this.f1828a = dVar;
        this.f1829b = f4;
    }

    @Override // g2.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f1828a.a(rectF) + this.f1829b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1828a.equals(bVar.f1828a) && this.f1829b == bVar.f1829b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1828a, Float.valueOf(this.f1829b)});
    }
}
