package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class JF {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f25753a = Logger.getLogger(JF.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f25754b = new AtomicBoolean(false);

    public static boolean a() {
        return f25754b.get();
    }
}
