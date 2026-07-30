package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ka3 extends pa3 {
    public final /* synthetic */ Intent m;
    public final /* synthetic */ GoogleApiActivity n;

    public ka3(Intent intent, GoogleApiActivity googleApiActivity) {
        this.m = intent;
        this.n = googleApiActivity;
    }

    @Override // defpackage.pa3
    public final void a() {
        Intent intent = this.m;
        if (intent != null) {
            this.n.startActivityForResult(intent, 2);
        }
    }
}
