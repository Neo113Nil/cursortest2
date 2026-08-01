package c7;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f1980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleApiActivity f1981b;

    public s(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f1980a = intent;
        this.f1981b = googleApiActivity;
    }

    @Override // c7.t
    public final void a() {
        Intent intent = this.f1980a;
        if (intent != null) {
            this.f1981b.startActivityForResult(intent, 2);
        }
    }
}
