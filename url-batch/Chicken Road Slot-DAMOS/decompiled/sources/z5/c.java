package z5;

import android.os.Build;
import c6.p;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f10862f = o.f("NetworkMeteredCtrlr");

    @Override // z5.b
    public final boolean a(p pVar) {
        pVar.getClass();
        return pVar.j.f9293a == 5;
    }

    @Override // z5.b
    public final boolean b(Object obj) {
        y5.a aVar = (y5.a) obj;
        aVar.getClass();
        boolean z10 = aVar.f10619a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z10 && aVar.f10621c) ? false : true;
        }
        o.d().a(f10862f, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z10;
    }
}
