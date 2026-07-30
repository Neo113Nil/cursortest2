package cn.hutool.core.lang;

import cn.hutool.core.lang.func.Func0;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements Func0, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Class f503h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object[] f504i;

    public /* synthetic */ t0(Class cls, Object[] objArr) {
        this.f503h = cls;
        this.f504i = objArr;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public final Object call() {
        Object newInstance;
        newInstance = cn.hutool.core.util.y0.newInstance(this.f503h, this.f504i);
        return newInstance;
    }

    @Override // cn.hutool.core.lang.func.Func0
    public /* synthetic */ Object callWithRuntimeException() {
        return m.b.a(this);
    }
}
