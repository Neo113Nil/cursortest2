package org.apache.a.e;

import com.aiming.mdt.utils.Constants;
import java.io.IOException;
import org.apache.a.j;

/* compiled from: AbstractHttpEntity.java */
/* loaded from: classes2.dex */
public abstract class a implements j {

    /* renamed from: a, reason: collision with root package name */
    protected org.apache.a.d f9702a;

    /* renamed from: b, reason: collision with root package name */
    protected org.apache.a.d f9703b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f9704c;

    @Override // org.apache.a.j
    public void h() throws IOException {
    }

    protected a() {
    }

    @Override // org.apache.a.j
    public org.apache.a.d d() {
        return this.f9702a;
    }

    @Override // org.apache.a.j
    public org.apache.a.d e() {
        return this.f9703b;
    }

    @Override // org.apache.a.j
    public boolean b() {
        return this.f9704c;
    }

    public void a(org.apache.a.d dVar) {
        this.f9702a = dVar;
    }

    public void a(String str) {
        a(str != null ? new org.apache.a.h.b(Constants.KEY_CONTENT_TYPE, str) : null);
    }

    public void b(org.apache.a.d dVar) {
        this.f9703b = dVar;
    }

    public void b(String str) {
        b(str != null ? new org.apache.a.h.b("Content-Encoding", str) : null);
    }

    public void a(boolean z) {
        this.f9704c = z;
    }
}
