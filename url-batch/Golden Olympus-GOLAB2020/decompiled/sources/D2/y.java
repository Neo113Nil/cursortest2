package D2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class y implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final y f430a = new y();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f431b = a.f432b;

    private static final class a implements A2.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f432b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f433c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ A2.f f434a = AbstractC3551a.k(AbstractC3551a.H(L.f41137a), l.f408a).getDescriptor();

        private a() {
        }

        @Override // A2.f
        public String a() {
            return f433c;
        }

        @Override // A2.f
        public boolean c() {
            return this.f434a.c();
        }

        @Override // A2.f
        public int d(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f434a.d(name);
        }

        @Override // A2.f
        public A2.j e() {
            return this.f434a.e();
        }

        @Override // A2.f
        public int f() {
            return this.f434a.f();
        }

        @Override // A2.f
        public String g(int i4) {
            return this.f434a.g(i4);
        }

        @Override // A2.f
        public List getAnnotations() {
            return this.f434a.getAnnotations();
        }

        @Override // A2.f
        public List h(int i4) {
            return this.f434a.h(i4);
        }

        @Override // A2.f
        public A2.f i(int i4) {
            return this.f434a.i(i4);
        }

        @Override // A2.f
        public boolean isInline() {
            return this.f434a.isInline();
        }

        @Override // A2.f
        public boolean j(int i4) {
            return this.f434a.j(i4);
        }
    }

    private y() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public w deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m.g(decoder);
        return new w((Map) AbstractC3551a.k(AbstractC3551a.H(L.f41137a), l.f408a).deserialize(decoder));
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, w value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m.h(encoder);
        AbstractC3551a.k(AbstractC3551a.H(L.f41137a), l.f408a).serialize(encoder, value);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f431b;
    }
}
