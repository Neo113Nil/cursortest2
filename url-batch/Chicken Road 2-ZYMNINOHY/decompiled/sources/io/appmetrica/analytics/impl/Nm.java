package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes.dex */
public final class Nm extends Rm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProtobufStateSerializer f10727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProtobufConverter f10728c;

    public Nm(String str, ProtobufStateSerializer protobufStateSerializer, ProtobufConverter protobufConverter) {
        this.f10726a = str;
        this.f10727b = protobufStateSerializer;
        this.f10728c = protobufConverter;
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper a(Context context) {
        return C0817na.f12417I.B().b(context);
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper a3;
        C1112yk B4 = C0817na.f12417I.B();
        synchronized (B4) {
            a3 = B4.a(context);
        }
        return a3;
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        String str = this.f10726a;
        ProtobufStateSerializer protobufStateSerializer = this.f10727b;
        try {
            bArr = AbstractC0645gj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC0645gj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new Mf(str, iBinaryDataHelper, new A8(protobufStateSerializer, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), this.f10728c);
    }
}
