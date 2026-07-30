package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p03 extends l03 {
    public final /* synthetic */ int a;

    public /* synthetic */ p03(int i) {
        this.a = i;
    }

    @Override // defpackage.l03
    public final Object a(z61 z61Var) {
        switch (this.a) {
            case 0:
                try {
                    return new AtomicInteger(z61Var.C());
                } catch (NumberFormatException e) {
                    throw new a71(e);
                }
            default:
                return new AtomicBoolean(z61Var.A());
        }
    }
}
