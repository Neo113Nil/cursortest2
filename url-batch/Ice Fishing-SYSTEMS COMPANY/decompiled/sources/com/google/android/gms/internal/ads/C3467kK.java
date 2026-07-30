package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.kK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3467kK extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O5 f32293a;

    public C3467kK(O5 o52) {
        Objects.requireNonNull(o52);
        this.f32293a = o52;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            C3253gK c3253gK = C3253gK.f30982c;
            O5 o52 = this.f32293a;
            Mac mac = (Mac) c3253gK.f30987a.d((String) o52.f26650v);
            mac.init((SecretKeySpec) o52.f26651w);
            return mac;
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }
}
