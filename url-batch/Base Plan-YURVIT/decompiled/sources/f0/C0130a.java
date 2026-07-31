package f0;

import V0.b;
import android.content.Context;
import android.content.res.Resources;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1889a = new b();

    public static int a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        if (str2 == null) {
            return 0;
        }
        b bVar = f1889a;
        bVar.getClass();
        return bVar.f869e.matcher(str2).find() ? resources.getIdentifier(str2, null, null) : resources.getIdentifier(str2, str, context.getPackageName());
    }
}
