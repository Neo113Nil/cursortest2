package androidx.activity;

import android.graphics.Typeface;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f124f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ n(Object obj, Object obj2, int i4) {
        this.f124f = i4;
        this.g = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f124f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i4) {
            case 0:
                f.i iVar = (f.i) obj2;
                int i5 = o.f125w;
                iVar.f126f.a(new h((h0) obj, iVar));
                return;
            case 1:
                ((b0.b) obj2).h((Typeface) obj);
                return;
            case 2:
                f.n nVar = (f.n) obj2;
                Runnable runnable = (Runnable) obj;
                nVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    nVar.a();
                }
            default:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr = MaterialButton.S;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams = materialButton.H;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.H = null;
                    materialButton.E = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
        }
    }
}
