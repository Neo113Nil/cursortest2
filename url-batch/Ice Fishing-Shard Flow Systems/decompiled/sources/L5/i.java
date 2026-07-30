package L5;

import B6.o;
import D5.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import v5.C0975a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1698c;

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f1699d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1700a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1701b;

    static {
        o a7 = D5.d.a();
        f1698c = new a(new D5.c(), new D5.d((D5.b) a7.f230c, (g) a7.f231d, a7.f229b), g.f1696a, 2000);
        f1699d = Logger.getLogger(i.class.getName());
    }

    public i(ArrayList arrayList) {
        n[] values = n.values();
        if (values.length <= 0) {
            this.f1701b = arrayList;
        } else {
            n nVar = values[0];
            D5.d.a();
            throw null;
        }
    }

    public final List a(H5.b bVar, C0975a c0975a) {
        Logger logger;
        int i2;
        int i5;
        String str = bVar.f999b;
        n nVar = bVar.f1002e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f1701b;
        int size = arrayList2.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            logger = f1699d;
            if (i8 >= size) {
                break;
            }
            Object obj = arrayList2.get(i8);
            i8++;
            a aVar = (a) obj;
            D5.c cVar = aVar.f1685a;
            D5.b bVar2 = aVar.f1686b.f358a;
            char charAt = "*".charAt(i7);
            ArrayList arrayList3 = arrayList2;
            if (charAt == '*' || charAt == '?') {
                StringBuilder sb = new StringBuilder();
                i2 = size;
                char charAt2 = "*".charAt(0);
                if (charAt2 == '*' || charAt2 == '?') {
                    if (charAt2 == '*') {
                        sb.append(".*");
                    } else {
                        sb.append(".");
                    }
                    i5 = -1;
                } else {
                    i5 = 0;
                }
                if (i5 != -1) {
                    sb.append(Pattern.quote("*".substring(i5)));
                }
                Pattern.compile(sb.toString());
            } else {
                i2 = size;
            }
            if (((F5.b) bVar2).a(bVar)) {
                arrayList.add(aVar);
            } else {
                logger.log(Level.WARNING, "View aggregation " + F5.a.a(bVar2) + " is incompatible with instrument " + str + " of type " + nVar);
            }
            size = i2;
            arrayList2 = arrayList3;
            i7 = 0;
        }
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        a aVar2 = (a) this.f1700a.get(nVar);
        Objects.requireNonNull(aVar2);
        D5.b bVar3 = aVar2.f1686b.f358a;
        if (!((F5.b) bVar3).a(bVar)) {
            logger.log(Level.WARNING, "Instrument default aggregation " + F5.a.a(bVar3) + " is incompatible with instrument " + str + " of type " + nVar);
            aVar2 = f1698c;
        }
        bVar.f1004g.getClass();
        return Collections.singletonList(aVar2);
    }
}
