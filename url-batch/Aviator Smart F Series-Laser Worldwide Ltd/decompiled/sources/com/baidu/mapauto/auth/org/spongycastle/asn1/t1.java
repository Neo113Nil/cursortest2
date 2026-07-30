package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class t1 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f7838a;

    /* renamed from: b, reason: collision with root package name */
    public int f7839b;

    public t1(int i8, InputStream inputStream) {
        this.f7838a = inputStream;
        this.f7839b = i8;
    }

    public int a() {
        return this.f7839b;
    }

    public final void b() {
        InputStream inputStream = this.f7838a;
        if (inputStream instanceof q1) {
            q1 q1Var = (q1) inputStream;
            q1Var.f7829f = true;
            q1Var.c();
        }
    }
}
