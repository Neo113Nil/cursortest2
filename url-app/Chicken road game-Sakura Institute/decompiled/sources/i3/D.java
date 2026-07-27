package i3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z2.C1412P;

/* loaded from: classes.dex */
public final class D extends AbstractC0680a {

    /* renamed from: a, reason: collision with root package name */
    public final C f7013a;

    public D() {
        a0 kSerializer = a0.f7055a;
        j3.o vSerializer = j3.o.f7215a;
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f7013a = new C(a0.f7056b, j3.o.f7216b);
    }

    @Override // i3.AbstractC0680a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // i3.AbstractC0680a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // i3.AbstractC0680a
    public final void d(h3.a decoder, int i2, Object obj, boolean z4) {
        Object j4;
        int i4;
        Object j5;
        Map builder = (Map) obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        a0 a0Var = a0.f7055a;
        C c4 = this.f7013a;
        j4 = decoder.j(c4, i2, a0Var, null);
        if (z4) {
            i4 = decoder.s(c4);
            if (i4 != i2 + 1) {
                throw new IllegalArgumentException(r0.B.b(i2, i4, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
        } else {
            i4 = i2 + 1;
        }
        if (builder.containsKey(j4)) {
            j3.o oVar = j3.o.f7215a;
            if (!(j3.o.f7216b.f6794b instanceof g3.e)) {
                j5 = decoder.j(c4, i4, oVar, C1412P.d(j4, builder));
                builder.put(j4, j5);
            }
        }
        j5 = decoder.j(c4, i4, j3.o.f7215a, null);
        builder.put(j4, j5);
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // i3.AbstractC0680a
    public final Object f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f7013a;
    }
}
