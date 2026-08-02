package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class F extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5829a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(String str, int i4) {
        super(str);
        this.f5829a = i4;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        int i4 = this.f5829a;
        return this;
    }
}
