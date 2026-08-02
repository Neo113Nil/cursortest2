package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import android.text.TextUtils;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public abstract class Qf {
    public static final String a(C0583e9 c0583e9) {
        String str;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i4 = c0583e9.f11767c;
        String str2 = c0583e9.f11768d;
        byte[] bArr = c0583e9.f11769e;
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
                String str3 = new String(bArr, AbstractC1504a.f15936a);
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
                    str = AbstractC0005f.n("Crash: ", str2);
                    break;
                case 27:
                    str = AbstractC0005f.n("Error: ", str2);
                    break;
                default:
                    str = AbstractC0005f.j(i4, "type=");
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String a(String str, EnumC0508bb enumC0508bb, String str2, String str3) {
        if (!AbstractC1049w9.f12927d.contains(EnumC0508bb.a(enumC0508bb.f11531a))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(enumC0508bb.name());
        if (AbstractC1049w9.f12929f.contains(enumC0508bb) && !TextUtils.isEmpty(str2)) {
            sb.append(" with name ");
            sb.append(str2);
        }
        if (AbstractC1049w9.f12928e.contains(enumC0508bb) && !TextUtils.isEmpty(str3)) {
            sb.append(" with value ");
            sb.append(str3);
        }
        return sb.toString();
    }
}
