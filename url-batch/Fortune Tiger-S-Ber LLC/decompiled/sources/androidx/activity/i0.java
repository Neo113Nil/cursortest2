package androidx.activity;

import android.content.res.Resources;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i0 extends u2.d implements t2.l {

    /* renamed from: f, reason: collision with root package name */
    public static final i0 f112f = new i0();

    @Override // t2.l
    public final Object b(Object obj) {
        Resources resources = (Resources) obj;
        u2.c.e(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
