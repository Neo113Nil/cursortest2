package x3;

import W1.h;
import W1.i;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l3.l;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f46714e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f46715a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46716b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46717c;

    /* renamed from: d, reason: collision with root package name */
    private final h f46718d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(t3.c tracer) {
            Intrinsics.checkNotNullParameter(tracer, "tracer");
            return tracer.f();
        }

        private a() {
        }
    }

    /* renamed from: x3.b$b, reason: collision with other inner class name */
    static final class C0291b extends s implements Function0 {
        C0291b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l3.b invoke() {
            return l.a(b.this.f46715a, b.this.f46716b, b.this.f46717c);
        }
    }

    public b(Context context, String libraryPackageName, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(libraryPackageName, "libraryPackageName");
        this.f46715a = context;
        this.f46716b = libraryPackageName;
        this.f46717c = i4;
        this.f46718d = i.b(new C0291b());
    }

    public final l3.b d() {
        return (l3.b) this.f46718d.getValue();
    }
}
