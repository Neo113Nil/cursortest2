package com.squareup.cash.util.money;

import android.os.Debug;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.unit.Dp;
import com.fillr.browsersdk.Fillr;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.mooncake.compose_ui.ComposeColorPaletteKt;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.storage.ClearAppUserDataOnNextLaunch;
import com.squareup.protos.cash.cdpproxy.api.ProxyAppendedFields$Companion$ADAPTER$1;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan$Companion$ADAPTER$1;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class Moneys$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Moneys$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object failure;
        ProtoAdapter propertiesAdapter_delegate$lambda$0;
        ProtoAdapter sub_journey_outcomesAdapter_delegate$lambda$0;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                Locale[] availableLocales = Locale.getAvailableLocales();
                availableLocales.getClass();
                ArrayList arrayList = new ArrayList();
                for (Locale locale : availableLocales) {
                    try {
                        Result.Companion companion = Result.Companion;
                        failure = Currency.getInstance(locale);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    boolean z2 = failure instanceof Result.Failure;
                    Object obj = failure;
                    if (z2) {
                        obj = null;
                    }
                    Currency currency = (Currency) obj;
                    Pair pair = currency != null ? new Pair(currency, locale) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    linkedHashMap.put(pair2.first, pair2.second);
                }
                return linkedHashMap;
            case 1:
                return DefaultSizes.INSTANCE;
            case 2:
                return new Dp(16.0f);
            case 3:
                return Unit.INSTANCE;
            case 4:
                return Unit.INSTANCE;
            case 5:
                return new CashComposeInsets();
            case 6:
                return new LinkedHashSet();
            case 7:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = UiContainerKt.LocalLegacySheetScope;
                return null;
            case 8:
                return Fillr.getInstance();
            case 9:
                return Long.valueOf(System.currentTimeMillis());
            case 10:
                return new ClearAppUserDataOnNextLaunch(z ? 1 : 0);
            case 11:
                Locale forLanguageTag = Locale.forLanguageTag("en-US");
                forLanguageTag.getClass();
                return forLanguageTag;
            case 12:
                Locale forLanguageTag2 = Locale.forLanguageTag("en-US");
                forLanguageTag2.getClass();
                return forLanguageTag2;
            case 13:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ComposeColorPaletteKt.LocalColorPaletteProvided;
                return Boolean.FALSE;
            case 14:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ComposeColorPaletteKt.LocalColorPaletteProvided;
                return null;
            case 15:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = ComposeMooncakeThemeKt.LocalTextColor;
                return null;
            case 16:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal5 = MooncakeTypographyKt.LocalTypography;
                return null;
            case 17:
                return Boolean.valueOf(Debug.isDebuggerConnected());
            case 18:
                return EmptySet.INSTANCE;
            case 19:
                return EmptyList.INSTANCE;
            case 20:
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new HashMapSerializer(stringSerializer, stringSerializer, 1);
            case 21:
                propertiesAdapter_delegate$lambda$0 = ProxyAppendedFields$Companion$ADAPTER$1.propertiesAdapter_delegate$lambda$0();
                return propertiesAdapter_delegate$lambda$0;
            case 22:
                ProtoAdapter.Companion companion3 = ProtoAdapter.Companion;
                ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                companion3.getClass();
                return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter);
            case 23:
                sub_journey_outcomesAdapter_delegate$lambda$0 = ScenarioPlan$Companion$ADAPTER$1.sub_journey_outcomesAdapter_delegate$lambda$0();
                return sub_journey_outcomesAdapter_delegate$lambda$0;
            case 24:
                return new Regex("(payments(?:/model)?|deposit|transfers|receipts)/[\\w$-]*(?::[\\w-]*[a-zA-Z][\\w-]*)*(/.*)?");
            case 25:
                return new Regex("(\\d{1,3}\\.){3}\\d{1,3}");
            case 26:
                return new Regex("([a-fA-F0-9]{1,4}:){7}[a-fA-F0-9]{1,4}");
            case 27:
                return new Regex("(?<=bitcoin\\/(?:invoice\\/)?(?:\\$CASHTAG|refresh-invoice)\\/).*?((?=(?:[\\/:\\?\\s#]|$)))");
            case 28:
                return new Regex("(?<=address=)[^&]+");
            default:
                return new Regex("geo:[\\d.-]+,[\\d.-]+(\\?q=[^&]+)?|geo:0,0\\?q=[^&]+");
        }
    }
}
