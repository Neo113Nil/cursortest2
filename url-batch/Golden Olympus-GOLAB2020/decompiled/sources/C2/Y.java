package C2;

import B2.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y2.C3534i;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public abstract class Y implements InterfaceC3527b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3527b f263a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3527b f264b;

    public /* synthetic */ Y(InterfaceC3527b interfaceC3527b, InterfaceC3527b interfaceC3527b2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3527b, interfaceC3527b2);
    }

    protected abstract Object a(Object obj);

    protected final InterfaceC3527b b() {
        return this.f263a;
    }

    protected abstract Object c(Object obj);

    protected final InterfaceC3527b d() {
        return this.f264b;
    }

    @Override // y2.InterfaceC3526a
    public Object deserialize(B2.e decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object e4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        A2.f descriptor = getDescriptor();
        B2.c b4 = decoder.b(descriptor);
        if (b4.v()) {
            e4 = e(c.a.c(b4, getDescriptor(), 0, b(), null, 8, null), c.a.c(b4, getDescriptor(), 1, d(), null, 8, null));
        } else {
            obj = P0.f241a;
            obj2 = P0.f241a;
            Object obj5 = obj2;
            while (true) {
                int t4 = b4.t(getDescriptor());
                if (t4 == -1) {
                    obj3 = P0.f241a;
                    if (obj == obj3) {
                        throw new C3534i("Element 'key' is missing");
                    }
                    obj4 = P0.f241a;
                    if (obj5 == obj4) {
                        throw new C3534i("Element 'value' is missing");
                    }
                    e4 = e(obj, obj5);
                } else if (t4 == 0) {
                    obj = c.a.c(b4, getDescriptor(), 0, b(), null, 8, null);
                } else {
                    if (t4 != 1) {
                        throw new C3534i("Invalid index: " + t4);
                    }
                    obj5 = c.a.c(b4, getDescriptor(), 1, d(), null, 8, null);
                }
            }
        }
        b4.c(descriptor);
        return e4;
    }

    protected abstract Object e(Object obj, Object obj2);

    @Override // y2.InterfaceC3535j
    public void serialize(B2.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        B2.d b4 = encoder.b(getDescriptor());
        b4.m(getDescriptor(), 0, this.f263a, a(obj));
        b4.m(getDescriptor(), 1, this.f264b, c(obj));
        b4.c(getDescriptor());
    }

    private Y(InterfaceC3527b interfaceC3527b, InterfaceC3527b interfaceC3527b2) {
        this.f263a = interfaceC3527b;
        this.f264b = interfaceC3527b2;
    }
}
