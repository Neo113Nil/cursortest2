package com.mopub.mobileads;

import android.text.TextUtils;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class VastMacroHelper {
    private final Map<VastMacro, String> mMacroDataMap;
    private final List<String> mOriginalUris;

    public VastMacroHelper(List<String> list) {
        Preconditions.checkNotNull(list, "uris cannot be null");
        this.mOriginalUris = list;
        this.mMacroDataMap = new HashMap();
        this.mMacroDataMap.put(VastMacro.CACHEBUSTING, getCachebustingString());
    }

    public List<String> getUris() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.mOriginalUris) {
            if (!TextUtils.isEmpty(str)) {
                for (VastMacro vastMacro : VastMacro.values()) {
                    String str2 = this.mMacroDataMap.get(vastMacro);
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = str.replaceAll("\\[" + vastMacro.name() + "\\]", str2);
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public VastMacroHelper withErrorCode(VastErrorCode vastErrorCode) {
        if (vastErrorCode != null) {
            this.mMacroDataMap.put(VastMacro.ERRORCODE, vastErrorCode.getErrorCode());
        }
        return this;
    }

    public VastMacroHelper withContentPlayHead(Integer num) {
        if (num != null) {
            String formatContentPlayHead = formatContentPlayHead(num.intValue());
            if (!TextUtils.isEmpty(formatContentPlayHead)) {
                this.mMacroDataMap.put(VastMacro.CONTENTPLAYHEAD, formatContentPlayHead);
            }
        }
        return this;
    }

    public VastMacroHelper withAssetUri(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                MoPubLog.w("Failed to encode url", e);
            }
            this.mMacroDataMap.put(VastMacro.ASSETURI, str);
        }
        return this;
    }

    private String getCachebustingString() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    private String formatContentPlayHead(int i) {
        long j = i;
        return String.format("%02d:%02d:%02d.%03d", Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Integer.valueOf(i % 1000));
    }
}
