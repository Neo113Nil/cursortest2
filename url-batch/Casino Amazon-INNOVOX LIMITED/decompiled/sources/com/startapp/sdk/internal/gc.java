package com.startapp.sdk.internal;

import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class gc {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r1.containsKey("forceOrientation") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
    
        if (r1.containsKey("allowOffscreen") != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap a(String str) {
        String substring = str.substring(8);
        HashMap hashMap = new HashMap();
        int indexOf = substring.indexOf(63);
        boolean z = true;
        if (indexOf != -1) {
            String substring2 = substring.substring(0, indexOf);
            for (String str2 : substring.substring(indexOf + 1).split("&")) {
                int indexOf2 = str2.indexOf(61);
                hashMap.put(str2.substring(0, indexOf2), str2.substring(indexOf2 + 1));
            }
            substring = substring2;
        }
        if (!Arrays.asList("close", "createCalendarEvent", "expand", "open", "playVideo", WebViewManager.EVENT_TYPE_RESIZE, "setOrientationProperties", "setResizeProperties", "storePicture", "useCustomClose").contains(substring)) {
            return null;
        }
        if (substring.equals("createCalendarEvent")) {
            z = hashMap.containsKey("eventJSON");
        } else if (substring.equals("open") || substring.equals("playVideo") || substring.equals("storePicture")) {
            z = hashMap.containsKey(ImagesContract.URL);
        } else if (substring.equals("setOrientationProperties")) {
            if (hashMap.containsKey("allowOrientationChange")) {
            }
            z = false;
        } else if (substring.equals("setResizeProperties")) {
            if (hashMap.containsKey(ViewProps.WIDTH)) {
                if (hashMap.containsKey(ViewProps.HEIGHT)) {
                    if (hashMap.containsKey("offsetX")) {
                        if (hashMap.containsKey("offsetY")) {
                            if (hashMap.containsKey("customClosePosition")) {
                            }
                        }
                    }
                }
            }
            z = false;
        } else if (substring.equals("useCustomClose")) {
            z = hashMap.containsKey("useCustomClose");
        }
        if (!z) {
            return null;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("command", substring);
        hashMap2.putAll(hashMap);
        return hashMap2;
    }
}
