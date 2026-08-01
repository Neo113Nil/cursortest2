package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import defpackage.ac;
import defpackage.gq;
import defpackage.hd;
import defpackage.hq;
import defpackage.j1;
import defpackage.kk;
import defpackage.o8;
import defpackage.qr;
import defpackage.r3;
import defpackage.r6;
import defpackage.t30;
import defpackage.tb;
import defpackage.tl;
import defpackage.ub;
import defpackage.xk;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class k extends ac {
    public boolean B;
    public boolean C;
    public final j1 z;
    public final androidx.lifecycle.a A = new androidx.lifecycle.a(this);
    public boolean D = true;

    public k() {
        final r3 r3Var = (r3) this;
        this.z = new j1(19, new kk(r3Var));
        this.i.b.c("android:support:lifecycle", new tb(1, r3Var));
        final int i = 0;
        this.n.add(new hd() { // from class: jk
            @Override // defpackage.hd
            public final void accept(Object obj) {
                int i2 = i;
                r3 r3Var2 = r3Var;
                switch (i2) {
                    case 0:
                        r3Var2.z.w();
                        break;
                    default:
                        r3Var2.z.w();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.p.add(new hd() { // from class: jk
            @Override // defpackage.hd
            public final void accept(Object obj) {
                int i22 = i2;
                r3 r3Var2 = r3Var;
                switch (i22) {
                    case 0:
                        r3Var2.z.w();
                        break;
                    default:
                        r3Var2.z.w();
                        break;
                }
            }
        });
        n(new ub(r3Var, 1));
    }

    public static boolean p(n nVar) {
        boolean z = false;
        for (Fragment fragment : nVar.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= p(fragment.getChildFragmentManager());
                }
                tl tlVar = fragment.mViewLifecycleOwner;
                hq hqVar = hq.h;
                hq hqVar2 = hq.i;
                if (tlVar != null) {
                    tlVar.b();
                    if (tlVar.h.c.compareTo(hqVar2) >= 0) {
                        androidx.lifecycle.a aVar = fragment.mViewLifecycleOwner.h;
                        aVar.d("setCurrentState");
                        aVar.f(hqVar);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.c.compareTo(hqVar2) >= 0) {
                    androidx.lifecycle.a aVar2 = fragment.mLifecycleRegistry;
                    aVar2.d("setCurrentState");
                    aVar2.f(hqVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L34;
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
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
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
            r6 r6Var = new r6(getViewModelStore(), qr.e);
            String canonicalName = qr.class.getCanonicalName();
            if (canonicalName == null) {
                o8.j("Local and anonymous classes can not be ViewModels");
                return;
            }
            t30 t30Var = ((qr) r6Var.g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), qr.class)).d;
            if (t30Var.h > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (t30Var.h > 0) {
                    if (t30Var.g[0] != null) {
                        o8.c();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(t30Var.f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((kk) this.z.g).i.u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.ac, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.z.w();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.ac, defpackage.zb, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A.e(gq.ON_CREATE);
        xk xkVar = ((kk) this.z.g).i;
        xkVar.E = false;
        xkVar.F = false;
        xkVar.L.i = false;
        xkVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((kk) this.z.g).i.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((kk) this.z.g).i.k();
        this.A.e(gq.ON_DESTROY);
    }

    @Override // defpackage.ac, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((kk) this.z.g).i.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.C = false;
        ((kk) this.z.g).i.t(5);
        this.A.e(gq.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.A.e(gq.ON_RESUME);
        xk xkVar = ((kk) this.z.g).i;
        xkVar.E = false;
        xkVar.F = false;
        xkVar.L.i = false;
        xkVar.t(7);
    }

    @Override // defpackage.ac, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.z.w();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        j1 j1Var = this.z;
        j1Var.w();
        super.onResume();
        this.C = true;
        ((kk) j1Var.g).i.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        j1 j1Var = this.z;
        j1Var.w();
        kk kkVar = (kk) j1Var.g;
        super.onStart();
        this.D = false;
        if (!this.B) {
            this.B = true;
            xk xkVar = kkVar.i;
            xkVar.E = false;
            xkVar.F = false;
            xkVar.L.i = false;
            xkVar.t(4);
        }
        kkVar.i.x(true);
        this.A.e(gq.ON_START);
        xk xkVar2 = kkVar.i;
        xkVar2.E = false;
        xkVar2.F = false;
        xkVar2.L.i = false;
        xkVar2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.z.w();
    }

    @Override // android.app.Activity
    public void onStop() {
        j1 j1Var;
        super.onStop();
        this.D = true;
        do {
            j1Var = this.z;
        } while (p(((kk) j1Var.g).i));
        xk xkVar = ((kk) j1Var.g).i;
        xkVar.F = true;
        xkVar.L.i = true;
        xkVar.t(4);
        this.A.e(gq.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((kk) this.z.g).i.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }
}
