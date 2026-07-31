package D2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public final class d implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    public static final d f377a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final A2.f f378b = a.f379b;

    private static final class a implements A2.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f379b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f380c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ A2.f f381a = AbstractC3551a.h(l.f408a).getDescriptor();

        private a() {
        }

        @Override // A2.f
        public String a() {
            return f380c;
        }

        @Override // A2.f
        public boolean c() {
            return this.f381a.c();
        }

        @Override // A2.f
        public int d(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f381a.d(name);
        }

        @Override // A2.f
        public A2.j e() {
            return this.f381a.e();
        }

        @Override // A2.f
        public int f() {
            return this.f381a.f();
        }

        @Override // A2.f
        public String g(int i4) {
            return this.f381a.g(i4);
        }

        @Override // A2.f
        public List getAnnotations() {
            return this.f381a.getAnnotations();
        }

        @Override // A2.f
        public List h(int i4) {
            return this.f381a.h(i4);
        }

        @Override // A2.f
        public A2.f i(int i4) {
            return this.f381a.i(i4);
        }

        @Override // A2.f
        public boolean isInline() {
            return this.f381a.isInline();
        }

        @Override // A2.f
        public boolean j(int i4) {
            return this.f381a.j(i4);
        }
    }

    private d() {
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0349b deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m.g(decoder);
        return new C0349b((List) AbstractC3551a.h(l.f408a).deserialize(decoder));
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, C0349b value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        m.h(encoder);
        AbstractC3551a.h(l.f408a).serialize(encoder, value);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return f378b;
    }
}
