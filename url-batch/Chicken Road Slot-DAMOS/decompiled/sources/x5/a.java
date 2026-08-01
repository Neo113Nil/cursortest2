package x5;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10508b = o.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f10509a;

    public a(Context context) {
        this.f10509a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
