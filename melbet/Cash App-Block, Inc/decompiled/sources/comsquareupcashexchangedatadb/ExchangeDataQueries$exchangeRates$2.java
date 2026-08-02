package comsquareupcashexchangedatadb;

import com.squareup.protos.common.CurrencyCode;
import java.util.List;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class ExchangeDataQueries$exchangeRates$2 extends FunctionReferenceImpl implements Function4 {
    public static final ExchangeDataQueries$exchangeRates$2 INSTANCE = new ExchangeDataQueries$exchangeRates$2(4, Exchange_data.class, "<init>", "<init>(Lcom/squareup/protos/common/CurrencyCode;Lcom/squareup/protos/common/CurrencyCode;Ljava/util/List;J)V", 0);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        CurrencyCode currencyCode = (CurrencyCode) obj;
        CurrencyCode currencyCode2 = (CurrencyCode) obj2;
        List list = (List) obj3;
        long longValue = ((Number) obj4).longValue();
        currencyCode.getClass();
        currencyCode2.getClass();
        list.getClass();
        return new Exchange_data(currencyCode, currencyCode2, list, longValue);
    }
}
