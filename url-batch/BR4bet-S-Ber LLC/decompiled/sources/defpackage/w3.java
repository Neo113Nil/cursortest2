package defpackage;

import android.graphics.Typeface;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ w3(Object obj, Object obj2, int i) {
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
                x3 x3Var = (x3) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    x3Var.a();
                }
            case 1:
                m3 m3Var = (m3) obj2;
                m3Var.f.a(new oc((hz) obj, m3Var));
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
                ((b9) obj2).A((Typeface) obj);
                return;
        }
    }
}
