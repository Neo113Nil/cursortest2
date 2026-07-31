package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import d1.InterfaceC2402a;

/* loaded from: classes2.dex */
public final class j implements InterfaceC2402a {

    /* renamed from: a, reason: collision with root package name */
    final LruCache f21721a;

    class a extends LruCache {
        a(int i4) {
            super(i4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f21724b;
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Bitmap f21723a;

        /* renamed from: b, reason: collision with root package name */
        final int f21724b;

        b(Bitmap bitmap, int i4) {
            this.f21723a = bitmap;
            this.f21724b = i4;
        }
    }

    public j(Context context) {
        this(y.b(context));
    }

    @Override // d1.InterfaceC2402a
    public int a() {
        return this.f21721a.maxSize();
    }

    @Override // d1.InterfaceC2402a
    public void b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int i4 = y.i(bitmap);
        if (i4 > a()) {
            this.f21721a.remove(str);
        } else {
            this.f21721a.put(str, new b(bitmap, i4));
        }
    }

    @Override // d1.InterfaceC2402a
    public Bitmap get(String str) {
        b bVar = (b) this.f21721a.get(str);
        if (bVar != null) {
            return bVar.f21723a;
        }
        return null;
    }

    @Override // d1.InterfaceC2402a
    public int size() {
        return this.f21721a.size();
    }

    public j(int i4) {
        this.f21721a = new a(i4);
    }
}
