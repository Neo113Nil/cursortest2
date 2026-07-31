package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uu implements InterfaceC2259tl {

    /* renamed from: s, reason: collision with root package name */
    public static final uu f33246s;

    /* renamed from: t, reason: collision with root package name */
    public static final InterfaceC2259tl.a<uu> f33247t;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f33248b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f33249c;

    /* renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f33250d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f33251e;

    /* renamed from: f, reason: collision with root package name */
    public final float f33252f;

    /* renamed from: g, reason: collision with root package name */
    public final int f33253g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33254h;

    /* renamed from: i, reason: collision with root package name */
    public final float f33255i;

    /* renamed from: j, reason: collision with root package name */
    public final int f33256j;

    /* renamed from: k, reason: collision with root package name */
    public final float f33257k;

    /* renamed from: l, reason: collision with root package name */
    public final float f33258l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f33259m;

    /* renamed from: n, reason: collision with root package name */
    public final int f33260n;

    /* renamed from: o, reason: collision with root package name */
    public final int f33261o;

    /* renamed from: p, reason: collision with root package name */
    public final float f33262p;

    /* renamed from: q, reason: collision with root package name */
    public final int f33263q;

    /* renamed from: r, reason: collision with root package name */
    public final float f33264r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f33265a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f33266b;

        /* renamed from: c, reason: collision with root package name */
        private Layout.Alignment f33267c;

        /* renamed from: d, reason: collision with root package name */
        private Layout.Alignment f33268d;

        /* renamed from: e, reason: collision with root package name */
        private float f33269e;

        /* renamed from: f, reason: collision with root package name */
        private int f33270f;

        /* renamed from: g, reason: collision with root package name */
        private int f33271g;

        /* renamed from: h, reason: collision with root package name */
        private float f33272h;

        /* renamed from: i, reason: collision with root package name */
        private int f33273i;

        /* renamed from: j, reason: collision with root package name */
        private int f33274j;

        /* renamed from: k, reason: collision with root package name */
        private float f33275k;

        /* renamed from: l, reason: collision with root package name */
        private float f33276l;

        /* renamed from: m, reason: collision with root package name */
        private float f33277m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f33278n;

        /* renamed from: o, reason: collision with root package name */
        private int f33279o;

        /* renamed from: p, reason: collision with root package name */
        private int f33280p;

        /* renamed from: q, reason: collision with root package name */
        private float f33281q;

        public a() {
            this.f33265a = null;
            this.f33266b = null;
            this.f33267c = null;
            this.f33268d = null;
            this.f33269e = -3.4028235E38f;
            this.f33270f = Integer.MIN_VALUE;
            this.f33271g = Integer.MIN_VALUE;
            this.f33272h = -3.4028235E38f;
            this.f33273i = Integer.MIN_VALUE;
            this.f33274j = Integer.MIN_VALUE;
            this.f33275k = -3.4028235E38f;
            this.f33276l = -3.4028235E38f;
            this.f33277m = -3.4028235E38f;
            this.f33278n = false;
            this.f33279o = -16777216;
            this.f33280p = Integer.MIN_VALUE;
        }

        public final a a(Bitmap bitmap) {
            this.f33266b = bitmap;
            return this;
        }

        public final int b() {
            return this.f33271g;
        }

        public final int c() {
            return this.f33273i;
        }

        public final CharSequence d() {
            return this.f33265a;
        }

        public final a a(float f4) {
            this.f33277m = f4;
            return this;
        }

        public final a b(float f4) {
            this.f33272h = f4;
            return this;
        }

        public final void c(float f4) {
            this.f33281q = f4;
        }

        public final a d(float f4) {
            this.f33276l = f4;
            return this;
        }

        public final a a(int i4, float f4) {
            this.f33269e = f4;
            this.f33270f = i4;
            return this;
        }

        public final a b(int i4) {
            this.f33273i = i4;
            return this;
        }

        public final a c(int i4) {
            this.f33280p = i4;
            return this;
        }

        public final void d(int i4) {
            this.f33279o = i4;
            this.f33278n = true;
        }

        public final a b(Layout.Alignment alignment) {
            this.f33267c = alignment;
            return this;
        }

        public final a a(int i4) {
            this.f33271g = i4;
            return this;
        }

        public final void b(int i4, float f4) {
            this.f33275k = f4;
            this.f33274j = i4;
        }

        public final void a(Layout.Alignment alignment) {
            this.f33268d = alignment;
        }

        public final a a(CharSequence charSequence) {
            this.f33265a = charSequence;
            return this;
        }

        public final uu a() {
            return new uu(this.f33265a, this.f33267c, this.f33268d, this.f33266b, this.f33269e, this.f33270f, this.f33271g, this.f33272h, this.f33273i, this.f33274j, this.f33275k, this.f33276l, this.f33277m, this.f33278n, this.f33279o, this.f33280p, this.f33281q);
        }

        private a(uu uuVar) {
            this.f33265a = uuVar.f33248b;
            this.f33266b = uuVar.f33251e;
            this.f33267c = uuVar.f33249c;
            this.f33268d = uuVar.f33250d;
            this.f33269e = uuVar.f33252f;
            this.f33270f = uuVar.f33253g;
            this.f33271g = uuVar.f33254h;
            this.f33272h = uuVar.f33255i;
            this.f33273i = uuVar.f33256j;
            this.f33274j = uuVar.f33261o;
            this.f33275k = uuVar.f33262p;
            this.f33276l = uuVar.f33257k;
            this.f33277m = uuVar.f33258l;
            this.f33278n = uuVar.f33259m;
            this.f33279o = uuVar.f33260n;
            this.f33280p = uuVar.f33263q;
            this.f33281q = uuVar.f33264r;
        }
    }

    static {
        a aVar = new a();
        aVar.f33265a = "";
        f33246s = aVar.a();
        f33247t = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Jh
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                uu a4;
                a4 = uu.a(bundle);
                return a4;
            }
        };
    }

    public final a a() {
        return new a();
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && uu.class == obj.getClass()) {
            uu uuVar = (uu) obj;
            if (TextUtils.equals(this.f33248b, uuVar.f33248b) && this.f33249c == uuVar.f33249c && this.f33250d == uuVar.f33250d && ((bitmap = this.f33251e) != null ? !((bitmap2 = uuVar.f33251e) == null || !bitmap.sameAs(bitmap2)) : uuVar.f33251e == null) && this.f33252f == uuVar.f33252f && this.f33253g == uuVar.f33253g && this.f33254h == uuVar.f33254h && this.f33255i == uuVar.f33255i && this.f33256j == uuVar.f33256j && this.f33257k == uuVar.f33257k && this.f33258l == uuVar.f33258l && this.f33259m == uuVar.f33259m && this.f33260n == uuVar.f33260n && this.f33261o == uuVar.f33261o && this.f33262p == uuVar.f33262p && this.f33263q == uuVar.f33263q && this.f33264r == uuVar.f33264r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33248b, this.f33249c, this.f33250d, this.f33251e, Float.valueOf(this.f33252f), Integer.valueOf(this.f33253g), Integer.valueOf(this.f33254h), Float.valueOf(this.f33255i), Integer.valueOf(this.f33256j), Float.valueOf(this.f33257k), Float.valueOf(this.f33258l), Boolean.valueOf(this.f33259m), Integer.valueOf(this.f33260n), Integer.valueOf(this.f33261o), Float.valueOf(this.f33262p), Integer.valueOf(this.f33263q), Float.valueOf(this.f33264r)});
    }

    private uu(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f4, int i4, int i5, float f5, int i6, int i7, float f6, float f7, float f8, boolean z4, int i8, int i9, float f9) {
        if (charSequence == null) {
            C2253tf.a(bitmap);
        } else {
            C2253tf.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f33248b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f33248b = charSequence.toString();
        } else {
            this.f33248b = null;
        }
        this.f33249c = alignment;
        this.f33250d = alignment2;
        this.f33251e = bitmap;
        this.f33252f = f4;
        this.f33253g = i4;
        this.f33254h = i5;
        this.f33255i = f5;
        this.f33256j = i6;
        this.f33257k = f7;
        this.f33258l = f8;
        this.f33259m = z4;
        this.f33260n = i8;
        this.f33261o = i7;
        this.f33262p = f6;
        this.f33263q = i9;
        this.f33264r = f9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uu a(Bundle bundle) {
        a aVar = new a();
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        if (charSequence != null) {
            aVar.f33265a = charSequence;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        if (alignment != null) {
            aVar.f33267c = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        if (alignment2 != null) {
            aVar.f33268d = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        if (bitmap != null) {
            aVar.f33266b = bitmap;
        }
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            float f4 = bundle.getFloat(Integer.toString(4, 36));
            int i4 = bundle.getInt(Integer.toString(5, 36));
            aVar.f33269e = f4;
            aVar.f33270f = i4;
        }
        if (bundle.containsKey(Integer.toString(6, 36))) {
            aVar.f33271g = bundle.getInt(Integer.toString(6, 36));
        }
        if (bundle.containsKey(Integer.toString(7, 36))) {
            aVar.f33272h = bundle.getFloat(Integer.toString(7, 36));
        }
        if (bundle.containsKey(Integer.toString(8, 36))) {
            aVar.f33273i = bundle.getInt(Integer.toString(8, 36));
        }
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            float f5 = bundle.getFloat(Integer.toString(10, 36));
            int i5 = bundle.getInt(Integer.toString(9, 36));
            aVar.f33275k = f5;
            aVar.f33274j = i5;
        }
        if (bundle.containsKey(Integer.toString(11, 36))) {
            aVar.f33276l = bundle.getFloat(Integer.toString(11, 36));
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            aVar.f33277m = bundle.getFloat(Integer.toString(12, 36));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            aVar.f33279o = bundle.getInt(Integer.toString(13, 36));
            aVar.f33278n = true;
        }
        if (!bundle.getBoolean(Integer.toString(14, 36), false)) {
            aVar.f33278n = false;
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            aVar.f33280p = bundle.getInt(Integer.toString(15, 36));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            aVar.f33281q = bundle.getFloat(Integer.toString(16, 36));
        }
        return aVar.a();
    }
}
