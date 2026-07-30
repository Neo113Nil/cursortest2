package com.realsil.sdk.dfu.model;

import com.realsil.sdk.core.utility.ByteArrayConverter;
import com.realsil.sdk.core.utility.DataConverter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import y5.u;

/* loaded from: classes4.dex */
public final class OtaBudInfo {

    /* renamed from: a, reason: collision with root package name */
    public Map f16227a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f16228b;

    public final String a() {
        Map map = this.f16227a;
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : this.f16227a.keySet()) {
            sb.append(String.format("--image:0x%04X, version:%s", num, DataConverter.bytes2Hex((byte[]) this.f16227a.get(num))));
        }
        return sb.toString();
    }

    public byte[] getOtaHeaderImageVersion() {
        return this.f16228b;
    }

    public byte[] getOtherFwImageVersion(int i8) {
        Map map = this.f16227a;
        return (map == null || map.isEmpty()) ? new byte[4] : !this.f16227a.containsKey(Integer.valueOf(i8)) ? new byte[4] : (byte[]) this.f16227a.get(Integer.valueOf(i8));
    }

    public Map<Integer, byte[]> getOtherFwVersionMap() {
        return this.f16227a;
    }

    public void saveOtherFwVersion(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        int i8 = bArr[1] & 255;
        Map map = this.f16227a;
        if (map == null) {
            this.f16227a = new HashMap();
        } else {
            map.clear();
        }
        if (i8 > 0) {
            int i9 = 2;
            if (bArr.length >= (i8 * 6) + 2) {
                for (int i10 = 0; i10 < i8; i10++) {
                    int i11 = ByteArrayConverter.toShort(bArr, i9, 0) & u.MAX_VALUE;
                    int i12 = i9 + 2;
                    i9 += 6;
                    this.f16227a.put(Integer.valueOf(i11), Arrays.copyOfRange(bArr, i12, i9));
                }
            }
        }
    }

    public void setOtaHeaderImageVersion(byte[] bArr) {
        this.f16228b = bArr;
    }

    public String toString() {
        return a();
    }
}
