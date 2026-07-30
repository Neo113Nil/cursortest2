package com.crrepa.band.my.model.band.provider;

import android.text.TextUtils;
import com.crrepa.band.my.model.ExtendMenuModel;
import com.crrepa.band.my.model.db.BandConfig;
import com.crrepa.band.my.model.db.proxy.BandConfigDaoProxy;
import com.moyoung.dafit.module.common.imageload.a;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.w0;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.v;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public class BandExtendProvider {
    private BandExtendProvider() {
    }

    public static v getExtendIcon(String str) {
        File iconFile = getIconFile(str);
        if (iconFile != null && iconFile.exists()) {
            return Picasso.get().load(iconFile);
        }
        new a().donwloadFile(str, iconFile.getPath());
        return Picasso.get().load(str);
    }

    public static List<ExtendMenuModel> getExtendList() {
        BandConfig byFirmwareType;
        String firmwareType = BandLastBindBandProvider.getFirmwareType();
        if (TextUtils.isEmpty(firmwareType) || (byFirmwareType = new BandConfigDaoProxy().getByFirmwareType(firmwareType)) == null) {
            return null;
        }
        return s.json2List(byFirmwareType.getExtendMenu(), ExtendMenuModel[].class);
    }

    private static File getIconFile(String str) {
        String fileName = w0.getFileName(str);
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        return new File(com.crrepa.band.my.a.getExtendPath(), fileName);
    }
}
