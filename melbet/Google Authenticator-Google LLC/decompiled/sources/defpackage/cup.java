package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cup extends cus {
    final /* synthetic */ cto a;
    final /* synthetic */ Bundle h;
    final /* synthetic */ long i;
    final /* synthetic */ GoogleHelp j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cup(cmv cmvVar, cto ctoVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(cmvVar);
        this.a = ctoVar;
        this.h = bundle;
        this.i = j;
        this.j = googleHelp;
    }

    @Override // defpackage.cur
    protected final void n(cux cuxVar) {
        try {
            cto ctoVar = this.a;
            Bundle bundle = this.h;
            long j = this.i;
            GoogleHelp googleHelp = this.j;
            cuo cuoVar = new cuo(this);
            Parcel a = cuxVar.a();
            bmt.c(a, ctoVar);
            bmt.c(a, bundle);
            a.writeLong(j);
            bmt.c(a, googleHelp);
            bmt.d(a, cuoVar);
            cuxVar.d(10, a);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            j(cut.a);
        }
    }
}
