package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import com.ironsource.C4834q2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b \b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0004*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R!\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR6\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R:\u00101\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001002\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001008\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00107\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010;R*\u0010=\u001a\u00020<2\u0006\u0010!\u001a\u00020<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010C\u001a\u00020<2\u0006\u0010!\u001a\u00020<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR*\u0010F\u001a\u00020<2\u0006\u0010!\u001a\u00020<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010>\u001a\u0004\bG\u0010@\"\u0004\bH\u0010BR*\u0010I\u001a\u00020<2\u0006\u0010!\u001a\u00020<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010>\u001a\u0004\bJ\u0010@\"\u0004\bK\u0010BR*\u0010L\u001a\u00020<2\u0006\u0010!\u001a\u00020<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010>\u001a\u0004\bM\u0010@\"\u0004\bN\u0010BR*\u0010O\u001a\u00020<2\u0006\u0010!\u001a\u00020<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010>\u001a\u0004\bP\u0010@\"\u0004\bQ\u0010BR*\u0010R\u001a\u00020<2\u0006\u0010!\u001a\u00020<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010>\u001a\u0004\bS\u0010@\"\u0004\bT\u0010BR\u0016\u0010U\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010)R\u0014\u0010X\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010[\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bY\u0010Z\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "", "updateClipPath", "updateMatrix", "", "index", C4834q2.p, "insertAt", "(ILandroidx/compose/ui/graphics/vector/VNode;)V", "from", "to", "count", "move", "(III)V", "remove", "(II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/Matrix;", "groupMatrix", "[F", "", "children", "Ljava/util/List;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "value", "clipPathData", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "", "isClipPathDirty", "Z", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/vector/PathParser;", "parser", "Landroidx/compose/ui/graphics/vector/PathParser;", "Lkotlin/Function0;", "invalidateListener", "Lkotlin/jvm/functions/Function0;", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "name", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "", "rotation", "F", "getRotation", "()F", "setRotation", "(F)V", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "isMatrixDirty", "getWillClipPath", "()Z", "willClipPath", "getNumChildren", "()I", "numChildren", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GroupComponent extends VNode {
    private final List children;
    private Path clipPath;
    private List clipPathData;
    private float[] groupMatrix;
    private Function0 invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private String name;
    private PathParser parser;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private float translationX;
    private float translationY;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    public final void setClipPathData(List value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.clipPathData = value;
        this.isClipPathDirty = true;
        invalidate();
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    /* renamed from: getInvalidateListener$ui_release, reason: from getter */
    public Function0 getInvalidateListener() {
        return this.invalidateListener;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(Function0 function0) {
        this.invalidateListener = function0;
        List list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((VNode) list.get(i)).setInvalidateListener$ui_release(function0);
        }
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            PathParser pathParser = this.parser;
            if (pathParser == null) {
                pathParser = new PathParser();
                this.parser = pathParser;
            } else {
                pathParser.clear();
            }
            Path path = this.clipPath;
            if (path == null) {
                path = AndroidPath_androidKt.Path();
                this.clipPath = path;
            } else {
                path.reset();
            }
            pathParser.addPathNodes(this.clipPathData).toPath(path);
        }
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = value;
        invalidate();
    }

    public final void setRotation(float f) {
        this.rotation = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    private final void updateMatrix() {
        float[] fArr = this.groupMatrix;
        if (fArr == null) {
            fArr = Matrix.m1515constructorimpl$default(null, 1, null);
            this.groupMatrix = fArr;
        } else {
            Matrix.m1520resetimpl(fArr);
        }
        Matrix.m1525translateimpl$default(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.m1521rotateZimpl(fArr, this.rotation);
        Matrix.m1522scaleimpl(fArr, this.scaleX, this.scaleY, 1.0f);
        Matrix.m1525translateimpl$default(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    public final void insertAt(int index, VNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (index < getNumChildren()) {
            this.children.set(index, instance);
        } else {
            this.children.add(instance);
        }
        instance.setInvalidateListener$ui_release(getInvalidateListener());
        invalidate();
    }

    public final void move(int from, int to, int count) {
        int i = 0;
        if (from > to) {
            while (i < count) {
                VNode vNode = (VNode) this.children.get(from);
                this.children.remove(from);
                this.children.add(to, vNode);
                to++;
                i++;
            }
        } else {
            while (i < count) {
                VNode vNode2 = (VNode) this.children.get(from);
                this.children.remove(from);
                this.children.add(to - 1, vNode2);
                i++;
            }
        }
        invalidate();
    }

    public final void remove(int index, int count) {
        for (int i = 0; i < count; i++) {
            if (index < this.children.size()) {
                ((VNode) this.children.get(index)).setInvalidateListener$ui_release(null);
                this.children.remove(index);
            }
        }
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo1685getSizeNHjbRc = drawContext.mo1685getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        float[] fArr = this.groupMatrix;
        if (fArr != null) {
            transform.mo1692transform58bKbWc(Matrix.m1513boximpl(fArr).getValues());
        }
        Path path = this.clipPath;
        if (getWillClipPath() && path != null) {
            DrawTransform.m1712clipPathmtrdDE$default(transform, path, 0, 2, null);
        }
        List list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((VNode) list.get(i)).draw(drawScope);
        }
        drawContext.getCanvas().restore();
        drawContext.mo1686setSizeuvyYCjk(mo1685getSizeNHjbRc);
    }

    public final int getNumChildren() {
        return this.children.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.name);
        List list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            VNode vNode = (VNode) list.get(i);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
