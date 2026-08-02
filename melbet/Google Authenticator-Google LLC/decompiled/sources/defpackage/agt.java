package defpackage;

import android.util.Log;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agt {
    public final aer a;
    public final agx b;

    public agt(aer aerVar, agk agkVar) {
        this.a = aerVar;
        this.b = (agx) new agj(agkVar, agx.a).a(agx.class);
    }

    public static agt a(aer aerVar) {
        return new agt(aerVar, ((agl) aerVar).O());
    }

    public static boolean b(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Deprecated
    public final void c(String str, PrintWriter printWriter) {
        qz qzVar = this.b.b;
        if (qzVar.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            for (int i = 0; i < qzVar.b(); i++) {
                String concat = str.concat("    ");
                agu aguVar = (agu) qzVar.c(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(qzVar.a(i));
                printWriter.print(": ");
                printWriter.println(aguVar.toString());
                printWriter.print(concat);
                printWriter.print("mId=");
                printWriter.print(aguVar.i);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(concat);
                printWriter.print("mLoader=");
                aha ahaVar = aguVar.j;
                printWriter.println(ahaVar);
                String concat2 = concat.concat("  ");
                printWriter.print(concat2);
                printWriter.print("mId=");
                printWriter.print(ahaVar.d);
                printWriter.print(" mListener=");
                printWriter.println(ahaVar.j);
                if (ahaVar.f || ahaVar.i) {
                    printWriter.print(concat2);
                    printWriter.print("mStarted=");
                    printWriter.print(ahaVar.f);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(ahaVar.i);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (ahaVar.g || ahaVar.h) {
                    printWriter.print(concat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(ahaVar.g);
                    printWriter.print(" mReset=");
                    printWriter.println(ahaVar.h);
                }
                agz agzVar = (agz) ahaVar;
                if (agzVar.a != null) {
                    printWriter.print(concat2);
                    printWriter.print("mTask=");
                    printWriter.print(agzVar.a);
                    printWriter.print(" waiting=");
                    boolean z = agzVar.a.a;
                    printWriter.println(false);
                }
                if (agzVar.b != null) {
                    printWriter.print(concat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(agzVar.b);
                    printWriter.print(" waiting=");
                    boolean z2 = agzVar.b.a;
                    printWriter.println(false);
                }
                if (aguVar.k != null) {
                    printWriter.print(concat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aguVar.k);
                    agv agvVar = aguVar.k;
                    printWriter.print(concat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(agvVar.b);
                }
                printWriter.print(concat);
                printWriter.print("mData=");
                printWriter.println(aha.e(aguVar.a()));
                printWriter.print(concat);
                printWriter.print("mStarted=");
                printWriter.println(aguVar.j());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        aer aerVar = this.a;
        sb.append(aerVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(aerVar)));
        sb.append("}}");
        return sb.toString();
    }
}
