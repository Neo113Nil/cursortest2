package t0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class f0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f8744b = new f0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8745a;

    public /* synthetic */ f0(int i3) {
        this.f8745a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8745a) {
            case 0:
                E e3 = (E) obj;
                E e4 = (E) obj2;
                int g3 = f2.j.g(e4.f8549m, e3.f8549m);
                return g3 != 0 ? g3 : f2.j.g(e3.hashCode(), e4.hashCode());
            default:
                E e5 = (E) obj;
                E e6 = (E) obj2;
                int g4 = f2.j.g(e5.f8549m, e6.f8549m);
                return g4 != 0 ? g4 : f2.j.g(e5.hashCode(), e6.hashCode());
        }
    }
}
