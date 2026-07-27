package k3;

import M2.F;
import i3.M;
import j3.AbstractC0724c;
import j3.B;
import j3.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z2.C1400D;
import z2.C1407K;
import z2.C1411O;
import z2.C1412P;

/* loaded from: classes.dex */
public class k extends a {

    /* renamed from: l, reason: collision with root package name */
    public final x f7443l;

    /* renamed from: m, reason: collision with root package name */
    public final SerialDescriptor f7444m;

    /* renamed from: n, reason: collision with root package name */
    public int f7445n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7446o;

    public /* synthetic */ k(AbstractC0724c abstractC0724c, x xVar, String str, int i2) {
        this(abstractC0724c, xVar, (i2 & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // k3.a, h3.a
    public void A(SerialDescriptor descriptor) {
        Set set;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        j3.j jVar = this.f7432k;
        if (jVar.f7199b || (descriptor.i() instanceof g3.c)) {
            return;
        }
        AbstractC0724c abstractC0724c = this.f7430i;
        h.n(abstractC0724c, descriptor);
        if (jVar.f7209l) {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            Set b4 = M.b(descriptor);
            Intrinsics.checkNotNullParameter(abstractC0724c, "<this>");
            Map map = (Map) abstractC0724c.f7175c.v(descriptor);
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = C1407K.f11933d;
            }
            Set elements = keySet;
            Intrinsics.checkNotNullParameter(b4, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            Intrinsics.checkNotNullParameter(elements, "<this>");
            Integer valueOf = elements instanceof Collection ? Integer.valueOf(elements.size()) : null;
            LinkedHashSet linkedHashSet = new LinkedHashSet(C1411O.a(valueOf != null ? b4.size() + valueOf.intValue() : b4.size() * 2));
            linkedHashSet.addAll(b4);
            C1400D.j(elements, linkedHashSet);
            set = linkedHashSet;
        } else {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            set = M.b(descriptor);
        }
        for (String key : P().keySet()) {
            if (!set.contains(key) && !Intrinsics.a(key, this.f7431j)) {
                String input = P().toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(input, "input");
                throw h.c(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) h.m(input, -1)));
            }
        }
    }

    @Override // k3.a
    public String N(SerialDescriptor descriptor, int i2) {
        Object obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        AbstractC0724c abstractC0724c = this.f7430i;
        h.n(abstractC0724c, descriptor);
        String a4 = descriptor.a(i2);
        if (!this.f7432k.f7209l || P().keySet().contains(a4)) {
            return a4;
        }
        Map j4 = h.j(abstractC0724c, descriptor);
        Iterator<T> it = P().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) j4.get((String) obj);
            if (num != null && num.intValue() == i2) {
                break;
            }
        }
        String str = (String) obj;
        return str != null ? str : a4;
    }

    @Override // k3.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public x P() {
        return this.f7443l;
    }

    @Override // k3.a, kotlinx.serialization.encoding.Decoder
    public final h3.a a(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        SerialDescriptor serialDescriptor = this.f7444m;
        if (descriptor != serialDescriptor) {
            return super.a(descriptor);
        }
        j3.m x2 = x();
        String d4 = serialDescriptor.d();
        if (x2 instanceof x) {
            return new k(this.f7430i, (x) x2, this.f7431j, serialDescriptor);
        }
        throw h.d(-1, "Expected " + F.a(x.class).b() + ", but had " + F.a(x2.getClass()).b() + " as the serialized body of " + d4 + " at element: " + R(), x2.toString());
    }

    @Override // k3.a, kotlinx.serialization.encoding.Decoder
    public final boolean m() {
        return !this.f7446o && super.m();
    }

    @Override // h3.a
    public int s(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.f7445n < descriptor.l()) {
            int i2 = this.f7445n;
            this.f7445n = i2 + 1;
            String O3 = O(descriptor, i2);
            int i4 = this.f7445n - 1;
            boolean z4 = false;
            this.f7446o = false;
            boolean containsKey = P().containsKey((Object) O3);
            AbstractC0724c abstractC0724c = this.f7430i;
            if (!containsKey) {
                boolean z5 = (abstractC0724c.f7173a.f7203f || descriptor.j(i4) || !descriptor.h(i4).f()) ? false : true;
                this.f7446o = z5;
                if (!z5) {
                    continue;
                }
            }
            if (this.f7432k.f7205h) {
                boolean j4 = descriptor.j(i4);
                SerialDescriptor h4 = descriptor.h(i4);
                if (!j4 || h4.f() || !(w(O3) instanceof j3.u)) {
                    if (Intrinsics.a(h4.i(), g3.h.f6806h) && (!h4.f() || !(w(O3) instanceof j3.u))) {
                        j3.m w4 = w(O3);
                        String str = null;
                        B b4 = w4 instanceof B ? (B) w4 : null;
                        if (b4 != null) {
                            int i5 = j3.n.f7214a;
                            Intrinsics.checkNotNullParameter(b4, "<this>");
                            if (!(b4 instanceof j3.u)) {
                                str = b4.getContent();
                            }
                        }
                        if (str != null) {
                            int k4 = h.k(h4, abstractC0724c, str);
                            if (!abstractC0724c.f7173a.f7203f && h4.f()) {
                                z4 = true;
                            }
                            if (k4 == -3) {
                                if (!j4 && !z4) {
                                }
                            }
                        }
                    }
                }
            }
            return i4;
        }
        return -1;
    }

    @Override // k3.a
    public j3.m w(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (j3.m) C1412P.d(tag, P());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AbstractC0724c json, x value, String str, SerialDescriptor serialDescriptor) {
        super(json, str);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7443l = value;
        this.f7444m = serialDescriptor;
    }
}
