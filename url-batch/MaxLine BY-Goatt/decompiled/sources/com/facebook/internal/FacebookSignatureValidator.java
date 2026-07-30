package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import defpackage.rj2;
import defpackage.tp2;
import defpackage.zv;
import java.util.HashSet;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FacebookSignatureValidator {
    public static final FacebookSignatureValidator INSTANCE = new FacebookSignatureValidator();
    private static final String FBR_HASH = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";
    private static final String FBR2_HASH = "cc2751449a350f668590264ed76692694a80308a";
    private static final String FBI_HASH = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";
    private static final String FBL_HASH = "df6b721c8b4d3b6eb44c861d4415007e5a35fc95";
    private static final String MSR_HASH = "9b8f518b086098de3d77736f9458a3d2f6f95a37";
    private static final String FBF_HASH = "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3";
    private static final String IGR_HASH = "c56fb7d591ba6704df047fd98f535372fea00211";
    private static final HashSet<String> validAppSignatureHashes = rj2.c(FBR_HASH, FBR2_HASH, FBI_HASH, FBL_HASH, MSR_HASH, FBF_HASH, IGR_HASH);

    private FacebookSignatureValidator() {
    }

    public static final boolean validateSignature(Context context, String str) {
        context.getClass();
        str.getClass();
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        str2.getClass();
        if (tp2.o(str2, "generic", false) && (i & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                signatureArr.getClass();
                for (Signature signature : signatureArr) {
                    HashSet<String> hashSet = validAppSignatureHashes;
                    byte[] byteArray = signature.toByteArray();
                    byteArray.getClass();
                    if (zv.q(hashSet, Utility.sha1hash(byteArray))) {
                    }
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
