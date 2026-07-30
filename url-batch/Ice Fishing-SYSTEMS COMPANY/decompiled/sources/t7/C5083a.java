package t7;

import java.util.Comparator;
import kotlin.jvm.internal.h;

/* renamed from: t7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5083a implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public static final C5083a f40951u = new C5083a(0);

    /* renamed from: v, reason: collision with root package name */
    public static final C5083a f40952v = new C5083a(1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40953n;

    public /* synthetic */ C5083a(int i) {
        this.f40953n = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f40953n) {
            case 0:
                Comparable a9 = (Comparable) obj;
                Comparable b9 = (Comparable) obj2;
                h.e(a9, "a");
                h.e(b9, "b");
                return a9.compareTo(b9);
            default:
                Comparable a10 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                h.e(a10, "a");
                h.e(b10, "b");
                return b10.compareTo(a10);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f40953n) {
            case 0:
                return f40952v;
            default:
                return f40951u;
        }
    }
}
