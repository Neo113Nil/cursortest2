package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\u000b\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R/\u0010*\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00102\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u001f\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b6\u00107R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010>\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u0010\"\u0004\b<\u0010=\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "", "doInvalidate", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLandroidx/compose/ui/graphics/ColorFilter;)V", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "getRoot", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", "", "isDirty", "Z", "Landroidx/compose/ui/graphics/vector/DrawCache;", "cacheDrawScope", "Landroidx/compose/ui/graphics/vector/DrawCache;", "Lkotlin/Function0;", "invalidateCallback", "Lkotlin/jvm/functions/Function0;", "getInvalidateCallback$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateCallback$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "<set-?>", "intrinsicColorFilter$delegate", "Landroidx/compose/runtime/MutableState;", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "value", "viewportWidth", "F", "getViewportWidth", "()F", "setViewportWidth", "(F)V", "viewportHeight", "getViewportHeight", "setViewportHeight", "Landroidx/compose/ui/geometry/Size;", "previousDrawSize", "J", "Lkotlin/Function1;", "drawVectorBlock", "Lkotlin/jvm/functions/Function1;", "getName", "setName", "(Ljava/lang/String;)V", "name", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VectorComponent extends VNode {
    private final DrawCache cacheDrawScope;
    private final Function1 drawVectorBlock;

    /* renamed from: intrinsicColorFilter$delegate, reason: from kotlin metadata */
    private final MutableState intrinsicColorFilter;
    private Function0 invalidateCallback;
    private boolean isDirty;
    private long previousDrawSize;
    private final GroupComponent root;
    private float viewportHeight;
    private float viewportWidth;

    public VectorComponent() {
        super(null);
        GroupComponent groupComponent = new GroupComponent();
        groupComponent.setPivotX(0.0f);
        groupComponent.setPivotY(0.0f);
        groupComponent.setInvalidateListener$ui_release(new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$root$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m1743invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m1743invoke() {
                VectorComponent.this.doInvalidate();
            }
        });
        this.root = groupComponent;
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = new Function0() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m1742invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m1742invoke();
                return Unit.INSTANCE;
            }
        };
        this.intrinsicColorFilter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousDrawSize = Size.INSTANCE.m1340getUnspecifiedNHjbRc();
        this.drawVectorBlock = new Function1() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DrawScope drawScope) {
                Intrinsics.checkNotNullParameter(drawScope, "$this$null");
                VectorComponent.this.getRoot().draw(drawScope);
            }
        };
    }

    public final GroupComponent getRoot() {
        return this.root;
    }

    public final String getName() {
        return this.root.getName();
    }

    public final void setName(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.root.setName(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.mo4828invoke();
    }

    public final void setInvalidateCallback$ui_release(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.invalidateCallback = function0;
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter.getValue();
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.intrinsicColorFilter.setValue(colorFilter);
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public final void setViewportWidth(float f) {
        if (this.viewportWidth == f) {
            return;
        }
        this.viewportWidth = f;
        doInvalidate();
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final void setViewportHeight(float f) {
        if (this.viewportHeight == f) {
            return;
        }
        this.viewportHeight = f;
        doInvalidate();
    }

    public final void draw(DrawScope drawScope, float f, ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui_release();
        }
        if (this.isDirty || !Size.m1332equalsimpl0(this.previousDrawSize, drawScope.mo1708getSizeNHjbRc())) {
            this.root.setScaleX(Size.m1335getWidthimpl(drawScope.mo1708getSizeNHjbRc()) / this.viewportWidth);
            this.root.setScaleY(Size.m1333getHeightimpl(drawScope.mo1708getSizeNHjbRc()) / this.viewportHeight);
            this.cacheDrawScope.m1722drawCachedImageCJJARo(IntSizeKt.IntSize((int) Math.ceil(Size.m1335getWidthimpl(drawScope.mo1708getSizeNHjbRc())), (int) Math.ceil(Size.m1333getHeightimpl(drawScope.mo1708getSizeNHjbRc()))), drawScope, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope.mo1708getSizeNHjbRc();
        }
        this.cacheDrawScope.drawInto(drawScope, f, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        draw(drawScope, 1.0f, null);
    }

    public String toString() {
        String str = "Params: \tname: " + getName() + "\n\tviewportWidth: " + this.viewportWidth + "\n\tviewportHeight: " + this.viewportHeight + "\n";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
