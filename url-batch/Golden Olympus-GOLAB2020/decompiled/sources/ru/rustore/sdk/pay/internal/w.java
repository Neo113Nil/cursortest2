package ru.rustore.sdk.pay.internal;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.util.ArrayList;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f45146a;

    public w(@NotNull t4 cryptoProvider, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(cryptoProvider, "cryptoProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45146a = context;
    }

    @NotNull
    public final ArrayList a() {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Context context = this.f45146a;
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo;
            if (signingInfo == null) {
                signatureArr = new Signature[0];
            } else {
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                Intrinsics.checkNotNullExpressionValue(signatureArr, "{\n            val signin…y\n            }\n        }");
            }
        } else {
            signatureArr = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                signatureArr = new Signature[0];
            }
        }
        ArrayList arrayList = new ArrayList(signatureArr.length);
        for (Signature signature : signatureArr) {
            byte[] content = signature.toByteArray();
            Intrinsics.checkNotNullExpressionValue(content, "it.toByteArray()");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter("SHA-256", "algorithm");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(content);
            byte[] hash = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(hash, "getInstance(algorithm)\n …) }\n            .digest()");
            Intrinsics.checkNotNullParameter(hash, "hash");
            arrayList.add(AbstractC3219i.i0(hash, "", null, null, 0, null, k6.f44420a, 30, null));
        }
        return arrayList;
    }
}
