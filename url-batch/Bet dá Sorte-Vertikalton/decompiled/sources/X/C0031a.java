package X;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f966a;

    /* renamed from: b, reason: collision with root package name */
    public int f967b;

    /* renamed from: c, reason: collision with root package name */
    public int f968c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f969e;

    /* renamed from: f, reason: collision with root package name */
    public int f970f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f971g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f972j;

    /* renamed from: k, reason: collision with root package name */
    public int f973k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f974l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f975m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f976n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f977o;

    /* renamed from: p, reason: collision with root package name */
    public final I f978p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f979q;

    /* renamed from: r, reason: collision with root package name */
    public int f980r;

    public C0031a(I i) {
        i.C();
        C0050u c0050u = i.f913t;
        if (c0050u != null) {
            c0050u.f1084f.getClassLoader();
        }
        this.f966a = new ArrayList();
        this.f977o = false;
        this.f980r = -1;
        this.f978p = i;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f971g) {
            return true;
        }
        I i = this.f978p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f966a.add(p2);
        p2.d = this.f967b;
        p2.f949e = this.f968c;
        p2.f950f = this.d;
        p2.f951g = this.f969e;
    }

    public final void c(int i) {
        if (this.f971g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f966a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = p2.f947b;
                if (abstractComponentCallbacksC0047q != null) {
                    abstractComponentCallbacksC0047q.f1067q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f947b + " to " + p2.f947b.f1067q);
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
            printWriter.print(this.f980r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f979q);
            if (this.f970f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f970f));
            }
            if (this.f967b != 0 || this.f968c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f967b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f968c));
            }
            if (this.d != 0 || this.f969e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f969e));
            }
            if (this.i != 0 || this.f972j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f972j);
            }
            if (this.f973k != 0 || this.f974l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f973k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f974l);
            }
        }
        ArrayList arrayList = this.f966a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f946a) {
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
                    str2 = "cmd=" + p2.f946a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f947b);
            if (z2) {
                if (p2.d != 0 || p2.f949e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f949e));
                }
                if (p2.f950f != 0 || p2.f951g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f950f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f951g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f980r >= 0) {
            sb.append(" #");
            sb.append(this.f980r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
