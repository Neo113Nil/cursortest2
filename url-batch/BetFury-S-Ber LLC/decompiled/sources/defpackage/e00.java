package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class e00 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ MaterialButton g;
    public final /* synthetic */ Drawable h;

    public /* synthetic */ e00(MaterialButton materialButton, Drawable drawable, int i) {
        this.f = i;
        this.g = materialButton;
        this.h = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Drawable drawable = this.h;
        MaterialButton materialButton = this.g;
        switch (i) {
            case 0:
                int[] iArr = MaterialButton.S;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.S;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
