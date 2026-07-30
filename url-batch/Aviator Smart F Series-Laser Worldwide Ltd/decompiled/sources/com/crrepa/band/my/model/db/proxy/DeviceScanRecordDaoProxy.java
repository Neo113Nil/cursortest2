package com.crrepa.band.my.model.db.proxy;

import android.text.TextUtils;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.DeviceScanRecord;
import com.crrepa.band.my.model.db.greendao.DeviceScanRecordDao;
import com.moyoung.dafit.module.common.utils.s;
import java.util.List;

/* loaded from: classes2.dex */
public class DeviceScanRecordDaoProxy {
    private DeviceScanRecordDao dao = c.getInstance().getDaoSession().getDeviceScanRecordDao();

    private DeviceScanRecord get(String str, String str2) {
        List<Object> list = this.dao.queryBuilder().where(DeviceScanRecordDao.Properties.Name.eq(str), DeviceScanRecordDao.Properties.Address.eq(str2)).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (DeviceScanRecord) list.get(0);
    }

    public byte[] getScanRecordBytes(String str, String str2) {
        Byte[] bArr;
        DeviceScanRecord deviceScanRecord = get(str, str2);
        if (deviceScanRecord == null || (bArr = (Byte[]) s.json2Array(deviceScanRecord.getScanRecordBytes(), Byte[].class)) == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            bArr2[i8] = bArr[i8].byteValue();
        }
        return bArr2;
    }

    public void insert(String str, String str2, byte[] bArr) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        DeviceScanRecord deviceScanRecord = get(str, str2);
        if (deviceScanRecord == null) {
            deviceScanRecord = new DeviceScanRecord();
            deviceScanRecord.setName(str);
            deviceScanRecord.setAddress(str2);
        }
        deviceScanRecord.setScanRecordBytes(s.bean2Json(bArr));
        this.dao.insertOrReplace(deviceScanRecord);
    }
}
