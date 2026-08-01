package defpackage;

import androidx.fragment.app.k;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class rb implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ k g;

    public /* synthetic */ rb(k kVar, int i) {
        this.f = i;
        this.g = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        k kVar = this.g;
        switch (i) {
            case 0:
                kVar.invalidateOptionsMenu();
                break;
            default:
                ac.m(kVar);
                break;
        }
    }
}
