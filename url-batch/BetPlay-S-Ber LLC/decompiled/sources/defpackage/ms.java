package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class ms implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ MaterialButton g;
    public final /* synthetic */ Drawable h;

    public /* synthetic */ ms(MaterialButton materialButton, Drawable drawable, int i) {
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
