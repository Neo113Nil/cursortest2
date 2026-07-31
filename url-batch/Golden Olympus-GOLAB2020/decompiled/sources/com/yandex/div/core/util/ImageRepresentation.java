package com.yandex.div.core.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ImageRepresentation {

    @Metadata
    public static final class Bitmap implements ImageRepresentation {

        @NotNull
        private final android.graphics.Bitmap value;

        private /* synthetic */ Bitmap(android.graphics.Bitmap bitmap) {
            this.value = bitmap;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bitmap m44boximpl(android.graphics.Bitmap bitmap) {
            return new Bitmap(bitmap);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.Bitmap m45constructorimpl(@NotNull android.graphics.Bitmap value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m46equalsimpl(android.graphics.Bitmap bitmap, Object obj) {
            return (obj instanceof Bitmap) && Intrinsics.areEqual(bitmap, ((Bitmap) obj).m49unboximpl());
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m47hashCodeimpl(android.graphics.Bitmap bitmap) {
            return bitmap.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m48toStringimpl(android.graphics.Bitmap bitmap) {
            return "Bitmap(value=" + bitmap + ')';
        }

        public boolean equals(Object obj) {
            return m46equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m47hashCodeimpl(this.value);
        }

        public String toString() {
            return m48toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.Bitmap m49unboximpl() {
            return this.value;
        }
    }

    @Metadata
    public static final class PictureDrawable implements ImageRepresentation {

        @NotNull
        private final android.graphics.drawable.PictureDrawable value;

        private /* synthetic */ PictureDrawable(android.graphics.drawable.PictureDrawable pictureDrawable) {
            this.value = pictureDrawable;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PictureDrawable m50boximpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return new PictureDrawable(pictureDrawable);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.drawable.PictureDrawable m51constructorimpl(@NotNull android.graphics.drawable.PictureDrawable value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m52equalsimpl(android.graphics.drawable.PictureDrawable pictureDrawable, Object obj) {
            return (obj instanceof PictureDrawable) && Intrinsics.areEqual(pictureDrawable, ((PictureDrawable) obj).m55unboximpl());
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m53hashCodeimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m54toStringimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return "PictureDrawable(value=" + pictureDrawable + ')';
        }

        public boolean equals(Object obj) {
            return m52equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m53hashCodeimpl(this.value);
        }

        public String toString() {
            return m54toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.drawable.PictureDrawable m55unboximpl() {
            return this.value;
        }
    }
}
