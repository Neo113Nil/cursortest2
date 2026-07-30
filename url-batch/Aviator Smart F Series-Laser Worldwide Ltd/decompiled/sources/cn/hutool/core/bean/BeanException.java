package cn.hutool.core.bean;

/* loaded from: classes.dex */
public class BeanException extends RuntimeException {
    private static final long serialVersionUID = -8096998667745023423L;

    public BeanException(Throwable th) {
        super(i.b.getMessage(th), th);
    }

    public BeanException(String str) {
        super(str);
    }

    public BeanException(String str, Object... objArr) {
        super(cn.hutool.core.text.l.format(str, objArr));
    }

    public BeanException(String str, Throwable th) {
        super(str, th);
    }

    public BeanException(Throwable th, String str, Object... objArr) {
        super(cn.hutool.core.text.l.format(str, objArr), th);
    }
}
