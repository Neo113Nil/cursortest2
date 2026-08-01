package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import defpackage.fx;
import defpackage.gx;
import defpackage.i5;
import defpackage.kq;
import defpackage.nx;
import defpackage.o0;
import defpackage.rd;
import defpackage.sd;
import defpackage.u3;
import defpackage.uf;
import defpackage.vq;
import defpackage.xp;
import defpackage.yd;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class b extends yd {
    public boolean B;
    public boolean C;
    public final o0 z;
    public final nx A = new nx(this);
    public boolean D = true;

    public b() {
        final u3 u3Var = (u3) this;
        this.z = new o0(24, new xp(u3Var));
        ((i5) this.i.h).N("android:support:lifecycle", new rd(1, u3Var));
        final int i = 0;
        this.o.add(new uf() { // from class: wp
            @Override // defpackage.uf
            public final void accept(Object obj) {
                int i2 = i;
                u3 u3Var2 = u3Var;
                switch (i2) {
                    case 0:
                        u3Var2.z.C();
                        break;
                    default:
                        u3Var2.z.C();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.q.add(new uf() { // from class: wp
            @Override // defpackage.uf
            public final void accept(Object obj) {
                int i22 = i2;
                u3 u3Var2 = u3Var;
                switch (i22) {
                    case 0:
                        u3Var2.z.C();
                        break;
                    default:
                        u3Var2.z.C();
                        break;
                }
            }
        });
        g(new sd(u3Var, 1));
    }

    public static boolean j(c cVar, gx gxVar) {
        boolean z = false;
        for (a aVar : cVar.c.f()) {
            if (aVar != null) {
                xp xpVar = aVar.x;
                if ((xpVar == null ? null : xpVar.s) != null) {
                    z |= j(aVar.g(), gxVar);
                }
                vq vqVar = aVar.S;
                if (vqVar != null) {
                    vqVar.f();
                    if (vqVar.h.c.isAtLeast(gx.STARTED)) {
                        nx nxVar = aVar.S.h;
                        nxVar.getClass();
                        gxVar.getClass();
                        nxVar.c("setCurrentState");
                        nxVar.e(gxVar);
                        z = true;
                    }
                }
                if (aVar.R.c.isAtLeast(gx.STARTED)) {
                    nx nxVar2 = aVar.R;
                    nxVar2.getClass();
                    gxVar.getClass();
                    nxVar2.c("setCurrentState");
                    nxVar2.e(gxVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.equals("--list-dumpables") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L34;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.B);
        printWriter.print(" mResumed=");
        printWriter.print(this.C);
        printWriter.print(" mStopped=");
        printWriter.print(this.D);
        if (getApplication() != null) {
            new androidx.loader.app.b(this, d()).a(str3, fileDescriptor, printWriter, strArr);
        }
        ((xp) this.z.g).r.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.yd, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.z.C();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.yd, defpackage.xd, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A.d(fx.ON_CREATE);
        kq kqVar = ((xp) this.z.g).r;
        kqVar.E = false;
        kqVar.F = false;
        kqVar.L.setIsStateSaved(false);
        kqVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((xp) this.z.g).r.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((xp) this.z.g).r.k();
        this.A.d(fx.ON_DESTROY);
    }

    @Override // defpackage.yd, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((xp) this.z.g).r.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.C = false;
        ((xp) this.z.g).r.t(5);
        this.A.d(fx.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.A.d(fx.ON_RESUME);
        kq kqVar = ((xp) this.z.g).r;
        kqVar.E = false;
        kqVar.F = false;
        kqVar.L.setIsStateSaved(false);
        kqVar.t(7);
    }

    @Override // defpackage.yd, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.z.C();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        o0 o0Var = this.z;
        o0Var.C();
        super.onResume();
        this.C = true;
        ((xp) o0Var.g).r.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        o0 o0Var = this.z;
        o0Var.C();
        xp xpVar = (xp) o0Var.g;
        super.onStart();
        this.D = false;
        if (!this.B) {
            this.B = true;
            kq kqVar = xpVar.r;
            kqVar.E = false;
            kqVar.F = false;
            kqVar.L.setIsStateSaved(false);
            kqVar.t(4);
        }
        xpVar.r.y(true);
        this.A.d(fx.ON_START);
        kq kqVar2 = xpVar.r;
        kqVar2.E = false;
        kqVar2.F = false;
        kqVar2.L.setIsStateSaved(false);
        kqVar2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.z.C();
    }

    @Override // android.app.Activity
    public void onStop() {
        o0 o0Var;
        super.onStop();
        this.D = true;
        do {
            o0Var = this.z;
        } while (j(((xp) o0Var.g).r, gx.CREATED));
        kq kqVar = ((xp) o0Var.g).r;
        kqVar.F = true;
        kqVar.L.setIsStateSaved(true);
        kqVar.t(4);
        this.A.d(fx.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((xp) this.z.g).r.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }
}
