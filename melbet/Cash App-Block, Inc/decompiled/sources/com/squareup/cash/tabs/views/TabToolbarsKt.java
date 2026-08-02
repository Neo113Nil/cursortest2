package com.squareup.cash.tabs.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.datastore.core.SimpleActor;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda22;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.AvatarSizeOverride;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.tabs.viewmodels.TabToolbarBadgeViewModel$Dot;
import com.squareup.cash.tabs.viewmodels.TabToolbarBadgeViewModel$Text;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import com.stripe.android.model.parsers.WalletJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class TabToolbarsKt {
    public static final AvatarSizeOverride DEFAULT_AVATAR_SIZE;
    public static final AvatarSizeOverride SPACES_AVATAR_SIZE;
    public static final long LightToolbarActionBackground = ColorKt.Color(4294506744L);
    public static final float TabToolbarHeight = 52.0f;

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TabToolbarInternalViewModel.StartButtonType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TabToolbarInternalViewModel.StartButtonType startButtonType = TabToolbarInternalViewModel.StartButtonType.NONE;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TabToolbarInternalViewModel.StartButtonType startButtonType2 = TabToolbarInternalViewModel.StartButtonType.NONE;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[TabToolbarInternalViewModel.ButtonBackgroundType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TabToolbarInternalViewModel.ToolbarButton.Id.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TabToolbarInternalViewModel.ToolbarButton.Id id = TabToolbarInternalViewModel.ToolbarButton.Id.Search;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TabToolbarInternalViewModel.ToolbarButton.Id id2 = TabToolbarInternalViewModel.ToolbarButton.Id.Search;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TabToolbarInternalViewModel.ToolbarButton.Id id3 = TabToolbarInternalViewModel.ToolbarButton.Id.Search;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TabToolbarInternalViewModel.ToolbarButton.Id id4 = TabToolbarInternalViewModel.ToolbarButton.Id.Search;
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        AvatarSize avatarSize = AvatarSize.Size32;
        DEFAULT_AVATAR_SIZE = new AvatarSizeOverride(avatarSize.size, avatarSize.iconSize, avatarSize.textSize, 6.0f, 18.0f);
        SPACES_AVATAR_SIZE = new AvatarSizeOverride(44.0f, 16.0f, 48, Room.getSp(16));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ImageButton(final TitleBarActionScope titleBarActionScope, final TabToolbarInternalViewModel.ImageButton imageButton, final Function1 function1, final ElementBoundsRegistry elementBoundsRegistry, final SimpleActor simpleActor, final MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig, final SharedToolbarSwipeScope sharedToolbarSwipeScope, final boolean z, boolean z2, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1552089638);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(titleBarActionScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(imageButton) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(elementBoundsRegistry) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? gapComposer2.changed(simpleActor) : gapComposer2.changedInstance(simpleActor) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer2.changedInstance(moneybotToolbarSharedElementConfig) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer2.changed(sharedToolbarSwipeScope) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer2.changed(z) ? 8388608 : 4194304;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            z3 = z2;
            i3 |= gapComposer2.changed(z3) ? 67108864 : 33554432;
            i4 = i3;
            if (gapComposer2.shouldExecute(i4 & 1, (38347923 & i4) == 38347922)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
            } else {
                final boolean z4 = i5 != 0 ? false : z3;
                z3 = z4;
                gapComposer = gapComposer2;
                m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope, toolbarActionBackground(imageButton.id, gapComposer2), Expect_jvmKt.rememberComposableLambda(-914920922, new Function4() { // from class: com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda14
                    /* JADX WARN: Removed duplicated region for block: B:107:0x02a2  */
                    /* JADX WARN: Removed duplicated region for block: B:122:0x026c  */
                    /* JADX WARN: Removed duplicated region for block: B:129:0x021f  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x0203  */
                    /* JADX WARN: Removed duplicated region for block: B:91:0x0250  */
                    /* JADX WARN: Removed duplicated region for block: B:99:0x0278  */
                    @Override // kotlin.jvm.functions.Function4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i6;
                        TabToolbarInternalViewModel.ToolbarButton.Id id;
                        Icons icons;
                        Icons icons2;
                        int ordinal;
                        int i7;
                        boolean changed;
                        Object rememberedValue;
                        int ordinal2;
                        Modifier.Companion companion;
                        ElementBoundsRegistry.Element element;
                        Modifier modifier;
                        ElementBoundsRegistry.Element element2;
                        long j;
                        Modifier sharedBounds$default;
                        Modifier modifier2 = (Modifier) obj;
                        SwipeControlStyle swipeControlStyle = (SwipeControlStyle) obj2;
                        Composer composer2 = (Composer) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        modifier2.getClass();
                        if ((intValue & 6) == 0) {
                            i6 = (((GapComposer) composer2).changed(modifier2) ? 4 : 2) | intValue;
                        } else {
                            i6 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i6 |= ((GapComposer) composer2).changed(swipeControlStyle) ? 32 : 16;
                        }
                        GapComposer gapComposer3 = (GapComposer) composer2;
                        if (gapComposer3.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
                            gapComposer3.startReplaceGroup(1229344147);
                            gapComposer3.startReplaceGroup(1229327743);
                            gapComposer3.startReplaceGroup(1229322547);
                            gapComposer3.startReplaceGroup(1229318118);
                            gapComposer3.startReplaceGroup(1229307071);
                            TabToolbarInternalViewModel.ImageButton imageButton2 = TabToolbarInternalViewModel.ImageButton.this;
                            TabToolbarInternalViewModel.ToolbarButton.Id id2 = imageButton2.id;
                            int i8 = imageButton2.iconResId;
                            TabToolbarInternalViewModel.ToolbarButton.Id id3 = TabToolbarInternalViewModel.ToolbarButton.Id.Moneybot;
                            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                            SharedToolbarSwipeScope sharedToolbarSwipeScope2 = sharedToolbarSwipeScope;
                            if (id2 == id3) {
                                modifier2 = modifier2.then(TabToolbarsKt.reportTuckCorner(companion2, sharedToolbarSwipeScope2 != null ? sharedToolbarSwipeScope2.tuckTargets : null, true));
                            }
                            TabToolbarInternalViewModel.ToolbarButton.Id id4 = TabToolbarInternalViewModel.ToolbarButton.Id.MoneybotOverflowMenu;
                            if (id2 == id4) {
                                modifier2 = modifier2.then(TabToolbarsKt.reportTuckCorner(companion2, sharedToolbarSwipeScope2 != null ? sharedToolbarSwipeScope2.tuckTargets : null, false));
                            }
                            if (z4) {
                                modifier2 = modifier2.then(TabToolbarsKt.swipeToolbarControl(companion2, sharedToolbarSwipeScope2, false, gapComposer3, 390));
                            }
                            gapComposer3.end(false);
                            if (id2 == id3) {
                                id = id4;
                                modifier2 = modifier2.then(TabToolbarsKt.swipeToolbarEntryPoint(companion2, sharedToolbarSwipeScope2, SwipeToolbarCorner.Leading, gapComposer3, 390, 0));
                            } else {
                                id = id4;
                            }
                            gapComposer3.end(false);
                            if (id2 == id) {
                                modifier2 = modifier2.then(TabToolbarsKt.swipeToolbarEntryPoint(companion2, sharedToolbarSwipeScope2, SwipeToolbarCorner.Trailing, gapComposer3, 390, 0));
                            }
                            gapComposer3.end(false);
                            if (id2 == id) {
                                MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig2 = moneybotToolbarSharedElementConfig;
                                if (moneybotToolbarSharedElementConfig2 == null) {
                                    gapComposer3.startReplaceGroup(-1127353142);
                                    gapComposer3.end(false);
                                    sharedBounds$default = null;
                                } else {
                                    gapComposer3.startReplaceGroup(-1127353141);
                                    gapComposer3.startReplaceGroup(1487655279);
                                    SharedTransitionScope sharedTransitionScope = moneybotToolbarSharedElementConfig2.sharedTransitionScope;
                                    SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope.rememberSharedContentState(moneybotToolbarSharedElementConfig2.trailingButtonKey, gapComposer3, 0);
                                    AnimatedVisibilityScope animatedVisibilityScope = moneybotToolbarSharedElementConfig2.animatedVisibilityScope;
                                    SharedTransitionScope.ResizeMode.Companion.getClass();
                                    sharedBounds$default = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, companion2, rememberSharedContentState, animatedVisibilityScope, null, null, null, RemeasureImpl.INSTANCE, null, 988);
                                    gapComposer3.end(false);
                                    gapComposer3.end(false);
                                }
                                if (sharedBounds$default == null) {
                                    sharedBounds$default = companion2;
                                }
                                modifier2 = modifier2.then(sharedBounds$default);
                            }
                            gapComposer3.end(false);
                            TabToolbarInternalViewModel.ButtonBackgroundType buttonBackgroundType = imageButton2.backgroundType;
                            if (buttonBackgroundType != TabToolbarInternalViewModel.ButtonBackgroundType.NONE) {
                                if (TabToolbarsKt.WhenMappings.$EnumSwitchMapping$1[buttonBackgroundType.ordinal()] == 1) {
                                    gapComposer3.startReplaceGroup(1271694399);
                                    Color color = swipeControlStyle != null ? new Color(swipeControlStyle.scrimColor) : null;
                                    if (color == null) {
                                        gapComposer3.startReplaceGroup(-928807406);
                                        j = Color.m675copywmQWz5c$default(0.08f, ((Color) gapComposer3.consume(ArcadeThemeKt.LocalIconColor)).value, 14);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-928808925);
                                        gapComposer3.end(false);
                                        j = color.value;
                                    }
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(1271784578);
                                    Color color2 = swipeControlStyle != null ? new Color(swipeControlStyle.solidColor) : null;
                                    if (color2 == null) {
                                        gapComposer3.startReplaceGroup(-928805210);
                                        j = TabToolbarsKt.toolbarActionBackground(id2, gapComposer3);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-928806016);
                                        gapComposer3.end(false);
                                        j = color2.value;
                                    }
                                    gapComposer3.end(false);
                                }
                                modifier2 = modifier2.then(ClipKt.drawBehind(companion2, new c7$$ExternalSyntheticLambda6(j, 20)));
                            }
                            Modifier modifier3 = modifier2;
                            gapComposer3.end(false);
                            int ordinal3 = id2.ordinal();
                            if (ordinal3 == 0) {
                                icons = Icons.NavigationActivity;
                            } else if (ordinal3 == 1) {
                                icons = Icons.NavigationDiscover;
                            } else if (ordinal3 == 2) {
                                icons = Icons.NavigationMoneybotAltRight;
                                if (i8 != R.drawable.icon_navigation_moneybot_alt_right) {
                                    icons = Icons.NavigationMoneybotAlt;
                                    if (i8 != R.drawable.icon_navigation_moneybot_alt) {
                                        if (i8 == 0) {
                                            icons = Icons.NavigationMoneybot;
                                        } else {
                                            icons2 = null;
                                            ordinal = id2.ordinal();
                                            if (ordinal != 0) {
                                                i7 = R.string.tab_menu_activity;
                                            } else if (ordinal == 1) {
                                                i7 = R.string.tab_menu_search;
                                            } else if (ordinal == 2) {
                                                i7 = R.string.tab_menu_moneybot;
                                            } else if (ordinal == 3) {
                                                i7 = R.string.tab_menu_qr;
                                            } else {
                                                if (ordinal != 4) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                i7 = R.string.tab_menu_moneybot_overflow;
                                            }
                                            String stringResource = Room.stringResource(gapComposer3, i7);
                                            Function1 function12 = function1;
                                            changed = gapComposer3.changed(function12) | gapComposer3.changedInstance(imageButton2);
                                            rememberedValue = gapComposer3.rememberedValue();
                                            if (!changed || rememberedValue == Composer.Companion.Empty) {
                                                rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda0(15, function12, imageButton2);
                                                gapComposer3.updateRememberedValue(rememberedValue);
                                            }
                                            Function0 function0 = (Function0) rememberedValue;
                                            ordinal2 = id2.ordinal();
                                            if (ordinal2 == 0) {
                                                if (ordinal2 == 1) {
                                                    element2 = ElementBoundsRegistry.Element.ToolbarDiscoverMenuItem;
                                                } else if (ordinal2 == 2) {
                                                    element2 = ElementBoundsRegistry.Element.ToolbarMoneybotMenuItem;
                                                } else if (ordinal2 == 3) {
                                                    element2 = ElementBoundsRegistry.Element.ToolbarQrMenuItem;
                                                } else {
                                                    if (ordinal2 != 4) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    element2 = ElementBoundsRegistry.Element.ToolbarMoneybotOverflowMenuItem;
                                                }
                                                element = element2;
                                                companion = companion2;
                                            } else {
                                                companion = companion2;
                                                element = null;
                                            }
                                            TitleBarActionScope titleBarActionScope2 = titleBarActionScope;
                                            ElementBoundsRegistry elementBoundsRegistry2 = elementBoundsRegistry;
                                            boolean z5 = z;
                                            if (icons2 == null) {
                                                gapComposer3.startReplaceGroup(-543265052);
                                                TransactorKt.IconAction(titleBarActionScope2, icons2, stringResource, function0, modifier3, null, null, elementBoundsRegistry2, element, id2 == TabToolbarInternalViewModel.ToolbarButton.Id.Search ? simpleActor : null, z5, gapComposer3, 1073741824, 16);
                                                gapComposer3.end(false);
                                            } else {
                                                ElementBoundsRegistry.Element element3 = element;
                                                gapComposer3.startReplaceGroup(-542796611);
                                                if (elementBoundsRegistry2 != null && element3 != null) {
                                                    if (element3 != ElementBoundsRegistry.Element.ToolbarMoneybotMenuItem) {
                                                        modifier = WalletJsonParser.provideBounds(elementBoundsRegistry2, element3);
                                                    } else if (z5) {
                                                        modifier = WalletJsonParser.provideBounds(elementBoundsRegistry2, element3);
                                                    }
                                                    TransactorKt.IconAction(titleBarActionScope2, Countries.painterResource(i8, 0, gapComposer3), stringResource, function0, modifier3.then(modifier), null, gapComposer3, Painter.$stable << 3, 16);
                                                    gapComposer3.end(false);
                                                }
                                                modifier = companion;
                                                TransactorKt.IconAction(titleBarActionScope2, Countries.painterResource(i8, 0, gapComposer3), stringResource, function0, modifier3.then(modifier), null, gapComposer3, Painter.$stable << 3, 16);
                                                gapComposer3.end(false);
                                            }
                                        }
                                    }
                                }
                            } else if (ordinal3 == 3) {
                                icons = Icons.Qr24;
                            } else {
                                if (ordinal3 != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                icons = Icons.NavigationChatHistory;
                            }
                            icons2 = icons;
                            ordinal = id2.ordinal();
                            if (ordinal != 0) {
                            }
                            String stringResource2 = Room.stringResource(gapComposer3, i7);
                            Function1 function122 = function1;
                            changed = gapComposer3.changed(function122) | gapComposer3.changedInstance(imageButton2);
                            rememberedValue = gapComposer3.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda0(15, function122, imageButton2);
                            gapComposer3.updateRememberedValue(rememberedValue);
                            Function0 function02 = (Function0) rememberedValue;
                            ordinal2 = id2.ordinal();
                            if (ordinal2 == 0) {
                            }
                            TitleBarActionScope titleBarActionScope22 = titleBarActionScope;
                            ElementBoundsRegistry elementBoundsRegistry22 = elementBoundsRegistry;
                            boolean z52 = z;
                            if (icons2 == null) {
                            }
                        } else {
                            gapComposer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2), gapComposer, ((i4 >> 18) & 14) | MLKEMEngine.KyberPolyBytes, 0);
            }
            boolean z5 = z3;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda15(titleBarActionScope, imageButton, function1, elementBoundsRegistry, simpleActor, moneybotToolbarSharedElementConfig, sharedToolbarSwipeScope, z, z5, i, i2);
                return;
            }
            return;
        }
        z3 = z2;
        i4 = i3;
        if (gapComposer2.shouldExecute(i4 & 1, (38347923 & i4) == 38347922)) {
        }
        boolean z52 = z3;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: ProfileButton-NpZTi58, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3755ProfileButtonNpZTi58(final TitleBarActionScope titleBarActionScope, final TabToolbarInternalViewModel.ProfileButton profileButton, boolean z, final ElementBoundsRegistry elementBoundsRegistry, long j, boolean z2, SharedToolbarSwipeScope sharedToolbarSwipeScope, final Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z3;
        final long j2;
        int i4;
        boolean z4;
        int i5;
        SharedToolbarSwipeScope sharedToolbarSwipeScope2;
        int i6;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        int i8;
        final long j3;
        final boolean z5;
        boolean z6;
        String str;
        AvatarImage localIcon;
        boolean z7;
        Color forTheme;
        long j4;
        Badge large;
        int i9;
        titleBarActionScope.getClass();
        profileButton.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1597611702);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(titleBarActionScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(profileButton) ? 32 : 16;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z3 = z;
            i3 |= gapComposer2.changed(z3) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= gapComposer2.changedInstance(elementBoundsRegistry) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (gapComposer2.changed(j2)) {
                        i9 = 16384;
                        i3 |= i9;
                    }
                } else {
                    j2 = j;
                }
                i9 = PKIFailureInfo.certRevoked;
                i3 |= i9;
            } else {
                j2 = j;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                z4 = z2;
                i3 |= gapComposer2.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    sharedToolbarSwipeScope2 = sharedToolbarSwipeScope;
                    i3 |= gapComposer2.changed(sharedToolbarSwipeScope2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    if ((12582912 & i) == 0) {
                        i3 |= gapComposer2.changedInstance(function1) ? 8388608 : 4194304;
                    }
                    i6 = i3;
                    if (gapComposer2.shouldExecute(i6 & 1, (4793491 & i3) == 4793490)) {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                    } else {
                        gapComposer2.startDefaults();
                        Badge badge = null;
                        if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 8) != 0) {
                                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                j2 = colors.semantic.background.f1047app;
                                i7 = i6 & (-57345);
                            } else {
                                i7 = i6;
                            }
                            if (i4 != 0) {
                                z4 = false;
                            }
                            i8 = i7;
                            j3 = j2;
                            z5 = z4;
                            if (i5 != 0) {
                                sharedToolbarSwipeScope2 = null;
                            }
                        } else {
                            gapComposer2.skipToGroupEnd();
                            i8 = (i2 & 8) != 0 ? i6 & (-57345) : i6;
                            j3 = j2;
                            z5 = z4;
                        }
                        gapComposer2.endDefaults();
                        final AvatarSizeOverride avatarSizeOverride = z3 ? SPACES_AVATAR_SIZE : DEFAULT_AVATAR_SIZE;
                        int mo230roundToPx0680j_4 = ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo230roundToPx0680j_4(avatarSizeOverride.size);
                        String str2 = profileButton.photoUrl;
                        if (str2 != null) {
                            z6 = z3;
                            str = str2;
                            localIcon = new AvatarImage.Remote.Image(str, false, new AvatarImage.LocalIcon(Icons.NavigationAccount, 0L, 6), 0L, new TabToolbarsKt$$ExternalSyntheticLambda21(mo230roundToPx0680j_4, 0), 50);
                        } else {
                            z6 = z3;
                            str = str2;
                            localIcon = profileButton.isBusiness ? new AvatarImage.LocalIcon(Icons.Business16, 0L, 6) : null;
                        }
                        if (str != null) {
                            gapComposer2.startReplaceGroup(1919095277);
                            gapComposer2.end(false);
                            j4 = Color.Transparent;
                        } else {
                            gapComposer2.startReplaceGroup(1919141033);
                            TabToolbarInternalViewModel.ProfileButton.Monogram monogram = profileButton.monogram;
                            ColorModel.Accented accented = monogram != null ? monogram.background : null;
                            if (accented == null) {
                                gapComposer2.startReplaceGroup(1919174977);
                                z7 = false;
                                gapComposer2.end(false);
                                forTheme = null;
                            } else {
                                z7 = false;
                                gapComposer2.startReplaceGroup(2001571520);
                                forTheme = ThemablesKt.forTheme(accented, gapComposer2);
                                gapComposer2.end(false);
                            }
                            j4 = forTheme != null ? forTheme.value : Color.Transparent;
                            gapComposer2.end(z7);
                        }
                        final long j5 = j4;
                        TransactorKt transactorKt = profileButton.badge;
                        if (transactorKt != null) {
                            if (transactorKt.equals(TabToolbarBadgeViewModel$Dot.INSTANCE)) {
                                large = Badge.Small.INSTANCE;
                            } else {
                                if (!(transactorKt instanceof TabToolbarBadgeViewModel$Text)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                large = new Badge.Large(profileButton.badgeCount);
                            }
                            badge = large;
                        }
                        final boolean z8 = z6;
                        final SharedToolbarSwipeScope sharedToolbarSwipeScope3 = sharedToolbarSwipeScope2;
                        final AvatarImage avatarImage = localIcon;
                        Function3 function3 = new Function3() { // from class: com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                AvatarOverlay.LocalIcon localIcon2;
                                String m;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((BoxScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    SharedToolbarSwipeScope sharedToolbarSwipeScope4 = SharedToolbarSwipeScope.this;
                                    ToolbarTuckTargets toolbarTuckTargets = sharedToolbarSwipeScope4 != null ? sharedToolbarSwipeScope4.tuckTargets : null;
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    Modifier swipeToolbarEntryPoint = TabToolbarsKt.swipeToolbarEntryPoint(TabToolbarsKt.reportTuckCorner(companion, toolbarTuckTargets, false), sharedToolbarSwipeScope4, SwipeToolbarCorner.Trailing, gapComposer3, MLKEMEngine.KyberPolyBytes, 0);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, swipeToolbarEntryPoint);
                                    ComposeUiNode.Companion.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer3.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer3.startReusableNode();
                                    if (gapComposer3.inserting) {
                                        gapComposer3.createNode(function0);
                                    } else {
                                        gapComposer3.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    gapComposer3.startReplaceGroup(47617965);
                                    Object rememberedValue = gapComposer3.rememberedValue();
                                    Object obj4 = Composer.Companion.Empty;
                                    if (rememberedValue == obj4) {
                                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                                    }
                                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer3, 48, 13);
                                    Function1 function12 = function1;
                                    boolean changed = gapComposer3.changed(function12);
                                    TabToolbarInternalViewModel.ProfileButton profileButton2 = profileButton;
                                    boolean changedInstance = changed | gapComposer3.changedInstance(profileButton2);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changedInstance || rememberedValue2 == obj4) {
                                        rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda19(function12, profileButton2, 1);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    Function0 withHaptics = PlatformKt.withHaptics((Function0) rememberedValue2, null, gapComposer3, 0, 1);
                                    boolean changed2 = gapComposer3.changed(function12);
                                    Object rememberedValue3 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue3 == obj4) {
                                        rememberedValue3 = new TabToolbarsKt$$ExternalSyntheticLambda8(17, function12);
                                        gapComposer3.updateRememberedValue(rememberedValue3);
                                    }
                                    Modifier m184combinedClickableauXiCPI$default = ImageKt.m184combinedClickableauXiCPI$default(companion, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, null, (Function0) rememberedValue3, withHaptics, 444);
                                    boolean z9 = z8;
                                    boolean z10 = z5;
                                    if (!z9 && !z10) {
                                        RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                                        m184combinedClickableauXiCPI$default = m184combinedClickableauXiCPI$default.then(ClipKt.clip(ImageKt.m178borderxT4_qwU(companion, 2.0f, j3, roundedCornerShape), new GenericShape(new TabToolbarsKt$$ExternalSyntheticLambda3(17, (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity), roundedCornerShape))));
                                    }
                                    gapComposer3.end(false);
                                    ElementBoundsRegistry elementBoundsRegistry2 = elementBoundsRegistry;
                                    Modifier then = m184combinedClickableauXiCPI$default.then(elementBoundsRegistry2 != null ? WalletJsonParser.provideBounds(elementBoundsRegistry2, ElementBoundsRegistry.Element.ToolbarProfileMenuItem) : companion);
                                    TabToolbarInternalViewModel.ProfileButton.Monogram monogram2 = profileButton2.monogram;
                                    String str3 = profileButton2.activeAccountCashtag;
                                    String str4 = monogram2 != null ? monogram2.character : "";
                                    if (z10) {
                                        gapComposer3.startReplaceGroup(47641787);
                                        AvatarOverlay.LocalIcon localIcon3 = new AvatarOverlay.LocalIcon(8, Color.Transparent, ((Color) gapComposer3.consume(ArcadeThemeKt.LocalIconColor)).value, Icons.Qr24);
                                        gapComposer3.end(false);
                                        localIcon2 = localIcon3;
                                    } else {
                                        gapComposer3.startReplaceGroup(1477063232);
                                        gapComposer3.end(false);
                                        localIcon2 = null;
                                    }
                                    if (str3 != null) {
                                        gapComposer3.startReplaceGroup(1477158620);
                                        m = Room.stringResource(R.string.tab_menu_account, new Object[]{str3}, gapComposer3);
                                        gapComposer3.end(false);
                                    } else {
                                        m = re$$ExternalSyntheticOutline0.m(gapComposer3, 1477267802, R.string.tab_menu_account_default, gapComposer3, false);
                                    }
                                    TextViewKt.m3615AvatarB_rZmmc(avatarSizeOverride, str4, j5, m, then, avatarImage, (AvatarOverlay) localIcon2, false, 0L, true, (Composer) gapComposer3, 0, 6, 832);
                                    gapComposer3.end(true);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        sharedToolbarSwipeScope2 = sharedToolbarSwipeScope3;
                        z4 = z5;
                        gapComposer = gapComposer2;
                        TransactorKt.CustomAction(titleBarActionScope, null, badge, Expect_jvmKt.rememberComposableLambda(-1647045405, function3, gapComposer2), gapComposer, (i8 & 14) | 3072, 1);
                        z3 = z8;
                        j2 = j3;
                    }
                    final boolean z9 = z4;
                    final SharedToolbarSwipeScope sharedToolbarSwipeScope4 = sharedToolbarSwipeScope2;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                TabToolbarsKt.m3755ProfileButtonNpZTi58(TitleBarActionScope.this, profileButton, z3, elementBoundsRegistry, j2, z9, sharedToolbarSwipeScope4, function1, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                sharedToolbarSwipeScope2 = sharedToolbarSwipeScope;
                if ((12582912 & i) == 0) {
                }
                i6 = i3;
                if (gapComposer2.shouldExecute(i6 & 1, (4793491 & i3) == 4793490)) {
                }
                final boolean z92 = z4;
                final SharedToolbarSwipeScope sharedToolbarSwipeScope42 = sharedToolbarSwipeScope2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            sharedToolbarSwipeScope2 = sharedToolbarSwipeScope;
            if ((12582912 & i) == 0) {
            }
            i6 = i3;
            if (gapComposer2.shouldExecute(i6 & 1, (4793491 & i3) == 4793490)) {
            }
            final boolean z922 = z4;
            final SharedToolbarSwipeScope sharedToolbarSwipeScope422 = sharedToolbarSwipeScope2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        sharedToolbarSwipeScope2 = sharedToolbarSwipeScope;
        if ((12582912 & i) == 0) {
        }
        i6 = i3;
        if (gapComposer2.shouldExecute(i6 & 1, (4793491 & i3) == 4793490)) {
        }
        final boolean z9222 = z4;
        final SharedToolbarSwipeScope sharedToolbarSwipeScope4222 = sharedToolbarSwipeScope2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SharedTabToolbarSpacer(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1918376743);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(modifier, SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).statusBars, gapComposer).mo267calculateTopPaddingD9Ej5fM() + TabToolbarHeight));
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(modifier2, i, i2, 13, (byte) 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if ((r34 & 2) != 0) goto L40;
     */
    /* renamed from: SwipeRecoloredControl-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3756SwipeRecoloredControl3IgeMak(final SharedToolbarSwipeScope sharedToolbarSwipeScope, long j, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        ComposableLambdaImpl composableLambdaImpl2;
        final long j3;
        long j4;
        long j5;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1766956455);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(sharedToolbarSwipeScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && gapComposer.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j2 = colors.semantic.background.standard;
                    i3 &= -113;
                }
                long j6 = j2;
                int i4 = i3;
                j3 = j6;
                gapComposer.endDefaults();
                if (sharedToolbarSwipeScope == null) {
                    gapComposer.startReplaceGroup(-280310851);
                    composableLambdaImpl.invoke(Modifier.Companion.$$INSTANCE, (Object) null, gapComposer, Integer.valueOf((i4 & 896) | 54));
                    gapComposer.end(false);
                    RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        final int i5 = 0;
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i6 = i5;
                                int i7 = i;
                                switch (i6) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope, j3, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i7 | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope, j3, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i7 | 1), i2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                SharedToolbarSwipePalette sharedToolbarSwipePalette = sharedToolbarSwipeScope.palette;
                boolean z = sharedToolbarSwipeScope.isMoneybotToolbar;
                gapComposer.startReplaceGroup(-280268567);
                gapComposer.end(false);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new SwipeControlPlacement();
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SwipeControlPlacement swipeControlPlacement = (SwipeControlPlacement) rememberedValue;
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalIconColor;
                long j7 = ((Color) gapComposer.consume(dynamicProvidableCompositionLocal)).value;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                long j8 = ((Color) gapComposer.consume(staticProvidableCompositionLocal)).value;
                Color color = z ? (Color) sharedToolbarSwipePalette.tabsIconColor$delegate.getValue() : (Color) sharedToolbarSwipePalette.moneybotIconColor$delegate.getValue();
                if (color != null) {
                    j4 = j7;
                    j5 = color.value;
                } else {
                    j4 = j7;
                    j5 = j4;
                }
                Color color2 = z ? (Color) sharedToolbarSwipePalette.tabsTextColor$delegate.getValue() : (Color) sharedToolbarSwipePalette.moneybotTextColor$delegate.getValue();
                long j9 = color2 != null ? color2.value : j8;
                boolean booleanValue = ((Boolean) sharedToolbarSwipeScope.isSourceToolbar.invoke()).booleanValue();
                boolean z2 = sharedToolbarSwipeScope.moneybotIsBeforeTabs;
                if (z == booleanValue) {
                    z2 = !z2;
                }
                float coerceIn = RangesKt___RangesKt.coerceIn(((Number) sharedToolbarSwipeScope.transitionProgress.invoke()).floatValue(), RecyclerView.DECELERATION_RATE, 1.0f);
                float floatValue = ((Number) swipeControlPlacement.centerXFraction$delegate.getValue()).floatValue();
                if (Float.isNaN(floatValue)) {
                    floatValue = 0.5f;
                }
                if (!z2) {
                    floatValue = 1.0f - floatValue;
                }
                float coerceIn2 = RangesKt___RangesKt.coerceIn(floatValue, 0.08f, 0.92f);
                float ramp = ramp(coerceIn, coerceIn2 - 0.08f, coerceIn2 + 0.08f);
                if (!booleanValue) {
                    ramp = 1.0f - ramp;
                }
                long m689lerpjxsXWHM = ColorKt.m689lerpjxsXWHM(ramp, j4, j5);
                long m689lerpjxsXWHM2 = ColorKt.m689lerpjxsXWHM(ramp, j8, j9);
                SwipeControlStyle swipeControlStyle = new SwipeControlStyle(m689lerpjxsXWHM, m689lerpjxsXWHM2, Color.m675copywmQWz5c$default(0.08f, m689lerpjxsXWHM, 14), Color.m675copywmQWz5c$default((1.0f - ramp) * Color.m677getAlphaimpl(j3), j3, 14));
                ProvidedValue[] providedValueArr = {Recorder$$ExternalSyntheticOutline2.m(m689lerpjxsXWHM, dynamicProvidableCompositionLocal), re$$ExternalSyntheticOutline0.m(m689lerpjxsXWHM2, staticProvidableCompositionLocal)};
                composableLambdaImpl2 = composableLambdaImpl;
                Updater.CompositionLocalProvider(providedValueArr, Expect_jvmKt.rememberComposableLambda(810956569, new TabToolbarsKt$$ExternalSyntheticLambda6(0, composableLambdaImpl2, swipeControlPlacement, swipeControlStyle), gapComposer), gapComposer, 56);
            } else {
                gapComposer.skipToGroupEnd();
            }
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
            j3 = j2;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i6 = 1;
            final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    int i7 = i;
                    switch (i62) {
                        case 0:
                            ((Integer) obj2).getClass();
                            TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope, j3, composableLambdaImpl3, (Composer) obj, Updater.updateChangedFlags(i7 | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope, j3, composableLambdaImpl3, (Composer) obj, Updater.updateChangedFlags(i7 | 1), i2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cf A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TabToolbar(Modifier modifier, final TabToolbarInternalViewModel tabToolbarInternalViewModel, DynamicColorConfiguration dynamicColorConfiguration, boolean z, Function3 function3, Function3 function32, Function3 function33, final Function1 function1, ElementBoundsRegistry elementBoundsRegistry, SimpleActor simpleActor, MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig, SharedToolbarSwipeScope sharedToolbarSwipeScope, boolean z2, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        Function3 function34;
        int i6;
        Function3 function35;
        int i7;
        Function3 function36;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TabToolbarInternalViewModel tabToolbarInternalViewModel2;
        final DynamicColorConfiguration dynamicColorConfiguration2;
        final boolean z4;
        final ElementBoundsRegistry elementBoundsRegistry2;
        final SimpleActor simpleActor2;
        final MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig2;
        GapComposer gapComposer;
        final Modifier modifier3;
        final Function3 function37;
        final Function3 function38;
        final Function3 function39;
        final SharedToolbarSwipeScope sharedToolbarSwipeScope2;
        final boolean z5;
        RecomposeScopeImpl endRestartGroup;
        boolean z6;
        int i18;
        int i19;
        GapComposer gapComposer2;
        DynamicColorConfiguration dynamicColorConfiguration3;
        Function3 function310;
        boolean z7;
        int i20;
        SharedToolbarSwipeScope sharedToolbarSwipeScope3;
        Function3 function311;
        Modifier modifier4;
        DynamicColorConfiguration dynamicColorConfiguration4;
        ElementBoundsRegistry elementBoundsRegistry3;
        MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig3;
        Function3 function312;
        SimpleActor simpleActor3;
        boolean z8;
        ElementBoundsRegistry elementBoundsRegistry4;
        Modifier modifier5;
        TabToolbarInternalViewModel.ProfileButton profileButton;
        boolean z9;
        ElementBoundsRegistry elementBoundsRegistry5;
        Function3 function313;
        MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig4;
        Function3 function314;
        ComposableLambdaImpl composableLambdaImpl;
        int i21;
        tabToolbarInternalViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(2025613781);
        int i22 = i3 & 1;
        if (i22 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (gapComposer3.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer3.changedInstance(tabToolbarInternalViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i3 & 4) == 0) {
                if ((i & 512) == 0 ? gapComposer3.changed(dynamicColorConfiguration) : gapComposer3.changedInstance(dynamicColorConfiguration)) {
                    i21 = 256;
                    i4 |= i21;
                }
            }
            i21 = 128;
            i4 |= i21;
        }
        int i23 = i3 & 8;
        if (i23 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z;
            i4 |= gapComposer3.changed(z3) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                function34 = function3;
                i4 |= gapComposer3.changedInstance(function34) ? 16384 : PKIFailureInfo.certRevoked;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    function35 = function32;
                } else {
                    function35 = function32;
                    if ((i & 196608) == 0) {
                        i4 |= gapComposer3.changedInstance(function35) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function36 = function33;
                } else {
                    function36 = function33;
                    if ((i & 1572864) == 0) {
                        i4 |= gapComposer3.changedInstance(function36) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((i & 12582912) == 0) {
                    i8 = i22;
                    i4 |= gapComposer3.changedInstance(function1) ? 8388608 : 4194304;
                } else {
                    i8 = i22;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i10 = i9;
                    i4 |= gapComposer3.changedInstance(elementBoundsRegistry) ? 67108864 : 33554432;
                    i11 = i3 & 512;
                    int i24 = 805306368;
                    if (i11 == 0) {
                        if ((i & 805306368) == 0) {
                            i24 = (i & 1073741824) == 0 ? gapComposer3.changed(simpleActor) : gapComposer3.changedInstance(simpleActor) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i12;
                        } else if ((i2 & 6) == 0) {
                            i13 = i12;
                            i14 = (gapComposer3.changedInstance(moneybotToolbarSharedElementConfig) ? 4 : 2) | i2;
                        } else {
                            i13 = i12;
                            i14 = i2;
                        }
                        i15 = i3 & 2048;
                        if (i15 != 0) {
                            i14 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i16 = i15;
                            i14 |= gapComposer3.changed(sharedToolbarSwipeScope) ? 32 : 16;
                            i17 = i3 & 4096;
                            if (i17 == 0) {
                                i14 |= MLKEMEngine.KyberPolyBytes;
                            } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                                i14 |= gapComposer3.changed(z2) ? 256 : 128;
                                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i14 & 147) != 146)) {
                                    gapComposer3.startDefaults();
                                    if ((i & 1) == 0 || gapComposer3.getDefaultsInvalid()) {
                                        Modifier modifier6 = i8 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                        if ((i3 & 4) != 0) {
                                            i19 = i17;
                                            i18 = i14;
                                            z6 = false;
                                            dynamicColorConfiguration3 = TransactorKt.m1173invokeRGew2ao(0L, 0L, 0L, gapComposer3, 7);
                                            gapComposer2 = gapComposer3;
                                            i4 &= -897;
                                        } else {
                                            z6 = false;
                                            i18 = i14;
                                            i19 = i17;
                                            gapComposer2 = gapComposer3;
                                            dynamicColorConfiguration3 = dynamicColorConfiguration;
                                        }
                                        boolean z10 = i23 != 0 ? z6 : z;
                                        Function3 function315 = i5 != 0 ? null : function3;
                                        if (i6 != 0) {
                                            function35 = null;
                                        }
                                        function310 = i7 != 0 ? ComposableSingletons$TabToolbarsKt.lambda$12211730 : function36;
                                        ElementBoundsRegistry elementBoundsRegistry6 = i10 != 0 ? null : elementBoundsRegistry;
                                        SimpleActor simpleActor4 = i11 != 0 ? null : simpleActor;
                                        MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig5 = i13 != 0 ? null : moneybotToolbarSharedElementConfig;
                                        z7 = z10;
                                        i20 = i4;
                                        sharedToolbarSwipeScope3 = i16 != 0 ? null : sharedToolbarSwipeScope;
                                        function311 = function35;
                                        modifier4 = modifier6;
                                        dynamicColorConfiguration4 = dynamicColorConfiguration3;
                                        elementBoundsRegistry3 = elementBoundsRegistry6;
                                        moneybotToolbarSharedElementConfig3 = moneybotToolbarSharedElementConfig5;
                                        function312 = function315;
                                        simpleActor3 = simpleActor4;
                                        if (i19 != 0) {
                                            z8 = z6;
                                            gapComposer2.endDefaults();
                                            if (sharedToolbarSwipeScope3 == null) {
                                                gapComposer2.startReplaceGroup(770651449);
                                                long j = dynamicColorConfiguration4.titleBarIcon;
                                                modifier5 = modifier4;
                                                long j2 = dynamicColorConfiguration4.titleBarText;
                                                elementBoundsRegistry4 = elementBoundsRegistry3;
                                                boolean changed = ((i18 & 112) == 32) | gapComposer2.changed(j) | gapComposer2.changed(j2);
                                                Object rememberedValue = gapComposer2.rememberedValue();
                                                if (changed || rememberedValue == Composer.Companion.Empty) {
                                                    rememberedValue = new BrazeImageUtils$$ExternalSyntheticLambda22(sharedToolbarSwipeScope3, j, j2, 1);
                                                    gapComposer2.updateRememberedValue(rememberedValue);
                                                }
                                                Updater.SideEffect((Function0) rememberedValue, gapComposer2);
                                                gapComposer2.end(false);
                                            } else {
                                                elementBoundsRegistry4 = elementBoundsRegistry3;
                                                modifier5 = modifier4;
                                                gapComposer2.startReplaceGroup(771254957);
                                                gapComposer2.end(z6);
                                            }
                                            profileButton = tabToolbarInternalViewModel.profileButton;
                                            if ((profileButton == null ? profileButton.photoUrl : null) == null) {
                                                if ((profileButton != null ? profileButton.monogram : null) == null) {
                                                    z9 = false;
                                                    if (tabToolbarInternalViewModel.startButtonType != TabToolbarInternalViewModel.StartButtonType.NONE && function312 == null && tabToolbarInternalViewModel.moneybotSpacesButton == null) {
                                                        gapComposer2.startReplaceGroup(771817979);
                                                        gapComposer2.end(false);
                                                        elementBoundsRegistry5 = elementBoundsRegistry4;
                                                        function313 = function310;
                                                        moneybotToolbarSharedElementConfig4 = moneybotToolbarSharedElementConfig3;
                                                        function314 = function312;
                                                        composableLambdaImpl = null;
                                                    } else {
                                                        gapComposer2.startReplaceGroup(771889279);
                                                        elementBoundsRegistry5 = elementBoundsRegistry4;
                                                        function313 = function310;
                                                        moneybotToolbarSharedElementConfig4 = moneybotToolbarSharedElementConfig3;
                                                        function314 = function312;
                                                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-637906055, new TabToolbarsKt$$ExternalSyntheticLambda1(tabToolbarInternalViewModel, function1, elementBoundsRegistry5, simpleActor3, moneybotToolbarSharedElementConfig4, sharedToolbarSwipeScope3, z8, z9, function312), gapComposer2);
                                                        gapComposer2.end(false);
                                                        composableLambdaImpl = rememberComposableLambda;
                                                    }
                                                    final MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig6 = moneybotToolbarSharedElementConfig4;
                                                    final boolean z11 = z9;
                                                    GapComposer gapComposer4 = gapComposer2;
                                                    final boolean z12 = z7;
                                                    final Function3 function316 = function311;
                                                    final SimpleActor simpleActor5 = simpleActor3;
                                                    final boolean z13 = z8;
                                                    final SharedToolbarSwipeScope sharedToolbarSwipeScope4 = sharedToolbarSwipeScope3;
                                                    final ElementBoundsRegistry elementBoundsRegistry7 = elementBoundsRegistry5;
                                                    Function3 function317 = new Function3() { // from class: com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda2
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                            Function1 function12;
                                                            ElementBoundsRegistry elementBoundsRegistry8;
                                                            SharedToolbarSwipeScope sharedToolbarSwipeScope5;
                                                            boolean z14;
                                                            String m;
                                                            long j3;
                                                            GapComposer gapComposer5;
                                                            boolean z15;
                                                            TabToolbarInternalViewModel.ToolbarButton.Id id;
                                                            TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                                                            Composer composer2 = (Composer) obj2;
                                                            int intValue = ((Integer) obj3).intValue();
                                                            titleBarActionScope.getClass();
                                                            if ((intValue & 6) == 0) {
                                                                intValue |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                                                            }
                                                            int i25 = intValue;
                                                            GapComposer gapComposer6 = (GapComposer) composer2;
                                                            if (gapComposer6.shouldExecute(i25 & 1, (i25 & 19) != 18)) {
                                                                Function3 function318 = Function3.this;
                                                                if (function318 == null) {
                                                                    gapComposer6.startReplaceGroup(-1264207361);
                                                                } else {
                                                                    gapComposer6.startReplaceGroup(651955778);
                                                                    function318.invoke(titleBarActionScope, gapComposer6, Integer.valueOf(i25 & 14));
                                                                }
                                                                gapComposer6.end(false);
                                                                gapComposer6.startReplaceGroup(651957026);
                                                                TabToolbarInternalViewModel tabToolbarInternalViewModel3 = tabToolbarInternalViewModel;
                                                                Iterator it = tabToolbarInternalViewModel3.imageButtons.iterator();
                                                                while (true) {
                                                                    boolean hasNext = it.hasNext();
                                                                    function12 = function1;
                                                                    elementBoundsRegistry8 = elementBoundsRegistry7;
                                                                    sharedToolbarSwipeScope5 = sharedToolbarSwipeScope4;
                                                                    z14 = z11;
                                                                    if (!hasNext) {
                                                                        break;
                                                                    }
                                                                    TabToolbarInternalViewModel.ImageButton imageButton = (TabToolbarInternalViewModel.ImageButton) it.next();
                                                                    if (!z14 || (id = imageButton.id) == TabToolbarInternalViewModel.ToolbarButton.Id.Moneybot || id == TabToolbarInternalViewModel.ToolbarButton.Id.MoneybotOverflowMenu) {
                                                                        gapComposer5 = gapComposer6;
                                                                        z15 = false;
                                                                    } else {
                                                                        gapComposer5 = gapComposer6;
                                                                        z15 = true;
                                                                    }
                                                                    TabToolbarsKt.ImageButton(titleBarActionScope, imageButton, function12, elementBoundsRegistry8, simpleActor5, moneybotToolbarSharedElementConfig6, sharedToolbarSwipeScope5, z13, z15, gapComposer5, (i25 & 14) | 32768, 0);
                                                                    gapComposer6 = gapComposer5;
                                                                    tabToolbarInternalViewModel3 = tabToolbarInternalViewModel3;
                                                                }
                                                                TabToolbarInternalViewModel tabToolbarInternalViewModel4 = tabToolbarInternalViewModel3;
                                                                gapComposer6.end(false);
                                                                TabToolbarInternalViewModel.ProfileButton profileButton2 = tabToolbarInternalViewModel4.profileButton;
                                                                if (profileButton2 == null) {
                                                                    gapComposer6.startReplaceGroup(-1263435120);
                                                                    gapComposer6.end(false);
                                                                } else {
                                                                    String str = profileButton2.activeAccountCashtag;
                                                                    gapComposer6.startReplaceGroup(-1263435119);
                                                                    if (z14) {
                                                                        gapComposer6.startReplaceGroup(-142290702);
                                                                        boolean z16 = tabToolbarInternalViewModel4.moneybotSpacesButton != null;
                                                                        if (z12) {
                                                                            gapComposer6.startReplaceGroup(-142021343);
                                                                            j3 = ((Color) gapComposer6.consume(ArcadeThemeKt.LocalIconColor)).value;
                                                                            gapComposer6.end(false);
                                                                        } else {
                                                                            gapComposer6.startReplaceGroup(-141959219);
                                                                            Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                                                                            if (colors == null) {
                                                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                                                                            } else {
                                                                                gapComposer6.startReplaceGroup(-1762997739);
                                                                                gapComposer6.end(false);
                                                                            }
                                                                            j3 = colors.semantic.background.f1047app;
                                                                            gapComposer6.end(false);
                                                                        }
                                                                        TabToolbarsKt.m3755ProfileButtonNpZTi58(titleBarActionScope, profileButton2, z16, elementBoundsRegistry8, j3, tabToolbarInternalViewModel4.showQrOnAvatar, sharedToolbarSwipeScope5, function12, gapComposer6, i25 & 14, 0);
                                                                        gapComposer6.end(false);
                                                                    } else {
                                                                        gapComposer6.startReplaceGroup(-141680343);
                                                                        if (str != null) {
                                                                            gapComposer6.startReplaceGroup(-141631828);
                                                                            m = Room.stringResource(R.string.tab_menu_account, new Object[]{str}, gapComposer6);
                                                                            gapComposer6.end(false);
                                                                        } else {
                                                                            m = re$$ExternalSyntheticOutline0.m(gapComposer6, -141518678, R.string.tab_menu_account_default, gapComposer6, false);
                                                                        }
                                                                        TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope5, 0L, Expect_jvmKt.rememberComposableLambda(586347761, new SsnViewKt$$ExternalSyntheticLambda7(sharedToolbarSwipeScope5, elementBoundsRegistry8, profileButton2, titleBarActionScope, m, function12), gapComposer6), gapComposer6, MLKEMEngine.KyberPolyBytes, 2);
                                                                        gapComposer6.end(false);
                                                                    }
                                                                    gapComposer6.end(false);
                                                                }
                                                            } else {
                                                                gapComposer6.skipToGroupEnd();
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    tabToolbarInternalViewModel2 = tabToolbarInternalViewModel;
                                                    Modifier modifier7 = modifier5;
                                                    DynamicColorConfiguration dynamicColorConfiguration5 = dynamicColorConfiguration4;
                                                    Trace.TitleBarCore(modifier7, dynamicColorConfiguration5, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-155745994, function317, gapComposer4), Expect_jvmKt.rememberComposableLambda(-1879824621, new TabToolbarsKt$$ExternalSyntheticLambda3(0, tabToolbarInternalViewModel2, function313), gapComposer4), gapComposer4, (i20 & 14) | 27648 | ((i20 >> 3) & 112));
                                                    dynamicColorConfiguration2 = dynamicColorConfiguration5;
                                                    moneybotToolbarSharedElementConfig2 = moneybotToolbarSharedElementConfig6;
                                                    z5 = z13;
                                                    z4 = z12;
                                                    function38 = function316;
                                                    modifier3 = modifier7;
                                                    gapComposer = gapComposer4;
                                                    simpleActor2 = simpleActor5;
                                                    function39 = function314;
                                                    elementBoundsRegistry2 = elementBoundsRegistry7;
                                                    function37 = function313;
                                                    sharedToolbarSwipeScope2 = sharedToolbarSwipeScope3;
                                                }
                                            }
                                            z9 = true;
                                            if (tabToolbarInternalViewModel.startButtonType != TabToolbarInternalViewModel.StartButtonType.NONE) {
                                            }
                                            gapComposer2.startReplaceGroup(771889279);
                                            elementBoundsRegistry5 = elementBoundsRegistry4;
                                            function313 = function310;
                                            moneybotToolbarSharedElementConfig4 = moneybotToolbarSharedElementConfig3;
                                            function314 = function312;
                                            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-637906055, new TabToolbarsKt$$ExternalSyntheticLambda1(tabToolbarInternalViewModel, function1, elementBoundsRegistry5, simpleActor3, moneybotToolbarSharedElementConfig4, sharedToolbarSwipeScope3, z8, z9, function312), gapComposer2);
                                            gapComposer2.end(false);
                                            composableLambdaImpl = rememberComposableLambda2;
                                            final MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig62 = moneybotToolbarSharedElementConfig4;
                                            final boolean z112 = z9;
                                            GapComposer gapComposer42 = gapComposer2;
                                            final boolean z122 = z7;
                                            final Function3 function3162 = function311;
                                            final SimpleActor simpleActor52 = simpleActor3;
                                            final boolean z132 = z8;
                                            final SharedToolbarSwipeScope sharedToolbarSwipeScope42 = sharedToolbarSwipeScope3;
                                            final ElementBoundsRegistry elementBoundsRegistry72 = elementBoundsRegistry5;
                                            Function3 function3172 = new Function3() { // from class: com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                    Function1 function12;
                                                    ElementBoundsRegistry elementBoundsRegistry8;
                                                    SharedToolbarSwipeScope sharedToolbarSwipeScope5;
                                                    boolean z14;
                                                    String m;
                                                    long j3;
                                                    GapComposer gapComposer5;
                                                    boolean z15;
                                                    TabToolbarInternalViewModel.ToolbarButton.Id id;
                                                    TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                                                    Composer composer2 = (Composer) obj2;
                                                    int intValue = ((Integer) obj3).intValue();
                                                    titleBarActionScope.getClass();
                                                    if ((intValue & 6) == 0) {
                                                        intValue |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                                                    }
                                                    int i25 = intValue;
                                                    GapComposer gapComposer6 = (GapComposer) composer2;
                                                    if (gapComposer6.shouldExecute(i25 & 1, (i25 & 19) != 18)) {
                                                        Function3 function318 = Function3.this;
                                                        if (function318 == null) {
                                                            gapComposer6.startReplaceGroup(-1264207361);
                                                        } else {
                                                            gapComposer6.startReplaceGroup(651955778);
                                                            function318.invoke(titleBarActionScope, gapComposer6, Integer.valueOf(i25 & 14));
                                                        }
                                                        gapComposer6.end(false);
                                                        gapComposer6.startReplaceGroup(651957026);
                                                        TabToolbarInternalViewModel tabToolbarInternalViewModel3 = tabToolbarInternalViewModel;
                                                        Iterator it = tabToolbarInternalViewModel3.imageButtons.iterator();
                                                        while (true) {
                                                            boolean hasNext = it.hasNext();
                                                            function12 = function1;
                                                            elementBoundsRegistry8 = elementBoundsRegistry72;
                                                            sharedToolbarSwipeScope5 = sharedToolbarSwipeScope42;
                                                            z14 = z112;
                                                            if (!hasNext) {
                                                                break;
                                                            }
                                                            TabToolbarInternalViewModel.ImageButton imageButton = (TabToolbarInternalViewModel.ImageButton) it.next();
                                                            if (!z14 || (id = imageButton.id) == TabToolbarInternalViewModel.ToolbarButton.Id.Moneybot || id == TabToolbarInternalViewModel.ToolbarButton.Id.MoneybotOverflowMenu) {
                                                                gapComposer5 = gapComposer6;
                                                                z15 = false;
                                                            } else {
                                                                gapComposer5 = gapComposer6;
                                                                z15 = true;
                                                            }
                                                            TabToolbarsKt.ImageButton(titleBarActionScope, imageButton, function12, elementBoundsRegistry8, simpleActor52, moneybotToolbarSharedElementConfig62, sharedToolbarSwipeScope5, z132, z15, gapComposer5, (i25 & 14) | 32768, 0);
                                                            gapComposer6 = gapComposer5;
                                                            tabToolbarInternalViewModel3 = tabToolbarInternalViewModel3;
                                                        }
                                                        TabToolbarInternalViewModel tabToolbarInternalViewModel4 = tabToolbarInternalViewModel3;
                                                        gapComposer6.end(false);
                                                        TabToolbarInternalViewModel.ProfileButton profileButton2 = tabToolbarInternalViewModel4.profileButton;
                                                        if (profileButton2 == null) {
                                                            gapComposer6.startReplaceGroup(-1263435120);
                                                            gapComposer6.end(false);
                                                        } else {
                                                            String str = profileButton2.activeAccountCashtag;
                                                            gapComposer6.startReplaceGroup(-1263435119);
                                                            if (z14) {
                                                                gapComposer6.startReplaceGroup(-142290702);
                                                                boolean z16 = tabToolbarInternalViewModel4.moneybotSpacesButton != null;
                                                                if (z122) {
                                                                    gapComposer6.startReplaceGroup(-142021343);
                                                                    j3 = ((Color) gapComposer6.consume(ArcadeThemeKt.LocalIconColor)).value;
                                                                    gapComposer6.end(false);
                                                                } else {
                                                                    gapComposer6.startReplaceGroup(-141959219);
                                                                    Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                                                                    if (colors == null) {
                                                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                                                                    } else {
                                                                        gapComposer6.startReplaceGroup(-1762997739);
                                                                        gapComposer6.end(false);
                                                                    }
                                                                    j3 = colors.semantic.background.f1047app;
                                                                    gapComposer6.end(false);
                                                                }
                                                                TabToolbarsKt.m3755ProfileButtonNpZTi58(titleBarActionScope, profileButton2, z16, elementBoundsRegistry8, j3, tabToolbarInternalViewModel4.showQrOnAvatar, sharedToolbarSwipeScope5, function12, gapComposer6, i25 & 14, 0);
                                                                gapComposer6.end(false);
                                                            } else {
                                                                gapComposer6.startReplaceGroup(-141680343);
                                                                if (str != null) {
                                                                    gapComposer6.startReplaceGroup(-141631828);
                                                                    m = Room.stringResource(R.string.tab_menu_account, new Object[]{str}, gapComposer6);
                                                                    gapComposer6.end(false);
                                                                } else {
                                                                    m = re$$ExternalSyntheticOutline0.m(gapComposer6, -141518678, R.string.tab_menu_account_default, gapComposer6, false);
                                                                }
                                                                TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope5, 0L, Expect_jvmKt.rememberComposableLambda(586347761, new SsnViewKt$$ExternalSyntheticLambda7(sharedToolbarSwipeScope5, elementBoundsRegistry8, profileButton2, titleBarActionScope, m, function12), gapComposer6), gapComposer6, MLKEMEngine.KyberPolyBytes, 2);
                                                                gapComposer6.end(false);
                                                            }
                                                            gapComposer6.end(false);
                                                        }
                                                    } else {
                                                        gapComposer6.skipToGroupEnd();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            tabToolbarInternalViewModel2 = tabToolbarInternalViewModel;
                                            Modifier modifier72 = modifier5;
                                            DynamicColorConfiguration dynamicColorConfiguration52 = dynamicColorConfiguration4;
                                            Trace.TitleBarCore(modifier72, dynamicColorConfiguration52, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-155745994, function3172, gapComposer42), Expect_jvmKt.rememberComposableLambda(-1879824621, new TabToolbarsKt$$ExternalSyntheticLambda3(0, tabToolbarInternalViewModel2, function313), gapComposer42), gapComposer42, (i20 & 14) | 27648 | ((i20 >> 3) & 112));
                                            dynamicColorConfiguration2 = dynamicColorConfiguration52;
                                            moneybotToolbarSharedElementConfig2 = moneybotToolbarSharedElementConfig62;
                                            z5 = z132;
                                            z4 = z122;
                                            function38 = function3162;
                                            modifier3 = modifier72;
                                            gapComposer = gapComposer42;
                                            simpleActor2 = simpleActor52;
                                            function39 = function314;
                                            elementBoundsRegistry2 = elementBoundsRegistry72;
                                            function37 = function313;
                                            sharedToolbarSwipeScope2 = sharedToolbarSwipeScope3;
                                        }
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                        if ((i3 & 4) != 0) {
                                            i4 &= -897;
                                        }
                                        sharedToolbarSwipeScope3 = sharedToolbarSwipeScope;
                                        z6 = false;
                                        gapComposer2 = gapComposer3;
                                        i18 = i14;
                                        i20 = i4;
                                        z7 = z3;
                                        function310 = function36;
                                        function311 = function35;
                                        dynamicColorConfiguration4 = dynamicColorConfiguration;
                                        elementBoundsRegistry3 = elementBoundsRegistry;
                                        moneybotToolbarSharedElementConfig3 = moneybotToolbarSharedElementConfig;
                                        function312 = function34;
                                        modifier4 = modifier2;
                                        simpleActor3 = simpleActor;
                                    }
                                    z8 = z2;
                                    gapComposer2.endDefaults();
                                    if (sharedToolbarSwipeScope3 == null) {
                                    }
                                    profileButton = tabToolbarInternalViewModel.profileButton;
                                    if ((profileButton == null ? profileButton.photoUrl : null) == null) {
                                    }
                                    z9 = true;
                                    if (tabToolbarInternalViewModel.startButtonType != TabToolbarInternalViewModel.StartButtonType.NONE) {
                                    }
                                    gapComposer2.startReplaceGroup(771889279);
                                    elementBoundsRegistry5 = elementBoundsRegistry4;
                                    function313 = function310;
                                    moneybotToolbarSharedElementConfig4 = moneybotToolbarSharedElementConfig3;
                                    function314 = function312;
                                    ComposableLambdaImpl rememberComposableLambda22 = Expect_jvmKt.rememberComposableLambda(-637906055, new TabToolbarsKt$$ExternalSyntheticLambda1(tabToolbarInternalViewModel, function1, elementBoundsRegistry5, simpleActor3, moneybotToolbarSharedElementConfig4, sharedToolbarSwipeScope3, z8, z9, function312), gapComposer2);
                                    gapComposer2.end(false);
                                    composableLambdaImpl = rememberComposableLambda22;
                                    final MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig622 = moneybotToolbarSharedElementConfig4;
                                    final boolean z1122 = z9;
                                    GapComposer gapComposer422 = gapComposer2;
                                    final boolean z1222 = z7;
                                    final Function3 function31622 = function311;
                                    final SimpleActor simpleActor522 = simpleActor3;
                                    final boolean z1322 = z8;
                                    final SharedToolbarSwipeScope sharedToolbarSwipeScope422 = sharedToolbarSwipeScope3;
                                    final ElementBoundsRegistry elementBoundsRegistry722 = elementBoundsRegistry5;
                                    Function3 function31722 = new Function3() { // from class: com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            Function1 function12;
                                            ElementBoundsRegistry elementBoundsRegistry8;
                                            SharedToolbarSwipeScope sharedToolbarSwipeScope5;
                                            boolean z14;
                                            String m;
                                            long j3;
                                            GapComposer gapComposer5;
                                            boolean z15;
                                            TabToolbarInternalViewModel.ToolbarButton.Id id;
                                            TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                                            Composer composer2 = (Composer) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            titleBarActionScope.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                                            }
                                            int i25 = intValue;
                                            GapComposer gapComposer6 = (GapComposer) composer2;
                                            if (gapComposer6.shouldExecute(i25 & 1, (i25 & 19) != 18)) {
                                                Function3 function318 = Function3.this;
                                                if (function318 == null) {
                                                    gapComposer6.startReplaceGroup(-1264207361);
                                                } else {
                                                    gapComposer6.startReplaceGroup(651955778);
                                                    function318.invoke(titleBarActionScope, gapComposer6, Integer.valueOf(i25 & 14));
                                                }
                                                gapComposer6.end(false);
                                                gapComposer6.startReplaceGroup(651957026);
                                                TabToolbarInternalViewModel tabToolbarInternalViewModel3 = tabToolbarInternalViewModel;
                                                Iterator it = tabToolbarInternalViewModel3.imageButtons.iterator();
                                                while (true) {
                                                    boolean hasNext = it.hasNext();
                                                    function12 = function1;
                                                    elementBoundsRegistry8 = elementBoundsRegistry722;
                                                    sharedToolbarSwipeScope5 = sharedToolbarSwipeScope422;
                                                    z14 = z1122;
                                                    if (!hasNext) {
                                                        break;
                                                    }
                                                    TabToolbarInternalViewModel.ImageButton imageButton = (TabToolbarInternalViewModel.ImageButton) it.next();
                                                    if (!z14 || (id = imageButton.id) == TabToolbarInternalViewModel.ToolbarButton.Id.Moneybot || id == TabToolbarInternalViewModel.ToolbarButton.Id.MoneybotOverflowMenu) {
                                                        gapComposer5 = gapComposer6;
                                                        z15 = false;
                                                    } else {
                                                        gapComposer5 = gapComposer6;
                                                        z15 = true;
                                                    }
                                                    TabToolbarsKt.ImageButton(titleBarActionScope, imageButton, function12, elementBoundsRegistry8, simpleActor522, moneybotToolbarSharedElementConfig622, sharedToolbarSwipeScope5, z1322, z15, gapComposer5, (i25 & 14) | 32768, 0);
                                                    gapComposer6 = gapComposer5;
                                                    tabToolbarInternalViewModel3 = tabToolbarInternalViewModel3;
                                                }
                                                TabToolbarInternalViewModel tabToolbarInternalViewModel4 = tabToolbarInternalViewModel3;
                                                gapComposer6.end(false);
                                                TabToolbarInternalViewModel.ProfileButton profileButton2 = tabToolbarInternalViewModel4.profileButton;
                                                if (profileButton2 == null) {
                                                    gapComposer6.startReplaceGroup(-1263435120);
                                                    gapComposer6.end(false);
                                                } else {
                                                    String str = profileButton2.activeAccountCashtag;
                                                    gapComposer6.startReplaceGroup(-1263435119);
                                                    if (z14) {
                                                        gapComposer6.startReplaceGroup(-142290702);
                                                        boolean z16 = tabToolbarInternalViewModel4.moneybotSpacesButton != null;
                                                        if (z1222) {
                                                            gapComposer6.startReplaceGroup(-142021343);
                                                            j3 = ((Color) gapComposer6.consume(ArcadeThemeKt.LocalIconColor)).value;
                                                            gapComposer6.end(false);
                                                        } else {
                                                            gapComposer6.startReplaceGroup(-141959219);
                                                            Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                                                            if (colors == null) {
                                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                                                            } else {
                                                                gapComposer6.startReplaceGroup(-1762997739);
                                                                gapComposer6.end(false);
                                                            }
                                                            j3 = colors.semantic.background.f1047app;
                                                            gapComposer6.end(false);
                                                        }
                                                        TabToolbarsKt.m3755ProfileButtonNpZTi58(titleBarActionScope, profileButton2, z16, elementBoundsRegistry8, j3, tabToolbarInternalViewModel4.showQrOnAvatar, sharedToolbarSwipeScope5, function12, gapComposer6, i25 & 14, 0);
                                                        gapComposer6.end(false);
                                                    } else {
                                                        gapComposer6.startReplaceGroup(-141680343);
                                                        if (str != null) {
                                                            gapComposer6.startReplaceGroup(-141631828);
                                                            m = Room.stringResource(R.string.tab_menu_account, new Object[]{str}, gapComposer6);
                                                            gapComposer6.end(false);
                                                        } else {
                                                            m = re$$ExternalSyntheticOutline0.m(gapComposer6, -141518678, R.string.tab_menu_account_default, gapComposer6, false);
                                                        }
                                                        TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope5, 0L, Expect_jvmKt.rememberComposableLambda(586347761, new SsnViewKt$$ExternalSyntheticLambda7(sharedToolbarSwipeScope5, elementBoundsRegistry8, profileButton2, titleBarActionScope, m, function12), gapComposer6), gapComposer6, MLKEMEngine.KyberPolyBytes, 2);
                                                        gapComposer6.end(false);
                                                    }
                                                    gapComposer6.end(false);
                                                }
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    tabToolbarInternalViewModel2 = tabToolbarInternalViewModel;
                                    Modifier modifier722 = modifier5;
                                    DynamicColorConfiguration dynamicColorConfiguration522 = dynamicColorConfiguration4;
                                    Trace.TitleBarCore(modifier722, dynamicColorConfiguration522, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-155745994, function31722, gapComposer422), Expect_jvmKt.rememberComposableLambda(-1879824621, new TabToolbarsKt$$ExternalSyntheticLambda3(0, tabToolbarInternalViewModel2, function313), gapComposer422), gapComposer422, (i20 & 14) | 27648 | ((i20 >> 3) & 112));
                                    dynamicColorConfiguration2 = dynamicColorConfiguration522;
                                    moneybotToolbarSharedElementConfig2 = moneybotToolbarSharedElementConfig622;
                                    z5 = z1322;
                                    z4 = z1222;
                                    function38 = function31622;
                                    modifier3 = modifier722;
                                    gapComposer = gapComposer422;
                                    simpleActor2 = simpleActor522;
                                    function39 = function314;
                                    elementBoundsRegistry2 = elementBoundsRegistry722;
                                    function37 = function313;
                                    sharedToolbarSwipeScope2 = sharedToolbarSwipeScope3;
                                } else {
                                    tabToolbarInternalViewModel2 = tabToolbarInternalViewModel;
                                    gapComposer3.skipToGroupEnd();
                                    dynamicColorConfiguration2 = dynamicColorConfiguration;
                                    z4 = z;
                                    elementBoundsRegistry2 = elementBoundsRegistry;
                                    simpleActor2 = simpleActor;
                                    moneybotToolbarSharedElementConfig2 = moneybotToolbarSharedElementConfig;
                                    gapComposer = gapComposer3;
                                    modifier3 = modifier2;
                                    function37 = function36;
                                    function38 = function35;
                                    function39 = function3;
                                    sharedToolbarSwipeScope2 = sharedToolbarSwipeScope;
                                    z5 = z2;
                                }
                                endRestartGroup = gapComposer.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final TabToolbarInternalViewModel tabToolbarInternalViewModel3 = tabToolbarInternalViewModel2;
                                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                            int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                            TabToolbarsKt.TabToolbar(Modifier.this, tabToolbarInternalViewModel3, dynamicColorConfiguration2, z4, function39, function38, function37, function1, elementBoundsRegistry2, simpleActor2, moneybotToolbarSharedElementConfig2, sharedToolbarSwipeScope2, z5, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            if (gapComposer3.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i14 & 147) != 146)) {
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i16 = i15;
                        i17 = i3 & 4096;
                        if (i17 == 0) {
                        }
                        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i14 & 147) != 146)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i4 |= i24;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i3 & 4096;
                    if (i17 == 0) {
                    }
                    if (gapComposer3.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i14 & 147) != 146)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i10 = i9;
                i11 = i3 & 512;
                int i242 = 805306368;
                if (i11 == 0) {
                }
                i4 |= i242;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                i15 = i3 & 2048;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i3 & 4096;
                if (i17 == 0) {
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i14 & 147) != 146)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function34 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            int i2422 = 805306368;
            if (i11 == 0) {
            }
            i4 |= i2422;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i3 & 4096;
            if (i17 == 0) {
            }
            if (gapComposer3.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i14 & 147) != 146)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function34 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        int i24222 = 805306368;
        if (i11 == 0) {
        }
        i4 |= i24222;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        i15 = i3 & 2048;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i3 & 4096;
        if (i17 == 0) {
        }
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i14 & 147) != 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void TextButton(TitleBarActionScope titleBarActionScope, TabToolbarInternalViewModel.TextButton textButton, Function1 function1, MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig, SharedToolbarSwipeScope sharedToolbarSwipeScope, Composer composer, int i) {
        int i2;
        titleBarActionScope.getClass();
        textButton.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1485295096);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(textButton) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(moneybotToolbarSharedElementConfig) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(sharedToolbarSwipeScope) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9361) != 9360)) {
            m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope, toolbarActionBackground(TabToolbarInternalViewModel.ToolbarButton.Id.Moneybot, gapComposer), Expect_jvmKt.rememberComposableLambda(771967300, new TabToolbarsKt$$ExternalSyntheticLambda16(textButton, sharedToolbarSwipeScope, moneybotToolbarSharedElementConfig, function1, 0), gapComposer), gapComposer, ((i2 >> 12) & 14) | MLKEMEngine.KyberPolyBytes, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17(titleBarActionScope, textButton, function1, moneybotToolbarSharedElementConfig, sharedToolbarSwipeScope, i, 0);
        }
    }

    public static final float ramp(float f, float f2, float f3) {
        return RangesKt___RangesKt.coerceIn((f - f2) / (f3 - f2), RecyclerView.DECELERATION_RATE, 1.0f);
    }

    public static final Modifier reportTuckCorner(Modifier modifier, ToolbarTuckTargets toolbarTuckTargets, boolean z) {
        return toolbarTuckTargets == null ? modifier : ValueInsets.onGloballyPositioned(modifier, new SliderKt$$ExternalSyntheticLambda5(z, toolbarTuckTargets, 9));
    }

    public static final Modifier swipeToolbarControl(Modifier modifier, SharedToolbarSwipeScope sharedToolbarSwipeScope, boolean z, GapComposer gapComposer, int i) {
        modifier.getClass();
        gapComposer.startReplaceGroup(-350632029);
        if (sharedToolbarSwipeScope == null) {
            gapComposer.end(false);
            return modifier;
        }
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Float.valueOf(Float.NaN));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda10(0, mutableState);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier, (Function1) rememberedValue2);
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && gapComposer.changed(sharedToolbarSwipeScope)) || (i & 48) == 32;
        if ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !gapComposer.changed(z)) && (i & MLKEMEngine.KyberPolyBytes) != 256) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (z4 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new DialogHostKt$$ExternalSyntheticLambda2(sharedToolbarSwipeScope, z, mutableState, 11);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Modifier graphicsLayer = ColorKt.graphicsLayer(onGloballyPositioned, (Function1) rememberedValue3);
        gapComposer.end(false);
        return graphicsLayer;
    }

    public static final float swipeToolbarControlAlpha(float f, boolean z) {
        return z ? 1.0f - ramp(f, 0.85f, 0.925f) : ramp(f, 0.925f, 1.0f);
    }

    public static final Modifier swipeToolbarEntryPoint(Modifier modifier, SharedToolbarSwipeScope sharedToolbarSwipeScope, SwipeToolbarCorner swipeToolbarCorner, Composer composer, int i, int i2) {
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1964999106);
        if ((i2 & 2) != 0) {
            swipeToolbarCorner = SwipeToolbarCorner.Leading;
        }
        if (sharedToolbarSwipeScope == null) {
            gapComposer.end(false);
            return modifier;
        }
        SharedToolbarSwipeGeometry sharedToolbarSwipeGeometry = sharedToolbarSwipeScope.geometry;
        boolean changed = gapComposer.changed(sharedToolbarSwipeGeometry) | gapComposer.changed(sharedToolbarSwipeScope);
        int i3 = (i & 896) ^ MLKEMEngine.KyberPolyBytes;
        boolean z = true;
        boolean z2 = changed | ((i3 > 256 && gapComposer.changed(swipeToolbarCorner.ordinal())) || (i & MLKEMEngine.KyberPolyBytes) == 256);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (z2 || rememberedValue == neverEqualPolicy) {
            rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda24(sharedToolbarSwipeGeometry, sharedToolbarSwipeScope, swipeToolbarCorner);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier, (Function1) rememberedValue);
        boolean changed2 = gapComposer.changed(sharedToolbarSwipeScope) | gapComposer.changed(sharedToolbarSwipeGeometry);
        if ((i3 <= 256 || !gapComposer.changed(swipeToolbarCorner.ordinal())) && (i & MLKEMEngine.KyberPolyBytes) != 256) {
            z = false;
        }
        boolean z3 = changed2 | z;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (z3 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda24(sharedToolbarSwipeScope, sharedToolbarSwipeGeometry, swipeToolbarCorner);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Modifier graphicsLayer = ColorKt.graphicsLayer(onGloballyPositioned, (Function1) rememberedValue2);
        gapComposer.end(false);
        return graphicsLayer;
    }

    public static final Modifier tabToolbarIconTonalBackground(GapComposer gapComposer) {
        return ClipKt.drawBehind(Modifier.Companion.$$INSTANCE, new c7$$ExternalSyntheticLambda6(Color.m675copywmQWz5c$default(0.08f, ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value, 14), 20));
    }

    public static final long toolbarActionBackground(TabToolbarInternalViewModel.ToolbarButton.Id id, Composer composer) {
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        if (colors.isLight && (id == TabToolbarInternalViewModel.ToolbarButton.Id.Moneybot || id == TabToolbarInternalViewModel.ToolbarButton.Id.MoneybotOverflowMenu)) {
            gapComposer.startReplaceGroup(1490305336);
            gapComposer.end(false);
            return LightToolbarActionBackground;
        }
        gapComposer.startReplaceGroup(463719336);
        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors2 == null) {
            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        long j = colors2.semantic.background.standard;
        gapComposer.end(false);
        return j;
    }
}
