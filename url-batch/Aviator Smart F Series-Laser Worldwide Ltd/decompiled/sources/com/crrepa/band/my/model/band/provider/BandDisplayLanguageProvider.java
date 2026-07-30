package com.crrepa.band.my.model.band.provider;

import android.text.TextUtils;
import com.crrepa.band.my.ble.band.utils.a;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.db.Language;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.u;
import com.orhanobut.logger.f;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BandDisplayLanguageProvider {
    private static final String HEBREW_IW = "iw";
    private static final String INDONESIA_IN = "in";
    private static final String NET_HEBREW_HE = "he";
    private static final String NET_INDONESIA_ID = "id";

    private BandDisplayLanguageProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.BAND_DISPLAY_LANGUAGE);
    }

    public static byte getDisplayLanguage() {
        int i8 = g.getInstance().getInt(BaseParamNames.BAND_DISPLAY_LANGUAGE, -1);
        if (i8 == -1) {
            i8 = getLocalDisplayLanguage();
        }
        return (byte) i8;
    }

    private static byte getLocalDisplayLanguage() {
        BaseBandModel connectBand;
        List<Language> supportLanguageList;
        byte b8;
        byte localLanguage;
        String localeLanguage = u.getLocaleLanguage();
        f.d("language: " + localeLanguage);
        if (TextUtils.isEmpty(localeLanguage) || (connectBand = a.getInstance().getConnectBand()) == null || (supportLanguageList = connectBand.getSupportLanguageList()) == null) {
            return (byte) -1;
        }
        if (TextUtils.equals(localeLanguage, "zh") && (localLanguage = getLocalLanguage(supportLanguageList)) > 0) {
            return localLanguage;
        }
        String replace = localeLanguage.replace("in", "id").replace(HEBREW_IW, NET_HEBREW_HE);
        Iterator<Language> it = supportLanguageList.iterator();
        while (true) {
            if (!it.hasNext()) {
                b8 = -1;
                break;
            }
            Language next = it.next();
            if (TextUtils.equals(next.getCode(), replace)) {
                b8 = next.getCmd().byteValue();
                break;
            }
        }
        return b8 == -1 ? supportLanguageList.get(0).getCmd().byteValue() : b8;
    }

    private static byte getLocalLanguage(List<Language> list) {
        BaseBandModel connectBand = a.getInstance().getConnectBand();
        byte b8 = (connectBand != null && connectBand.hasTraditional() && u.isTraditional()) ? (byte) 9 : (byte) 1;
        Iterator<Language> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getCmd().byteValue() == b8) {
                return b8;
            }
        }
        return (byte) -1;
    }

    public static void saveDisplayLanguage(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_DISPLAY_LANGUAGE, i8);
    }
}
