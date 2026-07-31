package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class uq3 extends yq3 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f12933c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ uq3(tq3 tq3Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> f(Object obj, long j7, int i7) {
        rq3 rq3Var;
        List<L> list = (List) gt3.p(obj, j7);
        if (list.isEmpty()) {
            List<L> rq3Var2 = list instanceof sq3 ? new rq3(i7) : ((list instanceof sr3) && (list instanceof jq3)) ? ((jq3) list).e(i7) : new ArrayList<>(i7);
            gt3.D(obj, j7, rq3Var2);
            return rq3Var2;
        }
        if (f12933c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            rq3Var = arrayList;
        } else {
            if (!(list instanceof bt3)) {
                if (!(list instanceof sr3) || !(list instanceof jq3)) {
                    return list;
                }
                jq3 jq3Var = (jq3) list;
                if (jq3Var.c()) {
                    return list;
                }
                jq3 e7 = jq3Var.e(list.size() + i7);
                gt3.D(obj, j7, e7);
                return e7;
            }
            rq3 rq3Var3 = new rq3(list.size() + i7);
            rq3Var3.addAll(rq3Var3.size(), (bt3) list);
            rq3Var = rq3Var3;
        }
        gt3.D(obj, j7, rq3Var);
        return rq3Var;
    }

    @Override // com.google.android.gms.internal.ads.yq3
    final <L> List<L> a(Object obj, long j7) {
        return f(obj, j7, 10);
    }

    @Override // com.google.android.gms.internal.ads.yq3
    final void b(Object obj, long j7) {
        Object unmodifiableList;
        List list = (List) gt3.p(obj, j7);
        if (list instanceof sq3) {
            unmodifiableList = ((sq3) list).b();
        } else {
            if (f12933c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof sr3) && (list instanceof jq3)) {
                jq3 jq3Var = (jq3) list;
                if (jq3Var.c()) {
                    jq3Var.a();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        gt3.D(obj, j7, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.yq3
    final <E> void c(Object obj, Object obj2, long j7) {
        List list = (List) gt3.p(obj2, j7);
        List f7 = f(obj, j7, list.size());
        int size = f7.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f7.addAll(list);
        }
        if (size > 0) {
            list = f7;
        }
        gt3.D(obj, j7, list);
    }
}
