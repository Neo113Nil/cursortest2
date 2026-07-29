package com.tapjoy.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class t implements bd {

    /* renamed from: a, reason: collision with root package name */
    public static final t f8514a = new t();

    @Override // com.tapjoy.internal.bf
    public final /* synthetic */ void a(OutputStream outputStream, Object obj) {
        if (!((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, outputStream)) {
            throw new RuntimeException();
        }
    }

    private t() {
    }

    @Override // com.tapjoy.internal.be
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bitmap b(final InputStream inputStream) {
        try {
            return (Bitmap) y.a(new bb() { // from class: com.tapjoy.internal.t.1
                @Override // com.tapjoy.internal.bb, java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    if (inputStream instanceof bc) {
                        return BitmapFactory.decodeStream(inputStream);
                    }
                    return BitmapFactory.decodeStream(new bc(inputStream));
                }
            });
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
