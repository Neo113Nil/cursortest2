package Z;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: Z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1519a;

    /* renamed from: b, reason: collision with root package name */
    public int f1520b;

    /* renamed from: c, reason: collision with root package name */
    public int f1521c;

    /* renamed from: d, reason: collision with root package name */
    public int f1522d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1523f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1524g;

    /* renamed from: h, reason: collision with root package name */
    public String f1525h;
    public int i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public int f1526k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1527l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1528m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1529n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1530o;

    /* renamed from: p, reason: collision with root package name */
    public final I f1531p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1532q;

    /* renamed from: r, reason: collision with root package name */
    public int f1533r;

    public C0037a(I i) {
        i.C();
        C0056u c0056u = i.f1461t;
        if (c0056u != null) {
            c0056u.f1638c.getClassLoader();
        }
        this.f1519a = new ArrayList();
        this.f1530o = false;
        this.f1533r = -1;
        this.f1531p = i;
    }

    @Override // Z.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1524g) {
            return true;
        }
        I i = this.f1531p;
        if (i.f1448d == null) {
            i.f1448d = new ArrayList();
        }
        i.f1448d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f1519a.add(p2);
        p2.f1499d = this.f1520b;
        p2.e = this.f1521c;
        p2.f1500f = this.f1522d;
        p2.f1501g = this.e;
    }

    public final void c(int i) {
        if (this.f1524g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1519a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = p2.f1497b;
                if (abstractComponentCallbacksC0053q != null) {
                    abstractComponentCallbacksC0053q.f1621q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f1497b + " to " + p2.f1497b.f1621q);
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
            printWriter.print(this.f1525h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1533r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1532q);
            if (this.f1523f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1523f));
            }
            if (this.f1520b != 0 || this.f1521c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1520b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1521c));
            }
            if (this.f1522d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1522d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.f1526k != 0 || this.f1527l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1526k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1527l);
            }
        }
        ArrayList arrayList = this.f1519a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f1496a) {
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
                    str2 = "cmd=" + p2.f1496a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f1497b);
            if (z2) {
                if (p2.f1499d != 0 || p2.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f1499d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.e));
                }
                if (p2.f1500f != 0 || p2.f1501g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f1500f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1501g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1533r >= 0) {
            sb.append(" #");
            sb.append(this.f1533r);
        }
        if (this.f1525h != null) {
            sb.append(" ");
            sb.append(this.f1525h);
        }
        sb.append("}");
        return sb.toString();
    }
}
