package com.squareup.util.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import com.plaid.internal.EnumC0170g;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class ProgressBarKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ State f$3;

    public /* synthetic */ ProgressBarKt$$ExternalSyntheticLambda0(float f, long j, long j2, State state) {
        this.f$0 = f;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        State state = this.f$3;
        switch (i) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float f = this.f$0;
                float f2 = f / 2.0f;
                float intBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f2) - f2;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f;
                drawScope.mo729drawLineNGM6Ib0(this.f$1, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : f, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                drawScope.mo729drawLineNGM6Ib0(this.f$2, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits((((Number) state.getValue()).floatValue() * intBitsToFloat) + f2) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : f, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            default:
                long j = this.f$1;
                long j2 = this.f$2;
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                if (((Number) state.getValue()).floatValue() < 1.0f) {
                    float f3 = this.f$0;
                    float f4 = f3 / 2.0f;
                    ((Extras.Key) drawScope2.getDrawContext().path).inset(f4, f4, f4, f4);
                    try {
                        DrawScope.m738drawCircleVaOC9Bg$default(drawScope2, j, RecyclerView.DECELERATION_RATE, 0L, new Stroke(f3, RecyclerView.DECELERATION_RATE, 0, 0, null, 30), 0, 110);
                    } finally {
                        float f5 = -f4;
                        ((Extras.Key) drawScope2.getDrawContext().path).inset(f5, f5, f5, f5);
                    }
                }
                if (((Number) state.getValue()).floatValue() > RecyclerView.DECELERATION_RATE) {
                    float floatValue = ((Number) state.getValue()).floatValue();
                    long mo752getCenterF1C5BW0 = drawScope2.mo752getCenterF1C5BW0();
                    GrpcMethod drawContext = drawScope2.getDrawContext();
                    long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        ((Extras.Key) drawContext.path).m1437scale0AR0LA0(floatValue, floatValue, mo752getCenterF1C5BW0);
                        DrawScope.m738drawCircleVaOC9Bg$default(drawScope2, j2, RecyclerView.DECELERATION_RATE, 0L, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    } finally {
                        Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ProgressBarKt$$ExternalSyntheticLambda0(float f, State state, long j, long j2) {
        this.f$0 = f;
        this.f$3 = state;
        this.f$1 = j;
        this.f$2 = j2;
    }
}
