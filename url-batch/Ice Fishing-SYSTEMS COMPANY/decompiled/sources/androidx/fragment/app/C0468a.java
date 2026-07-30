package androidx.fragment.app;

import android.util.Log;
import f0.AbstractC4489d;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468a implements L {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5041a;

    /* renamed from: b, reason: collision with root package name */
    public int f5042b;

    /* renamed from: c, reason: collision with root package name */
    public int f5043c;

    /* renamed from: d, reason: collision with root package name */
    public int f5044d;

    /* renamed from: e, reason: collision with root package name */
    public int f5045e;

    /* renamed from: f, reason: collision with root package name */
    public int f5046f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5047g;

    /* renamed from: h, reason: collision with root package name */
    public String f5048h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f5049j;

    /* renamed from: k, reason: collision with root package name */
    public int f5050k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f5051l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f5052m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f5053n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5054o;

    /* renamed from: p, reason: collision with root package name */
    public final N f5055p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5056q;

    /* renamed from: r, reason: collision with root package name */
    public int f5057r;

    public C0468a(N n9) {
        n9.B();
        C0489w c0489w = n9.f4980t;
        if (c0489w != null) {
            c0489w.f5188u.getClassLoader();
        }
        this.f5041a = new ArrayList();
        this.f5054o = false;
        this.f5057r = -1;
        this.f5055p = n9;
    }

    @Override // androidx.fragment.app.L
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (N.E(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f5047g) {
            return true;
        }
        N n9 = this.f5055p;
        if (n9.f4965d == null) {
            n9.f4965d = new ArrayList();
        }
        n9.f4965d.add(this);
        return true;
    }

    public final void b(W w9) {
        this.f5041a.add(w9);
        w9.f5025d = this.f5042b;
        w9.f5026e = this.f5043c;
        w9.f5027f = this.f5044d;
        w9.f5028g = this.f5045e;
    }

    public final void c(int i) {
        if (this.f5047g) {
            if (N.E(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f5041a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                W w9 = (W) arrayList.get(i4);
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = w9.f5023b;
                if (abstractComponentCallbacksC0485s != null) {
                    abstractComponentCallbacksC0485s.J += i;
                    if (N.E(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + w9.f5023b + " to " + w9.f5023b.J);
                    }
                }
            }
        }
    }

    public final int d(boolean z8) {
        if (this.f5056q) {
            throw new IllegalStateException("commit already called");
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new Y());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f5056q = true;
        boolean z9 = this.f5047g;
        N n9 = this.f5055p;
        if (z9) {
            this.f5057r = n9.i.getAndIncrement();
        } else {
            this.f5057r = -1;
        }
        n9.v(this, z8);
        return this.f5057r;
    }

    public final void e(int i, AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, String str, int i4) {
        String str2 = abstractComponentCallbacksC0485s.f5168q0;
        if (str2 != null) {
            AbstractC4489d.c(abstractComponentCallbacksC0485s, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0485s.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0485s.f5155Q;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC0485s);
                sb.append(": was ");
                throw new IllegalStateException(D.y.o(sb, abstractComponentCallbacksC0485s.f5155Q, " now ", str));
            }
            abstractComponentCallbacksC0485s.f5155Q = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0485s + " with tag " + str + " to container view with no id");
            }
            int i9 = abstractComponentCallbacksC0485s.f5153O;
            if (i9 != 0 && i9 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0485s + ": was " + abstractComponentCallbacksC0485s.f5153O + " now " + i);
            }
            abstractComponentCallbacksC0485s.f5153O = i;
            abstractComponentCallbacksC0485s.f5154P = i;
        }
        b(new W(i4, abstractComponentCallbacksC0485s));
        abstractComponentCallbacksC0485s.f5149K = this.f5055p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z8) {
        String str2;
        if (z8) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5048h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5057r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5056q);
            if (this.f5046f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f5046f));
            }
            if (this.f5042b != 0 || this.f5043c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5042b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5043c));
            }
            if (this.f5044d != 0 || this.f5045e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5044d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5045e));
            }
            if (this.i != 0 || this.f5049j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5049j);
            }
            if (this.f5050k != 0 || this.f5051l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5050k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5051l);
            }
        }
        ArrayList arrayList = this.f5041a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            W w9 = (W) arrayList.get(i);
            switch (w9.f5022a) {
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
                    str2 = "cmd=" + w9.f5022a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(w9.f5023b);
            if (z8) {
                if (w9.f5025d != 0 || w9.f5026e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(w9.f5025d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(w9.f5026e));
                }
                if (w9.f5027f != 0 || w9.f5028g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(w9.f5027f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(w9.f5028g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5057r >= 0) {
            sb.append(" #");
            sb.append(this.f5057r);
        }
        if (this.f5048h != null) {
            sb.append(" ");
            sb.append(this.f5048h);
        }
        sb.append("}");
        return sb.toString();
    }
}
