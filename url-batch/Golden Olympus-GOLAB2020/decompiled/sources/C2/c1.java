package C2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class c1 implements InterfaceC3527b {

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f274b = new c1();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C0330q0 f275a = new C0330q0("kotlin.Unit", Unit.f41027a);

    private c1() {
    }

    public void a(B2.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f275a.deserialize(decoder);
    }

    @Override // y2.InterfaceC3535j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(B2.f encoder, Unit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f275a.serialize(encoder, value);
    }

    @Override // y2.InterfaceC3526a
    public /* bridge */ /* synthetic */ Object deserialize(B2.e eVar) {
        a(eVar);
        return Unit.f41027a;
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return this.f275a.getDescriptor();
    }
}
