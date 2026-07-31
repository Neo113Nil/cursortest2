package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.z;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1326a extends z implements FragmentManager.l {

    /* renamed from: t, reason: collision with root package name */
    final FragmentManager f12426t;

    /* renamed from: u, reason: collision with root package name */
    boolean f12427u;

    /* renamed from: v, reason: collision with root package name */
    int f12428v;

    /* renamed from: w, reason: collision with root package name */
    boolean f12429w;

    C1326a(FragmentManager fragmentManager) {
        super(fragmentManager.r0(), fragmentManager.t0() != null ? fragmentManager.t0().f().getClassLoader() : null);
        this.f12428v = -1;
        this.f12429w = false;
        this.f12426t = fragmentManager;
    }

    Fragment A(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f12533c.size() - 1; size >= 0; size--) {
            z.a aVar = (z.a) this.f12533c.get(size);
            int i4 = aVar.f12550a;
            if (i4 != 1) {
                if (i4 != 3) {
                    switch (i4) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f12551b;
                            break;
                        case 10:
                            aVar.f12558i = aVar.f12557h;
                            break;
                    }
                }
                arrayList.add(aVar.f12551b);
            }
            arrayList.remove(aVar.f12551b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f12539i) {
            return true;
        }
        this.f12426t.g(this);
        return true;
    }

    @Override // androidx.fragment.app.z
    public int g() {
        return s(false);
    }

    @Override // androidx.fragment.app.z
    public int h() {
        return s(true);
    }

    @Override // androidx.fragment.app.z
    public void i() {
        k();
        this.f12426t.b0(this, false);
    }

    @Override // androidx.fragment.app.z
    public void j() {
        k();
        this.f12426t.b0(this, true);
    }

    @Override // androidx.fragment.app.z
    void l(int i4, Fragment fragment, String str, int i5) {
        super.l(i4, fragment, str, i5);
        fragment.mFragmentManager = this.f12426t;
    }

    @Override // androidx.fragment.app.z
    public z m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f12426t) {
            return super.m(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void r(int i4) {
        if (this.f12539i) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
            }
            int size = this.f12533c.size();
            for (int i5 = 0; i5 < size; i5++) {
                z.a aVar = (z.a) this.f12533c.get(i5);
                Fragment fragment = aVar.f12551b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i4;
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f12551b + " to " + aVar.f12551b.mBackStackNesting);
                    }
                }
            }
        }
    }

    int s(boolean z4) {
        if (this.f12427u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new F("FragmentManager"));
            t("  ", printWriter);
            printWriter.close();
        }
        this.f12427u = true;
        if (this.f12539i) {
            this.f12428v = this.f12426t.l();
        } else {
            this.f12428v = -1;
        }
        this.f12426t.Y(this, z4);
        return this.f12428v;
    }

    public void t(String str, PrintWriter printWriter) {
        u(str, printWriter, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f12428v >= 0) {
            sb.append(" #");
            sb.append(this.f12428v);
        }
        if (this.f12541k != null) {
            sb.append(" ");
            sb.append(this.f12541k);
        }
        sb.append("}");
        return sb.toString();
    }

    public void u(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f12541k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f12428v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f12427u);
            if (this.f12538h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f12538h));
            }
            if (this.f12534d != 0 || this.f12535e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f12534d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f12535e));
            }
            if (this.f12536f != 0 || this.f12537g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f12536f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f12537g));
            }
            if (this.f12542l != 0 || this.f12543m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f12542l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f12543m);
            }
            if (this.f12544n != 0 || this.f12545o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f12544n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f12545o);
            }
        }
        if (this.f12533c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f12533c.size();
        for (int i4 = 0; i4 < size; i4++) {
            z.a aVar = (z.a) this.f12533c.get(i4);
            switch (aVar.f12550a) {
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
                    str2 = "cmd=" + aVar.f12550a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i4);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f12551b);
            if (z4) {
                if (aVar.f12553d != 0 || aVar.f12554e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f12553d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f12554e));
                }
                if (aVar.f12555f != 0 || aVar.f12556g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f12555f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f12556g));
                }
            }
        }
    }

    void v() {
        int size = this.f12533c.size();
        for (int i4 = 0; i4 < size; i4++) {
            z.a aVar = (z.a) this.f12533c.get(i4);
            Fragment fragment = aVar.f12551b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f12429w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f12538h);
                fragment.setSharedElementNames(this.f12546p, this.f12547q);
            }
            switch (aVar.f12550a) {
                case 1:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.l1(fragment, false);
                    this.f12426t.h(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f12550a);
                case 3:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.c1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.D0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.l1(fragment, false);
                    this.f12426t.p1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.w(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.l1(fragment, false);
                    this.f12426t.n(fragment);
                    break;
                case 8:
                    this.f12426t.n1(fragment);
                    break;
                case 9:
                    this.f12426t.n1(null);
                    break;
                case 10:
                    this.f12426t.m1(fragment, aVar.f12558i);
                    break;
            }
        }
    }

    void w() {
        for (int size = this.f12533c.size() - 1; size >= 0; size--) {
            z.a aVar = (z.a) this.f12533c.get(size);
            Fragment fragment = aVar.f12551b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f12429w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.i1(this.f12538h));
                fragment.setSharedElementNames(this.f12547q, this.f12546p);
            }
            switch (aVar.f12550a) {
                case 1:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.l1(fragment, true);
                    this.f12426t.c1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f12550a);
                case 3:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.h(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.p1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.l1(fragment, true);
                    this.f12426t.D0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.n(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f12553d, aVar.f12554e, aVar.f12555f, aVar.f12556g);
                    this.f12426t.l1(fragment, true);
                    this.f12426t.w(fragment);
                    break;
                case 8:
                    this.f12426t.n1(null);
                    break;
                case 9:
                    this.f12426t.n1(fragment);
                    break;
                case 10:
                    this.f12426t.m1(fragment, aVar.f12557h);
                    break;
            }
        }
    }

    Fragment x(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i4 = 0;
        while (i4 < this.f12533c.size()) {
            z.a aVar = (z.a) this.f12533c.get(i4);
            int i5 = aVar.f12550a;
            if (i5 != 1) {
                if (i5 == 2) {
                    Fragment fragment3 = aVar.f12551b;
                    int i6 = fragment3.mContainerId;
                    boolean z4 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList.get(size);
                        if (fragment4.mContainerId == i6) {
                            if (fragment4 == fragment3) {
                                z4 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f12533c.add(i4, new z.a(9, fragment4, true));
                                    i4++;
                                    fragment2 = null;
                                }
                                z.a aVar2 = new z.a(3, fragment4, true);
                                aVar2.f12553d = aVar.f12553d;
                                aVar2.f12555f = aVar.f12555f;
                                aVar2.f12554e = aVar.f12554e;
                                aVar2.f12556g = aVar.f12556g;
                                this.f12533c.add(i4, aVar2);
                                arrayList.remove(fragment4);
                                i4++;
                            }
                        }
                    }
                    if (z4) {
                        this.f12533c.remove(i4);
                        i4--;
                    } else {
                        aVar.f12550a = 1;
                        aVar.f12552c = true;
                        arrayList.add(fragment3);
                    }
                } else if (i5 == 3 || i5 == 6) {
                    arrayList.remove(aVar.f12551b);
                    Fragment fragment5 = aVar.f12551b;
                    if (fragment5 == fragment2) {
                        this.f12533c.add(i4, new z.a(9, fragment5));
                        i4++;
                        fragment2 = null;
                    }
                } else if (i5 != 7) {
                    if (i5 == 8) {
                        this.f12533c.add(i4, new z.a(9, fragment2, true));
                        aVar.f12552c = true;
                        i4++;
                        fragment2 = aVar.f12551b;
                    }
                }
                i4++;
            }
            arrayList.add(aVar.f12551b);
            i4++;
        }
        return fragment2;
    }

    public String y() {
        return this.f12541k;
    }

    public void z() {
        if (this.f12549s != null) {
            for (int i4 = 0; i4 < this.f12549s.size(); i4++) {
                ((Runnable) this.f12549s.get(i4)).run();
            }
            this.f12549s = null;
        }
    }
}
