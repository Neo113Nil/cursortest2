package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bg extends ng {
    boolean a;
    boolean b;
    public final brn e = new brn(new bf(this), (byte[]) null);
    final ael d = new ael(this);
    boolean c = true;

    public bg() {
        int i = 1;
        aE().b("android:support:lifecycle", new bn(this, i));
        r(new be(this, i));
        this.j.add(new be(this, 0));
        s(new dh(this, i));
    }

    private static boolean h(by byVar, aek aekVar) {
        boolean z = false;
        for (bd bdVar : byVar.h()) {
            if (bdVar != null) {
                if (bdVar.Q() != null) {
                    z |= h(bdVar.F(), aekVar);
                }
                ci ciVar = bdVar.ab;
                if (ciVar != null && ciVar.L().c.a(aek.d)) {
                    bdVar.ab.a.d(aekVar);
                    z = true;
                }
                if (bdVar.ag.c.a(aek.d)) {
                    bdVar.ag.d(aekVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final by a() {
        return this.e.X();
    }

    final View br(View view, String str, Context context, AttributeSet attributeSet) {
        return ((bl) this.e.a).e.d.onCreateView(view, str, context, attributeSet);
    }

    final void d() {
        while (h(a(), aek.c)) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0.equals("--list-dumpables") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L32;
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
        String concat = String.valueOf(str).concat("  ");
        printWriter.print(concat);
        printWriter.print("mCreated=");
        printWriter.print(this.a);
        printWriter.print(" mResumed=");
        printWriter.print(this.b);
        printWriter.print(" mStopped=");
        printWriter.print(this.c);
        if (getApplication() != null) {
            agt.a(this).c(concat, printWriter);
        }
        this.e.X().D(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.ng, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.e.Y();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.ng, defpackage.cp, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.b(aej.ON_CREATE);
        ((bl) this.e.a).e.q();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View br = br(null, str, context, attributeSet);
        return br == null ? super.onCreateView(str, context, attributeSet) : br;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ((bl) this.e.a).e.r();
        this.d.b(aej.ON_DESTROY);
    }

    @Override // defpackage.ng, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((bl) this.e.a).e.Q(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.b = false;
        ((bl) this.e.a).e.x();
        this.d.b(aej.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.d.b(aej.ON_RESUME);
        ((bl) this.e.a).e.z();
    }

    @Override // defpackage.ng, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.e.Y();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        brn brnVar = this.e;
        brnVar.Y();
        super.onResume();
        this.b = true;
        brnVar.Z();
    }

    @Override // android.app.Activity
    protected void onStart() {
        brn brnVar = this.e;
        brnVar.Y();
        super.onStart();
        this.c = false;
        if (!this.a) {
            this.a = true;
            ((bl) brnVar.a).e.o();
        }
        brnVar.Z();
        this.d.b(aej.ON_START);
        ((bl) brnVar.a).e.A();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.e.Y();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.c = true;
        d();
        ((bl) this.e.a).e.C();
        this.d.b(aej.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View br = br(view, str, context, attributeSet);
        return br == null ? super.onCreateView(view, str, context, attributeSet) : br;
    }

    @Deprecated
    public void e() {
    }
}
