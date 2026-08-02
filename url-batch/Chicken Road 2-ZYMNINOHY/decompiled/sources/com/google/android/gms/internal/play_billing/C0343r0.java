package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343r0 extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0343r0(String str, int i4) {
        super(str);
        this.f6000a = i4;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f6000a) {
            case 0:
                synchronized (this) {
                    break;
                }
            default:
                synchronized (this) {
                    break;
                }
        }
        return this;
    }
}
