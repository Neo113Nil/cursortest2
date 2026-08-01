package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: SubBranchInterceptor.java */
/* loaded from: classes.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {
    Map<String, a> g;

    l() {
    }

    static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).a == f.class;
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    protected final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr == null || objArr.length != 1 || (obj = objArr[0]) == null) {
            throw new IllegalStateException("args error");
        }
        try {
            this.g = (Map) obj;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* compiled from: SubBranchInterceptor.java */
    public static final class b {
        private Map<String, a> a = new HashMap();
        private com.bykv.vk.openvk.preload.b.b.a b;

        public final a a(String str) {
            if (this.a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            h.a a = new h.a().a(cls);
            a.c = new Object[]{this.a};
            a.b = this.b;
            return a.a();
        }
    }

    /* compiled from: SubBranchInterceptor.java */
    public static final class a {
        List<h> a = new ArrayList();

        public final a a(h hVar) {
            this.a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.a.addAll(list);
            return this;
        }
    }
}
