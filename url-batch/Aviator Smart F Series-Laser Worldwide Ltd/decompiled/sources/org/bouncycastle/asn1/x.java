package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;
import org.bouncycastle.util.a;

/* loaded from: classes5.dex */
public abstract class x extends s implements org.bouncycastle.util.f {
    protected final f[] elements;
    protected final boolean isSorted;

    class a implements Enumeration {
        private int pos = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.pos < x.this.elements.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.pos;
            f[] fVarArr = x.this.elements;
            if (i8 >= fVarArr.length) {
                throw new NoSuchElementException();
            }
            this.pos = i8 + 1;
            return fVarArr[i8];
        }
    }

    class b implements y {
        private int pos = 0;
        final /* synthetic */ int val$count;

        b(int i8) {
            this.val$count = i8;
        }

        @Override // org.bouncycastle.asn1.y, org.bouncycastle.asn1.b2
        public s getLoadedObject() {
            return x.this;
        }

        @Override // org.bouncycastle.asn1.y
        public f readObject() {
            int i8 = this.val$count;
            int i9 = this.pos;
            if (i8 == i9) {
                return null;
            }
            f[] fVarArr = x.this.elements;
            this.pos = i9 + 1;
            f fVar = fVarArr[i9];
            return fVar instanceof v ? ((v) fVar).parser() : fVar instanceof x ? ((x) fVar).parser() : fVar;
        }

        @Override // org.bouncycastle.asn1.y, org.bouncycastle.asn1.f
        public s toASN1Primitive() {
            return x.this;
        }
    }

    protected x() {
        this.elements = g.EMPTY_ELEMENTS;
        this.isSorted = true;
    }

    private static byte[] getDEREncoded(f fVar) {
        try {
            return fVar.toASN1Primitive().getEncoded("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static x getInstance(Object obj) {
        if (obj == null || (obj instanceof x)) {
            return (x) obj;
        }
        if (obj instanceof y) {
            return getInstance(((y) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(s.fromByteArray((byte[]) obj));
            } catch (IOException e8) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e8.getMessage());
            }
        }
        if (obj instanceof f) {
            s aSN1Primitive = ((f) obj).toASN1Primitive();
            if (aSN1Primitive instanceof x) {
                return (x) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    private static boolean lessThanOrEqual(byte[] bArr, byte[] bArr2) {
        int i8 = bArr[0] & (-33);
        int i9 = bArr2[0] & (-33);
        if (i8 != i9) {
            return i8 < i9;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i10 = 1; i10 < min; i10++) {
            byte b8 = bArr[i10];
            byte b9 = bArr2[i10];
            if (b8 != b9) {
                return (b8 & 255) < (b9 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    private static void sort(f[] fVarArr) {
        int i8;
        int length = fVarArr.length;
        if (length < 2) {
            return;
        }
        f fVar = fVarArr[0];
        f fVar2 = fVarArr[1];
        byte[] dEREncoded = getDEREncoded(fVar);
        byte[] dEREncoded2 = getDEREncoded(fVar2);
        if (lessThanOrEqual(dEREncoded2, dEREncoded)) {
            fVar2 = fVar;
            fVar = fVar2;
            dEREncoded2 = dEREncoded;
            dEREncoded = dEREncoded2;
        }
        for (int i9 = 2; i9 < length; i9++) {
            f fVar3 = fVarArr[i9];
            byte[] dEREncoded3 = getDEREncoded(fVar3);
            if (lessThanOrEqual(dEREncoded2, dEREncoded3)) {
                fVarArr[i9 - 2] = fVar;
                fVar = fVar2;
                dEREncoded = dEREncoded2;
                fVar2 = fVar3;
                dEREncoded2 = dEREncoded3;
            } else if (lessThanOrEqual(dEREncoded, dEREncoded3)) {
                fVarArr[i9 - 2] = fVar;
                fVar = fVar3;
                dEREncoded = dEREncoded3;
            } else {
                int i10 = i9 - 1;
                while (true) {
                    i8 = i10 - 1;
                    if (i8 <= 0) {
                        break;
                    }
                    f fVar4 = fVarArr[i10 - 2];
                    if (lessThanOrEqual(getDEREncoded(fVar4), dEREncoded3)) {
                        break;
                    }
                    fVarArr[i8] = fVar4;
                    i10 = i8;
                }
                fVarArr[i8] = fVar3;
            }
        }
        fVarArr[length - 2] = fVar;
        fVarArr[length - 1] = fVar2;
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (!(sVar instanceof x)) {
            return false;
        }
        x xVar = (x) sVar;
        int size = size();
        if (xVar.size() != size) {
            return false;
        }
        h1 h1Var = (h1) toDERObject();
        h1 h1Var2 = (h1) xVar.toDERObject();
        for (int i8 = 0; i8 < size; i8++) {
            s aSN1Primitive = h1Var.elements[i8].toASN1Primitive();
            s aSN1Primitive2 = h1Var2.elements[i8].toASN1Primitive();
            if (aSN1Primitive != aSN1Primitive2 && !aSN1Primitive.asn1Equals(aSN1Primitive2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.s
    abstract void encode(r rVar, boolean z7);

    public f getObjectAt(int i8) {
        return this.elements[i8];
    }

    public Enumeration getObjects() {
        return new a();
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        int length = this.elements.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i8;
            }
            i8 += this.elements[length].toASN1Primitive().hashCode();
        }
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return true;
    }

    @Override // org.bouncycastle.util.f, java.lang.Iterable
    public Iterator<f> iterator() {
        return new a.C0396a(toArray());
    }

    public y parser() {
        return new b(size());
    }

    public int size() {
        return this.elements.length;
    }

    public f[] toArray() {
        return g.cloneElements(this.elements);
    }

    @Override // org.bouncycastle.asn1.s
    s toDERObject() {
        f[] fVarArr;
        if (this.isSorted) {
            fVarArr = this.elements;
        } else {
            fVarArr = (f[]) this.elements.clone();
            sort(fVarArr);
        }
        return new h1(true, fVarArr);
    }

    @Override // org.bouncycastle.asn1.s
    s toDLObject() {
        return new w1(this.isSorted, this.elements);
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i8 = 0;
        while (true) {
            stringBuffer.append(this.elements[i8]);
            i8++;
            if (i8 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    protected x(f fVar) {
        if (fVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.elements = new f[]{fVar};
        this.isSorted = true;
    }

    public static x getInstance(b0 b0Var, boolean z7) {
        if (z7) {
            if (b0Var.isExplicit()) {
                return getInstance(b0Var.getObject());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        s object = b0Var.getObject();
        if (b0Var.isExplicit()) {
            return b0Var instanceof p0 ? new n0(object) : new w1(object);
        }
        if (object instanceof x) {
            x xVar = (x) object;
            return b0Var instanceof p0 ? xVar : (x) xVar.toDLObject();
        }
        if (object instanceof v) {
            f[] arrayInternal = ((v) object).toArrayInternal();
            return b0Var instanceof p0 ? new n0(false, arrayInternal) : new w1(false, arrayInternal);
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + b0Var.getClass().getName());
    }

    protected x(g gVar, boolean z7) {
        f[] takeElements;
        if (gVar == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z7 || gVar.size() < 2) {
            takeElements = gVar.takeElements();
        } else {
            takeElements = gVar.copyElements();
            sort(takeElements);
        }
        this.elements = takeElements;
        this.isSorted = z7 || takeElements.length < 2;
    }

    x(boolean z7, f[] fVarArr) {
        this.elements = fVarArr;
        this.isSorted = z7 || fVarArr.length < 2;
    }

    protected x(f[] fVarArr, boolean z7) {
        if (org.bouncycastle.util.a.isNullOrContainsNull(fVarArr)) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        f[] cloneElements = g.cloneElements(fVarArr);
        if (z7 && cloneElements.length >= 2) {
            sort(cloneElements);
        }
        this.elements = cloneElements;
        this.isSorted = z7 || cloneElements.length < 2;
    }
}
