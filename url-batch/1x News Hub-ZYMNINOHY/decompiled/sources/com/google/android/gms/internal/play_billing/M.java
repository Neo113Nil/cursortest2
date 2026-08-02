package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class M extends N implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final M f2761b = new M(0);

    /* renamed from: c, reason: collision with root package name */
    public static final M f2762c = new M(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2763a;

    public /* synthetic */ M(int i3) {
        this.f2763a = i3;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f2763a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                O o = (O) obj;
                O o3 = (O) obj2;
                return AbstractC0261t.f2929a.b(o.f2771a, o3.f2771a).b(o.f2772b, o3.f2772b).a();
        }
    }

    public String toString() {
        switch (this.f2763a) {
            case 0:
                return "Ordering.natural()";
            default:
                return super.toString();
        }
    }
}
