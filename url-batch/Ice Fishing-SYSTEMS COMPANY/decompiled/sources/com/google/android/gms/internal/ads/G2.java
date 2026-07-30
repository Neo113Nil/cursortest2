package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class G2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25091a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25092b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25093c = false;

    public boolean a() {
        return (this.f25093c || this.f25092b) && this.f25091a;
    }

    public C2985bP b() {
        if (this.f25091a || !(this.f25092b || this.f25093c)) {
            return new C2985bP(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
