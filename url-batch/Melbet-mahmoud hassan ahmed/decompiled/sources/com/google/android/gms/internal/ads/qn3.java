package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* loaded from: classes.dex */
final class qn3 extends ThreadLocal<Mac> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ rn3 f10772a;

    qn3(rn3 rn3Var) {
        this.f10772a = rn3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            cn3<hn3, Mac> cn3Var = cn3.f3892f;
            str = this.f10772a.f11281b;
            Mac a7 = cn3Var.a(str);
            key = this.f10772a.f11282c;
            a7.init(key);
            return a7;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
