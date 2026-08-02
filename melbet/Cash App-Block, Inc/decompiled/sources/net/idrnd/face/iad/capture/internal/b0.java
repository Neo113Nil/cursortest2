package net.idrnd.face.iad.capture.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.investing.components.search.InvestingSearchDisclosureKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.search.DisclosureModel;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes9.dex */
public abstract class b0 {
    public static String[] a;

    public static final void InvestingSearchDisclosure(DisclosureModel disclosureModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(925203212);
        int i2 = (gapComposer.changed(disclosureModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-536356025, new InvestingSearchDisclosureKt$$ExternalSyntheticLambda0(disclosureModel, function1), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InvestingSearchDisclosureKt$$ExternalSyntheticLambda0(disclosureModel, function1, i);
        }
    }

    public static String a(int i) {
        if (a == null) {
            byte[] bArr = {125, -17, -67, -115, -29, 103, 39, PnmConstants.PGM_TEXT_CODE, 90, -40, -122, -109, -14, 92, 31, 68, 15, -86, -48, -124, -52, 7, 70, 47, 65, -81, -7, Byte.MIN_VALUE, -19, 3, 95, 36, 78, -33, -100, -57, -116, 41, 83, 7, 79, -124, -60, -74, -40, 40, 107, 3, 98, -28, -3, -108, -13, 115, 77, 69, 95, -88, -79, -58, -82, 41, 11};
            byte[] bArr2 = new byte[63];
            byte[] bArr3 = {47, -63, 19, 58};
            byte b = 0;
            for (int i2 = 0; i2 < 63; i2++) {
                bArr2[i2] = (byte) ((b ^ bArr[i2]) ^ bArr3[i2 & 3]);
                b = bArr[i2];
            }
            a = new String(bArr2, StandardCharsets.UTF_8).split("\n");
        }
        return a[i];
    }
}
