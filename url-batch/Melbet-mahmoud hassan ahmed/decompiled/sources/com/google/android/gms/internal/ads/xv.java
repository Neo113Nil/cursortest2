package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class xv {

    /* renamed from: a, reason: collision with root package name */
    private final r2.h[] f14360a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14361b;

    public xv(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, r2.t.f21168a);
        String string = obtainAttributes.getString(r2.t.f21169b);
        String string2 = obtainAttributes.getString(r2.t.f21170c);
        boolean z6 = !TextUtils.isEmpty(string);
        boolean z7 = !TextUtils.isEmpty(string2);
        if (z6 && !z7) {
            this.f14360a = c(string);
        } else {
            if (z6 || !z7) {
                obtainAttributes.recycle();
                if (!z6) {
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f14360a = c(string2);
        }
        String string3 = obtainAttributes.getString(r2.t.f21171d);
        this.f14361b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static r2.h[] c(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        r2.h[] hVarArr = new r2.h[length];
        for (int i7 = 0; i7 < split.length; i7++) {
            String trim = split[i7].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    hVarArr[i7] = new r2.h("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(trim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(trim) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                hVarArr[i7] = r2.h.f21142i;
            } else if ("LARGE_BANNER".equals(trim)) {
                hVarArr[i7] = r2.h.f21144k;
            } else if ("FULL_BANNER".equals(trim)) {
                hVarArr[i7] = r2.h.f21143j;
            } else if ("LEADERBOARD".equals(trim)) {
                hVarArr[i7] = r2.h.f21145l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                hVarArr[i7] = r2.h.f21146m;
            } else if ("SMART_BANNER".equals(trim)) {
                hVarArr[i7] = r2.h.f21148o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                hVarArr[i7] = r2.h.f21147n;
            } else if ("FLUID".equals(trim)) {
                hVarArr[i7] = r2.h.f21149p;
            } else {
                if (!"ICON".equals(trim)) {
                    throw new IllegalArgumentException(trim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(trim) : new String("Could not parse XML attribute \"adSize\": "));
                }
                hVarArr[i7] = r2.h.f21152s;
            }
        }
        if (length == 0) {
            throw new IllegalArgumentException(str.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(str) : new String("Could not parse XML attribute \"adSize\": "));
        }
        return hVarArr;
    }

    public final String a() {
        return this.f14361b;
    }

    public final r2.h[] b(boolean z6) {
        if (z6 || this.f14360a.length == 1) {
            return this.f14360a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
