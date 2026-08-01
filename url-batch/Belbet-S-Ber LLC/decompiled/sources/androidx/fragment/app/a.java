package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f493a;

    /* renamed from: b, reason: collision with root package name */
    public int f494b;

    /* renamed from: c, reason: collision with root package name */
    public int f495c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f496e;

    /* renamed from: f, reason: collision with root package name */
    public int f497f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f498g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f499j;

    /* renamed from: k, reason: collision with root package name */
    public int f500k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f501l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f502m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f503n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f504o;

    /* renamed from: p, reason: collision with root package name */
    public final k0 f505p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f506q;

    /* renamed from: r, reason: collision with root package name */
    public int f507r;

    public a(k0 k0Var) {
        k0Var.E();
        w wVar = k0Var.f570t;
        if (wVar != null) {
            wVar.f674p.getClassLoader();
        }
        this.f493a = new ArrayList();
        this.f504o = false;
        this.f507r = -1;
        this.f505p = k0Var;
    }

    @Override // androidx.fragment.app.i0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (k0.H(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f498g) {
            return true;
        }
        k0 k0Var = this.f505p;
        if (k0Var.d == null) {
            k0Var.d = new ArrayList();
        }
        k0Var.d.add(this);
        return true;
    }

    public final void b(r0 r0Var) {
        this.f493a.add(r0Var);
        r0Var.d = this.f494b;
        r0Var.f629e = this.f495c;
        r0Var.f630f = this.d;
        r0Var.f631g = this.f496e;
    }

    public final void c(int i) {
        if (this.f498g) {
            if (k0.H(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f493a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                r0 r0Var = (r0) arrayList.get(i4);
                u uVar = r0Var.f627b;
                if (uVar != null) {
                    uVar.f658v += i;
                    if (k0.H(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + r0Var.f627b + " to " + r0Var.f627b.f658v);
                    }
                }
            }
        }
    }

    public final int d(boolean z4) {
        if (this.f506q) {
            throw new IllegalStateException("commit already called");
        }
        if (k0.H(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new t0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f506q = true;
        boolean z5 = this.f498g;
        k0 k0Var = this.f505p;
        if (z5) {
            this.f507r = k0Var.i.getAndIncrement();
        } else {
            this.f507r = -1;
        }
        k0Var.w(this, z4);
        return this.f507r;
    }

    public final void e(int i, u uVar, String str, int i4) {
        String str2 = uVar.P;
        if (str2 != null) {
            z0.c.c(uVar, str2);
        }
        Class<?> cls = uVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = uVar.C;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + uVar + ": was " + uVar.C + " now " + str);
            }
            uVar.C = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + uVar + " with tag " + str + " to container view with no id");
            }
            int i5 = uVar.A;
            if (i5 != 0 && i5 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + uVar + ": was " + uVar.A + " now " + i);
            }
            uVar.A = i;
            uVar.B = i;
        }
        b(new r0(i4, uVar));
        uVar.f659w = this.f505p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f507r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f506q);
            if (this.f497f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f497f));
            }
            if (this.f494b != 0 || this.f495c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f494b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f495c));
            }
            if (this.d != 0 || this.f496e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f496e));
            }
            if (this.i != 0 || this.f499j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f499j);
            }
            if (this.f500k != 0 || this.f501l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f500k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f501l);
            }
        }
        ArrayList arrayList = this.f493a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r0 r0Var = (r0) arrayList.get(i);
            switch (r0Var.f626a) {
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
                    str2 = "cmd=" + r0Var.f626a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(r0Var.f627b);
            if (z4) {
                if (r0Var.d != 0 || r0Var.f629e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(r0Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(r0Var.f629e));
                }
                if (r0Var.f630f != 0 || r0Var.f631g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(r0Var.f630f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(r0Var.f631g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f507r >= 0) {
            sb.append(" #");
            sb.append(this.f507r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
