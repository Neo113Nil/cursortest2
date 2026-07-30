package cn.hutool.core.util;

import cn.hutool.core.lang.func.Func0;
import java.io.Serializable;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Func0, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Class f599h;

    public /* synthetic */ v0(Class cls) {
        this.f599h = cls;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public final Object call() {
        Method[] lambda$getMethods$ea73458f$1;
        lambda$getMethods$ea73458f$1 = y0.lambda$getMethods$ea73458f$1(this.f599h);
        return lambda$getMethods$ea73458f$1;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public /* synthetic */ Object callWithRuntimeException() {
        return m.b.a(this);
    }
}
