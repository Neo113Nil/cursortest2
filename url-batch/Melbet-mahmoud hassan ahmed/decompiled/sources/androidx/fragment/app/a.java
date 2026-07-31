package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import c4.w0;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class a extends n implements j.k {

    /* renamed from: s, reason: collision with root package name */
    final j f639s;

    /* renamed from: t, reason: collision with root package name */
    boolean f640t;

    /* renamed from: u, reason: collision with root package name */
    int f641u = -1;

    public a(j jVar) {
        this.f639s = jVar;
    }

    private static boolean r(n.a aVar) {
        Fragment fragment = aVar.f784b;
        return (fragment == null || !fragment.f605p || fragment.L == null || fragment.E || fragment.D || !fragment.O()) ? false : true;
    }

    @Override // androidx.fragment.app.j.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j.M) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f772h) {
            return true;
        }
        this.f639s.i(this);
        return true;
    }

    @Override // androidx.fragment.app.n
    public int d() {
        return i(false);
    }

    @Override // androidx.fragment.app.n
    public int e() {
        return i(true);
    }

    @Override // androidx.fragment.app.n
    void f(int i7, Fragment fragment, String str, int i8) {
        super.f(i7, fragment, str, i8);
        fragment.f612w = this.f639s;
    }

    @Override // androidx.fragment.app.n
    public n g(Fragment fragment) {
        j jVar = fragment.f612w;
        if (jVar == null || jVar == this.f639s) {
            return super.g(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void h(int i7) {
        if (this.f772h) {
            if (j.M) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            int size = this.f765a.size();
            for (int i8 = 0; i8 < size; i8++) {
                n.a aVar = this.f765a.get(i8);
                Fragment fragment = aVar.f784b;
                if (fragment != null) {
                    fragment.f611v += i7;
                    if (j.M) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f784b + " to " + aVar.f784b.f611v);
                    }
                }
            }
        }
    }

    int i(boolean z6) {
        if (this.f640t) {
            throw new IllegalStateException("commit already called");
        }
        if (j.M) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new q.c("FragmentManager"));
            j("  ", printWriter);
            printWriter.close();
        }
        this.f640t = true;
        this.f641u = this.f772h ? this.f639s.l(this) : -1;
        this.f639s.g0(this, z6);
        return this.f641u;
    }

    public void j(String str, PrintWriter printWriter) {
        k(str, printWriter, true);
    }

    public void k(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f774j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f641u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f640t);
            if (this.f770f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f770f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f771g));
            }
            if (this.f766b != 0 || this.f767c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f766b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f767c));
            }
            if (this.f768d != 0 || this.f769e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f768d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f769e));
            }
            if (this.f775k != 0 || this.f776l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f775k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f776l);
            }
            if (this.f777m != 0 || this.f778n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f777m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f778n);
            }
        }
        if (this.f765a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f765a.size();
        for (int i7 = 0; i7 < size; i7++) {
            n.a aVar = this.f765a.get(i7);
            switch (aVar.f783a) {
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
                case w0.f2149o /* 7 */:
                    str2 = "ATTACH";
                    break;
                case w0.f2150p /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f783a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f784b);
            if (z6) {
                if (aVar.f785c != 0 || aVar.f786d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f785c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f786d));
                }
                if (aVar.f787e != 0 || aVar.f788f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f787e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f788f));
                }
            }
        }
    }

    void l() {
        int size = this.f765a.size();
        for (int i7 = 0; i7 < size; i7++) {
            n.a aVar = this.f765a.get(i7);
            Fragment fragment = aVar.f784b;
            if (fragment != null) {
                fragment.g1(this.f770f, this.f771g);
            }
            switch (aVar.f783a) {
                case 1:
                    fragment.f1(aVar.f785c);
                    this.f639s.j(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f783a);
                case 3:
                    fragment.f1(aVar.f786d);
                    this.f639s.X0(fragment);
                    break;
                case 4:
                    fragment.f1(aVar.f786d);
                    this.f639s.B0(fragment);
                    break;
                case 5:
                    fragment.f1(aVar.f785c);
                    this.f639s.k1(fragment);
                    break;
                case 6:
                    fragment.f1(aVar.f786d);
                    this.f639s.v(fragment);
                    break;
                case w0.f2149o /* 7 */:
                    fragment.f1(aVar.f785c);
                    this.f639s.o(fragment);
                    break;
                case w0.f2150p /* 8 */:
                    this.f639s.j1(fragment);
                    break;
                case 9:
                    this.f639s.j1(null);
                    break;
                case 10:
                    this.f639s.i1(fragment, aVar.f790h);
                    break;
            }
            if (!this.f781q && aVar.f783a != 1 && fragment != null) {
                this.f639s.N0(fragment);
            }
        }
        if (this.f781q) {
            return;
        }
        j jVar = this.f639s;
        jVar.O0(jVar.f701u, true);
    }

    void m(boolean z6) {
        for (int size = this.f765a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f765a.get(size);
            Fragment fragment = aVar.f784b;
            if (fragment != null) {
                fragment.g1(j.c1(this.f770f), this.f771g);
            }
            switch (aVar.f783a) {
                case 1:
                    fragment.f1(aVar.f788f);
                    this.f639s.X0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f783a);
                case 3:
                    fragment.f1(aVar.f787e);
                    this.f639s.j(fragment, false);
                    break;
                case 4:
                    fragment.f1(aVar.f787e);
                    this.f639s.k1(fragment);
                    break;
                case 5:
                    fragment.f1(aVar.f788f);
                    this.f639s.B0(fragment);
                    break;
                case 6:
                    fragment.f1(aVar.f787e);
                    this.f639s.o(fragment);
                    break;
                case w0.f2149o /* 7 */:
                    fragment.f1(aVar.f788f);
                    this.f639s.v(fragment);
                    break;
                case w0.f2150p /* 8 */:
                    this.f639s.j1(null);
                    break;
                case 9:
                    this.f639s.j1(fragment);
                    break;
                case 10:
                    this.f639s.i1(fragment, aVar.f789g);
                    break;
            }
            if (!this.f781q && aVar.f783a != 3 && fragment != null) {
                this.f639s.N0(fragment);
            }
        }
        if (this.f781q || !z6) {
            return;
        }
        j jVar = this.f639s;
        jVar.O0(jVar.f701u, true);
    }

    Fragment n(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i7 = 0;
        while (i7 < this.f765a.size()) {
            n.a aVar = this.f765a.get(i7);
            int i8 = aVar.f783a;
            if (i8 != 1) {
                if (i8 == 2) {
                    Fragment fragment3 = aVar.f784b;
                    int i9 = fragment3.B;
                    boolean z6 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.B == i9) {
                            if (fragment4 == fragment3) {
                                z6 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f765a.add(i7, new n.a(9, fragment4));
                                    i7++;
                                    fragment2 = null;
                                }
                                n.a aVar2 = new n.a(3, fragment4);
                                aVar2.f785c = aVar.f785c;
                                aVar2.f787e = aVar.f787e;
                                aVar2.f786d = aVar.f786d;
                                aVar2.f788f = aVar.f788f;
                                this.f765a.add(i7, aVar2);
                                arrayList.remove(fragment4);
                                i7++;
                            }
                        }
                    }
                    if (z6) {
                        this.f765a.remove(i7);
                        i7--;
                    } else {
                        aVar.f783a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i8 == 3 || i8 == 6) {
                    arrayList.remove(aVar.f784b);
                    Fragment fragment5 = aVar.f784b;
                    if (fragment5 == fragment2) {
                        this.f765a.add(i7, new n.a(9, fragment5));
                        i7++;
                        fragment2 = null;
                    }
                } else if (i8 != 7) {
                    if (i8 == 8) {
                        this.f765a.add(i7, new n.a(9, fragment2));
                        i7++;
                        fragment2 = aVar.f784b;
                    }
                }
                i7++;
            }
            arrayList.add(aVar.f784b);
            i7++;
        }
        return fragment2;
    }

    public String o() {
        return this.f774j;
    }

    boolean p(int i7) {
        int size = this.f765a.size();
        for (int i8 = 0; i8 < size; i8++) {
            Fragment fragment = this.f765a.get(i8).f784b;
            int i9 = fragment != null ? fragment.B : 0;
            if (i9 != 0 && i9 == i7) {
                return true;
            }
        }
        return false;
    }

    boolean q(ArrayList<a> arrayList, int i7, int i8) {
        if (i8 == i7) {
            return false;
        }
        int size = this.f765a.size();
        int i9 = -1;
        for (int i10 = 0; i10 < size; i10++) {
            Fragment fragment = this.f765a.get(i10).f784b;
            int i11 = fragment != null ? fragment.B : 0;
            if (i11 != 0 && i11 != i9) {
                for (int i12 = i7; i12 < i8; i12++) {
                    a aVar = arrayList.get(i12);
                    int size2 = aVar.f765a.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        Fragment fragment2 = aVar.f765a.get(i13).f784b;
                        if ((fragment2 != null ? fragment2.B : 0) == i11) {
                            return true;
                        }
                    }
                }
                i9 = i11;
            }
        }
        return false;
    }

    boolean s() {
        for (int i7 = 0; i7 < this.f765a.size(); i7++) {
            if (r(this.f765a.get(i7))) {
                return true;
            }
        }
        return false;
    }

    public void t() {
        if (this.f782r != null) {
            for (int i7 = 0; i7 < this.f782r.size(); i7++) {
                this.f782r.get(i7).run();
            }
            this.f782r = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f641u >= 0) {
            sb.append(" #");
            sb.append(this.f641u);
        }
        if (this.f774j != null) {
            sb.append(" ");
            sb.append(this.f774j);
        }
        sb.append("}");
        return sb.toString();
    }

    void u(Fragment.f fVar) {
        for (int i7 = 0; i7 < this.f765a.size(); i7++) {
            n.a aVar = this.f765a.get(i7);
            if (r(aVar)) {
                aVar.f784b.h1(fVar);
            }
        }
    }

    Fragment v(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f765a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f765a.get(size);
            int i7 = aVar.f783a;
            if (i7 != 1) {
                if (i7 != 3) {
                    switch (i7) {
                        case w0.f2150p /* 8 */:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f784b;
                            break;
                        case 10:
                            aVar.f790h = aVar.f789g;
                            break;
                    }
                }
                arrayList.add(aVar.f784b);
            }
            arrayList.remove(aVar.f784b);
        }
        return fragment;
    }
}
