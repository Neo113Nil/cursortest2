package com.onesignal.common.modeling;

import a2.r;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {
    public static /* synthetic */ void add$default(c cVar, i iVar, String str, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: add");
            return;
        }
        if ((i3 & 2) != 0) {
            str = "NORMAL";
        }
        cVar.add(iVar, str);
    }

    public static /* synthetic */ void clear$default(c cVar, String str, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: clear");
            return;
        }
        if ((i3 & 1) != 0) {
            str = "NORMAL";
        }
        cVar.clear(str);
    }

    public static /* synthetic */ i create$default(c cVar, JSONObject jSONObject, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: create");
            return null;
        }
        if ((i3 & 1) != 0) {
            jSONObject = null;
        }
        return cVar.create(jSONObject);
    }

    public static /* synthetic */ void remove$default(c cVar, String str, String str2, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: remove");
            return;
        }
        if ((i3 & 2) != 0) {
            str2 = "NORMAL";
        }
        cVar.remove(str, str2);
    }

    public static /* synthetic */ void replaceAll$default(c cVar, List list, String str, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: replaceAll");
            return;
        }
        if ((i3 & 2) != 0) {
            str = "NORMAL";
        }
        cVar.replaceAll(list, str);
    }

    public static /* synthetic */ void add$default(c cVar, int i3, i iVar, String str, int i10, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: add");
            return;
        }
        if ((i10 & 4) != 0) {
            str = "NORMAL";
        }
        cVar.add(i3, iVar, str);
    }
}
