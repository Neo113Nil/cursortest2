package k3;

import M2.F;
import e2.C0559a;
import i3.Q;
import i3.a0;
import j3.AbstractC0724c;
import j3.B;
import j3.x;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import z2.C1403G;
import z2.C1441y;

/* loaded from: classes.dex */
public abstract class a implements j3.k, Decoder, h3.a {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7428d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f7429e;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0724c f7430i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7431j;

    /* renamed from: k, reason: collision with root package name */
    public final j3.j f7432k;

    public a(AbstractC0724c abstractC0724c, String str) {
        this.f7430i = abstractC0724c;
        this.f7431j = str;
        this.f7432k = abstractC0724c.f7173a;
    }

    @Override // h3.a
    public void A(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // h3.a
    public final short B(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return M(O(descriptor, i2));
    }

    public final boolean C(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        j3.m w4 = w(tag);
        if (!(w4 instanceof B)) {
            throw h.d(-1, "Expected " + F.a(B.class).b() + ", but had " + F.a(w4.getClass()).b() + " as the serialized body of boolean at element: " + S(tag), w4.toString());
        }
        B b4 = (B) w4;
        try {
            int i2 = j3.n.f7214a;
            Intrinsics.checkNotNullParameter(b4, "<this>");
            String content = b4.getContent();
            String[] strArr = t.f7477a;
            Intrinsics.checkNotNullParameter(content, "<this>");
            Boolean bool = kotlin.text.u.i(true, content, "true") ? Boolean.TRUE : kotlin.text.u.i(true, content, "false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            T(b4, "boolean", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            T(b4, "boolean", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double D() {
        return H(Q());
    }

    public final byte E(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        j3.m w4 = w(tag);
        if (!(w4 instanceof B)) {
            throw h.d(-1, "Expected " + F.a(B.class).b() + ", but had " + F.a(w4.getClass()).b() + " as the serialized body of byte at element: " + S(tag), w4.toString());
        }
        B b4 = (B) w4;
        try {
            int a4 = j3.n.a(b4);
            Byte valueOf = (-128 > a4 || a4 > 127) ? null : Byte.valueOf((byte) a4);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            T(b4, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            T(b4, "byte", tag);
            throw null;
        }
    }

    @Override // h3.a
    public final byte F(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return E(O(descriptor, i2));
    }

    public final char G(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        j3.m w4 = w(tag);
        if (!(w4 instanceof B)) {
            throw h.d(-1, "Expected " + F.a(B.class).b() + ", but had " + F.a(w4.getClass()).b() + " as the serialized body of char at element: " + S(tag), w4.toString());
        }
        B b4 = (B) w4;
        try {
            String content = b4.getContent();
            Intrinsics.checkNotNullParameter(content, "<this>");
            int length = content.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return content.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            T(b4, "char", tag);
            throw null;
        }
    }

    public final double H(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        j3.m w4 = w(tag);
        if (!(w4 instanceof B)) {
            throw h.d(-1, "Expected " + F.a(B.class).b() + ", but had " + F.a(w4.getClass()).b() + " as the serialized body of double at element: " + S(tag), w4.toString());
        }
        B b4 = (B) w4;
        try {
            int i2 = j3.n.f7214a;
            Intrinsics.checkNotNullParameter(b4, "<this>");
            double parseDouble = Double.parseDouble(b4.getContent());
            if (this.f7430i.f7173a.f7208k || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            throw h.a(Double.valueOf(parseDouble), tag, x().toString());
        } catch (IllegalArgumentException unused) {
            T(b4, "double", tag);
            throw null;
        }
    }

    public final float I(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        j3.m w4 = w(tag);
        if (!(w4 instanceof B)) {
            throw h.d(-1, "Expected " + F.a(B.class).b() + ", but had " + F.a(w4.getClass()).b() + " as the serialized body of float at element: " + S(tag), w4.toString());
        }
        B b4 = (B) w4;
        try {
            int i2 = j3.n.f7214a;
            Intrinsics.checkNotNullParameter(b4, "<this>");
            float parseFloat = Float.parseFloat(b4.getContent());
            if (this.f7430i.f7173a.f7208k || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            throw h.a(Float.valueOf(parseFloat), tag, x().toString());
        } catch (IllegalArgumentException unused) {
            T(b4, "float", tag);
            throw null;
        }
    }

    public final Decoder J(Object obj, SerialDescriptor inlineDescriptor) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        Set set = r.f7476a;
        Intrinsics.checkNotNullParameter(inlineDescriptor, "<this>");
        if (!inlineDescriptor.b() || !r.f7476a.contains(inlineDescriptor)) {
            Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
            this.f7428d.add(tag);
            return this;
        }
        j3.m w4 = w(tag);
        String d4 = inlineDescriptor.d();
        if (w4 instanceof B) {
            String content = ((B) w4).getContent();
            AbstractC0724c abstractC0724c = this.f7430i;
            return new c(h.e(abstractC0724c, content), abstractC0724c);
        }
        throw h.d(-1, "Expected " + F.a(B.class).b() + ", but had " + F.a(w4.getClass()).b() + " as the serialized body of " + d4 + " at element: " + S(tag), w4.toString());
    }

    public final int K(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        j3.m w4 = w(tag);
        if (w4 instanceof B) {
            B b4 = (B) w4;
            try {
                return j3.n.a(b4);
            } catch (IllegalArgumentException unused) {
                T(b4, "int", tag);
                throw null;
            }
        }
        throw h.d(-1, "Expected " + F.a(B.class).b() + ", but had " + F.a(w4.getClass()).b() + " as the serialized body of int at element: " + S(tag), w4.toString());
    }

    public final long L(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        j3.m w4 = w(tag);
        if (!(w4 instanceof B)) {
            throw h.d(-1, "Expected " + F.a(B.class).b() + ", but had " + F.a(w4.getClass()).b() + " as the serialized body of long at element: " + S(tag), w4.toString());
        }
        B b4 = (B) w4;
        try {
            int i2 = j3.n.f7214a;
            Intrinsics.checkNotNullParameter(b4, "<this>");
            try {
                return new C0559a(b4.getContent()).i();
            } catch (d e4) {
                throw new NumberFormatException(e4.getMessage());
            }
        } catch (IllegalArgumentException unused) {
            T(b4, "long", tag);
            throw null;
        }
    }

    public final short M(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        j3.m w4 = w(tag);
        if (!(w4 instanceof B)) {
            throw h.d(-1, "Expected " + F.a(B.class).b() + ", but had " + F.a(w4.getClass()).b() + " as the serialized body of short at element: " + S(tag), w4.toString());
        }
        B b4 = (B) w4;
        try {
            int a4 = j3.n.a(b4);
            Short valueOf = (-32768 > a4 || a4 > 32767) ? null : Short.valueOf((short) a4);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            T(b4, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            T(b4, "short", tag);
            throw null;
        }
    }

    public String N(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.a(i2);
    }

    public final String O(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        String childName = N(serialDescriptor, i2);
        Intrinsics.checkNotNullParameter(childName, "nestedName");
        String parentName = (String) C1403G.y(this.f7428d);
        if (parentName == null) {
            parentName = "";
        }
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public abstract j3.m P();

    public final Object Q() {
        ArrayList arrayList = this.f7428d;
        Object remove = arrayList.remove(C1441y.d(arrayList));
        this.f7429e = true;
        return remove;
    }

    public final String R() {
        ArrayList arrayList = this.f7428d;
        return arrayList.isEmpty() ? "$" : C1403G.w(arrayList, ".", "$.", null, null, 60);
    }

    public final String S(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return R() + '.' + currentTag;
    }

    public final void T(B b4, String str, String str2) {
        throw h.d(-1, "Failed to parse literal '" + b4 + "' as " + (kotlin.text.u.n(str, "i") ? "an " : "a ").concat(str) + " value at element: " + S(str2), x().toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public h3.a a(SerialDescriptor descriptor) {
        h3.a lVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        j3.m x2 = x();
        u3.d i2 = descriptor.i();
        boolean a4 = Intrinsics.a(i2, g3.i.f6808i);
        AbstractC0724c abstractC0724c = this.f7430i;
        if (a4 || (i2 instanceof g3.c)) {
            String d4 = descriptor.d();
            if (!(x2 instanceof j3.e)) {
                throw h.d(-1, "Expected " + F.a(j3.e.class).b() + ", but had " + F.a(x2.getClass()).b() + " as the serialized body of " + d4 + " at element: " + R(), x2.toString());
            }
            lVar = new l(abstractC0724c, (j3.e) x2);
        } else if (Intrinsics.a(i2, g3.i.f6809j)) {
            SerialDescriptor g4 = h.g(descriptor.h(0), abstractC0724c.f7174b);
            u3.d i4 = g4.i();
            if ((i4 instanceof g3.e) || Intrinsics.a(i4, g3.h.f6806h)) {
                String d5 = descriptor.d();
                if (!(x2 instanceof x)) {
                    throw h.d(-1, "Expected " + F.a(x.class).b() + ", but had " + F.a(x2.getClass()).b() + " as the serialized body of " + d5 + " at element: " + R(), x2.toString());
                }
                lVar = new m(abstractC0724c, (x) x2);
            } else {
                if (!abstractC0724c.f7173a.f7201d) {
                    throw h.b(g4);
                }
                String d6 = descriptor.d();
                if (!(x2 instanceof j3.e)) {
                    throw h.d(-1, "Expected " + F.a(j3.e.class).b() + ", but had " + F.a(x2.getClass()).b() + " as the serialized body of " + d6 + " at element: " + R(), x2.toString());
                }
                lVar = new l(abstractC0724c, (j3.e) x2);
            }
        } else {
            String d7 = descriptor.d();
            if (!(x2 instanceof x)) {
                throw h.d(-1, "Expected " + F.a(x.class).b() + ", but had " + F.a(x2.getClass()).b() + " as the serialized body of " + d7 + " at element: " + R(), x2.toString());
            }
            lVar = new k(abstractC0724c, (x) x2, this.f7431j, 8);
        }
        return lVar;
    }

    @Override // h3.a
    public final int b(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return K(O(descriptor, i2));
    }

    @Override // h3.a
    public final float c(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return I(O(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (C1403G.y(this.f7428d) != null) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return J(Q(), descriptor);
        }
        return new j(this.f7430i, P(), this.f7431j).d(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long e() {
        return L(Q());
    }

    @Override // h3.a
    public final Object f(SerialDescriptor descriptor, int i2, String str) {
        Object h4;
        a0 deserializer = a0.f7055a;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        String O3 = O(descriptor, i2);
        a0 a0Var = a0.f7055a;
        this.f7428d.add(O3);
        a0 deserializer2 = a0.f7055a;
        if (deserializer2.getDescriptor().f() || m()) {
            Intrinsics.checkNotNullParameter(deserializer2, "deserializer");
            h4 = h(deserializer2);
        } else {
            h4 = null;
        }
        if (!this.f7429e) {
            Q();
        }
        this.f7429e = false;
        return h4;
    }

    @Override // h3.a
    public final double g(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return H(O(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object h(KSerializer deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (deserializer instanceof f3.b) {
            AbstractC0724c abstractC0724c = this.f7430i;
            if (!abstractC0724c.f7173a.f7206i) {
                f3.b bVar = (f3.b) deserializer;
                String i2 = h.i(abstractC0724c, bVar.getDescriptor());
                j3.m x2 = x();
                String d4 = bVar.getDescriptor().d();
                if (!(x2 instanceof x)) {
                    throw h.d(-1, "Expected " + F.a(x.class).b() + ", but had " + F.a(x2.getClass()).b() + " as the serialized body of " + d4 + " at element: " + R(), x2.toString());
                }
                x xVar = (x) x2;
                j3.m mVar = (j3.m) xVar.get((Object) i2);
                String str = null;
                if (mVar != null) {
                    B b4 = j3.n.b(mVar);
                    Intrinsics.checkNotNullParameter(b4, "<this>");
                    if (!(b4 instanceof j3.u)) {
                        str = b4.getContent();
                    }
                }
                try {
                    return h.o(abstractC0724c, i2, xVar, u3.d.B((f3.b) deserializer, this, str));
                } catch (f3.c e4) {
                    String message = e4.getMessage();
                    Intrinsics.c(message);
                    throw h.d(-1, message, xVar.toString());
                }
            }
        }
        return deserializer.deserialize(this);
    }

    @Override // j3.k
    public final j3.m i() {
        return x();
    }

    @Override // h3.a
    public final Object j(SerialDescriptor descriptor, int i2, KSerializer deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f7428d.add(O(descriptor, i2));
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Object h4 = h(deserializer);
        if (!this.f7429e) {
            Q();
        }
        this.f7429e = false;
        return h4;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean k() {
        return C(Q());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int l() {
        return K(Q());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean m() {
        return !(x() instanceof j3.u);
    }

    @Override // h3.a
    public final A0.q n() {
        return this.f7430i.f7174b;
    }

    @Override // h3.a
    public final long o(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return L(O(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char p() {
        return G(Q());
    }

    @Override // h3.a
    public final char q(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return G(O(descriptor, i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte r() {
        return E(Q());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short t() {
        return M(Q());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String u() {
        String tag = (String) Q();
        Intrinsics.checkNotNullParameter(tag, "tag");
        j3.m w4 = w(tag);
        if (!(w4 instanceof B)) {
            throw h.d(-1, "Expected " + F.a(B.class).b() + ", but had " + F.a(w4.getClass()).b() + " as the serialized body of string at element: " + S(tag), w4.toString());
        }
        B b4 = (B) w4;
        if (!(b4 instanceof j3.r)) {
            throw h.d(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + S(tag), x().toString());
        }
        j3.r rVar = (j3.r) b4;
        if (rVar.f7218d || this.f7430i.f7173a.f7200c) {
            return rVar.f7220i;
        }
        throw h.d(-1, "String literal for key '" + tag + "' should be quoted at element: " + S(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", x().toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float v() {
        return I(Q());
    }

    public abstract j3.m w(String str);

    public final j3.m x() {
        j3.m w4;
        String str = (String) C1403G.y(this.f7428d);
        return (str == null || (w4 = w(str)) == null) ? P() : w4;
    }

    @Override // h3.a
    public final Decoder y(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return J(O(descriptor, i2), descriptor.h(i2));
    }

    @Override // h3.a
    public final boolean z(Q descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return C(O(descriptor, i2));
    }
}
