package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class H9 extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final I9 f10363b;

    public H9(X4 x4, TimeProvider timeProvider) {
        super(x4);
        this.f10363b = new I9(x4, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        long optLong;
        I9 i9 = this.f10363b;
        B9 b9 = i9.f10433a.t().f11859B;
        Long valueOf = b9 != null ? Long.valueOf(b9.f10094a) : null;
        if (valueOf != null) {
            C1090xo c1090xo = i9.f10433a.f11239t;
            synchronized (c1090xo) {
                optLong = c1090xo.f13040a.a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = i9.f10434b.currentTimeMillis();
                i9.f10433a.f11239t.a(optLong);
            }
            if (i9.f10434b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                A9 a9 = (A9) MessageNano.mergeFrom(new A9(), p5.getValueBytes());
                int i4 = a9.f10032a;
                String str = new String(a9.f10033b, AbstractC1504a.f15936a);
                String str2 = this.f10363b.f10433a.f11224c.k().get(Integer.valueOf(i4));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f10886a.f11234m.info("Ignoring attribution of type `" + K9.a(i4) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                I9 i92 = this.f10363b;
                Map<Integer, String> k4 = i92.f10433a.f11224c.k();
                k4.put(Integer.valueOf(i4), str);
                i92.f10433a.f11224c.b(k4);
                this.f10886a.f11234m.info("Handling attribution of type `" + K9.a(i4) + '`', new Object[0]);
                return false;
            }
        }
        this.f10886a.f11234m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
