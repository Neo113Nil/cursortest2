package q6;

import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a implements f, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f6181d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f6182e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6183f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6184g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6185h = false;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6186j;

    public a(int i, int i8, Class cls, Object obj, String str, String str2) {
        this.f6181d = obj;
        this.f6182e = cls;
        this.f6183f = str;
        this.f6184g = str2;
        this.i = i;
        this.f6186j = i8 >> 1;
    }

    @Override // q6.f
    public final int c() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6185h == aVar.f6185h && this.i == aVar.i && this.f6186j == aVar.f6186j && this.f6181d.equals(aVar.f6181d) && this.f6182e.equals(aVar.f6182e) && this.f6183f.equals(aVar.f6183f) && this.f6184g.equals(aVar.f6184g);
    }

    public final int hashCode() {
        return ((((((this.f6184g.hashCode() + ((this.f6183f.hashCode() + ((this.f6182e.hashCode() + (this.f6181d.hashCode() * 31)) * 31)) * 31)) * 31) + (this.f6185h ? 1231 : 1237)) * 31) + this.i) * 31) + this.f6186j;
    }

    public final String toString() {
        t.f6206a.getClass();
        return u.a(this);
    }
}
