package defpackage;

import android.content.Intent;
import j$.util.Objects;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdg extends kar {
    private static Intent g(String str) {
        try {
            return Intent.parseUri(str, 1);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.kan
    public final kaq a(kbz kbzVar, kal kalVar) {
        if (Objects.equals(kbzVar.k, "intent")) {
            return new kdf(g(kbzVar.toString()));
        }
        return null;
    }

    @Override // defpackage.kan
    public final kaq b(URI uri, kal kalVar) {
        if (Objects.equals(uri.getScheme(), "intent")) {
            return new kdf(g(uri.toString()));
        }
        return null;
    }

    @Override // defpackage.kan
    public final String c() {
        return "intent";
    }

    @Override // defpackage.kar
    public final int d() {
        return 3;
    }

    @Override // defpackage.kar
    public final /* synthetic */ Collection e() {
        return new hjn(kca.class);
    }

    @Override // defpackage.kar
    public final void f() {
    }
}
