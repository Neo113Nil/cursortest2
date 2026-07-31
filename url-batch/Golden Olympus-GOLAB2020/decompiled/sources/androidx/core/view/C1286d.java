package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286d {

    /* renamed from: a, reason: collision with root package name */
    private final f f11941a;

    /* renamed from: androidx.core.view.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f11942a;

        public a(ClipData clipData, int i4) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f11942a = new b(clipData, i4);
            } else {
                this.f11942a = new C0100d(clipData, i4);
            }
        }

        public C1286d a() {
            return this.f11942a.build();
        }

        public a b(Bundle bundle) {
            this.f11942a.setExtras(bundle);
            return this;
        }

        public a c(int i4) {
            this.f11942a.b(i4);
            return this;
        }

        public a d(Uri uri) {
            this.f11942a.a(uri);
            return this;
        }
    }

    /* renamed from: androidx.core.view.d$b */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f11943a;

        b(ClipData clipData, int i4) {
            this.f11943a = AbstractC1292g.a(clipData, i4);
        }

        @Override // androidx.core.view.C1286d.c
        public void a(Uri uri) {
            this.f11943a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C1286d.c
        public void b(int i4) {
            this.f11943a.setFlags(i4);
        }

        @Override // androidx.core.view.C1286d.c
        public C1286d build() {
            ContentInfo build;
            build = this.f11943a.build();
            return new C1286d(new e(build));
        }

        @Override // androidx.core.view.C1286d.c
        public void setExtras(Bundle bundle) {
            this.f11943a.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.view.d$c */
    private interface c {
        void a(Uri uri);

        void b(int i4);

        C1286d build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    private static final class C0100d implements c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f11944a;

        /* renamed from: b, reason: collision with root package name */
        int f11945b;

        /* renamed from: c, reason: collision with root package name */
        int f11946c;

        /* renamed from: d, reason: collision with root package name */
        Uri f11947d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f11948e;

        C0100d(ClipData clipData, int i4) {
            this.f11944a = clipData;
            this.f11945b = i4;
        }

        @Override // androidx.core.view.C1286d.c
        public void a(Uri uri) {
            this.f11947d = uri;
        }

        @Override // androidx.core.view.C1286d.c
        public void b(int i4) {
            this.f11946c = i4;
        }

        @Override // androidx.core.view.C1286d.c
        public C1286d build() {
            return new C1286d(new g(this));
        }

        @Override // androidx.core.view.C1286d.c
        public void setExtras(Bundle bundle) {
            this.f11948e = bundle;
        }
    }

    /* renamed from: androidx.core.view.d$e */
    private static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f11949a;

        e(ContentInfo contentInfo) {
            this.f11949a = AbstractC1284c.a(A.h.f(contentInfo));
        }

        @Override // androidx.core.view.C1286d.f
        public ClipData a() {
            ClipData clip;
            clip = this.f11949a.getClip();
            return clip;
        }

        @Override // androidx.core.view.C1286d.f
        public int b() {
            int flags;
            flags = this.f11949a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.C1286d.f
        public ContentInfo c() {
            return this.f11949a;
        }

        @Override // androidx.core.view.C1286d.f
        public int d() {
            int source;
            source = this.f11949a.getSource();
            return source;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f11949a + "}";
        }
    }

    /* renamed from: androidx.core.view.d$f */
    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* renamed from: androidx.core.view.d$g */
    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ClipData f11950a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11951b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11952c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f11953d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f11954e;

        g(C0100d c0100d) {
            this.f11950a = (ClipData) A.h.f(c0100d.f11944a);
            this.f11951b = A.h.b(c0100d.f11945b, 0, 5, "source");
            this.f11952c = A.h.e(c0100d.f11946c, 1);
            this.f11953d = c0100d.f11947d;
            this.f11954e = c0100d.f11948e;
        }

        @Override // androidx.core.view.C1286d.f
        public ClipData a() {
            return this.f11950a;
        }

        @Override // androidx.core.view.C1286d.f
        public int b() {
            return this.f11952c;
        }

        @Override // androidx.core.view.C1286d.f
        public ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.C1286d.f
        public int d() {
            return this.f11951b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f11950a.getDescription());
            sb.append(", source=");
            sb.append(C1286d.e(this.f11951b));
            sb.append(", flags=");
            sb.append(C1286d.a(this.f11952c));
            if (this.f11953d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f11953d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f11954e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    C1286d(f fVar) {
        this.f11941a = fVar;
    }

    static String a(int i4) {
        return (i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4);
    }

    static String e(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? String.valueOf(i4) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C1286d g(ContentInfo contentInfo) {
        return new C1286d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f11941a.a();
    }

    public int c() {
        return this.f11941a.b();
    }

    public int d() {
        return this.f11941a.d();
    }

    public ContentInfo f() {
        ContentInfo c4 = this.f11941a.c();
        Objects.requireNonNull(c4);
        return AbstractC1284c.a(c4);
    }

    public String toString() {
        return this.f11941a.toString();
    }
}
