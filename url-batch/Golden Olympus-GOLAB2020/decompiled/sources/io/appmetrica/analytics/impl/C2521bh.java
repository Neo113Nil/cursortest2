package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2521bh extends AbstractC2601eh {
    public C2521bh(C2953s5 c2953s5) {
        super(c2953s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        String value = c2773l6.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            C3024uo c3024uo = this.f38930a.f39784t;
            synchronized (c3024uo) {
                c3024uo.c(c3024uo.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            c2773l6.f39389n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        C3024uo c3024uo = this.f38930a.f39784t;
        synchronized (c3024uo) {
            c3024uo.a(c3024uo.a() + 1);
        }
        this.f38930a.y();
        C2620f9 c2620f9 = this.f38930a.f39776l;
        if (c2620f9.f38963c == null) {
            c2620f9.a();
        }
        C2673h9 c2673h9 = c2620f9.f38963c;
        c2673h9.getClass();
        c2673h9.f39132b = new HashSet();
        c2673h9.f39134d = 0;
        C2673h9 c2673h92 = c2620f9.f38963c;
        c2673h92.f39131a = true;
        C2750k9 c2750k9 = c2620f9.f38962b;
        IBinaryDataHelper iBinaryDataHelper = c2750k9.f39332c;
        C2724j9 c2724j9 = c2750k9.f39331b;
        c2750k9.f39330a.getClass();
        P9 a4 = C2699i9.a(c2673h92);
        c2724j9.getClass();
        iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(a4));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C2924r2 c2924r2 = this.f38930a.s().f39004z;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c2924r2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C2924r2 c2924r2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c2924r2 == null) {
            return false;
        }
        for (Pair pair : c2924r2.f39696a) {
            if (AbstractC2713io.a(pair.first, str) && ((obj = pair.second) == null || ((C2899q2) obj).f39646a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
