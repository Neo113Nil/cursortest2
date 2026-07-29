package com.youappi.sdk.logic.impl.cache;

import android.content.Context;
import android.net.Uri;
import com.a.a.a.e;
import com.a.a.a.f;
import com.youappi.sdk.AdType;
import com.youappi.sdk.net.model.AdItem;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private Context f9449a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<AdType, Set<AdItem>> f9450b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private b f9451c;

    public c(Context context) {
        this.f9449a = context;
        this.f9451c = new b(context.getCacheDir().getAbsolutePath(), context.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AdItem adItem) {
        Set<AdItem> set = this.f9450b.get(adItem.getAdType());
        if (set == null) {
            set = new HashSet<>();
        }
        set.add(adItem);
        this.f9450b.put(adItem.getAdType(), set);
    }

    @Override // com.youappi.sdk.logic.impl.cache.d
    public void a(AdItem adItem) {
        Set<AdItem> set = this.f9450b.get(adItem.getAdType());
        if (set != null) {
            set.remove(adItem);
        }
    }

    @Override // com.youappi.sdk.logic.impl.cache.d
    public void a(final AdItem adItem, List<String> list, final a aVar) {
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        ArrayList arrayList = new ArrayList();
        final Object obj = new Object();
        for (String str : list) {
            File a2 = this.f9451c.a(str);
            if (a2 == null || !a2.exists() || System.currentTimeMillis() - a2.lastModified() > 172800000) {
                concurrentLinkedQueue.add(this.f9451c.a(str, new com.a.a.a.b<File>() { // from class: com.youappi.sdk.logic.impl.cache.c.1
                    @Override // com.a.a.a.b
                    public boolean onNetError(com.a.a.a.d dVar) {
                        synchronized (obj) {
                            if (!dVar.a().r()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((e) it.next()).o();
                                }
                                Throwable th = null;
                                if (dVar.b() != null && (dVar.b() instanceof Throwable)) {
                                    th = (Throwable) dVar.b();
                                }
                                String k = dVar.a().k();
                                if (dVar.a().l() != null) {
                                    k = k + "/" + dVar.a().l();
                                }
                                aVar.a(adItem, k, dVar.c(), th);
                                concurrentLinkedQueue.clear();
                            }
                        }
                        return false;
                    }

                    @Override // com.a.a.a.b
                    public boolean onNetFinished(f<File> fVar) {
                        synchronized (obj) {
                            concurrentLinkedQueue.remove(fVar.a());
                            if (!fVar.a().r() && concurrentLinkedQueue.size() == 0) {
                                c.this.b(adItem);
                                if (aVar != null) {
                                    aVar.a(adItem);
                                }
                            }
                        }
                        return false;
                    }
                }));
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == list.size()) {
            b(adItem);
            if (aVar != null) {
                aVar.a(adItem);
            }
        }
    }

    @Override // com.youappi.sdk.logic.IAssetResolver
    public Uri getAssetUri(String str) {
        File a2 = this.f9451c.a(str);
        return (a2 == null || !a2.exists()) ? Uri.parse(str) : Uri.fromFile(a2);
    }
}
