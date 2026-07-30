package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class GD extends AbstractC4107wD {

    /* renamed from: I, reason: collision with root package name */
    public FD f25114I;

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final void l() {
        FD fd = this.f25114I;
        if (fd != null) {
            fd.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4107wD
    public final void s(int i) {
        this.f34963E = null;
        if (i == 1) {
            this.f25114I = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4107wD
    public final void x(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4107wD
    public final void y() {
        FD fd = this.f25114I;
        if (fd != null) {
            try {
                fd.f24927v.execute(fd);
            } catch (RejectedExecutionException e6) {
                fd.f24928w.e(e6);
            }
        }
    }
}
