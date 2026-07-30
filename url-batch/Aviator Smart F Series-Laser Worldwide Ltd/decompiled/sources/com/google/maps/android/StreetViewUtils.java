package com.google.maps.android;

import com.baidu.ar.util.SystemInfoUtil;
import com.google.android.gms.maps.model.LatLng;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.g;
import kotlinx.coroutines.t0;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class StreetViewUtils {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ResponseStreetView deserializeResponse(String str) {
            String optString = new JSONObject(str).optString("status");
            s.checkNotNull(optString);
            return new ResponseStreetView(Status.valueOf(optString));
        }

        public static /* synthetic */ Object fetchStreetViewData$default(Companion companion, LatLng latLng, String str, Source source, c cVar, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                source = Source.DEFAULT;
            }
            return companion.fetchStreetViewData(latLng, str, source, cVar);
        }

        public final Object fetchStreetViewData(LatLng latLng, String str, Source source, c cVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://maps.googleapis.com/maps/api/streetview/metadata");
            sb.append("?location=" + latLng.latitude + SystemInfoUtil.COMMA + latLng.longitude);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("&key=");
            sb2.append(str);
            sb.append(sb2.toString());
            sb.append("&source=" + source.getValue());
            String sb3 = sb.toString();
            s.checkNotNullExpressionValue(sb3, "toString(...)");
            return g.withContext(t0.getIO(), new StreetViewUtils$Companion$fetchStreetViewData$2(sb3, null), cVar);
        }
    }
}
