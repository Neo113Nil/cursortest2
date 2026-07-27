package i4;

import java.util.Comparator;
import kotlin.jvm.internal.i;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C0494a f5832b = new C0494a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0494a f5833c = new C0494a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5834a;

    public /* synthetic */ C0494a(int i2) {
        this.f5834a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5834a) {
            case 0:
                Comparable a6 = (Comparable) obj;
                Comparable b6 = (Comparable) obj2;
                i.e(a6, "a");
                i.e(b6, "b");
                return a6.compareTo(b6);
            default:
                Comparable a7 = (Comparable) obj;
                Comparable b7 = (Comparable) obj2;
                i.e(a7, "a");
                i.e(b7, "b");
                return b7.compareTo(a7);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f5834a) {
            case 0:
                return f5833c;
            default:
                return f5832b;
        }
    }
}
