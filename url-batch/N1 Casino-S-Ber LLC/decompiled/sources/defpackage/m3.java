package defpackage;

import android.graphics.Typeface;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m3(Object obj, Object obj2, int i) {
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
                n3 n3Var = (n3) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    n3Var.a();
                }
            case 1:
                c3 c3Var = (c3) obj2;
                c3Var.f.a(new ob((ew) obj, c3Var));
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
                ((jw) obj2).N((Typeface) obj);
                return;
        }
    }
}
