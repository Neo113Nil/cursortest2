package cn.hutool.core.convert;

/* loaded from: classes.dex */
public class ConvertException extends RuntimeException {
    private static final long serialVersionUID = 4730597402855274362L;

    public ConvertException(Throwable th) {
        super(i.b.getMessage(th), th);
    }

    public ConvertException(String str) {
        super(str);
    }

    public ConvertException(String str, Object... objArr) {
        super(cn.hutool.core.text.l.format(str, objArr));
    }

    public ConvertException(String str, Throwable th) {
        super(str, th);
    }

    public ConvertException(Throwable th, String str, Object... objArr) {
        super(cn.hutool.core.text.l.format(str, objArr), th);
    }
}
