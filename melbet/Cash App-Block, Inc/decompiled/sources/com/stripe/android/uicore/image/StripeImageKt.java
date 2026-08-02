package com.stripe.android.uicore.image;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda16;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class StripeImageKt {

    /* renamed from: lambda$-621553741, reason: not valid java name */
    public static final ComposableLambdaImpl f829lambda$621553741 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(11), false, -621553741);
    public static final ComposableLambdaImpl lambda$1996028391 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(12), false, 1996028391);

    static {
        new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(13), false, -1538042251);
        new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(14), false, 1324557993);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StripeImage(final String str, final DefaultStripeImageLoader defaultStripeImageLoader, final String str2, final Modifier modifier, ContentScale contentScale, ColorFilter colorFilter, Painter painter, Alignment alignment, Function3 function3, Function3 function32, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        ContentScale contentScale2;
        int i5;
        ColorFilter colorFilter2;
        int i6;
        int i7;
        int i8;
        Function3 function33;
        int i9;
        int i10;
        final Painter painter2;
        final Function3 function34;
        GapComposer gapComposer;
        final ContentScale contentScale3;
        final Alignment alignment2;
        final Function3 function35;
        RecomposeScopeImpl endRestartGroup;
        int i11;
        Painter painter3;
        str.getClass();
        defaultStripeImageLoader.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-957894735);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? gapComposer2.changed(defaultStripeImageLoader) : gapComposer2.changedInstance(defaultStripeImageLoader) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i12 = i3 & 16;
        if (i12 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            contentScale2 = contentScale;
            i4 |= gapComposer2.changed(contentScale2) ? 16384 : PKIFailureInfo.certRevoked;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i) == 0) {
                colorFilter2 = colorFilter;
                i4 |= gapComposer2.changed(colorFilter2) ? PKIFailureInfo.unsupportedVersion : 65536;
                i6 = i3 & 64;
                int i13 = 1572864;
                if (i6 == 0) {
                    if ((i & 1572864) == 0) {
                        i13 = (i & PKIFailureInfo.badSenderNonce) == 0 ? gapComposer2.changed(painter) : gapComposer2.changedInstance(painter) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                    i7 = i4 | 113246208;
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i7 = i4 | 918552576;
                    } else if ((805306368 & i) == 0) {
                        function33 = function3;
                        i7 |= gapComposer2.changedInstance(function33) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        i9 = i3 & 1024;
                        if (i9 != 0) {
                            i10 = 6;
                        } else if ((i2 & 6) == 0) {
                            i10 = i2 | (gapComposer2.changedInstance(function32) ? 4 : 2);
                        } else {
                            i10 = i2;
                        }
                        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i10 & 3) != 2)) {
                            if (i12 != 0) {
                                contentScale2 = ContentScale.Companion.Fit;
                            }
                            if (i5 != 0) {
                                colorFilter2 = null;
                            }
                            if (i6 != 0) {
                                painter3 = null;
                                i11 = i8;
                            } else {
                                i11 = i8;
                                painter3 = painter;
                            }
                            BiasAlignment biasAlignment = Alignment.Companion.Center;
                            if (i11 != 0) {
                                function33 = f829lambda$621553741;
                            }
                            Function3 function36 = i9 != 0 ? lambda$1996028391 : function32;
                            int i14 = i7 >> 9;
                            StripeImage(str, defaultStripeImageLoader, null, painter3, Alignment.Companion.TopStart, function33, function36, Expect_jvmKt.rememberComposableLambda(-591598176, new TabToolbarsKt$$ExternalSyntheticLambda16(modifier2, str2, contentScale2, colorFilter2, 7), gapComposer2), gapComposer2, (i7 & 14) | 100859904 | (i7 & 112) | (Painter.$stable << 9) | (i14 & 7168) | ((i7 >> 12) & 57344) | (i14 & 3670016) | ((i10 << 21) & 29360128));
                            painter2 = painter3;
                            function34 = function33;
                            gapComposer = gapComposer2;
                            contentScale3 = contentScale2;
                            alignment2 = biasAlignment;
                            function35 = function36;
                        } else {
                            gapComposer2.skipToGroupEnd();
                            painter2 = painter;
                            function34 = function33;
                            gapComposer = gapComposer2;
                            contentScale3 = contentScale2;
                            alignment2 = alignment;
                            function35 = function32;
                        }
                        final ColorFilter colorFilter3 = colorFilter2;
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new Function2() { // from class: com.stripe.android.uicore.image.StripeImageKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                    StripeImageKt.StripeImage(str, defaultStripeImageLoader, str2, modifier, contentScale3, colorFilter3, painter2, alignment2, function34, function35, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    function33 = function3;
                    i9 = i3 & 1024;
                    if (i9 != 0) {
                    }
                    if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i10 & 3) != 2)) {
                    }
                    final ColorFilter colorFilter32 = colorFilter2;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i13;
                i7 = i4 | 113246208;
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                function33 = function3;
                i9 = i3 & 1024;
                if (i9 != 0) {
                }
                if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i10 & 3) != 2)) {
                }
                final ColorFilter colorFilter322 = colorFilter2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            colorFilter2 = colorFilter;
            i6 = i3 & 64;
            int i132 = 1572864;
            if (i6 == 0) {
            }
            i4 |= i132;
            i7 = i4 | 113246208;
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            function33 = function3;
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i10 & 3) != 2)) {
            }
            final ColorFilter colorFilter3222 = colorFilter2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        contentScale2 = contentScale;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        colorFilter2 = colorFilter;
        i6 = i3 & 64;
        int i1322 = 1572864;
        if (i6 == 0) {
        }
        i4 |= i1322;
        i7 = i4 | 113246208;
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        function33 = function3;
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 306783379) == 306783378 || (i10 & 3) != 2)) {
        }
        final ColorFilter colorFilter32222 = colorFilter2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void StripeImage(String str, DefaultStripeImageLoader defaultStripeImageLoader, Modifier modifier, Painter painter, BiasAlignment biasAlignment, Function3 function3, Function3 function32, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        str.getClass();
        defaultStripeImageLoader.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-784549005);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer2.changed(defaultStripeImageLoader) : gapComposer2.changedInstance(defaultStripeImageLoader) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? gapComposer2.changed(painter) : gapComposer2.changedInstance(painter) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changed(false) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer2.changed(biasAlignment) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer2.changedInstance(function3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer2.changedInstance(function32) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (gapComposer2.shouldExecute(i4 & 1, (38347923 & i4) != 38347922)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            OffsetKt.BoxWithConstraints(companion, null, false, Expect_jvmKt.rememberComposableLambda(-941219235, new StripeImageKt$$ExternalSyntheticLambda2(str, defaultStripeImageLoader, biasAlignment, painter, function3, function32, composableLambdaImpl, 0), gapComposer2), gapComposer, ((i4 >> 6) & 14) | 3072, 6);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StripeImageKt$$ExternalSyntheticLambda3(str, defaultStripeImageLoader, modifier2, painter, biasAlignment, function3, function32, composableLambdaImpl, i, 0);
        }
    }
}
