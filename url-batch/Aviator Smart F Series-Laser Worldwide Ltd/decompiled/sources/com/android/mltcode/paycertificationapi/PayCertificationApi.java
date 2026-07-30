package com.android.mltcode.paycertificationapi;

import android.content.Context;
import androidx.annotation.Keep;
import com.android.mltcode.paycertification.call.VerificationListener;
import x.h;

@Keep
/* loaded from: classes.dex */
public class PayCertificationApi {
    public static void distributionData(byte[] bArr, VerificationListener verificationListener) {
        h.a().b(bArr, verificationListener);
    }

    public static void init(Context context, String str, IWrite iWrite) {
        if (iWrite == null || context == null) {
            return;
        }
        h.a().a(context, str, iWrite);
    }
}
