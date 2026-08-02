package okhttp3.internal.platform;

import android.content.Context;
import com.squareup.cash.investing.viewmodels.holdings.Holding;
import com.squareup.protos.cash.marketdata.model.HoldingsDetails;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityTradability;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes7.dex */
public abstract class AndroidPlatform extends Platform {
    public static final /* synthetic */ int $r8$clinit = 0;

    public abstract class Companion {
        public static void getTag() {
            int i = AndroidPlatform.$r8$clinit;
        }

        public static final boolean hasPermission(Context context, String str) {
            context.getClass();
            return Strings.checkSelfPermission(context, str) == 0;
        }

        public static void isSupported() {
            int i = AndroidPlatform.$r8$clinit;
        }

        public static final ArrayList toViewModel(List list) {
            list.getClass();
            List<HoldingsDetails.Holding> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (HoldingsDetails.Holding holding : list2) {
                String str = holding.token;
                String str2 = holding.dark_icon_url;
                String str3 = holding.icon_url;
                Image image = (str3 == null && str2 == null) ? null : new Image(str3, str2, 4);
                String str4 = holding.name;
                str4.getClass();
                String str5 = holding.symbol;
                holding.weight.getClass();
                arrayList.add(new Holding(str, image, str4, str5, (r7.longValue() / 100.0f) + "%", holding.tradability != InvestmentEntityTradability.UNTRADABLE));
            }
            return arrayList;
        }
    }
}
