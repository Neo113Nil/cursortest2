package cn.hutool.core.exceptions;

import cn.hutool.core.text.l;

/* loaded from: classes.dex */
public class StatefulException extends RuntimeException {
    private static final long serialVersionUID = 6057602589533840889L;
    private int status;

    public StatefulException() {
    }

    public int getStatus() {
        return this.status;
    }

    public StatefulException(String str) {
        super(str);
    }

    public StatefulException(String str, Object... objArr) {
        super(l.format(str, objArr));
    }

    public StatefulException(Throwable th) {
        super(th);
    }

    public StatefulException(String str, Throwable th) {
        super(str, th);
    }

    public StatefulException(String str, Throwable th, boolean z7, boolean z8) {
        super(str, th, z7, z8);
    }

    public StatefulException(int i8, String str) {
        super(str);
        this.status = i8;
    }

    public StatefulException(int i8, Throwable th) {
        super(th);
        this.status = i8;
    }

    public StatefulException(int i8, String str, Throwable th) {
        super(str, th);
        this.status = i8;
    }
}
