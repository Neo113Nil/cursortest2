package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnw {
    final /* synthetic */ BasePendingResult a;

    public cnw(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() {
        ThreadLocal threadLocal = BasePendingResult.b;
        BasePendingResult.k(this.a.e);
        super.finalize();
    }
}
