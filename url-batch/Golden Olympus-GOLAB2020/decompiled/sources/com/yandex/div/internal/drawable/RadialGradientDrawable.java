package com.yandex.div.internal.drawable;

import W1.h;
import W1.i;
import W1.m;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class RadialGradientDrawable extends Drawable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private Center centerX;

    @NotNull
    private Center centerY;

    @NotNull
    private int[] colors;

    @NotNull
    private final Paint paint;

    @NotNull
    private Radius radius;

    @NotNull
    private RectF rect;

    @Metadata
    public static abstract class Center {

        @Metadata
        public static final class Fixed extends Center {
            private final float value;

            public Fixed(float f4) {
                super(null);
                this.value = f4;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.value, ((Fixed) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            @NotNull
            public String toString() {
                return "Fixed(value=" + this.value + ')';
            }
        }

        @Metadata
        public static final class Relative extends Center {
            private final float value;

            public Relative(float f4) {
                super(null);
                this.value = f4;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && Float.compare(this.value, ((Relative) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            @NotNull
            public String toString() {
                return "Relative(value=" + this.value + ')';
            }
        }

        public /* synthetic */ Center(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Center() {
        }
    }

    @Metadata
    public static final class Companion {

        @Metadata
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Radius.Relative.Type.values().length];
                try {
                    iArr[Radius.Relative.Type.NEAREST_CORNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_CORNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Radius.Relative.Type.NEAREST_SIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_SIDE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distTo(float f4, float f5, float f6, float f7) {
            double d4 = 2;
            return (float) Math.sqrt(((float) Math.pow(f4 - f6, d4)) + ((float) Math.pow(f5 - f7, d4)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToHorizontalSide(float f4, float f5) {
            return Math.abs(f4 - f5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToVerticalSide(float f4, float f5) {
            return Math.abs(f4 - f5);
        }

        private static final Float[] createRadialGradient$lambda$0(h hVar) {
            return (Float[]) hVar.getValue();
        }

        private static final Float[] createRadialGradient$lambda$1(h hVar) {
            return (Float[]) hVar.getValue();
        }

        private static final float createRadialGradient$value(Center center, int i4) {
            if (center instanceof Center.Fixed) {
                return ((Center.Fixed) center).getValue();
            }
            if (center instanceof Center.Relative) {
                return ((Center.Relative) center).getValue() * i4;
            }
            throw new m();
        }

        @NotNull
        public final RadialGradient createRadialGradient(@NotNull Radius radius, @NotNull Center centerX, @NotNull Center centerY, @NotNull int[] colors, int i4, int i5) {
            float floatValue;
            Intrinsics.checkNotNullParameter(radius, "radius");
            Intrinsics.checkNotNullParameter(centerX, "centerX");
            Intrinsics.checkNotNullParameter(centerY, "centerY");
            Intrinsics.checkNotNullParameter(colors, "colors");
            float createRadialGradient$value = createRadialGradient$value(centerX, i4);
            float createRadialGradient$value2 = createRadialGradient$value(centerY, i5);
            float f4 = i4;
            float f5 = i5;
            h b4 = i.b(new RadialGradientDrawable$Companion$createRadialGradient$distancesToCorners$2(0.0f, 0.0f, f4, f5, createRadialGradient$value, createRadialGradient$value2));
            h b5 = i.b(new RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2(0.0f, f4, f5, 0.0f, createRadialGradient$value, createRadialGradient$value2));
            if (radius instanceof Radius.Fixed) {
                floatValue = ((Radius.Fixed) radius).getValue();
            } else {
                if (!(radius instanceof Radius.Relative)) {
                    throw new m();
                }
                int i6 = WhenMappings.$EnumSwitchMapping$0[((Radius.Relative) radius).getType().ordinal()];
                if (i6 == 1) {
                    Float r02 = AbstractC3219i.r0(createRadialGradient$lambda$0(b4));
                    Intrinsics.checkNotNull(r02);
                    floatValue = r02.floatValue();
                } else if (i6 == 2) {
                    Float q02 = AbstractC3219i.q0(createRadialGradient$lambda$0(b4));
                    Intrinsics.checkNotNull(q02);
                    floatValue = q02.floatValue();
                } else if (i6 == 3) {
                    Float r03 = AbstractC3219i.r0(createRadialGradient$lambda$1(b5));
                    Intrinsics.checkNotNull(r03);
                    floatValue = r03.floatValue();
                } else {
                    if (i6 != 4) {
                        throw new m();
                    }
                    Float q03 = AbstractC3219i.q0(createRadialGradient$lambda$1(b5));
                    Intrinsics.checkNotNull(q03);
                    floatValue = q03.floatValue();
                }
            }
            if (floatValue <= 0.0f) {
                floatValue = 0.01f;
            }
            return new RadialGradient(createRadialGradient$value, createRadialGradient$value2, floatValue, colors, (float[]) null, Shader.TileMode.CLAMP);
        }

        private Companion() {
        }
    }

    @Metadata
    public static abstract class Radius {

        @Metadata
        public static final class Fixed extends Radius {
            private final float value;

            public Fixed(float f4) {
                super(null);
                this.value = f4;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.value, ((Fixed) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            @NotNull
            public String toString() {
                return "Fixed(value=" + this.value + ')';
            }
        }

        @Metadata
        public static final class Relative extends Radius {

            @NotNull
            private final Type type;

            @Metadata
            public enum Type {
                NEAREST_CORNER,
                FARTHEST_CORNER,
                NEAREST_SIDE,
                FARTHEST_SIDE
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Relative(@NotNull Type type) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && this.type == ((Relative) obj).type;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            @NotNull
            public String toString() {
                return "Relative(type=" + this.type + ')';
            }
        }

        public /* synthetic */ Radius(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Radius() {
        }
    }

    public RadialGradientDrawable(@NotNull Radius radius, @NotNull Center centerX, @NotNull Center centerY, @NotNull int[] colors) {
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(centerX, "centerX");
        Intrinsics.checkNotNullParameter(centerY, "centerY");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
        this.colors = colors;
        this.paint = new Paint();
        this.rect = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.paint.setShader(Companion.createRadialGradient(this.radius, this.centerX, this.centerY, this.colors, bounds.width(), bounds.height()));
        this.rect.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.paint.setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
