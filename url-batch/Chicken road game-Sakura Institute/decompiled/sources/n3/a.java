package n3;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6504a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f6505b;

    /* renamed from: c, reason: collision with root package name */
    public final k f6506c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6507d;

    /* renamed from: e, reason: collision with root package name */
    public int f6508e;

    public a(k kVar) {
        kVar.getClass();
        this.f6504a = new ArrayList();
        this.f6508e = -1;
        this.f6506c = kVar;
    }

    public final int a(boolean z8) {
        String str;
        k kVar = this.f6506c;
        if (this.f6507d) {
            throw new IllegalStateException("commit already called");
        }
        if (k.m(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new n());
            ArrayList arrayList = this.f6504a;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f6508e);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f6507d);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    m mVar = (m) arrayList.get(i7);
                    switch (mVar.f6544a) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
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
                        case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case q.c.f7259c /* 9 */:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case q.c.f7261e /* 10 */:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + mVar.f6544a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i7);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(mVar.f6545b);
                    if (mVar.f6547d != 0 || mVar.f6548e != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(mVar.f6547d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(mVar.f6548e));
                    }
                    if (mVar.f6549f != 0 || mVar.f6550g != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(mVar.f6549f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(mVar.f6550g));
                    }
                }
            }
            printWriter.close();
        }
        this.f6507d = true;
        this.f6508e = -1;
        if (!z8) {
            kVar.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (kVar.f6537c) {
            if (!z8) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.f6508e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f6508e >= 0) {
            sb.append(" #");
            sb.append(this.f6508e);
        }
        sb.append("}");
        return sb.toString();
    }
}
