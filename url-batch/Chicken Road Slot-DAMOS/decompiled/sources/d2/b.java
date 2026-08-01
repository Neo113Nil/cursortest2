package d2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public Object f3336a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3337b;

    public b(a.a aVar) {
        this.f3336a = new d.d0(1, this);
        this.f3337b = new f.a(this, aVar);
    }

    public abstract int[] a(int i3);

    public int[] b(int i3, int i10) {
        if (i3 < 0 || i10 < 0 || i3 == i10) {
            return null;
        }
        int[] iArr = (int[]) this.f3337b;
        iArr[0] = i3;
        iArr[1] = i10;
        return iArr;
    }

    public String c() {
        String str = (String) this.f3336a;
        if (str != null) {
            return str;
        }
        Intrinsics.f("text");
        throw null;
    }

    public boolean d() {
        return ((d.d0) this.f3336a).f3220b && ((f.a) this.f3337b).f8421d;
    }

    public abstract void f();

    public abstract int[] i(int i3);

    public b() {
        this.f3337b = new int[2];
    }

    public void e() {
    }

    public void h() {
    }

    public void g(d.a aVar) {
    }
}
