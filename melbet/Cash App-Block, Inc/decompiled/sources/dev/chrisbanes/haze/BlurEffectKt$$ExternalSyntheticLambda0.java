package dev.chrisbanes.haze;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import coil3.size.SizeKt;
import com.google.android.gms.dynamite.zzg;
import com.plaid.internal.EnumC0170g;
import com.squareup.wire.GrpcMethod;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes9.dex */
public final /* synthetic */ class BlurEffectKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ BlurEffectKt$$ExternalSyntheticLambda0(long j, float f, State state) {
        this.$r8$classId = 1;
        this.f$2 = j;
        this.f$1 = f;
        this.f$0 = state;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x02f7, code lost:
    
        if (((int) (r12 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax)) > 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x033a, code lost:
    
        if (((int) (r4 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax)) > 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f0, code lost:
    
        if (((int) (r14 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax)) > 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0236, code lost:
    
        if (((int) (r4 & org.bouncycastle.asn1.cmc.BodyPartID.bodyIdMax)) > 0) goto L81;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fc A[Catch: all -> 0x01f5, TRY_LEAVE, TryCatch #1 {all -> 0x01f5, blocks: (B:47:0x01d5, B:49:0x01db, B:53:0x01e4, B:55:0x01ed, B:58:0x01fc), top: B:46:0x01d5, outer: #4 }] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Snapshot currentThreadSnapshot;
        Function1 readObserver;
        Snapshot makeCurrentNonObservable;
        long j;
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2;
        long j3;
        long j4;
        int i = this.$r8$classId;
        char c = ' ';
        float f = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                HazeEffectNode hazeEffectNode = (HazeEffectNode) obj2;
                long j5 = this.f$2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                Lazy lazy = HazeEffectNodeKt.renderEffectCache$delegate;
                long j6 = hazeEffectNode.backgroundColor;
                if (j6 == 16) {
                    j6 = hazeEffectNode.style.backgroundColor;
                }
                if (j6 == 16) {
                    j6 = hazeEffectNode.compositionLocalStyle.backgroundColor;
                }
                if (j6 != 16) {
                    DrawScope.m747drawRectnJ9OG0$default(drawScope, j6, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                }
                GrpcMethod drawContext = drawScope.getDrawContext();
                long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    long j7 = 0;
                    ((Extras.Key) drawContext.path).m1437scale0AR0LA0(f, f, 0L);
                    long m625minusMKHz9U = Offset.m625minusMKHz9U(j5, hazeEffectNode.positionOnScreen);
                    long j8 = 9187343241974906880L;
                    if (((((m625minusMKHz9U & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || Offset.m622equalsimpl0(m625minusMKHz9U, 0L)) {
                        long j9 = 0;
                        for (HazeArea hazeArea : hazeEffectNode.areas) {
                            if (hazeArea.contentDrawing) {
                                throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                            }
                            currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                            readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                            makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                            try {
                                long m4106getPositionOnScreenF1C5BW0 = hazeArea.m4106getPositionOnScreenF1C5BW0();
                                if ((m4106getPositionOnScreenF1C5BW0 & 9223372034707292159L) == 9205357640488583168L) {
                                    m4106getPositionOnScreenF1C5BW0 = j9;
                                }
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                if (((((m4106getPositionOnScreenF1C5BW0 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == j9) {
                                    j = j9;
                                    if (!Offset.m622equalsimpl0(m4106getPositionOnScreenF1C5BW0, j)) {
                                        intBitsToFloat = Float.intBitsToFloat((int) (m4106getPositionOnScreenF1C5BW0 >> 32));
                                        intBitsToFloat2 = Float.intBitsToFloat((int) (m4106getPositionOnScreenF1C5BW0 & BodyPartID.bodyIdMax));
                                        ((Extras.Key) drawScope.getDrawContext().path).translate(intBitsToFloat, intBitsToFloat2);
                                        try {
                                            GraphicsLayer contentLayer = hazeArea.getContentLayer();
                                            if (contentLayer != null) {
                                                if (contentLayer.isReleased) {
                                                    contentLayer = null;
                                                }
                                                if (contentLayer != null) {
                                                    long j10 = contentLayer.size;
                                                    if (((int) (j10 >> 32)) > 0) {
                                                        break;
                                                    }
                                                }
                                            }
                                            contentLayer = null;
                                            if (contentLayer != null) {
                                                SizeKt.drawLayer(drawScope, contentLayer);
                                            }
                                            ((Extras.Key) drawScope.getDrawContext().path).translate(-intBitsToFloat, -intBitsToFloat2);
                                            j9 = j;
                                        } finally {
                                            ((Extras.Key) drawScope.getDrawContext().path).translate(-intBitsToFloat, -intBitsToFloat2);
                                        }
                                    }
                                } else {
                                    j = j9;
                                }
                                GraphicsLayer contentLayer2 = hazeArea.getContentLayer();
                                if (contentLayer2 != null) {
                                    if (contentLayer2.isReleased) {
                                        contentLayer2 = null;
                                    }
                                    if (contentLayer2 != null) {
                                        long j11 = contentLayer2.size;
                                        if (((int) (j11 >> 32)) > 0) {
                                            break;
                                        }
                                    }
                                }
                                contentLayer2 = null;
                                if (contentLayer2 != null) {
                                    SizeKt.drawLayer(drawScope, contentLayer2);
                                }
                                j9 = j;
                            } finally {
                            }
                        }
                        Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                        return Unit.INSTANCE;
                    }
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (m625minusMKHz9U >> 32));
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (m625minusMKHz9U & BodyPartID.bodyIdMax));
                    ((Extras.Key) drawScope.getDrawContext().path).translate(intBitsToFloat3, intBitsToFloat4);
                    try {
                        for (HazeArea hazeArea2 : hazeEffectNode.areas) {
                            if (hazeArea2.contentDrawing) {
                                throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                            }
                            currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                            readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                            char c2 = c;
                            makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                            try {
                                long m4106getPositionOnScreenF1C5BW02 = hazeArea2.m4106getPositionOnScreenF1C5BW0();
                                if ((m4106getPositionOnScreenF1C5BW02 & 9223372034707292159L) != 9205357640488583168L) {
                                    j2 = j8;
                                    j3 = m4106getPositionOnScreenF1C5BW02;
                                } else {
                                    j2 = j8;
                                    j3 = j7;
                                }
                                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                if (((((j3 & j2) ^ j2) - 4294967297L) & (-9223372034707292160L)) != j7 || Offset.m622equalsimpl0(j3, j7)) {
                                    j4 = j7;
                                    GraphicsLayer contentLayer3 = hazeArea2.getContentLayer();
                                    if (contentLayer3 != null) {
                                        if (contentLayer3.isReleased) {
                                            contentLayer3 = null;
                                        }
                                        if (contentLayer3 != null) {
                                            long j12 = contentLayer3.size;
                                            if (((int) (j12 >> c2)) > 0) {
                                                break;
                                            }
                                        }
                                    }
                                    contentLayer3 = null;
                                    if (contentLayer3 != null) {
                                        SizeKt.drawLayer(drawScope, contentLayer3);
                                    }
                                } else {
                                    intBitsToFloat = Float.intBitsToFloat((int) (j3 >> c2));
                                    intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax));
                                    ((Extras.Key) drawScope.getDrawContext().path).translate(intBitsToFloat, intBitsToFloat2);
                                    try {
                                        GraphicsLayer contentLayer4 = hazeArea2.getContentLayer();
                                        if (contentLayer4 != null) {
                                            if (contentLayer4.isReleased) {
                                                contentLayer4 = null;
                                            }
                                            if (contentLayer4 != null) {
                                                long j13 = contentLayer4.size;
                                                j4 = j7;
                                                if (((int) (j13 >> c2)) > 0) {
                                                    break;
                                                }
                                                contentLayer4 = null;
                                                if (contentLayer4 != null) {
                                                    SizeKt.drawLayer(drawScope, contentLayer4);
                                                }
                                                ((Extras.Key) drawScope.getDrawContext().path).translate(-intBitsToFloat, -intBitsToFloat2);
                                            }
                                        }
                                        j4 = j7;
                                        contentLayer4 = null;
                                        if (contentLayer4 != null) {
                                        }
                                        ((Extras.Key) drawScope.getDrawContext().path).translate(-intBitsToFloat, -intBitsToFloat2);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                j8 = j2;
                                c = c2;
                                j7 = j4;
                            } finally {
                            }
                        }
                        ((Extras.Key) drawScope.getDrawContext().path).translate(-intBitsToFloat3, -intBitsToFloat4);
                        Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        ((Extras.Key) drawScope.getDrawContext().path).translate(-intBitsToFloat3, -intBitsToFloat4);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                    throw th3;
                }
            case 1:
                State state = (State) obj2;
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                float f2 = -((Number) state.getValue()).floatValue();
                long floatToRawIntBits = (Float.floatToRawIntBits(-((Number) state.getValue()).floatValue()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f2) << 32);
                float floatValue = (((Number) state.getValue()).floatValue() * 2.0f) + Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32));
                long floatToRawIntBits2 = (Float.floatToRawIntBits((((Number) state.getValue()).floatValue() * 2.0f) + Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(floatValue) << 32);
                float floatValue2 = ((Number) state.getValue()).floatValue() + f;
                DrawScope.m749drawRoundRectuAw5IA$default(drawScope2, this.f$2, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(floatValue2) & BodyPartID.bodyIdMax), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                return Unit.INSTANCE;
            default:
                DrawScope drawScope3 = (DrawScope) obj;
                drawScope3.getClass();
                DrawScope.m749drawRoundRectuAw5IA$default(drawScope3, this.f$2, 0L, 0L, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax), (Stroke) obj2, EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BlurEffectKt$$ExternalSyntheticLambda0(Object obj, float f, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = j;
    }
}
