package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaselineShift.kt */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift;", "", "", "multiplier", "constructor-impl", "(F)F", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "", "hashCode-impl", "(F)I", "hashCode", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", "F", "getMultiplier", "()F", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BaselineShift {
    private final float multiplier;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float Superscript = m2412constructorimpl(0.5f);
    private static final float Subscript = m2412constructorimpl(-0.5f);
    private static final float None = m2412constructorimpl(0.0f);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaselineShift m2411boximpl(float f) {
        return new BaselineShift(f);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m2412constructorimpl(float f) {
        return f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2413equalsimpl(float f, Object obj) {
        if (obj instanceof BaselineShift) {
            return Intrinsics.areEqual((Object) Float.valueOf(f), (Object) Float.valueOf(((BaselineShift) obj).getMultiplier()));
        }
        return false;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2414equalsimpl0(float f, float f2) {
        return Intrinsics.areEqual((Object) Float.valueOf(f), (Object) Float.valueOf(f2));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2415hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2416toStringimpl(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return m2413equalsimpl(this.multiplier, obj);
    }

    public int hashCode() {
        return m2415hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m2416toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ float getMultiplier() {
        return this.multiplier;
    }

    /* compiled from: BaselineShift.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/BaselineShift;", "None", "F", "getNone-y9eOQZs", "()F", "getNone-y9eOQZs$annotations", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m2418getNoney9eOQZs() {
            return BaselineShift.None;
        }
    }

    private /* synthetic */ BaselineShift(float f) {
        this.multiplier = f;
    }
}
