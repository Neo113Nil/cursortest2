package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes3.dex */
public final class Lm extends Rm {
    @Override // io.appmetrica.analytics.impl.Rm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        C2586e2 c2586e2 = new C2586e2();
        try {
            bArr = AbstractC2993tj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC2993tj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new Zf("app_permissions_state", iBinaryDataHelper, new T8(c2586e2, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C2479a2(new H2()));
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper c(Context context) {
        C2874p3 c2874p3;
        C3007u7 a4 = C3007u7.a(context);
        synchronized (a4) {
            try {
                if (a4.f39907i == null) {
                    a4.f39907i = new C2874p3(a4.g());
                }
                c2874p3 = a4.f39907i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2874p3;
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper d(Context context) {
        IBinaryDataHelper g4;
        C3007u7 a4 = C3007u7.a(context);
        synchronized (a4) {
            g4 = a4.g();
        }
        return g4;
    }
}
