package org.apache.a.h;

import org.apache.a.aa;
import org.apache.a.ad;
import org.apache.a.y;

/* compiled from: BasicLineParser.java */
/* loaded from: classes2.dex */
public class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final j f9954a = new j();

    /* renamed from: b, reason: collision with root package name */
    protected final aa f9955b;

    public j(aa aaVar) {
        this.f9955b = aaVar == null ? org.apache.a.u.f10004c : aaVar;
    }

    public j() {
        this(null);
    }

    public aa a(org.apache.a.k.b bVar, u uVar) throws y {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        String a2 = this.f9955b.a();
        int length = a2.length();
        int b2 = uVar.b();
        int a3 = uVar.a();
        d(bVar, uVar);
        int b3 = uVar.b();
        int i = b3 + length;
        if (i + 4 > a3) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Not a valid protocol version: ");
            stringBuffer.append(bVar.a(b2, a3));
            throw new y(stringBuffer.toString());
        }
        boolean z = true;
        for (int i2 = 0; z && i2 < length; i2++) {
            z = bVar.a(b3 + i2) == a2.charAt(i2);
        }
        if (z) {
            z = bVar.a(i) == '/';
        }
        if (!z) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Not a valid protocol version: ");
            stringBuffer2.append(bVar.a(b2, a3));
            throw new y(stringBuffer2.toString());
        }
        int i3 = b3 + length + 1;
        int a4 = bVar.a(46, i3, a3);
        if (a4 == -1) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Invalid protocol version number: ");
            stringBuffer3.append(bVar.a(b2, a3));
            throw new y(stringBuffer3.toString());
        }
        try {
            int parseInt = Integer.parseInt(bVar.b(i3, a4));
            int i4 = a4 + 1;
            int a5 = bVar.a(32, i4, a3);
            if (a5 == -1) {
                a5 = a3;
            }
            try {
                int parseInt2 = Integer.parseInt(bVar.b(i4, a5));
                uVar.a(a5);
                return a(parseInt, parseInt2);
            } catch (NumberFormatException unused) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Invalid protocol minor version number: ");
                stringBuffer4.append(bVar.a(b2, a3));
                throw new y(stringBuffer4.toString());
            }
        } catch (NumberFormatException unused2) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("Invalid protocol major version number: ");
            stringBuffer5.append(bVar.a(b2, a3));
            throw new y(stringBuffer5.toString());
        }
    }

    protected aa a(int i, int i2) {
        return this.f9955b.a(i, i2);
    }

    @Override // org.apache.a.h.t
    public boolean b(org.apache.a.k.b bVar, u uVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        int b2 = uVar.b();
        String a2 = this.f9955b.a();
        int length = a2.length();
        if (bVar.c() < length + 4) {
            return false;
        }
        if (b2 < 0) {
            b2 = (bVar.c() - 4) - length;
        } else if (b2 == 0) {
            while (b2 < bVar.c() && org.apache.a.j.d.a(bVar.a(b2))) {
                b2++;
            }
        }
        int i = b2 + length;
        if (i + 4 > bVar.c()) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; z && i2 < length; i2++) {
            z = bVar.a(b2 + i2) == a2.charAt(i2);
        }
        return z ? bVar.a(i) == '/' : z;
    }

    @Override // org.apache.a.h.t
    public ad c(org.apache.a.k.b bVar, u uVar) throws y {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
        int b2 = uVar.b();
        int a2 = uVar.a();
        try {
            aa a3 = a(bVar, uVar);
            d(bVar, uVar);
            int b3 = uVar.b();
            int a4 = bVar.a(32, b3, a2);
            if (a4 < 0) {
                a4 = a2;
            }
            String b4 = bVar.b(b3, a4);
            for (int i = 0; i < b4.length(); i++) {
                if (!Character.isDigit(b4.charAt(i))) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Status line contains invalid status code: ");
                    stringBuffer.append(bVar.a(b2, a2));
                    throw new y(stringBuffer.toString());
                }
            }
            try {
                return a(a3, Integer.parseInt(b4), a4 < a2 ? bVar.b(a4, a2) : "");
            } catch (NumberFormatException unused) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Status line contains invalid status code: ");
                stringBuffer2.append(bVar.a(b2, a2));
                throw new y(stringBuffer2.toString());
            }
        } catch (IndexOutOfBoundsException unused2) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Invalid status line: ");
            stringBuffer3.append(bVar.a(b2, a2));
            throw new y(stringBuffer3.toString());
        }
    }

    protected ad a(aa aaVar, int i, String str) {
        return new n(aaVar, i, str);
    }

    @Override // org.apache.a.h.t
    public org.apache.a.d a(org.apache.a.k.b bVar) throws y {
        return new p(bVar);
    }

    protected void d(org.apache.a.k.b bVar, u uVar) {
        int b2 = uVar.b();
        int a2 = uVar.a();
        while (b2 < a2 && org.apache.a.j.d.a(bVar.a(b2))) {
            b2++;
        }
        uVar.a(b2);
    }
}
