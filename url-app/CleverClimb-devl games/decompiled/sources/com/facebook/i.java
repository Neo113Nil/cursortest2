package com.facebook;

/* compiled from: FacebookDialogException.java */
/* loaded from: classes.dex */
public class i extends j {

    /* renamed from: a, reason: collision with root package name */
    private int f6039a;

    /* renamed from: b, reason: collision with root package name */
    private String f6040b;

    public i(String str, int i, String str2) {
        super(str);
        this.f6039a = i;
        this.f6040b = str2;
    }

    public int a() {
        return this.f6039a;
    }

    public String b() {
        return this.f6040b;
    }

    @Override // com.facebook.j, java.lang.Throwable
    public final String toString() {
        return "{FacebookDialogException: errorCode: " + a() + ", message: " + getMessage() + ", url: " + b() + "}";
    }
}
