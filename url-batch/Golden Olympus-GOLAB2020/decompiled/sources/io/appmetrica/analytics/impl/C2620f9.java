package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2620f9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f38961a;

    /* renamed from: b, reason: collision with root package name */
    public final C2750k9 f38962b;

    /* renamed from: c, reason: collision with root package name */
    public C2673h9 f38963c;

    public C2620f9(C2750k9 c2750k9, int i4) {
        this.f38961a = i4;
        this.f38962b = c2750k9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C2673h9 c2673h9;
        int i4;
        int i5;
        byte[] bArr;
        C2750k9 c2750k9 = this.f38962b;
        c2750k9.getClass();
        try {
            bArr = c2750k9.f39332c.get("event_hashes");
        } catch (Throwable unused) {
            C2699i9 c2699i9 = c2750k9.f39330a;
            c2750k9.f39331b.getClass();
            P9 p9 = new P9();
            c2699i9.getClass();
            c2673h9 = new C2673h9(p9.f38121a, p9.f38122b, p9.f38123c, CollectionUtils.hashSetFromIntArray(p9.f38124d));
        }
        if (bArr != null && bArr.length != 0) {
            C2699i9 c2699i92 = c2750k9.f39330a;
            P9 state = c2750k9.f39331b.toState(bArr);
            c2699i92.getClass();
            c2673h9 = new C2673h9(state.f38121a, state.f38122b, state.f38123c, CollectionUtils.hashSetFromIntArray(state.f38124d));
            this.f38963c = c2673h9;
            i4 = c2673h9.f39133c;
            i5 = this.f38961a;
            if (i4 == i5) {
                c2673h9.f39133c = i5;
                c2673h9.f39134d = 0;
                C2750k9 c2750k92 = this.f38962b;
                IBinaryDataHelper iBinaryDataHelper = c2750k92.f39332c;
                C2724j9 c2724j9 = c2750k92.f39331b;
                c2750k92.f39330a.getClass();
                P9 a4 = C2699i9.a(c2673h9);
                c2724j9.getClass();
                iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(a4));
                return;
            }
            return;
        }
        C2699i9 c2699i93 = c2750k9.f39330a;
        c2750k9.f39331b.getClass();
        P9 p92 = new P9();
        c2699i93.getClass();
        c2673h9 = new C2673h9(p92.f38121a, p92.f38122b, p92.f38123c, CollectionUtils.hashSetFromIntArray(p92.f38124d));
        this.f38963c = c2673h9;
        i4 = c2673h9.f39133c;
        i5 = this.f38961a;
        if (i4 == i5) {
        }
    }
}
