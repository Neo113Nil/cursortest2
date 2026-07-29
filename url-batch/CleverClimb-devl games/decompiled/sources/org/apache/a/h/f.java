package org.apache.a.h;

import java.util.ArrayList;
import org.apache.a.w;
import org.apache.a.y;

/* compiled from: BasicHeaderValueParser.java */
/* loaded from: classes2.dex */
public class f implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final f f9944a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f9945b = {';', ','};

    public static final org.apache.a.e[] a(String str, r rVar) throws y {
        if (str == null) {
            throw new IllegalArgumentException("Value to parse may not be null");
        }
        if (rVar == null) {
            rVar = f9944a;
        }
        org.apache.a.k.b bVar = new org.apache.a.k.b(str.length());
        bVar.a(str);
        return rVar.a(bVar, new u(0, str.length()));
    }

    @Override // org.apache.a.h.r
    public org.apache.a.e[] a(org.apache.a.k.b bVar, u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        ArrayList arrayList = new ArrayList();
        while (!uVar.c()) {
            org.apache.a.e b2 = b(bVar, uVar);
            if (b2.a().length() != 0 || b2.b() != null) {
                arrayList.add(b2);
            }
        }
        return (org.apache.a.e[]) arrayList.toArray(new org.apache.a.e[arrayList.size()]);
    }

    @Override // org.apache.a.h.r
    public org.apache.a.e b(org.apache.a.k.b bVar, u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        w d2 = d(bVar, uVar);
        w[] wVarArr = null;
        if (!uVar.c() && bVar.a(uVar.b() - 1) != ',') {
            wVarArr = c(bVar, uVar);
        }
        return a(d2.a(), d2.b(), wVarArr);
    }

    protected org.apache.a.e a(String str, String str2, w[] wVarArr) {
        return new c(str, str2, wVarArr);
    }

    public w[] c(org.apache.a.k.b bVar, u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        int b2 = uVar.b();
        int a2 = uVar.a();
        while (b2 < a2 && org.apache.a.j.d.a(bVar.a(b2))) {
            b2++;
        }
        uVar.a(b2);
        if (uVar.c()) {
            return new w[0];
        }
        ArrayList arrayList = new ArrayList();
        while (!uVar.c()) {
            arrayList.add(d(bVar, uVar));
            if (bVar.a(uVar.b() - 1) == ',') {
                break;
            }
        }
        return (w[]) arrayList.toArray(new w[arrayList.size()]);
    }

    public w d(org.apache.a.k.b bVar, u uVar) {
        return a(bVar, uVar, f9945b);
    }

    private static boolean a(char c2, char[] cArr) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c2 == c3) {
                    return true;
                }
            }
        }
        return false;
    }

    public w a(org.apache.a.k.b bVar, u uVar, char[] cArr) {
        boolean z;
        boolean z2;
        String b2;
        char a2;
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        int b3 = uVar.b();
        int b4 = uVar.b();
        int a3 = uVar.a();
        while (true) {
            z = true;
            if (b3 >= a3 || (a2 = bVar.a(b3)) == '=') {
                break;
            }
            if (a(a2, cArr)) {
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
            return a(b2, (String) null);
        }
        int i = b3;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (i >= a3) {
                z = z2;
                break;
            }
            char a4 = bVar.a(i);
            if (a4 == '\"' && !z3) {
                z4 = !z4;
            }
            if (!z4 && !z3 && a(a4, cArr)) {
                break;
            }
            z3 = !z3 && z4 && a4 == '\\';
            i++;
        }
        while (b3 < i && org.apache.a.j.d.a(bVar.a(b3))) {
            b3++;
        }
        int i2 = i;
        while (i2 > b3 && org.apache.a.j.d.a(bVar.a(i2 - 1))) {
            i2--;
        }
        if (i2 - b3 >= 2 && bVar.a(b3) == '\"' && bVar.a(i2 - 1) == '\"') {
            b3++;
            i2--;
        }
        String a5 = bVar.a(b3, i2);
        if (z) {
            i++;
        }
        uVar.a(i);
        return a(b2, a5);
    }

    protected w a(String str, String str2) {
        return new l(str, str2);
    }
}
