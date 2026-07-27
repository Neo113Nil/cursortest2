package r0;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f9793b = new e0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9794a;

    public /* synthetic */ e0(int i2) {
        this.f9794a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9794a) {
            case 0:
                E e4 = (E) obj;
                E e5 = (E) obj2;
                int e6 = Intrinsics.e(e5.f9603p, e4.f9603p);
                return e6 != 0 ? e6 : Intrinsics.e(e4.hashCode(), e5.hashCode());
            default:
                E e7 = (E) obj;
                E e8 = (E) obj2;
                int e9 = Intrinsics.e(e7.f9603p, e8.f9603p);
                return e9 != 0 ? e9 : Intrinsics.e(e7.hashCode(), e8.hashCode());
        }
    }
}
