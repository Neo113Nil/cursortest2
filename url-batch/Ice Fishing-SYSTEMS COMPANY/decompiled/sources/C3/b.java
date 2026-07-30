package C3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f379a;

    /* renamed from: b, reason: collision with root package name */
    public final float f380b;

    public b(float f6, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f379a;
            f6 += ((b) cVar).f380b;
        }
        this.f379a = cVar;
        this.f380b = f6;
    }

    @Override // C3.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f379a.a(rectF) + this.f380b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f379a.equals(bVar.f379a) && this.f380b == bVar.f380b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f379a, Float.valueOf(this.f380b)});
    }
}
