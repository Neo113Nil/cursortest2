package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0331l {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* renamed from: c, reason: collision with root package name */
    public static final C f5965c;

    /* renamed from: a, reason: collision with root package name */
    public final int f5967a;

    static {
        L3.h hVar = new L3.h();
        hVar.f1682d = new Object[8];
        hVar.f1680b = 0;
        for (EnumC0331l enumC0331l : values()) {
            Integer valueOf = Integer.valueOf(enumC0331l.f5967a);
            int i4 = hVar.f1680b + 1;
            Object[] objArr = (Object[]) hVar.f1682d;
            int length = objArr.length;
            int i5 = i4 + i4;
            if (i5 > length) {
                if (i5 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i5) {
                        int highestOneBit = Integer.highestOneBit(i5 - 1);
                        length = highestOneBit + highestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                hVar.f1682d = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) hVar.f1682d;
            int i6 = hVar.f1680b;
            int i7 = i6 + i6;
            objArr2[i7] = valueOf;
            objArr2[i7 + 1] = enumC0331l;
            hVar.f1680b = i6 + 1;
        }
        C0348u c0348u = (C0348u) hVar.f1681c;
        if (c0348u != null) {
            throw c0348u.a();
        }
        C a3 = C.a(hVar.f1680b, (Object[]) hVar.f1682d, hVar);
        C0348u c0348u2 = (C0348u) hVar.f1681c;
        if (c0348u2 != null) {
            throw c0348u2.a();
        }
        f5965c = a3;
    }

    EnumC0331l(int i4) {
        this.f5967a = i4;
    }
}
