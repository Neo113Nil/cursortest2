package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class Vf {
    public static final String a(C0642l9 c0642l9) {
        String str;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i3 = c0642l9.f7801c;
        String str2 = c0642l9.f7802d;
        byte[] bArr = c0642l9.f7803e;
        if (i3 == 1) {
            str = "Attribution";
        } else if (i3 == 2) {
            str = "Session start";
        } else if (i3 == 4) {
            if (str2 == null) {
                str2 = "null";
            }
            StringBuilder sb2 = new StringBuilder(str2);
            if (bArr != null) {
                String str3 = new String(bArr, s2.a.f10316a);
                if (!TextUtils.isEmpty(str3)) {
                    sb2.append(" with value ");
                    sb2.append(str3);
                }
            }
            str = sb2.toString();
        } else if (i3 == 5) {
            str = "Referrer";
        } else if (i3 == 7) {
            str = "Session heartbeat";
        } else if (i3 == 13) {
            str = "The very first event";
        } else if (i3 == 35) {
            str = "E-Commerce";
        } else if (i3 == 40) {
            str = "Ad revenue (ILRD)";
        } else if (i3 == 42) {
            str = "External attribution";
        } else if (i3 == 16) {
            str = "Open";
        } else if (i3 == 17) {
            str = "Update";
        } else if (i3 == 20) {
            str = "User profile update";
        } else if (i3 != 21) {
            switch (i3) {
                case C0642l9.f7780F /* 25 */:
                    str = "ANR";
                    break;
                case C0642l9.f7781G /* 26 */:
                    str = AbstractC0033i.j("Crash: ", str2);
                    break;
                case C0642l9.f7782H /* 27 */:
                    str = AbstractC0033i.j("Error: ", str2);
                    break;
                default:
                    str = AbstractC0033i.h(i3, "type=");
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String a(String str, EnumC0567ib enumC0567ib, String str2, String str3) {
        if (!D9.f5889d.contains(EnumC0567ib.a(enumC0567ib.f7560a))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(enumC0567ib.name());
        if (D9.f.contains(enumC0567ib) && !TextUtils.isEmpty(str2)) {
            sb.append(" with name ");
            sb.append(str2);
        }
        if (D9.f5890e.contains(enumC0567ib) && !TextUtils.isEmpty(str3)) {
            sb.append(" with value ");
            sb.append(str3);
        }
        return sb.toString();
    }
}
