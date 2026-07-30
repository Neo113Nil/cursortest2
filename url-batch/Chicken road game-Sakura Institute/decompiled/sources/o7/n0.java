package o7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialDescriptor[] f6912a = new SerialDescriptor[0];

    /* renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f6913b = new KSerializer[0];

    public static final x a(String str, KSerializer kSerializer) {
        return new x(str, new y(kSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        r6.k.f(serialDescriptor, "<this>");
        if (serialDescriptor instanceof j) {
            return ((j) serialDescriptor).g();
        }
        HashSet hashSet = new HashSet(serialDescriptor.d());
        int d8 = serialDescriptor.d();
        for (int i7 = 0; i7 < d8; i7++) {
            hashSet.add(serialDescriptor.e(i7));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f6912a : serialDescriptorArr;
    }

    public static final int d(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        r6.k.f(serialDescriptorArr, "typeParams");
        int hashCode = (serialDescriptor.b().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int d8 = serialDescriptor.d();
        int i7 = 1;
        while (true) {
            int i8 = 0;
            if (!(d8 > 0)) {
                break;
            }
            int i9 = d8 - 1;
            int i10 = i7 * 31;
            String b9 = serialDescriptor.j(serialDescriptor.d() - d8).b();
            if (b9 != null) {
                i8 = b9.hashCode();
            }
            i7 = i10 + i8;
            d8 = i9;
        }
        int d9 = serialDescriptor.d();
        int i11 = 1;
        while (true) {
            if (!(d9 > 0)) {
                return (((hashCode * 31) + i7) * 31) + i11;
            }
            int i12 = d9 - 1;
            int i13 = i11 * 31;
            a8.m c4 = serialDescriptor.j(serialDescriptor.d() - d9).c();
            i11 = i13 + (c4 != null ? c4.hashCode() : 0);
            d9 = i12;
        }
    }

    public static final void e(String str, r6.d dVar) {
        String str2;
        String str3 = "in the polymorphic scope of '" + dVar.b() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + dVar.b() + "' has to be sealed and '@Serializable'.";
        }
        throw new l7.c(str2);
    }
}
