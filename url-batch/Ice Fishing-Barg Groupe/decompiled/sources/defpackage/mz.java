package defpackage;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class mz implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, o01, pr2, bj0, qz1 {
    public static final Object VhhvGxCb8gfr = null;
    public final kz BRwzKIf41E4i;
    public boolean EcgxDIVH5in8;
    public final ArrayList QrzZRwfaDlRX;
    public int RfyTYNmI9Srp;
    public boolean S9EYkSpbGuxq;
    public final boolean XL4ISE6Oc65B;
    public s01 cpQdD2nAriOS;
    public final lz gPXPFXrUH4XX;
    public nz1 r3s1LDPKFs1S;
    public final int rtx2ld2ELZv4 = -1;
    public final String OPXfSBeufaJ8 = UUID.randomUUID().toString();
    public final id0 wdg6QnbFHrFF = new id0();
    public final boolean dgRBjINgWbAK = true;
    public final f01 x50lh2ztY7Y5 = f01.x50lh2ztY7Y5;

    public mz() {
        int i = 1;
        new f81();
        new AtomicInteger();
        this.QrzZRwfaDlRX = new ArrayList();
        this.gPXPFXrUH4XX = new lz(this);
        this.cpQdD2nAriOS = new s01(this, true);
        nz1.Companion.getClass();
        this.r3s1LDPKFs1S = mz1.PxuCJdSBwIXG(this);
        ArrayList arrayList = this.QrzZRwfaDlRX;
        lz lzVar = this.gPXPFXrUH4XX;
        if (!arrayList.contains(lzVar)) {
            if (this.rtx2ld2ELZv4 >= 0) {
                mz mzVar = lzVar.PxuCJdSBwIXG;
                mzVar.r3s1LDPKFs1S.PxuCJdSBwIXG();
                mm2.J54yh1s3n4Aq(mzVar);
            } else {
                arrayList.add(lzVar);
            }
        }
        new o1(i, this);
        this.BRwzKIf41E4i = new kz();
        this.XL4ISE6Oc65B = true;
        this.RfyTYNmI9Srp = -1;
        new lz(this);
    }

    public final id0 PxuCJdSBwIXG() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // defpackage.pr2
    public final or2 RAsUl2FVSrh6() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // defpackage.qz1
    public final cr1 TSizfFm2Yiuu() {
        return this.r3s1LDPKFs1S.lS5Rgt96tfkO;
    }

    public final View Y1f8riQaR6yg() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // defpackage.bj0
    public final zu a92UlCVFR9N8() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // defpackage.bj0
    public final kr2 e9gEMXR7LXtO() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.EcgxDIVH5in8) {
            return;
        }
        if (id0.cpQdD2nAriOS(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.S9EYkSpbGuxq) {
            return;
        }
        this.S9EYkSpbGuxq = true;
        this.EcgxDIVH5in8 = true;
        if (this.RfyTYNmI9Srp >= 0) {
            id0 PxuCJdSBwIXG = PxuCJdSBwIXG();
            int i = this.RfyTYNmI9Srp;
            if (i < 0) {
                u9.XL4ISE6Oc65B(o0.wdg6QnbFHrFF("Bad id: ", i));
                return;
            }
            synchronized (((ArrayList) PxuCJdSBwIXG.TSizfFm2Yiuu)) {
            }
            this.RfyTYNmI9Srp = -1;
            return;
        }
        ic icVar = new ic(PxuCJdSBwIXG());
        kd0 kd0Var = new kd0();
        kd0Var.PxuCJdSBwIXG = 3;
        kd0Var.lS5Rgt96tfkO = this;
        ((ArrayList) icVar.Y1f8riQaR6yg).add(kd0Var);
        kd0Var.TSizfFm2Yiuu = 0;
        kd0Var.Y1f8riQaR6yg = 0;
        kd0Var.e9gEMXR7LXtO = 0;
        kd0Var.a92UlCVFR9N8 = 0;
        id0 id0Var = (id0) icVar.e9gEMXR7LXtO;
        if (icVar.TSizfFm2Yiuu) {
            u9.rtx2ld2ELZv4("commit already called");
            return;
        }
        if (id0.cpQdD2nAriOS(2)) {
            Log.v("FragmentManager", "Commit: " + icVar);
            PrintWriter printWriter = new PrintWriter(new a31());
            ArrayList arrayList = (ArrayList) icVar.Y1f8riQaR6yg;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(icVar.lS5Rgt96tfkO);
            printWriter.print(" mCommitted=");
            printWriter.println(icVar.TSizfFm2Yiuu);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    kd0 kd0Var2 = (kd0) arrayList.get(i2);
                    switch (kd0Var2.PxuCJdSBwIXG) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + kd0Var2.PxuCJdSBwIXG;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(kd0Var2.lS5Rgt96tfkO);
                    if (kd0Var2.TSizfFm2Yiuu != 0 || kd0Var2.Y1f8riQaR6yg != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(kd0Var2.TSizfFm2Yiuu));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(kd0Var2.Y1f8riQaR6yg));
                    }
                    if (kd0Var2.e9gEMXR7LXtO != 0 || kd0Var2.a92UlCVFR9N8 != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(kd0Var2.e9gEMXR7LXtO));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(kd0Var2.a92UlCVFR9N8));
                    }
                }
            }
            printWriter.close();
        }
        icVar.TSizfFm2Yiuu = true;
        icVar.lS5Rgt96tfkO = -1;
        synchronized (((ArrayList) id0Var.TSizfFm2Yiuu)) {
        }
    }

    @Override // defpackage.o01
    public final s01 rtx2ld2ELZv4() {
        return this.cpQdD2nAriOS;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.OPXfSBeufaJ8);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
