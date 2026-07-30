package cn.hutool.core.util;

import cn.hutool.core.lang.func.Func0;
import java.io.Serializable;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Func0, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Class f594h;

    public /* synthetic */ s0(Class cls) {
        this.f594h = cls;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public final Object call() {
        Constructor[] constructorsDirectly;
        constructorsDirectly = y0.getConstructorsDirectly(this.f594h);
        return constructorsDirectly;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public /* synthetic */ Object callWithRuntimeException() {
        return m.b.a(this);
    }
}
