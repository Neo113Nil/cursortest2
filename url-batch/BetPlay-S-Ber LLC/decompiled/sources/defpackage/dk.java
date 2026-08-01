package defpackage;

import androidx.fragment.app.Fragment;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class dk implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Fragment g;

    public /* synthetic */ dk(Fragment fragment, int i) {
        this.f = i;
        this.g = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Fragment fragment = this.g;
        switch (i) {
            case 0:
                fragment.startPostponedEnterTransition();
                break;
            default:
                fragment.callStartTransitionListener(false);
                break;
        }
    }
}
