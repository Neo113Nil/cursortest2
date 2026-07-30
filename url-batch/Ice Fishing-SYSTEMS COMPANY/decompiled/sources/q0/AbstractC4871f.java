package q0;

import O7.C0382g;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import n.ExecutorC4797a;
import p0.AbstractC4853b;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: q0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4871f {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f39889a;

    public AbstractC4871f(TopicsManager mTopicsManager) {
        h.e(mTopicsManager, "mTopicsManager");
        this.f39889a = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(AbstractC4871f abstractC4871f, C4866a c4866a, InterfaceC5133d interfaceC5133d) {
        C4870e c4870e;
        int i;
        List topics;
        Iterator it;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        if (interfaceC5133d instanceof C4870e) {
            c4870e = (C4870e) interfaceC5133d;
            int i4 = c4870e.f39888w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c4870e.f39888w = i4 - Integer.MIN_VALUE;
                Object obj = c4870e.f39886u;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c4870e.f39888w;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    GetTopicsRequest a9 = abstractC4871f.a(c4866a);
                    c4870e.f39885n = abstractC4871f;
                    c4870e.f39888w = 1;
                    C0382g c0382g = new C0382g(1, w8.a.f(c4870e));
                    c0382g.r();
                    abstractC4871f.f39889a.getTopics(a9, new ExecutorC4797a(1), new K.h(c0382g));
                    obj = c0382g.q();
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC4871f = c4870e.f39885n;
                    com.bumptech.glide.f.r(obj);
                }
                GetTopicsResponse response = AbstractC4853b.g(obj);
                abstractC4871f.getClass();
                h.e(response, "response");
                ArrayList arrayList = new ArrayList();
                topics = response.getTopics();
                it = topics.iterator();
                while (it.hasNext()) {
                    Topic h9 = AbstractC4853b.h(it.next());
                    taxonomyVersion = h9.getTaxonomyVersion();
                    modelVersion = h9.getModelVersion();
                    topicId = h9.getTopicId();
                    arrayList.add(new C4868c(topicId, taxonomyVersion, modelVersion));
                }
                return new C4867b(arrayList);
            }
        }
        c4870e = new C4870e(abstractC4871f, interfaceC5133d);
        Object obj2 = c4870e.f39886u;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c4870e.f39888w;
        if (i != 0) {
        }
        GetTopicsResponse response2 = AbstractC4853b.g(obj2);
        abstractC4871f.getClass();
        h.e(response2, "response");
        ArrayList arrayList2 = new ArrayList();
        topics = response2.getTopics();
        it = topics.iterator();
        while (it.hasNext()) {
        }
        return new C4867b(arrayList2);
    }

    public GetTopicsRequest a(C4866a request) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        h.e(request, "request");
        adsSdkName = AbstractC4853b.c().setAdsSdkName("com.google.android.gms.ads");
        build = adsSdkName.build();
        h.d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public Object b(C4866a c4866a, InterfaceC5133d interfaceC5133d) {
        return c(this, c4866a, interfaceC5133d);
    }
}
