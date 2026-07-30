package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.text.l;

/* loaded from: classes.dex */
public class NoResourceException extends IORuntimeException {
    private static final long serialVersionUID = -623254467603299129L;

    public NoResourceException(Throwable th) {
        super(i.b.getMessage(th), th);
    }

    @Override // cn.hutool.core.io.IORuntimeException
    public boolean causeInstanceOf(Class<? extends Throwable> cls) {
        return cls.isInstance(getCause());
    }

    public NoResourceException(String str) {
        super(str);
    }

    public NoResourceException(String str, Object... objArr) {
        super(l.format(str, objArr));
    }

    public NoResourceException(String str, Throwable th) {
        super(str, th);
    }

    public NoResourceException(Throwable th, String str, Object... objArr) {
        super(l.format(str, objArr), th);
    }
}
