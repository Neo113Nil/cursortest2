package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikx {
    public static final iah a;
    protected final Context b;

    static {
        iag a2 = iah.a(ikx.class);
        a2.b(new ian(iks.class, 1, 0));
        a2.b(new ian(Context.class, 1, 0));
        a2.b = new ikf(8);
        a = a2.a();
    }

    public ikx(Context context) {
        this.b = context;
    }

    protected final SharedPreferences a() {
        return this.b.getSharedPreferences("com.google.mlkit.internal", 0);
    }

    public final synchronized String b() {
        String string = a().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        a().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
