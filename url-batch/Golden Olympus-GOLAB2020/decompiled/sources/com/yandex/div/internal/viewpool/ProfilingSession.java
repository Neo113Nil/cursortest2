package com.yandex.div.internal.viewpool;

import androidx.collection.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ProfilingSession {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Accumulator mOverallTimeAccumulator = new Accumulator();

    @NotNull
    private final Accumulator mLongRequestAccumulator = new Accumulator();

    @NotNull
    private final a mBlockedViewAccumulators = new a();

    @Metadata
    private static final class Accumulator {
        private long accumulated;
        private int count;

        public final void add(long j4) {
            this.accumulated += j4;
        }

        public final void addAndIncrement(long j4) {
            add(j4);
            this.count++;
        }

        public final long getAccumulated() {
            return this.accumulated;
        }

        public final long getAvg() {
            int i4 = this.count;
            if (i4 == 0) {
                return 0L;
            }
            return this.accumulated / i4;
        }

        public final int getCount() {
            return this.count;
        }

        public final void reset() {
            this.accumulated = 0L;
            this.count = 0;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long toMicroseconds(long j4) {
            return j4 / 1000;
        }

        private Companion() {
        }
    }

    public final void clear() {
        this.mOverallTimeAccumulator.reset();
        this.mLongRequestAccumulator.reset();
        Iterator it = this.mBlockedViewAccumulators.entrySet().iterator();
        while (it.hasNext()) {
            ((Accumulator) ((Map.Entry) it.next()).getValue()).reset();
        }
    }

    @NotNull
    public final Map<String, Object> flush() {
        HashMap hashMap = new HashMap();
        hashMap.put("view obtaining - total count", Integer.valueOf(this.mOverallTimeAccumulator.getCount()));
        hashMap.put("view obtaining - total time (µs)", Long.valueOf(ProfilingSessionKt.roundRoughly(Companion.toMicroseconds(this.mOverallTimeAccumulator.getAccumulated()))));
        for (Map.Entry entry : this.mBlockedViewAccumulators.entrySet()) {
            String str = (String) entry.getKey();
            Accumulator accumulator = (Accumulator) entry.getValue();
            if (accumulator.getCount() > 0) {
                hashMap.put("blocking view obtaining for " + str + " - count", Integer.valueOf(accumulator.getCount()));
                hashMap.put("blocking view obtaining for " + str + " - avg time (µs)", Long.valueOf(ProfilingSessionKt.roundRoughly(Companion.toMicroseconds(accumulator.getAvg()))));
            }
        }
        if (this.mLongRequestAccumulator.getCount() > 0) {
            hashMap.put("long view requests - count", Integer.valueOf(this.mLongRequestAccumulator.getCount()));
            hashMap.put("long view requests - avg time (µs)", Long.valueOf(ProfilingSessionKt.roundRoughly(Companion.toMicroseconds(this.mLongRequestAccumulator.getAvg()))));
        }
        return hashMap;
    }

    public final boolean hasLongEvents() {
        if (this.mLongRequestAccumulator.getCount() > 0) {
            return true;
        }
        Iterator it = this.mBlockedViewAccumulators.entrySet().iterator();
        while (it.hasNext()) {
            if (((Accumulator) ((Map.Entry) it.next()).getValue()).getCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void viewObtainedWithBlock(@NotNull String viewName, long j4) {
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        this.mOverallTimeAccumulator.addAndIncrement(j4);
        a aVar = this.mBlockedViewAccumulators;
        Object obj = aVar.get(viewName);
        if (obj == null) {
            obj = new Accumulator();
            aVar.put(viewName, obj);
        }
        ((Accumulator) obj).addAndIncrement(j4);
    }

    public final void viewObtainedWithoutBlock(long j4) {
        this.mOverallTimeAccumulator.addAndIncrement(j4);
    }

    public final void viewRequested(long j4) {
        this.mOverallTimeAccumulator.add(j4);
        if (j4 >= 1000000) {
            this.mLongRequestAccumulator.addAndIncrement(j4);
        }
    }
}
