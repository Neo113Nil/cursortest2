package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxh extends kqe implements kwu {
    public static final kxh a = new kxh();

    private kxh() {
        super(kwu.d);
    }

    @Override // defpackage.kwu
    public final kwu cd() {
        return null;
    }

    @Override // defpackage.kwu
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.kwu
    public final CancellationException p() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.kwu
    public final kwc q(boolean z, boolean z2, krt krtVar) {
        return kxi.a;
    }

    @Override // defpackage.kwu
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.kwu
    public final kva v(kxb kxbVar) {
        return kxi.a;
    }

    @Override // defpackage.kwu
    public final void x() {
    }

    @Override // defpackage.kwu
    public final void s(CancellationException cancellationException) {
    }

    @Override // defpackage.kwu
    public final void w(krt krtVar) {
    }
}
