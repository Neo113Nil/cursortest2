package x3;

import W1.h;
import android.content.Context;
import f2.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import t3.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0290a f46710b = new C0290a(null);

    /* renamed from: a, reason: collision with root package name */
    private final h f46711a;

    /* renamed from: x3.a$a, reason: collision with other inner class name */
    public static final class C0290a {
        public /* synthetic */ C0290a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k3.a a(t3.c tracerLite) {
            Intrinsics.checkNotNullParameter(tracerLite, "tracerLite");
            return tracerLite.d().b();
        }

        private C0290a() {
        }
    }

    static final class b extends s implements Function0 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f46712i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f46713j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.f46712i = context;
            this.f46713j = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final k3.a invoke() {
            return new k3.a(i.o(d.f46298a.a(this.f46712i, this.f46713j), "drops.json"));
        }
    }

    public a(Context context, String libraryPackageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(libraryPackageName, "libraryPackageName");
        this.f46711a = W1.i.b(new b(context, libraryPackageName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k3.a b() {
        return (k3.a) this.f46711a.getValue();
    }
}
