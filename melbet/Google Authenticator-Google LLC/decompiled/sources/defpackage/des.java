package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class des {
    public static ContentResolver a;
    public final String b;
    public final Object c;

    protected des(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void a(Context context) {
        a = context.getContentResolver();
    }

    public static des b(String str) {
        return new des(str, false);
    }
}
