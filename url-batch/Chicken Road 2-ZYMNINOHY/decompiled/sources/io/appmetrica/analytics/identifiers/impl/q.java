package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public final f f9871a;

    public q(f fVar) {
        this.f9871a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final c a(Context context) {
        c cVar;
        try {
            try {
                try {
                    try {
                        c b4 = b(context);
                        try {
                            this.f9871a.b(context);
                            return b4;
                        } catch (Throwable unused) {
                            return b4;
                        }
                    } catch (g e4) {
                        String message = e4.getMessage();
                        if (message == null) {
                            message = "unknown exception while binding yandex adv_id service";
                        }
                        cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message, 2);
                        this.f9871a.b(context);
                        return cVar;
                    }
                } catch (l e5) {
                    String message2 = e5.getMessage();
                    if (message2 == null) {
                        message2 = "No yandex adv_id service";
                    }
                    cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message2, 2);
                    this.f9871a.b(context);
                    return cVar;
                } catch (Throwable th) {
                    return new c(IdentifierStatus.UNKNOWN, null, "exception while fetching yandex adv_id: " + th.getMessage(), 2);
                }
            } catch (Throwable unused2) {
                return cVar;
            }
        } finally {
            try {
                this.f9871a.b(context);
            } catch (Throwable unused3) {
            }
        }
    }

    public final c b(Context context) {
        s sVar = (s) ((u) this.f9871a.a(context));
        sVar.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            sVar.f9873a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                sVar.f9873a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                boolean z = obtain2.readInt() != 0;
                obtain2.recycle();
                obtain.recycle();
                return new c(IdentifierStatus.OK, new a("yandex", readString, Boolean.valueOf(z)), null, 4);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q() {
        this(new f(r1, p.f9870a, "yandex"));
        Intent intent;
        intent = r.f9872a;
    }
}
