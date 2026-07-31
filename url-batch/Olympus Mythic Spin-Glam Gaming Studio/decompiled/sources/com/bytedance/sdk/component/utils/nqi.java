package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* loaded from: classes15.dex */
public class nqi {
    private static fs zmn;

    public interface fs {
        void zmn(String str, boolean z, zmn zmnVar);
    }

    public static void zmn(fs fsVar) {
        zmn = fsVar;
    }

    public static void zmn(String str, zmn zmnVar) {
        fs fsVar = zmn;
        if (fsVar == null) {
            return;
        }
        fsVar.zmn(str, false, zmnVar);
    }

    public static abstract class zmn {
        abstract JSONObject zmn();

        public final String fs() {
            try {
                return zmn().toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }
}
