package e5;

import W4.n;
import a5.C0232b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: e5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354i {

    /* renamed from: c, reason: collision with root package name */
    public static final C0346a f4020c;

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f4021d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4022a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4023b;

    static {
        D1.b a7 = W4.d.a();
        f4020c = new C0346a(new W4.c(), new W4.d((W4.b) a7.f369c, (C0352g) a7.f370d, a7.f368b), C0352g.f4018a, 2000);
        f4021d = Logger.getLogger(C0354i.class.getName());
    }

    public C0354i(ArrayList arrayList) {
        n[] values = n.values();
        if (values.length <= 0) {
            this.f4023b = arrayList;
        } else {
            n nVar = values[0];
            W4.d.a();
            throw null;
        }
    }

    public final List a(C0232b c0232b, O4.a aVar) {
        Logger logger;
        int i7;
        int i8;
        String str = c0232b.f3148b;
        n nVar = c0232b.f3151e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f4023b;
        int size = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            logger = f4021d;
            if (i10 >= size) {
                break;
            }
            Object obj = arrayList2.get(i10);
            i10++;
            C0346a c0346a = (C0346a) obj;
            W4.c cVar = c0346a.f4007a;
            W4.b bVar = c0346a.f4008b.f2803a;
            char charAt = "*".charAt(i9);
            ArrayList arrayList3 = arrayList2;
            if (charAt == '*' || charAt == '?') {
                StringBuilder sb = new StringBuilder();
                i7 = size;
                char charAt2 = "*".charAt(0);
                if (charAt2 == '*' || charAt2 == '?') {
                    if (charAt2 == '*') {
                        sb.append(".*");
                    } else {
                        sb.append(".");
                    }
                    i8 = -1;
                } else {
                    i8 = 0;
                }
                if (i8 != -1) {
                    sb.append(Pattern.quote("*".substring(i8)));
                }
                Pattern.compile(sb.toString());
            } else {
                i7 = size;
            }
            if (((Y4.b) bVar).a(c0232b)) {
                arrayList.add(c0346a);
            } else {
                logger.log(Level.WARNING, "View aggregation " + Y4.a.a(bVar) + " is incompatible with instrument " + str + " of type " + nVar);
            }
            size = i7;
            arrayList2 = arrayList3;
            i9 = 0;
        }
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        C0346a c0346a2 = (C0346a) this.f4022a.get(nVar);
        Objects.requireNonNull(c0346a2);
        W4.b bVar2 = c0346a2.f4008b.f2803a;
        if (!((Y4.b) bVar2).a(c0232b)) {
            logger.log(Level.WARNING, "Instrument default aggregation " + Y4.a.a(bVar2) + " is incompatible with instrument " + str + " of type " + nVar);
            c0346a2 = f4020c;
        }
        c0232b.f3153g.getClass();
        return Collections.singletonList(c0346a2);
    }
}
