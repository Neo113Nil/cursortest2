package Z;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: Z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1088a;

    /* renamed from: b, reason: collision with root package name */
    public int f1089b;

    /* renamed from: c, reason: collision with root package name */
    public int f1090c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1091e;

    /* renamed from: f, reason: collision with root package name */
    public int f1092f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1093g;

    /* renamed from: h, reason: collision with root package name */
    public String f1094h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1095j;

    /* renamed from: k, reason: collision with root package name */
    public int f1096k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1097l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1098m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1099n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1100o;

    /* renamed from: p, reason: collision with root package name */
    public final I f1101p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1102q;

    /* renamed from: r, reason: collision with root package name */
    public int f1103r;

    public C0034a(I i) {
        i.C();
        C0053u c0053u = i.f1030t;
        if (c0053u != null) {
            c0053u.f1210f.getClassLoader();
        }
        this.f1088a = new ArrayList();
        this.f1100o = false;
        this.f1103r = -1;
        this.f1101p = i;
    }

    @Override // Z.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1093g) {
            return true;
        }
        I i = this.f1101p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f1088a.add(p2);
        p2.d = this.f1089b;
        p2.f1069e = this.f1090c;
        p2.f1070f = this.d;
        p2.f1071g = this.f1091e;
    }

    public final void c(int i) {
        if (this.f1093g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1088a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = p2.f1067b;
                if (abstractComponentCallbacksC0050q != null) {
                    abstractComponentCallbacksC0050q.f1193q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f1067b + " to " + p2.f1067b.f1193q);
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
            printWriter.print(this.f1094h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1103r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1102q);
            if (this.f1092f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1092f));
            }
            if (this.f1089b != 0 || this.f1090c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1089b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1090c));
            }
            if (this.d != 0 || this.f1091e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1091e));
            }
            if (this.i != 0 || this.f1095j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1095j);
            }
            if (this.f1096k != 0 || this.f1097l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1096k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1097l);
            }
        }
        ArrayList arrayList = this.f1088a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f1066a) {
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
                    str2 = "cmd=" + p2.f1066a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f1067b);
            if (z2) {
                if (p2.d != 0 || p2.f1069e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1069e));
                }
                if (p2.f1070f != 0 || p2.f1071g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f1070f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1071g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1103r >= 0) {
            sb.append(" #");
            sb.append(this.f1103r);
        }
        if (this.f1094h != null) {
            sb.append(" ");
            sb.append(this.f1094h);
        }
        sb.append("}");
        return sb.toString();
    }
}
