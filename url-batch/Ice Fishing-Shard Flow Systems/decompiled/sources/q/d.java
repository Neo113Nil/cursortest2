package q;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f7273e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f7274i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bundle f7275l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f7276m;

    public d(f fVar, int i2, Uri uri, boolean z7, Bundle bundle) {
        this.f7276m = fVar;
        this.f7272d = i2;
        this.f7273e = uri;
        this.f7274i = z7;
        this.f7275l = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7276m.f7285f.onRelationshipValidationResult(this.f7272d, this.f7273e, this.f7274i, this.f7275l);
    }
}
