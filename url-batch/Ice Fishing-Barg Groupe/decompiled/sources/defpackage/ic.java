package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ic {
    public final /* synthetic */ int PxuCJdSBwIXG = 1;
    public boolean TSizfFm2Yiuu;
    public final Serializable Y1f8riQaR6yg;
    public final Object e9gEMXR7LXtO;
    public int lS5Rgt96tfkO;

    public ic(Context context, l1 l1Var) {
        this.Y1f8riQaR6yg = l1Var;
        do0.Companion.getClass();
        this.lS5Rgt96tfkO = 0;
        this.e9gEMXR7LXtO = new GestureDetector(context, new ro0(this));
    }

    public String toString() {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.lS5Rgt96tfkO >= 0) {
                    sb.append(" #");
                    sb.append(this.lS5Rgt96tfkO);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ic(id0 id0Var) {
        id0Var.getClass();
        this.Y1f8riQaR6yg = new ArrayList();
        this.lS5Rgt96tfkO = -1;
        this.e9gEMXR7LXtO = id0Var;
    }
}
