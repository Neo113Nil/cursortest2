package F2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import y2.InterfaceC3526a;
import y2.InterfaceC3527b;
import y2.InterfaceC3535j;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f653a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f654b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f655c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f656d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider) {
        super(null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f653a = class2ContextualFactory;
        this.f654b = polyBase2Serializers;
        this.f655c = polyBase2DefaultSerializerProvider;
        this.f656d = polyBase2NamedSerializers;
        this.f657e = polyBase2DefaultDeserializerProvider;
    }

    @Override // F2.b
    public void a(d collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry entry : this.f653a.entrySet()) {
            android.support.v4.media.session.b.a(entry.getValue());
        }
        for (Map.Entry entry2 : this.f654b.entrySet()) {
            m2.c cVar = (m2.c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                m2.c cVar2 = (m2.c) entry3.getKey();
                InterfaceC3527b interfaceC3527b = (InterfaceC3527b) entry3.getValue();
                Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(cVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(interfaceC3527b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.a(cVar, cVar2, interfaceC3527b);
            }
        }
        for (Map.Entry entry4 : this.f655c.entrySet()) {
            m2.c cVar3 = (m2.c) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            Intrinsics.checkNotNull(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.c(cVar3, (Function1) M.e(function1, 1));
        }
        for (Map.Entry entry5 : this.f657e.entrySet()) {
            m2.c cVar4 = (m2.c) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            Intrinsics.checkNotNull(cVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.b(cVar4, (Function1) M.e(function12, 1));
        }
    }

    @Override // F2.b
    public InterfaceC3527b b(m2.c kClass, List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        android.support.v4.media.session.b.a(this.f653a.get(kClass));
        return null;
    }

    @Override // F2.b
    public InterfaceC3526a d(m2.c baseClass, String str) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map map = (Map) this.f656d.get(baseClass);
        InterfaceC3527b interfaceC3527b = map != null ? (InterfaceC3527b) map.get(str) : null;
        if (interfaceC3527b == null) {
            interfaceC3527b = null;
        }
        if (interfaceC3527b != null) {
            return interfaceC3527b;
        }
        Object obj = this.f657e.get(baseClass);
        Function1 function1 = M.k(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (InterfaceC3526a) function1.invoke(str);
        }
        return null;
    }

    @Override // F2.b
    public InterfaceC3535j e(m2.c baseClass, Object value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.h(value)) {
            return null;
        }
        Map map = (Map) this.f654b.get(baseClass);
        InterfaceC3527b interfaceC3527b = map != null ? (InterfaceC3527b) map.get(H.b(value.getClass())) : null;
        if (interfaceC3527b == null) {
            interfaceC3527b = null;
        }
        if (interfaceC3527b != null) {
            return interfaceC3527b;
        }
        Object obj = this.f655c.get(baseClass);
        Function1 function1 = M.k(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (InterfaceC3535j) function1.invoke(value);
        }
        return null;
    }
}
