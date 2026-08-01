package n4;

import android.content.Context;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f7076e;

    public /* synthetic */ j(x xVar, int i3) {
        this.f7075d = i3;
        this.f7076e = xVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i3;
        switch (this.f7075d) {
            case 0:
                x xVar = this.f7076e;
                d.d0 d0Var = xVar.f7134f;
                boolean z10 = false;
                if (xVar.g) {
                    kotlin.collections.s sVar = xVar.f7130b.f7999f;
                    if (sVar == null || !sVar.isEmpty()) {
                        Iterator it = sVar.iterator();
                        i3 = 0;
                        while (it.hasNext()) {
                            if (!(((h) it.next()).f7063e instanceof u) && (i3 = i3 + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i3 = 0;
                    }
                    if (i3 > 1) {
                        z10 = true;
                    }
                }
                d0Var.d(z10);
                return Unit.f5554a;
            default:
                x xVar2 = this.f7076e;
                Context context = xVar2.f7129a;
                i0 i0Var = xVar2.f7130b.f8010s;
                context.getClass();
                i0Var.getClass();
                return new y();
        }
    }
}
