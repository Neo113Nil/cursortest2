package com.chartboost.sdk.impl;

import android.net.Uri;
import com.chartboost.sdk.impl.al;
import com.chartboost.sdk.impl.c4;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.video.repository.exoplayer.VideoRepositoryDownloadService;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class d8 implements b8, DownloadManager.Listener, c4.b {
    public final c8 a;
    public DownloadManager b;
    public DataSource.Factory c;
    public g8 d;
    public t8 e;
    public volatile List f;
    public volatile Map g;

    public d8(c8 dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.a = dependencies;
        this.f = CollectionsKt.emptyList();
        this.g = MapsKt.emptyMap();
    }

    @Override // com.chartboost.sdk.impl.b8
    public void a(hk asset, x6 stopReason) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(stopReason, "stopReason");
        xb.a("addDownload() - asset: " + asset + ", stopReason " + stopReason, (Throwable) null, 2, (Object) null);
        b(asset, stopReason);
    }

    @Override // com.chartboost.sdk.impl.b8
    public float d(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        y6 b2 = b(id);
        return (b2 != null ? b2.c() : 0.0f) / 100.0f;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(download, "download");
        t8 t8Var = null;
        xb.a("onDownloadChanged() - state " + z6.a(download.state) + ", finalException " + exc, (Throwable) null, 2, (Object) null);
        int i = download.state;
        if (i == 0 || i == 1) {
            t8 t8Var2 = this.e;
            if (t8Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
            } else {
                t8Var = t8Var2;
            }
            t8Var.c(z6.a(download));
            return;
        }
        if (i == 2) {
            c(z6.a(download));
            return;
        }
        if (i == 3) {
            b(z6.a(download));
        } else if (i == 4) {
            a(z6.a(download), exc);
        } else {
            if (i != 5) {
                return;
            }
            d(z6.a(download));
        }
    }

    public /* synthetic */ d8(c8 c8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new c8(null, null, null, null, null, null, null, null, null, null, 1023, null) : c8Var);
    }

    @Override // com.chartboost.sdk.impl.b8
    public void b() {
        a(mj.a(d()));
    }

    @Override // com.chartboost.sdk.impl.b8
    public void a(al.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f = CollectionsKt.plus(this.f, listener);
    }

    @Override // com.chartboost.sdk.impl.b8
    public DataSource.Factory c() {
        DataSource.Factory factory = this.c;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cacheDataSourceFactory");
        return null;
    }

    public static final class b extends Lambda implements Function1 {
        public final /* synthetic */ y6 b;
        public final /* synthetic */ CBError c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y6 y6Var, CBError cBError) {
            super(1);
            this.b = y6Var;
            this.c = cBError;
        }

        public final void a(al.a forEachListener) {
            Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
            forEachListener.a(this.b.f(), this.b.b(), this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((al.a) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.chartboost.sdk.impl.b8
    public DownloadManager d() {
        if (this.b == null) {
            DatabaseProvider databaseProvider = (DatabaseProvider) this.a.d().invoke(this.a.c());
            this.d = (g8) this.a.g().invoke(this.a.c());
            Function4 b2 = this.a.b();
            g8 g8Var = this.d;
            if (g8Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileCaching");
                g8Var = null;
            }
            Cache cache = (Cache) b2.invoke(g8Var, this.a.j(), databaseProvider, this);
            this.c = (DataSource.Factory) this.a.a().invoke(cache, this.a.h());
            Function1 f = this.a.f();
            g8 g8Var2 = this.d;
            if (g8Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileCaching");
                g8Var2 = null;
            }
            this.e = (t8) f.invoke(g8Var2);
            this.b = (DownloadManager) this.a.e().invoke(this.a.c(), databaseProvider, cache, this.a.h(), this);
        }
        DownloadManager downloadManager = this.b;
        if (downloadManager != null) {
            return downloadManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadManager");
        return null;
    }

    public static final class a extends Lambda implements Function1 {
        public final /* synthetic */ y6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y6 y6Var) {
            super(1);
            this.b = y6Var;
        }

        public final void a(al.a forEachListener) {
            Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
            forEachListener.a(this.b.f(), this.b.b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((al.a) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public final /* synthetic */ y6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(y6 y6Var) {
            super(1);
            this.b = y6Var;
        }

        public final void a(al.a forEachListener) {
            Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
            forEachListener.a(this.b.f(), this.b.b(), 0L, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((al.a) obj);
            return Unit.INSTANCE;
        }
    }

    public final void b(hk hkVar) {
        this.g = MapsKt.minus(this.g, hkVar.g());
    }

    @Override // com.chartboost.sdk.impl.b8
    public y6 b(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return mj.a(d(), id);
    }

    public final void e(y6 y6Var) {
        try {
            DownloadService.sendRemoveDownload(this.a.c(), VideoRepositoryDownloadService.class, y6Var.b(), false);
            t8 t8Var = this.e;
            if (t8Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
                t8Var = null;
            }
            t8Var.d(y6Var);
        } catch (Exception e) {
            xb.b("Error sending remove download", e);
        }
    }

    public final void c(y6 y6Var) {
        t8 t8Var = null;
        xb.a("notifyTempFileIsReady() - download " + y6Var + ", listeners: " + this.f, (Throwable) null, 2, (Object) null);
        pg.a("Start downloading " + y6Var.f());
        t8 t8Var2 = this.e;
        if (t8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
        } else {
            t8Var = t8Var2;
        }
        t8Var.e(y6Var);
        a(2, y6Var.f(), new c(y6Var));
    }

    @Override // com.chartboost.sdk.impl.c4.b
    public void c(String url) {
        Object obj;
        Intrinsics.checkNotNullParameter(url, "url");
        Iterator it = mj.a(d()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((y6) obj).f(), url)) {
                    break;
                }
            }
        }
        y6 y6Var = (y6) obj;
        if (y6Var != null) {
            e(y6Var);
        }
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (a((y6) obj)) {
                arrayList.add(obj);
            }
        }
        b(arrayList);
        return list;
    }

    public final void d(y6 y6Var) {
        t8 t8Var = null;
        xb.a("downloadRemoved() - download " + y6Var + ", listeners: " + this.f, (Throwable) null, 2, (Object) null);
        t8 t8Var2 = this.e;
        if (t8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
        } else {
            t8Var = t8Var2;
        }
        t8Var.d(y6Var);
        this.g = MapsKt.minus(this.g, y6Var.f());
    }

    public final void b(y6 y6Var) {
        xb.a("notifyDownloadCompleted() - download " + y6Var + ", listeners: " + this.f, (Throwable) null, 2, (Object) null);
        String f = y6Var.f();
        StringBuilder sb = new StringBuilder();
        sb.append("Video downloaded success ");
        sb.append(f);
        pg.a(sb.toString());
        a(3, y6Var.f(), new a(y6Var));
    }

    public final void a(int i, String str, Function1 function1) {
        for (al.a aVar : this.f) {
            Integer num = (Integer) this.g.get(str);
            if (num == null || num.intValue() != i) {
                this.g = MapsKt.plus(this.g, TuplesKt.to(str, Integer.valueOf(i)));
                function1.invoke(aVar);
            }
        }
    }

    public final void c(hk hkVar) {
        for (y6 y6Var : mj.a(d())) {
            if (!Intrinsics.areEqual(y6Var.b(), hkVar.d())) {
                a(y6Var, x6.g);
            }
        }
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((y6) it.next());
        }
    }

    @Override // com.chartboost.sdk.impl.b8
    public synchronized void a() {
        xb.a("initialize()", (Throwable) null, 2, (Object) null);
        this.a.i().mo4828invoke();
        d();
    }

    @Override // com.chartboost.sdk.impl.b8
    public boolean a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        y6 b2 = b(id);
        return b2 != null && (b2.d() == 3 || b2.d() == 2);
    }

    public final void b(hk hkVar, x6 x6Var) {
        xb.a("VideoAsset.addDownload() - videoAsset " + hkVar + ", stopReason " + x6Var, (Throwable) null, 2, (Object) null);
        if (StringsKt.isBlank(hkVar.g())) {
            return;
        }
        try {
            DownloadService.sendAddDownload(this.a.c(), VideoRepositoryDownloadService.class, new DownloadRequest.Builder(hkVar.d(), Uri.parse(hkVar.g())).build(), x6Var.b(), false);
        } catch (Exception e) {
            xb.b("Error sending add download", e);
        }
    }

    public final boolean a(y6 y6Var) {
        return this.a.j().a(y6Var.e());
    }

    public final void a(y6 y6Var, Exception exc) {
        CBError a2 = a(exc);
        pg.a("Video downloaded failed " + y6Var.f() + " with error " + a2.getErrorDesc());
        a(4, y6Var.f(), new b(y6Var, a2));
    }

    public static /* synthetic */ void a(d8 d8Var, hk hkVar, x6 x6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            x6Var = x6.d;
        }
        d8Var.b(hkVar, x6Var);
    }

    public final void a(y6 y6Var, x6 x6Var) {
        xb.a("Download.sendStopReason() - download " + y6Var + ", stopReason " + x6Var, (Throwable) null, 2, (Object) null);
        try {
            DownloadService.sendSetStopReason(this.a.c(), VideoRepositoryDownloadService.class, y6Var.b(), x6Var.b(), false);
        } catch (Exception e) {
            xb.b("Error sending stop reason", e);
        }
    }

    @Override // com.chartboost.sdk.impl.b8
    public void a(hk asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        xb.a("startDownload() - asset: " + asset, (Throwable) null, 2, (Object) null);
        b(asset);
        c(asset);
        a(this, asset, null, 1, null);
    }

    @Override // com.chartboost.sdk.impl.b8
    public void a(x6 currentDownloadStopReason) {
        y6 a2;
        Intrinsics.checkNotNullParameter(currentDownloadStopReason, "currentDownloadStopReason");
        List<Download> currentDownloads = d().getCurrentDownloads();
        Intrinsics.checkNotNullExpressionValue(currentDownloads, "getCurrentDownloads(...)");
        Download download = (Download) CollectionsKt.firstOrNull((List) currentDownloads);
        if (download == null || (a2 = z6.a(download)) == null) {
            return;
        }
        a(a2, currentDownloadStopReason);
    }

    public final CBError a(Exception exc) {
        if (exc instanceof IOException) {
            return new CBError(CBError.Internal.NETWORK_FAILURE, w7.a(exc));
        }
        return new CBError(CBError.Internal.MISCELLANEOUS, w7.a(exc));
    }
}
