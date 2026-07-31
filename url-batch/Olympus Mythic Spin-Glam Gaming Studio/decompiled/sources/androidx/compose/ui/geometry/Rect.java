package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rect.kt */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0001DB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010&R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010&R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010&R\u001a\u00101\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010&R\u001a\u00104\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010(\u001a\u0004\b2\u0010&R#\u00109\u001a\u0002058FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b8\u0010(\u001a\u0004\b6\u00107R\u001a\u0010;\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b:\u00107R\u001a\u0010=\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b<\u00107R\u001a\u0010?\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b>\u00107R\u001a\u0010A\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b@\u00107R\u001a\u0010C\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bB\u00107\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "<init>", "(FFFF)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "translate-k-4lQ0M", "(J)Landroidx/compose/ui/geometry/Rect;", "translate", "translateX", "translateY", "(FF)Landroidx/compose/ui/geometry/Rect;", "other", "intersect", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "", "overlaps", "(Landroidx/compose/ui/geometry/Rect;)Z", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "copy", "(FFFF)Landroidx/compose/ui/geometry/Rect;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "F", "getLeft", "()F", "getLeft$annotations", "()V", "getTop", "getTop$annotations", "getRight", "getRight$annotations", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "getSize-NH-jbRc$annotations", "size", "getTopLeft-F1C5BW0", "topLeft", "getTopRight-F1C5BW0", "topRight", "getCenter-F1C5BW0", "center", "getBottomLeft-F1C5BW0", "bottomLeft", "getBottomRight-F1C5BW0", "bottomRight", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Rect {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public static /* synthetic */ Rect copy$default(Rect rect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rect.left;
        }
        if ((i & 2) != 0) {
            f2 = rect.top;
        }
        if ((i & 4) != 0) {
            f3 = rect.right;
        }
        if ((i & 8) != 0) {
            f4 = rect.bottom;
        }
        return rect.copy(f, f2, f3, f4);
    }

    public final Rect copy(float left, float top, float right, float bottom) {
        return new Rect(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.left), (Object) Float.valueOf(rect.left)) && Intrinsics.areEqual((Object) Float.valueOf(this.top), (Object) Float.valueOf(rect.top)) && Intrinsics.areEqual((Object) Float.valueOf(this.right), (Object) Float.valueOf(rect.right)) && Intrinsics.areEqual((Object) Float.valueOf(this.bottom), (Object) Float.valueOf(rect.bottom));
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    public Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* compiled from: Rect.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "Zero", "Landroidx/compose/ui/geometry/Rect;", "getZero", "()Landroidx/compose/ui/geometry/Rect;", "getZero$annotations", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Rect getZero() {
            return Rect.Zero;
        }
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m1317getSizeNHjbRc() {
        return SizeKt.Size(getWidth(), getHeight());
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m1320translatek4lQ0M(long offset) {
        return new Rect(this.left + Offset.m1297getXimpl(offset), this.top + Offset.m1298getYimpl(offset), this.right + Offset.m1297getXimpl(offset), this.bottom + Offset.m1298getYimpl(offset));
    }

    public final Rect translate(float translateX, float translateY) {
        return new Rect(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    public final Rect intersect(Rect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new Rect(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean overlaps(Rect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m1318getTopLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top);
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m1319getTopRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top);
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m1316getCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top + (getHeight() / 2.0f));
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m1314getBottomLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.bottom);
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m1315getBottomRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.bottom);
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m1313containsk4lQ0M(long offset) {
        return Offset.m1297getXimpl(offset) >= this.left && Offset.m1297getXimpl(offset) < this.right && Offset.m1298getYimpl(offset) >= this.top && Offset.m1298getYimpl(offset) < this.bottom;
    }

    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }
}
