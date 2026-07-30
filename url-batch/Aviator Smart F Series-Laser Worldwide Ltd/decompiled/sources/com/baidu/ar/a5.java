package com.baidu.ar;

/* loaded from: classes.dex */
public class a5 extends e5 implements b2 {

    /* renamed from: c, reason: collision with root package name */
    public String f1633c = "*";

    @Override // com.baidu.ar.a2
    public String a() {
        return this.f1633c;
    }

    @Override // com.baidu.ar.b2
    public void b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.f1633c = str;
    }
}
