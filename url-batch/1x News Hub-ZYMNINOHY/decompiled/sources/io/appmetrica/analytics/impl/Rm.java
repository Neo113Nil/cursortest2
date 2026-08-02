package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes.dex */
public final class Rm extends Vm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProtobufStateSerializer f6579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProtobufConverter f6580c;

    public Rm(String str, ProtobufStateSerializer protobufStateSerializer, ProtobufConverter protobufConverter) {
        this.f6578a = str;
        this.f6579b = protobufStateSerializer;
        this.f6580c = protobufConverter;
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArr;
        byte[] bArr2;
        String str = this.f6578a;
        ProtobufStateSerializer protobufStateSerializer = this.f6579b;
        try {
            bArr = AbstractC0652lj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArr = new byte[16];
        }
        try {
            bArr2 = AbstractC0652lj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArr2 = new byte[16];
        }
        return new Rf(str, iBinaryDataHelper, new F8(protobufStateSerializer, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArr, bArr2)), this.f6580c);
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper f;
        C0511g7 a3 = C0511g7.a(context);
        synchronized (a3) {
            f = a3.f();
        }
        return f;
    }

    @Override // io.appmetrica.analytics.impl.Vm
    public final IBinaryDataHelper a(Context context) {
        return C0511g7.a(context).g();
    }
}
