package com.realsil.sdk.dfu.j;

import com.realsil.sdk.core.logger.ZLogger;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f15976d = false;

    /* renamed from: a, reason: collision with root package name */
    public volatile long f15977a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f15978b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15979c;

    public b(boolean z7, long j8) {
        this.f15979c = z7;
        this.f15978b = j8;
    }

    public void a() {
        if (this.f15979c) {
            if (this.f15977a == -1 || this.f15978b == -1) {
                if (f15976d) {
                    ZLogger.d("flow control block with error, must initial first");
                }
            } else {
                while (System.nanoTime() - this.f15977a < this.f15978b) {
                }
                if (f15976d) {
                    ZLogger.v("flow control stopped");
                }
            }
        }
    }

    public void b() {
        if (this.f15979c) {
            this.f15977a = System.nanoTime();
            if (f15976d) {
                ZLogger.v("flow control started");
            }
        }
    }
}
