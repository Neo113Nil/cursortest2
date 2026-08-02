package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import d2.C0389g;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class ng {

    /* renamed from: a, reason: collision with root package name */
    public static String f7341a;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f7342b = new AtomicBoolean(true);

    public static void a(X1.a aVar) {
        f7341a = aVar.f3607a;
    }

    public static String a(Context context) {
        if (f7342b.getAndSet(false)) {
            try {
                t2.j F4 = new C0389g(context).F();
                F4.f15419b.b(new t2.f(t2.e.f15408a, new b0.c(15)));
                F4.g();
            } catch (GooglePlayServicesMissingManifestValueException | NoClassDefFoundError unused) {
            }
        }
        return f7341a;
    }
}
