package com.stripe.android.stripe3ds2.utils;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdi;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import com.stripe.android.stripe3ds2.init.ui.BaseCustomization;
import com.stripe.android.stripe3ds2.init.ui.Customization;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class CustomizeUtils {
    public static final void TransparentCellTheme(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1978625049);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(Colors.copy$default(Strings.getColors(gapComposer), Colors.Component.copy$default(Strings.getColors(gapComposer).component, null, null, Colors.Component.Cell.copy$default(Strings.getColors(gapComposer).component.cell, new Colors.Component.Cell.Background(Color.Unspecified, Strings.getColors(gapComposer).component.cell.background.pressed)), null, null, null, null, 134217695), null, 55), null, null, composableLambdaImpl, gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlaysKt$$ExternalSyntheticLambda1(i, 15, composableLambdaImpl);
        }
    }

    public static SpannableString buildStyledText(AppCompatActivity appCompatActivity, String str, Customization customization) {
        customization.getClass();
        SpannableString spannableString = new SpannableString(str);
        BaseCustomization baseCustomization = (BaseCustomization) customization;
        String str2 = baseCustomization.mTextColor;
        if (str2 != null) {
            spannableString.setSpan(new ForegroundColorSpan(android.graphics.Color.parseColor(str2)), 0, spannableString.length(), 0);
        }
        int i = baseCustomization.mTextFontSize;
        Integer valueOf = Integer.valueOf(i);
        if (i <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, valueOf.intValue(), appCompatActivity.getResources().getDisplayMetrics())), 0, spannableString.length(), 0);
        }
        String str3 = baseCustomization.mTextFontName;
        if (str3 != null) {
            spannableString.setSpan(new TypefaceSpan(str3), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static boolean zzc(Sets$ImprovedAbstractSet sets$ImprovedAbstractSet, Collection collection) {
        collection.getClass();
        if (collection instanceof zzdi) {
            collection = ((zzdi) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= sets$ImprovedAbstractSet.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= sets$ImprovedAbstractSet.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = sets$ImprovedAbstractSet.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
