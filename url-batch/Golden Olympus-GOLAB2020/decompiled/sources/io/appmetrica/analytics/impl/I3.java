package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class I3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37699a;

    /* renamed from: b, reason: collision with root package name */
    public final C2756kf f37700b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37701c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f37702d;

    public I3(Context context, C2756kf c2756kf, String str, SafePackageManager safePackageManager) {
        this.f37699a = context;
        this.f37700b = c2756kf;
        this.f37701c = str;
        this.f37702d = safePackageManager;
    }

    public final List a() {
        Signature[] signatureArr;
        String str;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        List<String> f4 = this.f37700b.f();
        boolean isEmpty = f4.isEmpty();
        List<String> list = f4;
        if (isEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    signingInfo = this.f37702d.getPackageInfo(this.f37699a, this.f37701c, 134217728).signingInfo;
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.f37702d.getPackageInfo(this.f37699a, this.f37701c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature signature : signatureArr) {
                        try {
                            str = StringUtils.formatSha1(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean isEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!isEmpty2) {
                this.f37700b.a(arrayList).b();
                list = arrayList;
            }
        }
        return list;
    }
}
