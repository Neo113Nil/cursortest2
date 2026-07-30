package cn.hutool.core.collection;

import cn.hutool.core.lang.func.Func1;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Func1, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f416h;

    public /* synthetic */ f0(String str) {
        this.f416h = str;
    }

    @Override // cn.hutool.core.lang.func.Func1
    public final Object call(Object obj) {
        Object lambda$fieldValueMap$a3f4a90f$1;
        lambda$fieldValueMap$a3f4a90f$1 = k0.lambda$fieldValueMap$a3f4a90f$1(this.f416h, obj);
        return lambda$fieldValueMap$a3f4a90f$1;
    }

    @Override // cn.hutool.core.lang.func.Func1
    public /* synthetic */ Object callWithRuntimeException(Object obj) {
        return m.c.a(this, obj);
    }
}
