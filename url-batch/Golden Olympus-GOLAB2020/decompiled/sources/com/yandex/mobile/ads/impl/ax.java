package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.yandex.div.core.images.LoadReference;
import com.yandex.mobile.ads.impl.vi0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ax {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vi0 f23507a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<LoadReference> f23508b;

    public static final class a implements vi0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f23509a;

        a(ImageView imageView) {
            this.f23509a = imageView;
        }

        @Override // com.yandex.mobile.ads.impl.qq1.a
        public final void a(@Nullable hi2 hi2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.vi0.d
        public final void a(@NotNull vi0.c response, boolean z4) {
            Intrinsics.checkNotNullParameter(response, "response");
            Bitmap b4 = response.b();
            if (b4 != null) {
                this.f23509a.setImageBitmap(b4);
            }
        }
    }

    public ax(@NotNull yy1 imageLoader, @NotNull List loadReferencesStorage) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(loadReferencesStorage, "loadReferencesStorage");
        this.f23507a = imageLoader;
        this.f23508b = loadReferencesStorage;
    }

    public final void a() {
        Iterator<T> it = this.f23508b.iterator();
        while (it.hasNext()) {
            ((LoadReference) it.next()).cancel();
        }
        this.f23508b.clear();
    }

    @NotNull
    public final LoadReference a(@NotNull String imageUrl, @NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        final vi0.c a4 = this.f23507a.a(imageUrl, new a(imageView), 0, 0);
        Intrinsics.checkNotNullExpressionValue(a4, "get(...)");
        LoadReference loadReference = new LoadReference() { // from class: com.yandex.mobile.ads.impl.W
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                ax.a(vi0.c.this);
            }
        };
        this.f23508b.add(loadReference);
        return loadReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vi0.c imageContainer) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        imageContainer.a();
    }
}
