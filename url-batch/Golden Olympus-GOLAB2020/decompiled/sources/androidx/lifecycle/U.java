package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InterfaceC3247m;
import kotlin.jvm.internal.Intrinsics;
import m.InterfaceC3255a;

/* loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C1359z f12605i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC3255a f12606j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1359z c1359z, InterfaceC3255a interfaceC3255a) {
            super(1);
            this.f12605i = c1359z;
            this.f12606j = interfaceC3255a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m4invoke(obj);
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4invoke(Object obj) {
            this.f12605i.o(this.f12606j.apply(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b implements C, InterfaceC3247m {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f12607a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f12607a = function;
        }

        @Override // androidx.lifecycle.C
        public final /* synthetic */ void d(Object obj) {
            this.f12607a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof C) && (obj instanceof InterfaceC3247m)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((InterfaceC3247m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3247m
        public final W1.e getFunctionDelegate() {
            return this.f12607a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final /* synthetic */ AbstractC1358y a(AbstractC1358y abstractC1358y, InterfaceC3255a mapFunction) {
        Intrinsics.checkNotNullParameter(abstractC1358y, "<this>");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        C1359z c1359z = new C1359z();
        c1359z.p(abstractC1358y, new b(new a(c1359z, mapFunction)));
        return c1359z;
    }
}
