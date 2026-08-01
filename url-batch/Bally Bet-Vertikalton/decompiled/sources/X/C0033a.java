package X;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f883a;

    /* renamed from: b, reason: collision with root package name */
    public int f884b;

    /* renamed from: c, reason: collision with root package name */
    public int f885c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f886e;

    /* renamed from: f, reason: collision with root package name */
    public int f887f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f888g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f889j;

    /* renamed from: k, reason: collision with root package name */
    public int f890k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f891l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f892m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f893n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f894o;

    /* renamed from: p, reason: collision with root package name */
    public final I f895p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f896q;

    /* renamed from: r, reason: collision with root package name */
    public int f897r;

    public C0033a(I i) {
        i.C();
        C0052u c0052u = i.f830t;
        if (c0052u != null) {
            c0052u.f1001f.getClassLoader();
        }
        this.f883a = new ArrayList();
        this.f894o = false;
        this.f897r = -1;
        this.f895p = i;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f888g) {
            return true;
        }
        I i = this.f895p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f883a.add(p2);
        p2.d = this.f884b;
        p2.f866e = this.f885c;
        p2.f867f = this.d;
        p2.f868g = this.f886e;
    }

    public final void c(int i) {
        if (this.f888g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f883a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = p2.f864b;
                if (abstractComponentCallbacksC0049q != null) {
                    abstractComponentCallbacksC0049q.f984q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f864b + " to " + p2.f864b.f984q);
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
            printWriter.print(this.f897r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f896q);
            if (this.f887f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f887f));
            }
            if (this.f884b != 0 || this.f885c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f884b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f885c));
            }
            if (this.d != 0 || this.f886e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f886e));
            }
            if (this.i != 0 || this.f889j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f889j);
            }
            if (this.f890k != 0 || this.f891l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f890k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f891l);
            }
        }
        ArrayList arrayList = this.f883a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f863a) {
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
                    str2 = "cmd=" + p2.f863a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f864b);
            if (z2) {
                if (p2.d != 0 || p2.f866e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f866e));
                }
                if (p2.f867f != 0 || p2.f868g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f867f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f868g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f897r >= 0) {
            sb.append(" #");
            sb.append(this.f897r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
