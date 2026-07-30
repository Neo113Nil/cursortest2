package com.crrepa.band.my.model.band.provider;

import android.content.Context;
import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.s;
import com.orhanobut.logger.f;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class BandQuickResponseProvider {
    public static void delete() {
        g.getInstance().remove(BaseParamNames.QUICK_RESPONSE_COUNT);
        g.getInstance().remove(BaseParamNames.QUICK_RESPONSE_STATE);
        g.getInstance().remove(BaseParamNames.QUICK_RESPONSE_CONTENT_LIST);
    }

    public static List<String> getDefaultResponseMessageList(Context context) {
        return Arrays.asList(context.getResources().getStringArray(R.array.array_default_quick_response));
    }

    public static int getResponseCount() {
        return g.getInstance().getInt(BaseParamNames.QUICK_RESPONSE_COUNT, 0);
    }

    public static List<String> getResponseMessageList(Context context) {
        String string = g.getInstance().getString(BaseParamNames.QUICK_RESPONSE_CONTENT_LIST, null);
        return TextUtils.isEmpty(string) ? getDefaultResponseMessageList(context) : s.json2List(string, String[].class);
    }

    public static boolean getResponseState() {
        return g.getInstance().getBoolean(BaseParamNames.QUICK_RESPONSE_STATE, false);
    }

    public static boolean hasQuickResponse() {
        return g.getInstance().contains(BaseParamNames.QUICK_RESPONSE_STATE);
    }

    public static void saveResponseCount(int i8) {
        g.getInstance().putInt(BaseParamNames.QUICK_RESPONSE_COUNT, i8);
    }

    public static void saveResponseMessageList(List<String> list) {
        f.d("saveResponseMessageList: " + s.bean2Json(list));
        g.getInstance().putString(BaseParamNames.QUICK_RESPONSE_CONTENT_LIST, s.bean2Json(list));
    }

    public static void saveResponseState(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.QUICK_RESPONSE_STATE, z7);
    }
}
