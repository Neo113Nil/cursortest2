package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.dt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3115dt implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30252a;

    /* renamed from: b, reason: collision with root package name */
    public final G1.a f30253b;

    public /* synthetic */ C3115dt(G1.a aVar, int i) {
        this.f30252a = i;
        this.f30253b = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Integer a() {
        boolean z8;
        Bundle bundle = ((C2687Ne) this.f30253b.f1195v).f26579n.getBundle("extras");
        int i = -1;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        z8 = false;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        z8 = true;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        z8 = 2;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        z8 = 3;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        z8 = 4;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        z8 = 5;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        z8 = 6;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        z8 = 7;
                        break;
                    }
                    z8 = -1;
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        z8 = 8;
                        break;
                    }
                    z8 = -1;
                    break;
                default:
                    z8 = -1;
                    break;
            }
            switch (z8) {
                case false:
                    i = 0;
                    break;
                case true:
                    i = 1;
                    break;
                case true:
                    i = 2;
                    break;
                case true:
                    i = 3;
                    break;
                case true:
                    i = 4;
                    break;
                case true:
                    i = 5;
                    break;
                case true:
                    i = 6;
                    break;
                case true:
                    i = 7;
                    break;
                case true:
                    i = 8;
                    break;
            }
        }
        return Integer.valueOf(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f30252a) {
            case 0:
                String str = ((C2687Ne) this.f30253b.f1195v).f26582w;
                AbstractC3137eE.h(str);
                return str;
            case 1:
                return Integer.valueOf(this.f30253b.f1194u);
            case 2:
                return Boolean.valueOf(((C2687Ne) this.f30253b.f1195v).f26577E);
            case 3:
                return Boolean.valueOf(((C2687Ne) this.f30253b.f1195v).f26576D);
            case 4:
                String str2 = ((C2687Ne) this.f30253b.f1195v).f26573A;
                AbstractC3137eE.h(str2);
                return str2;
            default:
                return a();
        }
    }
}
