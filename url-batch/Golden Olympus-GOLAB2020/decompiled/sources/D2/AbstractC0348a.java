package D2;

import E2.C0393y;
import E2.J;
import E2.L;
import E2.W;
import E2.Z;
import E2.c0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3526a;
import y2.InterfaceC3535j;

/* renamed from: D2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0348a implements y2.n {

    /* renamed from: d, reason: collision with root package name */
    public static final C0007a f371d = new C0007a(null);

    /* renamed from: a, reason: collision with root package name */
    private final g f372a;

    /* renamed from: b, reason: collision with root package name */
    private final F2.b f373b;

    /* renamed from: c, reason: collision with root package name */
    private final C0393y f374c;

    /* renamed from: D2.a$a, reason: collision with other inner class name */
    public static final class C0007a extends AbstractC0348a {
        public /* synthetic */ C0007a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0007a() {
            super(new g(false, false, false, false, false, false, null, false, false, null, false, false, null, 8191, null), F2.c.a(), null);
        }
    }

    public /* synthetic */ AbstractC0348a(g gVar, F2.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, bVar);
    }

    @Override // y2.InterfaceC3532g
    public F2.b a() {
        return this.f373b;
    }

    @Override // y2.n
    public final String b(InterfaceC3535j serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        L l4 = new L();
        try {
            J.b(this, l4, serializer, obj);
            return l4.toString();
        } finally {
            l4.h();
        }
    }

    public final Object c(InterfaceC3526a deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        Z z4 = new Z(string);
        Object u4 = new W(this, c0.OBJ, z4, deserializer.getDescriptor(), null).u(deserializer);
        z4.w();
        return u4;
    }

    public final g d() {
        return this.f372a;
    }

    public final C0393y e() {
        return this.f374c;
    }

    private AbstractC0348a(g gVar, F2.b bVar) {
        this.f372a = gVar;
        this.f373b = bVar;
        this.f374c = new C0393y();
    }
}
