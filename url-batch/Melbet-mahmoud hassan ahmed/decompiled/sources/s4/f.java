package s4;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f21640a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21641b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21642c;

    public f(String str, String str2, long j7) {
        this.f21640a = str;
        this.f21641b = str2;
        this.f21642c = j7;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f21640a.equals(fVar.f21640a) && this.f21641b.equals(fVar.f21641b) && this.f21642c == fVar.f21642c;
    }
}
