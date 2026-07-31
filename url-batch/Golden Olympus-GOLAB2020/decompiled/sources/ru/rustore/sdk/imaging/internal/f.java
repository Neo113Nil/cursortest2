package ru.rustore.sdk.imaging.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.rustore.sdk.imaging.internal.f;
import ru.rustore.sdk.imaging.model.ImageRequest;
import ru.rustore.sdk.imaging.model.Transformation;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f43654a;

    /* renamed from: b, reason: collision with root package name */
    public final b f43655b;

    /* renamed from: c, reason: collision with root package name */
    public final c f43656c;

    /* renamed from: d, reason: collision with root package name */
    public final g f43657d;

    /* renamed from: e, reason: collision with root package name */
    public final h f43658e;

    public f(ThreadPoolExecutor executorService, b bitmapKeyRepository, c bitmapRepository, g imageViewDelegate, h isValidUrlUseCase) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        Intrinsics.checkNotNullParameter(bitmapKeyRepository, "bitmapKeyRepository");
        Intrinsics.checkNotNullParameter(bitmapRepository, "bitmapRepository");
        Intrinsics.checkNotNullParameter(imageViewDelegate, "imageViewDelegate");
        Intrinsics.checkNotNullParameter(isValidUrlUseCase, "isValidUrlUseCase");
        this.f43654a = executorService;
        this.f43655b = bitmapKeyRepository;
        this.f43656c = bitmapRepository;
        this.f43657d = imageViewDelegate;
        this.f43658e = isValidUrlUseCase;
    }

    public final void a(final ImageRequest imageRequest) {
        Object m243constructorimpl;
        Object obj;
        h hVar = this.f43658e;
        String url = imageRequest.getUrl();
        hVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Object obj2 = null;
        try {
            Result.Companion companion = Result.Companion;
            boolean z4 = false;
            if (StringsKt.K(url, "https://", false, 2, null)) {
                String substring = url.substring(8);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                if (substring.length() > 0) {
                    String substring2 = url.substring(8);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                    if (StringsKt.P(substring2, ".", false, 2, null)) {
                        List<String> list = h.f43661a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (StringsKt.N(url, (String) it.next(), true)) {
                                    break;
                                }
                            }
                        }
                        z4 = true;
                    }
                }
            }
            m243constructorimpl = Result.m243constructorimpl(Boolean.valueOf(z4));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = bool;
        }
        if (!((Boolean) m243constructorimpl).booleanValue()) {
            this.f43657d.a(imageRequest);
            return;
        }
        b bVar = this.f43655b;
        String url2 = imageRequest.getUrl();
        bVar.getClass();
        final a bitmapKey = b.a(url2);
        c cVar = this.f43656c;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(bitmapKey, "bitmapKey");
        Bitmap a4 = cVar.f43648a.a(bitmapKey.f43646a);
        if (a4 == null) {
            e eVar = cVar.f43649b;
            String key = bitmapKey.f43646a;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (eVar.f43653b) {
                try {
                    File file = new File(eVar.f43652a, key);
                    obj = Result.m243constructorimpl(file.exists() ? BitmapFactory.decodeFile(file.getAbsolutePath()) : null);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.Companion;
                    obj = Result.m243constructorimpl(ResultKt.createFailure(th2));
                }
                if (!Result.m244isFailureimpl(obj)) {
                    obj2 = obj;
                }
                a4 = (Bitmap) obj2;
            }
        }
        if (a4 != null) {
            a(a4, imageRequest);
        } else {
            this.f43657d.c(imageRequest);
            this.f43654a.execute(new Runnable() { // from class: A3.a
                @Override // java.lang.Runnable
                public final void run() {
                    f.a(f.this, imageRequest, bitmapKey);
                }
            });
        }
    }

    public static final void a(f fVar, ImageRequest imageRequest, a aVar) {
        Object m243constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.Companion;
            Bitmap a4 = fVar.f43656c.a(imageRequest.getUrl(), aVar);
            if (a4 != null) {
                fVar.a(a4, imageRequest);
                unit = Unit.f41027a;
            } else {
                unit = null;
            }
            m243constructorimpl = Result.m243constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            fVar.f43657d.a(imageRequest);
        }
    }

    public final void a(Bitmap bitmap, ImageRequest imageRequest) {
        Object m243constructorimpl;
        List<Transformation> transformations = imageRequest.getTransformations();
        try {
            Result.Companion companion = Result.Companion;
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            m243constructorimpl = Result.m243constructorimpl(bitmap.copy(config, bitmap.isMutable()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Bitmap bitmap2 = null;
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        Bitmap bitmap3 = (Bitmap) m243constructorimpl;
        if (bitmap3 != null) {
            Iterator<T> it = transformations.iterator();
            bitmap2 = bitmap3;
            while (it.hasNext()) {
                Bitmap transform$sdk_public_imaging_release = ((Transformation) it.next()).transform$sdk_public_imaging_release(bitmap2);
                if (!Intrinsics.areEqual(bitmap2, transform$sdk_public_imaging_release) && !Intrinsics.areEqual(bitmap2, bitmap3)) {
                    bitmap2.recycle();
                }
                bitmap2 = transform$sdk_public_imaging_release;
            }
        }
        if (bitmap2 != null) {
            this.f43657d.a(bitmap2, imageRequest);
        } else {
            this.f43657d.a(imageRequest);
        }
    }
}
