package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exh extends Exception {
    public exh(Intent intent) {
        super("Intent not registered in manifest: ".concat(String.valueOf(String.valueOf(intent))));
    }
}
