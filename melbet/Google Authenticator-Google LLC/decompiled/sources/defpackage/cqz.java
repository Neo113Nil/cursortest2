package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqz implements cmy {
    final /* synthetic */ cmz a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public cqz(cmz cmzVar, bst bstVar, int i) {
        this.c = i;
        this.a = cmzVar;
        this.b = bstVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.cmy
    public final void a(Status status) {
        if (this.c != 0) {
            ((fwm) this.b).a.remove(this.a);
        } else if (status.c()) {
            this.a.e(TimeUnit.MILLISECONDS);
            ((bst) this.b).c(null);
        } else {
            ((bst) this.b).b(ox.o(status));
        }
    }

    public cqz(fwm fwmVar, BasePendingResult basePendingResult, int i) {
        this.c = i;
        this.a = basePendingResult;
        this.b = fwmVar;
    }
}
