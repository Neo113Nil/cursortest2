package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044a implements I {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1300a;

    /* renamed from: b, reason: collision with root package name */
    public int f1301b;

    /* renamed from: c, reason: collision with root package name */
    public int f1302c;

    /* renamed from: d, reason: collision with root package name */
    public int f1303d;

    /* renamed from: e, reason: collision with root package name */
    public int f1304e;

    /* renamed from: f, reason: collision with root package name */
    public int f1305f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1306g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1307j;

    /* renamed from: k, reason: collision with root package name */
    public int f1308k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1309l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1310m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1311n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1312o;

    /* renamed from: p, reason: collision with root package name */
    public final K f1313p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1314q;

    /* renamed from: r, reason: collision with root package name */
    public int f1315r;

    public C0044a(K k2) {
        k2.C();
        C0063u c0063u = k2.f1240t;
        if (c0063u != null) {
            c0063u.h.getClassLoader();
        }
        this.f1300a = new ArrayList();
        this.f1312o = false;
        this.f1315r = -1;
        this.f1313p = k2;
    }

    @Override // androidx.fragment.app.I
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1306g) {
            return true;
        }
        K k2 = this.f1313p;
        if (k2.f1226d == null) {
            k2.f1226d = new ArrayList();
        }
        k2.f1226d.add(this);
        return true;
    }

    public final void b(T t2) {
        this.f1300a.add(t2);
        t2.f1280d = this.f1301b;
        t2.f1281e = this.f1302c;
        t2.f1282f = this.f1303d;
        t2.f1283g = this.f1304e;
    }

    public final void c(int i) {
        if (this.f1306g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1300a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                T t2 = (T) arrayList.get(i2);
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = t2.f1278b;
                if (abstractComponentCallbacksC0060q != null) {
                    abstractComponentCallbacksC0060q.f1408q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + t2.f1278b + " to " + t2.f1278b.f1408q);
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
            printWriter.print(this.f1315r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1314q);
            if (this.f1305f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1305f));
            }
            if (this.f1301b != 0 || this.f1302c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1301b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1302c));
            }
            if (this.f1303d != 0 || this.f1304e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1303d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1304e));
            }
            if (this.i != 0 || this.f1307j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1307j);
            }
            if (this.f1308k != 0 || this.f1309l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1308k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1309l);
            }
        }
        ArrayList arrayList = this.f1300a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            T t2 = (T) arrayList.get(i);
            switch (t2.f1277a) {
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
                    str2 = "cmd=" + t2.f1277a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(t2.f1278b);
            if (z2) {
                if (t2.f1280d != 0 || t2.f1281e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(t2.f1280d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(t2.f1281e));
                }
                if (t2.f1282f != 0 || t2.f1283g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(t2.f1282f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(t2.f1283g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1315r >= 0) {
            sb.append(" #");
            sb.append(this.f1315r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
