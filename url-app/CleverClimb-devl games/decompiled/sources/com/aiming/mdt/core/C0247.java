package com.aiming.mdt.core;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.a.C0052;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0131;
import com.aiming.mdt.a.C0144;
import com.aiming.mdt.a.C0172;
import com.aiming.mdt.adt.C0239;
import com.aiming.mdt.core.C0249;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0283;
import com.aiming.mdt.utils.C0285;

/* renamed from: com.aiming.mdt.core.ʻʼʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0247 implements C0172.InterfaceC0174 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ Activity f766;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ String f767;

    C0247(Activity activity, String str) {
        this.f766 = activity;
        this.f767 = str;
    }

    @Override // com.aiming.mdt.a.C0172.InterfaceC0174
    /* renamed from: ʻʽ */
    public final void mo12(C0052 c0052) {
        try {
            try {
                if (c0052.m164() != 200) {
                    StringBuilder sb = new StringBuilder("Adt init request config response code not 200 : ");
                    sb.append(c0052.m164());
                    C0282.m971(sb.toString());
                    C0249.m860("AdTiming SDK init failed");
                    if (c0052 != null) {
                        try {
                            c0052.close();
                            return;
                        } catch (Exception e) {
                            C0282.m972("IOUtil", e);
                            C0076.m232().m236(e);
                            return;
                        }
                    }
                    return;
                }
                String str = new String(C0239.m852(C0283.m976(C0144.m549(c0052))), "UTF-8");
                if (TextUtils.isEmpty(str)) {
                    C0249.m860("AdTiming SDK init failed");
                    if (c0052 != null) {
                        try {
                            c0052.close();
                            return;
                        } catch (Exception e2) {
                            C0282.m972("IOUtil", e2);
                            C0076.m232().m236(e2);
                            return;
                        }
                    }
                    return;
                }
                C0131 m542 = C0144.m542(str);
                if (m542 != null) {
                    C0282.m971("Adt init request config success");
                    C0285.m979(new C0249.RunnableC0252((byte) 0));
                    C0249.m868(this.f766, this.f767, m542);
                } else {
                    C0249.m860("AdTiming SDK init failed");
                }
                if (c0052 != null) {
                    try {
                        c0052.close();
                    } catch (Exception e3) {
                        C0282.m972("IOUtil", e3);
                        C0076.m232().m236(e3);
                    }
                }
            } catch (Exception e4) {
                C0282.m972("request config exception : ", e4);
                C0076.m232().m236(e4);
                C0249.m860("AdTiming SDK init failed");
                if (c0052 != null) {
                    try {
                        c0052.close();
                    } catch (Exception e5) {
                        C0282.m972("IOUtil", e5);
                        C0076.m232().m236(e5);
                    }
                }
            }
        } catch (Throwable th) {
            if (c0052 != null) {
                try {
                    c0052.close();
                } catch (Exception e6) {
                    C0282.m972("IOUtil", e6);
                    C0076.m232().m236(e6);
                }
            }
            throw th;
        }
    }

    @Override // com.aiming.mdt.a.C0172.InterfaceC0174
    /* renamed from: ʼ */
    public final void mo14(String str) {
        StringBuilder sb = new StringBuilder("request config failed : ");
        sb.append(str);
        C0282.m971(sb.toString());
        C0249.m860("AdTiming SDK init failed");
    }
}
