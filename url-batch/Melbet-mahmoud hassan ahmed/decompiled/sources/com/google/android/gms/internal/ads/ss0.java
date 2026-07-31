package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
final class ss0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f11948f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f11949g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f11950h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f11951i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ ts0 f11952j;

    ss0(ts0 ts0Var, String str, String str2, String str3, String str4) {
        this.f11952j = ts0Var;
        this.f11948f = str;
        this.f11949g = str2;
        this.f11950h = str3;
        this.f11951i = str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c7;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f11948f);
        if (!TextUtils.isEmpty(this.f11949g)) {
            hashMap.put("cachedSrc", this.f11949g);
        }
        String str = this.f11950h;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c7 = 11;
                    break;
                }
                c7 = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c7 = '\n';
                    break;
                }
                c7 = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        String str2 = "internal";
        switch (c7) {
            case 6:
            case c4.w0.f2149o /* 7 */:
                str2 = "io";
                break;
            case c4.w0.f2150p /* 8 */:
            case '\t':
                str2 = "network";
                break;
            case '\n':
            case 11:
                str2 = "policy";
                break;
        }
        hashMap.put("type", str2);
        hashMap.put("reason", this.f11950h);
        if (!TextUtils.isEmpty(this.f11951i)) {
            hashMap.put("message", this.f11951i);
        }
        ts0.f(this.f11952j, "onPrecacheEvent", hashMap);
    }
}
