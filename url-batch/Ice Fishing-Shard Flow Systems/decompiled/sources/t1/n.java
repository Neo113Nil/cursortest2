package t1;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Intent f7974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GoogleApiActivity f7975e;

    public n(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f7974d = intent;
        this.f7975e = googleApiActivity;
    }

    @Override // t1.o
    public final void a() {
        Intent intent = this.f7974d;
        if (intent != null) {
            this.f7975e.startActivityForResult(intent, 2);
        }
    }
}
