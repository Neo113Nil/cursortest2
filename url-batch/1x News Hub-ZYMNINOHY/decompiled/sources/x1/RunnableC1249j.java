package x1;

import B0.p;
import android.database.Cursor;
import android.util.Log;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import w0.AbstractC1234c;
import y1.C1253a;
import y1.C1254b;

/* renamed from: x1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1249j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P1.l f10747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O1.j f10748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1244e f10749d;

    public /* synthetic */ RunnableC1249j(P1.l lVar, O1.j jVar, C1244e c1244e, int i3) {
        this.f10746a = i3;
        this.f10747b = lVar;
        this.f10748c = jVar;
        this.f10749d = c1244e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c3;
        final int i3 = 3;
        final int i4 = 2;
        final int i5 = 1;
        final int i6 = 0;
        O1.j jVar = this.f10748c;
        P1.l lVar = this.f10747b;
        final C1244e c1244e = this.f10749d;
        switch (this.f10746a) {
            case 0:
                HashMap hashMap = l.f10757c;
                final C1254b c1254b = new C1254b(lVar, jVar);
                c1244e.l(c1254b, new Runnable() { // from class: x1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                C1244e c1244e2 = c1244e;
                                C1254b c1254b2 = c1254b;
                                P1.l lVar2 = c1254b2.f10829j;
                                Integer num = (Integer) lVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(lVar2.a("cancel"));
                                if (AbstractC1240a.a(c1244e2.f10727d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1244e2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap2 = c1244e2.f10729g;
                                C1248i c1248i = null;
                                if (equals) {
                                    C1248i c1248i2 = (C1248i) hashMap2.get(num);
                                    if (c1248i2 != null) {
                                        c1244e2.b(c1248i2);
                                    }
                                    c1254b2.e(null);
                                    return;
                                }
                                C1248i c1248i3 = (C1248i) hashMap2.get(num);
                                boolean z = false;
                                try {
                                    try {
                                        if (c1248i3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = c1248i3.f10745c;
                                        HashMap c4 = C1244e.c(cursor, Integer.valueOf(c1248i3.f10744b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            c4.put("cursorId", num);
                                        }
                                        c1254b2.e(c4);
                                        if (z) {
                                            return;
                                        }
                                        c1244e2.b(c1248i3);
                                        return;
                                    } catch (Exception e3) {
                                        c1244e2.i(e3, c1254b2);
                                        if (c1248i3 != null) {
                                            c1244e2.b(c1248i3);
                                        } else {
                                            c1248i = c1248i3;
                                        }
                                        if (0 != 0 || c1248i == null) {
                                            return;
                                        }
                                        c1244e2.b(c1248i);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c1248i3 != null) {
                                        c1244e2.b(c1248i3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1244e.e(c1254b);
                                return;
                            case 2:
                                c1244e.f(c1254b);
                                return;
                            case 3:
                                c1244e.d(c1254b);
                                return;
                            default:
                                C1244e c1244e3 = c1244e;
                                S0.a aVar = c1254b;
                                Object m3 = aVar.m("inTransaction");
                                Boolean bool = m3 instanceof Boolean ? (Boolean) m3 : null;
                                boolean z2 = Boolean.TRUE.equals(bool) && aVar.s() && ((Integer) aVar.m("transactionId")) == null;
                                if (z2) {
                                    int i7 = c1244e3.f10733k + 1;
                                    c1244e3.f10733k = i7;
                                    c1244e3.f10734l = Integer.valueOf(i7);
                                }
                                if (!c1244e3.g(aVar)) {
                                    if (z2) {
                                        c1244e3.f10734l = null;
                                        return;
                                    }
                                    return;
                                } else if (z2) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", c1244e3.f10734l);
                                    aVar.e(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1244e3.f10734l = null;
                                    }
                                    aVar.e(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap hashMap2 = l.f10757c;
                final C1254b c1254b2 = new C1254b(lVar, jVar);
                c1244e.l(c1254b2, new Runnable() { // from class: x1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                C1244e c1244e2 = c1244e;
                                C1254b c1254b22 = c1254b2;
                                P1.l lVar2 = c1254b22.f10829j;
                                Integer num = (Integer) lVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(lVar2.a("cancel"));
                                if (AbstractC1240a.a(c1244e2.f10727d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1244e2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1244e2.f10729g;
                                C1248i c1248i = null;
                                if (equals) {
                                    C1248i c1248i2 = (C1248i) hashMap22.get(num);
                                    if (c1248i2 != null) {
                                        c1244e2.b(c1248i2);
                                    }
                                    c1254b22.e(null);
                                    return;
                                }
                                C1248i c1248i3 = (C1248i) hashMap22.get(num);
                                boolean z = false;
                                try {
                                    try {
                                        if (c1248i3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = c1248i3.f10745c;
                                        HashMap c4 = C1244e.c(cursor, Integer.valueOf(c1248i3.f10744b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            c4.put("cursorId", num);
                                        }
                                        c1254b22.e(c4);
                                        if (z) {
                                            return;
                                        }
                                        c1244e2.b(c1248i3);
                                        return;
                                    } catch (Exception e3) {
                                        c1244e2.i(e3, c1254b22);
                                        if (c1248i3 != null) {
                                            c1244e2.b(c1248i3);
                                        } else {
                                            c1248i = c1248i3;
                                        }
                                        if (0 != 0 || c1248i == null) {
                                            return;
                                        }
                                        c1244e2.b(c1248i);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c1248i3 != null) {
                                        c1244e2.b(c1248i3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1244e.e(c1254b2);
                                return;
                            case 2:
                                c1244e.f(c1254b2);
                                return;
                            case 3:
                                c1244e.d(c1254b2);
                                return;
                            default:
                                C1244e c1244e3 = c1244e;
                                S0.a aVar = c1254b2;
                                Object m3 = aVar.m("inTransaction");
                                Boolean bool = m3 instanceof Boolean ? (Boolean) m3 : null;
                                boolean z2 = Boolean.TRUE.equals(bool) && aVar.s() && ((Integer) aVar.m("transactionId")) == null;
                                if (z2) {
                                    int i7 = c1244e3.f10733k + 1;
                                    c1244e3.f10733k = i7;
                                    c1244e3.f10734l = Integer.valueOf(i7);
                                }
                                if (!c1244e3.g(aVar)) {
                                    if (z2) {
                                        c1244e3.f10734l = null;
                                        return;
                                    }
                                    return;
                                } else if (z2) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", c1244e3.f10734l);
                                    aVar.e(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1244e3.f10734l = null;
                                    }
                                    aVar.e(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap hashMap3 = l.f10757c;
                final C1254b c1254b3 = new C1254b(lVar, jVar);
                c1244e.l(c1254b3, new Runnable() { // from class: x1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                C1244e c1244e2 = c1244e;
                                C1254b c1254b22 = c1254b3;
                                P1.l lVar2 = c1254b22.f10829j;
                                Integer num = (Integer) lVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(lVar2.a("cancel"));
                                if (AbstractC1240a.a(c1244e2.f10727d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1244e2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1244e2.f10729g;
                                C1248i c1248i = null;
                                if (equals) {
                                    C1248i c1248i2 = (C1248i) hashMap22.get(num);
                                    if (c1248i2 != null) {
                                        c1244e2.b(c1248i2);
                                    }
                                    c1254b22.e(null);
                                    return;
                                }
                                C1248i c1248i3 = (C1248i) hashMap22.get(num);
                                boolean z = false;
                                try {
                                    try {
                                        if (c1248i3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = c1248i3.f10745c;
                                        HashMap c4 = C1244e.c(cursor, Integer.valueOf(c1248i3.f10744b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            c4.put("cursorId", num);
                                        }
                                        c1254b22.e(c4);
                                        if (z) {
                                            return;
                                        }
                                        c1244e2.b(c1248i3);
                                        return;
                                    } catch (Exception e3) {
                                        c1244e2.i(e3, c1254b22);
                                        if (c1248i3 != null) {
                                            c1244e2.b(c1248i3);
                                        } else {
                                            c1248i = c1248i3;
                                        }
                                        if (0 != 0 || c1248i == null) {
                                            return;
                                        }
                                        c1244e2.b(c1248i);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c1248i3 != null) {
                                        c1244e2.b(c1248i3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1244e.e(c1254b3);
                                return;
                            case 2:
                                c1244e.f(c1254b3);
                                return;
                            case 3:
                                c1244e.d(c1254b3);
                                return;
                            default:
                                C1244e c1244e3 = c1244e;
                                S0.a aVar = c1254b3;
                                Object m3 = aVar.m("inTransaction");
                                Boolean bool = m3 instanceof Boolean ? (Boolean) m3 : null;
                                boolean z2 = Boolean.TRUE.equals(bool) && aVar.s() && ((Integer) aVar.m("transactionId")) == null;
                                if (z2) {
                                    int i7 = c1244e3.f10733k + 1;
                                    c1244e3.f10733k = i7;
                                    c1244e3.f10734l = Integer.valueOf(i7);
                                }
                                if (!c1244e3.g(aVar)) {
                                    if (z2) {
                                        c1244e3.f10734l = null;
                                        return;
                                    }
                                    return;
                                } else if (z2) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c1244e3.f10734l);
                                    aVar.e(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1244e3.f10734l = null;
                                    }
                                    aVar.e(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap hashMap4 = l.f10757c;
                try {
                    c1244e.f10731i.setLocale(Locale.forLanguageTag((String) lVar.a(CommonUrlParts.LOCALE)));
                    jVar.success(null);
                    break;
                } catch (Exception e3) {
                    jVar.b("sqlite_error", "Error calling setLocale: " + e3.getMessage(), null);
                    return;
                }
            case 4:
                HashMap hashMap5 = l.f10757c;
                final C1254b c1254b4 = new C1254b(lVar, jVar);
                final int i7 = 4;
                c1244e.l(c1254b4, new Runnable() { // from class: x1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                C1244e c1244e2 = c1244e;
                                C1254b c1254b22 = c1254b4;
                                P1.l lVar2 = c1254b22.f10829j;
                                Integer num = (Integer) lVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(lVar2.a("cancel"));
                                if (AbstractC1240a.a(c1244e2.f10727d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1244e2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1244e2.f10729g;
                                C1248i c1248i = null;
                                if (equals) {
                                    C1248i c1248i2 = (C1248i) hashMap22.get(num);
                                    if (c1248i2 != null) {
                                        c1244e2.b(c1248i2);
                                    }
                                    c1254b22.e(null);
                                    return;
                                }
                                C1248i c1248i3 = (C1248i) hashMap22.get(num);
                                boolean z = false;
                                try {
                                    try {
                                        if (c1248i3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = c1248i3.f10745c;
                                        HashMap c4 = C1244e.c(cursor, Integer.valueOf(c1248i3.f10744b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            c4.put("cursorId", num);
                                        }
                                        c1254b22.e(c4);
                                        if (z) {
                                            return;
                                        }
                                        c1244e2.b(c1248i3);
                                        return;
                                    } catch (Exception e32) {
                                        c1244e2.i(e32, c1254b22);
                                        if (c1248i3 != null) {
                                            c1244e2.b(c1248i3);
                                        } else {
                                            c1248i = c1248i3;
                                        }
                                        if (0 != 0 || c1248i == null) {
                                            return;
                                        }
                                        c1244e2.b(c1248i);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c1248i3 != null) {
                                        c1244e2.b(c1248i3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1244e.e(c1254b4);
                                return;
                            case 2:
                                c1244e.f(c1254b4);
                                return;
                            case 3:
                                c1244e.d(c1254b4);
                                return;
                            default:
                                C1244e c1244e3 = c1244e;
                                S0.a aVar = c1254b4;
                                Object m3 = aVar.m("inTransaction");
                                Boolean bool = m3 instanceof Boolean ? (Boolean) m3 : null;
                                boolean z2 = Boolean.TRUE.equals(bool) && aVar.s() && ((Integer) aVar.m("transactionId")) == null;
                                if (z2) {
                                    int i72 = c1244e3.f10733k + 1;
                                    c1244e3.f10733k = i72;
                                    c1244e3.f10734l = Integer.valueOf(i72);
                                }
                                if (!c1244e3.g(aVar)) {
                                    if (z2) {
                                        c1244e3.f10734l = null;
                                        return;
                                    }
                                    return;
                                } else if (z2) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c1244e3.f10734l);
                                    aVar.e(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1244e3.f10734l = null;
                                    }
                                    aVar.e(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 5:
                HashMap hashMap6 = l.f10757c;
                final C1254b c1254b5 = new C1254b(lVar, jVar);
                c1244e.l(c1254b5, new Runnable() { // from class: x1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                C1244e c1244e2 = c1244e;
                                C1254b c1254b22 = c1254b5;
                                P1.l lVar2 = c1254b22.f10829j;
                                Integer num = (Integer) lVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(lVar2.a("cancel"));
                                if (AbstractC1240a.a(c1244e2.f10727d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1244e2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1244e2.f10729g;
                                C1248i c1248i = null;
                                if (equals) {
                                    C1248i c1248i2 = (C1248i) hashMap22.get(num);
                                    if (c1248i2 != null) {
                                        c1244e2.b(c1248i2);
                                    }
                                    c1254b22.e(null);
                                    return;
                                }
                                C1248i c1248i3 = (C1248i) hashMap22.get(num);
                                boolean z = false;
                                try {
                                    try {
                                        if (c1248i3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = c1248i3.f10745c;
                                        HashMap c4 = C1244e.c(cursor, Integer.valueOf(c1248i3.f10744b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z = true;
                                        }
                                        if (z) {
                                            c4.put("cursorId", num);
                                        }
                                        c1254b22.e(c4);
                                        if (z) {
                                            return;
                                        }
                                        c1244e2.b(c1248i3);
                                        return;
                                    } catch (Exception e32) {
                                        c1244e2.i(e32, c1254b22);
                                        if (c1248i3 != null) {
                                            c1244e2.b(c1248i3);
                                        } else {
                                            c1248i = c1248i3;
                                        }
                                        if (0 != 0 || c1248i == null) {
                                            return;
                                        }
                                        c1244e2.b(c1248i);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && c1248i3 != null) {
                                        c1244e2.b(c1248i3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1244e.e(c1254b5);
                                return;
                            case 2:
                                c1244e.f(c1254b5);
                                return;
                            case 3:
                                c1244e.d(c1254b5);
                                return;
                            default:
                                C1244e c1244e3 = c1244e;
                                S0.a aVar = c1254b5;
                                Object m3 = aVar.m("inTransaction");
                                Boolean bool = m3 instanceof Boolean ? (Boolean) m3 : null;
                                boolean z2 = Boolean.TRUE.equals(bool) && aVar.s() && ((Integer) aVar.m("transactionId")) == null;
                                if (z2) {
                                    int i72 = c1244e3.f10733k + 1;
                                    c1244e3.f10733k = i72;
                                    c1244e3.f10734l = Integer.valueOf(i72);
                                }
                                if (!c1244e3.g(aVar)) {
                                    if (z2) {
                                        c1244e3.f10734l = null;
                                        return;
                                    }
                                    return;
                                } else if (z2) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c1244e3.f10734l);
                                    aVar.e(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1244e3.f10734l = null;
                                    }
                                    aVar.e(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap hashMap7 = l.f10757c;
                Boolean bool = Boolean.TRUE;
                boolean equals = bool.equals(lVar.a("noResult"));
                boolean equals2 = bool.equals(lVar.a("continueOnError"));
                List list = (List) lVar.a("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C1253a c1253a = new C1253a((Map) it.next(), equals);
                    String o = c1253a.o();
                    o.getClass();
                    p pVar = c1253a.f10826j;
                    switch (o.hashCode()) {
                        case -1319569547:
                            if (o.equals("execute")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1183792455:
                            if (o.equals("insert")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -838846263:
                            if (o.equals("update")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 107944136:
                            if (o.equals("query")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            if (!c1244e.g(c1253a)) {
                                if (!equals2) {
                                    jVar.b((String) pVar.f163b, (String) pVar.f164c, (HashMap) pVar.f165d);
                                    break;
                                } else {
                                    c1253a.Q(arrayList);
                                    break;
                                }
                            } else {
                                c1253a.e(null);
                                c1253a.R(arrayList);
                                break;
                            }
                        case 1:
                            if (!c1244e.d(c1253a)) {
                                if (!equals2) {
                                    jVar.b((String) pVar.f163b, (String) pVar.f164c, (HashMap) pVar.f165d);
                                    break;
                                } else {
                                    c1253a.Q(arrayList);
                                    break;
                                }
                            } else {
                                c1253a.R(arrayList);
                                break;
                            }
                        case 2:
                            if (!c1244e.f(c1253a)) {
                                if (!equals2) {
                                    jVar.b((String) pVar.f163b, (String) pVar.f164c, (HashMap) pVar.f165d);
                                    break;
                                } else {
                                    c1253a.Q(arrayList);
                                    break;
                                }
                            } else {
                                c1253a.R(arrayList);
                                break;
                            }
                        case 3:
                            if (!c1244e.e(c1253a)) {
                                if (!equals2) {
                                    jVar.b((String) pVar.f163b, (String) pVar.f164c, (HashMap) pVar.f165d);
                                    break;
                                } else {
                                    c1253a.Q(arrayList);
                                    break;
                                }
                            } else {
                                c1253a.R(arrayList);
                                break;
                            }
                        default:
                            jVar.b("bad_param", AbstractC1234c.a("Batch method '", o, "' not supported"), null);
                            break;
                    }
                }
                if (!equals) {
                    jVar.success(arrayList);
                    break;
                } else {
                    jVar.success(null);
                    break;
                }
        }
    }

    public /* synthetic */ RunnableC1249j(P1.l lVar, C1244e c1244e, O1.j jVar) {
        this.f10746a = 3;
        this.f10747b = lVar;
        this.f10749d = c1244e;
        this.f10748c = jVar;
    }

    public /* synthetic */ RunnableC1249j(C1244e c1244e, P1.l lVar, O1.j jVar) {
        this.f10746a = 6;
        this.f10749d = c1244e;
        this.f10747b = lVar;
        this.f10748c = jVar;
    }
}
