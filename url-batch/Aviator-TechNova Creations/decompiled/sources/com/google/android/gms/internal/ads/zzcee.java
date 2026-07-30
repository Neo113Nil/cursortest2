package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcee extends ScheduledThreadPoolExecutor {
    zzcee(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
