package X;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f880a;

    /* renamed from: b, reason: collision with root package name */
    public int f881b;

    /* renamed from: c, reason: collision with root package name */
    public int f882c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f883e;

    /* renamed from: f, reason: collision with root package name */
    public int f884f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f885g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f886j;

    /* renamed from: k, reason: collision with root package name */
    public int f887k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f888l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f889m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f890n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f891o;

    /* renamed from: p, reason: collision with root package name */
    public final I f892p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f893q;

    /* renamed from: r, reason: collision with root package name */
    public int f894r;

    public C0032a(I i) {
        i.C();
        C0051u c0051u = i.f827t;
        if (c0051u != null) {
            c0051u.f998f.getClassLoader();
        }
        this.f880a = new ArrayList();
        this.f891o = false;
        this.f894r = -1;
        this.f892p = i;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f885g) {
            return true;
        }
        I i = this.f892p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f880a.add(p2);
        p2.d = this.f881b;
        p2.f863e = this.f882c;
        p2.f864f = this.d;
        p2.f865g = this.f883e;
    }

    public final void c(int i) {
        if (this.f885g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f880a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = p2.f861b;
                if (abstractComponentCallbacksC0048q != null) {
                    abstractComponentCallbacksC0048q.f981q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f861b + " to " + p2.f861b.f981q);
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
            printWriter.print(this.f894r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f893q);
            if (this.f884f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f884f));
            }
            if (this.f881b != 0 || this.f882c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f881b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f882c));
            }
            if (this.d != 0 || this.f883e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f883e));
            }
            if (this.i != 0 || this.f886j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f886j);
            }
            if (this.f887k != 0 || this.f888l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f887k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f888l);
            }
        }
        ArrayList arrayList = this.f880a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f860a) {
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
                    str2 = "cmd=" + p2.f860a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f861b);
            if (z2) {
                if (p2.d != 0 || p2.f863e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f863e));
                }
                if (p2.f864f != 0 || p2.f865g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f864f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f865g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f894r >= 0) {
            sb.append(" #");
            sb.append(this.f894r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
