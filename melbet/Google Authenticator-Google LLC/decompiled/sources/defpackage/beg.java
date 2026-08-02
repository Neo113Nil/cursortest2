package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class beg {
    private final bef a = new bef(null);
    private final Map b = new HashMap();

    private static void d(bef befVar) {
        bef befVar2 = befVar.d;
        befVar2.c = befVar.c;
        befVar.c.d = befVar2;
    }

    private static void e(bef befVar) {
        befVar.c.d = befVar;
        befVar.d.c = befVar;
    }

    public final Object a(ben benVar) {
        Map map = this.b;
        bef befVar = (bef) map.get(benVar);
        if (befVar == null) {
            befVar = new bef(benVar);
            map.put(benVar, befVar);
        } else {
            benVar.a();
        }
        d(befVar);
        bef befVar2 = this.a;
        befVar.d = befVar2;
        befVar.c = befVar2.c;
        e(befVar);
        return befVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ben, java.lang.Object] */
    public final Object b() {
        bef befVar = this.a;
        for (bef befVar2 = befVar.d; !befVar2.equals(befVar); befVar2 = befVar2.d) {
            Object b = befVar2.b();
            if (b != null) {
                return b;
            }
            d(befVar2);
            Map map = this.b;
            ?? r3 = befVar2.a;
            map.remove(r3);
            r3.a();
        }
        return null;
    }

    public final void c(ben benVar, Object obj) {
        Map map = this.b;
        bef befVar = (bef) map.get(benVar);
        if (befVar == null) {
            befVar = new bef(benVar);
            d(befVar);
            bef befVar2 = this.a;
            befVar.d = befVar2.d;
            befVar.c = befVar2;
            e(befVar);
            map.put(benVar, befVar);
        } else {
            benVar.a();
        }
        if (befVar.b == null) {
            befVar.b = new ArrayList();
        }
        befVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        bef befVar = this.a;
        bef befVar2 = befVar.c;
        boolean z = false;
        while (!befVar2.equals(befVar)) {
            sb.append('{');
            sb.append(befVar2.a);
            sb.append(':');
            sb.append(befVar2.a());
            sb.append("}, ");
            befVar2 = befVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
