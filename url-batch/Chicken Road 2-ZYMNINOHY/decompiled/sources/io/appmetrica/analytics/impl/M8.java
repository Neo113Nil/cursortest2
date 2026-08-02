package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes.dex */
public final class M8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10634a;

    /* renamed from: b, reason: collision with root package name */
    public final R8 f10635b;

    /* renamed from: c, reason: collision with root package name */
    public O8 f10636c;

    public M8(R8 r8, int i4) {
        this.f10634a = i4;
        this.f10635b = r8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        O8 o8;
        int i4;
        int i5;
        byte[] bArr;
        R8 r8 = this.f10635b;
        r8.getClass();
        try {
            bArr = r8.f10878c.get("event_hashes");
        } catch (Throwable unused) {
            P8 p8 = r8.f10876a;
            r8.f10877b.getClass();
            C0997u9 c0997u9 = new C0997u9();
            p8.getClass();
            o8 = new O8(c0997u9.f12823a, c0997u9.f12824b, c0997u9.f12825c, CollectionUtils.hashSetFromIntArray(c0997u9.f12826d));
        }
        if (bArr != null && bArr.length != 0) {
            P8 p82 = r8.f10876a;
            C0997u9 state = r8.f10877b.toState(bArr);
            p82.getClass();
            o8 = new O8(state.f12823a, state.f12824b, state.f12825c, CollectionUtils.hashSetFromIntArray(state.f12826d));
            this.f10636c = o8;
            i4 = o8.f10747c;
            i5 = this.f10634a;
            if (i4 == i5) {
                o8.f10747c = i5;
                o8.f10748d = 0;
                R8 r82 = this.f10635b;
                IBinaryDataHelper iBinaryDataHelper = r82.f10878c;
                Q8 q8 = r82.f10877b;
                r82.f10876a.getClass();
                iBinaryDataHelper.insert("event_hashes", q8.toByteArray((Q8) P8.a(o8)));
                return;
            }
            return;
        }
        P8 p83 = r8.f10876a;
        r8.f10877b.getClass();
        C0997u9 c0997u92 = new C0997u9();
        p83.getClass();
        o8 = new O8(c0997u92.f12823a, c0997u92.f12824b, c0997u92.f12825c, CollectionUtils.hashSetFromIntArray(c0997u92.f12826d));
        this.f10636c = o8;
        i4 = o8.f10747c;
        i5 = this.f10634a;
        if (i4 == i5) {
        }
    }
}
