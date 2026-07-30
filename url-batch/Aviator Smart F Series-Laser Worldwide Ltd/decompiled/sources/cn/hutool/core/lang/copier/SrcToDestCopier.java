package cn.hutool.core.lang.copier;

import cn.hutool.core.lang.a0;
import cn.hutool.core.lang.copier.SrcToDestCopier;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class SrcToDestCopier<T, C extends SrcToDestCopier<T, C>> implements a, Serializable {
    private static final long serialVersionUID = 1;
    protected a0 copyFilter;
    protected T dest;
    protected T src;

    @Override // cn.hutool.core.lang.copier.a
    public abstract /* synthetic */ Object copy();

    public a0 getCopyFilter() {
        return this.copyFilter;
    }

    public T getDest() {
        return this.dest;
    }

    public T getSrc() {
        return this.src;
    }

    public C setCopyFilter(a0 a0Var) {
        this.copyFilter = a0Var;
        return this;
    }

    public C setDest(T t7) {
        this.dest = t7;
        return this;
    }

    public C setSrc(T t7) {
        this.src = t7;
        return this;
    }
}
