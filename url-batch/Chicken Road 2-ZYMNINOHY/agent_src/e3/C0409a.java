package e3;

import java.util.Comparator;
import kotlin.jvm.internal.i;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C0409a f8467b = new C0409a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0409a f8468c = new C0409a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8469a;

    public /* synthetic */ C0409a(int i4) {
        this.f8469a = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8469a) {
            case 0:
                Comparable a3 = (Comparable) obj;
                Comparable b4 = (Comparable) obj2;
                i.e(a3, "a");
                i.e(b4, "b");
                return a3.compareTo(b4);
            default:
                Comparable a4 = (Comparable) obj;
                Comparable b5 = (Comparable) obj2;
                i.e(a4, "a");
                i.e(b5, "b");
                return b5.compareTo(a4);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f8469a) {
            case 0:
                return f8468c;
            default:
                return f8467b;
        }
    }
}
