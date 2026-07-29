package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProgressNoopOutputStream.java */
/* loaded from: classes.dex */
class x extends OutputStream implements z {

    /* renamed from: a, reason: collision with root package name */
    private final Map<GraphRequest, aa> f6469a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f6470b;

    /* renamed from: c, reason: collision with root package name */
    private GraphRequest f6471c;

    /* renamed from: d, reason: collision with root package name */
    private aa f6472d;
    private int e;

    x(Handler handler) {
        this.f6470b = handler;
    }

    @Override // com.facebook.z
    public void a(GraphRequest graphRequest) {
        this.f6471c = graphRequest;
        this.f6472d = graphRequest != null ? this.f6469a.get(graphRequest) : null;
    }

    int a() {
        return this.e;
    }

    Map<GraphRequest, aa> b() {
        return this.f6469a;
    }

    void a(long j) {
        if (this.f6472d == null) {
            this.f6472d = new aa(this.f6470b, this.f6471c);
            this.f6469a.put(this.f6471c, this.f6472d);
        }
        this.f6472d.b(j);
        this.e = (int) (this.e + j);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        a(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        a(i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        a(1L);
    }
}
