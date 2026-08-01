package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f378a;

    /* renamed from: b, reason: collision with root package name */
    public int f379b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f380d;

    /* renamed from: e, reason: collision with root package name */
    public int f381e;

    /* renamed from: f, reason: collision with root package name */
    public int f382f;
    public boolean g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public int f383i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f384j;

    /* renamed from: k, reason: collision with root package name */
    public int f385k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f386l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f387m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f388n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f389o;

    /* renamed from: p, reason: collision with root package name */
    public final k0 f390p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f391q;

    /* renamed from: r, reason: collision with root package name */
    public int f392r;

    public a(k0 k0Var) {
        k0Var.D();
        w wVar = k0Var.f451t;
        if (wVar != null) {
            wVar.f548l.getClassLoader();
        }
        this.f378a = new ArrayList();
        this.f389o = false;
        this.f392r = -1;
        this.f390p = k0Var;
    }

    @Override // androidx.fragment.app.i0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (k0.G(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        k0 k0Var = this.f390p;
        if (k0Var.f437d == null) {
            k0Var.f437d = new ArrayList();
        }
        k0Var.f437d.add(this);
        return true;
    }

    public final void b(r0 r0Var) {
        this.f378a.add(r0Var);
        r0Var.f505d = this.f379b;
        r0Var.f506e = this.c;
        r0Var.f507f = this.f380d;
        r0Var.g = this.f381e;
    }

    public final void c(int i4) {
        if (this.g) {
            if (k0.G(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
            }
            ArrayList arrayList = this.f378a;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                r0 r0Var = (r0) arrayList.get(i5);
                u uVar = r0Var.f504b;
                if (uVar != null) {
                    uVar.f534v += i4;
                    if (k0.G(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + r0Var.f504b + " to " + r0Var.f504b.f534v);
                    }
                }
            }
        }
    }

    public final void d(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f392r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f391q);
            if (this.f382f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f382f));
            }
            if (this.f379b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f379b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.f380d != 0 || this.f381e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f380d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f381e));
            }
            if (this.f383i != 0 || this.f384j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f383i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f384j);
            }
            if (this.f385k != 0 || this.f386l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f385k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f386l);
            }
        }
        ArrayList arrayList = this.f378a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            r0 r0Var = (r0) arrayList.get(i4);
            switch (r0Var.f503a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + r0Var.f503a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i4);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(r0Var.f504b);
            if (z3) {
                if (r0Var.f505d != 0 || r0Var.f506e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(r0Var.f505d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(r0Var.f506e));
                }
                if (r0Var.f507f != 0 || r0Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(r0Var.f507f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(r0Var.g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f392r >= 0) {
            sb.append(" #");
            sb.append(this.f392r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
