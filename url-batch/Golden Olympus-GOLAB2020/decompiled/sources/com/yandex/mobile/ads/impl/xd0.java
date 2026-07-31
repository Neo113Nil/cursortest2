package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wz0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class xd0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f34516c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f34517a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f34518b = -1;

    public final void a(wz0 wz0Var) {
        for (int i4 = 0; i4 < wz0Var.c(); i4++) {
            wz0.b a4 = wz0Var.a(i4);
            if (a4 instanceof gq) {
                gq gqVar = (gq) a4;
                if ("iTunSMPB".equals(gqVar.f26268d) && a(gqVar.f26269e)) {
                    return;
                }
            } else if (a4 instanceof yo0) {
                yo0 yo0Var = (yo0) a4;
                if ("com.apple.iTunes".equals(yo0Var.f35273c) && "iTunSMPB".equals(yo0Var.f35274d) && a(yo0Var.f35275e)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    private boolean a(String str) {
        Matcher matcher = f34516c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i4 = u82.f32873a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f34517a = parseInt;
            this.f34518b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
