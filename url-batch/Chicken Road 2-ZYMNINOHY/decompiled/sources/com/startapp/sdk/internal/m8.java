package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.ads.Orientation;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class m8 extends Ad {

    /* renamed from: q, reason: collision with root package name */
    public static String f7256q;

    /* renamed from: a, reason: collision with root package name */
    public String[] f7257a;

    /* renamed from: b, reason: collision with root package name */
    public String f7258b;

    /* renamed from: c, reason: collision with root package name */
    public int f7259c;

    /* renamed from: d, reason: collision with root package name */
    public int f7260d;

    /* renamed from: e, reason: collision with root package name */
    public int f7261e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7262f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f7263g;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f7264h;

    /* renamed from: i, reason: collision with root package name */
    public String[] f7265i;

    /* renamed from: j, reason: collision with root package name */
    public Long f7266j;

    /* renamed from: k, reason: collision with root package name */
    public Long f7267k;

    /* renamed from: l, reason: collision with root package name */
    public int f7268l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7269m;
    public String[] n;
    public Boolean[] o;

    /* renamed from: p, reason: collision with root package name */
    public boolean[] f7270p;

    public m8(Context context, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9) {
        super(context, placement, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
        this.f7257a = new String[]{""};
        this.f7261e = 0;
        this.f7262f = true;
        this.f7263g = new String[]{""};
        this.f7264h = new boolean[]{false};
        this.f7265i = new String[]{""};
        this.f7268l = 0;
        this.f7269m = false;
        this.n = new String[]{""};
        this.o = null;
        this.f7270p = new boolean[]{true};
        if (f7256q == null) {
            f7256q = si.a(getContext());
        }
    }

    public final boolean a(int i4) {
        boolean[] zArr = this.f7270p;
        if (zArr == null || i4 < 0 || i4 >= zArr.length) {
            return true;
        }
        return zArr[i4];
    }

    public final void c(String str) {
        Long l4 = null;
        for (String str2 : str.split(StringUtils.COMMA)) {
            if (!str2.equals("")) {
                try {
                    long parseLong = Long.parseLong(str2);
                    if (parseLong > 0 && (l4 == null || parseLong < l4.longValue())) {
                        l4 = Long.valueOf(parseLong);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (l4 != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l4.longValue()));
        }
    }

    public void d(String str) {
        if (MetaData.E().j0()) {
            try {
                str = E2.a.b(str);
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        this.f7258b = str;
        String a3 = si.a(str, "@smartRedirect@", "@smartRedirect@");
        if (a3 != null) {
            String[] split = a3.split(StringUtils.COMMA);
            this.f7264h = new boolean[split.length];
            for (int i4 = 0; i4 < split.length; i4++) {
                if (split[i4].compareTo("true") == 0) {
                    this.f7264h[i4] = true;
                } else {
                    this.f7264h[i4] = false;
                }
            }
        }
        String a4 = si.a(str, "@trackingClickUrl@", "@trackingClickUrl@");
        if (a4 != null) {
            this.f7263g = a4.split(StringUtils.COMMA);
        }
        String a5 = si.a(str, "@closeUrl@", "@closeUrl@");
        if (a5 != null) {
            this.n = a5.split(StringUtils.COMMA);
        }
        String a6 = si.a(str, "@tracking@", "@tracking@");
        if (a6 != null) {
            this.f7265i = a6.split(StringUtils.COMMA);
        }
        String a7 = si.a(str, "@packageName@", "@packageName@");
        if (a7 != null) {
            this.f7257a = a7.split(StringUtils.COMMA);
        }
        String a8 = si.a(str, "@startappBrowserEnabled@", "@startappBrowserEnabled@");
        if (a8 != null) {
            String[] split2 = a8.split(StringUtils.COMMA);
            this.f7270p = new boolean[split2.length];
            for (int i5 = 0; i5 < split2.length; i5++) {
                if (split2[i5].compareTo("false") == 0) {
                    this.f7270p[i5] = false;
                } else {
                    this.f7270p[i5] = true;
                }
            }
        }
        String a9 = si.a(str, "@orientation@", "@orientation@");
        if (a9 != null) {
            Orientation byName = Orientation.getByName(a9);
            if (byName == Orientation.PORTRAIT) {
                this.f7261e = 1;
            } else if (byName == Orientation.LANDSCAPE) {
                this.f7261e = 2;
            } else {
                this.f7261e = 0;
            }
        }
        String a10 = si.a(str, "@shouldLockOrientation@", "@shouldLockOrientation@");
        if (a10 != null) {
            try {
                this.f7262f = Boolean.parseBoolean(a10);
            } catch (Throwable th2) {
                d9.a(th2);
            }
        }
        String a11 = si.a(str, "@adInfoEnable@", "@adInfoEnable@");
        if (a11 != null) {
            getAdInfoOverride().a(Boolean.parseBoolean(a11));
        }
        String a12 = si.a(str, "@adInfoPosition@", "@adInfoPosition@");
        if (a12 != null) {
            getAdInfoOverride().a(AdInformationPositions.Position.getByName(a12));
        }
        String a13 = si.a(str, "@ttl@", "@ttl@");
        if (a13 != null) {
            c(a13);
        }
        String a14 = si.a(str, "@belowMinCPM@", "@belowMinCPM@");
        if (a14 != null) {
            if (Arrays.asList(a14.split(StringUtils.COMMA)).contains("false")) {
                this.belowMinCPM = false;
            } else {
                this.belowMinCPM = true;
            }
        }
        String a15 = si.a(str, "@delayCloseInterval@", "@delayCloseInterval@");
        if (a15 != null && a15.length() > 0) {
            try {
                this.f7267k = Long.valueOf(Long.parseLong(a15));
            } catch (NumberFormatException unused) {
            }
        }
        String a16 = si.a(str, "@delayImpressionInSeconds@", "@delayImpressionInSeconds@");
        if (a16 != null && a16.length() > 0) {
            try {
                this.f7266j = Long.valueOf(Long.parseLong(a16));
            } catch (NumberFormatException unused2) {
            }
        }
        String a17 = si.a(str, "@rewardDuration@", "@rewardDuration@");
        if (a17 != null) {
            try {
                this.f7268l = Integer.parseInt(a17);
            } catch (Throwable th3) {
                d9.a(th3);
            }
        }
        String a18 = si.a(str, "@rewardedHideTimer@", "@rewardedHideTimer@");
        if (a18 != null) {
            try {
                this.f7269m = Boolean.parseBoolean(a18);
            } catch (Throwable th4) {
                d9.a(th4);
            }
        }
        String a19 = si.a(str, "@sendRedirectHops@", "@sendRedirectHops@");
        if (a19 != null && !a19.equals("")) {
            String[] split3 = a19.split(StringUtils.COMMA);
            this.o = new Boolean[split3.length];
            for (int i6 = 0; i6 < split3.length; i6++) {
                if (split3[i6].compareTo("true") == 0) {
                    this.o[i6] = Boolean.TRUE;
                } else if (split3[i6].compareTo("false") == 0) {
                    this.o[i6] = Boolean.FALSE;
                } else {
                    this.o[i6] = null;
                }
            }
        }
        ConsentData consentData = new ConsentData();
        this.consentData = consentData;
        consentData.b(si.a(str, "@infoDparam@", "@infoDparam@"));
        this.consentData.c(si.a(str, "@infoImpUrl@", "@infoImpUrl@"));
        this.consentData.a(si.a(str, "@infoClickUrl@", "@infoClickUrl@"));
        try {
            String a20 = si.a(str, "@ct@", "@ct@");
            if (!TextUtils.isEmpty(a20)) {
                this.consentData.a(Integer.valueOf(Integer.parseInt(a20)));
            }
        } catch (Throwable th5) {
            d9.a(th5);
        }
        try {
            String a21 = si.a(str, "@tsc@", "@tsc@");
            if (!TextUtils.isEmpty(a21)) {
                this.consentData.a(Long.valueOf(Long.parseLong(a21)));
            }
        } catch (Throwable th6) {
            d9.a(th6);
        }
        try {
            String a22 = si.a(str, "@apc@", "@apc@");
            if (!TextUtils.isEmpty(a22)) {
                this.consentData.a(Boolean.valueOf(Boolean.parseBoolean(a22)));
            }
        } catch (Throwable th7) {
            d9.a(th7);
        }
        int length = this.f7264h.length;
        String[] strArr = this.f7265i;
        if (length < strArr.length) {
            boolean[] zArr = new boolean[strArr.length];
            int i7 = 0;
            while (true) {
                boolean[] zArr2 = this.f7264h;
                if (i7 >= zArr2.length) {
                    break;
                }
                zArr[i7] = zArr2[i7];
                i7++;
            }
            while (i7 < this.f7265i.length) {
                zArr[i7] = false;
                i7++;
            }
            this.f7264h = zArr;
        }
        String a23 = si.a(str, "@erid@", "@erid@");
        if (a23 != null) {
            setErid(a23);
        }
        String a24 = si.a(str, "@eridUrl@", "@eridUrl@");
        if (a24 != null) {
            setEridUrl(a24);
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        return si.a(this.f7258b, "@adId@", "@adId@");
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getDParam() {
        String[] strArr = this.f7263g;
        String[] strArr2 = this.f7265i;
        String str = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            str = strArr2[0];
        }
        return g0.a(str2, str);
    }
}
