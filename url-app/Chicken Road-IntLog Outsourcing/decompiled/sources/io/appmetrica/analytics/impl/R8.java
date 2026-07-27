package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes.dex */
public final class R8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7365a;

    /* renamed from: b, reason: collision with root package name */
    public final W8 f7366b;

    /* renamed from: c, reason: collision with root package name */
    public T8 f7367c;

    public R8(W8 w8, int i2) {
        this.f7365a = i2;
        this.f7366b = w8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        T8 t8;
        int i2;
        int i3;
        byte[] bArr;
        W8 w8 = this.f7366b;
        w8.getClass();
        try {
            bArr = w8.f7666c.get("event_hashes");
        } catch (Throwable unused) {
            U8 u8 = w8.f7664a;
            w8.f7665b.getClass();
            B9 b9 = new B9();
            u8.getClass();
            t8 = new T8(b9.f6592a, b9.f6593b, b9.f6594c, CollectionUtils.hashSetFromIntArray(b9.f6595d));
        }
        if (bArr != null && bArr.length != 0) {
            U8 u82 = w8.f7664a;
            B9 state = w8.f7665b.toState(bArr);
            u82.getClass();
            t8 = new T8(state.f6592a, state.f6593b, state.f6594c, CollectionUtils.hashSetFromIntArray(state.f6595d));
            this.f7367c = t8;
            i2 = t8.f7521c;
            i3 = this.f7365a;
            if (i2 == i3) {
                t8.f7521c = i3;
                t8.f7522d = 0;
                W8 w82 = this.f7366b;
                IBinaryDataHelper iBinaryDataHelper = w82.f7666c;
                V8 v8 = w82.f7665b;
                w82.f7664a.getClass();
                iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t8)));
                return;
            }
            return;
        }
        U8 u83 = w8.f7664a;
        w8.f7665b.getClass();
        B9 b92 = new B9();
        u83.getClass();
        t8 = new T8(b92.f6592a, b92.f6593b, b92.f6594c, CollectionUtils.hashSetFromIntArray(b92.f6595d));
        this.f7367c = t8;
        i2 = t8.f7521c;
        i3 = this.f7365a;
        if (i2 == i3) {
        }
    }
}
