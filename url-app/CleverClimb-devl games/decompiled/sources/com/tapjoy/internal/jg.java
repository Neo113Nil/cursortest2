package com.tapjoy.internal;

/* loaded from: classes2.dex */
public final class jg {

    /* renamed from: a, reason: collision with root package name */
    public static jg f8442a = new jg(null);

    /* renamed from: b, reason: collision with root package name */
    public String f8443b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f8444c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f8445d;

    public jg(String str) {
        this(str, null, null);
    }

    public jg(String str, Object[] objArr, Throwable th) {
        this.f8443b = str;
        this.f8444c = th;
        if (th == null) {
            this.f8445d = objArr;
            return;
        }
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f8445d = objArr2;
    }
}
