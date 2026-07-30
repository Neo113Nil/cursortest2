package cn.hutool.core.collection;

import cn.hutool.core.lang.func.Func1;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Func1, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f414h;

    public /* synthetic */ a0(String str) {
        this.f414h = str;
    }

    @Override // cn.hutool.core.lang.func.Func1
    public final Object call(Object obj) {
        Object lambda$fieldValueAsMap$f61513e$1;
        lambda$fieldValueAsMap$f61513e$1 = k0.lambda$fieldValueAsMap$f61513e$1(this.f414h, obj);
        return lambda$fieldValueAsMap$f61513e$1;
    }

    @Override // cn.hutool.core.lang.func.Func1
    public /* synthetic */ Object callWithRuntimeException(Object obj) {
        return m.c.a(this, obj);
    }
}
