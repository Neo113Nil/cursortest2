package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
class apu extends apt {
    private static boolean a = true;

    @Override // defpackage.apr
    public void d(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.d(view, i);
        } else if (a) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
