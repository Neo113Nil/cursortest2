package com.tapjoy.internal;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.net.ContentHandler;
import java.net.URLConnection;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class s extends ContentHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final s f8513a = new s();

    @Override // java.net.ContentHandler
    @Nullable
    public final /* synthetic */ Object getContent(URLConnection uRLConnection) {
        return a(uRLConnection);
    }

    private s() {
    }

    @Nullable
    private static Bitmap a(URLConnection uRLConnection) {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            return t.f8514a.b(inputStream);
        } finally {
            inputStream.close();
        }
    }

    @Nullable
    public static Bitmap a(InputStream inputStream) {
        try {
            return t.f8514a.b(inputStream);
        } finally {
            inputStream.close();
        }
    }
}
