package com.squareup.cash.work.views.menu;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.window.PopupProperties;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.presenters.internal.LocationsKt;
import app.cash.local.primitives.Category;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.OrderingMode;
import app.cash.local.viewmodels.LocalBrandLocationMenuContentModel;
import app.cash.local.viewmodels.LocationStatus;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tax.applet.views.TaxesAppletTile$$ExternalSyntheticLambda9;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda7;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public abstract class ExpandableContentKt {
    /* renamed from: ExpandableContent-0aeBpQE, reason: not valid java name */
    public static final void m3808ExpandableContent0aeBpQE(ListBuilder listBuilder, boolean z, float f, Function0 function0, Composer composer, int i) {
        long j;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1037432612);
        int i2 = 4;
        int i3 = i | (gapComposer.changedInstance(listBuilder) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(34.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(new IntSize(0L));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new HeroTagViewKt$$ExternalSyntheticLambda7(11, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue2);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(8.0f) & BodyPartID.bodyIdMax);
            if (Strings.getColors(gapComposer).isLight) {
                gapComposer.startReplaceGroup(-428903614);
                j = Strings.getColors(gapComposer).semantic.background.f1047app;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-428838049);
                j = Strings.getColors(gapComposer).semantic.background.subtle;
                gapComposer.end(false);
            }
            AndroidMenu_androidKt.m516DropdownMenuIlH_yew(z, function0, onSizeChanged, floatToRawIntBits, null, new PopupProperties(true, 16), m340RoundedCornerShape0680j_4, j, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1121290359, new MusicViewKt$$ExternalSyntheticLambda4(listBuilder, f, function0, i2), gapComposer), gapComposer, ((i3 >> 3) & 14) | 197040, 1808);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxesAppletTile$$ExternalSyntheticLambda9(listBuilder, z, f, function0, i);
        }
    }

    public static final LocationStatus currentStatusForLocationRow(Location location, AndroidStringManager androidStringManager, AndroidClock androidClock, LocalFulfillmentType localFulfillmentType) {
        OrderingMode orderingMode = location.getOrderingMode();
        if (orderingMode instanceof OrderingMode.Unavailable) {
            OrderingMode.Unavailable unavailable = (OrderingMode.Unavailable) orderingMode;
            boolean z = unavailable.isPermanent;
            String str = unavailable.message;
            return z ? new LocationStatus.Closed(str, null) : new LocationStatus.TemporarilyDisabled(str);
        }
        if (orderingMode instanceof OrderingMode.Available) {
            return location.openState(localFulfillmentType) instanceof Location.OpenState.Open24Hours ? new LocationStatus.Open(androidStringManager.get(R.string.local_presenters_status_open_24_hours), (String) null, 6) : LocationsKt.currentlyOpen(androidClock, location.openState(localFulfillmentType)) ? new LocationStatus.Open(androidStringManager.get(R.string.local_presenters_status_open), LocationsKt.nextOpeningOrClosing(location, true, androidClock, androidStringManager, localFulfillmentType), 4) : new LocationStatus.Closed(androidStringManager.get(R.string.local_presenters_status_closed), LocationsKt.nextOpeningOrClosing(location, false, androidClock, androidStringManager, localFulfillmentType));
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final LocationMenu.Menu firstAvailableOrDefault(List list) {
        Object obj;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            MenuHours menuHours = ((LocationMenu.Menu) obj).hours;
            if (menuHours != null && menuHours.isAvailableNow()) {
                break;
            }
        }
        LocationMenu.Menu menu = (LocationMenu.Menu) obj;
        return menu == null ? (LocationMenu.Menu) CollectionsKt.firstOrNull(list) : menu;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewCashCardStylePicker.deepLinkSpecs;
    }

    public static final LocalBrandLocationMenuContentModel.Entry toViewModelCategory(Category category, LocationMenu locationMenu) {
        category.getClass();
        ArrayList arrayList = category.items;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (locationMenu.m1244menuItemOrNullGvMOdU0(((MenuItemToken) it.next()).value) != null) {
                return new LocalBrandLocationMenuContentModel.Entry(category.token, category.image, category.name, category.menuHours);
            }
        }
        return null;
    }

    public static final LocalBrandLocationMenuContentModel.Menu toViewModelMenu(LocationMenu.Menu menu, LocationMenu locationMenu, List list) {
        list.getClass();
        String str = menu.token;
        String str2 = menu.name;
        MenuHours menuHours = menu.hours;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocalBrandLocationMenuContentModel.Entry viewModelCategory = toViewModelCategory((Category) it.next(), locationMenu);
            if (viewModelCategory != null) {
                arrayList.add(viewModelCategory);
            }
        }
        return new LocalBrandLocationMenuContentModel.Menu(menuHours, str, str2, arrayList);
    }
}
