package com.tapjoy.internal;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class gi extends gh {

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f8195b;

    public gi(File file, gz gzVar) {
        super(file, gzVar);
        this.f8195b = new ThreadPoolExecutor(0, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    @Override // com.tapjoy.internal.gh
    protected final void finalize() {
        try {
            this.f8195b.shutdown();
            this.f8195b.awaitTermination(1L, TimeUnit.SECONDS);
        } finally {
            super.finalize();
        }
    }

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private int f8197b;

        /* renamed from: c, reason: collision with root package name */
        private long f8198c;

        /* renamed from: d, reason: collision with root package name */
        private String f8199d;
        private String e;
        private Map f;

        a(int i, long j, String str, String str2, Map map) {
            this.f8197b = i;
            this.f8198c = j;
            this.f8199d = str;
            this.e = str2;
            this.f = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                switch (this.f8197b) {
                    case 1:
                        gi.super.a(this.f8198c);
                        break;
                    case 2:
                        gi.super.a();
                        break;
                    case 3:
                        gi.super.a(this.f8198c, this.f8199d, this.e, this.f);
                        break;
                }
            } catch (Throwable unused) {
                gi.super.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.gh, com.tapjoy.internal.gg
    public final void a(long j) {
        try {
            this.f8195b.execute(new a(1, j, null, null, null));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.gh, com.tapjoy.internal.gg
    public final void a() {
        try {
            this.f8195b.execute(new a(2, 0L, null, null, null));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.gh, com.tapjoy.internal.gg
    public final void a(long j, String str, String str2, Map map) {
        try {
            this.f8195b.execute(new a(3, j, str, str2, map != null ? new HashMap(map) : null));
        } catch (Throwable unused) {
        }
    }
}
