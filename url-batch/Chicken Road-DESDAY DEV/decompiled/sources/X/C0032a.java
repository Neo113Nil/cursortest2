package X;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f952a;

    /* renamed from: b, reason: collision with root package name */
    public int f953b;

    /* renamed from: c, reason: collision with root package name */
    public int f954c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f955e;

    /* renamed from: f, reason: collision with root package name */
    public int f956f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f957g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f958j;

    /* renamed from: k, reason: collision with root package name */
    public int f959k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f960l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f961m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f962n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f963o;

    /* renamed from: p, reason: collision with root package name */
    public final I f964p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f965q;

    /* renamed from: r, reason: collision with root package name */
    public int f966r;

    public C0032a(I i) {
        i.C();
        C0051u c0051u = i.f899t;
        if (c0051u != null) {
            c0051u.f1070f.getClassLoader();
        }
        this.f952a = new ArrayList();
        this.f963o = false;
        this.f966r = -1;
        this.f964p = i;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f957g) {
            return true;
        }
        I i = this.f964p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f952a.add(p2);
        p2.d = this.f953b;
        p2.f935e = this.f954c;
        p2.f936f = this.d;
        p2.f937g = this.f955e;
    }

    public final void c(int i) {
        if (this.f957g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f952a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f933b;
                if (abstractComponentCallbacksC0048q != null) {
                    abstractComponentCallbacksC0048q.f1053q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f933b + " to " + p2.f933b.f1053q);
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
            printWriter.print(this.f966r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f965q);
            if (this.f956f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f956f));
            }
            if (this.f953b != 0 || this.f954c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f953b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f954c));
            }
            if (this.d != 0 || this.f955e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f955e));
            }
            if (this.i != 0 || this.f958j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f958j);
            }
            if (this.f959k != 0 || this.f960l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f959k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f960l);
            }
        }
        ArrayList arrayList = this.f952a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f932a) {
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
                    str2 = "cmd=" + p2.f932a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f933b);
            if (z2) {
                if (p2.d != 0 || p2.f935e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f935e));
                }
                if (p2.f936f != 0 || p2.f937g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f936f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f937g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f966r >= 0) {
            sb.append(" #");
            sb.append(this.f966r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
