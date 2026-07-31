package n5;

import java.util.Comparator;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5505b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f5506c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5507a;

    public /* synthetic */ a(int i7) {
        this.f5507a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5507a) {
            case 0:
                Comparable a7 = (Comparable) obj;
                Comparable b7 = (Comparable) obj2;
                i.e(a7, "a");
                i.e(b7, "b");
                return a7.compareTo(b7);
            default:
                Comparable a8 = (Comparable) obj;
                Comparable b8 = (Comparable) obj2;
                i.e(a8, "a");
                i.e(b8, "b");
                return b8.compareTo(a8);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f5507a) {
            case 0:
                return f5506c;
            default:
                return f5505b;
        }
    }
}
