package x8;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f10562b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c, reason: collision with root package name */
    public static j f10563c;

    /* renamed from: a, reason: collision with root package name */
    public final u8.d f10564a;

    public j(u8.d dVar) {
        this.f10564a = dVar;
    }

    public final boolean a(y8.b bVar) {
        if (TextUtils.isEmpty(bVar.f10677c)) {
            return true;
        }
        long j = bVar.f10680f + bVar.f10679e;
        this.f10564a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
