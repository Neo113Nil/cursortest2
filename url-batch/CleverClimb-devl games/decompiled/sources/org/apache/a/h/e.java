package org.apache.a.h;

import org.apache.a.w;

/* compiled from: BasicHeaderValueFormatter.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f9943a = new e();

    public org.apache.a.k.b a(org.apache.a.k.b bVar, w wVar, boolean z) {
        if (wVar == null) {
            throw new IllegalArgumentException("NameValuePair must not be null.");
        }
        int a2 = a(wVar);
        if (bVar == null) {
            bVar = new org.apache.a.k.b(a2);
        } else {
            bVar.b(a2);
        }
        bVar.a(wVar.a());
        String b2 = wVar.b();
        if (b2 != null) {
            bVar.a('=');
            a(bVar, b2, z);
        }
        return bVar;
    }

    protected int a(w wVar) {
        if (wVar == null) {
            return 0;
        }
        int length = wVar.a().length();
        String b2 = wVar.b();
        return b2 != null ? length + b2.length() + 3 : length;
    }

    protected void a(org.apache.a.k.b bVar, String str, boolean z) {
        if (!z) {
            boolean z2 = z;
            for (int i = 0; i < str.length() && !z2; i++) {
                z2 = a(str.charAt(i));
            }
            z = z2;
        }
        if (z) {
            bVar.a('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (b(charAt)) {
                bVar.a('\\');
            }
            bVar.a(charAt);
        }
        if (z) {
            bVar.a('\"');
        }
    }

    protected boolean a(char c2) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c2) >= 0;
    }

    protected boolean b(char c2) {
        return "\"\\".indexOf(c2) >= 0;
    }
}
