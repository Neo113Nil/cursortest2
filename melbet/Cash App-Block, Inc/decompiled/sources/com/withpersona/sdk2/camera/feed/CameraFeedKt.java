package com.withpersona.sdk2.camera.feed;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.compose.AsyncImageKt;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.squareup.cash.R;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.protos.cash.genericelements.ui.AvatarElement;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.Countries;
import com.withpersona.sdk2.camera.CameraController;

/* loaded from: classes4.dex */
public abstract class CameraFeedKt {
    public static zzk zza;

    public static final void AvatarBadge(Modifier modifier, AvatarElement.Badge badge, Image image, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        Modifier.Companion companion;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(199053972);
        int i2 = i | 6 | (gapComposer2.changed(badge.ordinal()) ? 32 : 16) | (gapComposer2.changedInstance(image) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int ordinal = badge.ordinal();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (ordinal == 0) {
                companion = companion2;
                gapComposer2.startReplaceGroup(-1332816205);
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 22.0f), MooncakeTheme.getColors(gapComposer2).background, RoundedCornerShapeKt.CircleShape), 2.0f);
                Painter painterResource = Countries.painterResource(R.drawable.mooncake_checked, 0, gapComposer2);
                long j = MooncakeTheme.getColors(gapComposer2).green;
                ImageKt.Image(painterResource, null, m298padding3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 48, 56);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer2.startReplaceGroup(-1332444887);
                Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion2, 22.0f), MooncakeTheme.getColors(gapComposer2).green, RoundedCornerShapeKt.CircleShape), 2.0f);
                Painter painterResource2 = Countries.painterResource(R.drawable.loyalty_star, 0, gapComposer2);
                long j2 = Color.White;
                companion = companion2;
                ImageKt.Image(painterResource2, null, m298padding3ABfNKs2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 1572912, 56);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -1982657289, false);
                }
                gapComposer2.startReplaceGroup(-1332021892);
                image.getClass();
                gapComposer = gapComposer2;
                AsyncImageKt.m1438AsyncImage10Xjiaw(ComposeUtilsKt.getThemedUrl(image, gapComposer2), null, SizeKt.m285size3ABfNKs(companion2, 22.0f), null, null, null, gapComposer, 48, 2040);
                gapComposer.end(false);
                companion = companion2;
            }
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(i, 27, modifier2, badge, image);
        }
    }

    public static final void GenericAvatar(GenericBaseViewModel.AvatarViewModel avatarViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Color forThemeComposable;
        long j;
        BlendModeColorFilter blendModeColorFilter;
        BlendModeColorFilter blendModeColorFilter2;
        int i3;
        ComposableLambdaImpl composableLambdaImpl;
        avatarViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-687256737);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(avatarViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ThemeInfo themeInfo = ThemeHelpersKt.themeInfo((Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext));
            String urlForTheme = ThemablesKt.urlForTheme(avatarViewModel.image, themeInfo);
            ColorModel colorModel = avatarViewModel.backgroundColor;
            if (colorModel == null) {
                gapComposer2.startReplaceGroup(43877373);
                gapComposer2.end(false);
                forThemeComposable = null;
            } else {
                gapComposer2.startReplaceGroup(971246724);
                forThemeComposable = PagerMeasureKt.forThemeComposable(colorModel, themeInfo, gapComposer2);
                gapComposer2.end(false);
            }
            if (forThemeComposable == null) {
                gapComposer2.startReplaceGroup(971248681);
                j = MooncakeTheme.getColors(gapComposer2).background;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(971246046);
                gapComposer2.end(false);
                j = forThemeComposable.value;
            }
            if (themeInfo.theme == Theme.MooncakeDark) {
                long j2 = Color.White;
                blendModeColorFilter = new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5)));
            } else {
                long j3 = Color.Black;
                blendModeColorFilter = new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5)));
            }
            if (avatarViewModel.colorizeAvatar) {
                long j4 = Color.White;
                blendModeColorFilter2 = new BlendModeColorFilter(j4, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j4), ColorKt.m693toAndroidBlendModes9anfk8(5)));
            } else {
                blendModeColorFilter2 = null;
            }
            float f = avatarViewModel.size.value;
            int i4 = i2;
            String str = avatarViewModel.contentDescription;
            AvatarElement.Badge badge = avatarViewModel.badge;
            if (badge == null) {
                gapComposer2.startReplaceGroup(44492320);
                gapComposer2.end(false);
                i3 = 21;
                composableLambdaImpl = null;
            } else {
                gapComposer2.startReplaceGroup(44492321);
                i3 = 21;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(957934577, new ErrorView$$ExternalSyntheticLambda1(i3, badge, avatarViewModel), gapComposer2);
                gapComposer2.end(false);
                composableLambdaImpl = rememberComposableLambda;
            }
            gapComposer = gapComposer2;
            BadgedAvatarKt.m3409BadgedAvatarRYf9XWw(modifier, urlForTheme, str, blendModeColorFilter2, blendModeColorFilter, j, null, null, 0L, null, f, RecyclerView.DECELERATION_RATE, null, 0L, null, null, composableLambdaImpl, null, gapComposer, (i4 >> 3) & 14, 0, 0, 1568704);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(avatarViewModel, modifier, i, 21);
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        zzae.checkNotNull(bitmap, "image must not be null");
        try {
            zzk zzkVar = zza;
            zzae.checkNotNull(zzkVar, "IBitmapDescriptorFactory is not initialized");
            zzi zziVar = (zzi) zzkVar;
            Parcel zza2 = zziVar.zza();
            zzc.zze(zza2, bitmap);
            Parcel zzJ = zziVar.zzJ(zza2, 6);
            IObjectWrapper asInterface = ObjectWrapper.asInterface(zzJ.readStrongBinder());
            zzJ.recycle();
            return new BitmapDescriptor(asInterface);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public static final void updateViewfinderRect(CameraFeed cameraFeed, CameraController cameraController, View view) {
        cameraFeed.getClass();
        cameraController.getClass();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
        View previewView = cameraController.getPreviewView();
        previewView.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        cameraFeed.setViewfinderRect(rect, new Rect(i2, iArr[1], previewView.getWidth() + i2, previewView.getHeight() + iArr[1]));
    }
}
