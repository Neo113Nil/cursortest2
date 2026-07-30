package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class u {
    private static final long TOO_LONG_LOG = TimeUnit.SECONDS.toNanos(5);
    public final boolean centerCrop;
    public final int centerCropGravity;
    public final boolean centerInside;
    public final Bitmap.Config config;
    public final boolean hasRotationPivot;
    int id;
    int networkPolicy;
    public final boolean onlyScaleDown;
    public final Picasso.Priority priority;
    public final boolean purgeable;
    public final int resourceId;
    public final float rotationDegrees;
    public final float rotationPivotX;
    public final float rotationPivotY;
    public final String stableKey;
    long started;
    public final int targetHeight;
    public final int targetWidth;
    public final List<c0> transformations;
    public final Uri uri;

    public static final class b {
        private boolean centerCrop;
        private int centerCropGravity;
        private boolean centerInside;
        private Bitmap.Config config;
        private boolean hasRotationPivot;
        private boolean onlyScaleDown;
        private Picasso.Priority priority;
        private boolean purgeable;
        private int resourceId;
        private float rotationDegrees;
        private float rotationPivotX;
        private float rotationPivotY;
        private String stableKey;
        private int targetHeight;
        private int targetWidth;
        private List<c0> transformations;
        private Uri uri;

        public u build() {
            boolean z7 = this.centerInside;
            if (z7 && this.centerCrop) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.centerCrop && this.targetWidth == 0 && this.targetHeight == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z7 && this.targetWidth == 0 && this.targetHeight == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.priority == null) {
                this.priority = Picasso.Priority.NORMAL;
            }
            return new u(this.uri, this.resourceId, this.stableKey, this.transformations, this.targetWidth, this.targetHeight, this.centerCrop, this.centerInside, this.centerCropGravity, this.onlyScaleDown, this.rotationDegrees, this.rotationPivotX, this.rotationPivotY, this.hasRotationPivot, this.purgeable, this.config, this.priority);
        }

        public b centerCrop() {
            return centerCrop(17);
        }

        public b centerInside() {
            if (this.centerCrop) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.centerInside = true;
            return this;
        }

        public b clearCenterCrop() {
            this.centerCrop = false;
            this.centerCropGravity = 17;
            return this;
        }

        public b clearCenterInside() {
            this.centerInside = false;
            return this;
        }

        public b clearOnlyScaleDown() {
            this.onlyScaleDown = false;
            return this;
        }

        public b clearResize() {
            this.targetWidth = 0;
            this.targetHeight = 0;
            this.centerCrop = false;
            this.centerInside = false;
            return this;
        }

        public b clearRotation() {
            this.rotationDegrees = 0.0f;
            this.rotationPivotX = 0.0f;
            this.rotationPivotY = 0.0f;
            this.hasRotationPivot = false;
            return this;
        }

        public b config(@NonNull Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("config == null");
            }
            this.config = config;
            return this;
        }

        boolean hasImage() {
            return (this.uri == null && this.resourceId == 0) ? false : true;
        }

        boolean hasPriority() {
            return this.priority != null;
        }

        boolean hasSize() {
            return (this.targetWidth == 0 && this.targetHeight == 0) ? false : true;
        }

        public b onlyScaleDown() {
            if (this.targetHeight == 0 && this.targetWidth == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.onlyScaleDown = true;
            return this;
        }

        public b priority(@NonNull Picasso.Priority priority) {
            if (priority == null) {
                throw new IllegalArgumentException("Priority invalid.");
            }
            if (this.priority != null) {
                throw new IllegalStateException("Priority already set.");
            }
            this.priority = priority;
            return this;
        }

        public b purgeable() {
            this.purgeable = true;
            return this;
        }

        public b resize(@Px int i8, @Px int i9) {
            if (i8 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i9 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i9 == 0 && i8 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.targetWidth = i8;
            this.targetHeight = i9;
            return this;
        }

        public b rotate(float f8) {
            this.rotationDegrees = f8;
            return this;
        }

        public b setResourceId(@DrawableRes int i8) {
            if (i8 == 0) {
                throw new IllegalArgumentException("Image resource ID may not be 0.");
            }
            this.resourceId = i8;
            this.uri = null;
            return this;
        }

        public b setUri(@NonNull Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("Image URI may not be null.");
            }
            this.uri = uri;
            this.resourceId = 0;
            return this;
        }

        public b stableKey(@Nullable String str) {
            this.stableKey = str;
            return this;
        }

        public b transform(@NonNull c0 c0Var) {
            if (c0Var == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            }
            if (c0Var.a() == null) {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            if (this.transformations == null) {
                this.transformations = new ArrayList(2);
            }
            this.transformations.add(c0Var);
            return this;
        }

        public b(@NonNull Uri uri) {
            setUri(uri);
        }

        public b centerCrop(int i8) {
            if (this.centerInside) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.centerCrop = true;
            this.centerCropGravity = i8;
            return this;
        }

        public b rotate(float f8, float f9, float f10) {
            this.rotationDegrees = f8;
            this.rotationPivotX = f9;
            this.rotationPivotY = f10;
            this.hasRotationPivot = true;
            return this;
        }

        public b(@DrawableRes int i8) {
            setResourceId(i8);
        }

        b(Uri uri, int i8, Bitmap.Config config) {
            this.uri = uri;
            this.resourceId = i8;
            this.config = config;
        }

        public b transform(@NonNull List<? extends c0> list) {
            if (list != null) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    cn.hutool.core.convert.impl.s.a(list.get(i8));
                    transform((c0) null);
                }
                return this;
            }
            throw new IllegalArgumentException("Transformation list must not be null.");
        }

        private b(u uVar) {
            this.uri = uVar.uri;
            this.resourceId = uVar.resourceId;
            this.stableKey = uVar.stableKey;
            this.targetWidth = uVar.targetWidth;
            this.targetHeight = uVar.targetHeight;
            this.centerCrop = uVar.centerCrop;
            this.centerInside = uVar.centerInside;
            this.centerCropGravity = uVar.centerCropGravity;
            this.rotationDegrees = uVar.rotationDegrees;
            this.rotationPivotX = uVar.rotationPivotX;
            this.rotationPivotY = uVar.rotationPivotY;
            this.hasRotationPivot = uVar.hasRotationPivot;
            this.purgeable = uVar.purgeable;
            this.onlyScaleDown = uVar.onlyScaleDown;
            if (uVar.transformations != null) {
                this.transformations = new ArrayList(uVar.transformations);
            }
            this.config = uVar.config;
            this.priority = uVar.priority;
        }
    }

    public b buildUpon() {
        return new b();
    }

    String getName() {
        Uri uri = this.uri;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.resourceId);
    }

    boolean hasCustomTransformations() {
        return this.transformations != null;
    }

    public boolean hasSize() {
        return (this.targetWidth == 0 && this.targetHeight == 0) ? false : true;
    }

    String logId() {
        long nanoTime = System.nanoTime() - this.started;
        if (nanoTime > TOO_LONG_LOG) {
            return plainId() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return plainId() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    boolean needsMatrixTransform() {
        return hasSize() || this.rotationDegrees != 0.0f;
    }

    boolean needsTransformation() {
        return needsMatrixTransform() || hasCustomTransformations();
    }

    String plainId() {
        return "[R" + this.id + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i8 = this.resourceId;
        if (i8 > 0) {
            sb.append(i8);
        } else {
            sb.append(this.uri);
        }
        List<c0> list = this.transformations;
        if (list != null && !list.isEmpty()) {
            Iterator<c0> it = this.transformations.iterator();
            if (it.hasNext()) {
                cn.hutool.core.convert.impl.s.a(it.next());
                sb.append(' ');
                throw null;
            }
        }
        if (this.stableKey != null) {
            sb.append(" stableKey(");
            sb.append(this.stableKey);
            sb.append(')');
        }
        if (this.targetWidth > 0) {
            sb.append(" resize(");
            sb.append(this.targetWidth);
            sb.append(',');
            sb.append(this.targetHeight);
            sb.append(')');
        }
        if (this.centerCrop) {
            sb.append(" centerCrop");
        }
        if (this.centerInside) {
            sb.append(" centerInside");
        }
        if (this.rotationDegrees != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.rotationDegrees);
            if (this.hasRotationPivot) {
                sb.append(" @ ");
                sb.append(this.rotationPivotX);
                sb.append(',');
                sb.append(this.rotationPivotY);
            }
            sb.append(')');
        }
        if (this.purgeable) {
            sb.append(" purgeable");
        }
        if (this.config != null) {
            sb.append(' ');
            sb.append(this.config);
        }
        sb.append('}');
        return sb.toString();
    }

    private u(Uri uri, int i8, String str, List<c0> list, int i9, int i10, boolean z7, boolean z8, int i11, boolean z9, float f8, float f9, float f10, boolean z10, boolean z11, Bitmap.Config config, Picasso.Priority priority) {
        this.uri = uri;
        this.resourceId = i8;
        this.stableKey = str;
        if (list == null) {
            this.transformations = null;
        } else {
            this.transformations = Collections.unmodifiableList(list);
        }
        this.targetWidth = i9;
        this.targetHeight = i10;
        this.centerCrop = z7;
        this.centerInside = z8;
        this.centerCropGravity = i11;
        this.onlyScaleDown = z9;
        this.rotationDegrees = f8;
        this.rotationPivotX = f9;
        this.rotationPivotY = f10;
        this.hasRotationPivot = z10;
        this.purgeable = z11;
        this.config = config;
        this.priority = priority;
    }
}
