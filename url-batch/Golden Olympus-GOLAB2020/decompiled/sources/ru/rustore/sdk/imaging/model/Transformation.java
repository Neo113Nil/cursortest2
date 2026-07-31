package ru.rustore.sdk.imaging.model;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* loaded from: classes3.dex */
public abstract class Transformation {
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Transformation circle() {
            return new CircleTransformation();
        }

        public final Transformation roundedCorners(float f4) {
            return new RoundedTransformation(f4);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Transformation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Bitmap transform$sdk_public_imaging_release(Bitmap bitmap);

    private Transformation() {
    }
}
