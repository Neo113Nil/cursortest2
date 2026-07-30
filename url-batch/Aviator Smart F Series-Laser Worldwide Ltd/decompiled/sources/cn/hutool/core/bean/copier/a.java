package cn.hutool.core.bean.copier;

import cn.hutool.core.util.e0;

/* loaded from: classes.dex */
public abstract class a implements cn.hutool.core.lang.copier.a {
    protected final CopyOptions copyOptions;
    protected final Object source;
    protected final Object target;

    public a(Object obj, Object obj2, CopyOptions copyOptions) {
        this.source = obj;
        this.target = obj2;
        this.copyOptions = (CopyOptions) e0.defaultIfNull(copyOptions, new cn.hutool.core.bean.o());
    }

    @Override // cn.hutool.core.lang.copier.a
    public abstract /* synthetic */ Object copy();
}
