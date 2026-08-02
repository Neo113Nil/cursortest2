package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cmg extends Exception {
    private final Intent a;

    public cmg(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public final Intent a() {
        return new Intent(this.a);
    }
}
