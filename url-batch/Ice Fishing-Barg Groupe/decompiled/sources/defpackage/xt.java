package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xt implements le0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public xt(na0 na0Var, yz0 yz0Var) {
        this.rtx2ld2ELZv4 = 3;
        this.wdg6QnbFHrFF = na0Var;
        this.OPXfSBeufaJ8 = yz0Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        long j;
        boolean z = false;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                KeyEvent keyEvent = ((qu0) obj).PxuCJdSBwIXG;
                if (((yz0) this.OPXfSBeufaJ8).PxuCJdSBwIXG() == mi0.OPXfSBeufaJ8 && keyEvent.getKeyCode() == 4) {
                    int S9EYkSpbGuxq = jh0.S9EYkSpbGuxq(keyEvent);
                    su0.Companion.getClass();
                    if (S9EYkSpbGuxq == 1) {
                        ((eh2) this.wdg6QnbFHrFF).RAsUl2FVSrh6(null);
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                q72 q72Var = (q72) obj;
                synchronized (s72.TSizfFm2Yiuu) {
                    j = s72.e9gEMXR7LXtO;
                    s72.e9gEMXR7LXtO = 1 + j;
                }
                return new b91(j, q72Var, (le0) this.OPXfSBeufaJ8, (le0) this.wdg6QnbFHrFF);
            case 2:
                jv jvVar = (jv) this.OPXfSBeufaJ8;
                Object obj2 = jvVar.lS5Rgt96tfkO;
                bi biVar = (bi) this.wdg6QnbFHrFF;
                synchronized (obj2) {
                    ((ArrayList) jvVar.TSizfFm2Yiuu).remove(biVar);
                }
                return no2.PxuCJdSBwIXG;
            default:
                KeyEvent keyEvent2 = ((qu0) obj).PxuCJdSBwIXG;
                na0 na0Var = (na0) this.wdg6QnbFHrFF;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && (!device.isVirtual() || keyEvent2.getSource() == 33554433)) {
                    int S9EYkSpbGuxq2 = jh0.S9EYkSpbGuxq(keyEvent2);
                    su0.Companion.getClass();
                    if (S9EYkSpbGuxq2 == 2 && keyEvent2.getSource() != 257) {
                        if (th0.e9gEMXR7LXtO(19, keyEvent2)) {
                            ga0.Companion.getClass();
                            z = ((qa0) na0Var).RAsUl2FVSrh6(5, true);
                        } else if (th0.e9gEMXR7LXtO(20, keyEvent2)) {
                            ga0.Companion.getClass();
                            z = ((qa0) na0Var).RAsUl2FVSrh6(6, true);
                        } else if (th0.e9gEMXR7LXtO(21, keyEvent2)) {
                            ga0.Companion.getClass();
                            z = ((qa0) na0Var).RAsUl2FVSrh6(3, true);
                        } else if (th0.e9gEMXR7LXtO(22, keyEvent2)) {
                            ga0.Companion.getClass();
                            z = ((qa0) na0Var).RAsUl2FVSrh6(4, true);
                        } else if (th0.e9gEMXR7LXtO(23, keyEvent2)) {
                            j82 j82Var = ((yz0) this.OPXfSBeufaJ8).TSizfFm2Yiuu;
                            if (j82Var != null) {
                                ((wx) j82Var).lS5Rgt96tfkO();
                            }
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ xt(int i, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
    }
}
