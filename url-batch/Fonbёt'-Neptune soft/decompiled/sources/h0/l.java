package h0;

import I.C0079n;
import P.O;
import a.AbstractC0132a;
import android.database.Cursor;
import android.util.Log;
import i0.C0222a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O f2325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0.i f2326g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0197e f2327h;

    public /* synthetic */ l(O o2, C0197e c0197e, v0.i iVar) {
        this.f2324e = 3;
        this.f2325f = o2;
        this.f2327h = c0197e;
        this.f2326g = iVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c2;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        final int i5 = 0;
        O o2 = this.f2325f;
        v0.i iVar = this.f2326g;
        final C0197e c0197e = this.f2327h;
        switch (this.f2324e) {
            case 0:
                HashMap hashMap = p.f2345g;
                final i0.b bVar = new i0.b(o2, iVar);
                c0197e.l(bVar, new Runnable() { // from class: h0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                C0197e c0197e2 = c0197e;
                                i0.b bVar2 = bVar;
                                O o3 = bVar2.f2491k;
                                Integer num = (Integer) o3.i("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(o3.i("cancel"));
                                if (AbstractC0193a.b(c0197e2.f2293d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0197e2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap2 = c0197e2.f2296g;
                                k kVar = null;
                                if (equals) {
                                    k kVar2 = (k) hashMap2.get(num);
                                    if (kVar2 != null) {
                                        c0197e2.b(kVar2);
                                    }
                                    bVar2.l(null);
                                    return;
                                }
                                k kVar3 = (k) hashMap2.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (kVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = kVar3.f2323c;
                                        HashMap c3 = C0197e.c(cursor, Integer.valueOf(kVar3.f2322b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c3.put("cursorId", num);
                                        }
                                        bVar2.l(c3);
                                        if (z2) {
                                            return;
                                        }
                                        c0197e2.b(kVar3);
                                        return;
                                    } catch (Exception e2) {
                                        c0197e2.i(e2, bVar2);
                                        if (kVar3 != null) {
                                            c0197e2.b(kVar3);
                                        } else {
                                            kVar = kVar3;
                                        }
                                        if (0 != 0 || kVar == null) {
                                            return;
                                        }
                                        c0197e2.b(kVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && kVar3 != null) {
                                        c0197e2.b(kVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c0197e.e(bVar);
                                return;
                            case 2:
                                c0197e.f(bVar);
                                return;
                            case 3:
                                c0197e.d(bVar);
                                return;
                            default:
                                C0197e c0197e3 = c0197e;
                                AbstractC0132a abstractC0132a = bVar;
                                Object s2 = abstractC0132a.s("inTransaction");
                                Boolean bool = s2 instanceof Boolean ? (Boolean) s2 : null;
                                boolean z3 = Boolean.TRUE.equals(bool) && abstractC0132a.w() && ((Integer) abstractC0132a.s("transactionId")) == null;
                                if (z3) {
                                    int i6 = c0197e3.f2300k + 1;
                                    c0197e3.f2300k = i6;
                                    c0197e3.f2301l = Integer.valueOf(i6);
                                }
                                if (!c0197e3.g(abstractC0132a)) {
                                    if (z3) {
                                        c0197e3.f2301l = null;
                                        return;
                                    }
                                    return;
                                } else if (z3) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", c0197e3.f2301l);
                                    abstractC0132a.l(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c0197e3.f2301l = null;
                                    }
                                    abstractC0132a.l(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap hashMap2 = p.f2345g;
                final i0.b bVar2 = new i0.b(o2, iVar);
                c0197e.l(bVar2, new Runnable() { // from class: h0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                C0197e c0197e2 = c0197e;
                                i0.b bVar22 = bVar2;
                                O o3 = bVar22.f2491k;
                                Integer num = (Integer) o3.i("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(o3.i("cancel"));
                                if (AbstractC0193a.b(c0197e2.f2293d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0197e2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c0197e2.f2296g;
                                k kVar = null;
                                if (equals) {
                                    k kVar2 = (k) hashMap22.get(num);
                                    if (kVar2 != null) {
                                        c0197e2.b(kVar2);
                                    }
                                    bVar22.l(null);
                                    return;
                                }
                                k kVar3 = (k) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (kVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = kVar3.f2323c;
                                        HashMap c3 = C0197e.c(cursor, Integer.valueOf(kVar3.f2322b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c3.put("cursorId", num);
                                        }
                                        bVar22.l(c3);
                                        if (z2) {
                                            return;
                                        }
                                        c0197e2.b(kVar3);
                                        return;
                                    } catch (Exception e2) {
                                        c0197e2.i(e2, bVar22);
                                        if (kVar3 != null) {
                                            c0197e2.b(kVar3);
                                        } else {
                                            kVar = kVar3;
                                        }
                                        if (0 != 0 || kVar == null) {
                                            return;
                                        }
                                        c0197e2.b(kVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && kVar3 != null) {
                                        c0197e2.b(kVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c0197e.e(bVar2);
                                return;
                            case 2:
                                c0197e.f(bVar2);
                                return;
                            case 3:
                                c0197e.d(bVar2);
                                return;
                            default:
                                C0197e c0197e3 = c0197e;
                                AbstractC0132a abstractC0132a = bVar2;
                                Object s2 = abstractC0132a.s("inTransaction");
                                Boolean bool = s2 instanceof Boolean ? (Boolean) s2 : null;
                                boolean z3 = Boolean.TRUE.equals(bool) && abstractC0132a.w() && ((Integer) abstractC0132a.s("transactionId")) == null;
                                if (z3) {
                                    int i6 = c0197e3.f2300k + 1;
                                    c0197e3.f2300k = i6;
                                    c0197e3.f2301l = Integer.valueOf(i6);
                                }
                                if (!c0197e3.g(abstractC0132a)) {
                                    if (z3) {
                                        c0197e3.f2301l = null;
                                        return;
                                    }
                                    return;
                                } else if (z3) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", c0197e3.f2301l);
                                    abstractC0132a.l(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c0197e3.f2301l = null;
                                    }
                                    abstractC0132a.l(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap hashMap3 = p.f2345g;
                final i0.b bVar3 = new i0.b(o2, iVar);
                c0197e.l(bVar3, new Runnable() { // from class: h0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                C0197e c0197e2 = c0197e;
                                i0.b bVar22 = bVar3;
                                O o3 = bVar22.f2491k;
                                Integer num = (Integer) o3.i("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(o3.i("cancel"));
                                if (AbstractC0193a.b(c0197e2.f2293d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0197e2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c0197e2.f2296g;
                                k kVar = null;
                                if (equals) {
                                    k kVar2 = (k) hashMap22.get(num);
                                    if (kVar2 != null) {
                                        c0197e2.b(kVar2);
                                    }
                                    bVar22.l(null);
                                    return;
                                }
                                k kVar3 = (k) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (kVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = kVar3.f2323c;
                                        HashMap c3 = C0197e.c(cursor, Integer.valueOf(kVar3.f2322b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c3.put("cursorId", num);
                                        }
                                        bVar22.l(c3);
                                        if (z2) {
                                            return;
                                        }
                                        c0197e2.b(kVar3);
                                        return;
                                    } catch (Exception e2) {
                                        c0197e2.i(e2, bVar22);
                                        if (kVar3 != null) {
                                            c0197e2.b(kVar3);
                                        } else {
                                            kVar = kVar3;
                                        }
                                        if (0 != 0 || kVar == null) {
                                            return;
                                        }
                                        c0197e2.b(kVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && kVar3 != null) {
                                        c0197e2.b(kVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c0197e.e(bVar3);
                                return;
                            case 2:
                                c0197e.f(bVar3);
                                return;
                            case 3:
                                c0197e.d(bVar3);
                                return;
                            default:
                                C0197e c0197e3 = c0197e;
                                AbstractC0132a abstractC0132a = bVar3;
                                Object s2 = abstractC0132a.s("inTransaction");
                                Boolean bool = s2 instanceof Boolean ? (Boolean) s2 : null;
                                boolean z3 = Boolean.TRUE.equals(bool) && abstractC0132a.w() && ((Integer) abstractC0132a.s("transactionId")) == null;
                                if (z3) {
                                    int i6 = c0197e3.f2300k + 1;
                                    c0197e3.f2300k = i6;
                                    c0197e3.f2301l = Integer.valueOf(i6);
                                }
                                if (!c0197e3.g(abstractC0132a)) {
                                    if (z3) {
                                        c0197e3.f2301l = null;
                                        return;
                                    }
                                    return;
                                } else if (z3) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c0197e3.f2301l);
                                    abstractC0132a.l(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c0197e3.f2301l = null;
                                    }
                                    abstractC0132a.l(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap hashMap4 = p.f2345g;
                try {
                    c0197e.f2298i.setLocale(Locale.forLanguageTag((String) o2.i("locale")));
                    iVar.c(null);
                    break;
                } catch (Exception e2) {
                    iVar.a("sqlite_error", "Error calling setLocale: " + e2.getMessage(), null);
                    return;
                }
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                HashMap hashMap5 = p.f2345g;
                final i0.b bVar4 = new i0.b(o2, iVar);
                final int i6 = 4;
                c0197e.l(bVar4, new Runnable() { // from class: h0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                C0197e c0197e2 = c0197e;
                                i0.b bVar22 = bVar4;
                                O o3 = bVar22.f2491k;
                                Integer num = (Integer) o3.i("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(o3.i("cancel"));
                                if (AbstractC0193a.b(c0197e2.f2293d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0197e2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c0197e2.f2296g;
                                k kVar = null;
                                if (equals) {
                                    k kVar2 = (k) hashMap22.get(num);
                                    if (kVar2 != null) {
                                        c0197e2.b(kVar2);
                                    }
                                    bVar22.l(null);
                                    return;
                                }
                                k kVar3 = (k) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (kVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = kVar3.f2323c;
                                        HashMap c3 = C0197e.c(cursor, Integer.valueOf(kVar3.f2322b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c3.put("cursorId", num);
                                        }
                                        bVar22.l(c3);
                                        if (z2) {
                                            return;
                                        }
                                        c0197e2.b(kVar3);
                                        return;
                                    } catch (Exception e22) {
                                        c0197e2.i(e22, bVar22);
                                        if (kVar3 != null) {
                                            c0197e2.b(kVar3);
                                        } else {
                                            kVar = kVar3;
                                        }
                                        if (0 != 0 || kVar == null) {
                                            return;
                                        }
                                        c0197e2.b(kVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && kVar3 != null) {
                                        c0197e2.b(kVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c0197e.e(bVar4);
                                return;
                            case 2:
                                c0197e.f(bVar4);
                                return;
                            case 3:
                                c0197e.d(bVar4);
                                return;
                            default:
                                C0197e c0197e3 = c0197e;
                                AbstractC0132a abstractC0132a = bVar4;
                                Object s2 = abstractC0132a.s("inTransaction");
                                Boolean bool = s2 instanceof Boolean ? (Boolean) s2 : null;
                                boolean z3 = Boolean.TRUE.equals(bool) && abstractC0132a.w() && ((Integer) abstractC0132a.s("transactionId")) == null;
                                if (z3) {
                                    int i62 = c0197e3.f2300k + 1;
                                    c0197e3.f2300k = i62;
                                    c0197e3.f2301l = Integer.valueOf(i62);
                                }
                                if (!c0197e3.g(abstractC0132a)) {
                                    if (z3) {
                                        c0197e3.f2301l = null;
                                        return;
                                    }
                                    return;
                                } else if (z3) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c0197e3.f2301l);
                                    abstractC0132a.l(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c0197e3.f2301l = null;
                                    }
                                    abstractC0132a.l(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                HashMap hashMap6 = p.f2345g;
                final i0.b bVar5 = new i0.b(o2, iVar);
                c0197e.l(bVar5, new Runnable() { // from class: h0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                C0197e c0197e2 = c0197e;
                                i0.b bVar22 = bVar5;
                                O o3 = bVar22.f2491k;
                                Integer num = (Integer) o3.i("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(o3.i("cancel"));
                                if (AbstractC0193a.b(c0197e2.f2293d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c0197e2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c0197e2.f2296g;
                                k kVar = null;
                                if (equals) {
                                    k kVar2 = (k) hashMap22.get(num);
                                    if (kVar2 != null) {
                                        c0197e2.b(kVar2);
                                    }
                                    bVar22.l(null);
                                    return;
                                }
                                k kVar3 = (k) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (kVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = kVar3.f2323c;
                                        HashMap c3 = C0197e.c(cursor, Integer.valueOf(kVar3.f2322b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c3.put("cursorId", num);
                                        }
                                        bVar22.l(c3);
                                        if (z2) {
                                            return;
                                        }
                                        c0197e2.b(kVar3);
                                        return;
                                    } catch (Exception e22) {
                                        c0197e2.i(e22, bVar22);
                                        if (kVar3 != null) {
                                            c0197e2.b(kVar3);
                                        } else {
                                            kVar = kVar3;
                                        }
                                        if (0 != 0 || kVar == null) {
                                            return;
                                        }
                                        c0197e2.b(kVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && kVar3 != null) {
                                        c0197e2.b(kVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c0197e.e(bVar5);
                                return;
                            case 2:
                                c0197e.f(bVar5);
                                return;
                            case 3:
                                c0197e.d(bVar5);
                                return;
                            default:
                                C0197e c0197e3 = c0197e;
                                AbstractC0132a abstractC0132a = bVar5;
                                Object s2 = abstractC0132a.s("inTransaction");
                                Boolean bool = s2 instanceof Boolean ? (Boolean) s2 : null;
                                boolean z3 = Boolean.TRUE.equals(bool) && abstractC0132a.w() && ((Integer) abstractC0132a.s("transactionId")) == null;
                                if (z3) {
                                    int i62 = c0197e3.f2300k + 1;
                                    c0197e3.f2300k = i62;
                                    c0197e3.f2301l = Integer.valueOf(i62);
                                }
                                if (!c0197e3.g(abstractC0132a)) {
                                    if (z3) {
                                        c0197e3.f2301l = null;
                                        return;
                                    }
                                    return;
                                } else if (z3) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c0197e3.f2301l);
                                    abstractC0132a.l(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c0197e3.f2301l = null;
                                    }
                                    abstractC0132a.l(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap hashMap7 = p.f2345g;
                boolean equals = Boolean.TRUE.equals(o2.i("noResult"));
                boolean equals2 = Boolean.TRUE.equals(o2.i("continueOnError"));
                List list = (List) o2.i("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0222a c0222a = new C0222a((Map) it.next(), equals);
                    String t2 = c0222a.t();
                    t2.getClass();
                    C0079n c0079n = c0222a.f2488k;
                    switch (t2.hashCode()) {
                        case -1319569547:
                            if (t2.equals("execute")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1183792455:
                            if (t2.equals("insert")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -838846263:
                            if (t2.equals("update")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 107944136:
                            if (t2.equals("query")) {
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
                            if (!c0197e.g(c0222a)) {
                                if (!equals2) {
                                    iVar.a((String) c0079n.f690f, (String) c0079n.f691g, (HashMap) c0079n.f692h);
                                    break;
                                } else {
                                    c0222a.S(arrayList);
                                    break;
                                }
                            } else {
                                c0222a.l(null);
                                c0222a.T(arrayList);
                                break;
                            }
                        case 1:
                            if (!c0197e.d(c0222a)) {
                                if (!equals2) {
                                    iVar.a((String) c0079n.f690f, (String) c0079n.f691g, (HashMap) c0079n.f692h);
                                    break;
                                } else {
                                    c0222a.S(arrayList);
                                    break;
                                }
                            } else {
                                c0222a.T(arrayList);
                                break;
                            }
                        case 2:
                            if (!c0197e.f(c0222a)) {
                                if (!equals2) {
                                    iVar.a((String) c0079n.f690f, (String) c0079n.f691g, (HashMap) c0079n.f692h);
                                    break;
                                } else {
                                    c0222a.S(arrayList);
                                    break;
                                }
                            } else {
                                c0222a.T(arrayList);
                                break;
                            }
                        case 3:
                            if (!c0197e.e(c0222a)) {
                                if (!equals2) {
                                    iVar.a((String) c0079n.f690f, (String) c0079n.f691g, (HashMap) c0079n.f692h);
                                    break;
                                } else {
                                    c0222a.S(arrayList);
                                    break;
                                }
                            } else {
                                c0222a.T(arrayList);
                                break;
                            }
                        default:
                            iVar.a("bad_param", "Batch method '" + t2 + "' not supported", null);
                            break;
                    }
                }
                if (!equals) {
                    iVar.c(arrayList);
                    break;
                } else {
                    iVar.c(null);
                    break;
                }
        }
    }

    public /* synthetic */ l(O o2, v0.i iVar, C0197e c0197e, int i2) {
        this.f2324e = i2;
        this.f2325f = o2;
        this.f2326g = iVar;
        this.f2327h = c0197e;
    }

    public /* synthetic */ l(C0197e c0197e, O o2, v0.i iVar) {
        this.f2324e = 6;
        this.f2327h = c0197e;
        this.f2325f = o2;
        this.f2326g = iVar;
    }
}
