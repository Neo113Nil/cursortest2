package C2;

import B2.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.C3534i;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class O0 implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3527b f235a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3527b f236b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3527b f237c;

    /* renamed from: d, reason: collision with root package name */
    private final A2.f f238d;

    static final class a extends kotlin.jvm.internal.s implements Function1 {
        a() {
            super(1);
        }

        public final void a(A2.a buildClassSerialDescriptor) {
            Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            A2.a.b(buildClassSerialDescriptor, "first", O0.this.f235a.getDescriptor(), null, false, 12, null);
            A2.a.b(buildClassSerialDescriptor, "second", O0.this.f236b.getDescriptor(), null, false, 12, null);
            A2.a.b(buildClassSerialDescriptor, "third", O0.this.f237c.getDescriptor(), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A2.a) obj);
            return Unit.f41027a;
        }
    }

    public O0(InterfaceC3527b aSerializer, InterfaceC3527b bSerializer, InterfaceC3527b cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.f235a = aSerializer;
        this.f236b = bSerializer;
        this.f237c = cSerializer;
        this.f238d = A2.i.b("kotlin.Triple", new A2.f[0], new a());
    }

    private final W1.q d(B2.c cVar) {
        Object c4 = c.a.c(cVar, getDescriptor(), 0, this.f235a, null, 8, null);
        Object c5 = c.a.c(cVar, getDescriptor(), 1, this.f236b, null, 8, null);
        Object c6 = c.a.c(cVar, getDescriptor(), 2, this.f237c, null, 8, null);
        cVar.c(getDescriptor());
        return new W1.q(c4, c5, c6);
    }

    private final W1.q e(B2.c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj = P0.f241a;
        obj2 = P0.f241a;
        obj3 = P0.f241a;
        while (true) {
            int t4 = cVar.t(getDescriptor());
            if (t4 == -1) {
                cVar.c(getDescriptor());
                obj4 = P0.f241a;
                if (obj == obj4) {
                    throw new C3534i("Element 'first' is missing");
                }
                obj5 = P0.f241a;
                if (obj2 == obj5) {
                    throw new C3534i("Element 'second' is missing");
                }
                obj6 = P0.f241a;
                if (obj3 != obj6) {
                    return new W1.q(obj, obj2, obj3);
                }
                throw new C3534i("Element 'third' is missing");
            }
            if (t4 == 0) {
                obj = c.a.c(cVar, getDescriptor(), 0, this.f235a, null, 8, null);
            } else if (t4 == 1) {
                obj2 = c.a.c(cVar, getDescriptor(), 1, this.f236b, null, 8, null);
            } else {
                if (t4 != 2) {
                    throw new C3534i("Unexpected index " + t4);
                }
                obj3 = c.a.c(cVar, getDescriptor(), 2, this.f237c, null, 8, null);
            }
        }
    }

    @Override // y2.InterfaceC3526a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public W1.q deserialize(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        B2.c b4 = decoder.b(getDescriptor());
        return b4.v() ? d(b4) : e(b4);
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, W1.q value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        B2.d b4 = encoder.b(getDescriptor());
        b4.m(getDescriptor(), 0, this.f235a, value.f());
        b4.m(getDescriptor(), 1, this.f236b, value.g());
        b4.m(getDescriptor(), 2, this.f237c, value.h());
        b4.c(getDescriptor());
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return this.f238d;
    }
}
