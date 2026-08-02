package P;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1210a;

    /* renamed from: b, reason: collision with root package name */
    public final k f1211b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1212c;

    /* renamed from: d, reason: collision with root package name */
    public int f1213d;

    public a(k kVar) {
        kVar.getClass();
        this.f1210a = new ArrayList();
        this.f1213d = -1;
        this.f1211b = kVar;
    }

    public final int a(boolean z) {
        String str;
        if (this.f1212c) {
            throw new IllegalStateException("commit already called");
        }
        if (k.j(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new n());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1213d);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1212c);
            ArrayList arrayList = this.f1210a;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    m mVar = (m) arrayList.get(i3);
                    switch (mVar.f1245a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + mVar.f1245a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(mVar.f1246b);
                    if (mVar.f1247c != 0 || mVar.f1248d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(mVar.f1247c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(mVar.f1248d));
                    }
                    if (mVar.f1249e != 0 || mVar.f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(mVar.f1249e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(mVar.f));
                    }
                }
            }
            printWriter.close();
        }
        this.f1212c = true;
        k kVar = this.f1211b;
        this.f1213d = -1;
        if (!z) {
            kVar.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (kVar.f1238a) {
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.f1213d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1213d >= 0) {
            sb.append(" #");
            sb.append(this.f1213d);
        }
        sb.append("}");
        return sb.toString();
    }
}
