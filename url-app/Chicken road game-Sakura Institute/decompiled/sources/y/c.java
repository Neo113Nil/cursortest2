package y;

import d6.z;
import z0.f0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class c extends r6.h implements q6.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f9708n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q qVar) {
        super(1, r6.j.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f9708n = qVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        float[] fArr = ((f0) obj).f9990a;
        p1.p pVar = (p1.p) this.f9708n.f9727v.getValue();
        if (pVar != null) {
            if (!pVar.O()) {
                pVar = null;
            }
            if (pVar != null) {
                pVar.R(fArr);
            }
        }
        return z.f2639a;
    }
}
