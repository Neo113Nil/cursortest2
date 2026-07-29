package com.tapjoy.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class cu {

    /* renamed from: a, reason: collision with root package name */
    public final cx f7898a;

    /* renamed from: d, reason: collision with root package name */
    final String f7901d;
    public final String e;
    public final cv f;

    /* renamed from: c, reason: collision with root package name */
    public final List f7900c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    final WebView f7899b = null;

    private cu(cx cxVar, String str, List list, String str2) {
        cv cvVar;
        this.f7898a = cxVar;
        this.f7901d = str;
        if (list != null) {
            this.f7900c.addAll(list);
            cvVar = cv.NATIVE;
        } else {
            cvVar = cv.HTML;
        }
        this.f = cvVar;
        this.e = str2;
    }

    public static cu a(cx cxVar, String str, List list, String str2) {
        dp.a(cxVar, "Partner is null");
        dp.a((Object) str, "OMID JS script content is null");
        dp.a(list, "VerificationScriptResources is null");
        if (str2.length() <= 256) {
            return new cu(cxVar, str, list, str2);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }
}
