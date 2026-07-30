package cn.hutool.core.exceptions;

import cn.hutool.core.text.l;
import i.b;

/* loaded from: classes.dex */
public class UtilException extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public UtilException(Throwable th) {
        super(b.getMessage(th), th);
    }

    public UtilException(String str) {
        super(str);
    }

    public UtilException(String str, Object... objArr) {
        super(l.format(str, objArr));
    }

    public UtilException(String str, Throwable th) {
        super(str, th);
    }

    public UtilException(String str, Throwable th, boolean z7, boolean z8) {
        super(str, th, z7, z8);
    }

    public UtilException(Throwable th, String str, Object... objArr) {
        super(l.format(str, objArr), th);
    }
}
