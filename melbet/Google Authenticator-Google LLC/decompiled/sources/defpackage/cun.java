package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cun extends cus {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long h;
    final /* synthetic */ GoogleHelp i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cun(cmv cmvVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(cmvVar);
        this.a = bundle;
        this.h = j;
        this.i = googleHelp;
    }

    @Override // defpackage.cur
    protected final void n(cux cuxVar) {
        try {
            Bundle bundle = this.a;
            long j = this.h;
            GoogleHelp googleHelp = this.i;
            cum cumVar = new cum(this);
            Parcel a = cuxVar.a();
            bmt.c(a, bundle);
            a.writeLong(j);
            bmt.c(a, googleHelp);
            bmt.d(a, cumVar);
            cuxVar.d(9, a);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            j(cut.a);
        }
    }
}
