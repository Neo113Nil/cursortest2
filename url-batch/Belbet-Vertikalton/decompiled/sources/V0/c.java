package V0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f1328a;

    /* renamed from: b, reason: collision with root package name */
    public float f1329b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1330c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1331d;
    public int e = 255;

    /* renamed from: f, reason: collision with root package name */
    public final float f1332f;

    public c(String str, int i, float f2, float f3, float f4) {
        this.f1328a = f2;
        this.f1329b = f3;
        this.f1330c = str;
        this.f1331d = i;
        this.f1332f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f1328a, cVar.f1328a) == 0 && Float.compare(this.f1329b, cVar.f1329b) == 0 && this.f1330c.equals(cVar.f1330c) && this.f1331d == cVar.f1331d && this.e == cVar.e && Float.compare(this.f1332f, cVar.f1332f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1332f) + ((Integer.hashCode(this.e) + ((Integer.hashCode(this.f1331d) + ((this.f1330c.hashCode() + ((Float.hashCode(this.f1329b) + (Float.hashCode(this.f1328a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Floater(x=" + this.f1328a + ", y=" + this.f1329b + ", text=" + this.f1330c + ", color=" + this.f1331d + ", alpha=" + this.e + ", speed=" + this.f1332f + ")";
    }
}
