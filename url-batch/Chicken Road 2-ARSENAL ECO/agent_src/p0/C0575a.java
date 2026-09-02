package p0;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import l0.q;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f5653b = q.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f5654a;

    public C0575a(Context context) {
        this.f5654a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
