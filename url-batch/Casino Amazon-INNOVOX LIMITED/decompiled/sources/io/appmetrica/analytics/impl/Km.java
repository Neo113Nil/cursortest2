package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes3.dex */
public final class Km extends Sm {
    @Override // io.appmetrica.analytics.impl.Sm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        C0662ym c0662ym = new C0662ym();
        try {
            bArr = AbstractC0232hj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC0232hj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new Nf("startup_state", iBinaryDataHelper, new B8(c0662ym, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C0235hm());
    }

    @Override // io.appmetrica.analytics.impl.Sm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper a2;
        C0685zk B = C0401oa.I.B();
        synchronized (B) {
            a2 = B.a(context);
        }
        return a2;
    }

    @Override // io.appmetrica.analytics.impl.Sm
    public final IBinaryDataHelper a(Context context) {
        return C0401oa.I.B().b(context);
    }
}
