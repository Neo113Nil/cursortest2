package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wm extends ps0 implements yr0 {
    public final as0 p;
    public boolean q;
    public int r;

    public wm(as0 as0Var) {
        as0Var.D();
        pr0 pr0Var = as0Var.t;
        if (pr0Var != null) {
            pr0Var.n.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.r = -1;
        this.p = as0Var;
    }

    @Override // defpackage.yr0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (as0.G(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        as0 as0Var = this.p;
        if (as0Var.d == null) {
            as0Var.d = new ArrayList();
        }
        as0Var.d.add(this);
        return true;
    }

    @Override // defpackage.ps0
    public final void c(int i, fr0 fr0Var, String str) {
        String str2 = fr0Var.mPreviousWho;
        if (str2 != null) {
            ms0.d(fr0Var, str2);
        }
        Class<?> cls = fr0Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            dm0.h(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = fr0Var.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fr0Var);
                String str4 = fr0Var.mTag;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            fr0Var.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                dm0.k("Can't add fragment ", fr0Var, " with tag ", str, " to container view with no id");
                return;
            }
            int i2 = fr0Var.mFragmentId;
            if (i2 != 0 && i2 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fr0Var);
                int i3 = fr0Var.mFragmentId;
                sb2.append(": was ");
                sb2.append(i3);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fr0Var.mFragmentId = i;
            fr0Var.mContainerId = i;
        }
        b(new os0(fr0Var, 1));
        fr0Var.mFragmentManager = this.p;
    }

    public final void d(int i) {
        ArrayList arrayList = this.a;
        if (this.g) {
            if (as0.G(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                os0 os0Var = (os0) arrayList.get(i2);
                fr0 fr0Var = os0Var.b;
                if (fr0Var != null) {
                    fr0Var.mBackStackNesting += i;
                    if (as0.G(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + os0Var.b + " to " + os0Var.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int e(boolean z) {
        if (this.q) {
            lh.g("commit already called");
            return 0;
        }
        if (as0.G(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new gg1());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.q = true;
        boolean z2 = this.g;
        as0 as0Var = this.p;
        if (z2) {
            this.r = as0Var.i.getAndIncrement();
        } else {
            this.r = -1;
        }
        as0Var.v(this, z);
        return this.r;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        ArrayList arrayList = this.a;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            os0 os0Var = (os0) arrayList.get(i);
            switch (os0Var.a) {
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
                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
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
                    str2 = "cmd=" + os0Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(os0Var.b);
            if (z) {
                if (os0Var.d != 0 || os0Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(os0Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(os0Var.e));
                }
                if (os0Var.f != 0 || os0Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(os0Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(os0Var.g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
