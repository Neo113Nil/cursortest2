package B2;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2687Ne;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f303a;

    /* renamed from: b, reason: collision with root package name */
    public String f304b;

    /* renamed from: c, reason: collision with root package name */
    public final C2687Ne f305c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f306d = new Bundle();

    /* renamed from: e, reason: collision with root package name */
    public final long f307e;

    /* renamed from: f, reason: collision with root package name */
    public final long f308f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public u(JsonReader jsonReader, C2687Ne c2687Ne) {
        Bundle bundle;
        char c4;
        this.f307e = -1L;
        this.f308f = -1L;
        this.f305c = c2687Ne;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals(com.anythink.core.common.d.g.f12486a)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -995427962:
                    if (nextName.equals("params")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1725551537:
                    if (nextName.equals(com.anythink.core.common.d.g.f12487b)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            if (c4 == 0) {
                str = jsonReader.nextString();
            } else if (c4 == 1) {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (c4 == 2) {
                this.f307e = jsonReader.nextLong();
            } else if (c4 != 3) {
                jsonReader.skipValue();
            } else {
                this.f308f = jsonReader.nextLong();
            }
        }
        this.f303a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f306d.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31467J2)).booleanValue() || c2687Ne == null || (bundle = c2687Ne.f26578F) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.f307e);
        bundle.putLong("get-signals-sdkcore-end", this.f308f);
    }
}
