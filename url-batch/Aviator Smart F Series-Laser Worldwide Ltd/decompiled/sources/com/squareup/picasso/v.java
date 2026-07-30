package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.t;
import com.squareup.picasso.u;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class v {
    private static final AtomicInteger nextId = new AtomicInteger();
    private final u.b data;
    private boolean deferred;
    private Drawable errorDrawable;
    private int errorResId;
    private int memoryPolicy;
    private int networkPolicy;
    private boolean noFade;
    private final Picasso picasso;
    private Drawable placeholderDrawable;
    private int placeholderResId;
    private boolean setPlaceholder;
    private Object tag;

    v(Picasso picasso, Uri uri, int i8) {
        this.setPlaceholder = true;
        if (picasso.shutdown) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.picasso = picasso;
        this.data = new u.b(uri, i8, picasso.defaultBitmapConfig);
    }

    private u createRequest(long j8) {
        int andIncrement = nextId.getAndIncrement();
        u build = this.data.build();
        build.id = andIncrement;
        build.started = j8;
        boolean z7 = this.picasso.loggingEnabled;
        if (z7) {
            d0.log("Main", "created", build.plainId(), build.toString());
        }
        u transformRequest = this.picasso.transformRequest(build);
        if (transformRequest != build) {
            transformRequest.id = andIncrement;
            transformRequest.started = j8;
            if (z7) {
                d0.log("Main", "changed", transformRequest.logId(), "into " + transformRequest);
            }
        }
        return transformRequest;
    }

    private Drawable getPlaceholderDrawable() {
        int i8 = this.placeholderResId;
        return i8 != 0 ? this.picasso.context.getDrawable(i8) : this.placeholderDrawable;
    }

    private void performRemoteViewInto(t tVar) {
        Bitmap quickMemoryCacheCheck;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(tVar.getKey())) != null) {
            tVar.complete(quickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY);
            return;
        }
        int i8 = this.placeholderResId;
        if (i8 != 0) {
            tVar.setImageResource(i8);
        }
        this.picasso.enqueueAndSubmit(tVar);
    }

    public v centerCrop() {
        this.data.centerCrop(17);
        return this;
    }

    public v centerInside() {
        this.data.centerInside();
        return this;
    }

    v clearTag() {
        this.tag = null;
        return this;
    }

    public v config(@NonNull Bitmap.Config config) {
        this.data.config(config);
        return this;
    }

    public v error(@DrawableRes int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.errorDrawable != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.errorResId = i8;
        return this;
    }

    public void fetch() {
        fetch(null);
    }

    public v fit() {
        this.deferred = true;
        return this;
    }

    public Bitmap get() {
        long nanoTime = System.nanoTime();
        d0.checkNotMain();
        if (this.deferred) {
            throw new IllegalStateException("Fit cannot be used with get.");
        }
        if (!this.data.hasImage()) {
            return null;
        }
        u createRequest = createRequest(nanoTime);
        m mVar = new m(this.picasso, createRequest, this.memoryPolicy, this.networkPolicy, this.tag, d0.createKey(createRequest, new StringBuilder()));
        Picasso picasso = this.picasso;
        return c.forRequest(picasso, picasso.dispatcher, picasso.cache, picasso.stats, mVar).hunt();
    }

    Object getTag() {
        return this.tag;
    }

    public void into(@NonNull a0 a0Var) {
        Bitmap quickMemoryCacheCheck;
        long nanoTime = System.nanoTime();
        d0.checkMain();
        if (a0Var == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.deferred) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.data.hasImage()) {
            this.picasso.cancelRequest(a0Var);
            a0Var.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
            return;
        }
        u createRequest = createRequest(nanoTime);
        String createKey = d0.createKey(createRequest);
        if (!MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) || (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(createKey)) == null) {
            a0Var.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
            this.picasso.enqueueAndSubmit(new b0(this.picasso, a0Var, createRequest, this.memoryPolicy, this.networkPolicy, this.errorDrawable, createKey, this.tag, this.errorResId));
        } else {
            this.picasso.cancelRequest(a0Var);
            a0Var.onBitmapLoaded(quickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY);
        }
    }

    public v memoryPolicy(@NonNull MemoryPolicy memoryPolicy, @NonNull MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        this.memoryPolicy = memoryPolicy.index | this.memoryPolicy;
        if (memoryPolicyArr == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        if (memoryPolicyArr.length > 0) {
            for (MemoryPolicy memoryPolicy2 : memoryPolicyArr) {
                if (memoryPolicy2 == null) {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
                this.memoryPolicy = memoryPolicy2.index | this.memoryPolicy;
            }
        }
        return this;
    }

    public v networkPolicy(@NonNull NetworkPolicy networkPolicy, @NonNull NetworkPolicy... networkPolicyArr) {
        if (networkPolicy == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        this.networkPolicy = networkPolicy.index | this.networkPolicy;
        if (networkPolicyArr == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        if (networkPolicyArr.length > 0) {
            for (NetworkPolicy networkPolicy2 : networkPolicyArr) {
                if (networkPolicy2 == null) {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
                this.networkPolicy = networkPolicy2.index | this.networkPolicy;
            }
        }
        return this;
    }

    public v noFade() {
        this.noFade = true;
        return this;
    }

    public v noPlaceholder() {
        if (this.placeholderResId != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        }
        if (this.placeholderDrawable != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.setPlaceholder = false;
        return this;
    }

    public v onlyScaleDown() {
        this.data.onlyScaleDown();
        return this;
    }

    public v placeholder(@DrawableRes int i8) {
        if (!this.setPlaceholder) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i8 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.placeholderDrawable != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.placeholderResId = i8;
        return this;
    }

    public v priority(@NonNull Picasso.Priority priority) {
        this.data.priority(priority);
        return this;
    }

    public v purgeable() {
        this.data.purgeable();
        return this;
    }

    public v resize(int i8, int i9) {
        this.data.resize(i8, i9);
        return this;
    }

    public v resizeDimen(int i8, int i9) {
        Resources resources = this.picasso.context.getResources();
        return resize(resources.getDimensionPixelSize(i8), resources.getDimensionPixelSize(i9));
    }

    public v rotate(float f8) {
        this.data.rotate(f8);
        return this;
    }

    public v stableKey(@NonNull String str) {
        this.data.stableKey(str);
        return this;
    }

    public v tag(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        }
        if (this.tag != null) {
            throw new IllegalStateException("Tag already set.");
        }
        this.tag = obj;
        return this;
    }

    public v transform(@NonNull c0 c0Var) {
        this.data.transform(c0Var);
        return this;
    }

    v unfit() {
        this.deferred = false;
        return this;
    }

    public v centerCrop(int i8) {
        this.data.centerCrop(i8);
        return this;
    }

    public void fetch(@Nullable e eVar) {
        long nanoTime = System.nanoTime();
        if (this.deferred) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        }
        if (this.data.hasImage()) {
            if (!this.data.hasPriority()) {
                this.data.priority(Picasso.Priority.LOW);
            }
            u createRequest = createRequest(nanoTime);
            String createKey = d0.createKey(createRequest, new StringBuilder());
            if (!MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) || this.picasso.quickMemoryCacheCheck(createKey) == null) {
                this.picasso.submit(new k(this.picasso, createRequest, this.memoryPolicy, this.networkPolicy, this.tag, createKey, eVar));
                return;
            }
            if (this.picasso.loggingEnabled) {
                d0.log("Main", "completed", createRequest.plainId(), "from " + Picasso.LoadedFrom.MEMORY);
            }
            if (eVar != null) {
                eVar.onSuccess();
            }
        }
    }

    public v rotate(float f8, float f9, float f10) {
        this.data.rotate(f8, f9, f10);
        return this;
    }

    public v transform(@NonNull List<? extends c0> list) {
        this.data.transform(list);
        return this;
    }

    public v error(@NonNull Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        }
        if (this.errorResId != 0) {
            throw new IllegalStateException("Error image already set.");
        }
        this.errorDrawable = drawable;
        return this;
    }

    public v placeholder(@NonNull Drawable drawable) {
        if (!this.setPlaceholder) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (this.placeholderResId != 0) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.placeholderDrawable = drawable;
        return this;
    }

    @VisibleForTesting
    v() {
        this.setPlaceholder = true;
        this.picasso = null;
        this.data = new u.b(null, 0, null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i8, int i9, @NonNull Notification notification) {
        into(remoteViews, i8, i9, notification, null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i8, int i9, @NonNull Notification notification, @Nullable String str) {
        into(remoteViews, i8, i9, notification, str, null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i8, int i9, @NonNull Notification notification, @Nullable String str, e eVar) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("RemoteViews must not be null.");
        }
        if (notification == null) {
            throw new IllegalArgumentException("Notification must not be null.");
        }
        if (this.deferred) {
            throw new IllegalStateException("Fit cannot be used with RemoteViews.");
        }
        if (this.placeholderDrawable == null && this.placeholderResId == 0 && this.errorDrawable == null) {
            u createRequest = createRequest(nanoTime);
            performRemoteViewInto(new t.b(this.picasso, createRequest, remoteViews, i8, i9, notification, str, this.memoryPolicy, this.networkPolicy, d0.createKey(createRequest, new StringBuilder()), this.tag, this.errorResId, eVar));
            return;
        }
        throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i8, @NonNull int[] iArr) {
        into(remoteViews, i8, iArr, (e) null);
    }

    public void into(@NonNull RemoteViews remoteViews, @IdRes int i8, @NonNull int[] iArr, e eVar) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews must not be null.");
        }
        if (iArr == null) {
            throw new IllegalArgumentException("appWidgetIds must not be null.");
        }
        if (this.deferred) {
            throw new IllegalStateException("Fit cannot be used with remote views.");
        }
        if (this.placeholderDrawable == null && this.placeholderResId == 0 && this.errorDrawable == null) {
            u createRequest = createRequest(nanoTime);
            performRemoteViewInto(new t.a(this.picasso, createRequest, remoteViews, i8, iArr, this.memoryPolicy, this.networkPolicy, d0.createKey(createRequest, new StringBuilder()), this.tag, this.errorResId, eVar));
            return;
        }
        throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
    }

    public void into(ImageView imageView) {
        into(imageView, null);
    }

    public void into(ImageView imageView, e eVar) {
        Bitmap quickMemoryCacheCheck;
        long nanoTime = System.nanoTime();
        d0.checkMain();
        if (imageView != null) {
            if (!this.data.hasImage()) {
                this.picasso.cancelRequest(imageView);
                if (this.setPlaceholder) {
                    r.setPlaceholder(imageView, getPlaceholderDrawable());
                    return;
                }
                return;
            }
            if (this.deferred) {
                if (!this.data.hasSize()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.data.resize(width, height);
                    } else {
                        if (this.setPlaceholder) {
                            r.setPlaceholder(imageView, getPlaceholderDrawable());
                        }
                        this.picasso.defer(imageView, new h(this, imageView, eVar));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            u createRequest = createRequest(nanoTime);
            String createKey = d0.createKey(createRequest);
            if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(createKey)) != null) {
                this.picasso.cancelRequest(imageView);
                Picasso picasso = this.picasso;
                Context context = picasso.context;
                Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
                r.setBitmap(imageView, context, quickMemoryCacheCheck, loadedFrom, this.noFade, picasso.indicatorsEnabled);
                if (this.picasso.loggingEnabled) {
                    d0.log("Main", "completed", createRequest.plainId(), "from " + loadedFrom);
                }
                if (eVar != null) {
                    eVar.onSuccess();
                    return;
                }
                return;
            }
            if (this.setPlaceholder) {
                r.setPlaceholder(imageView, getPlaceholderDrawable());
            }
            this.picasso.enqueueAndSubmit(new n(this.picasso, imageView, createRequest, this.memoryPolicy, this.networkPolicy, this.errorResId, this.errorDrawable, createKey, this.tag, eVar, this.noFade));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }
}
