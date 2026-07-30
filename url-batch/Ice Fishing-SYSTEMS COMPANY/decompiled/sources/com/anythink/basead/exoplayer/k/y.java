package com.anythink.basead.exoplayer.k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<a> f8673a = new Comparator<a>() { // from class: com.anythink.basead.exoplayer.k.y.1
        private static int a(a aVar, a aVar2) {
            return aVar.f8685a - aVar2.f8685a;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            return aVar.f8685a - aVar2.f8685a;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<a> f8674b = new Comparator<a>() { // from class: com.anythink.basead.exoplayer.k.y.2
        private static int a(a aVar, a aVar2) {
            float f6 = aVar.f8687c;
            float f9 = aVar2.f8687c;
            if (f6 < f9) {
                return -1;
            }
            return f9 < f6 ? 1 : 0;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            float f6 = aVar.f8687c;
            float f9 = aVar2.f8687c;
            if (f6 < f9) {
                return -1;
            }
            return f9 < f6 ? 1 : 0;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final int f8675c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8676d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f8677e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8678f = 5;

    /* renamed from: g, reason: collision with root package name */
    private final int f8679g;

    /* renamed from: k, reason: collision with root package name */
    private int f8682k;

    /* renamed from: l, reason: collision with root package name */
    private int f8683l;

    /* renamed from: m, reason: collision with root package name */
    private int f8684m;
    private final a[] i = new a[5];

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<a> f8680h = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private int f8681j = -1;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f8685a;

        /* renamed from: b, reason: collision with root package name */
        public int f8686b;

        /* renamed from: c, reason: collision with root package name */
        public float f8687c;

        private a() {
        }

        public /* synthetic */ a(byte b9) {
            this();
        }
    }

    public y(int i) {
        this.f8679g = i;
    }

    private void b() {
        if (this.f8681j != 1) {
            Collections.sort(this.f8680h, f8673a);
            this.f8681j = 1;
        }
    }

    private void c() {
        if (this.f8681j != 0) {
            Collections.sort(this.f8680h, f8674b);
            this.f8681j = 0;
        }
    }

    public final void a(int i, float f6) {
        a aVar;
        if (this.f8681j != 1) {
            Collections.sort(this.f8680h, f8673a);
            this.f8681j = 1;
        }
        int i4 = this.f8684m;
        byte b9 = 0;
        if (i4 > 0) {
            a[] aVarArr = this.i;
            int i9 = i4 - 1;
            this.f8684m = i9;
            aVar = aVarArr[i9];
        } else {
            aVar = new a(b9);
        }
        int i10 = this.f8682k;
        this.f8682k = i10 + 1;
        aVar.f8685a = i10;
        aVar.f8686b = i;
        aVar.f8687c = f6;
        this.f8680h.add(aVar);
        this.f8683l += i;
        while (true) {
            int i11 = this.f8683l;
            int i12 = this.f8679g;
            if (i11 <= i12) {
                return;
            }
            int i13 = i11 - i12;
            a aVar2 = this.f8680h.get(0);
            int i14 = aVar2.f8686b;
            if (i14 <= i13) {
                this.f8683l -= i14;
                this.f8680h.remove(0);
                int i15 = this.f8684m;
                if (i15 < 5) {
                    a[] aVarArr2 = this.i;
                    this.f8684m = i15 + 1;
                    aVarArr2[i15] = aVar2;
                }
            } else {
                aVar2.f8686b = i14 - i13;
                this.f8683l -= i13;
            }
        }
    }

    public final float a() {
        if (this.f8681j != 0) {
            Collections.sort(this.f8680h, f8674b);
            this.f8681j = 0;
        }
        float f6 = this.f8683l * 0.5f;
        int i = 0;
        for (int i4 = 0; i4 < this.f8680h.size(); i4++) {
            a aVar = this.f8680h.get(i4);
            i += aVar.f8686b;
            if (i >= f6) {
                return aVar.f8687c;
            }
        }
        if (this.f8680h.isEmpty()) {
            return Float.NaN;
        }
        return this.f8680h.get(r0.size() - 1).f8687c;
    }
}
