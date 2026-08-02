package net.oneformapp.schema;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.util.Log;
import com.fillr.b2;
import com.fillr.e0;
import com.fillr.g0;
import com.fillr.i0;
import com.fillr.l1;
import com.fillr.n1;
import com.fillr.o0;
import com.fillr.o1;
import com.fillr.r1;
import com.fillr.t;
import com.fillr.v1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.history.backend.api.StockActivity;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.marketprices.PriceTick;
import com.squareup.protos.cash.marketprices.service.GetInvestmentEntityHistoricalDataResponse;
import com.squareup.protos.cash.portfolios.BalanceEventList;
import com.squareup.protos.cash.portfolios.BalanceHistory;
import com.squareup.protos.cash.portfolios.BalanceTick;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.common.CurrencyCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.LongRange;

/* loaded from: classes4.dex */
public abstract class SchemaFactory {
    public static final GetPortfoliosHistoricalDataResponse asPortfolioModel(GetInvestmentEntityHistoricalDataResponse getInvestmentEntityHistoricalDataResponse, List list, Function1 function1) {
        Long l;
        Long l2;
        LongRange longRange;
        getInvestmentEntityHistoricalDataResponse.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        Long l3 = getInvestmentEntityHistoricalDataResponse.tick_frequency_ms;
        l3.getClass();
        long j = 1000;
        long longValue = l3.longValue() / 1000;
        Long l4 = getInvestmentEntityHistoricalDataResponse.start_time;
        Long l5 = getInvestmentEntityHistoricalDataResponse.end_time;
        Long l6 = getInvestmentEntityHistoricalDataResponse.tick_frequency_ms;
        CurrencyCode currencyCode = getInvestmentEntityHistoricalDataResponse.base_currency_code;
        List<PriceTick> list2 = getInvestmentEntityHistoricalDataResponse.price_ticks;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (PriceTick priceTick : list2) {
            Long l7 = priceTick.time_sec;
            l7.getClass();
            long longValue2 = l7.longValue();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long j2 = j;
                Object next = it.next();
                long j3 = longValue;
                long j4 = ((StockActivity) next).dateInMillis / j2;
                long j5 = j3 / 2;
                long j6 = longValue2 - j5;
                long j7 = longValue2 + j5;
                if (j7 <= Long.MIN_VALUE) {
                    LongRange.Companion.getClass();
                    longRange = LongRange.EMPTY;
                    l = l7;
                    l2 = l4;
                } else {
                    l = l7;
                    l2 = l4;
                    longRange = new LongRange(j6, j7 - 1);
                }
                if (longRange.first <= j4 && j4 <= longRange.last) {
                    arrayList3.add(next);
                }
                j = j2;
                longValue = j3;
                l4 = l2;
                l7 = l;
            }
            arrayList.removeAll(arrayList3);
            String str = (String) function1.invoke(arrayList3);
            Long l8 = priceTick.price;
            arrayList2.add(new BalanceTick(l8, new BalanceEventList(), l7, l8, (Long) null, str, 80));
            longValue = longValue;
        }
        return new GetPortfoliosHistoricalDataResponse(new BalanceHistory(l4, l6, currencyCode, arrayList2, l5), EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
    }

    public static Schema create(InputStream inputStream) {
        Schema schema = new Schema();
        t a = new e0().a(new StreamSource(inputStream));
        HashMap logSchemaTypes = logSchemaTypes(a);
        HashMap hashMap = (HashMap) schema.elementTypes;
        hashMap.clear();
        hashMap.putAll(logSchemaTypes);
        ArrayList extractElements = extractElements(null, a, a.a(new QName(a.t, "Profile"), false, null), schema, false, false);
        filloutChildren(a, extractElements, schema);
        schema.addRootElements(extractElements);
        schema.mVersion = a.v;
        return schema;
    }

    public static final String displayTextForTickActivities(AndroidStringManager androidStringManager, List list, LocalizedMoneyFormatter.Factory factory) {
        Resources resources = androidStringManager.resources;
        list.getClass();
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size != 1) {
            Object[] objArr = {Integer.valueOf(size)};
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.n_trades)).format(objArr);
            format2.getClass();
            return format2;
        }
        StockActivity stockActivity = (StockActivity) CollectionsKt.first(list);
        String format3 = factory.createRounded().format(stockActivity.amount);
        int ordinal = stockActivity.side.ordinal();
        if (ordinal == 0) {
            format3.getClass();
            resources.getClass();
            String format4 = new MessageFormat(resources.getString(R.string.stock_details_tick_purchase)).format(new Object[]{format3});
            format4.getClass();
            return format4;
        }
        if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        format3.getClass();
        resources.getClass();
        String format5 = new MessageFormat(resources.getString(R.string.stock_details_tick_sale)).format(new Object[]{format3});
        format5.getClass();
        return format5;
    }

    public static ArrayList extractElements(Element element, t tVar, o0 o0Var, Schema schema, boolean z, boolean z2) {
        boolean z3;
        o0 a;
        ArrayList arrayList = new ArrayList();
        b2 b2Var = o0Var.u;
        QName qName = o0Var.t;
        if (b2Var == null && qName != null) {
            String qName2 = qName.toString();
            if (!qName2.equals("Day") && !qName2.equals("Month") && !qName2.equals("Year") && (a = tVar.a(o0Var.t, true, null)) != null) {
                b2Var = a.u;
            }
        }
        if (b2Var != null && b2Var.getClass() == i0.class) {
            i0 i0Var = (i0) b2Var;
            o1 o1Var = i0Var.o;
            if (o1Var == null) {
                g0 g0Var = (g0) i0Var.n.d();
                o1Var = g0Var.k;
                ElementType elementType = (ElementType) ((HashMap) schema.elementTypes).get(g0Var.j.toString());
                if (elementType.f1544type == 9) {
                    ArrayList arrayList2 = elementType.elements;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Element element2 = new Element((Element) it.next());
                        if (z) {
                            element2.actingElement().isFieldArray = true;
                        }
                        if (z2) {
                            element2.actingElement().isMutableKey = true;
                        }
                        arrayList3.add(element2);
                    }
                    arrayList.addAll(arrayList3);
                }
            }
            if (o1Var != null && o1Var.getClass() == r1.class) {
                r1 r1Var = (r1) o1Var;
                Iterator it2 = ((Vector) r1Var.j.a).iterator();
                while (it2.hasNext()) {
                    o0 o0Var2 = (o0) it2.next();
                    Element element3 = new Element(o0Var2);
                    boolean z4 = false;
                    if (r1Var.h != Long.MAX_VALUE || element == null) {
                        z3 = false;
                    } else {
                        element.actingElement().isArrayType = true;
                        element.actingElement().isFieldArray = true;
                        z3 = true;
                    }
                    if (r1Var.k) {
                        element.actingElement().isMutableKey = true;
                        element3.actingElement().isMutableKey = true;
                        z4 = true;
                    }
                    if (z) {
                        z3 = z;
                    }
                    boolean z5 = z2 ? z2 : z4;
                    if (element != null && z) {
                        element3.actingElement().isFieldArray = true;
                        element.actingElement().isFieldArray = true;
                    }
                    if (element != null && z2) {
                        element3.actingElement().isMutableKey = true;
                        element.actingElement().isMutableKey = true;
                    }
                    arrayList.add(element3);
                    element3.actingElement().annotation.getClass();
                    element3.setChildElements(extractElements(element3, tVar, o0Var2, schema, z3, z5));
                }
            }
        }
        if (b2Var != null && b2Var.getClass() == v1.class) {
            ElementType elementType2 = new ElementType(b2Var);
            if (elementType2.f1544type == 2 && element.actingElement().elementTypeName == null) {
                element.actingElement().inlineType = elementType2;
            }
        }
        return arrayList;
    }

    public static void filloutChildren(t tVar, ArrayList arrayList, Schema schema) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            t tVar2 = tVar;
            element.setChildElements(extractElements(element, tVar2, tVar.a(new QName(tVar.t, element.actingElement().xmlElement != null ? element.actingElement().xmlElement.r : null), false, null), schema, false, false));
            tVar = tVar2;
        }
    }

    public static HashMap logSchemaTypes(t tVar) {
        HashMap hashMap = new HashMap();
        n1 n1Var = tVar.o;
        for (Object obj : n1Var.a.keySet()) {
            hashMap.put(obj.toString(), new ElementType((l1) n1Var.a.get(new QName(obj.toString()))));
        }
        return hashMap;
    }

    public static Schema readLocalSchema(Context context) {
        try {
            return create(context.getAssets().open("fillr-schema.xsd"));
        } catch (IOException e) {
            Log.e("net.oneformapp.schema.SchemaFactory", "loadSchema " + e);
            return null;
        }
    }
}
