package androidx.fragment.app;

import android.util.Log;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.cl;
import defpackage.dl;
import defpackage.el;
import defpackage.nk;
import defpackage.o8;
import defpackage.ur;
import defpackage.vk;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a extends el implements vk {
    public final n p;
    public boolean q;
    public int r;

    public a(n nVar) {
        nVar.D();
        nk nkVar = nVar.t;
        if (nkVar != null) {
            nkVar.g.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.r = -1;
        this.p = nVar;
    }

    @Override // defpackage.vk
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (n.G(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        n nVar = this.p;
        if (nVar.d == null) {
            nVar.d = new ArrayList();
        }
        nVar.d.add(this);
        return true;
    }

    @Override // defpackage.el
    public final void c(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            cl.c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                String str4 = fragment.mTag;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                o8.o("Can't add fragment ", fragment, " with tag ", str, " to container view with no id");
                return;
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i4 = fragment.mFragmentId;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        b(new dl(fragment, i2));
        fragment.mFragmentManager = this.p;
    }

    public final void d(int i) {
        ArrayList arrayList = this.a;
        if (this.g) {
            if (n.G(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dl dlVar = (dl) arrayList.get(i2);
                Fragment fragment = dlVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (n.G(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + dlVar.b + " to " + dlVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int e(boolean z) {
        if (this.q) {
            o8.t("commit already called");
            return 0;
        }
        if (n.G(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new ur());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.q = true;
        boolean z2 = this.g;
        n nVar = this.p;
        if (z2) {
            this.r = nVar.i.getAndIncrement();
        } else {
            this.r = -1;
        }
        nVar.v(this, z);
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
            dl dlVar = (dl) arrayList.get(i);
            switch (dlVar.a) {
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
                case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                    str2 = "SHOW";
                    break;
                case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + dlVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(dlVar.b);
            if (z) {
                if (dlVar.d != 0 || dlVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(dlVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(dlVar.e));
                }
                if (dlVar.f != 0 || dlVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(dlVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(dlVar.g));
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
