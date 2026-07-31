package N;

import android.util.Log;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1635a;

    /* renamed from: b, reason: collision with root package name */
    public final F3.g f1636b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1637c;

    /* renamed from: d, reason: collision with root package name */
    public int f1638d;

    public a(F3.g gVar) {
        gVar.getClass();
        this.f1635a = new ArrayList();
        this.f1638d = -1;
        this.f1636b = gVar;
    }

    public final int a(boolean z5) {
        String str;
        F3.g gVar = this.f1636b;
        if (this.f1637c) {
            throw new IllegalStateException("commit already called");
        }
        if (F3.g.o(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new m());
            ArrayList arrayList = this.f1635a;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1638d);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1637c);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    l lVar = (l) arrayList.get(i7);
                    switch (lVar.f1667a) {
                        case 0:
                            str = "NULL";
                            break;
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            str = "ADD";
                            break;
                        case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
                        case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + lVar.f1667a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i7);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(lVar.f1668b);
                    if (lVar.f1669c != 0 || lVar.f1670d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(lVar.f1669c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(lVar.f1670d));
                    }
                    if (lVar.f1671e != 0 || lVar.f1672f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(lVar.f1671e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(lVar.f1672f));
                    }
                }
            }
            printWriter.close();
        }
        this.f1637c = true;
        this.f1638d = -1;
        if (!z5) {
            gVar.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (((ArrayList) gVar.f734h)) {
            if (!z5) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.f1638d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1638d >= 0) {
            sb.append(" #");
            sb.append(this.f1638d);
        }
        sb.append("}");
        return sb.toString();
    }
}
