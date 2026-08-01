package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class zu implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ MaterialButton g;
    public final /* synthetic */ Drawable h;

    public /* synthetic */ zu(MaterialButton materialButton, Drawable drawable, int i) {
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
