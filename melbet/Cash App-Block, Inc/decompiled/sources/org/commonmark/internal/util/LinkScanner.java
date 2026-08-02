package org.commonmark.internal.util;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.RectF;
import androidx.activity.compose.ActivityResultLauncherHolder;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.camera.core.AspectRatio;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import defpackage.Size$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class LinkScanner {
    public static final ManagedActivityResultLauncher rememberLauncherForActivityResult(ActivityResultContract activityResultContract, Function1 function1, Composer composer) {
        Object overlayKt$$ExternalSyntheticLambda3;
        ActivityResultContract activityResultContract2;
        Object obj;
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(activityResultContract, composer);
        Object rememberUpdatedState2 = Updater.rememberUpdatedState(function1, composer);
        Object[] objArr = new Object[0];
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = new Size$$ExternalSyntheticLambda0(9);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Object obj3 = (String) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
        ActivityResultRegistryOwner activityResultRegistryOwner = (ActivityResultRegistryOwner) gapComposer.consume(LocalActivityResultRegistryOwner.LocalComposition);
        if (activityResultRegistryOwner == null) {
            gapComposer.startReplaceGroup(1213380307);
            Object obj4 = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            while (true) {
                if (!(obj4 instanceof ContextWrapper)) {
                    obj4 = null;
                    break;
                }
                if (obj4 instanceof ActivityResultRegistryOwner) {
                    break;
                }
                obj4 = ((ContextWrapper) obj4).getBaseContext();
            }
            activityResultRegistryOwner = (ActivityResultRegistryOwner) obj4;
        } else {
            gapComposer.startReplaceGroup(1213379439);
        }
        gapComposer.end(false);
        if (activityResultRegistryOwner == null) {
            a$$ExternalSyntheticBUOutline0.m$1("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object activityResultRegistry = activityResultRegistryOwner.getActivityResultRegistry();
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj2) {
            rememberedValue2 = new ActivityResultLauncherHolder();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = new ManagedActivityResultLauncher(activityResultLauncherHolder, rememberUpdatedState);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        ManagedActivityResultLauncher managedActivityResultLauncher = (ManagedActivityResultLauncher) rememberedValue3;
        boolean changedInstance = gapComposer.changedInstance(activityResultLauncherHolder) | gapComposer.changedInstance(activityResultRegistry) | gapComposer.changed(obj3) | gapComposer.changedInstance(activityResultContract) | gapComposer.changed(rememberUpdatedState2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == obj2) {
            activityResultContract2 = activityResultContract;
            obj = activityResultRegistry;
            overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(activityResultLauncherHolder, obj, obj3, activityResultContract2, rememberUpdatedState2, 1);
            gapComposer.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
        } else {
            obj = activityResultRegistry;
            overlayKt$$ExternalSyntheticLambda3 = rememberedValue4;
            activityResultContract2 = activityResultContract;
        }
        Updater.DisposableEffect(obj, obj3, activityResultContract2, (Function1) overlayKt$$ExternalSyntheticLambda3, gapComposer);
        return managedActivityResultLauncher;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int scanLinkDestination(int i, CharSequence charSequence) {
        char charAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n' || charAt == '<') {
                    break;
                }
                if (charAt == '>') {
                    return i + 1;
                }
                if (charAt == '\\') {
                    int i2 = i + 1;
                    if (AspectRatio.isEscapable(i2, charSequence)) {
                        i = i2;
                    }
                }
            }
            return -1;
        }
        int i3 = 0;
        int i4 = i;
        while (i4 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 == 0 || charAt2 == ' ') {
                if (i4 != i) {
                    return i4;
                }
                return -1;
            }
            if (charAt2 == '\\') {
                int i5 = i4 + 1;
                if (AspectRatio.isEscapable(i5, charSequence)) {
                    i4 = i5;
                }
            } else if (charAt2 == '(') {
                i3++;
                if (i3 > 32) {
                    return -1;
                }
            } else if (charAt2 != ')') {
                if (Character.isISOControl(charAt2)) {
                    if (i4 != i) {
                    }
                }
            } else {
                if (i3 == 0) {
                    return i4;
                }
                i3--;
            }
            i4++;
        }
        return charSequence.length();
    }

    public static int scanLinkLabelContent(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (!AspectRatio.isEscapable(i2, charSequence)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int scanLinkTitleContent(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (AspectRatio.isEscapable(i2, charSequence)) {
                    i = i2;
                    i++;
                }
            }
            if (charAt == c) {
                return i;
            }
            if (c == ')' && charAt == '(') {
                return -1;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final RectF unionWith(RectF rectF, RectF rectF2) {
        rectF2.getClass();
        if (rectF == null) {
            return rectF2;
        }
        float f = rectF2.left;
        if (f != rectF2.right && rectF2.top != rectF2.bottom) {
            rectF.union(rectF2);
            return rectF;
        }
        rectF.union(f, rectF2.top);
        rectF.union(rectF2.right, rectF2.bottom);
        return rectF;
    }
}
