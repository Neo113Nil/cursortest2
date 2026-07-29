package org.apache.a.h;

import java.util.NoSuchElementException;
import org.apache.a.ae;
import org.apache.a.y;

/* compiled from: BasicTokenIterator.java */
/* loaded from: classes2.dex */
public class o implements ae {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.g f9968a;

    /* renamed from: b, reason: collision with root package name */
    protected String f9969b;

    /* renamed from: c, reason: collision with root package name */
    protected String f9970c;

    /* renamed from: d, reason: collision with root package name */
    protected int f9971d;

    protected boolean a(char c2) {
        return c2 == ',';
    }

    public o(org.apache.a.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Header iterator must not be null.");
        }
        this.f9968a = gVar;
        this.f9971d = a(-1);
    }

    @Override // org.apache.a.ae, java.util.Iterator
    public boolean hasNext() {
        return this.f9970c != null;
    }

    @Override // org.apache.a.ae
    public String a() throws NoSuchElementException, y {
        if (this.f9970c == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        String str = this.f9970c;
        this.f9971d = a(this.f9971d);
        return str;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException, y {
        return a();
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }

    protected int a(int i) throws y {
        int c2;
        if (i < 0) {
            if (!this.f9968a.hasNext()) {
                return -1;
            }
            this.f9969b = this.f9968a.a().d();
            c2 = 0;
        } else {
            c2 = c(i);
        }
        int b2 = b(c2);
        if (b2 < 0) {
            this.f9970c = null;
            return -1;
        }
        int d2 = d(b2);
        this.f9970c = a(this.f9969b, b2, d2);
        return d2;
    }

    protected String a(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    protected int b(int i) {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Search position must not be negative: ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        int i2 = i;
        boolean z = false;
        while (!z && this.f9969b != null) {
            int length = this.f9969b.length();
            while (!z && i2 < length) {
                char charAt = this.f9969b.charAt(i2);
                if (a(charAt) || b(charAt)) {
                    i2++;
                } else {
                    if (!c(this.f9969b.charAt(i2))) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Invalid character before token (pos ");
                        stringBuffer2.append(i2);
                        stringBuffer2.append("): ");
                        stringBuffer2.append(this.f9969b);
                        throw new y(stringBuffer2.toString());
                    }
                    z = true;
                }
            }
            if (!z) {
                if (this.f9968a.hasNext()) {
                    this.f9969b = this.f9968a.a().d();
                    i2 = 0;
                } else {
                    this.f9969b = null;
                }
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    protected int c(int i) {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Search position must not be negative: ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        boolean z = false;
        int length = this.f9969b.length();
        while (!z && i < length) {
            char charAt = this.f9969b.charAt(i);
            if (a(charAt)) {
                z = true;
            } else {
                if (!b(charAt)) {
                    if (c(charAt)) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Tokens without separator (pos ");
                        stringBuffer2.append(i);
                        stringBuffer2.append("): ");
                        stringBuffer2.append(this.f9969b);
                        throw new y(stringBuffer2.toString());
                    }
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("Invalid character after token (pos ");
                    stringBuffer3.append(i);
                    stringBuffer3.append("): ");
                    stringBuffer3.append(this.f9969b);
                    throw new y(stringBuffer3.toString());
                }
                i++;
            }
        }
        return i;
    }

    protected int d(int i) {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Token start position must not be negative: ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        int length = this.f9969b.length();
        int i2 = i + 1;
        while (i2 < length && c(this.f9969b.charAt(i2))) {
            i2++;
        }
        return i2;
    }

    protected boolean b(char c2) {
        return c2 == '\t' || Character.isSpaceChar(c2);
    }

    protected boolean c(char c2) {
        if (Character.isLetterOrDigit(c2)) {
            return true;
        }
        return (Character.isISOControl(c2) || d(c2)) ? false : true;
    }

    protected boolean d(char c2) {
        return " ,;=()<>@:\\\"/[]?{}\t".indexOf(c2) >= 0;
    }
}
