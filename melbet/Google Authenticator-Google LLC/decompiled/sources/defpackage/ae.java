package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ae extends cf implements bv {
    public final by a;
    boolean b;
    int c;

    public ae(by byVar) {
        byVar.g();
        bl blVar = byVar.l;
        if (blVar != null) {
            blVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = byVar;
    }

    final void a(int i) {
        if (this.j) {
            if (by.U(2)) {
                toString();
            }
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ce ceVar = (ce) arrayList.get(i2);
                bd bdVar = ceVar.b;
                if (bdVar != null) {
                    bdVar.B += i;
                    if (by.U(2)) {
                        Objects.toString(ceVar.b);
                        int i3 = ceVar.b.B;
                    }
                }
            }
        }
    }

    final void b() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ce ceVar = (ce) arrayList.get(size);
            if (ceVar.c) {
                int i = size - 1;
                if (ceVar.a == 8) {
                    ceVar.c = false;
                    arrayList.remove(i);
                    size = i;
                } else {
                    int i2 = ceVar.b.H;
                    ceVar.a = 2;
                    ceVar.c = false;
                    while (i >= 0) {
                        ce ceVar2 = (ce) arrayList.get(i);
                        if (ceVar2.c && ceVar2.b.H == i2) {
                            arrayList.remove(i);
                            size--;
                        }
                        i--;
                    }
                }
            }
        }
    }

    @Override // defpackage.cf
    public final void c() {
        l();
        this.a.G(this, false);
    }

    @Override // defpackage.cf
    public final void d(int i, bd bdVar, String str, int i2) {
        String str2 = bdVar.Y;
        if (str2 != null) {
            ado.a(bdVar, str2);
        }
        Class<?> cls = bdVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = bdVar.I;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + bdVar + ": was " + bdVar.I + " now " + str);
            }
            bdVar.I = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + bdVar + " with tag " + str + " to container view with no id");
            }
            int i3 = bdVar.G;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + bdVar + ": was " + bdVar.G + " now " + i);
            }
            bdVar.G = i;
            bdVar.H = i;
        }
        k(new ce(i2, bdVar));
        bdVar.C = this.a;
    }

    public final void e(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ce ceVar = (ce) arrayList.get(i);
            switch (ceVar.a) {
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
                    str2 = "cmd=" + ceVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(ceVar.b);
            if (z) {
                if (ceVar.d != 0 || ceVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(ceVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(ceVar.e));
                }
                if (ceVar.f != 0 || ceVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(ceVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(ceVar.g));
                }
            }
        }
    }

    @Override // defpackage.bv
    public final boolean f(ArrayList arrayList, ArrayList arrayList2) {
        if (by.U(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.j) {
            return true;
        }
        this.a.c.add(this);
        return true;
    }

    @Override // defpackage.cf
    public final boolean g() {
        return this.d.isEmpty();
    }

    public final void h(boolean z, boolean z2) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (by.U(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new cj());
            e("  ", printWriter, true);
            printWriter.close();
        }
        this.b = true;
        if (this.j) {
            this.c = this.a.h.getAndIncrement();
        } else {
            this.c = -1;
        }
        if (z2) {
            this.a.F(this, z);
        }
    }

    @Override // defpackage.cf
    public final void i(bd bdVar) {
        by byVar = bdVar.C;
        if (byVar == null || byVar == this.a) {
            k(new ce(3, bdVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + bdVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.cf
    public final void j(bd bdVar, aek aekVar) {
        by byVar = bdVar.C;
        by byVar2 = this.a;
        if (byVar != byVar2) {
            Objects.toString(byVar2);
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ".concat(byVar2.toString()));
        }
        if (aekVar == aek.b && bdVar.h >= 0) {
            throw new IllegalArgumentException(a.ab(aekVar, "Cannot set maximum Lifecycle to ", " after the Fragment has been created"));
        }
        if (aekVar == aek.a) {
            throw new IllegalArgumentException(a.ab(aekVar, "Cannot set maximum Lifecycle to ", ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."));
        }
        k(new ce(bdVar, aekVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }
}
