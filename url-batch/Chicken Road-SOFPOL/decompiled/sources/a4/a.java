package a4;

import a7.q;
import android.content.Context;
import android.util.Log;
import c6.m;
import d2.v;
import d6.u;
import f1.h0;
import g2.a0;
import g2.b0;
import g2.d0;
import g2.g0;
import g2.j;
import g2.j0;
import g2.k0;
import g2.o;
import g2.r;
import g2.t;
import g2.y;
import g2.z;
import j2.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import q2.l;
import q2.p;
import q2.s;
import r2.n;
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f226d;

    public /* synthetic */ a(int i) {
        this.f226d = i;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        String valueOf;
        int i = 0;
        b0 b0Var = null;
        r16 = null;
        h0 h0Var = null;
        r16 = null;
        s sVar = null;
        r16 = null;
        g0 g0Var = null;
        r16 = null;
        g2.i iVar = null;
        r16 = null;
        j jVar = null;
        r16 = null;
        j0 j0Var = null;
        r16 = null;
        k0 k0Var = null;
        r16 = null;
        b0 b0Var2 = null;
        r16 = null;
        r rVar = null;
        r16 = null;
        g0 g0Var2 = null;
        b0Var = null;
        switch (this.f226d) {
            case 0:
                q6.i.e((Context) obj, "it");
                return u.f2326d;
            case 1:
                g6.f fVar = (g6.f) obj;
                if (fVar instanceof q) {
                    return (q) fVar;
                }
                return null;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                Map.Entry entry = (Map.Entry) obj;
                q6.i.e(entry, "entry");
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int length = bArr.length;
                    int i8 = 0;
                    while (i < length) {
                        byte b8 = bArr[i];
                        i8++;
                        if (i8 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b8));
                        i++;
                    }
                    sb.append((CharSequence) "]");
                    valueOf = sb.toString();
                } else {
                    valueOf = String.valueOf(entry.getValue());
                }
                return "  " + ((b4.c) entry.getKey()).f1244a + " = " + valueOf;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                w6.d[] dVarArr = d2.u.f2215a;
                v vVar = d2.s.f2192e;
                m mVar = m.f1757a;
                ((d2.j) obj).e(vVar, mVar);
                return mVar;
            case i.LONG_FIELD_NUMBER /* 4 */:
                o oVar = (o) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(oVar.f2984b);
                sb2.append(", ");
                return a0.q.k(sb2, oVar.f2985c, ')');
            case 5:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                p6.c cVar = (p6.c) z.f3017h.f12f;
                Boolean bool = Boolean.FALSE;
                b0 b0Var3 = (q6.i.a(obj2, bool) || obj2 == null) ? null : (b0) cVar.i(obj2);
                Object obj3 = list.get(1);
                b0 b0Var4 = (q6.i.a(obj3, bool) || obj3 == null) ? null : (b0) cVar.i(obj3);
                Object obj4 = list.get(2);
                b0 b0Var5 = (q6.i.a(obj4, bool) || obj4 == null) ? null : (b0) cVar.i(obj4);
                Object obj5 = list.get(3);
                if (!q6.i.a(obj5, bool) && obj5 != null) {
                    b0Var = (b0) cVar.i(obj5);
                }
                return new g0(b0Var3, b0Var4, b0Var5, b0Var);
            case 6:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (q6.i.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((p6.c) z.f3010a.f12f).i(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                q6.i.b(str);
                return new g2.e(list3, str);
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new l(((Integer) obj).intValue());
            case i.BYTES_FIELD_NUMBER /* 8 */:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case v0.f8304b /* 9 */:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                r2.p[] pVarArr = n.f6533b;
                p6.c cVar2 = z.f3025q.f3009e;
                Boolean bool2 = Boolean.FALSE;
                q6.i.a(obj8, bool2);
                n nVar = obj8 != null ? (n) cVar2.i(obj8) : null;
                q6.i.b(nVar);
                long j7 = nVar.f6535a;
                Object obj9 = list5.get(1);
                q6.i.a(obj9, bool2);
                n nVar2 = obj9 != null ? (n) cVar2.i(obj9) : null;
                q6.i.b(nVar2);
                return new q2.q(j7, nVar2.f6535a);
            case v0.f8306d /* 10 */:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new k(((Integer) obj).intValue());
            case 11:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new q2.a(((Float) obj).floatValue());
            case 12:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                q6.i.b(num);
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                q6.i.b(num2);
                return new g2.h0(a0.b(intValue, num2.intValue()));
            case 13:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i9 = f1.s.i;
                Boolean bool3 = Boolean.FALSE;
                q6.i.a(obj12, bool3);
                f1.s sVar2 = obj12 != null ? q6.i.a(obj12, Boolean.FALSE) ? new f1.s(f1.s.f2704h) : new f1.s(f1.p.b(((Integer) obj12).intValue())) : null;
                q6.i.b(sVar2);
                long j8 = sVar2.f2705a;
                Object obj13 = list7.get(1);
                y yVar = z.f3026r;
                q6.i.a(obj13, bool3);
                e1.b bVar = obj13 != null ? (e1.b) yVar.f3009e.i(obj13) : null;
                q6.i.b(bVar);
                long j9 = bVar.f2455a;
                Object obj14 = list7.get(2);
                Float f6 = obj14 != null ? (Float) obj14 : null;
                q6.i.b(f6);
                return new h0(f6.floatValue(), j8, j9);
            case 14:
                if (q6.i.a(obj, Boolean.FALSE)) {
                    return new n(n.f6534c);
                }
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                Float f8 = obj15 != null ? (Float) obj15 : null;
                q6.i.b(f8);
                float floatValue = f8.floatValue();
                Object obj16 = list8.get(1);
                r2.p pVar = obj16 != null ? (r2.p) obj16 : null;
                q6.i.b(pVar);
                return new n(r2.o.d0(pVar.f6536a, floatValue));
            case v0.f8308f /* 15 */:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                q6.i.b(str2);
                Object obj18 = list9.get(1);
                a0.a0 a0Var = z.i;
                if (!q6.i.a(obj18, Boolean.FALSE) && obj18 != null) {
                    g0Var2 = (g0) ((p6.c) a0Var.f12f).i(obj18);
                }
                return new j(str2, g0Var2);
            case 16:
                if (q6.i.a(obj, Boolean.FALSE)) {
                    return new e1.b(9205357640488583168L);
                }
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                Float f9 = obj19 != null ? (Float) obj19 : null;
                q6.i.b(f9);
                float floatValue2 = f9.floatValue();
                Object obj20 = list10.get(1);
                q6.i.b(obj20 != null ? (Float) obj20 : null);
                return new e1.b((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r16.floatValue()) & 4294967295L));
            case 17:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                while (i < size) {
                    Object obj21 = list11.get(i);
                    m2.a aVar = (q6.i.a(obj21, Boolean.FALSE) || obj21 == null) ? null : (m2.a) ((p6.c) z.f3028t.f12f).i(obj21);
                    q6.i.b(aVar);
                    arrayList.add(aVar);
                    i++;
                }
                return new m2.b(arrayList);
            case 18:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i < size2) {
                    Object obj22 = list12.get(i);
                    g2.c cVar3 = (q6.i.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (g2.c) ((p6.c) z.f3011b.f12f).i(obj22);
                    q6.i.b(cVar3);
                    arrayList2.add(cVar3);
                    i++;
                }
                return arrayList2;
            case 19:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj;
                m2.c.f5220a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str3);
                if (q6.i.a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new m2.a(forLanguageTag);
            case 20:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                q2.f fVar2 = obj23 != null ? (q2.f) obj23 : null;
                q6.i.b(fVar2);
                float f10 = fVar2.f6047a;
                Object obj24 = list13.get(1);
                q2.h hVar = obj24 != null ? (q2.h) obj24 : null;
                q6.i.b(hVar);
                int i10 = hVar.f6048a;
                Object obj25 = list13.get(2);
                q6.i.b(obj25 != null ? (q2.g) obj25 : null);
                return new q2.i(i10, f10);
            case 21:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                g2.g gVar = obj26 != null ? (g2.g) obj26 : null;
                q6.i.b(gVar);
                Object obj27 = list14.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                q6.i.b(num3);
                int intValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                q6.i.b(num4);
                int intValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                String str4 = obj29 != null ? (String) obj29 : null;
                q6.i.b(str4);
                switch (gVar.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        a0.a0 a0Var2 = z.f3016g;
                        if (!q6.i.a(obj30, Boolean.FALSE) && obj30 != null) {
                            rVar = (r) ((p6.c) a0Var2.f12f).i(obj30);
                        }
                        r rVar2 = rVar;
                        q6.i.b(rVar2);
                        return new g2.c(rVar2, intValue2, intValue3, str4);
                    case 1:
                        Object obj31 = list14.get(1);
                        a0.a0 a0Var3 = z.f3017h;
                        if (!q6.i.a(obj31, Boolean.FALSE) && obj31 != null) {
                            b0Var2 = (b0) ((p6.c) a0Var3.f12f).i(obj31);
                        }
                        b0 b0Var6 = b0Var2;
                        q6.i.b(b0Var6);
                        return new g2.c(b0Var6, intValue2, intValue3, str4);
                    case i.FLOAT_FIELD_NUMBER /* 2 */:
                        Object obj32 = list14.get(1);
                        a0.a0 a0Var4 = z.f3012c;
                        if (!q6.i.a(obj32, Boolean.FALSE) && obj32 != null) {
                            k0Var = (k0) ((p6.c) a0Var4.f12f).i(obj32);
                        }
                        k0 k0Var2 = k0Var;
                        q6.i.b(k0Var2);
                        return new g2.c(k0Var2, intValue2, intValue3, str4);
                    case i.INTEGER_FIELD_NUMBER /* 3 */:
                        Object obj33 = list14.get(1);
                        a0.a0 a0Var5 = z.f3013d;
                        if (!q6.i.a(obj33, Boolean.FALSE) && obj33 != null) {
                            j0Var = (j0) ((p6.c) a0Var5.f12f).i(obj33);
                        }
                        j0 j0Var2 = j0Var;
                        q6.i.b(j0Var2);
                        return new g2.c(j0Var2, intValue2, intValue3, str4);
                    case i.LONG_FIELD_NUMBER /* 4 */:
                        Object obj34 = list14.get(1);
                        a0.a0 a0Var6 = z.f3014e;
                        if (!q6.i.a(obj34, Boolean.FALSE) && obj34 != null) {
                            jVar = (j) ((p6.c) a0Var6.f12f).i(obj34);
                        }
                        j jVar2 = jVar;
                        q6.i.b(jVar2);
                        return new g2.c(jVar2, intValue2, intValue3, str4);
                    case 5:
                        Object obj35 = list14.get(1);
                        a0.a0 a0Var7 = z.f3015f;
                        if (!q6.i.a(obj35, Boolean.FALSE) && obj35 != null) {
                            iVar = (g2.i) ((p6.c) a0Var7.f12f).i(obj35);
                        }
                        g2.i iVar2 = iVar;
                        q6.i.b(iVar2);
                        return new g2.c(iVar2, intValue2, intValue3, str4);
                    case 6:
                        Object obj36 = list14.get(1);
                        String str5 = obj36 != null ? (String) obj36 : null;
                        q6.i.b(str5);
                        return new g2.c(new d0(str5), intValue2, intValue3, str4);
                    default:
                        throw new a5.c();
                }
            case 22:
                String str6 = obj != null ? (String) obj : null;
                q6.i.b(str6);
                return new k0(str6);
            case 23:
                String str7 = obj != null ? (String) obj : null;
                q6.i.b(str7);
                return new j0(str7);
            case 24:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                String str8 = obj37 != null ? (String) obj37 : null;
                q6.i.b(str8);
                Object obj38 = list15.get(1);
                a0.a0 a0Var8 = z.i;
                if (!q6.i.a(obj38, Boolean.FALSE) && obj38 != null) {
                    g0Var = (g0) ((p6.c) a0Var8.f12f).i(obj38);
                }
                return new g2.i(str8, g0Var);
            case 25:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                q2.k kVar = obj39 != null ? (q2.k) obj39 : null;
                q6.i.b(kVar);
                int i11 = kVar.f6055a;
                Object obj40 = list16.get(1);
                q2.m mVar2 = obj40 != null ? (q2.m) obj40 : null;
                q6.i.b(mVar2);
                int i12 = mVar2.f6059a;
                Object obj41 = list16.get(2);
                r2.p[] pVarArr2 = n.f6533b;
                y yVar2 = z.f3025q;
                Boolean bool4 = Boolean.FALSE;
                q6.i.a(obj41, bool4);
                n nVar3 = obj41 != null ? (n) yVar2.f3009e.i(obj41) : null;
                q6.i.b(nVar3);
                long j10 = nVar3.f6535a;
                Object obj42 = list16.get(3);
                q2.q qVar = q2.q.f6064c;
                q2.q qVar2 = (q6.i.a(obj42, bool4) || obj42 == null) ? null : (q2.q) ((p6.c) z.f3020l.f12f).i(obj42);
                Object obj43 = list16.get(4);
                t tVar = (q6.i.a(obj43, bool4) || obj43 == null) ? null : (t) ((p6.c) a0.f2900a.f12f).i(obj43);
                Object obj44 = list16.get(5);
                q2.i iVar3 = q2.i.f6049c;
                q2.i iVar4 = (q6.i.a(obj44, bool4) || obj44 == null) ? null : (q2.i) ((p6.c) z.f3029u.f12f).i(obj44);
                Object obj45 = list16.get(6);
                q2.e eVar = (q6.i.a(obj45, bool4) || obj45 == null) ? null : (q2.e) ((p6.c) a0.f2901b.f12f).i(obj45);
                q6.i.b(eVar);
                int i13 = eVar.f6043a;
                Object obj46 = list16.get(7);
                q2.d dVar = obj46 != null ? (q2.d) obj46 : null;
                q6.i.b(dVar);
                int i14 = dVar.f6041a;
                Object obj47 = list16.get(8);
                boolean a8 = q6.i.a(obj47, bool4);
                a0.a0 a0Var9 = a0.f2902c;
                if (!a8 && obj47 != null) {
                    sVar = (s) ((p6.c) a0Var9.f12f).i(obj47);
                }
                return new r(i11, i12, j10, qVar2, tVar, iVar4, i13, i14, sVar);
            case 26:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i15 = f1.s.i;
                Boolean bool5 = Boolean.FALSE;
                q6.i.a(obj48, bool5);
                f1.s sVar3 = obj48 != null ? obj48.equals(bool5) ? new f1.s(f1.s.f2704h) : new f1.s(f1.p.b(((Integer) obj48).intValue())) : null;
                q6.i.b(sVar3);
                long j11 = sVar3.f2705a;
                Object obj49 = list17.get(1);
                r2.p[] pVarArr3 = n.f6533b;
                p6.c cVar4 = z.f3025q.f3009e;
                q6.i.a(obj49, bool5);
                n nVar4 = obj49 != null ? (n) cVar4.i(obj49) : null;
                q6.i.b(nVar4);
                long j12 = nVar4.f6535a;
                Object obj50 = list17.get(2);
                k kVar2 = k.f3994e;
                k kVar3 = (q6.i.a(obj50, bool5) || obj50 == null) ? null : (k) ((p6.c) z.f3021m.f12f).i(obj50);
                Object obj51 = list17.get(3);
                j2.i iVar5 = obj51 != null ? (j2.i) obj51 : null;
                Object obj52 = list17.get(4);
                j2.j jVar3 = obj52 != null ? (j2.j) obj52 : null;
                Object obj53 = list17.get(6);
                String str9 = obj53 != null ? (String) obj53 : null;
                Object obj54 = list17.get(7);
                q6.i.a(obj54, bool5);
                n nVar5 = obj54 != null ? (n) cVar4.i(obj54) : null;
                q6.i.b(nVar5);
                long j13 = nVar5.f6535a;
                Object obj55 = list17.get(8);
                q2.a aVar2 = (q6.i.a(obj55, bool5) || obj55 == null) ? null : (q2.a) ((p6.c) z.f3022n.f12f).i(obj55);
                Object obj56 = list17.get(9);
                p pVar2 = (q6.i.a(obj56, bool5) || obj56 == null) ? null : (p) ((p6.c) z.f3019k.f12f).i(obj56);
                Object obj57 = list17.get(10);
                m2.b bVar2 = m2.b.f5217f;
                m2.b bVar3 = (q6.i.a(obj57, bool5) || obj57 == null) ? null : (m2.b) ((p6.c) z.f3027s.f12f).i(obj57);
                Object obj58 = list17.get(11);
                q6.i.a(obj58, bool5);
                f1.s sVar4 = obj58 != null ? obj58.equals(bool5) ? new f1.s(f1.s.f2704h) : new f1.s(f1.p.b(((Integer) obj58).intValue())) : null;
                q6.i.b(sVar4);
                long j14 = sVar4.f2705a;
                Object obj59 = list17.get(12);
                l lVar = (q6.i.a(obj59, bool5) || obj59 == null) ? null : (l) ((p6.c) z.f3018j.f12f).i(obj59);
                Object obj60 = list17.get(13);
                h0 h0Var2 = h0.f2663d;
                a0.a0 a0Var10 = z.f3023o;
                if (!q6.i.a(obj60, bool5) && obj60 != null) {
                    h0Var = (h0) ((p6.c) a0Var10.f12f).i(obj60);
                }
                return new b0(j11, j12, kVar3, iVar5, jVar3, (j2.p) null, str9, j13, aVar2, pVar2, bVar3, j14, lVar, h0Var, 49184);
            case 27:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                Boolean bool6 = obj61 != null ? (Boolean) obj61 : null;
                q6.i.b(bool6);
                boolean booleanValue = bool6.booleanValue();
                Object obj62 = list18.get(1);
                q6.i.b(obj62 != null ? (g2.h) obj62 : null);
                return new t(booleanValue);
            case 28:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new q2.e(((Integer) obj).intValue());
            default:
                q6.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                q2.r rVar3 = obj63 != null ? (q2.r) obj63 : null;
                q6.i.b(rVar3);
                int i16 = rVar3.f6067a;
                Object obj64 = list19.get(1);
                Boolean bool7 = obj64 != null ? (Boolean) obj64 : null;
                q6.i.b(bool7);
                return new s(i16, bool7.booleanValue());
        }
    }
}
