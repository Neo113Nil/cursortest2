package dev.chrisbanes.haze;

import android.content.Context;
import android.renderscript.RenderScript;
import android.view.Surface;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.squareup.util.cash.Countries;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class RenderScriptBlurEffect implements BlurEffect {
    public static boolean isEnabled = true;
    public final GraphicsLayer contentLayer;
    public StandaloneCoroutine currentJob;
    public final CanvasDrawScope drawScope = new CanvasDrawScope();
    public boolean drawSkipped;
    public final HazeEffectNode node;
    public final RenderScript renderScript;
    public RenderScriptContext renderScriptContext;

    public RenderScriptBlurEffect(HazeEffectNode hazeEffectNode) {
        this.node = hazeEffectNode;
        this.renderScript = RenderScript.create((Context) DepthSortedSetKt.currentValueOf(hazeEffectNode, AndroidCompositionLocals_androidKt.LocalContext));
        this.contentLayer = ((GraphicsContext) DepthSortedSetKt.currentValueOf(hazeEffectNode, CompositionLocalsKt.LocalGraphicsContext)).createGraphicsLayer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$updateSurface(RenderScriptBlurEffect renderScriptBlurEffect, GraphicsLayer graphicsLayer, float f, ContinuationImpl continuationImpl) {
        RenderScriptBlurEffect$updateSurface$1 renderScriptBlurEffect$updateSurface$1;
        int i;
        ?? r7;
        ?? r9;
        String str;
        float f2;
        ?? r8;
        int i2;
        int i3;
        int i4;
        RenderScriptContext renderScriptContext;
        int i5;
        ?? r72;
        GraphicsLayer graphicsLayer2;
        String str2;
        HazeEffectNode hazeEffectNode;
        ?? r73;
        GraphicsLayer graphicsLayer3 = graphicsLayer;
        HazeEffectNode hazeEffectNode2 = renderScriptBlurEffect.node;
        try {
            try {
                if (continuationImpl instanceof RenderScriptBlurEffect$updateSurface$1) {
                    RenderScriptBlurEffect$updateSurface$1 renderScriptBlurEffect$updateSurface$12 = (RenderScriptBlurEffect$updateSurface$1) continuationImpl;
                    int i6 = renderScriptBlurEffect$updateSurface$12.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        renderScriptBlurEffect$updateSurface$12.label = i6 - PKIFailureInfo.systemUnavail;
                        renderScriptBlurEffect$updateSurface$1 = renderScriptBlurEffect$updateSurface$12;
                        Object obj = renderScriptBlurEffect$updateSurface$1.result;
                        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = renderScriptBlurEffect$updateSurface$1.label;
                        r7 = 2;
                        r9 = 0;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            r7 = "Haze-RenderScriptBlurEffect-updateSurface";
                            Trace.beginAsyncSection("Haze-RenderScriptBlurEffect-updateSurface", 0);
                            try {
                                long j = graphicsLayer3.size;
                                RenderScriptContext renderScriptContext2 = renderScriptBlurEffect.renderScriptContext;
                                if (renderScriptContext2 == null || !IntSize.m1055equalsimpl0(renderScriptContext2.size, j)) {
                                    if (renderScriptContext2 != null) {
                                        renderScriptContext2.isDestroyed = true;
                                        renderScriptContext2.blurScript.destroy();
                                        renderScriptContext2.inputAlloc.destroy();
                                        renderScriptContext2.outputAlloc.destroy();
                                        renderScriptContext2.rs.destroy();
                                    }
                                    RenderScript renderScript = renderScriptBlurEffect.renderScript;
                                    renderScript.getClass();
                                    renderScriptContext2 = new RenderScriptContext(renderScript, j);
                                    renderScriptBlurEffect.renderScriptContext = renderScriptContext2;
                                }
                                str = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                                Trace.beginAsyncSection("Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface", 0);
                                try {
                                    Surface surface = renderScriptContext2.inputAlloc.getSurface();
                                    surface.getClass();
                                    HazeKt.access$drawGraphicsLayer(surface, graphicsLayer3, DepthSortedSetKt.requireLayoutNode(hazeEffectNode2).density, renderScriptBlurEffect.drawScope);
                                    renderScriptBlurEffect$updateSurface$1.L$0 = graphicsLayer3;
                                    renderScriptBlurEffect$updateSurface$1.L$2 = "Haze-RenderScriptBlurEffect-updateSurface";
                                    renderScriptBlurEffect$updateSurface$1.L$4 = renderScriptContext2;
                                    renderScriptBlurEffect$updateSurface$1.L$7 = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                                    renderScriptBlurEffect$updateSurface$1.F$0 = f;
                                    renderScriptBlurEffect$updateSurface$1.I$0 = 0;
                                    renderScriptBlurEffect$updateSurface$1.I$1 = 0;
                                    renderScriptBlurEffect$updateSurface$1.I$2 = 0;
                                    renderScriptBlurEffect$updateSurface$1.I$3 = 0;
                                    renderScriptBlurEffect$updateSurface$1.I$4 = 0;
                                    renderScriptBlurEffect$updateSurface$1.label = 1;
                                    BufferedChannel bufferedChannel = renderScriptContext2.channel;
                                    bufferedChannel.getClass();
                                    Object receive$suspendImpl = BufferedChannel.receive$suspendImpl(bufferedChannel, renderScriptBlurEffect$updateSurface$1);
                                    if (receive$suspendImpl != obj2) {
                                        receive$suspendImpl = Unit.INSTANCE;
                                    }
                                    if (receive$suspendImpl != obj2) {
                                        f2 = f;
                                        r8 = 0;
                                        i2 = 0;
                                        i3 = 0;
                                        i4 = 0;
                                        renderScriptContext = renderScriptContext2;
                                        i5 = 0;
                                        graphicsLayer2 = graphicsLayer3;
                                        r72 = r7;
                                    }
                                    return obj2;
                                } catch (Throwable th) {
                                    th = th;
                                    Trace.endAsyncSection(str, 0);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                Trace.endAsyncSection(r7, r9);
                                throw th;
                            }
                        }
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ?? r1 = renderScriptBlurEffect$updateSurface$1.I$2;
                            str2 = renderScriptBlurEffect$updateSurface$1.L$7;
                            renderScriptContext = renderScriptBlurEffect$updateSurface$1.L$4;
                            ?? r4 = renderScriptBlurEffect$updateSurface$1.L$2;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                hazeEffectNode = hazeEffectNode2;
                                graphicsLayer3 = r1;
                                renderScriptBlurEffect$updateSurface$1 = r4;
                                Trace.endAsyncSection(str2, 0);
                                android.os.Trace.beginSection(Trace.truncatedTraceSectionLabel("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer"));
                                try {
                                    renderScriptBlurEffect.contentLayer.m754recordmLhObY(DepthSortedSetKt.requireLayoutNode(hazeEffectNode).density, (LayoutDirection) DepthSortedSetKt.currentValueOf(hazeEffectNode, CompositionLocalsKt.LocalLayoutDirection), (r2.getWidth() << 32) | (r2.getHeight() & BodyPartID.bodyIdMax), new KClasses$$Lambda$2(renderScriptContext.outputBitmap, 25));
                                    android.os.Trace.endSection();
                                    r8 = graphicsLayer3;
                                    r73 = renderScriptBlurEffect$updateSurface$1;
                                    Trace.endAsyncSection(r73, r8);
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    android.os.Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                Trace.endAsyncSection(str2, 0);
                                throw th;
                            }
                        }
                        int i7 = renderScriptBlurEffect$updateSurface$1.I$4;
                        int i8 = renderScriptBlurEffect$updateSurface$1.I$3;
                        r8 = renderScriptBlurEffect$updateSurface$1.I$2;
                        i3 = renderScriptBlurEffect$updateSurface$1.I$1;
                        i4 = renderScriptBlurEffect$updateSurface$1.I$0;
                        f2 = renderScriptBlurEffect$updateSurface$1.F$0;
                        str = renderScriptBlurEffect$updateSurface$1.L$7;
                        RenderScriptContext renderScriptContext3 = renderScriptBlurEffect$updateSurface$1.L$4;
                        String str3 = renderScriptBlurEffect$updateSurface$1.L$2;
                        GraphicsLayer graphicsLayer4 = renderScriptBlurEffect$updateSurface$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            i5 = i7;
                            graphicsLayer2 = graphicsLayer4;
                            i2 = i8;
                            renderScriptContext = renderScriptContext3;
                            r72 = str3;
                        } catch (Throwable th5) {
                            th = th5;
                            Trace.endAsyncSection(str, 0);
                            throw th;
                        }
                        Trace.endAsyncSection(str, 0);
                        if (hazeEffectNode2.isAttached()) {
                            r73 = r72;
                        } else {
                            if (f2 > RecyclerView.DECELERATION_RATE) {
                                Trace.beginAsyncSection("Haze-RenderScriptBlurEffect-updateSurface-applyBlur", 0);
                                try {
                                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                                    hazeEffectNode = hazeEffectNode2;
                                    RenderScriptBlurEffect$updateSurface$2$2$1 renderScriptBlurEffect$updateSurface$2$2$1 = new RenderScriptBlurEffect$updateSurface$2$2$1(renderScriptContext, f2, null, r9);
                                    renderScriptBlurEffect$updateSurface$1.L$0 = null;
                                    renderScriptBlurEffect$updateSurface$1.L$2 = r72;
                                    renderScriptBlurEffect$updateSurface$1.L$4 = renderScriptContext;
                                    renderScriptBlurEffect$updateSurface$1.L$7 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                    renderScriptBlurEffect$updateSurface$1.F$0 = f2;
                                    renderScriptBlurEffect$updateSurface$1.I$0 = i4;
                                    renderScriptBlurEffect$updateSurface$1.I$1 = i3;
                                    renderScriptBlurEffect$updateSurface$1.I$2 = r8;
                                    renderScriptBlurEffect$updateSurface$1.I$3 = i2;
                                    renderScriptBlurEffect$updateSurface$1.I$4 = i5;
                                    renderScriptBlurEffect$updateSurface$1.label = 2;
                                    if (JobKt.withContext(defaultScheduler, renderScriptBlurEffect$updateSurface$2$2$1, renderScriptBlurEffect$updateSurface$1) != obj2) {
                                        str2 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                        renderScriptBlurEffect$updateSurface$1 = r72;
                                        graphicsLayer3 = r8;
                                        Trace.endAsyncSection(str2, 0);
                                        android.os.Trace.beginSection(Trace.truncatedTraceSectionLabel("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer"));
                                        renderScriptBlurEffect.contentLayer.m754recordmLhObY(DepthSortedSetKt.requireLayoutNode(hazeEffectNode).density, (LayoutDirection) DepthSortedSetKt.currentValueOf(hazeEffectNode, CompositionLocalsKt.LocalLayoutDirection), (r2.getWidth() << 32) | (r2.getHeight() & BodyPartID.bodyIdMax), new KClasses$$Lambda$2(renderScriptContext.outputBitmap, 25));
                                        android.os.Trace.endSection();
                                        r8 = graphicsLayer3;
                                        r73 = renderScriptBlurEffect$updateSurface$1;
                                    }
                                    return obj2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    str2 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                    Trace.endAsyncSection(str2, 0);
                                    throw th;
                                }
                            }
                            renderScriptBlurEffect.contentLayer.m754recordmLhObY(DepthSortedSetKt.requireLayoutNode(hazeEffectNode2).density, (LayoutDirection) DepthSortedSetKt.currentValueOf(hazeEffectNode2, CompositionLocalsKt.LocalLayoutDirection), graphicsLayer2.size, new KClasses$$Lambda$2(graphicsLayer2, 26));
                            r73 = r72;
                        }
                        Trace.endAsyncSection(r73, r8);
                        return Unit.INSTANCE;
                    }
                }
                if (i != 0) {
                }
                Trace.endAsyncSection(str, 0);
                if (hazeEffectNode2.isAttached()) {
                }
                Trace.endAsyncSection(r73, r8);
                return Unit.INSTANCE;
            } catch (Throwable th7) {
                th = th7;
                r9 = graphicsLayer3;
                r7 = renderScriptBlurEffect$updateSurface$1;
            }
        } catch (Throwable th8) {
            th = th8;
            r9 = 1;
        }
        renderScriptBlurEffect$updateSurface$1 = new RenderScriptBlurEffect$updateSurface$1(renderScriptBlurEffect, continuationImpl);
        Object obj3 = renderScriptBlurEffect$updateSurface$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = renderScriptBlurEffect$updateSurface$1.label;
        r7 = 2;
        r9 = 0;
    }

    @Override // dev.chrisbanes.haze.BlurEffect
    public final void cleanup() {
        StandaloneCoroutine standaloneCoroutine = this.currentJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        ((GraphicsContext) DepthSortedSetKt.currentValueOf(this.node, CompositionLocalsKt.LocalGraphicsContext)).releaseGraphicsLayer(this.contentLayer);
        RenderScriptContext renderScriptContext = this.renderScriptContext;
        if (renderScriptContext != null) {
            renderScriptContext.isDestroyed = true;
            renderScriptContext.blurScript.destroy();
            renderScriptContext.inputAlloc.destroy();
            renderScriptContext.outputAlloc.destroy();
            renderScriptContext.rs.destroy();
        }
    }

    @Override // dev.chrisbanes.haze.BlurEffect
    public final void drawEffect(LayoutNodeDrawScope layoutNodeDrawScope) {
        LayoutNodeDrawScope layoutNodeDrawScope2;
        HazeEffectNode hazeEffectNode;
        StandaloneCoroutine standaloneCoroutine;
        RenderScriptBlurEffect renderScriptBlurEffect = this;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.LocalContext;
        HazeEffectNode hazeEffectNode2 = renderScriptBlurEffect.node;
        Context context = (Context) DepthSortedSetKt.currentValueOf(hazeEffectNode2, staticProvidableCompositionLocal);
        long j = hazeEffectNode2.layerOffset;
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        float m4109calculateInputScaleFactor3ABfNKs$default = HazeEffectNodeKt.m4109calculateInputScaleFactor3ABfNKs$default(hazeEffectNode2);
        ref$FloatRef.element = m4109calculateInputScaleFactor3ABfNKs$default;
        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        layoutNodeDrawScope.getDensity();
        float mo236toPx0680j_4 = layoutNodeDrawScope.mo236toPx0680j_4(HazeEffectNodeKt.resolveBlurRadius(hazeEffectNode2)) * m4109calculateInputScaleFactor3ABfNKs$default;
        ref$FloatRef2.element = mo236toPx0680j_4;
        if (mo236toPx0680j_4 > 25.0f) {
            ref$FloatRef.element = (25.0f / mo236toPx0680j_4) * ref$FloatRef.element;
            ref$FloatRef2.element = 25.0f;
        }
        GraphicsLayer graphicsLayer = renderScriptBlurEffect.contentLayer;
        if (IntSize.m1055equalsimpl0(graphicsLayer.size, 0L) || (standaloneCoroutine = renderScriptBlurEffect.currentJob) == null || !standaloneCoroutine.isActive()) {
            renderScriptBlurEffect.drawSkipped = false;
            GraphicsLayer m4110createScaledContentLayerwZMzALA = HazeKt.m4110createScaledContentLayerwZMzALA(layoutNodeDrawScope, hazeEffectNode2, ref$FloatRef.element, hazeEffectNode2.layerSize, j);
            layoutNodeDrawScope2 = layoutNodeDrawScope;
            if (m4110createScaledContentLayerwZMzALA != null) {
                m4110createScaledContentLayerwZMzALA.setClip(hazeEffectNode2.blurredEdgeTreatment != null);
                Continuation continuation = null;
                if (IntSize.m1055equalsimpl0(graphicsLayer.size, 0L)) {
                    hazeEffectNode = hazeEffectNode2;
                    JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new RenderScriptBlurEffect$drawEffect$2$1(renderScriptBlurEffect, m4110createScaledContentLayerwZMzALA, ref$FloatRef2, continuation, 0));
                    renderScriptBlurEffect = this;
                } else {
                    hazeEffectNode = hazeEffectNode2;
                    CoroutineScope coroutineScope = hazeEffectNode.getCoroutineScope();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    renderScriptBlurEffect = this;
                    renderScriptBlurEffect.currentJob = JobKt.launch$default(coroutineScope, MainDispatcherLoader.dispatcher.immediate, null, new RenderScriptBlurEffect$drawEffect$2$1(renderScriptBlurEffect, m4110createScaledContentLayerwZMzALA, ref$FloatRef2, continuation, 1), 2);
                }
            } else {
                hazeEffectNode = hazeEffectNode2;
            }
        } else {
            renderScriptBlurEffect.drawSkipped = true;
            layoutNodeDrawScope2 = layoutNodeDrawScope;
            hazeEffectNode = hazeEffectNode2;
        }
        GraphicsContext graphicsContext = (GraphicsContext) DepthSortedSetKt.currentValueOf(hazeEffectNode, CompositionLocalsKt.LocalGraphicsContext);
        GraphicsLayer createGraphicsLayer = graphicsContext.createGraphicsLayer();
        try {
            createGraphicsLayer.getClass();
            createGraphicsLayer.setAlpha(hazeEffectNode.alpha);
            Lazy lazy = HazeEffectNodeKt.renderEffectCache$delegate;
            createGraphicsLayer.setClip(hazeEffectNode.blurredEdgeTreatment != null);
            layoutNodeDrawScope2.m876recordJVtK1S4(Countries.m3990toIntSizeuvyYCjk(layoutNodeDrawScope2.canvasDrawScope.mo753getSizeNHjbRc()), createGraphicsLayer, new MultiParagraph$$ExternalSyntheticLambda0(j, ref$FloatRef, renderScriptBlurEffect, context));
            SizeKt.drawLayer(layoutNodeDrawScope2, createGraphicsLayer);
        } finally {
            graphicsContext.releaseGraphicsLayer(createGraphicsLayer);
        }
    }
}
