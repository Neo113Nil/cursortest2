package defpackage;

import android.graphics.Typeface;
import android.widget.LinearLayout;
import androidx.fragment.app.k;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c4(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                d4 d4Var = (d4) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    d4Var.a();
                }
            case 1:
                k kVar = (k) obj2;
                kVar.f.a(new qb((lw) obj, kVar));
                return;
            case 2:
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
            default:
                ((l70) obj2).D((Typeface) obj);
                return;
        }
    }
}
