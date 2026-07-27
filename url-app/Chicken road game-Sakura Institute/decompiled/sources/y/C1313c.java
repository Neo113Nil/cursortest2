package y;

import Z.E;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.InterfaceC0980p;

/* renamed from: y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1313c extends M2.m implements Function1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f11463o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1313c(v vVar) {
        super(1, M2.o.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f11463o = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((E) obj).f4456a;
        InterfaceC0980p interfaceC0980p = (InterfaceC0980p) this.f11463o.f11502w.getValue();
        if (interfaceC0980p != null) {
            if (!interfaceC0980p.p()) {
                interfaceC0980p = null;
            }
            if (interfaceC0980p != null) {
                interfaceC0980p.u(fArr);
            }
        }
        return Unit.f7487a;
    }
}
