package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public interface e72 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f25123a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f25124b;

        public a(String str, byte[] bArr) {
            this.f25123a = str;
            this.f25124b = bArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f25125a;

        /* renamed from: b, reason: collision with root package name */
        public final List<a> f25126b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f25127c;

        public b(int i4, String str, ArrayList arrayList, byte[] bArr) {
            this.f25125a = str;
            this.f25126b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            this.f25127c = bArr;
        }
    }

    public interface c {
        SparseArray<e72> a();

        e72 a(int i4, b bVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25128a;

        /* renamed from: b, reason: collision with root package name */
        private final int f25129b;

        /* renamed from: c, reason: collision with root package name */
        private final int f25130c;

        /* renamed from: d, reason: collision with root package name */
        private int f25131d;

        /* renamed from: e, reason: collision with root package name */
        private String f25132e;

        public d(int i4, int i5, int i6) {
            String str;
            if (i4 != Integer.MIN_VALUE) {
                str = i4 + "/";
            } else {
                str = "";
            }
            this.f25128a = str;
            this.f25129b = i5;
            this.f25130c = i6;
            this.f25131d = Integer.MIN_VALUE;
            this.f25132e = "";
        }

        public final void a() {
            int i4 = this.f25131d;
            this.f25131d = i4 == Integer.MIN_VALUE ? this.f25129b : i4 + this.f25130c;
            this.f25132e = this.f25128a + this.f25131d;
        }

        public final String b() {
            if (this.f25131d != Integer.MIN_VALUE) {
                return this.f25132e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public final int c() {
            int i4 = this.f25131d;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    void a();

    void a(int i4, sf1 sf1Var);

    void a(e52 e52Var, r70 r70Var, d dVar);
}
