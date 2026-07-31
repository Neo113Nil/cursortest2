package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import com.yandex.mobile.ads.impl.rv0;
import com.yandex.mobile.ads.impl.sj0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class rv0 implements InterfaceC2259tl {

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC2259tl.a<rv0> f31377h;

    /* renamed from: b, reason: collision with root package name */
    public final String f31378b;

    /* renamed from: c, reason: collision with root package name */
    public final g f31379c;

    /* renamed from: d, reason: collision with root package name */
    public final e f31380d;

    /* renamed from: e, reason: collision with root package name */
    public final uv0 f31381e;

    /* renamed from: f, reason: collision with root package name */
    public final c f31382f;

    /* renamed from: g, reason: collision with root package name */
    public final h f31383g;

    public static class b implements InterfaceC2259tl {

        /* renamed from: g, reason: collision with root package name */
        public static final InterfaceC2259tl.a<c> f31393g = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Vc
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                rv0.c a4;
                a4 = rv0.b.a(bundle);
                return a4;
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public final long f31394b;

        /* renamed from: c, reason: collision with root package name */
        public final long f31395c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f31396d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f31397e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f31398f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f31399a;

            /* renamed from: b, reason: collision with root package name */
            private long f31400b = Long.MIN_VALUE;

            /* renamed from: c, reason: collision with root package name */
            private boolean f31401c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f31402d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f31403e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Bundle bundle) {
            a aVar = new a();
            long j4 = bundle.getLong(Integer.toString(0, 36), 0L);
            if (j4 < 0) {
                throw new IllegalArgumentException();
            }
            aVar.f31399a = j4;
            long j5 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
            if (j5 != Long.MIN_VALUE && j5 < 0) {
                throw new IllegalArgumentException();
            }
            aVar.f31400b = j5;
            aVar.f31401c = bundle.getBoolean(Integer.toString(2, 36), false);
            aVar.f31402d = bundle.getBoolean(Integer.toString(3, 36), false);
            aVar.f31403e = bundle.getBoolean(Integer.toString(4, 36), false);
            return new c(aVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f31394b == bVar.f31394b && this.f31395c == bVar.f31395c && this.f31396d == bVar.f31396d && this.f31397e == bVar.f31397e && this.f31398f == bVar.f31398f;
        }

        public final int hashCode() {
            long j4 = this.f31394b;
            int i4 = ((int) (j4 ^ (j4 >>> 32))) * 31;
            long j5 = this.f31395c;
            return ((((((i4 + ((int) ((j5 >>> 32) ^ j5))) * 31) + (this.f31396d ? 1 : 0)) * 31) + (this.f31397e ? 1 : 0)) * 31) + (this.f31398f ? 1 : 0);
        }

        private b(a aVar) {
            this.f31394b = aVar.f31399a;
            this.f31395c = aVar.f31400b;
            this.f31396d = aVar.f31401c;
            this.f31397e = aVar.f31402d;
            this.f31398f = aVar.f31403e;
        }
    }

    @Deprecated
    public static final class c extends b {

        /* renamed from: h, reason: collision with root package name */
        public static final c f31404h = new c(new b.a());

        private c(b.a aVar) {
            super(aVar);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f31405a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f31406b;

        /* renamed from: c, reason: collision with root package name */
        public final tj0<String, String> f31407c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f31408d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f31409e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f31410f;

        /* renamed from: g, reason: collision with root package name */
        public final sj0<Integer> f31411g;

        /* renamed from: h, reason: collision with root package name */
        private final byte[] f31412h;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private tj0<String, String> f31413a;

            /* renamed from: b, reason: collision with root package name */
            private sj0<Integer> f31414b;

            @Deprecated
            private a() {
                this.f31413a = tj0.g();
                this.f31414b = sj0.h();
            }
        }

        private d(a aVar) {
            aVar.getClass();
            this.f31405a = (UUID) C2253tf.a((Object) null);
            this.f31406b = null;
            this.f31407c = aVar.f31413a;
            this.f31408d = false;
            this.f31410f = false;
            this.f31409e = false;
            this.f31411g = aVar.f31414b;
            this.f31412h = null;
        }

        public final byte[] a() {
            byte[] bArr = this.f31412h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f31405a.equals(dVar.f31405a) && u82.a(this.f31406b, dVar.f31406b) && u82.a(this.f31407c, dVar.f31407c) && this.f31408d == dVar.f31408d && this.f31410f == dVar.f31410f && this.f31409e == dVar.f31409e && this.f31411g.equals(dVar.f31411g) && Arrays.equals(this.f31412h, dVar.f31412h);
        }

        public final int hashCode() {
            int hashCode = this.f31405a.hashCode() * 31;
            Uri uri = this.f31406b;
            return Arrays.hashCode(this.f31412h) + ((this.f31411g.hashCode() + ((((((((this.f31407c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f31408d ? 1 : 0)) * 31) + (this.f31410f ? 1 : 0)) * 31) + (this.f31409e ? 1 : 0)) * 31)) * 31);
        }
    }

    public static final class e implements InterfaceC2259tl {

        /* renamed from: g, reason: collision with root package name */
        public static final e f31415g = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* renamed from: h, reason: collision with root package name */
        public static final InterfaceC2259tl.a<e> f31416h = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Wc
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                rv0.e a4;
                a4 = rv0.e.a(bundle);
                return a4;
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public final long f31417b;

        /* renamed from: c, reason: collision with root package name */
        public final long f31418c;

        /* renamed from: d, reason: collision with root package name */
        public final long f31419d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31420e;

        /* renamed from: f, reason: collision with root package name */
        public final float f31421f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f31422a = -9223372036854775807L;

            /* renamed from: b, reason: collision with root package name */
            private long f31423b = -9223372036854775807L;

            /* renamed from: c, reason: collision with root package name */
            private long f31424c = -9223372036854775807L;

            /* renamed from: d, reason: collision with root package name */
            private float f31425d = -3.4028235E38f;

            /* renamed from: e, reason: collision with root package name */
            private float f31426e = -3.4028235E38f;

            public final e a() {
                return new e(this.f31422a, this.f31423b, this.f31424c, this.f31425d, this.f31426e);
            }
        }

        @Deprecated
        public e(long j4, long j5, long j6, float f4, float f5) {
            this.f31417b = j4;
            this.f31418c = j5;
            this.f31419d = j6;
            this.f31420e = f4;
            this.f31421f = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e a(Bundle bundle) {
            return new e(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f31417b == eVar.f31417b && this.f31418c == eVar.f31418c && this.f31419d == eVar.f31419d && this.f31420e == eVar.f31420e && this.f31421f == eVar.f31421f;
        }

        public final int hashCode() {
            long j4 = this.f31417b;
            long j5 = this.f31418c;
            int i4 = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f31419d;
            int i5 = (i4 + ((int) ((j6 >>> 32) ^ j6))) * 31;
            float f4 = this.f31420e;
            int floatToIntBits = (i5 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f31421f;
            return floatToIntBits + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0);
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f31427a;

        /* renamed from: b, reason: collision with root package name */
        public final String f31428b;

        /* renamed from: c, reason: collision with root package name */
        public final d f31429c;

        /* renamed from: d, reason: collision with root package name */
        public final List<l22> f31430d;

        /* renamed from: e, reason: collision with root package name */
        public final String f31431e;

        /* renamed from: f, reason: collision with root package name */
        public final sj0<j> f31432f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f31433g;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f31427a.equals(fVar.f31427a) && u82.a(this.f31428b, fVar.f31428b) && u82.a(this.f31429c, fVar.f31429c) && u82.a((Object) null, (Object) null) && this.f31430d.equals(fVar.f31430d) && u82.a(this.f31431e, fVar.f31431e) && this.f31432f.equals(fVar.f31432f) && u82.a(this.f31433g, fVar.f31433g);
        }

        public final int hashCode() {
            int hashCode = this.f31427a.hashCode() * 31;
            String str = this.f31428b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f31429c;
            int hashCode3 = (this.f31430d.hashCode() + ((hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 961)) * 31;
            String str2 = this.f31431e;
            int hashCode4 = (this.f31432f.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f31433g;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private f(Uri uri, String str, d dVar, List list, String str2, sj0 sj0Var, Object obj) {
            this.f31427a = uri;
            this.f31428b = str;
            this.f31429c = dVar;
            this.f31430d = list;
            this.f31431e = str2;
            this.f31432f = sj0Var;
            sj0.a g4 = sj0.g();
            for (int i4 = 0; i4 < sj0Var.size(); i4++) {
                g4.b(((j) sj0Var.get(i4)).a().a());
            }
            g4.a();
            this.f31433g = obj;
        }
    }

    @Deprecated
    public static final class g extends f {
        private g(Uri uri, String str, d dVar, List list, String str2, sj0 sj0Var, Object obj) {
            super(uri, str, dVar, list, str2, sj0Var, obj);
        }
    }

    public static final class h implements InterfaceC2259tl {

        /* renamed from: d, reason: collision with root package name */
        public static final h f31434d = new h(new a());

        /* renamed from: e, reason: collision with root package name */
        public static final InterfaceC2259tl.a<h> f31435e = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Xc
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                rv0.h a4;
                a4 = rv0.h.a(bundle);
                return a4;
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public final Uri f31436b;

        /* renamed from: c, reason: collision with root package name */
        public final String f31437c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f31438a;

            /* renamed from: b, reason: collision with root package name */
            private String f31439b;

            /* renamed from: c, reason: collision with root package name */
            private Bundle f31440c;
        }

        private h(a aVar) {
            this.f31436b = aVar.f31438a;
            this.f31437c = aVar.f31439b;
            Bundle unused = aVar.f31440c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static h a(Bundle bundle) {
            a aVar = new a();
            aVar.f31438a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
            aVar.f31439b = bundle.getString(Integer.toString(1, 36));
            aVar.f31440c = bundle.getBundle(Integer.toString(2, 36));
            return new h(aVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return u82.a(this.f31436b, hVar.f31436b) && u82.a(this.f31437c, hVar.f31437c);
        }

        public final int hashCode() {
            Uri uri = this.f31436b;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f31437c;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class i extends j {
        private i(j.a aVar) {
            super(aVar);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f31441a;

        /* renamed from: b, reason: collision with root package name */
        public final String f31442b;

        /* renamed from: c, reason: collision with root package name */
        public final String f31443c;

        /* renamed from: d, reason: collision with root package name */
        public final int f31444d;

        /* renamed from: e, reason: collision with root package name */
        public final int f31445e;

        /* renamed from: f, reason: collision with root package name */
        public final String f31446f;

        /* renamed from: g, reason: collision with root package name */
        public final String f31447g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f31448a;

            /* renamed from: b, reason: collision with root package name */
            private String f31449b;

            /* renamed from: c, reason: collision with root package name */
            private String f31450c;

            /* renamed from: d, reason: collision with root package name */
            private int f31451d;

            /* renamed from: e, reason: collision with root package name */
            private int f31452e;

            /* renamed from: f, reason: collision with root package name */
            private String f31453f;

            /* renamed from: g, reason: collision with root package name */
            private String f31454g;

            private a(j jVar) {
                this.f31448a = jVar.f31441a;
                this.f31449b = jVar.f31442b;
                this.f31450c = jVar.f31443c;
                this.f31451d = jVar.f31444d;
                this.f31452e = jVar.f31445e;
                this.f31453f = jVar.f31446f;
                this.f31454g = jVar.f31447g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public i a() {
                return new i(this);
            }
        }

        public final a a() {
            return new a();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f31441a.equals(jVar.f31441a) && u82.a(this.f31442b, jVar.f31442b) && u82.a(this.f31443c, jVar.f31443c) && this.f31444d == jVar.f31444d && this.f31445e == jVar.f31445e && u82.a(this.f31446f, jVar.f31446f) && u82.a(this.f31447g, jVar.f31447g);
        }

        public final int hashCode() {
            int hashCode = this.f31441a.hashCode() * 31;
            String str = this.f31442b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f31443c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f31444d) * 31) + this.f31445e) * 31;
            String str3 = this.f31446f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f31447g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private j(a aVar) {
            this.f31441a = aVar.f31448a;
            this.f31442b = aVar.f31449b;
            this.f31443c = aVar.f31450c;
            this.f31444d = aVar.f31451d;
            this.f31445e = aVar.f31452e;
            this.f31446f = aVar.f31453f;
            this.f31447g = aVar.f31454g;
        }
    }

    static {
        new d.a();
        sj0.h();
        e.a aVar = new e.a();
        h hVar = h.f31434d;
        aVar.a();
        uv0 uv0Var = uv0.f33360H;
        f31377h = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Uc
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                rv0 a4;
                a4 = rv0.a(bundle);
                return a4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static rv0 a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        e fromBundle = bundle2 == null ? e.f31415g : e.f31416h.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        uv0 fromBundle2 = bundle3 == null ? uv0.f33360H : uv0.f33361I.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        c fromBundle3 = bundle4 == null ? c.f31404h : b.f31393g.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new rv0(string, fromBundle3, null, fromBundle, fromBundle2, bundle5 == null ? h.f31434d : h.f31435e.fromBundle(bundle5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv0)) {
            return false;
        }
        rv0 rv0Var = (rv0) obj;
        return u82.a(this.f31378b, rv0Var.f31378b) && this.f31382f.equals(rv0Var.f31382f) && u82.a(this.f31379c, rv0Var.f31379c) && u82.a(this.f31380d, rv0Var.f31380d) && u82.a(this.f31381e, rv0Var.f31381e) && u82.a(this.f31383g, rv0Var.f31383g);
    }

    public final int hashCode() {
        int hashCode = this.f31378b.hashCode() * 31;
        g gVar = this.f31379c;
        return this.f31383g.hashCode() + ((this.f31381e.hashCode() + ((this.f31382f.hashCode() + ((this.f31380d.hashCode() + ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    private rv0(String str, c cVar, g gVar, e eVar, uv0 uv0Var, h hVar) {
        this.f31378b = str;
        this.f31379c = gVar;
        this.f31380d = eVar;
        this.f31381e = uv0Var;
        this.f31382f = cVar;
        this.f31383g = hVar;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f31384a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f31385b;

        /* renamed from: f, reason: collision with root package name */
        private String f31389f;

        /* renamed from: c, reason: collision with root package name */
        private b.a f31386c = new b.a();

        /* renamed from: d, reason: collision with root package name */
        private d.a f31387d = new d.a();

        /* renamed from: e, reason: collision with root package name */
        private List<l22> f31388e = Collections.EMPTY_LIST;

        /* renamed from: g, reason: collision with root package name */
        private sj0<j> f31390g = sj0.h();

        /* renamed from: h, reason: collision with root package name */
        private e.a f31391h = new e.a();

        /* renamed from: i, reason: collision with root package name */
        private h f31392i = h.f31434d;

        public final rv0 a() {
            g gVar;
            this.f31387d.getClass();
            Uri uri = this.f31385b;
            if (uri != null) {
                gVar = new g(uri, null, null, this.f31388e, this.f31389f, this.f31390g, null);
            } else {
                gVar = null;
            }
            String str = this.f31384a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            b.a aVar = this.f31386c;
            aVar.getClass();
            return new rv0(str2, new c(aVar), gVar, this.f31391h.a(), uv0.f33360H, this.f31392i);
        }

        public final a b(String str) {
            str.getClass();
            this.f31384a = str;
            return this;
        }

        public final a a(String str) {
            this.f31389f = str;
            return this;
        }

        public final a a(List<l22> list) {
            List<l22> list2;
            if (list != null && !list.isEmpty()) {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            } else {
                list2 = Collections.EMPTY_LIST;
            }
            this.f31388e = list2;
            return this;
        }

        public final a a(Uri uri) {
            this.f31385b = uri;
            return this;
        }
    }

    public static rv0 a(String str) {
        b.a aVar = new b.a();
        new d.a();
        List list = Collections.EMPTY_LIST;
        sj0 h4 = sj0.h();
        h hVar = h.f31434d;
        Uri parse = str == null ? null : Uri.parse(str);
        return new rv0("", new c(aVar), parse != null ? new g(parse, null, null, list, null, h4, null) : null, new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), uv0.f33360H, hVar);
    }
}
