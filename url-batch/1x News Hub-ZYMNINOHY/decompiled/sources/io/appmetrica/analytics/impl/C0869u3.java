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

/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0869u3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8389a;

    /* renamed from: b, reason: collision with root package name */
    public final C0390bf f8390b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8391c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f8392d;

    public C0869u3(Context context, C0390bf c0390bf, String str, SafePackageManager safePackageManager) {
        this.f8389a = context;
        this.f8390b = c0390bf;
        this.f8391c = str;
        this.f8392d = safePackageManager;
    }

    public final List a() {
        Signature[] signatureArr;
        String str;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        List<String> g3 = this.f8390b.g();
        boolean isEmpty = g3.isEmpty();
        List<String> list = g3;
        if (isEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    signingInfo = this.f8392d.getPackageInfo(this.f8389a, this.f8391c, 134217728).signingInfo;
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.f8392d.getPackageInfo(this.f8389a, this.f8391c, 64).signatures;
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
                this.f8390b.a(arrayList).b();
                list = arrayList;
            }
        }
        return list;
    }
}
