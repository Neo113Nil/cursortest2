package io.appmetrica.analytics.impl;

import W.InterfaceC0113f;
import android.app.ActivityManager;
import android.database.sqlite.SQLiteDatabase;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import q0.InterfaceC1383z;
import r0.C1398i;
import z0.C1580a;

/* loaded from: classes.dex */
public final /* synthetic */ class Zo implements FunctionWithThrowable, InterfaceC0726jn, InterfaceC1142zo, u2.d, InterfaceC0113f, y0.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11403a;

    public /* synthetic */ Zo(int i4) {
        this.f11403a = i4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1142zo
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.f11403a) {
            case 3:
                return C1064wo.a(jSONObject, jSONObject2);
            default:
                return C1090xo.a(jSONObject, jSONObject2);
        }
    }

    @Override // W.InterfaceC0113f
    public void accept(Object obj) {
        switch (this.f11403a) {
            case 9:
                ((q0.Y) obj).f14944b.getClass();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        List a3;
        Boolean a4;
        switch (this.f11403a) {
            case 0:
                a3 = C0854ol.a((SubscriptionManager) obj);
                return a3;
            case 1:
            case 3:
            case 4:
            case 5:
            case 9:
            default:
                return Long.valueOf(((V0.a) obj).f3184c);
            case 2:
                a4 = C0990u2.a((ActivityManager) obj);
                return a4;
            case 6:
                return v2.I.o(Integer.valueOf(((C1398i) obj).f15152a));
            case 7:
                y0.n nVar = (y0.n) obj;
                nVar.getClass();
                return nVar.getClass().getSimpleName();
            case 8:
                return v2.I.k(v2.r.u(((InterfaceC1383z) obj).t().f15035b, new Zo(10)));
            case 10:
                return Integer.valueOf(((T.U) obj).f2707c);
            case 11:
                return Long.valueOf(((V0.a) obj).f3183b);
        }
    }

    @Override // y0.q
    public y0.n[] b() {
        return new y0.n[]{new C1580a()};
    }

    public Constructor d() {
        switch (this.f11403a) {
            case 14:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(y0.n.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(y0.n.class).getConstructor(null);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0726jn
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return C0956sk.a(sQLiteDatabase);
    }
}
