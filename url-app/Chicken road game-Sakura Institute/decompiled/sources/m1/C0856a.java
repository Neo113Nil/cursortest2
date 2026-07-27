package m1;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import q.AbstractC1024c;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0856a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8248a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f8249b;

    /* renamed from: c, reason: collision with root package name */
    public final k f8250c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8251d;

    /* renamed from: e, reason: collision with root package name */
    public int f8252e;

    public C0856a(k kVar) {
        kVar.getClass();
        this.f8248a = new ArrayList();
        this.f8252e = -1;
        this.f8250c = kVar;
    }

    public final int a(boolean z4) {
        String str;
        if (this.f8251d) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new n());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8252e);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f8251d);
            ArrayList arrayList = this.f8248a;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m mVar = (m) arrayList.get(i2);
                    switch (mVar.f8288a) {
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
                        case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case AbstractC1024c.f9242c /* 9 */:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + mVar.f8288a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(mVar.f8289b);
                    if (mVar.f8291d != 0 || mVar.f8292e != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(mVar.f8291d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(mVar.f8292e));
                    }
                    if (mVar.f8293f != 0 || mVar.f8294g != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(mVar.f8293f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(mVar.f8294g));
                    }
                }
            }
            printWriter.close();
        }
        this.f8251d = true;
        k kVar = this.f8250c;
        this.f8252e = -1;
        if (!z4) {
            kVar.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (kVar.f8281c) {
            if (!z4) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.f8252e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8252e >= 0) {
            sb.append(" #");
            sb.append(this.f8252e);
        }
        sb.append("}");
        return sb.toString();
    }
}
