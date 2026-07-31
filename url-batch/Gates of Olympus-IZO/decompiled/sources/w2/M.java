package w2;

import e2.AbstractC0381e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialDescriptor[] f8618a = new SerialDescriptor[0];

    /* renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f8619b = new KSerializer[0];

    public static final C1044x a(String str, KSerializer kSerializer) {
        return new C1044x(str, new C1045y(kSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        Z1.i.f(serialDescriptor, "<this>");
        if (serialDescriptor instanceof InterfaceC1031j) {
            return ((InterfaceC1031j) serialDescriptor).e();
        }
        HashSet hashSet = new HashSet(serialDescriptor.l());
        int l3 = serialDescriptor.l();
        for (int i3 = 0; i3 < l3; i3++) {
            hashSet.add(serialDescriptor.a(i3));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f8618a : serialDescriptorArr;
    }

    public static final int d(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        Z1.i.f(serialDescriptor, "<this>");
        Z1.i.f(serialDescriptorArr, "typeParams");
        int hashCode = (serialDescriptor.d().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int l3 = serialDescriptor.l();
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (!(l3 > 0)) {
                break;
            }
            int i5 = l3 - 1;
            int i6 = i3 * 31;
            String d3 = serialDescriptor.h(serialDescriptor.l() - l3).d();
            if (d3 != null) {
                i4 = d3.hashCode();
            }
            i3 = i6 + i4;
            l3 = i5;
        }
        int l4 = serialDescriptor.l();
        int i7 = 1;
        while (true) {
            if (!(l4 > 0)) {
                return (((hashCode * 31) + i3) * 31) + i7;
            }
            int i8 = l4 - 1;
            int i9 = i7 * 31;
            AbstractC0381e i10 = serialDescriptor.h(serialDescriptor.l() - l4).i();
            i7 = i9 + (i10 != null ? i10.hashCode() : 0);
            l4 = i8;
        }
    }

    public static final void e(Z1.d dVar, String str) {
        String str2;
        String str3 = "in the polymorphic scope of '" + dVar.b() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + dVar.b() + "' has to be sealed and '@Serializable'.";
        }
        throw new t2.c(str2);
    }
}
