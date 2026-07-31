package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class gh {

    /* renamed from: c, reason: collision with root package name */
    public static final rj f5642c = new fh();

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f5643d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f5644a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f5645b = -1;

    public final boolean a() {
        return (this.f5644a == -1 || this.f5645b == -1) ? false : true;
    }

    public final boolean b(mj mjVar) {
        for (int i7 = 0; i7 < mjVar.a(); i7++) {
            lj c7 = mjVar.c(i7);
            if (c7 instanceof qj) {
                qj qjVar = (qj) c7;
                String str = qjVar.f10713h;
                String str2 = qjVar.f10714i;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = f5643d.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.f5644a = parseInt;
                                this.f5645b = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }
}
