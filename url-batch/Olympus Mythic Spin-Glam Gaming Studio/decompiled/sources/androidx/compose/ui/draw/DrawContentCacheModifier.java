package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/ui/draw/DrawContentCacheModifier;", "Landroidx/compose/ui/draw/DrawCacheModifier;", "Landroidx/compose/ui/draw/CacheDrawScope;", "cacheDrawScope", "Lkotlin/Function1;", "Landroidx/compose/ui/draw/DrawResult;", "onBuildDrawCache", "<init>", "(Landroidx/compose/ui/draw/CacheDrawScope;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "params", "", "onBuildCache", "(Landroidx/compose/ui/draw/BuildDrawCacheParams;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/draw/CacheDrawScope;", "getCacheDrawScope", "()Landroidx/compose/ui/draw/CacheDrawScope;", "Lkotlin/jvm/functions/Function1;", "getOnBuildDrawCache", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class DrawContentCacheModifier implements DrawCacheModifier {
    private final CacheDrawScope cacheDrawScope;
    private final Function1 onBuildDrawCache;

    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.cacheDrawScope + ", onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }

    public DrawContentCacheModifier(CacheDrawScope cacheDrawScope, Function1 onBuildDrawCache) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        this.cacheDrawScope = cacheDrawScope;
        this.onBuildDrawCache = onBuildDrawCache;
    }

    @Override // androidx.compose.ui.draw.DrawCacheModifier
    public void onBuildCache(BuildDrawCacheParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        CacheDrawScope cacheDrawScope = this.cacheDrawScope;
        cacheDrawScope.setCacheParams$ui_release(params);
        cacheDrawScope.setDrawResult$ui_release(null);
        this.onBuildDrawCache.invoke(cacheDrawScope);
        if (cacheDrawScope.getDrawResult() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
        }
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        DrawResult drawResult = this.cacheDrawScope.getDrawResult();
        Intrinsics.checkNotNull(drawResult);
        drawResult.getBlock().invoke(contentDrawScope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawContentCacheModifier)) {
            return false;
        }
        DrawContentCacheModifier drawContentCacheModifier = (DrawContentCacheModifier) other;
        return Intrinsics.areEqual(this.cacheDrawScope, drawContentCacheModifier.cacheDrawScope) && Intrinsics.areEqual(this.onBuildDrawCache, drawContentCacheModifier.onBuildDrawCache);
    }

    public int hashCode() {
        return (this.cacheDrawScope.hashCode() * 31) + this.onBuildDrawCache.hashCode();
    }
}
