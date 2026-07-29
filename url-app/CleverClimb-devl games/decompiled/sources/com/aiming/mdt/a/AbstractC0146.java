package com.aiming.mdt.a;

import com.aiming.mdt.utils.C0282;
import com.mopub.common.Constants;
import java.net.URL;

/* renamed from: com.aiming.mdt.a.ʼˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
abstract class AbstractC0146 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    protected AbstractC0117 f484;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    protected C0172 f485;

    AbstractC0146(C0172 c0172) {
        try {
            this.f485 = c0172;
            String protocol = new URL(c0172.m649()).getProtocol();
            if (Constants.HTTP.equalsIgnoreCase(protocol)) {
                this.f484 = new C0032();
            } else if (Constants.HTTPS.equalsIgnoreCase(protocol)) {
                this.f484 = new C0123();
            }
        } catch (Exception e) {
            C0282.m972("BaseTask", e);
            C0076.m232().m236(e);
        }
    }
}
