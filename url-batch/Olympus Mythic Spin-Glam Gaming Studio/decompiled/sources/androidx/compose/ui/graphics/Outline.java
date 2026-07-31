package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Outline.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "", "<init>", "()V", "Generic", "Rectangle", "Rounded", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/graphics/Outline$Generic;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Outline {
    public /* synthetic */ Outline(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Outline() {
    }

    /* compiled from: Outline.kt */
    @Immutable
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rectangle;", "Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/ui/geometry/Rect;", "rect", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/geometry/Rect;", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Rectangle extends Outline {
        private final Rect rect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rectangle(Rect rect) {
            super(null);
            Intrinsics.checkNotNullParameter(rect, "rect");
            this.rect = rect;
        }

        public final Rect getRect() {
            return this.rect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Rectangle) && Intrinsics.areEqual(this.rect, ((Rectangle) other).rect);
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "<init>", "(Landroidx/compose/ui/geometry/RoundRect;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/geometry/RoundRect;", "getRoundRect", "()Landroidx/compose/ui/geometry/RoundRect;", "Landroidx/compose/ui/graphics/Path;", "roundRectPath", "Landroidx/compose/ui/graphics/Path;", "getRoundRectPath$ui_graphics_release", "()Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Rounded extends Outline {
        private final RoundRect roundRect;
        private final Path roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Rounded(RoundRect roundRect) {
            super(0 == true ? 1 : 0);
            boolean hasSameCornerRadius;
            Intrinsics.checkNotNullParameter(roundRect, "roundRect");
            Path path = null;
            this.roundRect = roundRect;
            hasSameCornerRadius = OutlineKt.hasSameCornerRadius(roundRect);
            if (!hasSameCornerRadius) {
                path = AndroidPath_androidKt.Path();
                path.addRoundRect(roundRect);
            }
            this.roundRectPath = path;
        }

        public final RoundRect getRoundRect() {
            return this.roundRect;
        }

        /* renamed from: getRoundRectPath$ui_graphics_release, reason: from getter */
        public final Path getRoundRectPath() {
            return this.roundRectPath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Rounded) && Intrinsics.areEqual(this.roundRect, ((Rounded) other).roundRect);
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/Outline$Generic;", "Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/ui/graphics/Path;", "path", "<init>", "(Landroidx/compose/ui/graphics/Path;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/graphics/Path;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Generic extends Outline {
        private final Path path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Generic(Path path) {
            super(null);
            Intrinsics.checkNotNullParameter(path, "path");
            this.path = path;
        }

        public final Path getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Generic) && Intrinsics.areEqual(this.path, ((Generic) other).path);
        }

        public int hashCode() {
            return this.path.hashCode();
        }
    }
}
