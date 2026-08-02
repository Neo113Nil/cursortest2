package net.idrnd.misnap.iad;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.miteksystems.misnap.camera.a.b;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.components.stock.details.InvestingAnalystOptionsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewModel$Content;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import net.idrnd.face.iad.capture.internal.i;
import net.idrnd.face.iad.capture.internal.j;
import net.idrnd.face.iad.capture.internal.k;
import net.idrnd.face.iad.capture.internal.l;
import net.idrnd.face.iad.capture.internal.m;
import net.idrnd.face.iad.capture.internal.n;
import net.idrnd.face.iad.capture.internal.o;
import net.idrnd.face.iad.capture.internal.p;
import net.idrnd.face.iad.capture.internal.p3;
import net.idrnd.face.iad.capture.internal.q3;
import net.idrnd.face.iad.capture.internal.r3;
import net.idrnd.face.iad.capture.internal.s3;
import net.idrnd.face.iad.capture.internal.t3;
import net.idrnd.face.iad.capture.internal.w3;
import net.idrnd.face.iad.capture.internal.x3;
import net.idrnd.misnap.iad.ProcessError;
import net.idrnd.misnap.iad.Result;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes9.dex */
public abstract class a {
    public static final void InvestingAnalystOptions(X509CertChainUtils x509CertChainUtils, Function1 function1, Modifier modifier, Composer composer, int i) {
        x509CertChainUtils.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1519319683);
        int i2 = (gapComposer.changed(x509CertChainUtils) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (!(x509CertChainUtils instanceof InvestingAnalystOpinionsViewModel$Content)) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new InvestingAnalystOptionsKt$$ExternalSyntheticLambda0(x509CertChainUtils, function1, i);
                    return;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1555261870, new InvestingAnalystOptionsKt$$ExternalSyntheticLambda0(x509CertChainUtils, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(i, 10, modifier2, x509CertChainUtils, function1);
        }
    }

    public static Result a(b bVar) {
        CaptureError$UnknownError captureError$UnknownError;
        if (!(bVar instanceof w3)) {
            if (bVar instanceof x3) {
                return new Result.Success(new CaptureResult$PayloadCreated(new Payload(((p) ((x3) bVar).a).a.a, 0)));
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        o oVar = (o) ((w3) bVar).a;
        if (oVar instanceof i) {
            captureError$UnknownError = CaptureError$UnknownError.INSTANCE$1;
        } else if (oVar instanceof n) {
            captureError$UnknownError = CaptureError$UnknownError.INSTANCE;
        } else if (oVar instanceof l) {
            captureError$UnknownError = CaptureError$UnknownError.INSTANCE$4;
        } else if (oVar instanceof j) {
            captureError$UnknownError = CaptureError$UnknownError.INSTANCE$2;
        } else if (oVar instanceof k) {
            captureError$UnknownError = CaptureError$UnknownError.INSTANCE$3;
        } else {
            if (!(oVar instanceof m)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            captureError$UnknownError = CaptureError$UnknownError.INSTANCE$5;
        }
        return new Result.Failure(captureError$UnknownError);
    }

    public static Result b(b bVar) {
        ReadyToCapture readyToCapture;
        Object obj;
        if (bVar instanceof w3) {
            s3 s3Var = (s3) ((w3) bVar).a;
            if (s3Var instanceof q3) {
                obj = ProcessError.ImageSizeInvalid.INSTANCE;
            } else if (s3Var instanceof r3) {
                obj = ProcessError.ImageTimestampInvalid.INSTANCE;
            } else {
                if (!(s3Var instanceof p3)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                obj = ProcessError.CaptureCoreClosed.INSTANCE;
            }
            return new Result.Failure(obj);
        }
        if (!(bVar instanceof x3)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        int ordinal = ((t3) ((x3) bVar).a).a.ordinal();
        if (ordinal == 0) {
            readyToCapture = ReadyToCapture.Yes;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            readyToCapture = ReadyToCapture.No;
        }
        return new Result.Success(new ProcessResult$FrameProcessed(readyToCapture));
    }
}
