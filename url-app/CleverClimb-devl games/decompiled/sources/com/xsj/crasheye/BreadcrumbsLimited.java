package com.xsj.crasheye;

import com.xsj.crasheye.log.Logger;
import com.xsj.crasheye.util.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes2.dex */
class BreadcrumbsLimited extends ArrayList<String> {
    protected static final int MAX_BREADCRUMBS = 16;
    private static final long serialVersionUID = -7130367487360671781L;

    BreadcrumbsLimited() {
    }

    public boolean addToList(String str) {
        if (str == null) {
            str = "null";
        }
        Logger.logInfo("Breadcrumb: " + str + " was added to the breadcrumb list");
        add(String.valueOf(str) + ":" + Utils.getTime());
        if (size() <= 16) {
            return true;
        }
        Logger.logInfo("Breadcrumbs list is bigger than " + String.valueOf(16) + " items, removing the oldest one.");
        remove(0);
        return true;
    }

    public JSONArray getList() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }
}
