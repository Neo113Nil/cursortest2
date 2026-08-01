package f4;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4065a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4066b;

    /* renamed from: c, reason: collision with root package name */
    public final j f4067c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4068d;

    /* renamed from: e, reason: collision with root package name */
    public int f4069e;

    public a(j jVar) {
        jVar.getClass();
        this.f4065a = new ArrayList();
        this.f4069e = -1;
        this.f4067c = jVar;
    }

    public final int a(boolean z10) {
        String str;
        j jVar = this.f4067c;
        if (this.f4068d) {
            i0.l("commit already called");
            return 0;
        }
        if (j.j(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new m());
            ArrayList arrayList = this.f4065a;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4069e);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4068d);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    l lVar = (l) arrayList.get(i3);
                    switch (lVar.f4096a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            str = "REMOVE";
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            str = "HIDE";
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            str = "SHOW";
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "DETACH";
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + lVar.f4096a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(lVar.f4097b);
                    if (lVar.f4099d != 0 || lVar.f4100e != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(lVar.f4099d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(lVar.f4100e));
                    }
                    if (lVar.f4101f != 0 || lVar.g != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(lVar.f4101f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(lVar.g));
                    }
                }
            }
            printWriter.close();
        }
        this.f4068d = true;
        this.f4069e = -1;
        if (!z10) {
            jVar.getClass();
            i0.l("FragmentManager has not been attached to a host.");
            return 0;
        }
        synchronized (jVar.f4089a) {
            if (!z10) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.f4069e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4069e >= 0) {
            sb2.append(" #");
            sb2.append(this.f4069e);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
