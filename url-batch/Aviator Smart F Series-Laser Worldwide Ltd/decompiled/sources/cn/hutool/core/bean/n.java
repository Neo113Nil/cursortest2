package cn.hutool.core.bean;

import cn.hutool.core.lang.func.Func0;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Func0, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Class f410h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f411i;

    public /* synthetic */ n(Class cls, boolean z7) {
        this.f410h = cls;
        this.f411i = z7;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public final Object call() {
        Map internalGetPropertyDescriptorMap;
        internalGetPropertyDescriptorMap = q.internalGetPropertyDescriptorMap(this.f410h, this.f411i);
        return internalGetPropertyDescriptorMap;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public /* synthetic */ Object callWithRuntimeException() {
        return m.b.a(this);
    }
}
