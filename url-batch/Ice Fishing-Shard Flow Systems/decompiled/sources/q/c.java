package q;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7269e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bundle f7270i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f7271l;

    public /* synthetic */ c(f fVar, String str, Bundle bundle, int i2) {
        this.f7268d = i2;
        this.f7271l = fVar;
        this.f7269e = str;
        this.f7270i = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7268d) {
            case 0:
                this.f7271l.f7285f.extraCallback(this.f7269e, this.f7270i);
                break;
            default:
                this.f7271l.f7285f.onPostMessage(this.f7269e, this.f7270i);
                break;
        }
    }
}
