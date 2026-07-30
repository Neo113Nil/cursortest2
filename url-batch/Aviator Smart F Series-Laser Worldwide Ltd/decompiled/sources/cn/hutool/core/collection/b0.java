package cn.hutool.core.collection;

import cn.hutool.core.lang.func.Func1;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Func1, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f415h;

    public /* synthetic */ b0(String str) {
        this.f415h = str;
    }

    @Override // cn.hutool.core.lang.func.Func1
    public final Object call(Object obj) {
        Object lambda$fieldValueAsMap$ceda202c$1;
        lambda$fieldValueAsMap$ceda202c$1 = k0.lambda$fieldValueAsMap$ceda202c$1(this.f415h, obj);
        return lambda$fieldValueAsMap$ceda202c$1;
    }

    @Override // cn.hutool.core.lang.func.Func1
    public /* synthetic */ Object callWithRuntimeException(Object obj) {
        return m.c.a(this, obj);
    }
}
