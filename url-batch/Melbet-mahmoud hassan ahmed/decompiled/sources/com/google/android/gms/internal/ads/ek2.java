package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ek2 implements ij2<fk2> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4647a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4648b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f4649c;

    /* renamed from: d, reason: collision with root package name */
    private final ln0 f4650d;

    public ek2(ln0 ln0Var, Executor executor, String str, PackageInfo packageInfo, int i7, byte[] bArr) {
        this.f4650d = ln0Var;
        this.f4647a = executor;
        this.f4648b = str;
        this.f4649c = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<fk2> a() {
        return rb3.g(rb3.m(rb3.i(this.f4648b), new e43() { // from class: com.google.android.gms.internal.ads.ck2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                return new fk2((String) obj);
            }
        }, this.f4647a), Throwable.class, new xa3() { // from class: com.google.android.gms.internal.ads.dk2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return ek2.this.b((Throwable) obj);
            }
        }, this.f4647a);
    }

    final /* synthetic */ cc3 b(Throwable th) {
        return rb3.i(new fk2(this.f4648b));
    }
}
