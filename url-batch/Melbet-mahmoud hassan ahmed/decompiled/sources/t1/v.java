package t1;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22249a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22250b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22251c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22252d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22253e;

    public v(Object obj) {
        this(obj, -1L);
    }

    public v(Object obj, int i7, int i8, long j7) {
        this(obj, i7, i8, j7, -1);
    }

    private v(Object obj, int i7, int i8, long j7, int i9) {
        this.f22249a = obj;
        this.f22250b = i7;
        this.f22251c = i8;
        this.f22252d = j7;
        this.f22253e = i9;
    }

    public v(Object obj, long j7) {
        this(obj, -1, -1, j7, -1);
    }

    public v(Object obj, long j7, int i7) {
        this(obj, -1, -1, j7, i7);
    }

    protected v(v vVar) {
        this.f22249a = vVar.f22249a;
        this.f22250b = vVar.f22250b;
        this.f22251c = vVar.f22251c;
        this.f22252d = vVar.f22252d;
        this.f22253e = vVar.f22253e;
    }

    public v a(Object obj) {
        return this.f22249a.equals(obj) ? this : new v(obj, this.f22250b, this.f22251c, this.f22252d, this.f22253e);
    }

    public boolean b() {
        return this.f22250b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f22249a.equals(vVar.f22249a) && this.f22250b == vVar.f22250b && this.f22251c == vVar.f22251c && this.f22252d == vVar.f22252d && this.f22253e == vVar.f22253e;
    }

    public int hashCode() {
        return ((((((((527 + this.f22249a.hashCode()) * 31) + this.f22250b) * 31) + this.f22251c) * 31) + ((int) this.f22252d)) * 31) + this.f22253e;
    }
}
