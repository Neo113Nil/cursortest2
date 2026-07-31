package o1;

import j1.a;
import r0.f2;
import r0.s1;

/* loaded from: classes.dex */
public abstract class i implements a.b {

    /* renamed from: f, reason: collision with root package name */
    public final String f19673f;

    public i(String str) {
        this.f19673f = str;
    }

    @Override // j1.a.b
    public /* synthetic */ s1 d() {
        return j1.b.b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // j1.a.b
    public /* synthetic */ void e(f2.b bVar) {
        j1.b.c(this, bVar);
    }

    @Override // j1.a.b
    public /* synthetic */ byte[] f() {
        return j1.b.a(this);
    }

    public String toString() {
        return this.f19673f;
    }
}
