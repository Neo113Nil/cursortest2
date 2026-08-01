package X;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f992a;

    /* renamed from: b, reason: collision with root package name */
    public int f993b;

    /* renamed from: c, reason: collision with root package name */
    public int f994c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f995e;

    /* renamed from: f, reason: collision with root package name */
    public int f996f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f997g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f998j;

    /* renamed from: k, reason: collision with root package name */
    public int f999k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1000l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1001m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1002n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1003o;

    /* renamed from: p, reason: collision with root package name */
    public final I f1004p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1005q;

    /* renamed from: r, reason: collision with root package name */
    public int f1006r;

    public C0032a(I i) {
        i.C();
        C0051u c0051u = i.f939t;
        if (c0051u != null) {
            c0051u.f1110f.getClassLoader();
        }
        this.f992a = new ArrayList();
        this.f1003o = false;
        this.f1006r = -1;
        this.f1004p = i;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f997g) {
            return true;
        }
        I i = this.f1004p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f992a.add(p2);
        p2.d = this.f993b;
        p2.f975e = this.f994c;
        p2.f976f = this.d;
        p2.f977g = this.f995e;
    }

    public final void c(int i) {
        if (this.f997g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f992a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f973b;
                if (abstractComponentCallbacksC0048q != null) {
                    abstractComponentCallbacksC0048q.f1093q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f973b + " to " + p2.f973b.f1093q);
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
            printWriter.print(this.f1006r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1005q);
            if (this.f996f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f996f));
            }
            if (this.f993b != 0 || this.f994c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f993b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f994c));
            }
            if (this.d != 0 || this.f995e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f995e));
            }
            if (this.i != 0 || this.f998j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f998j);
            }
            if (this.f999k != 0 || this.f1000l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f999k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1000l);
            }
        }
        ArrayList arrayList = this.f992a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f972a) {
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
                    str2 = "cmd=" + p2.f972a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f973b);
            if (z2) {
                if (p2.d != 0 || p2.f975e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f975e));
                }
                if (p2.f976f != 0 || p2.f977g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f976f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f977g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1006r >= 0) {
            sb.append(" #");
            sb.append(this.f1006r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
