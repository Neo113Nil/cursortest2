package com.withpersona.sdk2.camera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.protos.cash.genericelements.ui.SemanticBackgroundColor;
import com.squareup.protos.cash.genericelements.ui.SemanticIconColor;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes5.dex */
public abstract class ImageToAnalyzeKt {
    public static final void GenericArcadeBadgedAvatar(Modifier modifier, GenericBaseViewModel.ArcadeBadgedAvatarViewModel arcadeBadgedAvatarViewModel, Composer composer, int i) {
        int i2;
        AvatarImage image;
        AvatarImage.LocalIcon localIcon;
        Color color;
        AvatarImage avatarImage;
        AvatarImage.LocalIcon localIcon2;
        AvatarOverlay avatarOverlay;
        Color color2;
        AvatarOverlay.LocalIcon localIcon3;
        Color color3;
        AvatarSize avatarSize;
        long j;
        Color color4;
        long j2;
        Color m;
        Color color5;
        Color color6;
        arcadeBadgedAvatarViewModel.getClass();
        GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Size size = arcadeBadgedAvatarViewModel.size;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1078075950);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(arcadeBadgedAvatarViewModel) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int roundToInt = MathKt__MathJVMKt.roundToInt(DensityUtilsKt.m3477toPx8Feqmps(size.value, gapComposer));
            DimensionKt.Dimension(roundToInt);
            GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image image2 = arcadeBadgedAvatarViewModel.image;
            if (image2 instanceof GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon) {
                gapComposer.startReplaceGroup(-943859487);
                zzd zzdVar = Icons.Companion;
                GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon localIcon4 = (GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon) image2;
                String str = localIcon4.iconId;
                zzdVar.getClass();
                Icons icons = zzd.get(str);
                icons.getClass();
                SemanticIconColor semanticIconColor = localIcon4.tintColor;
                if (semanticIconColor == null) {
                    gapComposer.startReplaceGroup(805216256);
                    gapComposer.end(false);
                    color6 = null;
                } else {
                    gapComposer.startReplaceGroup(-943856607);
                    long arcadeColor = toArcadeColor(semanticIconColor, gapComposer);
                    gapComposer.end(false);
                    color6 = new Color(arcadeColor);
                }
                avatarImage = new AvatarImage.LocalIcon(icons, color6 != null ? color6.value : Color.Unspecified, 4);
                gapComposer.end(false);
            } else {
                if (image2 instanceof GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.RemoteIcon) {
                    gapComposer.startReplaceGroup(-943852830);
                    GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.RemoteIcon remoteIcon = (GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.RemoteIcon) image2;
                    String urlForTheme = ThemablesKt.urlForTheme(remoteIcon.image, gapComposer);
                    boolean z = remoteIcon.colorizeImage;
                    GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon localIcon5 = remoteIcon.placeholder;
                    if (localIcon5 == null) {
                        gapComposer.startReplaceGroup(805468224);
                        gapComposer.end(false);
                        localIcon2 = null;
                    } else {
                        gapComposer.startReplaceGroup(-943848479);
                        AvatarImage.LocalIcon placeholder = toPlaceholder(localIcon5, gapComposer);
                        gapComposer.end(false);
                        localIcon2 = placeholder;
                    }
                    image = new AvatarImage.Remote.Icon(urlForTheme, z, localIcon2, new TabToolbarsKt$$ExternalSyntheticLambda21(roundToInt, 6), 24);
                    gapComposer.end(false);
                } else {
                    if (!(image2 instanceof GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.RemoteImage)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -943860809, false);
                    }
                    gapComposer.startReplaceGroup(-943836110);
                    GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.RemoteImage remoteImage = (GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.RemoteImage) image2;
                    String urlForTheme2 = ThemablesKt.urlForTheme(remoteImage.image, gapComposer);
                    boolean z2 = remoteImage.colorizeImage;
                    GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon localIcon6 = remoteImage.placeholder;
                    if (localIcon6 == null) {
                        gapComposer.startReplaceGroup(805985056);
                        gapComposer.end(false);
                        localIcon = null;
                    } else {
                        gapComposer.startReplaceGroup(-943831807);
                        AvatarImage.LocalIcon placeholder2 = toPlaceholder(localIcon6, gapComposer);
                        gapComposer.end(false);
                        localIcon = placeholder2;
                    }
                    SemanticIconColor semanticIconColor2 = remoteImage.tintColor;
                    if (semanticIconColor2 == null) {
                        gapComposer.startReplaceGroup(806042592);
                        gapComposer.end(false);
                        color = null;
                    } else {
                        gapComposer.startReplaceGroup(-943829951);
                        long arcadeColor2 = toArcadeColor(semanticIconColor2, gapComposer);
                        gapComposer.end(false);
                        color = new Color(arcadeColor2);
                    }
                    image = new AvatarImage.Remote.Image(urlForTheme2, z2, localIcon, color != null ? color.value : Color.Unspecified, new TabToolbarsKt$$ExternalSyntheticLambda21(roundToInt, 7), 40);
                    gapComposer.end(false);
                }
                avatarImage = image;
            }
            GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge badge = arcadeBadgedAvatarViewModel.badge;
            if (badge instanceof GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.LocalIcon) {
                gapComposer.startReplaceGroup(-943813907);
                zzd zzdVar2 = Icons.Companion;
                GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.LocalIcon localIcon7 = (GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.LocalIcon) badge;
                String str2 = localIcon7.iconId;
                zzdVar2.getClass();
                Icons icons2 = zzd.get(str2);
                icons2.getClass();
                gapComposer.startReplaceGroup(806636800);
                gapComposer.end(false);
                long j3 = Color.Unspecified;
                SemanticIconColor semanticIconColor3 = localIcon7.tintColor;
                if (semanticIconColor3 == null) {
                    gapComposer.startReplaceGroup(806715168);
                    gapComposer.end(false);
                    color5 = null;
                } else {
                    gapComposer.startReplaceGroup(-943808255);
                    long arcadeColor3 = toArcadeColor(semanticIconColor3, gapComposer);
                    gapComposer.end(false);
                    color5 = new Color(arcadeColor3);
                }
                avatarOverlay = new AvatarOverlay.LocalIcon(icons2, j3, color5 != null ? color5.value : j3, true);
                gapComposer.end(false);
            } else if (badge instanceof GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.RemoteImage) {
                gapComposer.startReplaceGroup(806929162);
                GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.RemoteImage remoteImage2 = (GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.RemoteImage) badge;
                String urlForTheme3 = ThemablesKt.urlForTheme(remoteImage2.image, gapComposer);
                boolean z3 = remoteImage2.colorizeImage;
                GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.LocalIcon localIcon8 = remoteImage2.placeholder;
                if (localIcon8 == null) {
                    gapComposer.startReplaceGroup(807068320);
                    gapComposer.end(false);
                    localIcon3 = null;
                } else {
                    gapComposer.startReplaceGroup(-943796863);
                    zzd zzdVar3 = Icons.Companion;
                    String str3 = localIcon8.iconId;
                    zzdVar3.getClass();
                    Icons icons3 = zzd.get(str3);
                    icons3.getClass();
                    SemanticIconColor semanticIconColor4 = localIcon8.tintColor;
                    if (semanticIconColor4 == null) {
                        gapComposer.startReplaceGroup(994924304);
                        gapComposer.end(false);
                        color2 = null;
                    } else {
                        gapComposer.startReplaceGroup(724830993);
                        long arcadeColor4 = toArcadeColor(semanticIconColor4, gapComposer);
                        gapComposer.end(false);
                        color2 = new Color(arcadeColor4);
                    }
                    AvatarOverlay.LocalIcon localIcon9 = new AvatarOverlay.LocalIcon(10, 0L, color2 != null ? color2.value : Color.Unspecified, icons3);
                    gapComposer.end(false);
                    localIcon3 = localIcon9;
                }
                SemanticIconColor semanticIconColor5 = remoteImage2.tintColor;
                if (semanticIconColor5 == null) {
                    gapComposer.startReplaceGroup(807125856);
                    gapComposer.end(false);
                    color3 = null;
                } else {
                    gapComposer.startReplaceGroup(-943795007);
                    long arcadeColor5 = toArcadeColor(semanticIconColor5, gapComposer);
                    gapComposer.end(false);
                    color3 = new Color(arcadeColor5);
                }
                avatarOverlay = new AvatarOverlay.RemoteImage(urlForTheme3, z3, 0L, color3 != null ? color3.value : Color.Unspecified, localIcon3, new TabToolbarsKt$$ExternalSyntheticLambda21(roundToInt, 8), 4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(807474699);
                gapComposer.end(false);
                avatarOverlay = null;
            }
            int ordinal = size.ordinal();
            if (ordinal == 0) {
                avatarSize = AvatarSize.Size16;
            } else if (ordinal == 1) {
                avatarSize = AvatarSize.Size32;
            } else if (ordinal == 2) {
                avatarSize = AvatarSize.Size48;
            } else if (ordinal == 3) {
                avatarSize = AvatarSize.Size64;
            } else {
                if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                avatarSize = AvatarSize.Size96;
            }
            String str4 = arcadeBadgedAvatarViewModel.monogram;
            SemanticBackgroundColor semanticBackgroundColor = arcadeBadgedAvatarViewModel.backgroundColor;
            if (semanticBackgroundColor == null) {
                gapComposer.startReplaceGroup(807614912);
                gapComposer.end(false);
                color4 = null;
            } else {
                gapComposer.startReplaceGroup(-943779231);
                semanticBackgroundColor.getClass();
                switch (semanticBackgroundColor) {
                    case BACKGROUND_APP:
                        gapComposer.startReplaceGroup(1226328857);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors.semantic.background.f1047app;
                        gapComposer.end(false);
                        break;
                    case BACKGROUND_BITCOIN:
                        gapComposer.startReplaceGroup(1226330983);
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors2.semantic.service.bitcoinBackground;
                        gapComposer.end(false);
                        break;
                    case BACKGROUND_BRAND:
                        gapComposer.startReplaceGroup(1226333563);
                        Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors3.semantic.background.brand;
                        gapComposer.end(false);
                        break;
                    case BACKGROUND_DANGER:
                        gapComposer.startReplaceGroup(1226335804);
                        Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors4.semantic.background.danger;
                        gapComposer.end(false);
                        break;
                    case BACKGROUND_DIMMER:
                        gapComposer.startReplaceGroup(1226338080);
                        Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors5 == null) {
                            colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors5.component.ui.dimmer.background;
                        gapComposer.end(false);
                        break;
                    case BACKGROUND_EXTRA_PROMINENT:
                        gapComposer.startReplaceGroup(1226340772);
                        Colors colors6 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors6 == null) {
                            colors6 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors6.semantic.background.extraProminent;
                        gapComposer.end(false);
                        break;
                    case BACKGROUND_NOTIFICATION:
                        gapComposer.startReplaceGroup(1226343490);
                        Colors colors7 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors7 == null) {
                            colors7 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors7.semantic.background.notification;
                        gapComposer.end(false);
                        break;
                    case BACKGROUND_PROMINENT:
                        gapComposer.startReplaceGroup(1226346047);
                        Colors colors8 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors8 == null) {
                            colors8 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors8.semantic.background.prominent;
                        gapComposer.end(false);
                        break;
                    case BACKGROUND_STANDARD:
                        gapComposer.startReplaceGroup(1226348478);
                        Colors colors9 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors9 == null) {
                            colors9 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors9.semantic.background.standard;
                        gapComposer.end(false);
                        break;
                    case BACKGROUND_SUBTLE:
                        gapComposer.startReplaceGroup(1226350812);
                        Colors colors10 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors10 == null) {
                            colors10 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors10.semantic.background.subtle;
                        gapComposer.end(false);
                        break;
                    case BACKGROUND_WARNING:
                        gapComposer.startReplaceGroup(1226353117);
                        Colors colors11 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors11 == null) {
                            colors11 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors11.semantic.background.warning;
                        gapComposer.end(false);
                        break;
                    default:
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1226327298, false);
                }
                gapComposer.end(false);
                color4 = new Color(j);
            }
            if (color4 == null) {
                gapComposer.startReplaceGroup(807670310);
                com.squareup.protos.cash.ui.Color color7 = arcadeBadgedAvatarViewModel.customBackgroundColor;
                if (color7 == null) {
                    gapComposer.startReplaceGroup(807670309);
                    gapComposer.end(false);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -943777444, color7, gapComposer, false);
                }
                gapComposer.end(false);
                color4 = m;
            } else {
                gapComposer.startReplaceGroup(-943779893);
                gapComposer.end(false);
            }
            if (color4 == null) {
                gapComposer.startReplaceGroup(-943775496);
                Colors colors12 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors12 == null) {
                    colors12 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors12.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-943779836);
                gapComposer.end(false);
                j2 = color4.value;
            }
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, str4, j2, arcadeBadgedAvatarViewModel.contentDescription, modifier, avatarImage, (Function2) null, avatarOverlay, false, 0L, (Composer) gapComposer, (i2 << 12) & 57344, 0, 1856);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(modifier, arcadeBadgedAvatarViewModel, i, 19);
        }
    }

    public static final long toArcadeColor(SemanticIconColor semanticIconColor, Composer composer) {
        semanticIconColor.getClass();
        switch (semanticIconColor) {
            case ICON_BRAND:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(167647206);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.icon.brand;
                gapComposer.end(false);
                return j;
            case ICON_DANGER:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(167649063);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                long j2 = colors2.semantic.icon.danger;
                gapComposer2.end(false);
                return j2;
            case ICON_DISABLED:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(167651017);
                Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                long j3 = colors3.semantic.icon.disabled;
                gapComposer3.end(false);
                return j3;
            case ICON_EXTRA_SUBTLE:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(167653164);
                Colors colors4 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                } else {
                    gapComposer4.startReplaceGroup(-1762997739);
                    gapComposer4.end(false);
                }
                long j4 = colors4.semantic.icon.extraSubtle;
                gapComposer4.end(false);
                return j4;
            case ICON_INFO:
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(167655141);
                Colors colors5 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                } else {
                    gapComposer5.startReplaceGroup(-1762997739);
                    gapComposer5.end(false);
                }
                long j5 = colors5.semantic.icon.info;
                gapComposer5.end(false);
                return j5;
            case ICON_INVERSE:
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(167657000);
                Colors colors6 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                if (colors6 == null) {
                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                } else {
                    gapComposer6.startReplaceGroup(-1762997739);
                    gapComposer6.end(false);
                }
                long j6 = colors6.semantic.icon.inverse;
                gapComposer6.end(false);
                return j6;
            case ICON_PROMINENT:
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(167659018);
                Colors colors7 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                if (colors7 == null) {
                    colors7 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                } else {
                    gapComposer7.startReplaceGroup(-1762997739);
                    gapComposer7.end(false);
                }
                long j7 = colors7.semantic.icon.prominent;
                gapComposer7.end(false);
                return j7;
            case ICON_STANDARD:
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(167661065);
                Colors colors8 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                if (colors8 == null) {
                    colors8 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                } else {
                    gapComposer8.startReplaceGroup(-1762997739);
                    gapComposer8.end(false);
                }
                long j8 = colors8.semantic.icon.standard;
                gapComposer8.end(false);
                return j8;
            case ICON_SUBTLE:
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(167663015);
                Colors colors9 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                if (colors9 == null) {
                    colors9 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                } else {
                    gapComposer9.startReplaceGroup(-1762997739);
                    gapComposer9.end(false);
                }
                long j9 = colors9.semantic.icon.subtle;
                gapComposer9.end(false);
                return j9;
            case ICON_SUCCESS:
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(167664936);
                Colors colors10 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                if (colors10 == null) {
                    colors10 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                } else {
                    gapComposer10.startReplaceGroup(-1762997739);
                    gapComposer10.end(false);
                }
                long j10 = colors10.semantic.icon.success;
                gapComposer10.end(false);
                return j10;
            case ICON_WARNING:
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(167666888);
                Colors colors11 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                if (colors11 == null) {
                    colors11 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                } else {
                    gapComposer11.startReplaceGroup(-1762997739);
                    gapComposer11.end(false);
                }
                long j11 = colors11.semantic.icon.warning;
                gapComposer11.end(false);
                return j11;
            default:
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 167645812, false);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:5|6|7|8|(3:41|42|(15:44|11|12|(1:14)(1:38)|15|16|17|18|19|20|(1:22)|23|(1:25)|26|27))|10|11|12|(0)(0)|15|16|17|18|19|20|(0)|23|(0)|26|27) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7 A[Catch: Exception -> 0x012b, TryCatch #1 {Exception -> 0x012b, blocks: (B:17:0x00be, B:20:0x00e2, B:22:0x00e7, B:23:0x00f7, B:25:0x011e, B:35:0x0127, B:36:0x012a, B:19:0x00cc, B:32:0x0125), top: B:16:0x00be, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011e A[Catch: Exception -> 0x012b, TRY_LEAVE, TryCatch #1 {Exception -> 0x012b, blocks: (B:17:0x00be, B:20:0x00e2, B:22:0x00e7, B:23:0x00f7, B:25:0x011e, B:35:0x0127, B:36:0x012a, B:19:0x00cc, B:32:0x0125), top: B:16:0x00be, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap toBitmap(Image image, int i, Rect rect) {
        char c;
        boolean z;
        Bitmap bitmap;
        Bitmap createBitmap;
        image.getClass();
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        if (planes == null) {
            return null;
        }
        int width2 = image.getWidth();
        int height2 = image.getHeight();
        int i2 = width2 * height2;
        byte[] bArr = new byte[Boxes$$ExternalSyntheticOutline1.m$1(i2, 4, 2, i2)];
        ByteBuffer buffer = planes[1].getBuffer();
        ByteBuffer buffer2 = planes[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        try {
            buffer2.position(position + 1);
            buffer.limit(limit - 1);
            c = 2;
        } catch (IllegalArgumentException unused) {
            c = 2;
        }
        try {
            try {
                if (buffer2.remaining() == ((i2 * 2) / 4) - 2) {
                    if (buffer2.compareTo(buffer) == 0) {
                        z = true;
                        buffer2.position(position);
                        buffer.limit(limit);
                        if (z) {
                            BitmapUtils.unpackPlane(planes[0], width2, height2, bArr, 0, 1);
                            BitmapUtils.unpackPlane(planes[1], width2, height2, bArr, i2 + 1, 2);
                            BitmapUtils.unpackPlane(planes[c], width2, height2, bArr, i2, 2);
                        } else {
                            planes[0].getBuffer().rewind();
                            planes[0].getBuffer().get(bArr, 0, i2);
                            ByteBuffer buffer3 = planes[1].getBuffer();
                            planes[c].getBuffer().get(bArr, i2, 1);
                            buffer3.get(bArr, i2 + 1, ((i2 * 2) / 4) - 1);
                        }
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        wrap.getClass();
                        wrap.rewind();
                        int limit2 = wrap.limit();
                        byte[] bArr2 = new byte[limit2];
                        wrap.get(bArr2, 0, limit2);
                        YuvImage yuvImage = new YuvImage(bArr2, 17, width, height, null);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        yuvImage.compressToJpeg(new Rect(0, 0, width, height), 80, byteArrayOutputStream);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                        byteArrayOutputStream.close();
                        if (rect != null) {
                            decodeByteArray = Bitmap.createBitmap(decodeByteArray, rect.left, rect.top, rect.width(), rect.height());
                        }
                        bitmap = decodeByteArray;
                        bitmap.getClass();
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i);
                        createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        createBitmap.getClass();
                        if (!createBitmap.equals(bitmap)) {
                            bitmap.recycle();
                        }
                        return createBitmap;
                    }
                }
                yuvImage.compressToJpeg(new Rect(0, 0, width, height), 80, byteArrayOutputStream);
                Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                byteArrayOutputStream.close();
                if (rect != null) {
                }
                bitmap = decodeByteArray2;
                bitmap.getClass();
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(i);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                createBitmap.getClass();
                if (!createBitmap.equals(bitmap)) {
                }
                return createBitmap;
            } finally {
            }
            YuvImage yuvImage2 = new YuvImage(bArr2, 17, width, height, null);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        } catch (Exception unused2) {
            return null;
        }
        z = false;
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
        }
        ByteBuffer wrap2 = ByteBuffer.wrap(bArr);
        wrap2.getClass();
        wrap2.rewind();
        int limit22 = wrap2.limit();
        byte[] bArr22 = new byte[limit22];
        wrap2.get(bArr22, 0, limit22);
    }

    public static final ImageToAnalyzeKt$toImageToAnalyze$1 toImageToAnalyze(SettableImageProxy settableImageProxy) {
        try {
            Image image = settableImageProxy.mImage.getImage();
            if (image == null) {
                return null;
            }
            return new ImageToAnalyzeKt$toImageToAnalyze$1(image, settableImageProxy.mImageInfo.getRotationDegrees());
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }

    public static final AvatarImage.LocalIcon toPlaceholder(GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon localIcon, Composer composer) {
        Color color;
        localIcon.getClass();
        zzd zzdVar = Icons.Companion;
        String str = localIcon.iconId;
        zzdVar.getClass();
        Icons icons = zzd.get(str);
        icons.getClass();
        SemanticIconColor semanticIconColor = localIcon.tintColor;
        GapComposer gapComposer = (GapComposer) composer;
        if (semanticIconColor == null) {
            gapComposer.startReplaceGroup(994873712);
            gapComposer.end(false);
            color = null;
        } else {
            gapComposer.startReplaceGroup(724829361);
            long arcadeColor = toArcadeColor(semanticIconColor, gapComposer);
            gapComposer.end(false);
            color = new Color(arcadeColor);
        }
        return new AvatarImage.LocalIcon(icons, color != null ? color.value : Color.Unspecified, 4);
    }

    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                m = "null";
            } else {
                try {
                    m = obj.toString();
                } catch (Exception e) {
                    String m2 = Recorder$$ExternalSyntheticOutline2.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m2), (Throwable) e);
                    m = Boxes$$ExternalSyntheticOutline1.m("<", m2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = m;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
