package com.withpersona.sdk2.inquiry.network.core;

import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.HexExtensionsKt;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;

/* loaded from: classes9.dex */
public final class b extends EventListener {
    public final Function1<String, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Function1<? super String, Unit> function1) {
        this.a = function1;
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        List peerCertificates;
        Certificate certificate;
        if (handshake == null || (peerCertificates = handshake.peerCertificates()) == null || (certificate = (Certificate) CollectionsKt.firstOrNull(peerCertificates)) == null) {
            return;
        }
        this.a.invoke(HexExtensionsKt.toHexString$default(MessageDigest.getInstance("SHA-256").digest(certificate.getEncoded())));
    }
}
