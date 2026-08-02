package kotlinx.serialization.descriptors;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.fragment.FragmentKt;
import com.mikepenz.markdown.annotator.AnnotatedStringKtxKt;
import com.mikepenz.markdown.compose.extendedspans.ExtendedSpans;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.investingcrypto.components.common.drawables.ContentMaskDrawable;
import com.squareup.cash.investingcrypto.components.common.drawables.InvestingCryptoDrawables$rippleOnPress$ripple$1;
import com.squareup.cash.mooncake.components.PushOnPressAnimator;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.util.android.Views;
import defpackage.JsonLogicResult;
import kotlin.reflect.KClass;
import kotlinx.coroutines.AwaitKt;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public abstract class ContextAwareKt {
    public static final void InvestingCarouselCard(ViewGroup viewGroup) {
        GradientDrawable roundedRect = FragmentKt.roundedRect(Views.dip((View) viewGroup, 24.0f), ThemeHelpersKt.themeInfo(viewGroup).colorPalette.background);
        viewGroup.setBackground(JsonLogicResult.layerWith(roundedRect, new InvestingCryptoDrawables$rippleOnPress$ripple$1(ColorStateList.valueOf(ThemeHelpersKt.themeInfo(viewGroup).colorPalette.secondaryBackground), null, new ContentMaskDrawable(roundedRect))));
        viewGroup.setStateListAnimator(new PushOnPressAnimator(viewGroup, 30));
    }

    public static final void MarkdownParagraph(String str, ASTNodeImpl aSTNodeImpl, Modifier modifier, TextStyle textStyle, JWECryptoParts jWECryptoParts, Composer composer, int i) {
        Modifier modifier2;
        JWECryptoParts jWECryptoParts2;
        Modifier modifier3;
        int i2;
        JWECryptoParts jWECryptoParts3;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-94693229);
        int i3 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(aSTNodeImpl) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changed(textStyle) ? 2048 : 1024) | PKIFailureInfo.certRevoked;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                JWECryptoParts annotatorSettings = AwaitKt.annotatorSettings(gapComposer);
                modifier3 = Modifier.Companion.$$INSTANCE;
                i2 = i3 & (-57345);
                jWECryptoParts3 = annotatorSettings;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                i2 = i3 & (-57345);
                jWECryptoParts3 = jWECryptoParts;
            }
            gapComposer.endDefaults();
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.pushStyle(textStyle.spanStyle);
            AnnotatedStringKtxKt.buildMarkdownAnnotatedString(builder, str, aSTNodeImpl, jWECryptoParts3);
            builder.pop();
            Modifier modifier4 = modifier3;
            AbstractEncoder.MarkdownText(builder.toAnnotatedString(), aSTNodeImpl, modifier4, textStyle, (ExtendedSpans) null, gapComposer, i2 & 8176);
            jWECryptoParts2 = jWECryptoParts3;
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            jWECryptoParts2 = jWECryptoParts;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(str, aSTNodeImpl, modifier2, textStyle, jWECryptoParts2, i, 1);
        }
    }

    public static final KClass getCapturedKClass(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof ContextDescriptor) {
            return ((ContextDescriptor) serialDescriptor).kClass;
        }
        if (serialDescriptor instanceof SerialDescriptorForNullable) {
            return getCapturedKClass(((SerialDescriptorForNullable) serialDescriptor).original);
        }
        return null;
    }
}
