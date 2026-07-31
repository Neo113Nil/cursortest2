package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.c4;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class c8 {
    public final Context a;
    public final lk b;
    public final Function1 c;
    public final Function4 d;
    public final Function2 e;
    public final DefaultHttpDataSource.Factory f;
    public final Function5 g;
    public final Function1 h;
    public final Function0 i;
    public final Function1 j;

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h8 invoke(Context c) {
            Intrinsics.checkNotNullParameter(c, "c");
            return new h8(c, null, null, null, 14, null);
        }
    }

    public static final class b extends Lambda implements Function4 {
        public static final b b = new b();

        public b() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cache invoke(g8 fc, lk vcp, DatabaseProvider dp, c4.b c) {
            Intrinsics.checkNotNullParameter(fc, "fc");
            Intrinsics.checkNotNullParameter(vcp, "vcp");
            Intrinsics.checkNotNullParameter(dp, "dp");
            Intrinsics.checkNotNullParameter(c, "c");
            return j6.a(fc, dp, vcp, c, (CacheEvictor) null, 16, (Object) null);
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function2 {
        public static final c b = new c();

        public c() {
            super(2, j6.class, "cacheDataSourceFactory", "cacheDataSourceFactory(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;)Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource$Factory;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CacheDataSource.Factory invoke(Cache p0, HttpDataSource.Factory p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return j6.a(p0, p1);
        }
    }

    public static final class d extends Lambda implements Function5 {
        public static final d b = new d();

        public d() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DownloadManager invoke(Context c, DatabaseProvider dp, Cache ca, HttpDataSource.Factory hf, DownloadManager.Listener l) {
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(dp, "dp");
            Intrinsics.checkNotNullParameter(ca, "ca");
            Intrinsics.checkNotNullParameter(hf, "hf");
            Intrinsics.checkNotNullParameter(l, "l");
            return j6.a(c, dp, ca, hf, l, 0, 0, 96, null);
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {
        public static final e b = new e();

        public e() {
            super(1, j6.class, "databaseProvider", "databaseProvider(Landroid/content/Context;)Lcom/google/android/exoplayer2/database/DatabaseProvider;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DatabaseProvider invoke(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return j6.a(p0);
        }
    }

    public static final class g extends Lambda implements Function1 {
        public static final g b = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t8 invoke(g8 fc) {
            Intrinsics.checkNotNullParameter(fc, "fc");
            return new t8(fc);
        }
    }

    public c8(Context context, lk videoCachePolicy, Function1 fileCachingFactory, Function4 cacheFactory, Function2 cacheDataSourceFactoryFactory, DefaultHttpDataSource.Factory httpDataSourceFactory, Function5 downloadManagerFactory, Function1 databaseProviderFactory, Function0 setCookieHandler, Function1 fakePrecacheFilesManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCachePolicy, "videoCachePolicy");
        Intrinsics.checkNotNullParameter(fileCachingFactory, "fileCachingFactory");
        Intrinsics.checkNotNullParameter(cacheFactory, "cacheFactory");
        Intrinsics.checkNotNullParameter(cacheDataSourceFactoryFactory, "cacheDataSourceFactoryFactory");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        Intrinsics.checkNotNullParameter(downloadManagerFactory, "downloadManagerFactory");
        Intrinsics.checkNotNullParameter(databaseProviderFactory, "databaseProviderFactory");
        Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
        Intrinsics.checkNotNullParameter(fakePrecacheFilesManagerFactory, "fakePrecacheFilesManagerFactory");
        this.a = context;
        this.b = videoCachePolicy;
        this.c = fileCachingFactory;
        this.d = cacheFactory;
        this.e = cacheDataSourceFactoryFactory;
        this.f = httpDataSourceFactory;
        this.g = downloadManagerFactory;
        this.h = databaseProviderFactory;
        this.i = setCookieHandler;
        this.j = fakePrecacheFilesManagerFactory;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return Intrinsics.areEqual(this.a, c8Var.a) && Intrinsics.areEqual(this.b, c8Var.b) && Intrinsics.areEqual(this.c, c8Var.c) && Intrinsics.areEqual(this.d, c8Var.d) && Intrinsics.areEqual(this.e, c8Var.e) && Intrinsics.areEqual(this.f, c8Var.f) && Intrinsics.areEqual(this.g, c8Var.g) && Intrinsics.areEqual(this.h, c8Var.h) && Intrinsics.areEqual(this.i, c8Var.i) && Intrinsics.areEqual(this.j, c8Var.j);
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public String toString() {
        return "ExoPlayerDownloadManagerDependencies(context=" + this.a + ", videoCachePolicy=" + this.b + ", fileCachingFactory=" + this.c + ", cacheFactory=" + this.d + ", cacheDataSourceFactoryFactory=" + this.e + ", httpDataSourceFactory=" + this.f + ", downloadManagerFactory=" + this.g + ", databaseProviderFactory=" + this.h + ", setCookieHandler=" + this.i + ", fakePrecacheFilesManagerFactory=" + this.j + ")";
    }

    public final Context c() {
        return this.a;
    }

    public final lk j() {
        return this.b;
    }

    public final Function1 g() {
        return this.c;
    }

    public final Function4 b() {
        return this.d;
    }

    public final Function2 a() {
        return this.e;
    }

    public final DefaultHttpDataSource.Factory h() {
        return this.f;
    }

    public final Function5 e() {
        return this.g;
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function0 {
        public static final f b = new f();

        public f() {
            super(0, j6.class, "setCookieHandler", "setCookieHandler()V", 1);
        }

        public final void a() {
            j6.a();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public final Function1 d() {
        return this.h;
    }

    public final Function0 i() {
        return this.i;
    }

    public final Function1 f() {
        return this.j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c8(Context context, lk lkVar, Function1 function1, Function4 function4, Function2 function2, DefaultHttpDataSource.Factory factory, Function5 function5, Function1 function12, Function0 function0, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, (i & 2) != 0 ? f4.b.a().r() : lkVar, (i & 4) != 0 ? a.b : function1, (i & 8) != 0 ? b.b : function4, (i & 16) != 0 ? c.b : function2, (i & 32) != 0 ? new DefaultHttpDataSource.Factory() : factory, (i & 64) != 0 ? d.b : function5, (i & 128) != 0 ? e.b : function12, (i & 256) != 0 ? f.b : function0, (i & 512) != 0 ? g.b : function13);
        Context context2;
        if ((i & 1) != 0) {
            context2 = f4.b.d().getContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
        } else {
            context2 = context;
        }
    }
}
