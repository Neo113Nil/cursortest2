package Z3;

import R3.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3788c;

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f3789d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3790a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3791b;

    static {
        B3.d a6 = R3.d.a();
        f3788c = new a(new R3.c(), new R3.d((R3.b) a6.f277c, (g) a6.f278d, a6.f276b), g.f3786a, 2000);
        f3789d = Logger.getLogger(i.class.getName());
    }

    public i(ArrayList arrayList) {
        n[] values = n.values();
        if (values.length <= 0) {
            this.f3791b = arrayList;
        } else {
            n nVar = values[0];
            R3.d.a();
            throw null;
        }
    }

    public final List a(V3.b bVar, J3.a aVar) {
        String str;
        n nVar;
        Logger logger;
        int i2;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3791b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = bVar.f3245b;
            nVar = bVar.f3248e;
            logger = f3789d;
            if (!hasNext) {
                break;
            }
            a aVar2 = (a) it.next();
            R3.c cVar = aVar2.f3775a;
            char charAt = "*".charAt(0);
            if (charAt == '*' || charAt == '?') {
                StringBuilder sb = new StringBuilder();
                char charAt2 = "*".charAt(0);
                if (charAt2 == '*' || charAt2 == '?') {
                    if (charAt2 == '*') {
                        sb.append(".*");
                    } else {
                        sb.append(".");
                    }
                    i2 = -1;
                } else {
                    i2 = 0;
                }
                if (i2 != -1) {
                    sb.append(Pattern.quote("*".substring(i2)));
                }
                Pattern.compile(sb.toString());
            }
            R3.b bVar2 = aVar2.f3776b.f2623a;
            if (((T3.b) bVar2).a(bVar)) {
                arrayList.add(aVar2);
            } else {
                logger.log(Level.WARNING, "View aggregation " + T3.a.a(bVar2) + " is incompatible with instrument " + str + " of type " + nVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        a aVar3 = (a) this.f3790a.get(nVar);
        Objects.requireNonNull(aVar3);
        R3.b bVar3 = aVar3.f3776b.f2623a;
        if (!((T3.b) bVar3).a(bVar)) {
            logger.log(Level.WARNING, "Instrument default aggregation " + T3.a.a(bVar3) + " is incompatible with instrument " + str + " of type " + nVar);
            aVar3 = f3788c;
        }
        bVar.f3250g.getClass();
        return Collections.singletonList(aVar3);
    }
}
