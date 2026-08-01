package r1;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3174f;
    public final /* synthetic */ MaterialButton g;
    public final /* synthetic */ Drawable h;

    public /* synthetic */ a(MaterialButton materialButton, Drawable drawable, int i4) {
        this.f3174f = i4;
        this.g = materialButton;
        this.h = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f3174f;
        Drawable drawable = this.h;
        MaterialButton materialButton = this.g;
        switch (i4) {
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
