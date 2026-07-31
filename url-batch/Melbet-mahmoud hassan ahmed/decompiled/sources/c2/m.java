package c2;

import java.util.List;

/* loaded from: classes.dex */
public abstract class m extends u0.h implements h {

    /* renamed from: i, reason: collision with root package name */
    private h f1874i;

    /* renamed from: j, reason: collision with root package name */
    private long f1875j;

    @Override // c2.h
    public int b(long j7) {
        return ((h) o2.a.e(this.f1874i)).b(j7 - this.f1875j);
    }

    @Override // c2.h
    public long d(int i7) {
        return ((h) o2.a.e(this.f1874i)).d(i7) + this.f1875j;
    }

    @Override // c2.h
    public List<b> e(long j7) {
        return ((h) o2.a.e(this.f1874i)).e(j7 - this.f1875j);
    }

    @Override // c2.h
    public int f() {
        return ((h) o2.a.e(this.f1874i)).f();
    }

    @Override // u0.a
    public void h() {
        super.h();
        this.f1874i = null;
    }

    public void r(long j7, h hVar, long j8) {
        this.f22419g = j7;
        this.f1874i = hVar;
        if (j8 != Long.MAX_VALUE) {
            j7 = j8;
        }
        this.f1875j = j7;
    }
}
