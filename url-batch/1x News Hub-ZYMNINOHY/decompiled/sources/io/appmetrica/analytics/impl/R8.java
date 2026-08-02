package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes.dex */
public final class R8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6546a;

    /* renamed from: b, reason: collision with root package name */
    public final W8 f6547b;

    /* renamed from: c, reason: collision with root package name */
    public T8 f6548c;

    public R8(W8 w8, int i3) {
        this.f6546a = i3;
        this.f6547b = w8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        T8 t8;
        int i3;
        int i4;
        byte[] bArr;
        W8 w8 = this.f6547b;
        w8.getClass();
        try {
            bArr = w8.f6831c.get("event_hashes");
        } catch (Throwable unused) {
            U8 u8 = w8.f6829a;
            w8.f6830b.getClass();
            B9 b9 = new B9();
            u8.getClass();
            t8 = new T8(b9.f5812a, b9.f5813b, b9.f5814c, CollectionUtils.hashSetFromIntArray(b9.f5815d));
        }
        if (bArr != null && bArr.length != 0) {
            U8 u82 = w8.f6829a;
            B9 state = w8.f6830b.toState(bArr);
            u82.getClass();
            t8 = new T8(state.f5812a, state.f5813b, state.f5814c, CollectionUtils.hashSetFromIntArray(state.f5815d));
            this.f6548c = t8;
            i3 = t8.f6693c;
            i4 = this.f6546a;
            if (i3 == i4) {
                t8.f6693c = i4;
                t8.f6694d = 0;
                W8 w82 = this.f6547b;
                IBinaryDataHelper iBinaryDataHelper = w82.f6831c;
                V8 v8 = w82.f6830b;
                w82.f6829a.getClass();
                iBinaryDataHelper.insert("event_hashes", v8.toByteArray((V8) U8.a(t8)));
                return;
            }
            return;
        }
        U8 u83 = w8.f6829a;
        w8.f6830b.getClass();
        B9 b92 = new B9();
        u83.getClass();
        t8 = new T8(b92.f5812a, b92.f5813b, b92.f5814c, CollectionUtils.hashSetFromIntArray(b92.f5815d));
        this.f6548c = t8;
        i3 = t8.f6693c;
        i4 = this.f6546a;
        if (i3 == i4) {
        }
    }
}
