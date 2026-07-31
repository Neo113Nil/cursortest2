package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes3.dex */
public final class Nm extends Rm {
    @Override // io.appmetrica.analytics.impl.Rm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        A2 a22 = new A2();
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
        return new Zf("auto_inapp_collecting_info_data", iBinaryDataHelper, new T8(a22, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C3080x2(new C2641g3()));
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper c(Context context) {
        C2874p3 c2874p3;
        C3007u7 a4 = C3007u7.a(context);
        synchronized (a4) {
            try {
                if (a4.f39909k == null) {
                    a4.f39909k = new C2874p3(a4.e());
                }
                c2874p3 = a4.f39909k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2874p3;
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper d(Context context) {
        IBinaryDataHelper e4;
        C3007u7 a4 = C3007u7.a(context);
        synchronized (a4) {
            e4 = a4.e();
        }
        return e4;
    }
}
