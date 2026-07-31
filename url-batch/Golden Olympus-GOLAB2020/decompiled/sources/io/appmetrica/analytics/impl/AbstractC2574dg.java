package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2574dg {
    public static final String a(C3139z9 c3139z9) {
        String str;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i4 = c3139z9.f40353c;
        String str2 = c3139z9.f40354d;
        byte[] bArr = c3139z9.f40355e;
        if (i4 == 1) {
            str = "Attribution";
        } else if (i4 == 2) {
            str = "Session start";
        } else if (i4 == 4) {
            if (str2 == null) {
                str2 = "null";
            }
            StringBuilder sb2 = new StringBuilder(str2);
            if (bArr != null) {
                String str3 = new String(bArr, Charsets.UTF_8);
                if (!TextUtils.isEmpty(str3)) {
                    sb2.append(" with value ");
                    sb2.append(str3);
                }
            }
            str = sb2.toString();
        } else if (i4 == 5) {
            str = "Referrer";
        } else if (i4 == 7) {
            str = "Session heartbeat";
        } else if (i4 == 13) {
            str = "The very first event";
        } else if (i4 == 35) {
            str = "E-Commerce";
        } else if (i4 == 40) {
            str = "Ad revenue (ILRD)";
        } else if (i4 == 42) {
            str = "External attribution";
        } else if (i4 == 16) {
            str = "Open";
        } else if (i4 == 17) {
            str = "Update";
        } else if (i4 == 20) {
            str = "User profile update";
        } else if (i4 != 21) {
            switch (i4) {
                case 25:
                    str = "ANR";
                    break;
                case 26:
                    str = "Crash: " + str2;
                    break;
                case 27:
                    str = "Error: " + str2;
                    break;
                default:
                    str = "type=" + i4;
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String a(String str, EnumC3063wb enumC3063wb, String str2, String str3) {
        if (!R9.f38189d.contains(EnumC3063wb.a(enumC3063wb.f40073a))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(enumC3063wb.name());
        if (R9.f38191f.contains(enumC3063wb) && !TextUtils.isEmpty(str2)) {
            sb.append(" with name ");
            sb.append(str2);
        }
        if (R9.f38190e.contains(enumC3063wb) && !TextUtils.isEmpty(str3)) {
            sb.append(" with value ");
            sb.append(str3);
        }
        return sb.toString();
    }
}
