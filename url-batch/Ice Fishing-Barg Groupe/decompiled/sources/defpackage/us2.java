package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class us2 extends WindowInsetsAnimation$Callback {
    public final ns2 PxuCJdSBwIXG;
    public ArrayList TSizfFm2Yiuu;
    public final HashMap Y1f8riQaR6yg;
    public List lS5Rgt96tfkO;

    public us2(ns2 ns2Var) {
        super(ns2Var.OPXfSBeufaJ8);
        this.Y1f8riQaR6yg = new HashMap();
        this.PxuCJdSBwIXG = ns2Var;
    }

    public final xs2 PxuCJdSBwIXG(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.Y1f8riQaR6yg;
        xs2 xs2Var = (xs2) hashMap.get(windowInsetsAnimation);
        if (xs2Var != null) {
            return xs2Var;
        }
        xs2 xs2Var2 = new xs2(0, null, 0L);
        xs2Var2.PxuCJdSBwIXG = new vs2(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, xs2Var2);
        return xs2Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.PxuCJdSBwIXG.lS5Rgt96tfkO(PxuCJdSBwIXG(windowInsetsAnimation));
        this.Y1f8riQaR6yg.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.PxuCJdSBwIXG.TSizfFm2Yiuu(PxuCJdSBwIXG(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.TSizfFm2Yiuu;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.TSizfFm2Yiuu = arrayList2;
            this.lS5Rgt96tfkO = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation e9gEMXR7LXtO = ts2.e9gEMXR7LXtO(list.get(size));
            xs2 PxuCJdSBwIXG = PxuCJdSBwIXG(e9gEMXR7LXtO);
            fraction = e9gEMXR7LXtO.getFraction();
            PxuCJdSBwIXG.PxuCJdSBwIXG.e9gEMXR7LXtO(fraction);
            this.TSizfFm2Yiuu.add(PxuCJdSBwIXG);
        }
        return this.PxuCJdSBwIXG.Y1f8riQaR6yg(rt2.TSizfFm2Yiuu(windowInsets, null), this.lS5Rgt96tfkO).lS5Rgt96tfkO();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        cr1 e9gEMXR7LXtO = this.PxuCJdSBwIXG.e9gEMXR7LXtO(PxuCJdSBwIXG(windowInsetsAnimation), new cr1(bounds));
        e9gEMXR7LXtO.getClass();
        uURZJOrwXbxn.QrzZRwfaDlRX();
        return uURZJOrwXbxn.OPXfSBeufaJ8(((wp0) e9gEMXR7LXtO.OPXfSBeufaJ8).e9gEMXR7LXtO(), ((wp0) e9gEMXR7LXtO.wdg6QnbFHrFF).e9gEMXR7LXtO());
    }
}
