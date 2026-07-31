package n;

import F.v1;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import a.AbstractC0235a;
import a0.AbstractC0236a;
import a0.C0238c;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.ExtractedText;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.InterfaceC0281j;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import k2.C0572d;
import m2.InterfaceC0656f;
import n0.C0700A;
import n0.C0702C;
import n0.C0711i;
import n0.EnumC0712j;
import n2.AbstractC0730j;
import q1.C0811a;
import s.C0939h;
import s1.C0964b;
import s2.EnumC0967a;
import t1.C1022b;
import t1.C1028h;
import u0.AbstractC1124s0;
import x1.C1224c;
import x1.C1225d;

/* loaded from: classes.dex */
public abstract class r {
    public static s2.g a(int i3, int i4, EnumC0967a enumC0967a) {
        s2.g rVar;
        if ((i4 & 1) != 0) {
            i3 = 0;
        }
        int i5 = i4 & 2;
        EnumC0967a enumC0967a2 = EnumC0967a.f8359d;
        if (i5 != 0) {
            enumC0967a = enumC0967a2;
        }
        if (i3 != -2) {
            if (i3 == -1) {
                if (enumC0967a == enumC0967a2) {
                    return new s2.r(1, EnumC0967a.f8360e, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i3 == 0) {
                rVar = enumC0967a == enumC0967a2 ? new s2.g(0, null) : new s2.r(1, enumC0967a, null);
            } else {
                if (i3 != Integer.MAX_VALUE) {
                    return enumC0967a == enumC0967a2 ? new s2.g(i3, null) : new s2.r(i3, enumC0967a, null);
                }
                rVar = new s2.g(Integer.MAX_VALUE, null);
            }
        } else if (enumC0967a == enumC0967a2) {
            s2.k.f8409b.getClass();
            rVar = new s2.g(s2.j.f8408b, null);
        } else {
            rVar = new s2.r(1, enumC0967a, null);
        }
        return rVar;
    }

    public static final void b(u1.p pVar, C0167p c0167p, int i3) {
        c0167p.S(294589392);
        int i4 = 4;
        int i5 = (i3 & 6) == 0 ? (c0167p.f(pVar) ? 4 : 2) | i3 : i3;
        if ((i5 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            R.i t02 = O2.l.t0(c0167p);
            InterfaceC0142c0 u3 = C0143d.u(pVar.b().f8895e, c0167p);
            List list = (List) u3.getValue();
            boolean booleanValue = ((Boolean) c0167p.k(AbstractC1124s0.f9521a)).booleanValue();
            boolean f3 = c0167p.f(list);
            Object G3 = c0167p.G();
            Object obj = C0159l.f2829a;
            Object obj2 = G3;
            if (f3 || G3 == obj) {
                S.t tVar = new S.t();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    C1028h c1028h = (C1028h) obj3;
                    if (booleanValue || c1028h.f8880k.f5242d.compareTo(EnumC0286o.f5229g) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                tVar.addAll(arrayList);
                c0167p.a0(tVar);
                obj2 = tVar;
            }
            S.t tVar2 = (S.t) obj2;
            boolean z3 = false;
            c(tVar2, (List) u3.getValue(), c0167p, 0);
            InterfaceC0142c0 u4 = C0143d.u(pVar.b().f8896f, c0167p);
            Object G4 = c0167p.G();
            if (G4 == obj) {
                G4 = new S.t();
                c0167p.a0(G4);
            }
            S.t tVar3 = (S.t) G4;
            c0167p.Q(1361037007);
            ListIterator listIterator = tVar2.listIterator();
            while (true) {
                S.x xVar = (S.x) listIterator;
                if (!xVar.hasNext()) {
                    break;
                }
                C1028h c1028h2 = (C1028h) xVar.next();
                t1.u uVar = c1028h2.f8874e;
                f2.j.d(uVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                u1.o oVar = (u1.o) uVar;
                boolean h3 = c0167p.h(c1028h2) | ((i5 & 14) != i4 ? z3 : true);
                Object G5 = c0167p.G();
                if (h3 || G5 == obj) {
                    G5 = new B.f0(pVar, 13, c1028h2);
                    c0167p.a0(G5);
                }
                AbstractC0235a.c((InterfaceC0422a) G5, oVar.f9615m, Q.f.b(1129586364, new u1.k(c1028h2, pVar, t02, tVar3, oVar), c0167p), c0167p, 384);
                i4 = 4;
                z3 = false;
            }
            boolean z4 = z3;
            c0167p.p(z4);
            Set set = (Set) u4.getValue();
            boolean f4 = c0167p.f(u4) | ((i5 & 14) == 4 ? true : z4);
            Object G6 = c0167p.G();
            if (f4 || G6 == obj) {
                G6 = new u1.l(u4, pVar, tVar3, null);
                c0167p.a0(G6);
            }
            C0143d.f(set, tVar3, (InterfaceC0426e) G6, c0167p);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new R0.t(i3, 5, pVar);
        }
    }

    public static final void c(S.t tVar, List list, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(1537894851);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(tVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(list) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean booleanValue = ((Boolean) c0167p.k(AbstractC1124s0.f9521a)).booleanValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1028h c1028h = (C1028h) it.next();
                C0294x c0294x = c1028h.f8880k;
                boolean g3 = c0167p.g(booleanValue) | c0167p.h(tVar) | c0167p.h(c1028h);
                Object G3 = c0167p.G();
                if (g3 || G3 == C0159l.f2829a) {
                    G3 = new u1.n(tVar, c1028h, booleanValue);
                    c0167p.a0(G3);
                }
                C0143d.c(c0294x, (InterfaceC0424c) G3, c0167p);
            }
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new v1(i3, 9, tVar, list);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object d(n0.C0700A r8, X1.a r9) {
        /*
            boolean r0 = r9 instanceof o.C0741c
            if (r0 == 0) goto L13
            r0 = r9
            o.c r0 = (o.C0741c) r0
            int r1 = r0.f7387i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7387i = r1
            goto L18
        L13:
            o.c r0 = new o.c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f7386h
            W1.a r1 = W1.a.f4608d
            int r2 = r0.f7387i
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n0.A r8 = r0.f7385g
            R1.a.e(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            R1.a.e(r9)
        L34:
            r0.f7385g = r8
            r0.f7387i = r3
            n0.j r9 = n0.EnumC0712j.f7296e
            java.lang.Object r9 = r8.b(r9, r0)
            if (r9 != r1) goto L41
            goto L6e
        L41:
            n0.i r9 = (n0.C0711i) r9
            int r2 = r9.f7293b
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.lang.Object r9 = r9.f7292a
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L51:
            if (r5 >= r2) goto L6a
            java.lang.Object r6 = r9.get(r5)
            n0.s r6 = (n0.s) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L34
            boolean r7 = r6.f7315h
            if (r7 != 0) goto L34
            boolean r6 = r6.f7311d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L51
        L6a:
            java.lang.Object r1 = r9.get(r4)
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n.r.d(n0.A, X1.a):java.lang.Object");
    }

    public static final ExtractedText e(I0.z zVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = zVar.f3097a.f596a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j3 = zVar.f3098b;
        extractedText.selectionStart = C0.J.e(j3);
        extractedText.selectionEnd = C0.J.d(j3);
        extractedText.flags = !AbstractC0730j.B(zVar.f3097a.f596a, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:10:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(C0700A c0700a, X1.a aVar) {
        p.N n3;
        int i3;
        int size;
        int i4;
        if (aVar instanceof p.N) {
            n3 = (p.N) aVar;
            int i5 = n3.f7557i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                n3.f7557i = i5 - Integer.MIN_VALUE;
                Object obj = n3.f7556h;
                W1.a aVar2 = W1.a.f4608d;
                i3 = n3.f7557i;
                if (i3 != 0) {
                    R1.a.e(obj);
                    ?? r8 = c0700a.f7256h.f7264v.f7292a;
                    int size2 = r8.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (((n0.s) r8.get(i6)).f7311d) {
                            EnumC0712j enumC0712j = EnumC0712j.f7297f;
                            n3.f7555g = c0700a;
                            n3.f7557i = 1;
                            obj = c0700a.b(enumC0712j, n3);
                            if (obj == aVar2) {
                            }
                            ?? r82 = ((C0711i) obj).f7292a;
                            size = r82.size();
                            i4 = 0;
                            while (i4 < size) {
                            }
                            return R1.y.f4171a;
                        }
                    }
                    return R1.y.f4171a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0700a = n3.f7555g;
                R1.a.e(obj);
                ?? r822 = ((C0711i) obj).f7292a;
                size = r822.size();
                i4 = 0;
                while (i4 < size) {
                    if (((n0.s) r822.get(i4)).f7311d) {
                        EnumC0712j enumC0712j2 = EnumC0712j.f7297f;
                        n3.f7555g = c0700a;
                        n3.f7557i = 1;
                        obj = c0700a.b(enumC0712j2, n3);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        ?? r8222 = ((C0711i) obj).f7292a;
                        size = r8222.size();
                        i4 = 0;
                        while (i4 < size) {
                        }
                    } else {
                        i4++;
                    }
                }
                return R1.y.f4171a;
            }
        }
        n3 = new p.N(aVar);
        Object obj2 = n3.f7556h;
        W1.a aVar22 = W1.a.f4608d;
        i3 = n3.f7557i;
        if (i3 != 0) {
        }
    }

    public static final Object g(C0702C c0702c, InterfaceC0426e interfaceC0426e, V1.d dVar) {
        Object y02 = c0702c.y0(new p.O(dVar.t(), interfaceC0426e, null), dVar);
        return y02 == W1.a.f4608d ? y02 : R1.y.f4171a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [S1.u] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean h(ArrayList arrayList) {
        ?? r02;
        long j3;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            r02 = S1.u.f4320d;
        } else {
            r02 = new ArrayList();
            Object obj = arrayList.get(0);
            int z02 = S1.m.z0(arrayList);
            int i3 = 0;
            while (i3 < z02) {
                i3++;
                Object obj2 = arrayList.get(i3);
                A0.p pVar = (A0.p) obj2;
                A0.p pVar2 = (A0.p) obj;
                r02.add(new C0238c(l0.c.e(Math.abs(C0238c.d(pVar2.e().a()) - C0238c.d(pVar.e().a())), Math.abs(C0238c.e(pVar2.e().a()) - C0238c.e(pVar.e().a())))));
                obj = obj2;
            }
        }
        if (r02.size() == 1) {
            j3 = ((C0238c) S1.l.K0(r02)).f4722a;
        } else {
            if (r02.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object K02 = S1.l.K0(r02);
            int z03 = S1.m.z0(r02);
            if (1 <= z03) {
                int i4 = 1;
                while (true) {
                    K02 = new C0238c(C0238c.h(((C0238c) K02).f4722a, ((C0238c) r02.get(i4)).f4722a));
                    if (i4 == z03) {
                        break;
                    }
                    i4++;
                }
            }
            j3 = ((C0238c) K02).f4722a;
        }
        return C0238c.e(j3) < C0238c.d(j3);
    }

    public static void i(int i3) {
        if (2 > i3 || i3 >= 37) {
            StringBuilder k3 = A.k.k(i3, "radix ", " was not in valid range ");
            k3.append(new C0572d(2, 36, 1));
            throw new IllegalArgumentException(k3.toString());
        }
    }

    public static final boolean j(char c2, char c3, boolean z3) {
        if (c2 == c3) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final int k(int i3, Object obj, C0939h c0939h) {
        if (obj != null && c0939h.c() != 0) {
            if (i3 < c0939h.c() && obj.equals(c0939h.d(i3))) {
                return i3;
            }
            int b3 = c0939h.f8237d.b(obj);
            if (b3 != -1) {
                return b3;
            }
        }
        return i3;
    }

    public static String l(Context context, int i3) {
        String valueOf;
        f2.j.f(context, "context");
        if (i3 <= 16777215) {
            return String.valueOf(i3);
        }
        try {
            valueOf = context.getResources().getResourceName(i3);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i3);
        }
        f2.j.e(valueOf, "try {\n                  …tring()\n                }");
        return valueOf;
    }

    public static InterfaceC0656f m(t1.u uVar) {
        f2.j.f(uVar, "<this>");
        return m2.h.T(uVar, C1022b.f8863m);
    }

    public static boolean n(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final List o(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        T1.b bVar = new T1.b(10);
        while (cursor.moveToNext()) {
            int i3 = cursor.getInt(columnIndex);
            int i4 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            f2.j.e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            f2.j.e(string2, "cursor.getString(toColumnIndex)");
            bVar.add(new C1224c(i3, i4, string, string2));
        }
        T1.b P3 = O2.l.P(bVar);
        f2.j.f(P3, "<this>");
        if (P3.b() <= 1) {
            return S1.l.a1(P3);
        }
        Object[] array = P3.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return S1.k.h0(array);
    }

    public static final C1225d p(A1.c cVar, String str, boolean z3) {
        Cursor n3 = cVar.n("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = n3.getColumnIndex("seqno");
            int columnIndex2 = n3.getColumnIndex("cid");
            int columnIndex3 = n3.getColumnIndex("name");
            int columnIndex4 = n3.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (n3.moveToNext()) {
                    if (n3.getInt(columnIndex2) >= 0) {
                        int i3 = n3.getInt(columnIndex);
                        String string = n3.getString(columnIndex3);
                        String str2 = n3.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i3);
                        f2.j.e(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i3), str2);
                    }
                }
                Collection values = treeMap.values();
                f2.j.e(values, "columnsMap.values");
                List a12 = S1.l.a1(values);
                Collection values2 = treeMap2.values();
                f2.j.e(values2, "ordersMap.values");
                C1225d c1225d = new C1225d(str, z3, a12, S1.l.a1(values2));
                O2.d.t(n3, null);
                return c1225d;
            }
            O2.d.t(n3, null);
            return null;
        } finally {
        }
    }

    public static final void q(d1.h hVar, A0.p pVar) {
        Object obj = pVar.i().f129d.get(A0.s.f172g);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            throw new ClassCastException();
        }
        A0.p j3 = pVar.j();
        if (j3 == null) {
            return;
        }
        Object obj2 = j3.i().f129d.get(A0.s.f170e);
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null) {
            Object obj3 = j3.i().f129d.get(A0.s.f171f);
            A0.b bVar = (A0.b) (obj3 != null ? obj3 : null);
            if (bVar == null || (bVar.f90a >= 0 && bVar.f91b >= 0)) {
                if (pVar.i().f129d.containsKey(A0.s.f161A)) {
                    ArrayList arrayList = new ArrayList();
                    List h3 = A0.p.h(j3, true, 4);
                    int size = h3.size();
                    int i3 = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        A0.p pVar2 = (A0.p) h3.get(i4);
                        if (pVar2.i().f129d.containsKey(A0.s.f161A)) {
                            arrayList.add(pVar2);
                            if (pVar2.f141c.t() < pVar.f141c.t()) {
                                i3++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean h4 = h(arrayList);
                    int i5 = h4 ? 0 : i3;
                    int i6 = h4 ? i3 : 0;
                    Object obj4 = pVar.i().f129d.get(A0.s.f161A);
                    if (obj4 == null) {
                        obj4 = Boolean.FALSE;
                    }
                    hVar.f5672a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i5, 1, i6, 1, false, ((Boolean) obj4).booleanValue()));
                }
            }
        }
    }

    public static final long r(long j3, float f3) {
        return AbstractC0235a.b(Math.max(0.0f, AbstractC0236a.b(j3) - f3), Math.max(0.0f, AbstractC0236a.c(j3) - f3));
    }

    public static final androidx.lifecycle.V s(f2.d dVar, androidx.lifecycle.b0 b0Var, androidx.lifecycle.X x3, m.s0 s0Var, C0167p c0167p) {
        B.Y y3;
        c0167p.R(1673618944);
        f2.j.f(s0Var, "extras");
        if (x3 != null) {
            y3 = new B.Y(b0Var.d(), x3, s0Var);
        } else {
            boolean z3 = b0Var instanceof InterfaceC0281j;
            if (z3) {
                androidx.lifecycle.a0 d3 = b0Var.d();
                androidx.lifecycle.X f3 = ((InterfaceC0281j) b0Var).f();
                f2.j.f(f3, "factory");
                y3 = new B.Y(d3, f3, s0Var);
            } else {
                androidx.lifecycle.X f4 = z3 ? ((InterfaceC0281j) b0Var).f() : C0964b.f8353a;
                m.s0 a3 = z3 ? ((InterfaceC0281j) b0Var).a() : C0811a.f7847b;
                f2.j.f(f4, "factory");
                f2.j.f(a3, "extras");
                y3 = new B.Y(b0Var.d(), f4, a3);
            }
        }
        androidx.lifecycle.V e3 = y3.e(dVar);
        c0167p.p(false);
        return e3;
    }
}
