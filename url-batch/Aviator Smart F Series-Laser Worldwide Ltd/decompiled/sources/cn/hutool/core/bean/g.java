package cn.hutool.core.bean;

import cn.hutool.core.lang.func.Func0;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Func0, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Class f402h;

    public /* synthetic */ g(Class cls) {
        this.f402h = cls;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public final Object call() {
        BeanDesc lambda$getBeanDesc$e7c7684d$1;
        lambda$getBeanDesc$e7c7684d$1 = q.lambda$getBeanDesc$e7c7684d$1(this.f402h);
        return lambda$getBeanDesc$e7c7684d$1;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public /* synthetic */ Object callWithRuntimeException() {
        return m.b.a(this);
    }
}
