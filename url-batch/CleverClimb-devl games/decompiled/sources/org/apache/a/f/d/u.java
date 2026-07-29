package org.apache.a.f.d;

import java.util.ArrayList;

/* compiled from: NetscapeDraftHeaderParser.java */
/* loaded from: classes2.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f9879a = new u();

    public org.apache.a.e a(org.apache.a.k.b bVar, org.apache.a.h.u uVar) throws org.apache.a.y {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        org.apache.a.w b2 = b(bVar, uVar);
        ArrayList arrayList = new ArrayList();
        while (!uVar.c()) {
            arrayList.add(b(bVar, uVar));
        }
        return new org.apache.a.h.c(b2.a(), b2.b(), (org.apache.a.w[]) arrayList.toArray(new org.apache.a.w[arrayList.size()]));
    }

    private org.apache.a.w b(org.apache.a.k.b bVar, org.apache.a.h.u uVar) {
        boolean z;
        boolean z2;
        String b2;
        char a2;
        int b3 = uVar.b();
        int b4 = uVar.b();
        int a3 = uVar.a();
        while (true) {
            z = true;
            if (b3 >= a3 || (a2 = bVar.a(b3)) == '=') {
                break;
            }
            if (a2 == ';') {
                z2 = true;
                break;
            }
            b3++;
        }
        z2 = false;
        if (b3 == a3) {
            b2 = bVar.b(b4, a3);
            z2 = true;
        } else {
            b2 = bVar.b(b4, b3);
            b3++;
        }
        if (z2) {
            uVar.a(b3);
            return new org.apache.a.h.l(b2, null);
        }
        int i = b3;
        while (true) {
            if (i >= a3) {
                z = z2;
                break;
            }
            if (bVar.a(i) == ';') {
                break;
            }
            i++;
        }
        while (b3 < i && org.apache.a.j.d.a(bVar.a(b3))) {
            b3++;
        }
        int i2 = i;
        while (i2 > b3 && org.apache.a.j.d.a(bVar.a(i2 - 1))) {
            i2--;
        }
        String a4 = bVar.a(b3, i2);
        if (z) {
            i++;
        }
        uVar.a(i);
        return new org.apache.a.h.l(b2, a4);
    }
}
