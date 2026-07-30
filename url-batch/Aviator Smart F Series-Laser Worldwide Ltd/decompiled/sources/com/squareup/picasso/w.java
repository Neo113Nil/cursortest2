package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import okio.x0;

/* loaded from: classes4.dex */
public abstract class w {

    public static final class a {
        private final Bitmap bitmap;
        private final int exifOrientation;
        private final Picasso.LoadedFrom loadedFrom;
        private final x0 source;

        public a(@NonNull Bitmap bitmap, @NonNull Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) d0.checkNotNull(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        @Nullable
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        int getExifOrientation() {
            return this.exifOrientation;
        }

        @NonNull
        public Picasso.LoadedFrom getLoadedFrom() {
            return this.loadedFrom;
        }

        @Nullable
        public x0 getSource() {
            return this.source;
        }

        public a(@NonNull x0 x0Var, @NonNull Picasso.LoadedFrom loadedFrom) {
            this(null, (x0) d0.checkNotNull(x0Var, "source == null"), loadedFrom, 0);
        }

        a(@Nullable Bitmap bitmap, @Nullable x0 x0Var, @NonNull Picasso.LoadedFrom loadedFrom, int i8) {
            if ((bitmap != null) != (x0Var != null)) {
                this.bitmap = bitmap;
                this.source = x0Var;
                this.loadedFrom = (Picasso.LoadedFrom) d0.checkNotNull(loadedFrom, "loadedFrom == null");
                this.exifOrientation = i8;
                return;
            }
            throw new AssertionError();
        }
    }

    static void calculateInSampleSize(int i8, int i9, BitmapFactory.Options options, u uVar) {
        calculateInSampleSize(i8, i9, options.outWidth, options.outHeight, options, uVar);
    }

    static BitmapFactory.Options createBitmapOptions(u uVar) {
        boolean hasSize = uVar.hasSize();
        boolean z7 = uVar.config != null;
        if (!hasSize && !z7 && !uVar.purgeable) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = hasSize;
        boolean z8 = uVar.purgeable;
        options.inInputShareable = z8;
        options.inPurgeable = z8;
        if (z7) {
            options.inPreferredConfig = uVar.config;
        }
        return options;
    }

    static boolean requiresInSampleSize(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean canHandleRequest(u uVar);

    int getRetryCount() {
        return 0;
    }

    @Nullable
    public abstract a load(u uVar, int i8);

    boolean shouldRetry(boolean z7, NetworkInfo networkInfo) {
        return false;
    }

    boolean supportsReplay() {
        return false;
    }

    static void calculateInSampleSize(int i8, int i9, int i10, int i11, BitmapFactory.Options options, u uVar) {
        int max;
        double floor;
        if (i11 > i9 || i10 > i8) {
            if (i9 == 0) {
                floor = Math.floor(i10 / i8);
            } else if (i8 == 0) {
                floor = Math.floor(i11 / i9);
            } else {
                int floor2 = (int) Math.floor(i11 / i9);
                int floor3 = (int) Math.floor(i10 / i8);
                max = uVar.centerInside ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            max = (int) floor;
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        options.inJustDecodeBounds = false;
    }
}
