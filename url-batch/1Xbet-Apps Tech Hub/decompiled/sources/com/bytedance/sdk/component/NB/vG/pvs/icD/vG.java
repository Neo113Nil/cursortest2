package com.bytedance.sdk.component.NB.vG.pvs.icD;

import com.bytedance.sdk.component.NB.zM;

/* compiled from: LruCountRawCache.java */
/* loaded from: classes.dex */
public class vG implements zM {
    private int icD;
    private int pvs;
    private com.bytedance.sdk.component.NB.vG.pvs.vG<String, byte[]> vG;

    public vG(int i, int i2) {
        this.icD = i;
        this.pvs = i2;
        this.vG = new com.bytedance.sdk.component.NB.vG.pvs.vG<String, byte[]>(i) { // from class: com.bytedance.sdk.component.NB.vG.pvs.icD.vG.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.NB.vG.pvs.vG
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public int icD(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    public boolean pvs(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.vG.pvs(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    public byte[] pvs(String str) {
        return this.vG.pvs((com.bytedance.sdk.component.NB.vG.pvs.vG<String, byte[]>) str);
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    public boolean icD(String str) {
        return this.vG.pvs((com.bytedance.sdk.component.NB.vG.pvs.vG<String, byte[]>) str) != null;
    }
}
