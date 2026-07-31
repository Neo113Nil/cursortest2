package h4;

import a0.q;
import android.content.DialogInterface;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class e extends f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: n, reason: collision with root package name */
    public final d f3172n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3173o;

    /* renamed from: p, reason: collision with root package name */
    public int f3174p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3175q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3176r;

    public e() {
        new b(0, this);
        new c(this);
        this.f3172n = new d(this);
        this.f3173o = true;
        this.f3174p = -1;
        new b1.b(11, this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.f3175q) {
            return;
        }
        if (j.m(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f3176r) {
            return;
        }
        this.f3176r = true;
        this.f3175q = true;
        if (this.f3174p >= 0) {
            j c8 = c();
            int i = this.f3174p;
            if (i < 0) {
                throw new IllegalArgumentException(q.h("Bad id: ", i));
            }
            synchronized (((ArrayList) c8.f3190c)) {
            }
            this.f3174p = -1;
            return;
        }
        a aVar = new a(c());
        l lVar = new l();
        lVar.f3195a = 3;
        lVar.f3196b = this;
        ((ArrayList) aVar.f3166d).add(lVar);
        lVar.f3197c = 0;
        lVar.f3198d = 0;
        lVar.f3199e = 0;
        lVar.f3200f = 0;
        j jVar = (j) aVar.f3167e;
        if (aVar.f3165c) {
            throw new IllegalStateException("commit already called");
        }
        if (j.m(2)) {
            Log.v("FragmentManager", "Commit: " + aVar);
            PrintWriter printWriter = new PrintWriter(new m());
            ArrayList arrayList = (ArrayList) aVar.f3166d;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(aVar.f3164b);
            printWriter.print(" mCommitted=");
            printWriter.println(aVar.f3165c);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    l lVar2 = (l) arrayList.get(i8);
                    switch (lVar2.f3195a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            str = "REPLACE";
                            break;
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            str = "REMOVE";
                            break;
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case v0.f8304b /* 9 */:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case v0.f8306d /* 10 */:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + lVar2.f3195a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i8);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(lVar2.f3196b);
                    if (lVar2.f3197c != 0 || lVar2.f3198d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(lVar2.f3197c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(lVar2.f3198d));
                    }
                    if (lVar2.f3199e != 0 || lVar2.f3200f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(lVar2.f3199e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(lVar2.f3200f));
                    }
                }
            }
            printWriter.close();
        }
        aVar.f3165c = true;
        aVar.f3164b = -1;
        synchronized (((ArrayList) jVar.f3190c)) {
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
