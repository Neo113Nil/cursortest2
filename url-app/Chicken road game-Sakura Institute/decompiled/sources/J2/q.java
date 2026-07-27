package J2;

import java.io.BufferedReader;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.C1331f;

/* loaded from: classes.dex */
public abstract class q {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C1331f.a(th, th2);
            }
        }
    }

    public static final ArrayList b(BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        ArrayList arrayList = new ArrayList();
        p action = new p(arrayList);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
            Iterator it = T2.n.c(new o(bufferedReader)).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f7487a;
            a(bufferedReader, null);
            return arrayList;
        } finally {
        }
    }
}
