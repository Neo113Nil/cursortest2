package C2;

import kotlin.jvm.internal.Intrinsics;
import y2.C3534i;

/* renamed from: C2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0301c {
    public static final Void a(String str, m2.c baseClass) {
        String str2;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str3 = "in the scope of '" + baseClass.e() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.e() + "' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '" + str + "' explicitly in a corresponding SerializersModule.";
        }
        throw new C3534i(str2);
    }

    public static final Void b(m2.c subClass, m2.c baseClass) {
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String e4 = subClass.e();
        if (e4 == null) {
            e4 = String.valueOf(subClass);
        }
        a(e4, baseClass);
        throw new W1.f();
    }
}
