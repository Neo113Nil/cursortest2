package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.l;
import java.util.List;

/* compiled from: BranchInterceptor.java */
/* loaded from: classes4.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    protected abstract String a(IN in);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        String a = a((a<IN, OUT>) in);
        l.a aVar = a().get(a);
        if (aVar == null) {
            throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(a)));
        }
        List<h> list = aVar.a;
        Object a2 = c.a(list, ((i) bVar).a, this).a((b) in);
        return !l.a(list) ? a2 : bVar.a((b<OUT>) a2);
    }
}
