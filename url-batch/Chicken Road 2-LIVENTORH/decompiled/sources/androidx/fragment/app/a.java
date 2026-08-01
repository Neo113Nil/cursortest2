package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f377a;

    /* renamed from: b, reason: collision with root package name */
    public int f378b;

    /* renamed from: c, reason: collision with root package name */
    public int f379c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f380e;

    /* renamed from: f, reason: collision with root package name */
    public int f381f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f382g;

    /* renamed from: h, reason: collision with root package name */
    public String f383h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f384j;

    /* renamed from: k, reason: collision with root package name */
    public int f385k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f386l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f387m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f388n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f389o;

    /* renamed from: p, reason: collision with root package name */
    public final k0 f390p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f391q;

    /* renamed from: r, reason: collision with root package name */
    public int f392r;

    public a(k0 k0Var) {
        k0Var.B();
        w wVar = k0Var.f458t;
        if (wVar != null) {
            wVar.f568o.getClassLoader();
        }
        this.f377a = new ArrayList();
        this.f389o = false;
        this.f392r = -1;
        this.f390p = k0Var;
    }

    @Override // androidx.fragment.app.i0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (k0.E(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f382g) {
            return true;
        }
        k0 k0Var = this.f390p;
        if (k0Var.d == null) {
            k0Var.d = new ArrayList();
        }
        k0Var.d.add(this);
        return true;
    }

    public final void b(r0 r0Var) {
        this.f377a.add(r0Var);
        r0Var.d = this.f378b;
        r0Var.f517e = this.f379c;
        r0Var.f518f = this.d;
        r0Var.f519g = this.f380e;
    }

    public final void c(int i) {
        if (this.f382g) {
            if (k0.E(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f377a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                r0 r0Var = (r0) arrayList.get(i4);
                u uVar = r0Var.f515b;
                if (uVar != null) {
                    uVar.f550v += i;
                    if (k0.E(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + r0Var.f515b + " to " + r0Var.f515b.f550v);
                    }
                }
            }
        }
    }

    public final int d(boolean z3) {
        if (this.f391q) {
            throw new IllegalStateException("commit already called");
        }
        if (k0.E(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new t0());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.f391q = true;
        boolean z4 = this.f382g;
        k0 k0Var = this.f390p;
        if (z4) {
            this.f392r = k0Var.i.getAndIncrement();
        } else {
            this.f392r = -1;
        }
        k0Var.v(this, z3);
        return this.f392r;
    }

    public final void e(u uVar) {
        k0 k0Var = uVar.f551w;
        if (k0Var == null || k0Var == this.f390p) {
            b(new r0(6, uVar));
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + uVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void f(int i, u uVar, String str, int i4) {
        String str2 = uVar.P;
        if (str2 != null) {
            y0.c.c(uVar, str2);
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
        uVar.f551w = this.f390p;
    }

    public final void g(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f383h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f392r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f391q);
            if (this.f381f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f381f));
            }
            if (this.f378b != 0 || this.f379c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f378b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f379c));
            }
            if (this.d != 0 || this.f380e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f380e));
            }
            if (this.i != 0 || this.f384j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f384j);
            }
            if (this.f385k != 0 || this.f386l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f385k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f386l);
            }
        }
        ArrayList arrayList = this.f377a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r0 r0Var = (r0) arrayList.get(i);
            switch (r0Var.f514a) {
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
                    str2 = "cmd=" + r0Var.f514a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(r0Var.f515b);
            if (z3) {
                if (r0Var.d != 0 || r0Var.f517e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(r0Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(r0Var.f517e));
                }
                if (r0Var.f518f != 0 || r0Var.f519g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(r0Var.f518f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(r0Var.f519g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f392r >= 0) {
            sb.append(" #");
            sb.append(this.f392r);
        }
        if (this.f383h != null) {
            sb.append(" ");
            sb.append(this.f383h);
        }
        sb.append("}");
        return sb.toString();
    }
}
