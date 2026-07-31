package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public class g7 extends a6<String> {

    /* renamed from: r, reason: collision with root package name */
    private final Object f5473r;

    /* renamed from: s, reason: collision with root package name */
    private final f6<String> f5474s;

    public g7(int i7, String str, f6<String> f6Var, e6 e6Var) {
        super(i7, str, e6Var);
        this.f5473r = new Object();
        this.f5474s = f6Var;
    }

    protected void A(String str) {
        f6<String> f6Var;
        synchronized (this.f5473r) {
            f6Var = this.f5474s;
        }
        f6Var.c(str);
    }

    @Override // com.google.android.gms.internal.ads.a6
    protected final g6<String> i(w5 w5Var) {
        String str;
        String str2;
        try {
            byte[] bArr = w5Var.f13717b;
            Map<String, String> map = w5Var.f13718c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i7 = 1;
                while (true) {
                    if (i7 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i7].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i7++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(w5Var.f13717b);
        }
        return g6.b(str, y6.b(w5Var));
    }
}
