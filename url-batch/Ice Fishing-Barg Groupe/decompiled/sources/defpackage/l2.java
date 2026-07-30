package defpackage;

import android.util.LongSparseArray;
import com.ice.fishing.grenza.MainActivity;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ l2(int i, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.wdg6QnbFHrFF;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                ov2.IAToe7bXGz4N((o2) obj2, (LongSparseArray) obj);
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj2;
                mainActivity.rtx2ld2ELZv4.PxuCJdSBwIXG(new xm((uf1) obj, mainActivity));
                return;
            case 2:
                rk2 rk2Var = (rk2) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                    rk2Var.PxuCJdSBwIXG();
                }
            default:
                av2 av2Var = (av2) obj2;
                s01 s01Var = (s01) obj;
                if (av2Var.wdg6QnbFHrFF) {
                    return;
                }
                av2Var.dgRBjINgWbAK = s01Var;
                s01Var.PxuCJdSBwIXG(av2Var);
                return;
        }
    }
}
