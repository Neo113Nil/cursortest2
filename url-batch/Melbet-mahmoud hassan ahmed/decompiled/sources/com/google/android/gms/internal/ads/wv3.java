package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class wv3<T> implements kv3<Set<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final kv3<Set<Object>> f13953c = lv3.b(Collections.emptySet());

    /* renamed from: a, reason: collision with root package name */
    private final List<yv3<T>> f13954a;

    /* renamed from: b, reason: collision with root package name */
    private final List<yv3<Collection<T>>> f13955b;

    /* synthetic */ wv3(List list, List list2, uv3 uv3Var) {
        this.f13954a = list;
        this.f13955b = list2;
    }

    public static <T> vv3<T> b(int i7, int i8) {
        return new vv3<>(i7, i8, null);
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Set<T> a() {
        int size = this.f13954a.size();
        ArrayList arrayList = new ArrayList(this.f13955b.size());
        int size2 = this.f13955b.size();
        for (int i7 = 0; i7 < size2; i7++) {
            Collection<T> a7 = this.f13955b.get(i7).a();
            size += a7.size();
            arrayList.add(a7);
        }
        HashSet a8 = hv3.a(size);
        int size3 = this.f13954a.size();
        for (int i8 = 0; i8 < size3; i8++) {
            T a9 = this.f13954a.get(i8).a();
            Objects.requireNonNull(a9);
            a8.add(a9);
        }
        int size4 = arrayList.size();
        for (int i9 = 0; i9 < size4; i9++) {
            for (Object obj : (Collection) arrayList.get(i9)) {
                Objects.requireNonNull(obj);
                a8.add(obj);
            }
        }
        return Collections.unmodifiableSet(a8);
    }
}
