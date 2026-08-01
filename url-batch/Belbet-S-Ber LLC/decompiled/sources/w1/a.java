package w1;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3779f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f3780g;
    public final /* synthetic */ Drawable h;

    public /* synthetic */ a(MaterialButton materialButton, Drawable drawable, int i) {
        this.f3779f = i;
        this.f3780g = materialButton;
        this.h = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3779f;
        Drawable drawable = this.h;
        MaterialButton materialButton = this.f3780g;
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
