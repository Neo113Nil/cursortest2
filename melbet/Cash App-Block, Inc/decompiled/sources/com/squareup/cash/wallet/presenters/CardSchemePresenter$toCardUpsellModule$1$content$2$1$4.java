package com.squareup.cash.wallet.presenters;

import androidx.compose.runtime.ProduceStateScope;
import app.cash.broadway.ui.LifecyclesKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.cash.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes7.dex */
public final class CardSchemePresenter$toCardUpsellModule$1$content$2$1$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProduceStateScope $$this$produceState;
    public final /* synthetic */ CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent $parentAsKidContent;
    public final /* synthetic */ CardSchemeViewModel.Module.Accessory.Button $primaryButton;
    public final /* synthetic */ CardModule.HeroNullStateModule.UnifiedCardHomeNUX $unifiedCardHomeNUX;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ CardSchemePresenter this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookletTile.ContentType.values().length];
            try {
                iArr[BookletTile.ContentType.CONTENT_TYPE_STATIC_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookletTile.ContentType.CONTENT_TYPE_GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookletTile.ContentType.CONTENT_TYPE_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSchemePresenter$toCardUpsellModule$1$content$2$1$4(CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent parentAsKidContent, CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX, ProduceStateScope produceStateScope, CardSchemePresenter cardSchemePresenter, CardSchemeViewModel.Module.Accessory.Button button, Continuation continuation) {
        super(2, continuation);
        this.$parentAsKidContent = parentAsKidContent;
        this.$unifiedCardHomeNUX = unifiedCardHomeNUX;
        this.$$this$produceState = produceStateScope;
        this.this$0 = cardSchemePresenter;
        this.$primaryButton = button;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardSchemePresenter$toCardUpsellModule$1$content$2$1$4 cardSchemePresenter$toCardUpsellModule$1$content$2$1$4 = new CardSchemePresenter$toCardUpsellModule$1$content$2$1$4(this.$parentAsKidContent, this.$unifiedCardHomeNUX, this.$$this$produceState, this.this$0, this.$primaryButton, continuation);
        cardSchemePresenter$toCardUpsellModule$1$content$2$1$4.L$0 = obj;
        return cardSchemePresenter$toCardUpsellModule$1$content$2$1$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardSchemePresenter$toCardUpsellModule$1$content$2$1$4) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.squareup.cash.wallet.viewmodels.CardSchemeViewModel$CardNullStateBooklet$Tile] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LocalizedString localizedString;
        ListUnordered listUnordered;
        List<BookletTile> list;
        LocalizedString localizedString2;
        String str;
        List list2;
        List list3;
        CardSchemeViewModel.CardNullStateBooklet.Grid grid;
        List<ListUnordered.ListItem> list4;
        CardSchemeViewModel.CardNullStateBooklet.BenefitItem benefitItem;
        Icons icons;
        Lazy lazy;
        boolean z;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content content = this.$unifiedCardHomeNUX.content;
        CardSchemePresenter cardSchemePresenter = this.this$0;
        ErrorReporter errorReporter = cardSchemePresenter.errorReporter;
        Lazy lazy2 = cardSchemePresenter.isCardGridEnabled$delegate;
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        List list5 = (List) pair.first;
        Disclosure disclosure = (Disclosure) pair.second;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent parentAsKidContent = this.$parentAsKidContent;
        if (parentAsKidContent == null || (localizedString = parentAsKidContent.title) == null) {
            localizedString = content != null ? content.title : null;
        }
        if (parentAsKidContent == null || (listUnordered = parentAsKidContent.benefits_list) == null) {
            listUnordered = content != null ? content.benefits_list : null;
        }
        if (parentAsKidContent == null || (list = parentAsKidContent.booklet_tiles) == null) {
            list = content != null ? content.booklet_tiles : null;
        }
        if (parentAsKidContent == null || (localizedString2 = parentAsKidContent.body) == null) {
            localizedString2 = content != null ? content.body : null;
        }
        boolean booleanValue = ((Boolean) lazy2.getValue()).booleanValue();
        List list6 = list5;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
        Iterator it = list6.iterator();
        while (it.hasNext()) {
            CardSchemeViewModel.Module.HeroCardDetails defaultCardDetails = LifecyclesKt.toDefaultCardDetails((CardTheme) it.next());
            boolean z2 = cardSchemePresenter.supportsFilament;
            if (((Boolean) lazy2.getValue()).booleanValue()) {
                lazy = lazy2;
            } else {
                lazy = lazy2;
                if (!cardSchemePresenter.isFilamentDisabled) {
                    z = false;
                    Iterator it2 = it;
                    arrayList.add(new CardSchemeViewModel.Module.HeroCard(defaultCardDetails, z2, z, 78));
                    lazy2 = lazy;
                    it = it2;
                }
            }
            z = true;
            Iterator it22 = it;
            arrayList.add(new CardSchemeViewModel.Module.HeroCard(defaultCardDetails, z2, z, 78));
            lazy2 = lazy;
            it = it22;
        }
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        if (localizedString != null) {
            str = StringsKt.translated(localizedString);
        } else {
            errorReporter.report(new CardTabError(new NullPointerException("Card NUX booklet title is missing, default used instead")), defaultSamplingStrategy);
            str = cardSchemePresenter.stringManager.get(R.string.card_null_state_booklet_default_title);
        }
        String translated = localizedString2 != null ? StringsKt.translated(localizedString2) : null;
        if (listUnordered == null || (list4 = listUnordered.items) == null) {
            list2 = EmptyList.INSTANCE;
        } else {
            list2 = new ArrayList();
            for (ListUnordered.ListItem listItem : list4) {
                LocalizedString localizedString3 = listItem.label;
                if (localizedString3 != null) {
                    String translated2 = StringsKt.translated(localizedString3);
                    Icon icon = listItem.icon;
                    if (icon != null) {
                        zzd zzdVar = Icons.Companion;
                        String str2 = CardSchemePresenter.token(icon, "ts1Zo2");
                        Icons.Companion.getClass();
                        icons = zzd.get(str2);
                    } else {
                        icons = null;
                    }
                    benefitItem = new CardSchemeViewModel.CardNullStateBooklet.BenefitItem(icons, translated2);
                } else {
                    benefitItem = null;
                }
                if (benefitItem != null) {
                    list2.add(benefitItem);
                }
            }
        }
        CardSchemeViewModel.Module.Disclosure disclosure2 = (!(content != null ? Intrinsics.areEqual(content.show_disclosures, Boolean.TRUE) : false) || disclosure == null) ? null : new CardSchemeViewModel.Module.Disclosure(disclosure.text, false);
        if (list != null) {
            list3 = new ArrayList();
            for (BookletTile bookletTile : list) {
                BookletTile.ContentType contentType = bookletTile.content_type;
                int i = contentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        BookletTile.StaticContent staticContent = bookletTile.static_content;
                        if (staticContent != null) {
                            Image image = staticContent.hero_image;
                            image.getClass();
                            LocalizedString localizedString4 = staticContent.title_text;
                            localizedString4.getClass();
                            String translated3 = StringsKt.translated(localizedString4);
                            LocalizedString localizedString5 = staticContent.detail_text;
                            localizedString5.getClass();
                            grid = new CardSchemeViewModel.CardNullStateBooklet.Tile(image, translated3, StringsKt.translated(localizedString5));
                        }
                    } else if (i == 2) {
                        BookletTile.GridContent gridContent = bookletTile.grid_content;
                        if (gridContent != null) {
                            LocalizedString localizedString6 = gridContent.title_text;
                            localizedString6.getClass();
                            String translated4 = StringsKt.translated(localizedString6);
                            List<BookletTile.GridContent.GridItem> list7 = gridContent.grid_items;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                            for (BookletTile.GridContent.GridItem gridItem : list7) {
                                LocalizedString localizedString7 = gridItem.title_text;
                                localizedString7.getClass();
                                String translated5 = StringsKt.translated(localizedString7);
                                LocalizedString localizedString8 = gridItem.detail_text;
                                localizedString8.getClass();
                                String translated6 = StringsKt.translated(localizedString8);
                                zzd zzdVar2 = Icons.Companion;
                                String str3 = CardSchemePresenter.token(gridItem.icon, "ts1Zo2");
                                zzdVar2.getClass();
                                arrayList2.add(new CardSchemeViewModel.CardNullStateBooklet.Grid.Item(zzd.get(str3), translated5, translated6));
                            }
                            grid = new CardSchemeViewModel.CardNullStateBooklet.Grid(translated4, arrayList2);
                        }
                    } else if (i != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (grid == null) {
                        list3.add(grid);
                    }
                }
                grid = null;
                if (grid == null) {
                }
            }
        } else {
            errorReporter.report(new CardTabError(new NullPointerException("Card NUX booklet tiles are missing")), defaultSamplingStrategy);
            list3 = EmptyList.INSTANCE;
        }
        this.$$this$produceState.setValue(new CardSchemeViewModel.CardNullStateBooklet.Content(arrayList, booleanValue, str, translated, list2, list3, this.$primaryButton, disclosure2));
        return Unit.INSTANCE;
    }
}
