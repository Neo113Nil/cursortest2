package androidx.fragment.app;

import android.util.Log;
import com.luckyarcade.spinthrow.GameConfig;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044a implements I {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1301a;

    /* renamed from: b, reason: collision with root package name */
    public int f1302b;

    /* renamed from: c, reason: collision with root package name */
    public int f1303c;

    /* renamed from: d, reason: collision with root package name */
    public int f1304d;

    /* renamed from: e, reason: collision with root package name */
    public int f1305e;

    /* renamed from: f, reason: collision with root package name */
    public int f1306f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1307g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1308j;

    /* renamed from: k, reason: collision with root package name */
    public int f1309k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1310l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1311m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1312n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1313o;

    /* renamed from: p, reason: collision with root package name */
    public final K f1314p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1315q;

    /* renamed from: r, reason: collision with root package name */
    public int f1316r;

    public C0044a(K k2) {
        k2.C();
        C0063u c0063u = k2.f1241t;
        if (c0063u != null) {
            c0063u.h.getClassLoader();
        }
        this.f1301a = new ArrayList();
        this.f1313o = false;
        this.f1316r = -1;
        this.f1314p = k2;
    }

    @Override // androidx.fragment.app.I
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1307g) {
            return true;
        }
        K k2 = this.f1314p;
        if (k2.f1227d == null) {
            k2.f1227d = new ArrayList();
        }
        k2.f1227d.add(this);
        return true;
    }

    public final void b(T t2) {
        this.f1301a.add(t2);
        t2.f1281d = this.f1302b;
        t2.f1282e = this.f1303c;
        t2.f1283f = this.f1304d;
        t2.f1284g = this.f1305e;
    }

    public final void c(int i) {
        if (this.f1307g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1301a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                T t2 = (T) arrayList.get(i2);
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = t2.f1279b;
                if (abstractComponentCallbacksC0060q != null) {
                    abstractComponentCallbacksC0060q.f1409q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + t2.f1279b + " to " + t2.f1279b.f1409q);
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
            printWriter.print(this.f1316r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1315q);
            if (this.f1306f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1306f));
            }
            if (this.f1302b != 0 || this.f1303c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1302b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1303c));
            }
            if (this.f1304d != 0 || this.f1305e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1304d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1305e));
            }
            if (this.i != 0 || this.f1308j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1308j);
            }
            if (this.f1309k != 0 || this.f1310l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1309k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1310l);
            }
        }
        ArrayList arrayList = this.f1301a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            T t2 = (T) arrayList.get(i);
            switch (t2.f1278a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case GameConfig.COMBO_EVERY /* 3 */:
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
                case GameConfig.SCORE_PER_STICK /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + t2.f1278a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(t2.f1279b);
            if (z2) {
                if (t2.f1281d != 0 || t2.f1282e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(t2.f1281d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(t2.f1282e));
                }
                if (t2.f1283f != 0 || t2.f1284g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(t2.f1283f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(t2.f1284g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1316r >= 0) {
            sb.append(" #");
            sb.append(this.f1316r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
