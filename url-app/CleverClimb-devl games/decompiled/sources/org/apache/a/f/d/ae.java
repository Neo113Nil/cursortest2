package org.apache.a.f.d;

import java.util.StringTokenizer;

/* compiled from: RFC2965PortAttributeHandler.java */
/* loaded from: classes2.dex */
public class ae implements org.apache.a.d.c {
    private static int[] a(String str) throws org.apache.a.d.k {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken().trim());
                if (iArr[i] < 0) {
                    throw new org.apache.a.d.k("Invalid Port attribute.");
                }
                i++;
            } catch (NumberFormatException e) {
                throw new org.apache.a.d.k("Invalid Port attribute: " + e.getMessage());
            }
        }
        return iArr;
    }

    private static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.l lVar, String str) throws org.apache.a.d.k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (lVar instanceof org.apache.a.d.m) {
            org.apache.a.d.m mVar = (org.apache.a.d.m) lVar;
            if (str == null || str.trim().length() <= 0) {
                return;
            }
            mVar.a(a(str));
        }
    }

    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        int c2 = eVar.c();
        if ((bVar instanceof org.apache.a.d.a) && ((org.apache.a.d.a) bVar).b("port") && !a(c2, bVar.e())) {
            throw new org.apache.a.d.g("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }

    @Override // org.apache.a.d.c
    public boolean b(org.apache.a.d.b bVar, org.apache.a.d.e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        int c2 = eVar.c();
        if ((bVar instanceof org.apache.a.d.a) && ((org.apache.a.d.a) bVar).b("port")) {
            return bVar.e() != null && a(c2, bVar.e());
        }
        return true;
    }
}
