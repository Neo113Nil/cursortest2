package A2;

import A2.k;
import C2.E0;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f96i = new a();

        a() {
            super(1);
        }

        public final void a(A2.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A2.a) obj);
            return Unit.f41027a;
        }
    }

    public static final f a(String serialName, e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.z(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return E0.a(serialName, kind);
    }

    public static final f b(String serialName, f[] typeParameters, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (StringsKt.z(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        A2.a aVar = new A2.a(serialName);
        builderAction.invoke(aVar);
        return new g(serialName, k.a.f99a, aVar.f().size(), AbstractC3219i.G0(typeParameters), aVar);
    }

    public static final f c(String serialName, j kind, f[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.z(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(kind, k.a.f99a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        A2.a aVar = new A2.a(serialName);
        builder.invoke(aVar);
        return new g(serialName, kind, aVar.f().size(), AbstractC3219i.G0(typeParameters), aVar);
    }

    public static /* synthetic */ f d(String str, j jVar, f[] fVarArr, Function1 function1, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            function1 = a.f96i;
        }
        return c(str, jVar, fVarArr, function1);
    }
}
