package defpackage;

import android.net.http.BidirectionalStream;
import android.net.http.HttpEngine;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lin extends ExperimentalBidirectionalStream.Builder {
    private final lip a;
    private final String b;
    private final BidirectionalStream.Callback c;
    private final Executor d;
    private final ArrayList e = new ArrayList();
    private String f = "POST";
    private int g = 3;
    private boolean h;
    private Collection i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;

    public lin(String str, BidirectionalStream.Callback callback, Executor executor, lip lipVar) {
        str.getClass();
        this.b = str;
        callback.getClass();
        this.c = callback;
        executor.getClass();
        this.d = executor;
        this.a = lipVar;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object obj) {
        obj.getClass();
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(obj);
        return this;
    }

    public final void b(String str) {
        str.getClass();
        this.f = str;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream build() {
        BidirectionalStream.Builder newBidirectionalStreamBuilder;
        android.net.http.BidirectionalStream build;
        String str = this.f;
        int i = this.g;
        boolean z = this.h;
        Collection collection = this.i;
        boolean z2 = this.j;
        int i2 = this.k;
        boolean z3 = this.l;
        int i3 = this.m;
        lhv lhvVar = new lhv(this.c);
        lia liaVar = (lia) this.a;
        HttpEngine httpEngine = liaVar.a;
        String str2 = this.b;
        newBidirectionalStreamBuilder = httpEngine.newBidirectionalStreamBuilder(str2, this.d, lhvVar);
        newBidirectionalStreamBuilder.setHttpMethod(str);
        for (Map.Entry entry : this.e) {
            newBidirectionalStreamBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        newBidirectionalStreamBuilder.setPriority(i);
        newBidirectionalStreamBuilder.setDelayRequestHeadersUntilFirstFlushEnabled(z);
        if (z2) {
            newBidirectionalStreamBuilder.setTrafficStatsTag(i2);
        }
        if (z3) {
            newBidirectionalStreamBuilder.setTrafficStatsUid(i3);
        }
        build = newBidirectionalStreamBuilder.build();
        lhw lhwVar = new lhw(build, liaVar, str2, collection);
        lhvVar.a = lhwVar;
        return lhwVar;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder setHttpMethod(String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ BidirectionalStream.Builder setPriority(int i) {
        this.g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.j = true;
        this.k = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.l = true;
        this.m = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ ExperimentalBidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ ExperimentalBidirectionalStream.Builder setPriority(int i) {
        this.g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ ExperimentalBidirectionalStream.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ ExperimentalBidirectionalStream.Builder setHttpMethod(String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder setTrafficStatsTag(int i) {
        setTrafficStatsTag(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder setTrafficStatsUid(int i) {
        setTrafficStatsUid(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder addRequestAnnotation(Object obj) {
        addRequestAnnotation(obj);
        return this;
    }

    @Override // org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ BidirectionalStream.Builder bindToNetwork(long j) {
        return this;
    }
}
