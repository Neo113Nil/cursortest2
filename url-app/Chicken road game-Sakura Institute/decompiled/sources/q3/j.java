package q3;

import A.AbstractC0017m;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.C0862a;
import u3.n;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f9420a;

    /* renamed from: b, reason: collision with root package name */
    public final p3.c f9421b;

    /* renamed from: c, reason: collision with root package name */
    public final p3.b f9422c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f9423d;

    public j(p3.d taskRunner, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f9420a = timeUnit.toNanos(5L);
        this.f9421b = taskRunner.e();
        this.f9422c = new p3.b(this, AbstractC0017m.n(new StringBuilder(), n3.b.f8564g, " ConnectionPool"));
        this.f9423d = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        if ((r1.f9409g != null) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(C0862a address, g call, ArrayList arrayList, boolean z4) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f9423d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            i connection = (i) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z4) {
                }
                if (connection.h(address, arrayList)) {
                    call.a(connection);
                    return true;
                }
                Unit unit = Unit.f7487a;
            }
        }
    }

    public final int b(i iVar, long j4) {
        byte[] bArr = n3.b.f8558a;
        ArrayList arrayList = iVar.f9418p;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                String str = "A connection to " + iVar.f9404b.f8490a.f8320h + " was leaked. Did you forget to close a response body?";
                n nVar = n.f10964a;
                n.f10964a.j(((e) reference).f9386a, str);
                arrayList.remove(i2);
                iVar.f9412j = true;
                if (arrayList.isEmpty()) {
                    iVar.f9419q = j4 - this.f9420a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
