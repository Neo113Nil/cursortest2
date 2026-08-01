package Y;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: Y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1371a;

    /* renamed from: b, reason: collision with root package name */
    public int f1372b;

    /* renamed from: c, reason: collision with root package name */
    public int f1373c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1374e;

    /* renamed from: f, reason: collision with root package name */
    public int f1375f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1376g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1377j;

    /* renamed from: k, reason: collision with root package name */
    public int f1378k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1379l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1380m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1381n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1382o;

    /* renamed from: p, reason: collision with root package name */
    public final I f1383p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1384q;

    /* renamed from: r, reason: collision with root package name */
    public int f1385r;

    public C0034a(I i) {
        i.C();
        C0053u c0053u = i.f1318t;
        if (c0053u != null) {
            c0053u.f1489b.getClassLoader();
        }
        this.f1371a = new ArrayList();
        this.f1382o = false;
        this.f1385r = -1;
        this.f1383p = i;
    }

    @Override // Y.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1376g) {
            return true;
        }
        I i = this.f1383p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f1371a.add(p2);
        p2.d = this.f1372b;
        p2.f1354e = this.f1373c;
        p2.f1355f = this.d;
        p2.f1356g = this.f1374e;
    }

    public final void c(int i) {
        if (this.f1376g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1371a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = p2.f1352b;
                if (abstractComponentCallbacksC0050q != null) {
                    abstractComponentCallbacksC0050q.f1472q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f1352b + " to " + p2.f1352b.f1472q);
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
            printWriter.print(this.f1385r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1384q);
            if (this.f1375f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1375f));
            }
            if (this.f1372b != 0 || this.f1373c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1372b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1373c));
            }
            if (this.d != 0 || this.f1374e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1374e));
            }
            if (this.i != 0 || this.f1377j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1377j);
            }
            if (this.f1378k != 0 || this.f1379l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1378k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1379l);
            }
        }
        ArrayList arrayList = this.f1371a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f1351a) {
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
                    str2 = "cmd=" + p2.f1351a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f1352b);
            if (z2) {
                if (p2.d != 0 || p2.f1354e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1354e));
                }
                if (p2.f1355f != 0 || p2.f1356g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f1355f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1356g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1385r >= 0) {
            sb.append(" #");
            sb.append(this.f1385r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
