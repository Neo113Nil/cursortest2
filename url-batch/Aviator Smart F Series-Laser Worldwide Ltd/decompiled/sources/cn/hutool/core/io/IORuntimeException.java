package cn.hutool.core.io;

/* loaded from: classes.dex */
public class IORuntimeException extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public IORuntimeException(Throwable th) {
        super(i.b.getMessage(th), th);
    }

    public boolean causeInstanceOf(Class<? extends Throwable> cls) {
        return cls != null && cls.isInstance(getCause());
    }

    public IORuntimeException(String str) {
        super(str);
    }

    public IORuntimeException(String str, Object... objArr) {
        super(cn.hutool.core.text.l.format(str, objArr));
    }

    public IORuntimeException(String str, Throwable th) {
        super(str, th);
    }

    public IORuntimeException(Throwable th, String str, Object... objArr) {
        super(cn.hutool.core.text.l.format(str, objArr), th);
    }
}
