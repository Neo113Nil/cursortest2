package com.android.a.a;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: InstallReferrerClient.java */
/* loaded from: classes.dex */
public abstract class a {
    public abstract void a();

    public abstract void a(c cVar);

    public abstract d b() throws RemoteException;

    /* compiled from: InstallReferrerClient.java */
    /* renamed from: com.android.a.a.a$a, reason: collision with other inner class name */
    public static final class C0291a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f2247a;

        private C0291a(Context context) {
            this.f2247a = context;
        }

        public a a() {
            if (this.f2247a == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            return new b(this.f2247a);
        }
    }

    public static C0291a a(Context context) {
        return new C0291a(context);
    }
}
