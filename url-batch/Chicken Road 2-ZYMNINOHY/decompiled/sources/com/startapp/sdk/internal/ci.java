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
    public final /* synthetic */ di f6776a;

    public ci(di diVar) {
        this.f6776a = diVar;
    }

    public final void onError(Throwable th) {
        Exception exc = (Exception) th;
        if (this.f6776a.a(8)) {
            d9.a(exc);
        }
    }

    public final void onResult(Object obj) {
        List topics;
        long modelVersion;
        long taxonomyVersion;
        int topicId;
        GetTopicsResponse k4 = E.c0.k(obj);
        try {
            HashMap hashMap = new HashMap();
            topics = k4.getTopics();
            Iterator it = topics.iterator();
            while (it.hasNext()) {
                Topic l4 = E.c0.l(it.next());
                modelVersion = l4.getModelVersion();
                taxonomyVersion = l4.getTaxonomyVersion();
                topicId = l4.getTopicId();
                Pair pair = new Pair(Long.valueOf(modelVersion), Long.valueOf(taxonomyVersion));
                Set set = (Set) hashMap.get(pair);
                if (set == null) {
                    set = new LinkedHashSet();
                    hashMap.put(pair, set);
                }
                set.add(Integer.valueOf(topicId));
            }
            this.f6776a.f6820e.set(di.a(hashMap));
            if (this.f6776a.a(1)) {
                d9 d9Var = new d9(e9.f6838d);
                d9Var.f6792d = "TPC.rst";
                d9Var.f6793e = (String) this.f6776a.f6820e.get();
                d9Var.a();
            }
        } catch (Throwable th) {
            if (this.f6776a.a(4)) {
                d9.a(th);
            }
        }
    }
}
