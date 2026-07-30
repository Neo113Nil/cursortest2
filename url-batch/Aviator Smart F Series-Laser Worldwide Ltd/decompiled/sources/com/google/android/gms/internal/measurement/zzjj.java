package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjk;

/* loaded from: classes3.dex */
public abstract class zzjj<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzjj<MessageType, BuilderType>> implements zzmh {
    @Override // 
    /* renamed from: zzav, reason: merged with bridge method [inline-methods] */
    public abstract zzjj clone();

    public zzjj zzaw(byte[] bArr, int i8, int i9) {
        throw null;
    }

    public zzjj zzax(byte[] bArr, int i8, int i9, zzkn zzknVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    public final /* synthetic */ zzmh zzay(byte[] bArr) {
        return zzaw(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    public final /* synthetic */ zzmh zzaz(byte[] bArr, zzkn zzknVar) {
        return zzax(bArr, 0, bArr.length, zzknVar);
    }
}
