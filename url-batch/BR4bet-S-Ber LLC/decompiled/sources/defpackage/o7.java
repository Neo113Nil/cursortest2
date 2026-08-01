package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class o7 implements cn {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public final en p;
    public boolean q;
    public int r;

    public o7(en enVar) {
        enVar.D();
        rm rmVar = enVar.t;
        if (rmVar != null) {
            rmVar.s.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.r = -1;
        this.p = enVar;
    }

    @Override // defpackage.cn
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (en.G(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        en enVar = this.p;
        if (enVar.d == null) {
            enVar.d = new ArrayList();
        }
        enVar.d.add(this);
        return true;
    }

    public final void b(on onVar) {
        this.a.add(onVar);
        onVar.d = this.b;
        onVar.e = this.c;
        onVar.f = this.d;
        onVar.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (en.G(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                on onVar = (on) arrayList.get(i2);
                pm pmVar = onVar.b;
                if (pmVar != null) {
                    pmVar.v += i;
                    if (en.G(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + onVar.b + " to " + onVar.b.v);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.q) {
            g9.s("commit already called");
            return 0;
        }
        if (en.G(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new du());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.q = true;
        boolean z2 = this.g;
        en enVar = this.p;
        if (z2) {
            this.r = enVar.i.getAndIncrement();
        } else {
            this.r = -1;
        }
        enVar.w(this, z);
        return this.r;
    }

    public final void e(int i, pm pmVar, String str, int i2) {
        String str2 = pmVar.P;
        if (str2 != null) {
            nn.c(pmVar, str2);
        }
        Class<?> cls = pmVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = pmVar.C;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(pmVar);
                String str4 = pmVar.C;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            pmVar.C = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + pmVar + " with tag " + str + " to container view with no id");
            }
            int i3 = pmVar.A;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(pmVar);
                int i4 = pmVar.A;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            pmVar.A = i;
            pmVar.B = i;
        }
        b(new on(i2, pmVar));
        pmVar.w = this.p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
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
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            on onVar = (on) arrayList.get(i);
            switch (onVar.a) {
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
                    str2 = "cmd=" + onVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(onVar.b);
            if (z) {
                if (onVar.d != 0 || onVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(onVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(onVar.e));
                }
                if (onVar.f != 0 || onVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(onVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(onVar.g));
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
