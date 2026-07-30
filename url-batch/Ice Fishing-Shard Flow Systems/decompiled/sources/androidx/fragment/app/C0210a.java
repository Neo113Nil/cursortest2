package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210a implements N {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3682a;

    /* renamed from: b, reason: collision with root package name */
    public int f3683b;

    /* renamed from: c, reason: collision with root package name */
    public int f3684c;

    /* renamed from: d, reason: collision with root package name */
    public int f3685d;

    /* renamed from: e, reason: collision with root package name */
    public int f3686e;

    /* renamed from: f, reason: collision with root package name */
    public int f3687f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3688g;

    /* renamed from: h, reason: collision with root package name */
    public String f3689h;

    /* renamed from: i, reason: collision with root package name */
    public int f3690i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public int f3691k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3692l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3693m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f3694n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3695o;

    /* renamed from: p, reason: collision with root package name */
    public final Q f3696p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3697q;

    /* renamed from: r, reason: collision with root package name */
    public int f3698r;

    public C0210a(Q q4) {
        q4.G();
        C0232x c0232x = q4.f3633v;
        if (c0232x != null) {
            c0232x.f3823e.getClassLoader();
        }
        this.f3682a = new ArrayList();
        this.f3695o = false;
        this.f3698r = -1;
        this.f3696p = q4;
    }

    @Override // androidx.fragment.app.N
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Q.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3688g) {
            return true;
        }
        this.f3696p.f3616d.add(this);
        return true;
    }

    public final void b(Z z7) {
        this.f3682a.add(z7);
        z7.f3676d = this.f3683b;
        z7.f3677e = this.f3684c;
        z7.f3678f = this.f3685d;
        z7.f3679g = this.f3686e;
    }

    public final void c(int i2) {
        if (this.f3688g) {
            if (Q.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f3682a;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Z z7 = (Z) arrayList.get(i5);
                ComponentCallbacksC0228t componentCallbacksC0228t = z7.f3674b;
                if (componentCallbacksC0228t != null) {
                    componentCallbacksC0228t.f3816z += i2;
                    if (Q.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + z7.f3674b + " to " + z7.f3674b.f3816z);
                    }
                }
            }
        }
    }

    public final int d(boolean z7) {
        if (this.f3697q) {
            throw new IllegalStateException("commit already called");
        }
        if (Q.J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new b0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f3697q = true;
        boolean z8 = this.f3688g;
        Q q4 = this.f3696p;
        if (z8) {
            this.f3698r = q4.j.getAndIncrement();
        } else {
            this.f3698r = -1;
        }
        q4.y(this, z7);
        return this.f3698r;
    }

    public final void e(int i2, ComponentCallbacksC0228t componentCallbacksC0228t, String str) {
        String str2 = componentCallbacksC0228t.f3792S;
        if (str2 != null) {
            Z.d.d(componentCallbacksC0228t, str2);
        }
        Class<?> cls = componentCallbacksC0228t.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC0228t.f3781G;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC0228t + ": was " + componentCallbacksC0228t.f3781G + " now " + str);
            }
            componentCallbacksC0228t.f3781G = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC0228t + " with tag " + str + " to container view with no id");
            }
            int i5 = componentCallbacksC0228t.f3779E;
            if (i5 != 0 && i5 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC0228t + ": was " + componentCallbacksC0228t.f3779E + " now " + i2);
            }
            componentCallbacksC0228t.f3779E = i2;
            componentCallbacksC0228t.f3780F = i2;
        }
        b(new Z(1, componentCallbacksC0228t));
        componentCallbacksC0228t.f3775A = this.f3696p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z7) {
        String str2;
        if (z7) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3689h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3698r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3697q);
            if (this.f3687f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3687f));
            }
            if (this.f3683b != 0 || this.f3684c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3683b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3684c));
            }
            if (this.f3685d != 0 || this.f3686e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3685d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3686e));
            }
            if (this.f3690i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3690i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.f3691k != 0 || this.f3692l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3691k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3692l);
            }
        }
        ArrayList arrayList = this.f3682a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Z z8 = (Z) arrayList.get(i2);
            switch (z8.f3673a) {
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
                case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + z8.f3673a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(z8.f3674b);
            if (z7) {
                if (z8.f3676d != 0 || z8.f3677e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(z8.f3676d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(z8.f3677e));
                }
                if (z8.f3678f != 0 || z8.f3679g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(z8.f3678f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(z8.f3679g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3698r >= 0) {
            sb.append(" #");
            sb.append(this.f3698r);
        }
        if (this.f3689h != null) {
            sb.append(" ");
            sb.append(this.f3689h);
        }
        sb.append("}");
        return sb.toString();
    }
}
