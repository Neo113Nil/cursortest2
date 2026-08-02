package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193a implements InterfaceC0198c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4788a;

    /* renamed from: b, reason: collision with root package name */
    public int f4789b;

    /* renamed from: c, reason: collision with root package name */
    public int f4790c;

    /* renamed from: d, reason: collision with root package name */
    public int f4791d;

    /* renamed from: e, reason: collision with root package name */
    public int f4792e;

    /* renamed from: f, reason: collision with root package name */
    public int f4793f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4794g;

    /* renamed from: h, reason: collision with root package name */
    public String f4795h;

    /* renamed from: i, reason: collision with root package name */
    public int f4796i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f4797j;

    /* renamed from: k, reason: collision with root package name */
    public int f4798k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4799l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4800m;
    public ArrayList n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final f0 f4801p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4802q;

    /* renamed from: r, reason: collision with root package name */
    public int f4803r;

    public C0193a(f0 f0Var) {
        f0Var.G();
        Q q4 = f0Var.v;
        if (q4 != null) {
            q4.f4773b.getClassLoader();
        }
        this.f4788a = new ArrayList();
        this.o = false;
        this.f4803r = -1;
        this.f4801p = f0Var;
    }

    @Override // androidx.fragment.app.InterfaceC0198c0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (f0.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4794g) {
            return true;
        }
        this.f4801p.f4850d.add(this);
        return true;
    }

    public final void b(o0 o0Var) {
        this.f4788a.add(o0Var);
        o0Var.f4943d = this.f4789b;
        o0Var.f4944e = this.f4790c;
        o0Var.f4945f = this.f4791d;
        o0Var.f4946g = this.f4792e;
    }

    public final void c(int i4) {
        if (this.f4794g) {
            if (f0.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
            }
            ArrayList arrayList = this.f4788a;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                o0 o0Var = (o0) arrayList.get(i5);
                F f4 = o0Var.f4941b;
                if (f4 != null) {
                    f4.mBackStackNesting += i4;
                    if (f0.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + o0Var.f4941b + " to " + o0Var.f4941b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.f4802q) {
            throw new IllegalStateException("commit already called");
        }
        if (f0.J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new y0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f4802q = true;
        boolean z4 = this.f4794g;
        f0 f0Var = this.f4801p;
        if (z4) {
            this.f4803r = f0Var.f4856j.getAndIncrement();
        } else {
            this.f4803r = -1;
        }
        f0Var.x(this, z);
        return this.f4803r;
    }

    public final void e(int i4, F f4, String str) {
        String str2 = f4.mPreviousWho;
        if (str2 != null) {
            Q.d.c(f4, str2);
        }
        Class<?> cls = f4.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = f4.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + f4 + ": was " + f4.mTag + " now " + str);
            }
            f4.mTag = str;
        }
        if (i4 != 0) {
            if (i4 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + f4 + " with tag " + str + " to container view with no id");
            }
            int i5 = f4.mFragmentId;
            if (i5 != 0 && i5 != i4) {
                throw new IllegalStateException("Can't change container ID of fragment " + f4 + ": was " + f4.mFragmentId + " now " + i4);
            }
            f4.mFragmentId = i4;
            f4.mContainerId = i4;
        }
        b(new o0(f4, 1));
        f4.mFragmentManager = this.f4801p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4795h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4803r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4802q);
            if (this.f4793f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4793f));
            }
            if (this.f4789b != 0 || this.f4790c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4789b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4790c));
            }
            if (this.f4791d != 0 || this.f4792e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4791d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4792e));
            }
            if (this.f4796i != 0 || this.f4797j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4796i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4797j);
            }
            if (this.f4798k != 0 || this.f4799l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4798k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4799l);
            }
        }
        ArrayList arrayList = this.f4788a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o0 o0Var = (o0) arrayList.get(i4);
            switch (o0Var.f4940a) {
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
                    str2 = "cmd=" + o0Var.f4940a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i4);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(o0Var.f4941b);
            if (z) {
                if (o0Var.f4943d != 0 || o0Var.f4944e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(o0Var.f4943d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(o0Var.f4944e));
                }
                if (o0Var.f4945f != 0 || o0Var.f4946g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(o0Var.f4945f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(o0Var.f4946g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4803r >= 0) {
            sb.append(" #");
            sb.append(this.f4803r);
        }
        if (this.f4795h != null) {
            sb.append(" ");
            sb.append(this.f4795h);
        }
        sb.append("}");
        return sb.toString();
    }
}
