package com.startapp.sdk.internal;

import Y1.M;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class ng {

    /* renamed from: a, reason: collision with root package name */
    public static String f4208a;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f4209b = new AtomicBoolean(true);

    public static void a(H0.a aVar) {
        f4208a = aVar.f597a;
    }

    public static String a(Context context) {
        if (f4209b.getAndSet(false)) {
            try {
                d1.k A3 = new V0.e(context, 28).A();
                A3.f4943b.d(new d1.g(d1.f.f4932a, new M(14)));
                A3.g();
            } catch (GooglePlayServicesMissingManifestValueException | NoClassDefFoundError unused) {
            }
        }
        return f4208a;
    }
}
