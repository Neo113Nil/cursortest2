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

/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0369n3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1387a;
    public final Xe b;
    public final String c;
    public final SafePackageManager d;

    public C0369n3(Context context, Xe xe, String str, SafePackageManager safePackageManager) {
        this.f1387a = context;
        this.b = xe;
        this.c = str;
        this.d = safePackageManager;
    }

    public final List a() {
        Signature[] signatureArr;
        String str;
        List<String> g = this.b.g();
        boolean isEmpty = g.isEmpty();
        List<String> list = g;
        if (isEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    SigningInfo signingInfo = this.d.getPackageInfo(this.f1387a, this.c, 134217728).signingInfo;
                    signatureArr = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.d.getPackageInfo(this.f1387a, this.c, 64).signatures;
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
                this.b.a(arrayList).b();
                list = arrayList;
            }
        }
        return list;
    }
}
