package G6;

import E6.e;
import H6.r;
import H6.s;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f850e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f851f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s sVar, String str) {
        super(str);
        this.f851f = sVar;
    }

    @Override // G6.a
    public final long a() {
        r connection;
        switch (this.f850e) {
            case 0:
                ((Function0) this.f851f).invoke();
                return -1L;
            default:
                s sVar = (s) this.f851f;
                long nanoTime = System.nanoTime();
                Map map = sVar.f1103b;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                Iterator it2 = sVar.f1106e.iterator();
                Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                while (it2.hasNext()) {
                    if (map.get(((r) it2.next()).f1088d.f444a) != null) {
                        throw new ClassCastException();
                    }
                }
                long j = (nanoTime - sVar.f1102a) + 1;
                Iterator it3 = sVar.f1106e.iterator();
                Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
                int i2 = 0;
                long j7 = Long.MAX_VALUE;
                r rVar = null;
                r rVar2 = null;
                int i5 = 0;
                while (it3.hasNext()) {
                    r rVar3 = (r) it3.next();
                    Intrinsics.b(rVar3);
                    synchronized (rVar3) {
                        if (sVar.a(rVar3, nanoTime) > 0) {
                            i5++;
                        } else {
                            int i7 = i5;
                            long j8 = rVar3.f1101r;
                            if (j8 < j) {
                                rVar = rVar3;
                                j = j8;
                            }
                            if (map.get(rVar3.f1088d.f444a) != null) {
                                throw new ClassCastException();
                            }
                            i2++;
                            if (j8 < j7) {
                                rVar2 = rVar3;
                                j7 = j8;
                            }
                            i5 = i7;
                        }
                        Unit unit = Unit.f6114a;
                    }
                }
                int i8 = i5;
                if (rVar != null) {
                    connection = rVar;
                } else if (i2 > 5) {
                    j = j7;
                    connection = rVar2;
                } else {
                    j = -1;
                    connection = null;
                }
                if (connection == null) {
                    if (rVar2 != null) {
                        return (j7 + sVar.f1102a) - nanoTime;
                    }
                    if (i8 > 0) {
                        return sVar.f1102a;
                    }
                    return -1L;
                }
                synchronized (connection) {
                    if (connection.f1100q.isEmpty() && connection.f1101r == j) {
                        connection.f1094k = true;
                        sVar.f1106e.remove(connection);
                        if (map.get(connection.f1088d.f444a) != null) {
                            throw new ClassCastException();
                        }
                        e.c(connection.f1090f);
                        Intrinsics.checkNotNullParameter(connection, "connection");
                        if (sVar.f1106e.isEmpty()) {
                            sVar.f1104c.a();
                        }
                    }
                }
                return 0L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Function0 function0) {
        super(str);
        this.f851f = function0;
    }
}
