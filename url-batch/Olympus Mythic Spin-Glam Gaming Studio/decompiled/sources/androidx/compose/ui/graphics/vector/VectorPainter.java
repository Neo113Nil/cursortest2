package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VectorPainter.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0002¢\u0006\u0004\b\f\u0010\rJF\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u001d\u0010\u0012\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\b*\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 R4\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010/\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R+\u00106\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010$\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\u0016\u00108\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R(\u0010A\u001a\u0004\u0018\u00010\u001d2\b\u0010<\u001a\u0004\u0018\u00010\u001d8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001d\u0010C\u001a\u00020!8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bB\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "<init>", "()V", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function2;", "", "", "Landroidx/compose/runtime/Composable;", "composable", "Landroidx/compose/runtime/Composition;", "composeVector", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function4;)Landroidx/compose/runtime/Composition;", "", "name", "viewportWidth", "viewportHeight", "content", "RenderVector$ui_release", "(Ljava/lang/String;FFLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "RenderVector", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/geometry/Size;", "<set-?>", "size$delegate", "Landroidx/compose/runtime/MutableState;", "getSize-NH-jbRc$ui_release", "()J", "setSize-uvyYCjk$ui_release", "(J)V", "size", "autoMirror$delegate", "getAutoMirror$ui_release", "()Z", "setAutoMirror$ui_release", "(Z)V", "autoMirror", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "vector", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "composition", "Landroidx/compose/runtime/Composition;", "isDirty$delegate", "isDirty", "setDirty", "currentAlpha", "F", "currentColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    private Composition composition;
    private float currentAlpha;
    private ColorFilter currentColorFilter;

    /* renamed from: isDirty$delegate, reason: from kotlin metadata */
    private final MutableState isDirty;
    private final VectorComponent vector;

    /* renamed from: size$delegate, reason: from kotlin metadata */
    private final MutableState size = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1329boximpl(Size.INSTANCE.m1341getZeroNHjbRc()), null, 2, null);

    /* renamed from: autoMirror$delegate, reason: from kotlin metadata */
    private final MutableState autoMirror = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.setInvalidateCallback$ui_release(new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m1750invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m1750invoke() {
                VectorPainter.this.setDirty(true);
            }
        });
        this.vector = vectorComponent;
        this.isDirty = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.currentAlpha = 1.0f;
    }

    /* renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m1748getSizeNHjbRc$ui_release() {
        return ((Size) this.size.getValue()).getPackedValue();
    }

    /* renamed from: setSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m1749setSizeuvyYCjk$ui_release(long j) {
        this.size.setValue(Size.m1329boximpl(j));
    }

    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror.getValue()).booleanValue();
    }

    public final void setAutoMirror$ui_release(boolean z) {
        this.autoMirror.setValue(Boolean.valueOf(z));
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    private final Composition composeVector(CompositionContext parent, final Function4 composable) {
        Composition composition = this.composition;
        if (composition == null || composition.isDisposed()) {
            composition = CompositionKt.Composition(new VectorApplier(this.vector.getRoot()), parent);
        }
        this.composition = composition;
        composition.setContent(ComposableLambdaKt.composableLambdaInstance(-1916507005, true, new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$composeVector$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                VectorComponent vectorComponent;
                VectorComponent vectorComponent2;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                Function4 function4 = Function4.this;
                vectorComponent = this.vector;
                Float valueOf = Float.valueOf(vectorComponent.getViewportWidth());
                vectorComponent2 = this.vector;
                function4.invoke(valueOf, Float.valueOf(vectorComponent2.getViewportHeight()), composer, 0);
            }
        }));
        return composition;
    }

    private final boolean isDirty() {
        return ((Boolean) this.isDirty.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDirty(boolean z) {
        this.isDirty.setValue(Boolean.valueOf(z));
    }

    public final void RenderVector$ui_release(final String name, final float f, final float f2, final Function4 content, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1264894527);
        VectorComponent vectorComponent = this.vector;
        vectorComponent.setName(name);
        vectorComponent.setViewportWidth(f);
        vectorComponent.setViewportHeight(f2);
        final Composition composeVector = composeVector(ComposablesKt.rememberCompositionContext(startRestartGroup, 0), content);
        EffectsKt.DisposableEffect(composeVector, new Function1() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final Composition composition = Composition.this;
                return new DisposableEffectResult() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        Composition.this.dispose();
                    }
                };
            }
        }, startRestartGroup, 8);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                VectorPainter.this.RenderVector$ui_release(name, f, f2, content, composer2, i | 1);
            }
        });
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        return m1748getSizeNHjbRc$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        VectorComponent vectorComponent = this.vector;
        ColorFilter colorFilter = this.currentColorFilter;
        if (colorFilter == null) {
            colorFilter = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long mo1707getCenterF1C5BW0 = drawScope.mo1707getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo1685getSizeNHjbRc = drawContext.mo1685getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo1691scale0AR0LA0(-1.0f, 1.0f, mo1707getCenterF1C5BW0);
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
            drawContext.getCanvas().restore();
            drawContext.mo1686setSizeuvyYCjk(mo1685getSizeNHjbRc);
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
        }
        if (isDirty()) {
            setDirty(false);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }
}
