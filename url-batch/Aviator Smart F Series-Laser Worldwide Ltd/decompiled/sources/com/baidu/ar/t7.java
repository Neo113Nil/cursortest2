package com.baidu.ar;

/* loaded from: classes.dex */
public class t7 extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;

    /* renamed from: a, reason: collision with root package name */
    public final int f3299a;

    public t7(int i8) {
        this.f3299a = i8;
    }

    public int a() {
        return this.f3299a;
    }

    public t7(int i8, String str) {
        super(str);
        this.f3299a = i8;
    }

    public t7(int i8, Throwable th) {
        super(th);
        this.f3299a = i8;
    }
}
