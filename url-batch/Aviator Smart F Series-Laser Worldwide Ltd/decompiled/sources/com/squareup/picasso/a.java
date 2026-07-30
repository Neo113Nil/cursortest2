package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
abstract class a {
    boolean cancelled;
    final Drawable errorDrawable;
    final int errorResId;
    final String key;
    final int memoryPolicy;
    final int networkPolicy;
    final boolean noFade;
    final Picasso picasso;
    final u request;
    final Object tag;
    final WeakReference<Object> target;
    boolean willReplay;

    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    static class C0339a extends WeakReference {
        final a action;

        C0339a(a aVar, Object obj, ReferenceQueue<Object> referenceQueue) {
            super(obj, referenceQueue);
            this.action = aVar;
        }
    }

    a(Picasso picasso, Object obj, u uVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj2, boolean z7) {
        this.picasso = picasso;
        this.request = uVar;
        this.target = obj == null ? null : new C0339a(this, obj, picasso.referenceQueue);
        this.memoryPolicy = i8;
        this.networkPolicy = i9;
        this.noFade = z7;
        this.errorResId = i10;
        this.errorDrawable = drawable;
        this.key = str;
        this.tag = obj2 == null ? this : obj2;
    }

    void cancel() {
        this.cancelled = true;
    }

    abstract void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    abstract void error(Exception exc);

    String getKey() {
        return this.key;
    }

    int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    int getNetworkPolicy() {
        return this.networkPolicy;
    }

    Picasso getPicasso() {
        return this.picasso;
    }

    Picasso.Priority getPriority() {
        return this.request.priority;
    }

    u getRequest() {
        return this.request;
    }

    Object getTag() {
        return this.tag;
    }

    Object getTarget() {
        WeakReference<Object> weakReference = this.target;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    boolean isCancelled() {
        return this.cancelled;
    }

    boolean willReplay() {
        return this.willReplay;
    }
}
