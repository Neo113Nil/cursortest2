package z;

import b0.G;
import e2.InterfaceC0424c;
import r0.InterfaceC0919p;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1239c extends f2.h implements InterfaceC0424c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1258v f10435l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1239c(C1258v c1258v) {
        super(1, f2.i.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f10435l = c1258v;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        float[] fArr = ((G) obj).f5350a;
        InterfaceC0919p interfaceC0919p = (InterfaceC0919p) this.f10435l.f10474t.getValue();
        if (interfaceC0919p != null) {
            if (!interfaceC0919p.o()) {
                interfaceC0919p = null;
            }
            if (interfaceC0919p != null) {
                interfaceC0919p.u(fArr);
            }
        }
        return R1.y.f4171a;
    }
}
