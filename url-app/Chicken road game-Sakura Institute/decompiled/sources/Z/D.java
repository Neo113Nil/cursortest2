package Z;

import A.AbstractC0017m;
import a.AbstractC0345a;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D extends N {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4451c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4452d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4453e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4454f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4455g;

    public D(ArrayList arrayList, ArrayList arrayList2, long j4, long j5, int i2) {
        this.f4451c = arrayList;
        this.f4452d = arrayList2;
        this.f4453e = j4;
        this.f4454f = j5;
        this.f4455g = i2;
    }

    @Override // Z.N
    public final Shader b(long j4) {
        long j5 = this.f4453e;
        float d4 = Y.c.d(j5) == Float.POSITIVE_INFINITY ? Y.f.d(j4) : Y.c.d(j5);
        float b4 = Y.c.e(j5) == Float.POSITIVE_INFINITY ? Y.f.b(j4) : Y.c.e(j5);
        long j6 = this.f4454f;
        float d5 = Y.c.d(j6) == Float.POSITIVE_INFINITY ? Y.f.d(j4) : Y.c.d(j6);
        float b5 = Y.c.e(j6) == Float.POSITIVE_INFINITY ? Y.f.b(j4) : Y.c.e(j6);
        long c4 = AbstractC0345a.c(d4, b4);
        long c5 = AbstractC0345a.c(d5, b5);
        ArrayList arrayList = this.f4451c;
        ArrayList arrayList2 = this.f4452d;
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        float d6 = Y.c.d(c4);
        float e4 = Y.c.e(c4);
        float d7 = Y.c.d(c5);
        float e5 = Y.c.e(c5);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = K.D(((C0323u) arrayList.get(i2)).f4549a);
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        float[] fArr = new float[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            fArr[i4] = ((Number) it.next()).floatValue();
            i4++;
        }
        int i5 = this.f4455g;
        return new LinearGradient(d6, e4, d7, e5, iArr, fArr, K.t(i5, 0) ? Shader.TileMode.CLAMP : K.t(i5, 1) ? Shader.TileMode.REPEAT : K.t(i5, 2) ? Shader.TileMode.MIRROR : K.t(i5, 3) ? Build.VERSION.SDK_INT >= 31 ? T.f4509a.b() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        return this.f4451c.equals(d4.f4451c) && this.f4452d.equals(d4.f4452d) && Y.c.b(this.f4453e, d4.f4453e) && Y.c.b(this.f4454f, d4.f4454f) && K.t(this.f4455g, d4.f4455g);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4455g) + AbstractC0017m.c(AbstractC0017m.c((this.f4452d.hashCode() + (this.f4451c.hashCode() * 31)) * 31, 31, this.f4453e), 31, this.f4454f);
    }

    public final String toString() {
        String str;
        long j4 = this.f4453e;
        String str2 = "";
        if (AbstractC0345a.y(j4)) {
            str = "start=" + ((Object) Y.c.j(j4)) + ", ";
        } else {
            str = "";
        }
        long j5 = this.f4454f;
        if (AbstractC0345a.y(j5)) {
            str2 = "end=" + ((Object) Y.c.j(j5)) + ", ";
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.f4451c);
        sb.append(", stops=");
        sb.append(this.f4452d);
        sb.append(", ");
        sb.append(str);
        sb.append(str2);
        sb.append("tileMode=");
        int i2 = this.f4455g;
        sb.append((Object) (K.t(i2, 0) ? "Clamp" : K.t(i2, 1) ? "Repeated" : K.t(i2, 2) ? "Mirror" : K.t(i2, 3) ? "Decal" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
