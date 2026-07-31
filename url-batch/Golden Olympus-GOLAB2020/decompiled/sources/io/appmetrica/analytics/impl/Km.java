package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes3.dex */
public final class Km extends Rm {
    @Override // io.appmetrica.analytics.impl.Rm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        C3126ym c3126ym = new C3126ym();
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
        return new Zf("startup_state", iBinaryDataHelper, new T8(c3126ym, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C2660gm());
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
