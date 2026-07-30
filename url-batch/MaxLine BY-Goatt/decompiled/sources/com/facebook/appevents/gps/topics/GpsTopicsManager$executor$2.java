package com.facebook.appevents.gps.topics;

import defpackage.o81;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GpsTopicsManager$executor$2 extends o81 implements Function0<ExecutorService> {
    public static final GpsTopicsManager$executor$2 INSTANCE = new GpsTopicsManager$executor$2();

    public GpsTopicsManager$executor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        return Executors.newCachedThreadPool();
    }
}
