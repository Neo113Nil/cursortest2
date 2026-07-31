package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class k5 {
    public static final ConnectivityManager b(Context context) {
        Object m8023constructorimpl;
        if (context == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            m8023constructorimpl = Result.m8023constructorimpl((ConnectivityManager) systemService);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            xb.a("Cannot retrieve connectivity manager", m8026exceptionOrNullimpl);
        }
        return (ConnectivityManager) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    public static final NetworkInfo a(Context context) {
        ConnectivityManager b;
        Object m8023constructorimpl;
        if (context == null || (b = b(context)) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(b.getActiveNetworkInfo());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            xb.a("Cannot retrieve active network info", m8026exceptionOrNullimpl);
        }
        return (NetworkInfo) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    public static final boolean d(Context context) {
        NetworkInfo a = a(context);
        NetworkCapabilities a2 = a(context, null, 1, null);
        if (a2 != null) {
            return a2.hasCapability(16);
        }
        return a != null && a.isConnected();
    }

    public static final boolean e(Context context) {
        NetworkInfo a = a(context);
        return a != null && a.isConnected() && a.getType() == 1;
    }

    public static final boolean c(Context context) {
        NetworkInfo a = a(context);
        return a != null && a.isConnected() && a.getType() == 0;
    }

    public static final NetworkCapabilities a(Context context, Network network) {
        ConnectivityManager b;
        Object m8023constructorimpl;
        if (context == null || (b = b(context)) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (network == null) {
                network = b.getActiveNetwork();
            }
            m8023constructorimpl = Result.m8023constructorimpl(b.getNetworkCapabilities(network));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            xb.a("Cannot retrieve network capabilities", m8026exceptionOrNullimpl);
        }
        return (NetworkCapabilities) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    public static final int f(Context context) {
        NetworkInfo a = a(context);
        if (a == null || !a.isConnected()) {
            return 0;
        }
        return a.getSubtype();
    }

    public static final yd g(Context context) {
        yd ydVar;
        NetworkInfo a = a(context);
        if (a != null) {
            if (a.isConnected()) {
                ydVar = a(a.getType(), a.getSubtype());
            } else {
                ydVar = yd.d;
            }
            if (ydVar != null) {
                return ydVar;
            }
        }
        return yd.d;
    }

    public static /* synthetic */ NetworkCapabilities a(Context context, Network network, int i, Object obj) {
        if ((i & 1) != 0) {
            network = null;
        }
        return a(context, network);
    }

    public static final yd a(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                return yd.d;
            }
            return yd.f;
        }
        if (i2 != 20) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return yd.h;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return yd.i;
                case 13:
                    return yd.j;
                default:
                    return yd.g;
            }
        }
        return yd.k;
    }
}
