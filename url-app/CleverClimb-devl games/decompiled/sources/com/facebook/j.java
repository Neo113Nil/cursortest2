package com.facebook;

/* compiled from: FacebookException.java */
/* loaded from: classes.dex */
public class j extends RuntimeException {
    public j() {
    }

    public j(String str) {
        super(str);
    }

    public j(String str, Object... objArr) {
        this(String.format(str, objArr));
    }

    public j(String str, Throwable th) {
        super(str, th);
    }

    public j(Throwable th) {
        super(th);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }
}
