package k7;

import c7.n;
import com.anythink.core.common.d.j;
import e7.AbstractC4479a;
import e7.InterfaceC4480b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: k7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4668i {

    /* renamed from: c, reason: collision with root package name */
    public static final C4660a f38826c;

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f38827d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f38828a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f38829b;

    static {
        F.d a9 = c7.d.a();
        f38826c = new C4660a(new c7.c(), new c7.d((c7.b) a9.f909c, (C4666g) a9.f910d, a9.f908b), C4666g.f38824a, 2000);
        f38827d = Logger.getLogger(C4668i.class.getName());
    }

    public C4668i(ArrayList arrayList) {
        n[] values = n.values();
        if (values.length <= 0) {
            this.f38829b = arrayList;
        } else {
            n nVar = values[0];
            c7.d.a();
            throw null;
        }
    }

    public final List a(g7.b bVar, U6.a aVar) {
        String str;
        n nVar;
        Logger logger;
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f38829b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = bVar.f37940b;
            nVar = bVar.f37943e;
            logger = f38827d;
            if (!hasNext) {
                break;
            }
            C4660a c4660a = (C4660a) it.next();
            c7.c cVar = c4660a.f38813a;
            char charAt = "*".charAt(0);
            if (charAt == '*' || charAt == '?') {
                StringBuilder sb = new StringBuilder();
                char charAt2 = "*".charAt(0);
                if (charAt2 == '*' || charAt2 == '?') {
                    if (charAt2 == '*') {
                        sb.append(".*");
                    } else {
                        sb.append(j.f12535z);
                    }
                    i = -1;
                } else {
                    i = 0;
                }
                if (i != -1) {
                    sb.append(Pattern.quote("*".substring(i)));
                }
                Pattern.compile(sb.toString());
            }
            c7.b bVar2 = c4660a.f38814b.f5715a;
            if (((InterfaceC4480b) bVar2).a(bVar)) {
                arrayList.add(c4660a);
            } else {
                logger.log(Level.WARNING, "View aggregation " + AbstractC4479a.a(bVar2) + " is incompatible with instrument " + str + " of type " + nVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        C4660a c4660a2 = (C4660a) this.f38828a.get(nVar);
        Objects.requireNonNull(c4660a2);
        c7.b bVar3 = c4660a2.f38814b.f5715a;
        if (!((InterfaceC4480b) bVar3).a(bVar)) {
            logger.log(Level.WARNING, "Instrument default aggregation " + AbstractC4479a.a(bVar3) + " is incompatible with instrument " + str + " of type " + nVar);
            c4660a2 = f38826c;
        }
        bVar.f37945g.getClass();
        return Collections.singletonList(c4660a2);
    }
}
