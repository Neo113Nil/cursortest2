package com.startapp.sdk.ads.video.downloader.impl;

import android.os.Handler;
import android.os.Looper;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.utils.NetworkMonitor$NetworkType;
import com.startapp.sdk.internal.ad;
import com.startapp.sdk.internal.cd;
import com.startapp.sdk.internal.l6;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.m6;
import com.startapp.sdk.internal.mi;
import com.startapp.sdk.internal.n6;
import com.startapp.sdk.internal.o6;
import com.startapp.sdk.internal.p6;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.q6;
import com.startapp.sdk.internal.r2;
import com.startapp.sdk.internal.wd;
import com.startapp.sdk.internal.xd;
import com.startapp.sdk.internal.z2;
import com.startapp.sdk.internal.zc;
import com.startapp.sdk.internal.zh;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final pa f107a;
    public final pa b;
    public final z2 c;
    public final Handler d;
    public final CoroutineScope e;
    public final c f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Semaphore n;

    public b(pa paVar, pa paVar2, pa paVar3, pa paVar4, z2 z2Var) {
        z2Var.getClass();
        this.f107a = paVar;
        this.b = paVar2;
        this.c = z2Var;
        this.d = new Handler(Looper.getMainLooper());
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.e = CoroutineScope;
        this.f = new c(paVar4, paVar3);
        this.g = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(b.g(b.this));
            }
        });
        this.h = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(b.b(b.this));
            }
        });
        this.i = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(b.f(b.this));
            }
        });
        this.j = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(b.e(b.this));
            }
        });
        this.k = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(b.a(b.this));
            }
        });
        this.l = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(b.d(b.this));
            }
        });
        this.m = LazyKt.lazy(new Function0() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.c(b.this);
            }
        });
        this.n = SemaphoreKt.Semaphore$default(1, 0, 2, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new VideoDownloaderImpl$1(this, null), 3, null);
    }

    public static final void b(li liVar, String str) {
        liVar.b.a(str);
    }

    public static final a c(b bVar) {
        return new a(((Number) bVar.h.getValue()).intValue(), ((Number) bVar.i.getValue()).intValue(), RangesKt.coerceIn(((VideoConfig) bVar.b.a()).c(), 1024, 1048576), RangesKt.coerceIn(((VideoConfig) bVar.b.a()).e(), 1048576, 16777216), RangesKt.coerceIn(((VideoConfig) bVar.b.a()).h(), 1, 100));
    }

    public static final int d(b bVar) {
        return RangesKt.coerceIn(((VideoConfig) bVar.b.a()).g(), 1048576, 104857600);
    }

    public static final int e(b bVar) {
        return RangesKt.coerceIn(((VideoConfig) bVar.b.a()).i(), 1024, 1048576);
    }

    public static final int f(b bVar) {
        return RangesKt.coerceIn((int) zh.e(((VideoConfig) bVar.b.a()).j()), 1, 600000);
    }

    public static final int g(b bVar) {
        return RangesKt.coerceIn((int) zh.e(((VideoConfig) bVar.b.a()).k()), 1, 600000);
    }

    public final void a(final li liVar, final String str) {
        if (liVar.d.compareAndSet(false, true)) {
            this.d.post(new Runnable() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    b.b(li.this, str);
                }
            });
        }
    }

    public static final int b(b bVar) {
        return RangesKt.coerceIn((int) zh.e(((VideoConfig) bVar.b.a()).f()), 1, 600000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0096, code lost:
    
        if (((java.lang.Boolean) r13).booleanValue() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r13 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if (r13 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008d -> B:11:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, li liVar, ContinuationImpl continuationImpl) {
        VideoDownloaderImpl$runTask$1 videoDownloaderImpl$runTask$1;
        int i;
        long a2;
        bVar.getClass();
        if (continuationImpl instanceof VideoDownloaderImpl$runTask$1) {
            videoDownloaderImpl$runTask$1 = (VideoDownloaderImpl$runTask$1) continuationImpl;
            int i2 = videoDownloaderImpl$runTask$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                videoDownloaderImpl$runTask$1.label = i2 - Integer.MIN_VALUE;
                Object obj = videoDownloaderImpl$runTask$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = videoDownloaderImpl$runTask$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    a2 = bVar.c.a() + ((Number) bVar.g.getValue()).intValue();
                    videoDownloaderImpl$runTask$1.L$0 = liVar;
                    videoDownloaderImpl$runTask$1.J$0 = a2;
                    videoDownloaderImpl$runTask$1.label = 1;
                    obj = bVar.a(liVar, videoDownloaderImpl$runTask$1);
                } else {
                    if (i == 1) {
                        a2 = videoDownloaderImpl$runTask$1.J$0;
                        liVar = (li) videoDownloaderImpl$runTask$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            long a3 = a2 - bVar.c.a();
                            if (a3 > 0) {
                                videoDownloaderImpl$runTask$1.L$0 = liVar;
                                videoDownloaderImpl$runTask$1.J$0 = a2;
                                videoDownloaderImpl$runTask$1.J$1 = a3;
                                videoDownloaderImpl$runTask$1.label = 2;
                                obj = bVar.a(a3, videoDownloaderImpl$runTask$1);
                            }
                            bVar.a(liVar, (String) null);
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a2 = videoDownloaderImpl$runTask$1.J$0;
                    liVar = (li) videoDownloaderImpl$runTask$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
            }
        }
        videoDownloaderImpl$runTask$1 = new VideoDownloaderImpl$runTask$1(bVar, continuationImpl);
        Object obj2 = videoDownloaderImpl$runTask$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = videoDownloaderImpl$runTask$1.label;
        if (i != 0) {
        }
    }

    public static final long a(b bVar) {
        return RangesKt.coerceIn(zh.e(((VideoConfig) bVar.b.a()).d()), 3600000L, 2592000000L);
    }

    public final void a(String str, mi miVar) {
        str.getClass();
        miVar.getClass();
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new VideoDownloaderImpl$download$1(this, new li(new URL(str), miVar), null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f1, code lost:
    
        if (r2 == r14) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(li liVar, ContinuationImpl continuationImpl) {
        VideoDownloaderImpl$tryDownload$1 videoDownloaderImpl$tryDownload$1;
        VideoDownloaderImpl$tryDownload$1 videoDownloaderImpl$tryDownload$12;
        li liVar2;
        r2 r2Var;
        int i;
        li liVar3;
        r2 r2Var2;
        li liVar4;
        r2 r2Var3;
        File file;
        final File file2;
        xd xdVar;
        VideoDownloaderImpl$tryDownload$1 videoDownloaderImpl$tryDownload$13;
        File file3;
        boolean z;
        Object a2;
        File file4;
        r2 r2Var4;
        xd xdVar2;
        q6 q6Var;
        li liVar5;
        r2 r2Var5;
        li liVar6 = liVar;
        if (continuationImpl instanceof VideoDownloaderImpl$tryDownload$1) {
            videoDownloaderImpl$tryDownload$1 = (VideoDownloaderImpl$tryDownload$1) continuationImpl;
            int i2 = videoDownloaderImpl$tryDownload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                videoDownloaderImpl$tryDownload$1.label = i2 - Integer.MIN_VALUE;
                videoDownloaderImpl$tryDownload$12 = videoDownloaderImpl$tryDownload$1;
                Object obj = videoDownloaderImpl$tryDownload$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                boolean z2 = false;
                switch (videoDownloaderImpl$tryDownload$12.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        c cVar = this.f;
                        String str = liVar6.c;
                        videoDownloaderImpl$tryDownload$12.L$0 = liVar6;
                        videoDownloaderImpl$tryDownload$12.label = 1;
                        obj = cVar.a(str, videoDownloaderImpl$tryDownload$12);
                        break;
                    case 1:
                        liVar6 = (li) videoDownloaderImpl$tryDownload$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        r2 r2Var6 = (r2) obj;
                        if (r2Var6 != null) {
                            if (((Number) this.k.getValue()).longValue() > 0) {
                                if (this.c.a() >= ((Number) this.k.getValue()).longValue() + r2Var6.f) {
                                    i = 0;
                                    if (i == 0) {
                                        c cVar2 = this.f;
                                        String str2 = liVar6.c;
                                        videoDownloaderImpl$tryDownload$12.L$0 = liVar6;
                                        videoDownloaderImpl$tryDownload$12.L$1 = r2Var6;
                                        videoDownloaderImpl$tryDownload$12.I$0 = i;
                                        videoDownloaderImpl$tryDownload$12.label = 2;
                                        if (cVar2.b(str2, videoDownloaderImpl$tryDownload$12) != coroutine_suspended) {
                                            liVar4 = liVar6;
                                            r2Var3 = r2Var6;
                                            a(liVar4, r2Var3.b);
                                            return Boxing.boxBoolean(true);
                                        }
                                    } else if (r2Var6.d == null && r2Var6.e == null) {
                                        c cVar3 = this.f;
                                        String str3 = liVar6.c;
                                        videoDownloaderImpl$tryDownload$12.L$0 = liVar6;
                                        videoDownloaderImpl$tryDownload$12.L$1 = r2Var6;
                                        videoDownloaderImpl$tryDownload$12.I$0 = i;
                                        videoDownloaderImpl$tryDownload$12.label = 3;
                                        if (cVar3.b(str3, videoDownloaderImpl$tryDownload$12) != coroutine_suspended) {
                                            liVar3 = liVar6;
                                            r2Var2 = r2Var6;
                                            a(liVar3, r2Var2.b);
                                            return Boxing.boxBoolean(true);
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                            }
                            i = 1;
                            if (i == 0) {
                            }
                            return coroutine_suspended;
                        }
                        c cVar4 = this.f;
                        int intValue = ((Number) this.l.getValue()).intValue();
                        String str4 = liVar6.c;
                        videoDownloaderImpl$tryDownload$12.L$0 = liVar6;
                        videoDownloaderImpl$tryDownload$12.L$1 = r2Var6;
                        videoDownloaderImpl$tryDownload$12.label = 4;
                        if (cVar4.a(intValue, str4, videoDownloaderImpl$tryDownload$12) != coroutine_suspended) {
                            liVar2 = liVar6;
                            r2Var = r2Var6;
                            c cVar5 = this.f;
                            String str5 = liVar2.c;
                            cVar5.getClass();
                            str5.getClass();
                            ((File) cVar5.f108a.a()).mkdirs();
                            file = new File((File) cVar5.f108a.a(), str5.concat(DefaultDiskStorage.FileType.TEMP));
                            c cVar6 = this.f;
                            String str6 = liVar2.c;
                            cVar6.getClass();
                            str6.getClass();
                            file2 = new File((File) cVar6.f108a.a(), str6.concat(".prg"));
                            if (!file.exists() && file2.exists()) {
                                int i3 = xd.f;
                                xdVar = wd.a(file2);
                                if (xdVar == null) {
                                    file.delete();
                                    file2.delete();
                                }
                                a aVar = (a) this.m.getValue();
                                URL url = liVar2.f324a;
                                NetworkMonitor$NetworkType b = ((cd) ((ad) this.f107a.a())).b();
                                int intValue2 = ((Number) this.j.getValue()).intValue();
                                String str7 = r2Var != null ? r2Var.d : null;
                                String str8 = r2Var != null ? r2Var.e : null;
                                String str9 = str7;
                                Function3 function3 = new Function3() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        return b.a(file2, (String) obj2, (String) obj3, (List) obj4);
                                    }
                                };
                                videoDownloaderImpl$tryDownload$12.L$0 = liVar2;
                                videoDownloaderImpl$tryDownload$12.L$1 = r2Var;
                                videoDownloaderImpl$tryDownload$12.L$2 = file;
                                videoDownloaderImpl$tryDownload$12.L$3 = file2;
                                videoDownloaderImpl$tryDownload$12.L$4 = xdVar;
                                videoDownloaderImpl$tryDownload$12.label = 5;
                                xd xdVar3 = xdVar;
                                String str10 = str8;
                                videoDownloaderImpl$tryDownload$13 = videoDownloaderImpl$tryDownload$12;
                                file3 = file;
                                z = true;
                                a2 = aVar.a(url, file3, b, xdVar3, intValue2, str9, str10, function3, videoDownloaderImpl$tryDownload$13);
                                if (a2 != coroutine_suspended) {
                                    file4 = file2;
                                    r2Var4 = r2Var;
                                    xdVar2 = xdVar3;
                                    q6Var = (q6) a2;
                                    if (xdVar2 != null) {
                                        xdVar2.d.close();
                                    }
                                    if (!(q6Var instanceof o6)) {
                                        c cVar7 = this.f;
                                        String str11 = liVar2.c;
                                        videoDownloaderImpl$tryDownload$13.L$0 = liVar2;
                                        videoDownloaderImpl$tryDownload$13.L$1 = r2Var4;
                                        videoDownloaderImpl$tryDownload$13.L$2 = SpillingKt.nullOutSpilledVariable(file3);
                                        videoDownloaderImpl$tryDownload$13.L$3 = SpillingKt.nullOutSpilledVariable(file4);
                                        videoDownloaderImpl$tryDownload$13.L$4 = SpillingKt.nullOutSpilledVariable(xdVar2);
                                        videoDownloaderImpl$tryDownload$13.L$5 = SpillingKt.nullOutSpilledVariable(q6Var);
                                        videoDownloaderImpl$tryDownload$13.label = 6;
                                        if (cVar7.b(str11, videoDownloaderImpl$tryDownload$13) != coroutine_suspended) {
                                            r2Var5 = r2Var4;
                                            r2Var5.getClass();
                                            a(liVar2, r2Var5.b);
                                            z2 = z;
                                            return Boxing.boxBoolean(z2);
                                        }
                                    } else if (q6Var instanceof l6) {
                                        c cVar8 = this.f;
                                        File file5 = file4;
                                        String str12 = liVar2.c;
                                        l6 l6Var = (l6) q6Var;
                                        long j = l6Var.f315a;
                                        String str13 = l6Var.b;
                                        String str14 = l6Var.c;
                                        videoDownloaderImpl$tryDownload$13.L$0 = liVar2;
                                        videoDownloaderImpl$tryDownload$13.L$1 = SpillingKt.nullOutSpilledVariable(r2Var4);
                                        videoDownloaderImpl$tryDownload$13.L$2 = SpillingKt.nullOutSpilledVariable(file3);
                                        videoDownloaderImpl$tryDownload$13.L$3 = SpillingKt.nullOutSpilledVariable(file5);
                                        videoDownloaderImpl$tryDownload$13.L$4 = SpillingKt.nullOutSpilledVariable(xdVar2);
                                        videoDownloaderImpl$tryDownload$13.L$5 = SpillingKt.nullOutSpilledVariable(q6Var);
                                        videoDownloaderImpl$tryDownload$13.label = 7;
                                        obj = cVar8.a(str12, file3, j, str13, str14, videoDownloaderImpl$tryDownload$13);
                                        if (obj != coroutine_suspended) {
                                            liVar5 = liVar2;
                                            r2 r2Var7 = (r2) obj;
                                            a(liVar5, r2Var7 == null ? r2Var7.b : null);
                                            z2 = z;
                                            return Boxing.boxBoolean(z2);
                                        }
                                    } else {
                                        File file6 = file4;
                                        if (q6Var instanceof m6) {
                                            boolean z3 = ((m6) q6Var).f331a instanceof IOException;
                                            videoDownloaderImpl$tryDownload$13.L$0 = SpillingKt.nullOutSpilledVariable(liVar2);
                                            videoDownloaderImpl$tryDownload$13.L$1 = SpillingKt.nullOutSpilledVariable(r2Var4);
                                            videoDownloaderImpl$tryDownload$13.L$2 = SpillingKt.nullOutSpilledVariable(file3);
                                            videoDownloaderImpl$tryDownload$13.L$3 = SpillingKt.nullOutSpilledVariable(file6);
                                            videoDownloaderImpl$tryDownload$13.L$4 = SpillingKt.nullOutSpilledVariable(xdVar2);
                                            videoDownloaderImpl$tryDownload$13.L$5 = SpillingKt.nullOutSpilledVariable(q6Var);
                                            videoDownloaderImpl$tryDownload$13.label = 8;
                                            Object a3 = a(liVar2, r2Var4, file3, file6, z3, videoDownloaderImpl$tryDownload$13);
                                            if (a3 != coroutine_suspended) {
                                                return a3;
                                            }
                                        } else {
                                            xd xdVar4 = xdVar2;
                                            li liVar7 = liVar2;
                                            File file7 = file3;
                                            if (q6Var instanceof n6) {
                                                boolean z4 = ((n6) q6Var).f347a / 100 == 5 ? z : false;
                                                videoDownloaderImpl$tryDownload$13.L$0 = SpillingKt.nullOutSpilledVariable(liVar7);
                                                videoDownloaderImpl$tryDownload$13.L$1 = SpillingKt.nullOutSpilledVariable(r2Var4);
                                                videoDownloaderImpl$tryDownload$13.L$2 = SpillingKt.nullOutSpilledVariable(file7);
                                                videoDownloaderImpl$tryDownload$13.L$3 = SpillingKt.nullOutSpilledVariable(file6);
                                                videoDownloaderImpl$tryDownload$13.L$4 = SpillingKt.nullOutSpilledVariable(xdVar4);
                                                videoDownloaderImpl$tryDownload$13.L$5 = SpillingKt.nullOutSpilledVariable(q6Var);
                                                videoDownloaderImpl$tryDownload$13.label = 9;
                                                Object a4 = a(liVar7, r2Var4, file7, file6, z4, videoDownloaderImpl$tryDownload$13);
                                                if (a4 != coroutine_suspended) {
                                                    return a4;
                                                }
                                            } else {
                                                if (!(q6Var instanceof p6)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                file7.delete();
                                                file6.delete();
                                                return Boxing.boxBoolean(z2);
                                            }
                                        }
                                    }
                                }
                            } else {
                                file.delete();
                                file2.delete();
                            }
                            xdVar = null;
                            a aVar2 = (a) this.m.getValue();
                            URL url2 = liVar2.f324a;
                            NetworkMonitor$NetworkType b2 = ((cd) ((ad) this.f107a.a())).b();
                            int intValue22 = ((Number) this.j.getValue()).intValue();
                            if (r2Var != null) {
                            }
                            if (r2Var != null) {
                            }
                            String str92 = str7;
                            Function3 function32 = new Function3() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    return b.a(file2, (String) obj2, (String) obj3, (List) obj4);
                                }
                            };
                            videoDownloaderImpl$tryDownload$12.L$0 = liVar2;
                            videoDownloaderImpl$tryDownload$12.L$1 = r2Var;
                            videoDownloaderImpl$tryDownload$12.L$2 = file;
                            videoDownloaderImpl$tryDownload$12.L$3 = file2;
                            videoDownloaderImpl$tryDownload$12.L$4 = xdVar;
                            videoDownloaderImpl$tryDownload$12.label = 5;
                            xd xdVar32 = xdVar;
                            String str102 = str8;
                            videoDownloaderImpl$tryDownload$13 = videoDownloaderImpl$tryDownload$12;
                            file3 = file;
                            z = true;
                            a2 = aVar2.a(url2, file3, b2, xdVar32, intValue22, str92, str102, function32, videoDownloaderImpl$tryDownload$13);
                            if (a2 != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    case 2:
                        r2Var3 = (r2) videoDownloaderImpl$tryDownload$12.L$1;
                        liVar4 = (li) videoDownloaderImpl$tryDownload$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        a(liVar4, r2Var3.b);
                        return Boxing.boxBoolean(true);
                    case 3:
                        r2Var2 = (r2) videoDownloaderImpl$tryDownload$12.L$1;
                        liVar3 = (li) videoDownloaderImpl$tryDownload$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        a(liVar3, r2Var2.b);
                        return Boxing.boxBoolean(true);
                    case 4:
                        r2Var = (r2) videoDownloaderImpl$tryDownload$12.L$1;
                        liVar2 = (li) videoDownloaderImpl$tryDownload$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        c cVar52 = this.f;
                        String str52 = liVar2.c;
                        cVar52.getClass();
                        str52.getClass();
                        ((File) cVar52.f108a.a()).mkdirs();
                        file = new File((File) cVar52.f108a.a(), str52.concat(DefaultDiskStorage.FileType.TEMP));
                        c cVar62 = this.f;
                        String str62 = liVar2.c;
                        cVar62.getClass();
                        str62.getClass();
                        file2 = new File((File) cVar62.f108a.a(), str62.concat(".prg"));
                        if (!file.exists()) {
                            break;
                        }
                        file.delete();
                        file2.delete();
                        xdVar = null;
                        a aVar22 = (a) this.m.getValue();
                        URL url22 = liVar2.f324a;
                        NetworkMonitor$NetworkType b22 = ((cd) ((ad) this.f107a.a())).b();
                        int intValue222 = ((Number) this.j.getValue()).intValue();
                        if (r2Var != null) {
                        }
                        if (r2Var != null) {
                        }
                        String str922 = str7;
                        Function3 function322 = new Function3() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                return b.a(file2, (String) obj2, (String) obj3, (List) obj4);
                            }
                        };
                        videoDownloaderImpl$tryDownload$12.L$0 = liVar2;
                        videoDownloaderImpl$tryDownload$12.L$1 = r2Var;
                        videoDownloaderImpl$tryDownload$12.L$2 = file;
                        videoDownloaderImpl$tryDownload$12.L$3 = file2;
                        videoDownloaderImpl$tryDownload$12.L$4 = xdVar;
                        videoDownloaderImpl$tryDownload$12.label = 5;
                        xd xdVar322 = xdVar;
                        String str1022 = str8;
                        videoDownloaderImpl$tryDownload$13 = videoDownloaderImpl$tryDownload$12;
                        file3 = file;
                        z = true;
                        a2 = aVar22.a(url22, file3, b22, xdVar322, intValue222, str922, str1022, function322, videoDownloaderImpl$tryDownload$13);
                        if (a2 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        xdVar2 = (xd) videoDownloaderImpl$tryDownload$12.L$4;
                        File file8 = (File) videoDownloaderImpl$tryDownload$12.L$3;
                        File file9 = (File) videoDownloaderImpl$tryDownload$12.L$2;
                        r2 r2Var8 = (r2) videoDownloaderImpl$tryDownload$12.L$1;
                        li liVar8 = (li) videoDownloaderImpl$tryDownload$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        z = true;
                        videoDownloaderImpl$tryDownload$13 = videoDownloaderImpl$tryDownload$12;
                        a2 = obj;
                        file3 = file9;
                        r2Var4 = r2Var8;
                        file4 = file8;
                        liVar2 = liVar8;
                        q6Var = (q6) a2;
                        if (xdVar2 != null) {
                        }
                        if (!(q6Var instanceof o6)) {
                        }
                        return coroutine_suspended;
                    case 6:
                        r2Var5 = (r2) videoDownloaderImpl$tryDownload$12.L$1;
                        liVar2 = (li) videoDownloaderImpl$tryDownload$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        z = true;
                        r2Var5.getClass();
                        a(liVar2, r2Var5.b);
                        z2 = z;
                        return Boxing.boxBoolean(z2);
                    case 7:
                        liVar5 = (li) videoDownloaderImpl$tryDownload$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        z = true;
                        r2 r2Var72 = (r2) obj;
                        a(liVar5, r2Var72 == null ? r2Var72.b : null);
                        z2 = z;
                        return Boxing.boxBoolean(z2);
                    case 8:
                    case 9:
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        videoDownloaderImpl$tryDownload$1 = new VideoDownloaderImpl$tryDownload$1(this, continuationImpl);
        videoDownloaderImpl$tryDownload$12 = videoDownloaderImpl$tryDownload$1;
        Object obj2 = videoDownloaderImpl$tryDownload$12.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z22 = false;
        switch (videoDownloaderImpl$tryDownload$12.label) {
        }
    }

    public static final xd a(File file, String str, String str2, List list) {
        list.getClass();
        int i = xd.f;
        return wd.a(file, str, str2, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(li liVar, r2 r2Var, File file, File file2, boolean z, ContinuationImpl continuationImpl) {
        VideoDownloaderImpl$handleDownloadError$1 videoDownloaderImpl$handleDownloadError$1;
        int i;
        if (continuationImpl instanceof VideoDownloaderImpl$handleDownloadError$1) {
            videoDownloaderImpl$handleDownloadError$1 = (VideoDownloaderImpl$handleDownloadError$1) continuationImpl;
            int i2 = videoDownloaderImpl$handleDownloadError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                videoDownloaderImpl$handleDownloadError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = videoDownloaderImpl$handleDownloadError$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = videoDownloaderImpl$handleDownloadError$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (r2Var == null) {
                        if (z) {
                            return Boxing.boxBoolean(false);
                        }
                        file.delete();
                        file2.delete();
                        a(liVar, (String) null);
                        return Boxing.boxBoolean(true);
                    }
                    c cVar = this.f;
                    String str = liVar.c;
                    videoDownloaderImpl$handleDownloadError$1.L$0 = liVar;
                    videoDownloaderImpl$handleDownloadError$1.L$1 = r2Var;
                    videoDownloaderImpl$handleDownloadError$1.L$2 = SpillingKt.nullOutSpilledVariable(file);
                    videoDownloaderImpl$handleDownloadError$1.L$3 = SpillingKt.nullOutSpilledVariable(file2);
                    videoDownloaderImpl$handleDownloadError$1.Z$0 = z;
                    videoDownloaderImpl$handleDownloadError$1.label = 1;
                    if (cVar.b(str, videoDownloaderImpl$handleDownloadError$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r2Var = (r2) videoDownloaderImpl$handleDownloadError$1.L$1;
                    liVar = (li) videoDownloaderImpl$handleDownloadError$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                a(liVar, r2Var.b);
                return Boxing.boxBoolean(true);
            }
        }
        videoDownloaderImpl$handleDownloadError$1 = new VideoDownloaderImpl$handleDownloadError$1(this, continuationImpl);
        Object obj2 = videoDownloaderImpl$handleDownloadError$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = videoDownloaderImpl$handleDownloadError$1.label;
        if (i != 0) {
        }
        a(liVar, r2Var.b);
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        VideoDownloaderImpl$waitForNetwork$1 videoDownloaderImpl$waitForNetwork$1;
        int i;
        Throwable th;
        zc zcVar;
        if (continuationImpl instanceof VideoDownloaderImpl$waitForNetwork$1) {
            videoDownloaderImpl$waitForNetwork$1 = (VideoDownloaderImpl$waitForNetwork$1) continuationImpl;
            int i2 = videoDownloaderImpl$waitForNetwork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                videoDownloaderImpl$waitForNetwork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = videoDownloaderImpl$waitForNetwork$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = videoDownloaderImpl$waitForNetwork$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    zc zcVar2 = new zc() { // from class: com.startapp.sdk.ads.video.downloader.impl.b$$ExternalSyntheticLambda0
                        @Override // com.startapp.sdk.internal.zc
                        public final void a() {
                            b.a(CompletableDeferred.this);
                        }
                    };
                    ((cd) ((ad) this.f107a.a())).a(zcVar2);
                    try {
                        VideoDownloaderImpl$waitForNetwork$2 videoDownloaderImpl$waitForNetwork$2 = new VideoDownloaderImpl$waitForNetwork$2(CompletableDeferred$default, null);
                        videoDownloaderImpl$waitForNetwork$1.L$0 = SpillingKt.nullOutSpilledVariable(CompletableDeferred$default);
                        videoDownloaderImpl$waitForNetwork$1.L$1 = zcVar2;
                        videoDownloaderImpl$waitForNetwork$1.J$0 = j;
                        videoDownloaderImpl$waitForNetwork$1.label = 1;
                        obj = TimeoutKt.withTimeoutOrNull(j, videoDownloaderImpl$waitForNetwork$2, videoDownloaderImpl$waitForNetwork$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zcVar = zcVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        zcVar = zcVar2;
                        ((cd) ((ad) this.f107a.a())).b(zcVar);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zcVar = (zc) videoDownloaderImpl$waitForNetwork$1.L$1;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        ((cd) ((ad) this.f107a.a())).b(zcVar);
                        throw th;
                    }
                }
                boolean z = obj != null;
                ((cd) ((ad) this.f107a.a())).b(zcVar);
                return Boxing.boxBoolean(z);
            }
        }
        videoDownloaderImpl$waitForNetwork$1 = new VideoDownloaderImpl$waitForNetwork$1(this, continuationImpl);
        Object obj2 = videoDownloaderImpl$waitForNetwork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = videoDownloaderImpl$waitForNetwork$1.label;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
        ((cd) ((ad) this.f107a.a())).b(zcVar);
        return Boxing.boxBoolean(z);
    }

    public static final void a(CompletableDeferred completableDeferred) {
        completableDeferred.complete(Unit.INSTANCE);
    }
}
