package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rp3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class sp3<T extends rp3<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final sp3 f11912d = new sp3(true);

    /* renamed from: a, reason: collision with root package name */
    final ss3<T, Object> f11913a = new hs3(16);

    /* renamed from: b, reason: collision with root package name */
    private boolean f11914b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11915c;

    private sp3() {
    }

    private sp3(boolean z6) {
        b();
        b();
    }

    public static <T extends rp3<T>> sp3<T> a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void d(T t6, Object obj) {
        boolean z6;
        mt3 a7 = t6.a();
        kq3.e(obj);
        mt3 mt3Var = mt3.f8707g;
        nt3 nt3Var = nt3.INT;
        switch (a7.b().ordinal()) {
            case 0:
                z6 = obj instanceof Integer;
                if (z6) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t6.zza()), t6.a().b(), obj.getClass().getName()));
            case 1:
                z6 = obj instanceof Long;
                if (z6) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t6.zza()), t6.a().b(), obj.getClass().getName()));
            case 2:
                z6 = obj instanceof Float;
                if (z6) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t6.zza()), t6.a().b(), obj.getClass().getName()));
            case 3:
                z6 = obj instanceof Double;
                if (z6) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t6.zza()), t6.a().b(), obj.getClass().getName()));
            case 4:
                z6 = obj instanceof Boolean;
                if (z6) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t6.zza()), t6.a().b(), obj.getClass().getName()));
            case 5:
                z6 = obj instanceof String;
                if (z6) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t6.zza()), t6.a().b(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof uo3) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t6.zza()), t6.a().b(), obj.getClass().getName()));
            case c4.w0.f2149o /* 7 */:
                if ((obj instanceof Integer) || (obj instanceof cq3)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t6.zza()), t6.a().b(), obj.getClass().getName()));
            case c4.w0.f2150p /* 8 */:
                if (obj instanceof kr3) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t6.zza()), t6.a().b(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t6.zza()), t6.a().b(), obj.getClass().getName()));
        }
    }

    public final void b() {
        if (this.f11914b) {
            return;
        }
        this.f11913a.a();
        this.f11914b = true;
    }

    public final void c(T t6, Object obj) {
        if (!t6.c()) {
            d(t6, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d(t6, arrayList.get(i7));
            }
            obj = arrayList;
        }
        this.f11913a.put(t6, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        sp3 sp3Var = new sp3();
        for (int i7 = 0; i7 < this.f11913a.b(); i7++) {
            Map.Entry<T, Object> g7 = this.f11913a.g(i7);
            sp3Var.c(g7.getKey(), g7.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f11913a.c()) {
            sp3Var.c(entry.getKey(), entry.getValue());
        }
        sp3Var.f11915c = this.f11915c;
        return sp3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sp3) {
            return this.f11913a.equals(((sp3) obj).f11913a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11913a.hashCode();
    }
}
