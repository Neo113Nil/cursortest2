package cn.hutool.core.util;

import cn.hutool.core.lang.func.Func0;
import java.io.Serializable;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Func0, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Class f601h;

    public /* synthetic */ x0(Class cls) {
        this.f601h = cls;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public final Object call() {
        Field[] lambda$getFields$54eedd5e$1;
        lambda$getFields$54eedd5e$1 = y0.lambda$getFields$54eedd5e$1(this.f601h);
        return lambda$getFields$54eedd5e$1;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public /* synthetic */ Object callWithRuntimeException() {
        return m.b.a(this);
    }
}
