package B;

import a.AbstractC0016a;
import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.a f59c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M.j f60d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f61e;

    public /* synthetic */ p(A.a aVar, g gVar, M.j jVar) {
        this.f58b = 3;
        this.f59c = aVar;
        this.f61e = gVar;
        this.f60d = jVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c2;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        final int i5 = 0;
        M.j jVar = this.f60d;
        A.a aVar = this.f59c;
        final g gVar = this.f61e;
        switch (this.f58b) {
            case 0:
                HashMap hashMap = t.f77d;
                final C.b bVar = new C.b(aVar, jVar);
                gVar.l(bVar, new Runnable() { // from class: B.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                g gVar2 = gVar;
                                C.b bVar2 = bVar;
                                A.a aVar2 = bVar2.f95h;
                                Integer num = (Integer) aVar2.m("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(aVar2.m("cancel"));
                                if (a.b(gVar2.f22d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(gVar2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap2 = gVar2.f25g;
                                o oVar = null;
                                if (equals) {
                                    o oVar2 = (o) hashMap2.get(num);
                                    if (oVar2 != null) {
                                        gVar2.b(oVar2);
                                    }
                                    bVar2.c(null);
                                    return;
                                }
                                o oVar3 = (o) hashMap2.get(num);
                                boolean z = false;
                                try {
                                    try {
                                        if (oVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = oVar3.f57c;
                                        HashMap c3 = g.c(cursor, Integer.valueOf(oVar3.f56b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            c3.put("cursorId", num);
                                        }
                                        bVar2.c(c3);
                                        if (z) {
                                            return;
                                        }
                                        gVar2.b(oVar3);
                                        return;
                                    } catch (Exception e2) {
                                        gVar2.i(e2, bVar2);
                                        if (oVar3 != null) {
                                            gVar2.b(oVar3);
                                        } else {
                                            oVar = oVar3;
                                        }
                                        if (0 != 0 || oVar == null) {
                                            return;
                                        }
                                        gVar2.b(oVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && oVar3 != null) {
                                        gVar2.b(oVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                gVar.e(bVar);
                                return;
                            case 2:
                                gVar.f(bVar);
                                return;
                            case 3:
                                gVar.d(bVar);
                                return;
                            default:
                                g gVar3 = gVar;
                                AbstractC0016a abstractC0016a = bVar;
                                Object m2 = abstractC0016a.m("inTransaction");
                                Boolean bool = m2 instanceof Boolean ? (Boolean) m2 : null;
                                boolean z2 = Boolean.TRUE.equals(bool) && abstractC0016a.s() && ((Integer) abstractC0016a.m("transactionId")) == null;
                                if (z2) {
                                    int i6 = gVar3.f29k + 1;
                                    gVar3.f29k = i6;
                                    gVar3.f30l = Integer.valueOf(i6);
                                }
                                if (!gVar3.g(abstractC0016a)) {
                                    if (z2) {
                                        gVar3.f30l = null;
                                        return;
                                    }
                                    return;
                                } else if (z2) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", gVar3.f30l);
                                    abstractC0016a.c(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        gVar3.f30l = null;
                                    }
                                    abstractC0016a.c(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap hashMap2 = t.f77d;
                final C.b bVar2 = new C.b(aVar, jVar);
                gVar.l(bVar2, new Runnable() { // from class: B.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                g gVar2 = gVar;
                                C.b bVar22 = bVar2;
                                A.a aVar2 = bVar22.f95h;
                                Integer num = (Integer) aVar2.m("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(aVar2.m("cancel"));
                                if (a.b(gVar2.f22d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(gVar2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = gVar2.f25g;
                                o oVar = null;
                                if (equals) {
                                    o oVar2 = (o) hashMap22.get(num);
                                    if (oVar2 != null) {
                                        gVar2.b(oVar2);
                                    }
                                    bVar22.c(null);
                                    return;
                                }
                                o oVar3 = (o) hashMap22.get(num);
                                boolean z = false;
                                try {
                                    try {
                                        if (oVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = oVar3.f57c;
                                        HashMap c3 = g.c(cursor, Integer.valueOf(oVar3.f56b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            c3.put("cursorId", num);
                                        }
                                        bVar22.c(c3);
                                        if (z) {
                                            return;
                                        }
                                        gVar2.b(oVar3);
                                        return;
                                    } catch (Exception e2) {
                                        gVar2.i(e2, bVar22);
                                        if (oVar3 != null) {
                                            gVar2.b(oVar3);
                                        } else {
                                            oVar = oVar3;
                                        }
                                        if (0 != 0 || oVar == null) {
                                            return;
                                        }
                                        gVar2.b(oVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && oVar3 != null) {
                                        gVar2.b(oVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                gVar.e(bVar2);
                                return;
                            case 2:
                                gVar.f(bVar2);
                                return;
                            case 3:
                                gVar.d(bVar2);
                                return;
                            default:
                                g gVar3 = gVar;
                                AbstractC0016a abstractC0016a = bVar2;
                                Object m2 = abstractC0016a.m("inTransaction");
                                Boolean bool = m2 instanceof Boolean ? (Boolean) m2 : null;
                                boolean z2 = Boolean.TRUE.equals(bool) && abstractC0016a.s() && ((Integer) abstractC0016a.m("transactionId")) == null;
                                if (z2) {
                                    int i6 = gVar3.f29k + 1;
                                    gVar3.f29k = i6;
                                    gVar3.f30l = Integer.valueOf(i6);
                                }
                                if (!gVar3.g(abstractC0016a)) {
                                    if (z2) {
                                        gVar3.f30l = null;
                                        return;
                                    }
                                    return;
                                } else if (z2) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", gVar3.f30l);
                                    abstractC0016a.c(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        gVar3.f30l = null;
                                    }
                                    abstractC0016a.c(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap hashMap3 = t.f77d;
                final C.b bVar3 = new C.b(aVar, jVar);
                gVar.l(bVar3, new Runnable() { // from class: B.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                g gVar2 = gVar;
                                C.b bVar22 = bVar3;
                                A.a aVar2 = bVar22.f95h;
                                Integer num = (Integer) aVar2.m("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(aVar2.m("cancel"));
                                if (a.b(gVar2.f22d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(gVar2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = gVar2.f25g;
                                o oVar = null;
                                if (equals) {
                                    o oVar2 = (o) hashMap22.get(num);
                                    if (oVar2 != null) {
                                        gVar2.b(oVar2);
                                    }
                                    bVar22.c(null);
                                    return;
                                }
                                o oVar3 = (o) hashMap22.get(num);
                                boolean z = false;
                                try {
                                    try {
                                        if (oVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = oVar3.f57c;
                                        HashMap c3 = g.c(cursor, Integer.valueOf(oVar3.f56b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            c3.put("cursorId", num);
                                        }
                                        bVar22.c(c3);
                                        if (z) {
                                            return;
                                        }
                                        gVar2.b(oVar3);
                                        return;
                                    } catch (Exception e2) {
                                        gVar2.i(e2, bVar22);
                                        if (oVar3 != null) {
                                            gVar2.b(oVar3);
                                        } else {
                                            oVar = oVar3;
                                        }
                                        if (0 != 0 || oVar == null) {
                                            return;
                                        }
                                        gVar2.b(oVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && oVar3 != null) {
                                        gVar2.b(oVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                gVar.e(bVar3);
                                return;
                            case 2:
                                gVar.f(bVar3);
                                return;
                            case 3:
                                gVar.d(bVar3);
                                return;
                            default:
                                g gVar3 = gVar;
                                AbstractC0016a abstractC0016a = bVar3;
                                Object m2 = abstractC0016a.m("inTransaction");
                                Boolean bool = m2 instanceof Boolean ? (Boolean) m2 : null;
                                boolean z2 = Boolean.TRUE.equals(bool) && abstractC0016a.s() && ((Integer) abstractC0016a.m("transactionId")) == null;
                                if (z2) {
                                    int i6 = gVar3.f29k + 1;
                                    gVar3.f29k = i6;
                                    gVar3.f30l = Integer.valueOf(i6);
                                }
                                if (!gVar3.g(abstractC0016a)) {
                                    if (z2) {
                                        gVar3.f30l = null;
                                        return;
                                    }
                                    return;
                                } else if (z2) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", gVar3.f30l);
                                    abstractC0016a.c(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        gVar3.f30l = null;
                                    }
                                    abstractC0016a.c(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap hashMap4 = t.f77d;
                try {
                    gVar.f27i.setLocale(Locale.forLanguageTag((String) aVar.m("locale")));
                    jVar.c(null);
                    break;
                } catch (Exception e2) {
                    jVar.a("sqlite_error", "Error calling setLocale: " + e2.getMessage(), null);
                    return;
                }
            case 4:
                HashMap hashMap5 = t.f77d;
                final C.b bVar4 = new C.b(aVar, jVar);
                final int i6 = 4;
                gVar.l(bVar4, new Runnable() { // from class: B.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                g gVar2 = gVar;
                                C.b bVar22 = bVar4;
                                A.a aVar2 = bVar22.f95h;
                                Integer num = (Integer) aVar2.m("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(aVar2.m("cancel"));
                                if (a.b(gVar2.f22d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(gVar2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = gVar2.f25g;
                                o oVar = null;
                                if (equals) {
                                    o oVar2 = (o) hashMap22.get(num);
                                    if (oVar2 != null) {
                                        gVar2.b(oVar2);
                                    }
                                    bVar22.c(null);
                                    return;
                                }
                                o oVar3 = (o) hashMap22.get(num);
                                boolean z = false;
                                try {
                                    try {
                                        if (oVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = oVar3.f57c;
                                        HashMap c3 = g.c(cursor, Integer.valueOf(oVar3.f56b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            c3.put("cursorId", num);
                                        }
                                        bVar22.c(c3);
                                        if (z) {
                                            return;
                                        }
                                        gVar2.b(oVar3);
                                        return;
                                    } catch (Exception e22) {
                                        gVar2.i(e22, bVar22);
                                        if (oVar3 != null) {
                                            gVar2.b(oVar3);
                                        } else {
                                            oVar = oVar3;
                                        }
                                        if (0 != 0 || oVar == null) {
                                            return;
                                        }
                                        gVar2.b(oVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && oVar3 != null) {
                                        gVar2.b(oVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                gVar.e(bVar4);
                                return;
                            case 2:
                                gVar.f(bVar4);
                                return;
                            case 3:
                                gVar.d(bVar4);
                                return;
                            default:
                                g gVar3 = gVar;
                                AbstractC0016a abstractC0016a = bVar4;
                                Object m2 = abstractC0016a.m("inTransaction");
                                Boolean bool = m2 instanceof Boolean ? (Boolean) m2 : null;
                                boolean z2 = Boolean.TRUE.equals(bool) && abstractC0016a.s() && ((Integer) abstractC0016a.m("transactionId")) == null;
                                if (z2) {
                                    int i62 = gVar3.f29k + 1;
                                    gVar3.f29k = i62;
                                    gVar3.f30l = Integer.valueOf(i62);
                                }
                                if (!gVar3.g(abstractC0016a)) {
                                    if (z2) {
                                        gVar3.f30l = null;
                                        return;
                                    }
                                    return;
                                } else if (z2) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", gVar3.f30l);
                                    abstractC0016a.c(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        gVar3.f30l = null;
                                    }
                                    abstractC0016a.c(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 5:
                HashMap hashMap6 = t.f77d;
                final C.b bVar5 = new C.b(aVar, jVar);
                gVar.l(bVar5, new Runnable() { // from class: B.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                g gVar2 = gVar;
                                C.b bVar22 = bVar5;
                                A.a aVar2 = bVar22.f95h;
                                Integer num = (Integer) aVar2.m("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(aVar2.m("cancel"));
                                if (a.b(gVar2.f22d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(gVar2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = gVar2.f25g;
                                o oVar = null;
                                if (equals) {
                                    o oVar2 = (o) hashMap22.get(num);
                                    if (oVar2 != null) {
                                        gVar2.b(oVar2);
                                    }
                                    bVar22.c(null);
                                    return;
                                }
                                o oVar3 = (o) hashMap22.get(num);
                                boolean z = false;
                                try {
                                    try {
                                        if (oVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = oVar3.f57c;
                                        HashMap c3 = g.c(cursor, Integer.valueOf(oVar3.f56b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            c3.put("cursorId", num);
                                        }
                                        bVar22.c(c3);
                                        if (z) {
                                            return;
                                        }
                                        gVar2.b(oVar3);
                                        return;
                                    } catch (Exception e22) {
                                        gVar2.i(e22, bVar22);
                                        if (oVar3 != null) {
                                            gVar2.b(oVar3);
                                        } else {
                                            oVar = oVar3;
                                        }
                                        if (0 != 0 || oVar == null) {
                                            return;
                                        }
                                        gVar2.b(oVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && oVar3 != null) {
                                        gVar2.b(oVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                gVar.e(bVar5);
                                return;
                            case 2:
                                gVar.f(bVar5);
                                return;
                            case 3:
                                gVar.d(bVar5);
                                return;
                            default:
                                g gVar3 = gVar;
                                AbstractC0016a abstractC0016a = bVar5;
                                Object m2 = abstractC0016a.m("inTransaction");
                                Boolean bool = m2 instanceof Boolean ? (Boolean) m2 : null;
                                boolean z2 = Boolean.TRUE.equals(bool) && abstractC0016a.s() && ((Integer) abstractC0016a.m("transactionId")) == null;
                                if (z2) {
                                    int i62 = gVar3.f29k + 1;
                                    gVar3.f29k = i62;
                                    gVar3.f30l = Integer.valueOf(i62);
                                }
                                if (!gVar3.g(abstractC0016a)) {
                                    if (z2) {
                                        gVar3.f30l = null;
                                        return;
                                    }
                                    return;
                                } else if (z2) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", gVar3.f30l);
                                    abstractC0016a.c(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        gVar3.f30l = null;
                                    }
                                    abstractC0016a.c(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap hashMap7 = t.f77d;
                Boolean bool = Boolean.TRUE;
                boolean equals = bool.equals(aVar.m("noResult"));
                boolean equals2 = bool.equals(aVar.m("continueOnError"));
                List list = (List) aVar.m("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C.a aVar2 = new C.a((Map) it.next(), equals);
                    String o2 = aVar2.o();
                    o2.getClass();
                    A.e eVar = aVar2.f92h;
                    switch (o2.hashCode()) {
                        case -1319569547:
                            if (o2.equals("execute")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1183792455:
                            if (o2.equals("insert")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -838846263:
                            if (o2.equals("update")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 107944136:
                            if (o2.equals("query")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            if (!gVar.g(aVar2)) {
                                if (!equals2) {
                                    jVar.a((String) eVar.f8c, (String) eVar.f9d, (HashMap) eVar.f10e);
                                    break;
                                } else {
                                    aVar2.I(arrayList);
                                    break;
                                }
                            } else {
                                aVar2.c(null);
                                aVar2.J(arrayList);
                                break;
                            }
                        case 1:
                            if (!gVar.d(aVar2)) {
                                if (!equals2) {
                                    jVar.a((String) eVar.f8c, (String) eVar.f9d, (HashMap) eVar.f10e);
                                    break;
                                } else {
                                    aVar2.I(arrayList);
                                    break;
                                }
                            } else {
                                aVar2.J(arrayList);
                                break;
                            }
                        case 2:
                            if (!gVar.f(aVar2)) {
                                if (!equals2) {
                                    jVar.a((String) eVar.f8c, (String) eVar.f9d, (HashMap) eVar.f10e);
                                    break;
                                } else {
                                    aVar2.I(arrayList);
                                    break;
                                }
                            } else {
                                aVar2.J(arrayList);
                                break;
                            }
                        case 3:
                            if (!gVar.e(aVar2)) {
                                if (!equals2) {
                                    jVar.a((String) eVar.f8c, (String) eVar.f9d, (HashMap) eVar.f10e);
                                    break;
                                } else {
                                    aVar2.I(arrayList);
                                    break;
                                }
                            } else {
                                aVar2.J(arrayList);
                                break;
                            }
                        default:
                            jVar.a("bad_param", "Batch method '" + o2 + "' not supported", null);
                            break;
                    }
                }
                if (!equals) {
                    jVar.c(arrayList);
                    break;
                } else {
                    jVar.c(null);
                    break;
                }
        }
    }

    public /* synthetic */ p(A.a aVar, M.j jVar, g gVar, int i2) {
        this.f58b = i2;
        this.f59c = aVar;
        this.f60d = jVar;
        this.f61e = gVar;
    }

    public /* synthetic */ p(g gVar, A.a aVar, M.j jVar) {
        this.f58b = 6;
        this.f61e = gVar;
        this.f59c = aVar;
        this.f60d = jVar;
    }
}
