package M2;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: M2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106j extends H2.r {

    /* renamed from: a, reason: collision with root package name */
    public static final C0106j f1877a = new C0106j();

    @Override // H2.r
    public final Object readValueOfType(byte b6, ByteBuffer byteBuffer) {
        switch (b6) {
            case -127:
                Object readValue = readValue(byteBuffer);
                if (readValue == null) {
                    return null;
                }
                return q.values()[((Long) readValue).intValue()];
            case -126:
                Object readValue2 = readValue(byteBuffer);
                if (readValue2 == null) {
                    return null;
                }
                return H.values()[((Long) readValue2).intValue()];
            case -125:
                Object readValue3 = readValue(byteBuffer);
                if (readValue3 == null) {
                    return null;
                }
                return z.values()[((Long) readValue3).intValue()];
            case -124:
                Object readValue4 = readValue(byteBuffer);
                if (readValue4 == null) {
                    return null;
                }
                return EnumC0109m.values()[((Long) readValue4).intValue()];
            case -123:
                Object readValue5 = readValue(byteBuffer);
                if (readValue5 == null) {
                    return null;
                }
                return n.values()[((Long) readValue5).intValue()];
            case -122:
                Object readValue6 = readValue(byteBuffer);
                if (readValue6 == null) {
                    return null;
                }
                return D.values()[((Long) readValue6).intValue()];
            case -121:
                Object readValue7 = readValue(byteBuffer);
                if (readValue7 == null) {
                    return null;
                }
                return G.values()[((Long) readValue7).intValue()];
            case -120:
                ArrayList arrayList = (ArrayList) readValue(byteBuffer);
                F f3 = new F();
                String str = (String) arrayList.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"productId\" is null.");
                }
                f3.f1822a = str;
                z zVar = (z) arrayList.get(1);
                if (zVar == null) {
                    throw new IllegalStateException("Nonnull field \"productType\" is null.");
                }
                f3.f1823b = zVar;
                return f3;
            case -119:
                ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
                C0107k c0107k = new C0107k();
                c0107k.f1878a = (String) arrayList2.get(0);
                c0107k.f1879b = (String) arrayList2.get(1);
                return c0107k;
            case -118:
                ArrayList arrayList3 = (ArrayList) readValue(byteBuffer);
                r rVar = new r();
                q qVar = (q) arrayList3.get(0);
                if (qVar == null) {
                    throw new IllegalStateException("Nonnull field \"responseCode\" is null.");
                }
                rVar.f1909a = qVar;
                String str2 = (String) arrayList3.get(1);
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"debugMessage\" is null.");
                }
                rVar.f1910b = str2;
                return rVar;
            case -117:
                ArrayList arrayList4 = (ArrayList) readValue(byteBuffer);
                t tVar = new t();
                Long l2 = (Long) arrayList4.get(0);
                if (l2 == null) {
                    throw new IllegalStateException("Nonnull field \"priceAmountMicros\" is null.");
                }
                tVar.f1913a = l2;
                String str3 = (String) arrayList4.get(1);
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                }
                tVar.f1914b = str3;
                String str4 = (String) arrayList4.get(2);
                if (str4 == null) {
                    throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                }
                tVar.f1915c = str4;
                return tVar;
            case -116:
                ArrayList arrayList5 = (ArrayList) readValue(byteBuffer);
                x xVar = new x();
                String str5 = (String) arrayList5.get(0);
                if (str5 == null) {
                    throw new IllegalStateException("Nonnull field \"description\" is null.");
                }
                xVar.f1925a = str5;
                String str6 = (String) arrayList5.get(1);
                if (str6 == null) {
                    throw new IllegalStateException("Nonnull field \"name\" is null.");
                }
                xVar.f1926b = str6;
                String str7 = (String) arrayList5.get(2);
                if (str7 == null) {
                    throw new IllegalStateException("Nonnull field \"productId\" is null.");
                }
                xVar.f1927c = str7;
                z zVar2 = (z) arrayList5.get(3);
                if (zVar2 == null) {
                    throw new IllegalStateException("Nonnull field \"productType\" is null.");
                }
                xVar.f1928d = zVar2;
                String str8 = (String) arrayList5.get(4);
                if (str8 == null) {
                    throw new IllegalStateException("Nonnull field \"title\" is null.");
                }
                xVar.f1929e = str8;
                xVar.f1930f = (t) arrayList5.get(5);
                xVar.f1931g = (List) arrayList5.get(6);
                return xVar;
            case -115:
                ArrayList arrayList6 = (ArrayList) readValue(byteBuffer);
                y yVar = new y();
                r rVar2 = (r) arrayList6.get(0);
                if (rVar2 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                yVar.f1932a = rVar2;
                List list = (List) arrayList6.get(1);
                if (list == null) {
                    throw new IllegalStateException("Nonnull field \"productDetails\" is null.");
                }
                yVar.f1933b = list;
                return yVar;
            case -114:
                ArrayList arrayList7 = (ArrayList) readValue(byteBuffer);
                C0108l c0108l = new C0108l();
                r rVar3 = (r) arrayList7.get(0);
                if (rVar3 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                c0108l.f1880a = rVar3;
                String str9 = (String) arrayList7.get(1);
                if (str9 == null) {
                    throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
                }
                c0108l.f1881b = str9;
                return c0108l;
            case -113:
                ArrayList arrayList8 = (ArrayList) readValue(byteBuffer);
                o oVar = new o();
                r rVar4 = (r) arrayList8.get(0);
                if (rVar4 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                oVar.f1886a = rVar4;
                String str10 = (String) arrayList8.get(1);
                if (str10 == null) {
                    throw new IllegalStateException("Nonnull field \"countryCode\" is null.");
                }
                oVar.f1887b = str10;
                return oVar;
            case -112:
                ArrayList arrayList9 = (ArrayList) readValue(byteBuffer);
                p pVar = new p();
                String str11 = (String) arrayList9.get(0);
                if (str11 == null) {
                    throw new IllegalStateException("Nonnull field \"product\" is null.");
                }
                pVar.f1888a = str11;
                H h3 = (H) arrayList9.get(1);
                if (h3 == null) {
                    throw new IllegalStateException("Nonnull field \"replacementMode\" is null.");
                }
                pVar.f1889b = h3;
                pVar.f1890c = (String) arrayList9.get(2);
                pVar.f1891d = (String) arrayList9.get(3);
                pVar.f1892e = (String) arrayList9.get(4);
                pVar.f1893f = (String) arrayList9.get(5);
                pVar.f1894g = (String) arrayList9.get(6);
                return pVar;
            case -111:
                ArrayList arrayList10 = (ArrayList) readValue(byteBuffer);
                w wVar = new w();
                Long l6 = (Long) arrayList10.get(0);
                if (l6 == null) {
                    throw new IllegalStateException("Nonnull field \"billingCycleCount\" is null.");
                }
                wVar.f1919a = l6;
                G g6 = (G) arrayList10.get(1);
                if (g6 == null) {
                    throw new IllegalStateException("Nonnull field \"recurrenceMode\" is null.");
                }
                wVar.f1920b = g6;
                Long l7 = (Long) arrayList10.get(2);
                if (l7 == null) {
                    throw new IllegalStateException("Nonnull field \"priceAmountMicros\" is null.");
                }
                wVar.f1921c = l7;
                String str12 = (String) arrayList10.get(3);
                if (str12 == null) {
                    throw new IllegalStateException("Nonnull field \"billingPeriod\" is null.");
                }
                wVar.f1922d = str12;
                String str13 = (String) arrayList10.get(4);
                if (str13 == null) {
                    throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                }
                wVar.f1923e = str13;
                String str14 = (String) arrayList10.get(5);
                if (str14 == null) {
                    throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                }
                wVar.f1924f = str14;
                return wVar;
            case -110:
                ArrayList arrayList11 = (ArrayList) readValue(byteBuffer);
                A a6 = new A();
                a6.f1792a = (String) arrayList11.get(0);
                String str15 = (String) arrayList11.get(1);
                if (str15 == null) {
                    throw new IllegalStateException("Nonnull field \"packageName\" is null.");
                }
                a6.f1793b = str15;
                Long l8 = (Long) arrayList11.get(2);
                if (l8 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseTime\" is null.");
                }
                a6.f1794c = l8;
                String str16 = (String) arrayList11.get(3);
                if (str16 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                a6.f1795d = str16;
                String str17 = (String) arrayList11.get(4);
                if (str17 == null) {
                    throw new IllegalStateException("Nonnull field \"signature\" is null.");
                }
                a6.f1796e = str17;
                List list2 = (List) arrayList11.get(5);
                if (list2 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                a6.f1797f = list2;
                Boolean bool = (Boolean) arrayList11.get(6);
                if (bool == null) {
                    throw new IllegalStateException("Nonnull field \"isAutoRenewing\" is null.");
                }
                a6.f1798g = bool;
                String str18 = (String) arrayList11.get(7);
                if (str18 == null) {
                    throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
                }
                a6.f1799h = str18;
                String str19 = (String) arrayList11.get(8);
                if (str19 == null) {
                    throw new IllegalStateException("Nonnull field \"developerPayload\" is null.");
                }
                a6.f1800i = str19;
                Boolean bool2 = (Boolean) arrayList11.get(9);
                if (bool2 == null) {
                    throw new IllegalStateException("Nonnull field \"isAcknowledged\" is null.");
                }
                a6.f1801j = bool2;
                Long l9 = (Long) arrayList11.get(10);
                if (l9 == null) {
                    throw new IllegalStateException("Nonnull field \"quantity\" is null.");
                }
                a6.f1802k = l9;
                D d6 = (D) arrayList11.get(11);
                if (d6 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseState\" is null.");
                }
                a6.f1803l = d6;
                a6.f1804m = (C0107k) arrayList11.get(12);
                a6.f1805n = (u) arrayList11.get(13);
                return a6;
            case -109:
                ArrayList arrayList12 = (ArrayList) readValue(byteBuffer);
                u uVar = new u();
                List list3 = (List) arrayList12.get(0);
                if (list3 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                uVar.f1916a = list3;
                String str20 = (String) arrayList12.get(1);
                if (str20 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                uVar.f1917b = str20;
                return uVar;
            case -108:
                ArrayList arrayList13 = (ArrayList) readValue(byteBuffer);
                B b7 = new B();
                Long l10 = (Long) arrayList13.get(0);
                if (l10 == null) {
                    throw new IllegalStateException("Nonnull field \"quantity\" is null.");
                }
                b7.f1806a = l10;
                Long l11 = (Long) arrayList13.get(1);
                if (l11 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseTime\" is null.");
                }
                b7.f1807b = l11;
                b7.f1808c = (String) arrayList13.get(2);
                String str21 = (String) arrayList13.get(3);
                if (str21 == null) {
                    throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
                }
                b7.f1809d = str21;
                String str22 = (String) arrayList13.get(4);
                if (str22 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                b7.f1810e = str22;
                String str23 = (String) arrayList13.get(5);
                if (str23 == null) {
                    throw new IllegalStateException("Nonnull field \"signature\" is null.");
                }
                b7.f1811f = str23;
                List list4 = (List) arrayList13.get(6);
                if (list4 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                b7.f1812g = list4;
                return b7;
            case -107:
                ArrayList arrayList14 = (ArrayList) readValue(byteBuffer);
                C c2 = new C();
                r rVar5 = (r) arrayList14.get(0);
                if (rVar5 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                c2.f1813a = rVar5;
                List list5 = (List) arrayList14.get(1);
                if (list5 == null) {
                    throw new IllegalStateException("Nonnull field \"purchases\" is null.");
                }
                c2.f1814b = list5;
                return c2;
            case -106:
                ArrayList arrayList15 = (ArrayList) readValue(byteBuffer);
                E e3 = new E();
                r rVar6 = (r) arrayList15.get(0);
                if (rVar6 == null) {
                    throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
                }
                e3.f1820a = rVar6;
                List list6 = (List) arrayList15.get(1);
                if (list6 == null) {
                    throw new IllegalStateException("Nonnull field \"purchases\" is null.");
                }
                e3.f1821b = list6;
                return e3;
            case -105:
                ArrayList arrayList16 = (ArrayList) readValue(byteBuffer);
                I i2 = new I();
                String str24 = (String) arrayList16.get(0);
                if (str24 == null) {
                    throw new IllegalStateException("Nonnull field \"basePlanId\" is null.");
                }
                i2.f1832a = str24;
                i2.f1833b = (String) arrayList16.get(1);
                String str25 = (String) arrayList16.get(2);
                if (str25 == null) {
                    throw new IllegalStateException("Nonnull field \"offerToken\" is null.");
                }
                i2.f1834c = str25;
                List list7 = (List) arrayList16.get(3);
                if (list7 == null) {
                    throw new IllegalStateException("Nonnull field \"offerTags\" is null.");
                }
                i2.f1835d = list7;
                List list8 = (List) arrayList16.get(4);
                if (list8 == null) {
                    throw new IllegalStateException("Nonnull field \"pricingPhases\" is null.");
                }
                i2.f1836e = list8;
                i2.f1837f = (s) arrayList16.get(5);
                return i2;
            case -104:
                ArrayList arrayList17 = (ArrayList) readValue(byteBuffer);
                J j2 = new J();
                j2.f1838a = (String) arrayList17.get(0);
                String str26 = (String) arrayList17.get(1);
                if (str26 == null) {
                    throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
                }
                j2.f1839b = str26;
                List list9 = (List) arrayList17.get(2);
                if (list9 == null) {
                    throw new IllegalStateException("Nonnull field \"products\" is null.");
                }
                j2.f1840c = list9;
                return j2;
            case -103:
                ArrayList arrayList18 = (ArrayList) readValue(byteBuffer);
                K k3 = new K();
                String str27 = (String) arrayList18.get(0);
                if (str27 == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                k3.f1841a = str27;
                k3.f1842b = (String) arrayList18.get(1);
                z zVar3 = (z) arrayList18.get(2);
                if (zVar3 == null) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                k3.f1843c = zVar3;
                return k3;
            case -102:
                ArrayList arrayList19 = (ArrayList) readValue(byteBuffer);
                s sVar = new s();
                Long l12 = (Long) arrayList19.get(0);
                if (l12 == null) {
                    throw new IllegalStateException("Nonnull field \"commitmentPaymentsCount\" is null.");
                }
                sVar.f1911a = l12;
                Long l13 = (Long) arrayList19.get(1);
                if (l13 == null) {
                    throw new IllegalStateException("Nonnull field \"subsequentCommitmentPaymentsCount\" is null.");
                }
                sVar.f1912b = l13;
                return sVar;
            case -101:
                ArrayList arrayList20 = (ArrayList) readValue(byteBuffer);
                v vVar = new v();
                Boolean bool3 = (Boolean) arrayList20.get(0);
                if (bool3 == null) {
                    throw new IllegalStateException("Nonnull field \"enablePrepaidPlans\" is null.");
                }
                vVar.f1918a = bool3;
                return vVar;
            default:
                return super.readValueOfType(b6, byteBuffer);
        }
    }

    @Override // H2.r
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof q) {
            byteArrayOutputStream.write(129);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((q) obj).f1908a) : null);
            return;
        }
        if (obj instanceof H) {
            byteArrayOutputStream.write(130);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((H) obj).f1831a) : null);
            return;
        }
        if (obj instanceof z) {
            byteArrayOutputStream.write(131);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((z) obj).f1937a) : null);
            return;
        }
        if (obj instanceof EnumC0109m) {
            byteArrayOutputStream.write(132);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((EnumC0109m) obj).f1883a) : null);
            return;
        }
        if (obj instanceof n) {
            byteArrayOutputStream.write(133);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((n) obj).f1885a) : null);
            return;
        }
        if (obj instanceof D) {
            byteArrayOutputStream.write(134);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((D) obj).f1819a) : null);
            return;
        }
        if (obj instanceof G) {
            byteArrayOutputStream.write(135);
            writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((G) obj).f1828a) : null);
            return;
        }
        if (obj instanceof F) {
            byteArrayOutputStream.write(136);
            F f3 = (F) obj;
            f3.getClass();
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(f3.f1822a);
            arrayList.add(f3.f1823b);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof C0107k) {
            byteArrayOutputStream.write(137);
            C0107k c0107k = (C0107k) obj;
            c0107k.getClass();
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(c0107k.f1878a);
            arrayList2.add(c0107k.f1879b);
            writeValue(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof r) {
            byteArrayOutputStream.write(138);
            r rVar = (r) obj;
            rVar.getClass();
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(rVar.f1909a);
            arrayList3.add(rVar.f1910b);
            writeValue(byteArrayOutputStream, arrayList3);
            return;
        }
        if (obj instanceof t) {
            byteArrayOutputStream.write(139);
            t tVar = (t) obj;
            tVar.getClass();
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(tVar.f1913a);
            arrayList4.add(tVar.f1914b);
            arrayList4.add(tVar.f1915c);
            writeValue(byteArrayOutputStream, arrayList4);
            return;
        }
        if (obj instanceof x) {
            byteArrayOutputStream.write(140);
            x xVar = (x) obj;
            xVar.getClass();
            ArrayList arrayList5 = new ArrayList(7);
            arrayList5.add(xVar.f1925a);
            arrayList5.add(xVar.f1926b);
            arrayList5.add(xVar.f1927c);
            arrayList5.add(xVar.f1928d);
            arrayList5.add(xVar.f1929e);
            arrayList5.add(xVar.f1930f);
            arrayList5.add(xVar.f1931g);
            writeValue(byteArrayOutputStream, arrayList5);
            return;
        }
        if (obj instanceof y) {
            byteArrayOutputStream.write(141);
            y yVar = (y) obj;
            yVar.getClass();
            ArrayList arrayList6 = new ArrayList(2);
            arrayList6.add(yVar.f1932a);
            arrayList6.add(yVar.f1933b);
            writeValue(byteArrayOutputStream, arrayList6);
            return;
        }
        if (obj instanceof C0108l) {
            byteArrayOutputStream.write(142);
            C0108l c0108l = (C0108l) obj;
            c0108l.getClass();
            ArrayList arrayList7 = new ArrayList(2);
            arrayList7.add(c0108l.f1880a);
            arrayList7.add(c0108l.f1881b);
            writeValue(byteArrayOutputStream, arrayList7);
            return;
        }
        if (obj instanceof o) {
            byteArrayOutputStream.write(143);
            o oVar = (o) obj;
            oVar.getClass();
            ArrayList arrayList8 = new ArrayList(2);
            arrayList8.add(oVar.f1886a);
            arrayList8.add(oVar.f1887b);
            writeValue(byteArrayOutputStream, arrayList8);
            return;
        }
        if (obj instanceof p) {
            byteArrayOutputStream.write(144);
            p pVar = (p) obj;
            pVar.getClass();
            ArrayList arrayList9 = new ArrayList(7);
            arrayList9.add(pVar.f1888a);
            arrayList9.add(pVar.f1889b);
            arrayList9.add(pVar.f1890c);
            arrayList9.add(pVar.f1891d);
            arrayList9.add(pVar.f1892e);
            arrayList9.add(pVar.f1893f);
            arrayList9.add(pVar.f1894g);
            writeValue(byteArrayOutputStream, arrayList9);
            return;
        }
        if (obj instanceof w) {
            byteArrayOutputStream.write(145);
            w wVar = (w) obj;
            wVar.getClass();
            ArrayList arrayList10 = new ArrayList(6);
            arrayList10.add(wVar.f1919a);
            arrayList10.add(wVar.f1920b);
            arrayList10.add(wVar.f1921c);
            arrayList10.add(wVar.f1922d);
            arrayList10.add(wVar.f1923e);
            arrayList10.add(wVar.f1924f);
            writeValue(byteArrayOutputStream, arrayList10);
            return;
        }
        if (obj instanceof A) {
            byteArrayOutputStream.write(146);
            A a6 = (A) obj;
            a6.getClass();
            ArrayList arrayList11 = new ArrayList(14);
            arrayList11.add(a6.f1792a);
            arrayList11.add(a6.f1793b);
            arrayList11.add(a6.f1794c);
            arrayList11.add(a6.f1795d);
            arrayList11.add(a6.f1796e);
            arrayList11.add(a6.f1797f);
            arrayList11.add(a6.f1798g);
            arrayList11.add(a6.f1799h);
            arrayList11.add(a6.f1800i);
            arrayList11.add(a6.f1801j);
            arrayList11.add(a6.f1802k);
            arrayList11.add(a6.f1803l);
            arrayList11.add(a6.f1804m);
            arrayList11.add(a6.f1805n);
            writeValue(byteArrayOutputStream, arrayList11);
            return;
        }
        if (obj instanceof u) {
            byteArrayOutputStream.write(147);
            u uVar = (u) obj;
            uVar.getClass();
            ArrayList arrayList12 = new ArrayList(2);
            arrayList12.add(uVar.f1916a);
            arrayList12.add(uVar.f1917b);
            writeValue(byteArrayOutputStream, arrayList12);
            return;
        }
        if (obj instanceof B) {
            byteArrayOutputStream.write(148);
            B b6 = (B) obj;
            b6.getClass();
            ArrayList arrayList13 = new ArrayList(7);
            arrayList13.add(b6.f1806a);
            arrayList13.add(b6.f1807b);
            arrayList13.add(b6.f1808c);
            arrayList13.add(b6.f1809d);
            arrayList13.add(b6.f1810e);
            arrayList13.add(b6.f1811f);
            arrayList13.add(b6.f1812g);
            writeValue(byteArrayOutputStream, arrayList13);
            return;
        }
        if (obj instanceof C) {
            byteArrayOutputStream.write(149);
            C c2 = (C) obj;
            c2.getClass();
            ArrayList arrayList14 = new ArrayList(2);
            arrayList14.add(c2.f1813a);
            arrayList14.add(c2.f1814b);
            writeValue(byteArrayOutputStream, arrayList14);
            return;
        }
        if (obj instanceof E) {
            byteArrayOutputStream.write(150);
            E e3 = (E) obj;
            e3.getClass();
            ArrayList arrayList15 = new ArrayList(2);
            arrayList15.add(e3.f1820a);
            arrayList15.add(e3.f1821b);
            writeValue(byteArrayOutputStream, arrayList15);
            return;
        }
        if (obj instanceof I) {
            byteArrayOutputStream.write(151);
            I i2 = (I) obj;
            i2.getClass();
            ArrayList arrayList16 = new ArrayList(6);
            arrayList16.add(i2.f1832a);
            arrayList16.add(i2.f1833b);
            arrayList16.add(i2.f1834c);
            arrayList16.add(i2.f1835d);
            arrayList16.add(i2.f1836e);
            arrayList16.add(i2.f1837f);
            writeValue(byteArrayOutputStream, arrayList16);
            return;
        }
        if (obj instanceof J) {
            byteArrayOutputStream.write(152);
            J j2 = (J) obj;
            j2.getClass();
            ArrayList arrayList17 = new ArrayList(3);
            arrayList17.add(j2.f1838a);
            arrayList17.add(j2.f1839b);
            arrayList17.add(j2.f1840c);
            writeValue(byteArrayOutputStream, arrayList17);
            return;
        }
        if (obj instanceof K) {
            byteArrayOutputStream.write(153);
            K k3 = (K) obj;
            k3.getClass();
            ArrayList arrayList18 = new ArrayList(3);
            arrayList18.add(k3.f1841a);
            arrayList18.add(k3.f1842b);
            arrayList18.add(k3.f1843c);
            writeValue(byteArrayOutputStream, arrayList18);
            return;
        }
        if (obj instanceof s) {
            byteArrayOutputStream.write(154);
            s sVar = (s) obj;
            sVar.getClass();
            ArrayList arrayList19 = new ArrayList(2);
            arrayList19.add(sVar.f1911a);
            arrayList19.add(sVar.f1912b);
            writeValue(byteArrayOutputStream, arrayList19);
            return;
        }
        if (!(obj instanceof v)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(155);
        v vVar = (v) obj;
        vVar.getClass();
        ArrayList arrayList20 = new ArrayList(1);
        arrayList20.add(vVar.f1918a);
        writeValue(byteArrayOutputStream, arrayList20);
    }
}
