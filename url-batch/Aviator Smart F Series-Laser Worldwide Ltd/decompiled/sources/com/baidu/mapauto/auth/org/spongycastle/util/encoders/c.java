package com.baidu.mapauto.auth.org.spongycastle.util.encoders;

/* loaded from: classes2.dex */
public final class c extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f7868a;

    public c(String str, Exception exc) {
        super(str);
        this.f7868a = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f7868a;
    }
}
