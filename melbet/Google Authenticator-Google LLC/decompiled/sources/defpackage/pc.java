package defpackage;

import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pc {
    public final Signature a;
    public final Cipher b;
    public final Mac c;
    public final KeyAgreement d;
    public final IdentityCredential e;
    public final PresentationSession f;
    public final long g;

    @Deprecated
    public pc(IdentityCredential identityCredential) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = identityCredential;
        this.f = null;
        this.g = 0L;
    }

    public pc(long j) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = j;
    }

    public pc(PresentationSession presentationSession) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = presentationSession;
        this.g = 0L;
    }

    public pc(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0L;
    }

    public pc(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0L;
    }

    public pc(KeyAgreement keyAgreement) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = keyAgreement;
        this.e = null;
        this.f = null;
        this.g = 0L;
    }

    public pc(Mac mac) {
        this.a = null;
        this.b = null;
        this.c = mac;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0L;
    }
}
