package org.apache.a.f.d;

import java.io.Serializable;
import java.util.Date;

/* compiled from: BasicClientCookie2.java */
/* loaded from: classes2.dex */
public class d extends c implements Serializable, org.apache.a.d.m {

    /* renamed from: a, reason: collision with root package name */
    private String f9864a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f9865b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9866c;

    public d(String str, String str2) {
        super(str, str2);
    }

    @Override // org.apache.a.f.d.c, org.apache.a.d.b
    public int[] e() {
        return this.f9865b;
    }

    @Override // org.apache.a.d.m
    public void a(int[] iArr) {
        this.f9865b = iArr;
    }

    @Override // org.apache.a.d.m
    public void a_(String str) {
        this.f9864a = str;
    }

    @Override // org.apache.a.d.m
    public void b(boolean z) {
        this.f9866c = z;
    }

    @Override // org.apache.a.f.d.c, org.apache.a.d.b
    public boolean a(Date date) {
        return this.f9866c || super.a(date);
    }

    @Override // org.apache.a.f.d.c
    public Object clone() throws CloneNotSupportedException {
        d dVar = (d) super.clone();
        if (this.f9865b != null) {
            dVar.f9865b = (int[]) this.f9865b.clone();
        }
        return dVar;
    }
}
