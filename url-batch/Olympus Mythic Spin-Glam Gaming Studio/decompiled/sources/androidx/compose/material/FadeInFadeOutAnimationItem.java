package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012&\u0010\t\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\b¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\b¢\u0006\u0002\b\u0007HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR7\u0010\t\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\b¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/FadeInFadeOutAnimationItem;", "T", "", "key", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/material/FadeInFadeOutTransition;", "transition", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lkotlin/jvm/functions/Function3;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getKey", "Lkotlin/jvm/functions/Function3;", "getTransition", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* data */ class FadeInFadeOutAnimationItem<T> {
    private final Object key;
    private final Function3 transition;

    /* renamed from: component1, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final Function3 getTransition() {
        return this.transition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) other;
        return Intrinsics.areEqual(this.key, fadeInFadeOutAnimationItem.key) && Intrinsics.areEqual(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public int hashCode() {
        Object obj = this.key;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }

    public FadeInFadeOutAnimationItem(Object obj, Function3 transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.key = obj;
        this.transition = transition;
    }

    public final Object getKey() {
        return this.key;
    }
}
