package i3;

import M2.C0256h;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialDescriptor[] f7027a = new SerialDescriptor[0];

    /* renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f7028b = new KSerializer[0];

    public static final C0702x a(String name, KSerializer primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new C0702x(name, new C0703y(primitiveSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof InterfaceC0689j) {
            return ((InterfaceC0689j) serialDescriptor).e();
        }
        HashSet hashSet = new HashSet(serialDescriptor.l());
        int l4 = serialDescriptor.l();
        for (int i2 = 0; i2 < l4; i2++) {
            hashSet.add(serialDescriptor.a(i2));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f7027a : serialDescriptorArr;
    }

    public static final int d(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (serialDescriptor.d().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        int l4 = serialDescriptor.l();
        int i2 = 1;
        while (true) {
            int i4 = 0;
            if (!(l4 > 0)) {
                break;
            }
            int i5 = l4 - 1;
            int i6 = i2 * 31;
            String d4 = serialDescriptor.h(serialDescriptor.l() - l4).d();
            if (d4 != null) {
                i4 = d4.hashCode();
            }
            i2 = i6 + i4;
            l4 = i5;
        }
        int l5 = serialDescriptor.l();
        int i7 = 1;
        while (true) {
            if (!(l5 > 0)) {
                return (((hashCode * 31) + i2) * 31) + i7;
            }
            int i8 = l5 - 1;
            int i9 = i7 * 31;
            u3.d i10 = serialDescriptor.h(serialDescriptor.l() - l5).i();
            i7 = i9 + (i10 != null ? i10.hashCode() : 0);
            l5 = i8;
        }
    }

    public static final void e(C0256h baseClass, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.b() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.b() + "' has to be sealed and '@Serializable'.";
        }
        throw new f3.c(str2);
    }
}
