package X3;

import android.media.SoundPool;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final SoundPool f3645a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3646b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3647c;

    public l(SoundPool soundPool) {
        this.f3645a = soundPool;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.i.d(synchronizedMap, "synchronizedMap(...)");
        this.f3646b = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.i.d(synchronizedMap2, "synchronizedMap(...)");
        this.f3647c = synchronizedMap2;
    }
}
