package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hbw implements BinaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ hbw(int i) {
        this.a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            heg hegVar = (heg) obj;
            heg hegVar2 = (heg) obj2;
            hegVar.a(hegVar2.a, hegVar2.b);
            return hegVar;
        }
        if (i == 1) {
            brn brnVar = (brn) obj;
            Iterator it = ((brn) obj2).a.iterator();
            while (it.hasNext()) {
                brnVar.n((hip) it.next());
            }
            return brnVar;
        }
        if (i == 2) {
            hfk hfkVar = (hfk) obj;
            hfkVar.k((hfk) obj2);
            return hfkVar;
        }
        hhs hhsVar = (hhs) obj;
        hhs hhsVar2 = (hhs) obj2;
        if (hhsVar.a == null) {
            return hhsVar2;
        }
        if (hhsVar2.a != null) {
            if (hhsVar.b.isEmpty()) {
                hhsVar.b = new ArrayList();
            }
            hhsVar.b.add(hhsVar2.a);
            hhsVar.b.addAll(hhsVar2.b);
            if (hhsVar.b.size() > 4) {
                ?? r2 = hhsVar.b;
                r2.subList(4, r2.size()).clear();
                throw hhsVar.a(true);
            }
        }
        return hhsVar;
    }
}
