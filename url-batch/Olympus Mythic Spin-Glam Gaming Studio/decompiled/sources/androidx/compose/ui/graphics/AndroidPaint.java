package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;

/* compiled from: AndroidPaint.android.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001f\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R.\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R-\u0010#\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R-\u0010,\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R-\u00100\u001a\u00020-2\u0006\u0010\u0015\u001a\u00020-8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R$\u00103\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R-\u00107\u001a\u0002042\u0006\u0010\u0015\u001a\u0002048V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b5\u0010)\"\u0004\b6\u0010+R-\u0010;\u001a\u0002082\u0006\u0010\u0015\u001a\u0002088V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b9\u0010)\"\u0004\b:\u0010+R$\u0010>\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u0010\u001e\"\u0004\b=\u0010 R-\u0010B\u001a\u00020?2\u0006\u0010\u0015\u001a\u00020?8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R4\u0010G\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u000e\u0010\u0015\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010L\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPaint;", "Landroidx/compose/ui/graphics/Paint;", "<init>", "()V", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "asFrameworkPaint", "()Landroid/graphics/Paint;", "internalPaint", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/BlendMode;", "_blendMode", "I", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "internalShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/ColorFilter;", "internalColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/PathEffect;", "value", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "setPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;)V", "", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Landroidx/compose/ui/graphics/Color;", "color", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/PaintingStyle;", "getStyle-TiuSbCo", "setStyle-k9PVt8s", "style", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getStrokeCap-KaPHkGw", "setStrokeCap-BeK7IIE", "strokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeJoin-LxFBmk8", "setStrokeJoin-Ww9F2mQ", "strokeJoin", "getStrokeMiterLimit", "setStrokeMiterLimit", "strokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I", "setFilterQuality-vDHp3xo", "filterQuality", "getShader", "()Landroid/graphics/Shader;", "setShader", "(Landroid/graphics/Shader;)V", "shader", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidPaint implements Paint {
    private ColorFilter internalColorFilter;
    private Shader internalShader;
    private PathEffect pathEffect;
    private android.graphics.Paint internalPaint = AndroidPaint_androidKt.makeNativePaint();
    private int _blendMode = BlendMode.INSTANCE.m1421getSrcOver0nO6VwU();

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: asFrameworkPaint, reason: from getter */
    public android.graphics.Paint getInternalPaint() {
        return this.internalPaint;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setAlpha(float f) {
        AndroidPaint_androidKt.setNativeAlpha(this.internalPaint, f);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo1362getColor0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public void mo1367setColor8_81llA(long j) {
        AndroidPaint_androidKt.m1373setNativeColor4WTKRHQ(this.internalPaint, j);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public int get_blendMode() {
        return this._blendMode;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public void mo1366setBlendModes9anfk8(int i) {
        this._blendMode = i;
        AndroidPaint_androidKt.m1372setNativeBlendModeGB0RdKg(this.internalPaint, i);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStyle-k9PVt8s, reason: not valid java name */
    public void mo1371setStylek9PVt8s(int i) {
        AndroidPaint_androidKt.m1377setNativeStyle5YerkU(this.internalPaint, i);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setStrokeWidth(float f) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.internalPaint, f);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStrokeCap-KaPHkGw, reason: not valid java name */
    public int mo1364getStrokeCapKaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStrokeCap-BeK7IIE, reason: not valid java name */
    public void mo1369setStrokeCapBeK7IIE(int i) {
        AndroidPaint_androidKt.m1375setNativeStrokeCapCSYIeUk(this.internalPaint, i);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getStrokeJoin-LxFBmk8, reason: not valid java name */
    public int mo1365getStrokeJoinLxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setStrokeJoin-Ww9F2mQ, reason: not valid java name */
    public void mo1370setStrokeJoinWw9F2mQ(int i) {
        AndroidPaint_androidKt.m1376setNativeStrokeJoinkLtJ_vA(this.internalPaint, i);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setStrokeMiterLimit(float f) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.internalPaint, f);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getFilterQuality-f-v9h1I, reason: not valid java name */
    public int mo1363getFilterQualityfv9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: setFilterQuality-vDHp3xo, reason: not valid java name */
    public void mo1368setFilterQualityvDHp3xo(int i) {
        AndroidPaint_androidKt.m1374setNativeFilterQuality50PEsBU(this.internalPaint, i);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getShader, reason: from getter */
    public Shader getInternalShader() {
        return this.internalShader;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setShader(Shader shader) {
        this.internalShader = shader;
        AndroidPaint_androidKt.setNativeShader(this.internalPaint, shader);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* renamed from: getColorFilter, reason: from getter */
    public ColorFilter getInternalColorFilter() {
        return this.internalColorFilter;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setColorFilter(ColorFilter colorFilter) {
        this.internalColorFilter = colorFilter;
        AndroidPaint_androidKt.setNativeColorFilter(this.internalPaint, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setPathEffect(PathEffect pathEffect) {
        AndroidPaint_androidKt.setNativePathEffect(this.internalPaint, pathEffect);
        this.pathEffect = pathEffect;
    }
}
