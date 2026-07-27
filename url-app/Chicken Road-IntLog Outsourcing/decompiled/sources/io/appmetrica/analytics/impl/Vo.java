package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class Vo implements InterfaceC0894p6, FunctionWithThrowable, InterfaceC0833mn, Bo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7640a;

    public /* synthetic */ Vo(int i2) {
        this.f7640a = i2;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.f7640a) {
            case 3:
                return yo.a(jSONObject, jSONObject2);
            default:
                return zo.a(jSONObject, jSONObject2);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        List a6;
        a6 = C0986sl.a((SubscriptionManager) obj);
        return a6;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0833mn
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return C1115xk.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0894p6
    public boolean a(Throwable th) {
        return C0864o2.a(th);
    }
}
