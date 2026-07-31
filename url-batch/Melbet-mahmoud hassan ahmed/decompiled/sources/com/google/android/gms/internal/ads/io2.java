package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ea1;
import com.google.android.gms.internal.ads.v61;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class io2<U extends ea1<A>, A extends v61> implements pu2<U, A> {

    /* renamed from: a, reason: collision with root package name */
    public final dp2<U> f6721a;

    /* renamed from: b, reason: collision with root package name */
    public final fp2 f6722b;

    /* renamed from: c, reason: collision with root package name */
    public final kv f6723c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6724d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f6725e;

    /* renamed from: f, reason: collision with root package name */
    public final vv f6726f;

    /* renamed from: g, reason: collision with root package name */
    public final du2 f6727g;

    public io2(dp2<U> dp2Var, fp2 fp2Var, kv kvVar, String str, Executor executor, vv vvVar, du2 du2Var) {
        this.f6721a = dp2Var;
        this.f6722b = fp2Var;
        this.f6723c = kvVar;
        this.f6724d = str;
        this.f6725e = executor;
        this.f6726f = vvVar;
        this.f6727g = du2Var;
    }

    @Override // com.google.android.gms.internal.ads.pu2
    public final Executor a() {
        return this.f6725e;
    }

    @Override // com.google.android.gms.internal.ads.pu2
    public final du2 zza() {
        return this.f6727g;
    }
}
