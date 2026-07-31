package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class fd4 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f5091c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f5092a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f5093b = -1;

    private final boolean c(String str) {
        Matcher matcher = f5091c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i7 = n13.f8865a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f5092a = parseInt;
            this.f5093b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.f5092a == -1 || this.f5093b == -1) ? false : true;
    }

    public final boolean b(c91 c91Var) {
        for (int i7 = 0; i7 < c91Var.a(); i7++) {
            b81 c7 = c91Var.c(i7);
            if (c7 instanceof pf4) {
                pf4 pf4Var = (pf4) c7;
                if ("iTunSMPB".equals(pf4Var.f10231h) && c(pf4Var.f10232i)) {
                    return true;
                }
            } else if (c7 instanceof yf4) {
                yf4 yf4Var = (yf4) c7;
                if ("com.apple.iTunes".equals(yf4Var.f14671g) && "iTunSMPB".equals(yf4Var.f14672h) && c(yf4Var.f14673i)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
