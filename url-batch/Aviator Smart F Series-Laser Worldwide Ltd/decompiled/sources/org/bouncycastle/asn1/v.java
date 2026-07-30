package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;
import org.bouncycastle.util.a;

/* loaded from: classes5.dex */
public abstract class v extends s implements org.bouncycastle.util.f {
    f[] elements;

    class a implements Enumeration {
        private int pos = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.pos < v.this.elements.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.pos;
            f[] fVarArr = v.this.elements;
            if (i8 >= fVarArr.length) {
                throw new NoSuchElementException();
            }
            this.pos = i8 + 1;
            return fVarArr[i8];
        }
    }

    class b implements w {
        private int pos = 0;
        final /* synthetic */ int val$count;

        b(int i8) {
            this.val$count = i8;
        }

        @Override // org.bouncycastle.asn1.w, org.bouncycastle.asn1.b2
        public s getLoadedObject() {
            return v.this;
        }

        @Override // org.bouncycastle.asn1.w
        public f readObject() {
            int i8 = this.val$count;
            int i9 = this.pos;
            if (i8 == i9) {
                return null;
            }
            f[] fVarArr = v.this.elements;
            this.pos = i9 + 1;
            f fVar = fVarArr[i9];
            return fVar instanceof v ? ((v) fVar).parser() : fVar instanceof x ? ((x) fVar).parser() : fVar;
        }

        @Override // org.bouncycastle.asn1.w, org.bouncycastle.asn1.f
        public s toASN1Primitive() {
            return v.this;
        }
    }

    protected v() {
        this.elements = g.EMPTY_ELEMENTS;
    }

    public static v getInstance(Object obj) {
        if (obj == null || (obj instanceof v)) {
            return (v) obj;
        }
        if (obj instanceof w) {
            return getInstance(((w) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(s.fromByteArray((byte[]) obj));
            } catch (IOException e8) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e8.getMessage());
            }
        }
        if (obj instanceof f) {
            s aSN1Primitive = ((f) obj).toASN1Primitive();
            if (aSN1Primitive instanceof v) {
                return (v) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (!(sVar instanceof v)) {
            return false;
        }
        v vVar = (v) sVar;
        int size = size();
        if (vVar.size() != size) {
            return false;
        }
        for (int i8 = 0; i8 < size; i8++) {
            s aSN1Primitive = this.elements[i8].toASN1Primitive();
            s aSN1Primitive2 = vVar.elements[i8].toASN1Primitive();
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
            i8 = (i8 * 257) ^ this.elements[length].toASN1Primitive().hashCode();
        }
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return true;
    }

    public Iterator<f> iterator() {
        return new a.C0396a(this.elements);
    }

    public w parser() {
        return new b(size());
    }

    public int size() {
        return this.elements.length;
    }

    public f[] toArray() {
        return g.cloneElements(this.elements);
    }

    f[] toArrayInternal() {
        return this.elements;
    }

    @Override // org.bouncycastle.asn1.s
    s toDERObject() {
        return new g1(this.elements, false);
    }

    @Override // org.bouncycastle.asn1.s
    s toDLObject() {
        return new u1(this.elements, false);
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

    protected v(f fVar) {
        if (fVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.elements = new f[]{fVar};
    }

    public static v getInstance(b0 b0Var, boolean z7) {
        if (z7) {
            if (b0Var.isExplicit()) {
                return getInstance(b0Var.getObject());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        s object = b0Var.getObject();
        if (b0Var.isExplicit()) {
            return b0Var instanceof p0 ? new l0(object) : new u1(object);
        }
        if (object instanceof v) {
            v vVar = (v) object;
            return b0Var instanceof p0 ? vVar : (v) vVar.toDLObject();
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + b0Var.getClass().getName());
    }

    protected v(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.elements = gVar.takeElements();
    }

    protected v(f[] fVarArr) {
        if (org.bouncycastle.util.a.isNullOrContainsNull(fVarArr)) {
            throw new NullPointerException("'elements' cannot be null, or contain null");
        }
        this.elements = g.cloneElements(fVarArr);
    }

    v(f[] fVarArr, boolean z7) {
        this.elements = z7 ? g.cloneElements(fVarArr) : fVarArr;
    }
}
