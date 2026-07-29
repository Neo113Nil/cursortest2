package org.apache.a.f.c.a;

/* compiled from: WaitingThreadAborter.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private h f9821a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9822b;

    public void a() {
        this.f9822b = true;
        if (this.f9821a != null) {
            this.f9821a.b();
        }
    }

    public void a(h hVar) {
        this.f9821a = hVar;
        if (this.f9822b) {
            hVar.b();
        }
    }
}
