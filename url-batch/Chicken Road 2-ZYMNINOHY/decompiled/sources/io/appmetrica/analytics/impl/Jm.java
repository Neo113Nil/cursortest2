package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes.dex */
public final class Jm extends Rm {
    @Override // io.appmetrica.analytics.impl.Rm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        C1088xm c1088xm = new C1088xm();
        try {
            bArr = AbstractC0645gj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC0645gj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new Mf("startup_state", iBinaryDataHelper, new A8(c1088xm, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), new C0648gm());
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper a3;
        C1112yk B4 = C0817na.f12417I.B();
        synchronized (B4) {
            a3 = B4.a(context);
        }
        return a3;
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper a(Context context) {
        return C0817na.f12417I.B().b(context);
    }
}
