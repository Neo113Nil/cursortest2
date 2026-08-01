package Y;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: Y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1012a;

    /* renamed from: b, reason: collision with root package name */
    public int f1013b;

    /* renamed from: c, reason: collision with root package name */
    public int f1014c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1015e;

    /* renamed from: f, reason: collision with root package name */
    public int f1016f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1017g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1018j;

    /* renamed from: k, reason: collision with root package name */
    public int f1019k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1020l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1021m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1022n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1023o;

    /* renamed from: p, reason: collision with root package name */
    public final I f1024p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1025q;

    /* renamed from: r, reason: collision with root package name */
    public int f1026r;

    public C0035a(I i) {
        i.C();
        C0054u c0054u = i.f959t;
        if (c0054u != null) {
            c0054u.f1130f.getClassLoader();
        }
        this.f1012a = new ArrayList();
        this.f1023o = false;
        this.f1026r = -1;
        this.f1024p = i;
    }

    @Override // Y.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1017g) {
            return true;
        }
        I i = this.f1024p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f1012a.add(p2);
        p2.d = this.f1013b;
        p2.f995e = this.f1014c;
        p2.f996f = this.d;
        p2.f997g = this.f1015e;
    }

    public final void c(int i) {
        if (this.f1017g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1012a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = p2.f993b;
                if (abstractComponentCallbacksC0051q != null) {
                    abstractComponentCallbacksC0051q.f1113q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f993b + " to " + p2.f993b.f1113q);
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
            printWriter.print(this.f1026r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1025q);
            if (this.f1016f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1016f));
            }
            if (this.f1013b != 0 || this.f1014c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1013b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1014c));
            }
            if (this.d != 0 || this.f1015e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1015e));
            }
            if (this.i != 0 || this.f1018j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1018j);
            }
            if (this.f1019k != 0 || this.f1020l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1019k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1020l);
            }
        }
        ArrayList arrayList = this.f1012a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f992a) {
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
                    str2 = "cmd=" + p2.f992a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f993b);
            if (z2) {
                if (p2.d != 0 || p2.f995e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f995e));
                }
                if (p2.f996f != 0 || p2.f997g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f996f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f997g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1026r >= 0) {
            sb.append(" #");
            sb.append(this.f1026r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
