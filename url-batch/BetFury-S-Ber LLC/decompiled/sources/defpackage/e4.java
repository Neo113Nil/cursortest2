package defpackage;

import android.graphics.Typeface;
import android.widget.LinearLayout;
import androidx.fragment.app.b;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e4(Runnable runnable, f4 f4Var) {
        this.f = 4;
        this.h = runnable;
        this.g = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f4 f4Var;
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                f4Var = (f4) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                }
            case 1:
                b bVar = (b) obj;
                bVar.f.a(new pd((y40) obj2, bVar));
                return;
            case 2:
                MaterialButton materialButton = (MaterialButton) obj;
                int[] iArr = MaterialButton.S;
                ((Runnable) obj2).run();
                LinearLayout.LayoutParams layoutParams = materialButton.H;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.H = null;
                    materialButton.E = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case 3:
                ((bi) obj).O((Typeface) obj2);
                return;
            default:
                f4Var = (f4) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ e4(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
