package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c4;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class c4 implements CacheEvictor {
    public final long a;
    public final b b;
    public final Function0 c;
    public final Lazy d;
    public long e;

    public interface b {
        void c(String str);
    }

    public c4(long j, b evictUrlCallback, Function0 treeSetFactory) {
        Intrinsics.checkNotNullParameter(evictUrlCallback, "evictUrlCallback");
        Intrinsics.checkNotNullParameter(treeSetFactory, "treeSetFactory");
        this.a = j;
        this.b = evictUrlCallback;
        this.c = treeSetFactory;
        this.d = LazyKt.lazy(new c());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        a().add(span);
        this.e += span.length;
        a(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        a().remove(span);
        this.e -= span.length;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan oldSpan, CacheSpan newSpan) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(oldSpan, "oldSpan");
        Intrinsics.checkNotNullParameter(newSpan, "newSpan");
        onSpanRemoved(cache, oldSpan);
        onSpanAdded(cache, newSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(Cache cache, String key, long j, long j2) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(key, "key");
        if (j2 != -1) {
            a(cache, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    public static final class a extends Lambda implements Function0 {
        public static final a b = new a();

        /* renamed from: com.chartboost.sdk.impl.c4$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0217a extends FunctionReferenceImpl implements Function2 {
            public static final C0217a b = new C0217a();

            public C0217a() {
                super(2, d4.class, "compare", "compare(Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)I", 1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(CacheSpan p0, CacheSpan p1) {
                int b2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                b2 = d4.b(p0, p1);
                return Integer.valueOf(b2);
            }
        }

        public a() {
            super(0);
        }

        public static final int a(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TreeSet mo4828invoke() {
            final C0217a c0217a = C0217a.b;
            return new TreeSet(new Comparator() { // from class: com.chartboost.sdk.impl.c4$a$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return c4.a.a(Function2.this, obj, obj2);
                }
            });
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TreeSet mo4828invoke() {
            return (TreeSet) c4.this.c.mo4828invoke();
        }
    }

    public /* synthetic */ c4(long j, b bVar, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, bVar, (i & 4) != 0 ? a.b : function0);
    }

    public final void a(Cache cache, long j) {
        while (this.e + j > this.a && !a().isEmpty()) {
            CacheSpan cacheSpan = (CacheSpan) a().first();
            xb.a("evictCache() - " + cacheSpan.key, (Throwable) null, 2, (Object) null);
            cache.removeSpan(cacheSpan);
            b bVar = this.b;
            String key = cacheSpan.key;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            bVar.c(key);
        }
    }

    public final TreeSet a() {
        return (TreeSet) this.d.getValue();
    }
}
