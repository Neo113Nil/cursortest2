package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public final f f9867a;

    public j(f fVar) {
        this.f9867a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final c a(Context context) {
        c cVar;
        f fVar;
        try {
            try {
                try {
                    try {
                        m mVar = (m) ((o) this.f9867a.a(context));
                        cVar = new c(IdentifierStatus.OK, new a("huawei", mVar.a(), Boolean.valueOf(mVar.b())), null, 4);
                        fVar = this.f9867a;
                    } catch (g e4) {
                        String message = e4.getMessage();
                        if (message == null) {
                            message = "unknown exception during binding huawei services";
                        }
                        cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                        fVar = this.f9867a;
                    }
                } finally {
                    fVar.b(context);
                }
                fVar.b(context);
            } catch (Throwable th) {
                try {
                    this.f9867a.b(context);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return cVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j() {
        this(new f(r1, i.f9866a, "huawei"));
        Intent intent;
        intent = k.f9868a;
    }
}
