package defpackage;

import androidx.fragment.app.b;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ b g;

    public /* synthetic */ nd(b bVar, int i) {
        this.f = i;
        this.g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        b bVar = this.g;
        switch (i) {
            case 0:
                yd.f(bVar);
                break;
            default:
                bVar.invalidateOptionsMenu();
                break;
        }
    }
}
