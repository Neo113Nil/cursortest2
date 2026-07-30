package cn.hutool.core.exceptions;

import cn.hutool.core.text.l;

/* loaded from: classes.dex */
public class ValidateException extends StatefulException {
    private static final long serialVersionUID = 6057602589533840889L;

    public ValidateException() {
    }

    public ValidateException(String str) {
        super(str);
    }

    public ValidateException(String str, Object... objArr) {
        super(l.format(str, objArr));
    }

    public ValidateException(Throwable th) {
        super(th);
    }

    public ValidateException(String str, Throwable th) {
        super(str, th);
    }

    public ValidateException(int i8, String str) {
        super(i8, str);
    }

    public ValidateException(int i8, Throwable th) {
        super(i8, th);
    }

    public ValidateException(String str, Throwable th, boolean z7, boolean z8) {
        super(str, th, z7, z8);
    }

    public ValidateException(int i8, String str, Throwable th) {
        super(i8, str, th);
    }
}
