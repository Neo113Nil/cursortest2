package com.squareup.picasso;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public interface d {
    public static final d NONE = new a();

    static class a implements d {
        a() {
        }

        @Override // com.squareup.picasso.d
        public void clear() {
        }

        @Override // com.squareup.picasso.d
        public void clearKeyUri(String str) {
        }

        @Override // com.squareup.picasso.d
        public Bitmap get(String str) {
            return null;
        }

        @Override // com.squareup.picasso.d
        public int maxSize() {
            return 0;
        }

        @Override // com.squareup.picasso.d
        public void set(String str, Bitmap bitmap) {
        }

        @Override // com.squareup.picasso.d
        public int size() {
            return 0;
        }
    }

    void clear();

    void clearKeyUri(String str);

    Bitmap get(String str);

    int maxSize();

    void set(String str, Bitmap bitmap);

    int size();
}
