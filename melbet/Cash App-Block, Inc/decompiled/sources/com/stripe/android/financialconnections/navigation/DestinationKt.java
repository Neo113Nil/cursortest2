package com.stripe.android.financialconnections.navigation;

import android.net.Uri;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.ComposeNavigatorDestinationBuilder;
import com.squareup.cash.ui.CashInsets;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public abstract class DestinationKt {
    public static final ComposableLambdaImpl lambda$1079878273 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(0), false, 1079878273);
    public static final ComposableLambdaImpl lambda$1970641677 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(14), false, 1970641677);

    /* renamed from: lambda$-734344057, reason: not valid java name */
    public static final ComposableLambdaImpl f820lambda$734344057 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(17), false, -734344057);
    public static final ComposableLambdaImpl lambda$1516541222 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(18), false, 1516541222);

    /* renamed from: lambda$-1823417641, reason: not valid java name */
    public static final ComposableLambdaImpl f813lambda$1823417641 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(19), false, -1823417641);

    /* renamed from: lambda$-610989204, reason: not valid java name */
    public static final ComposableLambdaImpl f819lambda$610989204 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(20), false, -610989204);
    public static final ComposableLambdaImpl lambda$633501636 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(21), false, 633501636);

    /* renamed from: lambda$-1053306213, reason: not valid java name */
    public static final ComposableLambdaImpl f811lambda$1053306213 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(22), false, -1053306213);

    /* renamed from: lambda$-258743460, reason: not valid java name */
    public static final ComposableLambdaImpl f815lambda$258743460 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(24), false, -258743460);
    public static final ComposableLambdaImpl lambda$256068251 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(25), false, 256068251);

    /* renamed from: lambda$-1533051144, reason: not valid java name */
    public static final ComposableLambdaImpl f812lambda$1533051144 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(23), false, -1533051144);

    /* renamed from: lambda$-247343796, reason: not valid java name */
    public static final ComposableLambdaImpl f814lambda$247343796 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(26), false, -247343796);
    public static final ComposableLambdaImpl lambda$528080184 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(27), false, 528080184);
    public static final ComposableLambdaImpl lambda$1575816320 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(28), false, 1575816320);
    public static final ComposableLambdaImpl lambda$1350225286 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(29), false, 1350225286);

    /* renamed from: lambda$-404597064, reason: not valid java name */
    public static final ComposableLambdaImpl f817lambda$404597064 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(1), false, -404597064);

    /* renamed from: lambda$-361367997, reason: not valid java name */
    public static final ComposableLambdaImpl f816lambda$361367997 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(2), false, -361367997);

    /* renamed from: lambda$-1040114807, reason: not valid java name */
    public static final ComposableLambdaImpl f810lambda$1040114807 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(3), false, -1040114807);

    /* renamed from: lambda$-513144654, reason: not valid java name */
    public static final ComposableLambdaImpl f818lambda$513144654 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(4), false, -513144654);
    public static final ComposableLambdaImpl lambda$1233481887 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(13), false, 1233481887);
    public static final ComposableLambdaImpl lambda$1251583312 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(15), false, 1251583312);
    public static final ComposableLambdaImpl lambda$554929450 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(16), false, 554929450);

    public static final String appendParamValues(String str, Map map) {
        str.getClass();
        map.getClass();
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                buildUpon.appendQueryParameter(str2, str3);
            }
        }
        String uri = buildUpon.build().toString();
        uri.getClass();
        return uri;
    }

    public static void bottomSheet$default(NavGraphBuilder navGraphBuilder, Destination destination) {
        EmptyList emptyList = EmptyList.INSTANCE;
        navGraphBuilder.getClass();
        destination.getClass();
        emptyList.getClass();
        String fullRoute = destination.getFullRoute();
        ArrayList arrayList = destination.arguments;
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new DestinationKt$$ExternalSyntheticLambda0(destination, 1), true, 2065068697);
        fullRoute.getClass();
        arrayList.getClass();
        NavigatorProvider navigatorProvider = navGraphBuilder.provider;
        navigatorProvider.getClass();
        BottomSheetNavigator.Destination destination2 = new BottomSheetNavigator.Destination((BottomSheetNavigator) navigatorProvider.getNavigator(CashInsets.Companion.getNameForNavigator$navigation_common_release(BottomSheetNavigator.class)), composableLambdaImpl);
        destination2.setRoute(fullRoute);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            destination2.addArgument(namedNavArgument.name, namedNavArgument.argument);
        }
        Iterator<E> it2 = emptyList.iterator();
        while (it2.hasNext()) {
            destination2.addDeepLink((NavDeepLink) it2.next());
        }
        navGraphBuilder.destinations.add(destination2);
    }

    public static void composable$default(NavGraphBuilder navGraphBuilder, Destination destination) {
        EmptyList<NavDeepLink> emptyList = EmptyList.INSTANCE;
        navGraphBuilder.getClass();
        destination.getClass();
        emptyList.getClass();
        String fullRoute = destination.getFullRoute();
        ArrayList arrayList = destination.arguments;
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new DestinationKt$$ExternalSyntheticLambda0(destination, 0), true, 1589095604);
        NavigatorProvider navigatorProvider = navGraphBuilder.provider;
        navigatorProvider.getClass();
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navigatorProvider.getNavigator(CashInsets.Companion.getNameForNavigator$navigation_common_release(ComposeNavigator.class)), fullRoute, composableLambdaImpl);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            ((LinkedHashMap) composeNavigatorDestinationBuilder.lastChild).put(namedNavArgument.name, namedNavArgument.argument);
        }
        for (NavDeepLink navDeepLink : emptyList) {
            navDeepLink.getClass();
            ((ArrayList) composeNavigatorDestinationBuilder.prev).add(navDeepLink);
        }
        navGraphBuilder.destinations.add(composeNavigatorDestinationBuilder.build());
    }
}
