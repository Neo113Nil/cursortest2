package r;

import java.util.WeakHashMap;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805b implements InterfaceC0811h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7054a;

    public /* synthetic */ C0805b(int i3) {
        this.f7054a = i3;
    }

    public static final C0804a b(String str, int i3) {
        WeakHashMap weakHashMap = V.f7028u;
        return new C0804a(str, i3);
    }

    public static final T d(String str, int i3) {
        WeakHashMap weakHashMap = V.f7028u;
        return new T(g2.i.Y(V0.c.f3348e), str);
    }

    @Override // r.InterfaceC0811h
    public void c(r0.C c3, int i3, int[] iArr, int[] iArr2) {
        switch (this.f7054a) {
            case 0:
                AbstractC0813j.c(i3, iArr, iArr2, false);
                break;
            default:
                AbstractC0813j.b(iArr, iArr2, false);
                break;
        }
    }

    public String toString() {
        switch (this.f7054a) {
            case 0:
                return "Arrangement#Bottom";
            case 1:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
