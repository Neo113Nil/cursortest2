package cn.hutool.core.date;

/* loaded from: classes.dex */
public class DateException extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public DateException(Throwable th) {
        super(i.b.getMessage(th), th);
    }

    public DateException(String str) {
        super(str);
    }

    public DateException(String str, Object... objArr) {
        super(cn.hutool.core.text.l.format(str, objArr));
    }

    public DateException(String str, Throwable th) {
        super(str, th);
    }

    public DateException(Throwable th, String str, Object... objArr) {
        super(cn.hutool.core.text.l.format(str, objArr), th);
    }
}
