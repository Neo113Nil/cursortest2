package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class w7 implements Callable<a8> {

    /* renamed from: a, reason: collision with root package name */
    private final int f20158a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20159b;

    /* renamed from: c, reason: collision with root package name */
    private final AdData f20160c;

    /* renamed from: d, reason: collision with root package name */
    private final y7 f20161d;

    /* renamed from: e, reason: collision with root package name */
    private final x7 f20162e;

    /* renamed from: f, reason: collision with root package name */
    private final NetworkSettings f20163f;

    class a implements BiddingDataCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ib f20164a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BlockingQueue f20165b;

        a(ib ibVar, BlockingQueue blockingQueue) {
            this.f20164a = ibVar;
            this.f20165b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(@NotNull String str) {
            this.f20165b.add(new a8(w7.this.d(), w7.this.c(), null, ib.a(this.f20164a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(@NotNull Map<String, Object> map) {
            this.f20165b.add(new a8(w7.this.d(), w7.this.c(), map, ib.a(this.f20164a), null));
        }
    }

    public w7(int i4, String str, AdData adData, y7 y7Var, x7 x7Var, NetworkSettings networkSettings) {
        this.f20158a = i4;
        this.f20159b = str;
        this.f20160c = adData;
        this.f20161d = y7Var;
        this.f20162e = x7Var;
        this.f20163f = networkSettings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        r2.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r2 == null) goto L15;
     */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a8 call() {
        String str;
        x7 x7Var;
        ib ibVar = new ib();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.f20160c, new a(ibVar, arrayBlockingQueue));
        } catch (Exception e4) {
            o9.d().a(e4);
            str = "Exception while calling collectBiddingData - " + e4.getMessage();
            IronLog.INTERNAL.error(str);
            x7Var = this.f20162e;
        } catch (NoClassDefFoundError e5) {
            o9.d().a(e5);
            str = "Error while calling collectBiddingData - " + e5.getMessage();
            IronLog.INTERNAL.error(str);
            x7Var = this.f20162e;
        }
        x7 x7Var2 = this.f20162e;
        if (x7Var2 != null) {
            x7Var2.a(this.f20163f);
        }
        return (a8) arrayBlockingQueue.take();
    }

    public y7 b() {
        return this.f20161d;
    }

    public String c() {
        return this.f20159b;
    }

    public int d() {
        return this.f20158a;
    }
}
