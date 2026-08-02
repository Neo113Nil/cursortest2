package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bex implements bml {
    private final /* synthetic */ int a;

    public bex(int i) {
        this.a = i;
    }

    public static final bey b() {
        try {
            return new bey(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.bml
    public final /* synthetic */ Object a() {
        int i = this.a;
        return i != 0 ? i != 1 ? new ArrayList() : new bdu() : b();
    }
}
