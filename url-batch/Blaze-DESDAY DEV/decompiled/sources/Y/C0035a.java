package Y;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: Y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1039a;

    /* renamed from: b, reason: collision with root package name */
    public int f1040b;

    /* renamed from: c, reason: collision with root package name */
    public int f1041c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1042e;

    /* renamed from: f, reason: collision with root package name */
    public int f1043f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1044g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1045j;

    /* renamed from: k, reason: collision with root package name */
    public int f1046k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1047l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1048m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1049n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1050o;

    /* renamed from: p, reason: collision with root package name */
    public final I f1051p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1052q;

    /* renamed from: r, reason: collision with root package name */
    public int f1053r;

    public C0035a(I i) {
        i.C();
        C0054u c0054u = i.f986t;
        if (c0054u != null) {
            c0054u.f1157b.getClassLoader();
        }
        this.f1039a = new ArrayList();
        this.f1050o = false;
        this.f1053r = -1;
        this.f1051p = i;
    }

    @Override // Y.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1044g) {
            return true;
        }
        I i = this.f1051p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f1039a.add(p2);
        p2.d = this.f1040b;
        p2.f1022e = this.f1041c;
        p2.f1023f = this.d;
        p2.f1024g = this.f1042e;
    }

    public final void c(int i) {
        if (this.f1044g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1039a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = p2.f1020b;
                if (abstractComponentCallbacksC0051q != null) {
                    abstractComponentCallbacksC0051q.f1140q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f1020b + " to " + p2.f1020b.f1140q);
                    }
                }
            }
        }
    }

    public final void d(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1053r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1052q);
            if (this.f1043f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1043f));
            }
            if (this.f1040b != 0 || this.f1041c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1040b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1041c));
            }
            if (this.d != 0 || this.f1042e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1042e));
            }
            if (this.i != 0 || this.f1045j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1045j);
            }
            if (this.f1046k != 0 || this.f1047l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1046k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1047l);
            }
        }
        ArrayList arrayList = this.f1039a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f1019a) {
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
                    str2 = "cmd=" + p2.f1019a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f1020b);
            if (z2) {
                if (p2.d != 0 || p2.f1022e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1022e));
                }
                if (p2.f1023f != 0 || p2.f1024g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f1023f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1024g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1053r >= 0) {
            sb.append(" #");
            sb.append(this.f1053r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
