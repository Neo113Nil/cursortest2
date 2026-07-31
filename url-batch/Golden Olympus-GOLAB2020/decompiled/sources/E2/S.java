package E2;

import A2.j;
import C2.AbstractC0299b;
import D2.AbstractC0348a;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3526a;
import y2.InterfaceC3535j;

/* loaded from: classes3.dex */
public abstract class S {
    public static final void b(A2.j kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof j.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof A2.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof A2.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(A2.f fVar, AbstractC0348a json) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof D2.f) {
                return ((D2.f) annotation).discriminator();
            }
        }
        return json.d().c();
    }

    public static final Object d(D2.h hVar, InterfaceC3526a deserializer) {
        D2.z k4;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC0299b) || hVar.d().d().l()) {
            return deserializer.deserialize(hVar);
        }
        String c4 = c(deserializer.getDescriptor(), hVar.d());
        D2.i i4 = hVar.i();
        A2.f descriptor = deserializer.getDescriptor();
        if (i4 instanceof D2.w) {
            D2.w wVar = (D2.w) i4;
            D2.i iVar = (D2.i) wVar.get(c4);
            String e4 = (iVar == null || (k4 = D2.k.k(iVar)) == null) ? null : k4.e();
            InterfaceC3526a c5 = ((AbstractC0299b) deserializer).c(hVar, e4);
            if (c5 != null) {
                return b0.a(hVar.d(), c4, wVar, c5);
            }
            e(e4, wVar);
            throw new W1.f();
        }
        throw F.d(-1, "Expected " + kotlin.jvm.internal.H.b(D2.w.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.H.b(i4.getClass()));
    }

    public static final Void e(String str, D2.w jsonTree) {
        String str2;
        Intrinsics.checkNotNullParameter(jsonTree, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw F.e(-1, "Polymorphic serializer was not found for " + str2, jsonTree.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC3535j interfaceC3535j, InterfaceC3535j interfaceC3535j2, String str) {
    }
}
