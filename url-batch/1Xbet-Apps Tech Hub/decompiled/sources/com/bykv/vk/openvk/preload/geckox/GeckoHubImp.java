package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.b.h;
import com.bykv.vk.openvk.preload.b.l;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.a.a.a;
import com.bykv.vk.openvk.preload.geckox.b;
import com.bykv.vk.openvk.preload.geckox.d.c;
import com.bykv.vk.openvk.preload.geckox.d.e;
import com.bykv.vk.openvk.preload.geckox.d.g;
import com.bykv.vk.openvk.preload.geckox.d.i;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bykv.vk.openvk.preload.geckox.utils.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GeckoHubImp {

    static class a {
        private static GeckoHubImp a = new GeckoHubImp();
    }

    public static GeckoHubImp inst(Context context) {
        c.a(context);
        return a.a;
    }

    private GeckoHubImp() {
    }

    public static void setRandomHost(String str) {
        c.a(str);
    }

    public void preload(String str, IStatisticMonitor iStatisticMonitor, Set<String> set, INetWork iNetWork) {
        c a2 = c.a();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b.a aVar = new b.a(c.b);
        aVar.b = Arrays.asList("cca47107bfcbdb211d88f3385aeede40");
        aVar.c = Arrays.asList("cca47107bfcbdb211d88f3385aeede40");
        aVar.i = 38L;
        aVar.k = str;
        aVar.j = "9999999.0.0";
        a.C0027a c0027a = new a.C0027a();
        c0027a.a = 20;
        com.bykv.vk.openvk.preload.geckox.a.a.b bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.c;
        if (bVar == null) {
            bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.a;
        }
        c0027a.b = bVar;
        aVar.h = new com.bykv.vk.openvk.preload.geckox.a.a.a(c0027a, (byte) 0);
        aVar.m = c.a;
        aVar.g = false;
        aVar.l = c.c;
        aVar.f = iStatisticMonitor;
        aVar.a = iNetWork;
        b bVar2 = new b(aVar, (byte) 0);
        a2.d = iNetWork;
        List<String> list = bVar2.e;
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        Context context = bVar2.a;
        if (context != null) {
            f.a = context;
        }
        com.bykv.vk.openvk.preload.geckox.a aVar2 = new com.bykv.vk.openvk.preload.geckox.a(bVar2);
        HashMap hashMap = new HashMap();
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            linkedList.add(new CheckRequestBodyModel.TargetChannel(it.next()));
        }
        hashMap.put("cca47107bfcbdb211d88f3385aeede40", linkedList);
        if (TextUtils.isEmpty("default")) {
            throw new IllegalArgumentException("groupType == null");
        }
        if (!aVar2.a()) {
            throw new IllegalArgumentException("deployments keys not in local keys");
        }
        if (!aVar2.a(hashMap)) {
            throw new IllegalArgumentException("target keys not in deployments keys");
        }
        b.b().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1
            final /* synthetic */ String a;
            final /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a b = null;
            final /* synthetic */ Map c = null;
            final /* synthetic */ Map d;

            AnonymousClass1(String str2, Map hashMap2) {
                r2 = str2;
                r3 = hashMap2;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0688 A[Catch: all -> 0x06a1, TryCatch #0 {all -> 0x06a1, blocks: (B:32:0x0678, B:34:0x0688, B:38:0x0692, B:40:0x069c), top: B:31:0x0678 }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x064a  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x06a7  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                com.bykv.vk.openvk.preload.geckox.a.a.b bVar3;
                AnonymousClass1 anonymousClass1;
                Object obj;
                com.bykv.vk.openvk.preload.geckox.a.a.b bVar4;
                String str2;
                a aVar3;
                String str3 = "download_gecko_end";
                GeckoLogger.d("gecko-debug-tag", "start check update...", r2);
                if (a.this.c.g != null) {
                    bVar3 = a.this.c.g.b;
                    bVar3.a(a.this.c.g, a.this.c.n, a.this.c.e);
                } else {
                    bVar3 = null;
                }
                try {
                    a.this.c.p = new JSONObject();
                    com.bykv.vk.openvk.preload.geckox.e.a aVar4 = this.b;
                    File file = a.this.d;
                    b bVar5 = a.this.c;
                    com.bykv.vk.openvk.preload.geckox.e.b bVar6 = a.this.a;
                    Map map = this.c;
                    Map map2 = r3;
                    String str4 = r2;
                    ArrayList arrayList = new ArrayList();
                    obj = "all channel update finished";
                    try {
                        try {
                            h.a a3 = new h.a().a(e.class);
                            bVar4 = bVar3;
                            try {
                                a3.c = new Object[]{file, bVar5.f};
                                a3.b = bVar6.a(e.class);
                                arrayList.add(a3.a());
                                h.a a4 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.c.class);
                                a4.c = new Object[]{bVar5, map, map2, aVar4, str4};
                                a4.b = new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.h.a.6
                                    final /* synthetic */ b b;

                                    public AnonymousClass6(b bVar52) {
                                        r2 = bVar52;
                                    }

                                    @Override // com.bykv.vk.openvk.preload.b.b.a
                                    public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar7, d dVar) {
                                        super.b(bVar7, dVar);
                                        List<UpdatePackage> list2 = (List) bVar7.b(c.class);
                                        bVar7.a(c.class);
                                        HashMap hashMap2 = new HashMap();
                                        for (UpdatePackage updatePackage : list2) {
                                            String accessKey = updatePackage.getAccessKey();
                                            List list3 = (List) hashMap2.get(accessKey);
                                            if (list3 == null) {
                                                list3 = new ArrayList();
                                            }
                                            list3.add(updatePackage);
                                            hashMap2.put(accessKey, list3);
                                        }
                                        try {
                                            r2.p.put(dVar.getClass().getSimpleName() + "onEnd", "");
                                        } catch (Throwable unused) {
                                        }
                                    }

                                    @Override // com.bykv.vk.openvk.preload.b.b.a
                                    public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar7, d dVar) {
                                        super.a(bVar7, dVar);
                                        try {
                                            r2.p.put(dVar.getClass().getSimpleName() + "onStart", "");
                                        } catch (Throwable unused) {
                                        }
                                    }

                                    @Override // com.bykv.vk.openvk.preload.b.b.a
                                    public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar7, d dVar, Throwable th) {
                                        super.a(bVar7, dVar, th);
                                        bVar7.a(c.class);
                                        try {
                                            r2.p.put(dVar.getClass().getSimpleName() + "onException", th.toString());
                                        } catch (Throwable unused) {
                                        }
                                    }

                                    @Override // com.bykv.vk.openvk.preload.b.b.a
                                    public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar7, d dVar, Throwable th) {
                                        super.b(bVar7, dVar, th);
                                        try {
                                            r2.p.put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }, bVar6.a(com.bykv.vk.openvk.preload.geckox.d.c.class));
                                arrayList.add(a4.a());
                                h.a a5 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.f.class);
                                a5.c = new Object[]{b.a()};
                                a5.b = new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.h.a.1
                                    final /* synthetic */ b b;

                                    public AnonymousClass1(b bVar52) {
                                        r2 = bVar52;
                                    }

                                    @Override // com.bykv.vk.openvk.preload.b.b.a
                                    public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar7, d dVar, Throwable th) {
                                        super.a(bVar7, dVar, th);
                                        if (com.bykv.vk.openvk.preload.geckox.e.a.this != null) {
                                            ((UpdatePackage) bVar7.b(com.bykv.vk.openvk.preload.geckox.d.f.class)).getChannel();
                                        }
                                        try {
                                            r2.p.put(dVar.getClass().getSimpleName() + "onException", th.toString());
                                        } catch (Throwable unused) {
                                        }
                                    }

                                    @Override // com.bykv.vk.openvk.preload.b.b.a
                                    public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar7, d dVar, Throwable th) {
                                        super.b(bVar7, dVar, th);
                                        try {
                                            r2.p.put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                                        } catch (Throwable unused) {
                                        }
                                    }

                                    @Override // com.bykv.vk.openvk.preload.b.b.a
                                    public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar7, d dVar) {
                                        super.a(bVar7, dVar);
                                        try {
                                            r2.p.put(dVar.getClass().getSimpleName() + "onStart", "");
                                        } catch (Throwable unused) {
                                        }
                                    }

                                    @Override // com.bykv.vk.openvk.preload.b.b.a
                                    public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar7, d dVar) {
                                        super.b(bVar7, dVar);
                                        try {
                                            r2.p.put(dVar.getClass().getSimpleName() + "onEnd", "");
                                        } catch (Throwable unused) {
                                        }
                                    }

                                    @Override // com.bykv.vk.openvk.preload.b.b.a
                                    public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar7, d dVar) {
                                        super.c(bVar7, dVar);
                                        try {
                                            r2.p.put(dVar.getClass().getSimpleName() + "onPipelineEnd", "");
                                        } catch (Throwable unused) {
                                        }
                                    }
                                };
                                arrayList.add(a5.a());
                                l.b bVar7 = new l.b();
                                l.a a6 = bVar7.a("branch_zip");
                                l.b bVar8 = new l.b();
                                l.a a7 = bVar8.a("patch");
                                ArrayList arrayList2 = new ArrayList();
                                try {
                                    arrayList2.add(new h.a().a(com.bykv.vk.openvk.preload.geckox.d.h.class).a());
                                    h.a a8 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class);
                                    try {
                                        a8.c = new Object[]{bVar52, file};
                                        a8.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.b(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class));
                                        arrayList2.add(a8.a());
                                        h.a a9 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class);
                                        a9.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class));
                                        arrayList2.add(a9.a());
                                        h.a a10 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class);
                                        a10.c = new Object[]{bVar52};
                                        a10.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class));
                                        arrayList2.add(a10.a());
                                        h.a a11 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class);
                                        a11.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class));
                                        arrayList2.add(a11.a());
                                        h.a a12 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.f.class);
                                        a12.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.b.b.f.class));
                                        arrayList2.add(a12.a());
                                        h.a a13 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.b.b.e.class);
                                        a13.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4));
                                        arrayList2.add(a13.a());
                                        a7.a(arrayList2);
                                        l.a a14 = bVar8.a("full");
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(new h.a().a(g.class).a());
                                        h.a a15 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class);
                                        a15.c = new Object[]{bVar52, file};
                                        a15.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.b(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class));
                                        arrayList3.add(a15.a());
                                        h.a a16 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class);
                                        a16.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class));
                                        arrayList3.add(a16.a());
                                        h.a a17 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class);
                                        a17.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class));
                                        arrayList3.add(a17.a());
                                        h.a a18 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.b.a.c.class);
                                        a18.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4));
                                        arrayList3.add(a18.a());
                                        a14.a(arrayList3);
                                        l.a a19 = a6.a(bVar8.a(com.bykv.vk.openvk.preload.geckox.d.b.class));
                                        h.a a20 = new h.a().a(com.bykv.vk.openvk.preload.b.f.class);
                                        a20.b = com.bykv.vk.openvk.preload.geckox.h.a.a(bVar52);
                                        a19.a(a20.a());
                                        l.a a21 = bVar7.a("branch_single_file");
                                        l.b bVar9 = new l.b();
                                        l.a a22 = bVar9.a("patch");
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(new h.a().a(com.bykv.vk.openvk.preload.geckox.d.h.class).a());
                                        h.a a23 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class);
                                        a23.c = new Object[]{bVar52, file};
                                        a23.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.b(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class));
                                        arrayList4.add(a23.a());
                                        h.a a24 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class);
                                        a24.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class));
                                        arrayList4.add(a24.a());
                                        h.a a25 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class);
                                        a25.c = new Object[]{bVar52};
                                        a25.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class));
                                        arrayList4.add(a25.a());
                                        h.a a26 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class);
                                        a26.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class));
                                        arrayList4.add(a26.a());
                                        h.a a27 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class);
                                        a27.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class));
                                        arrayList4.add(a27.a());
                                        a22.a(arrayList4);
                                        l.a a28 = bVar9.a("full");
                                        ArrayList arrayList5 = new ArrayList();
                                        arrayList5.add(new h.a().a(g.class).a());
                                        h.a a29 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class);
                                        a29.c = new Object[]{bVar52, file};
                                        a29.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.b(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class));
                                        arrayList5.add(a29.a());
                                        h.a a30 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class);
                                        a30.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4, bVar52), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class));
                                        arrayList5.add(a30.a());
                                        h.a a31 = new h.a().a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class);
                                        a31.b = new com.bykv.vk.openvk.preload.b.b.b(com.bykv.vk.openvk.preload.geckox.h.a.a(aVar4), bVar6.a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class));
                                        arrayList5.add(a31.a());
                                        a28.a(arrayList5);
                                        l.a a32 = a21.a(bVar9.a(com.bykv.vk.openvk.preload.geckox.d.b.class));
                                        h.a a33 = new h.a().a(com.bykv.vk.openvk.preload.b.f.class);
                                        a33.b = com.bykv.vk.openvk.preload.geckox.h.a.a(bVar52);
                                        a32.a(a33.a());
                                        l.a a34 = bVar7.a("branch_myarchive_file");
                                        l.b bVar10 = new l.b();
                                        bVar10.a("patch").a(Collections.emptyList());
                                        bVar10.a("full").a(Collections.emptyList());
                                        l.a a35 = a34.a(bVar10.a(com.bykv.vk.openvk.preload.geckox.d.b.class));
                                        h.a a36 = new h.a().a(com.bykv.vk.openvk.preload.b.f.class);
                                        a36.b = com.bykv.vk.openvk.preload.geckox.h.a.a(bVar52);
                                        a35.a(a36.a());
                                        arrayList.add(bVar7.a(com.bykv.vk.openvk.preload.geckox.d.a.class));
                                        h.a a37 = new h.a().a(i.class);
                                        a37.b = new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.h.a.2
                                            final /* synthetic */ b b;

                                            public AnonymousClass2(b bVar52) {
                                                r2 = bVar52;
                                            }

                                            @Override // com.bykv.vk.openvk.preload.b.b.a
                                            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar11, d dVar) {
                                                super.c(bVar11, dVar);
                                                Pair pair = (Pair) bVar11.a(i.class);
                                                if (com.bykv.vk.openvk.preload.geckox.e.a.this != null) {
                                                    Object obj2 = pair.first;
                                                    ((Long) pair.second).longValue();
                                                }
                                            }

                                            @Override // com.bykv.vk.openvk.preload.b.b.a
                                            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar11, d dVar, Throwable th) {
                                                super.a(bVar11, dVar, th);
                                                try {
                                                    r2.p.put(dVar.getClass().getSimpleName() + "onException", th.toString());
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            @Override // com.bykv.vk.openvk.preload.b.b.a
                                            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar11, d dVar, Throwable th) {
                                                super.b(bVar11, dVar, th);
                                                try {
                                                    r2.p.put(dVar.getClass().getSimpleName() + "onChainException", th.toString());
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            @Override // com.bykv.vk.openvk.preload.b.b.a
                                            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar11, d dVar) {
                                                super.a(bVar11, dVar);
                                                try {
                                                    r2.p.put(dVar.getClass().getSimpleName() + "onStart", "");
                                                } catch (Throwable unused) {
                                                }
                                            }

                                            @Override // com.bykv.vk.openvk.preload.b.b.a
                                            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar11, d dVar) {
                                                super.b(bVar11, dVar);
                                                try {
                                                    r2.p.put(dVar.getClass().getSimpleName() + "onEnd", "");
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        };
                                        arrayList.add(a37.a());
                                        anonymousClass1 = this;
                                        try {
                                            str2 = "gecko-debug-tag";
                                        } catch (Exception e) {
                                            e = e;
                                            str3 = "download_gecko_end";
                                            str2 = "gecko-debug-tag";
                                            Exception exc = e;
                                            try {
                                                JSONObject jSONObject = new JSONObject();
                                                jSONObject.put(FirebaseAnalytics.Param.SUCCESS, false);
                                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, exc.toString());
                                                jSONObject.put("code", 2);
                                                a.this.c.p = jSONObject;
                                            } catch (Throwable unused) {
                                            }
                                            try {
                                                GeckoLogger.w(str2, "Gecko update failed:", exc);
                                                if (bVar4 != null) {
                                                }
                                                a.this.c.c.upload(str3, a.this.c.p);
                                                GeckoLogger.d(str2, obj);
                                                aVar3 = a.this;
                                                ArrayList arrayList6 = new ArrayList();
                                                arrayList6.addAll(aVar3.c.e);
                                                String a38 = com.bykv.vk.openvk.preload.geckox.c.b.a().a.a(new com.bykv.vk.openvk.preload.geckox.i.a.a(arrayList6));
                                                if (aVar3.c.b == null) {
                                                }
                                                aVar3.b.add(a38);
                                            } catch (Throwable th) {
                                                th = th;
                                                Throwable th2 = th;
                                                if (bVar4 != null) {
                                                    bVar4.a();
                                                }
                                                a.this.c.c.upload(str3, a.this.c.p);
                                                GeckoLogger.d(str2, obj);
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str3 = "download_gecko_end";
                                            str2 = "gecko-debug-tag";
                                            Throwable th22 = th;
                                            if (bVar4 != null) {
                                            }
                                            a.this.c.c.upload(str3, a.this.c.p);
                                            GeckoLogger.d(str2, obj);
                                            throw th22;
                                        }
                                        try {
                                            GeckoLogger.d(str2, "update finished", com.bykv.vk.openvk.preload.b.c.a(arrayList, null, null).a((com.bykv.vk.openvk.preload.b.b) r2));
                                            if (bVar4 != null) {
                                                bVar4.a();
                                            }
                                            a.this.c.c.upload("download_gecko_end", a.this.c.p);
                                            GeckoLogger.d(str2, obj);
                                        } catch (Exception e2) {
                                            e = e2;
                                            str3 = "download_gecko_end";
                                            Exception exc2 = e;
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, false);
                                            jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, exc2.toString());
                                            jSONObject2.put("code", 2);
                                            a.this.c.p = jSONObject2;
                                            GeckoLogger.w(str2, "Gecko update failed:", exc2);
                                            if (bVar4 != null) {
                                            }
                                            a.this.c.c.upload(str3, a.this.c.p);
                                            GeckoLogger.d(str2, obj);
                                            aVar3 = a.this;
                                            ArrayList arrayList62 = new ArrayList();
                                            arrayList62.addAll(aVar3.c.e);
                                            String a382 = com.bykv.vk.openvk.preload.geckox.c.b.a().a.a(new com.bykv.vk.openvk.preload.geckox.i.a.a(arrayList62));
                                            if (aVar3.c.b == null) {
                                            }
                                            aVar3.b.add(a382);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str3 = "download_gecko_end";
                                            Throwable th222 = th;
                                            if (bVar4 != null) {
                                            }
                                            a.this.c.c.upload(str3, a.this.c.p);
                                            GeckoLogger.d(str2, obj);
                                            throw th222;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        anonymousClass1 = this;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        anonymousClass1 = this;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    anonymousClass1 = this;
                                } catch (Throwable th6) {
                                    th = th6;
                                    anonymousClass1 = this;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                anonymousClass1 = this;
                                str2 = "gecko-debug-tag";
                                str3 = "download_gecko_end";
                                Exception exc22 = e;
                                JSONObject jSONObject22 = new JSONObject();
                                jSONObject22.put(FirebaseAnalytics.Param.SUCCESS, false);
                                jSONObject22.put(NotificationCompat.CATEGORY_MESSAGE, exc22.toString());
                                jSONObject22.put("code", 2);
                                a.this.c.p = jSONObject22;
                                GeckoLogger.w(str2, "Gecko update failed:", exc22);
                                if (bVar4 != null) {
                                }
                                a.this.c.c.upload(str3, a.this.c.p);
                                GeckoLogger.d(str2, obj);
                                aVar3 = a.this;
                                ArrayList arrayList622 = new ArrayList();
                                arrayList622.addAll(aVar3.c.e);
                                String a3822 = com.bykv.vk.openvk.preload.geckox.c.b.a().a.a(new com.bykv.vk.openvk.preload.geckox.i.a.a(arrayList622));
                                if (aVar3.c.b == null) {
                                }
                                aVar3.b.add(a3822);
                            } catch (Throwable th7) {
                                th = th7;
                                anonymousClass1 = this;
                                str2 = "gecko-debug-tag";
                                str3 = "download_gecko_end";
                                Throwable th2222 = th;
                                if (bVar4 != null) {
                                }
                                a.this.c.c.upload(str3, a.this.c.p);
                                GeckoLogger.d(str2, obj);
                                throw th2222;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            anonymousClass1 = this;
                            bVar4 = bVar3;
                        } catch (Throwable th8) {
                            th = th8;
                            anonymousClass1 = this;
                            bVar4 = bVar3;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        anonymousClass1 = this;
                        bVar4 = bVar3;
                        str2 = "gecko-debug-tag";
                        Exception exc222 = e;
                        JSONObject jSONObject222 = new JSONObject();
                        jSONObject222.put(FirebaseAnalytics.Param.SUCCESS, false);
                        jSONObject222.put(NotificationCompat.CATEGORY_MESSAGE, exc222.toString());
                        jSONObject222.put("code", 2);
                        a.this.c.p = jSONObject222;
                        GeckoLogger.w(str2, "Gecko update failed:", exc222);
                        if (bVar4 != null) {
                            bVar4.a();
                        }
                        a.this.c.c.upload(str3, a.this.c.p);
                        GeckoLogger.d(str2, obj);
                        aVar3 = a.this;
                        ArrayList arrayList6222 = new ArrayList();
                        arrayList6222.addAll(aVar3.c.e);
                        String a38222 = com.bykv.vk.openvk.preload.geckox.c.b.a().a.a(new com.bykv.vk.openvk.preload.geckox.i.a.a(arrayList6222));
                        if (aVar3.c.b == null) {
                        }
                        aVar3.b.add(a38222);
                    } catch (Throwable th9) {
                        th = th9;
                        anonymousClass1 = this;
                        bVar4 = bVar3;
                        str2 = "gecko-debug-tag";
                        Throwable th22222 = th;
                        if (bVar4 != null) {
                        }
                        a.this.c.c.upload(str3, a.this.c.p);
                        GeckoLogger.d(str2, obj);
                        throw th22222;
                    }
                } catch (Exception e8) {
                    e = e8;
                    anonymousClass1 = this;
                    obj = "all channel update finished";
                } catch (Throwable th10) {
                    th = th10;
                    anonymousClass1 = this;
                    obj = "all channel update finished";
                }
                aVar3 = a.this;
                ArrayList arrayList62222 = new ArrayList();
                arrayList62222.addAll(aVar3.c.e);
                try {
                    String a382222 = com.bykv.vk.openvk.preload.geckox.c.b.a().a.a(new com.bykv.vk.openvk.preload.geckox.i.a.a(arrayList62222));
                    if (!(aVar3.c.b == null && aVar3.c.b.a()) && aVar3.b.size() < 10) {
                        aVar3.b.add(a382222);
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }

    public com.bykv.vk.openvk.preload.falconx.loader.a getGeckoResLoader() {
        c.a();
        return c.b();
    }

    public void releaseGeckoResLoader(ILoader iLoader) {
        c.a();
        c.a(iLoader);
    }

    public WebResourceResponseModel findResAndMsg(ILoader iLoader, String str, String str2) {
        return c.a().a(iLoader, str, str2);
    }

    public WebResourceResponse findRes(ILoader iLoader, String str, String str2) {
        return c.a().a(iLoader, str, str2).getWebResourceResponse();
    }

    public int getResCount(ILoader iLoader, String str) {
        c.a();
        return c.a(iLoader, str);
    }

    public static void setThreadPoolExecutorCallback(IThreadPoolCallback iThreadPoolCallback) {
        b.a(iThreadPoolCallback);
    }
}
