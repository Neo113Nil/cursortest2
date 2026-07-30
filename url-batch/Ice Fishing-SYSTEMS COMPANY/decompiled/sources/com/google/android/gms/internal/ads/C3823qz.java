package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.qz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3823qz extends AbstractC3984tz {

    /* renamed from: g, reason: collision with root package name */
    public static volatile Long f33915g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f33916h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3823qz(String str, String str2, C3830r6 c3830r6, C3391iz c3391iz, C4104wA c4104wA, int i) {
        super(str, str2, c3830r6, c3391iz, c4104wA);
        this.f33917f = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3984tz
    public final void a(Method method, C3830r6 c3830r6) {
        switch (this.f33917f) {
            case 0:
                if (f33915g == null) {
                    synchronized (f33916h) {
                        try {
                            if (f33915g == null) {
                                Long l9 = (Long) method.invoke("", new Object[0]);
                                if (l9 == null) {
                                    throw null;
                                }
                                f33915g = l9;
                            }
                        } finally {
                        }
                    }
                }
                synchronized (c3830r6) {
                    try {
                        if (f33915g != null) {
                            long longValue = f33915g.longValue();
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).Q0(longValue);
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (c3830r6) {
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).E0("E");
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).M(0L);
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).g0("D");
                }
                Object[] objArr = (Object[]) method.invoke("", new Object[0]);
                objArr.getClass();
                synchronized (c3830r6) {
                    String str = (String) objArr[0];
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).E0(str);
                    long longValue2 = ((Long) objArr[1]).longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).M(longValue2);
                    String str2 = (String) objArr[2];
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).g0(str2);
                }
                return;
        }
    }
}
