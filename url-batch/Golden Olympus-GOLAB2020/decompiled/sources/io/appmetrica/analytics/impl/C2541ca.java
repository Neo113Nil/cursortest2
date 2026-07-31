package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2541ca extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final C2568da f38773b;

    public C2541ca(@NotNull C2953s5 c2953s5, @NotNull TimeProvider timeProvider) {
        super(c2953s5);
        this.f38773b = new C2568da(c2953s5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NotNull C2773l6 c2773l6) {
        long optLong;
        C2568da c2568da = this.f38773b;
        W9 w9 = c2568da.f38849a.s().f38978C;
        Long valueOf = w9 != null ? Long.valueOf(w9.f38461a) : null;
        if (valueOf != null) {
            C3024uo c3024uo = c2568da.f38849a.f39784t;
            synchronized (c3024uo) {
                optLong = c3024uo.f39951a.a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = c2568da.f38850b.currentTimeMillis();
                c2568da.f38849a.f39784t.a(optLong);
            }
            if (c2568da.f38850b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                V9 v9 = (V9) MessageNano.mergeFrom(new V9(), c2773l6.getValueBytes());
                int i4 = v9.f38414a;
                String str = new String(v9.f38415b, Charsets.UTF_8);
                String str2 = this.f38773b.f38849a.f39767c.j().get(Integer.valueOf(i4));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f38930a.f39777m.info("Ignoring attribution of type `" + AbstractC2621fa.a(i4) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                C2568da c2568da2 = this.f38773b;
                Map<Integer, String> j4 = c2568da2.f38849a.f39767c.j();
                j4.put(Integer.valueOf(i4), str);
                c2568da2.f38849a.f39767c.a(j4);
                this.f38930a.f39777m.info("Handling attribution of type `" + AbstractC2621fa.a(i4) + '`', new Object[0]);
                return false;
            }
        }
        this.f38930a.f39777m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
