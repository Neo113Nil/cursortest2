package com.startapp.sdk.internal;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.os.OutcomeReceiver;
import com.startapp.sdk.common.utils.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ci implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ di f3665a;

    public ci(di diVar) {
        this.f3665a = diVar;
    }

    public final void onError(Throwable th) {
        Exception exc = (Exception) th;
        if (this.f3665a.a(8)) {
            d9.a(exc);
        }
    }

    public final void onResult(Object obj) {
        List topics;
        long modelVersion;
        long taxonomyVersion;
        int topicId;
        GetTopicsResponse j3 = C1.b.j(obj);
        try {
            HashMap hashMap = new HashMap();
            topics = j3.getTopics();
            Iterator it = topics.iterator();
            while (it.hasNext()) {
                Topic k3 = C1.b.k(it.next());
                modelVersion = k3.getModelVersion();
                taxonomyVersion = k3.getTaxonomyVersion();
                topicId = k3.getTopicId();
                Pair pair = new Pair(Long.valueOf(modelVersion), Long.valueOf(taxonomyVersion));
                Set set = (Set) hashMap.get(pair);
                if (set == null) {
                    set = new LinkedHashSet();
                    hashMap.put(pair, set);
                }
                set.add(Integer.valueOf(topicId));
            }
            this.f3665a.f3706e.set(di.a(hashMap));
            if (this.f3665a.a(1)) {
                d9 d9Var = new d9(e9.f3724d);
                d9Var.f3680d = "TPC.rst";
                d9Var.f3681e = (String) this.f3665a.f3706e.get();
                d9Var.a();
            }
        } catch (Throwable th) {
            if (this.f3665a.a(4)) {
                d9.a(th);
            }
        }
    }
}
