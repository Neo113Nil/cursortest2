package org.apache.a.f.d;

import java.util.Date;

/* compiled from: BasicMaxAgeHandler.java */
/* loaded from: classes2.dex */
public class h extends a {
    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.l lVar, String str) throws org.apache.a.d.k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (str == null) {
            throw new org.apache.a.d.k("Missing value for max-age attribute");
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 0) {
                throw new org.apache.a.d.k("Negative max-age attribute: " + str);
            }
            lVar.b(new Date(System.currentTimeMillis() + (parseInt * 1000)));
        } catch (NumberFormatException unused) {
            throw new org.apache.a.d.k("Invalid max-age attribute: " + str);
        }
    }
}
