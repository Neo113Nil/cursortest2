package com.iab.omid.library.startio.attestation;

import android.content.Context;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class i implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23a;
    private final j b;

    i(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null");
        }
        this.f23a = context;
        this.b = j.a(context);
    }

    private String a(String str) {
        return (str == null || str.trim().isEmpty()) ? "1.0" : str;
    }

    private boolean b(String str) {
        try {
            new URL(str);
            if (str.startsWith("https://")) {
                return true;
            }
            return str.startsWith("http://");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.iab.omid.library.startio.attestation.b
    public String a() {
        return "FireTVFOSDAT";
    }

    @Override // com.iab.omid.library.startio.attestation.b
    public void a(a aVar) {
        if (!this.b.b()) {
            com.iab.omid.library.startio.utils.d.b("Attestation failed: Full attestation capability not available");
            return;
        }
        if (aVar == null) {
            com.iab.omid.library.startio.utils.d.b("Attestation failed: AttestationArgs is null");
            return;
        }
        if (aVar.a() == null) {
            com.iab.omid.library.startio.utils.d.b("Attestation failed: attestationData is null");
            return;
        }
        String str = (String) aVar.a().get("verifierurl");
        String a2 = a((String) aVar.a().get("version"));
        if (str == null || str.trim().isEmpty()) {
            com.iab.omid.library.startio.utils.d.b("Attestation failed: verifier URL is null or empty");
            return;
        }
        if (!b(str)) {
            com.iab.omid.library.startio.utils.d.b("Attestation failed: invalid verifier URL format: " + str);
            return;
        }
        com.iab.omid.library.startio.utils.d.a("Starting FireTV's FOS device attestation with verifier URL: " + str);
        try {
            if (this.f23a == null) {
                com.iab.omid.library.startio.utils.d.b("Attestation failed: application context is null");
            } else {
                PrivacyPass.getInstance(this.f23a).attest(new VerificationContext(Collections.singletonList(str)), (AttestAPICallback) null, a2);
            }
        } catch (IllegalArgumentException e) {
            com.iab.omid.library.startio.utils.d.a("Attestation failed: Invalid input parameters", e);
        } catch (Exception e2) {
            com.iab.omid.library.startio.utils.d.a("Attestation failed: unexpected error", e2);
        }
    }

    @Override // com.iab.omid.library.startio.attestation.b
    public h b() {
        return h.NATIVE;
    }

    @Override // com.iab.omid.library.startio.attestation.b
    public List c() {
        return Collections.singletonList("1.0");
    }
}
