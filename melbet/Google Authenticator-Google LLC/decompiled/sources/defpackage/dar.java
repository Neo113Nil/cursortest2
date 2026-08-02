package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dar extends cyp {
    final /* synthetic */ fso a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dar(cmv cmvVar, fso fsoVar) {
        super(cmvVar);
        this.a = fsoVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ cnc a(Status status) {
        return new daq(status);
    }

    @Override // defpackage.cnq
    protected final /* bridge */ /* synthetic */ void b(cmh cmhVar) {
        ((dan) cmhVar).K(this, this.a.a);
    }
}
