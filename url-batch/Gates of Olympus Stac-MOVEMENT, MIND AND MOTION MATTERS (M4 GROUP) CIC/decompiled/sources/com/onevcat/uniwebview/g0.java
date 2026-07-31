package com.onevcat.uniwebview;

import android.webkit.PermissionRequest;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g0 extends i0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(String webViewName, PermissionRequest request) {
        super(webViewName, "RequestMediaCapturePermission", r11, 0);
        String str;
        Intrinsics.checkNotNullParameter(webViewName, "webViewName");
        Intrinsics.checkNotNullParameter(request, "request");
        String[] resources = request.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "request.resources");
        ArrayList arrayList = new ArrayList(resources.length);
        int length = resources.length;
        int i = 0;
        while (true) {
            str = BuildConfig.FLAVOR;
            if (i >= length) {
                break;
            }
            String str2 = resources[i];
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != -1660821873) {
                    if (hashCode != 968612586) {
                        if (hashCode != 1069496794) {
                            if (hashCode == 1233677653 && str2.equals("android.webkit.resource.MIDI_SYSEX")) {
                                str = "MIDI_SYSEX";
                            }
                        } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                            str = "PROTECTED_MEDIA_ID";
                        }
                    } else if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        str = "AUDIO";
                    }
                } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    str = "VIDEO";
                }
            }
            arrayList.add(str);
            i++;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        Pair[] pairArr = new Pair[4];
        String scheme = request.getOrigin().getScheme();
        pairArr[0] = TuplesKt.to("protocol", scheme == null ? BuildConfig.FLAVOR : scheme);
        String host = request.getOrigin().getHost();
        pairArr[1] = TuplesKt.to("host", host != null ? host : str);
        pairArr[2] = TuplesKt.to("port", Integer.valueOf(request.getOrigin().getPort()));
        pairArr[3] = TuplesKt.to("resources", arrayList2);
        String jSONObject = new JSONObject(MapsKt.mapOf(pairArr)).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "obj.toString()");
    }
}
