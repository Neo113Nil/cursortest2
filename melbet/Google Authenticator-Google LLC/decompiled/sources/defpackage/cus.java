package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class cus extends cur {
    public cus(cmv cmvVar) {
        super(cmvVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ cnc a(Status status) {
        return status == null ? Status.c : status;
    }
}
