package E2;

import android.media.SoundPool;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final SoundPool f452a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f453b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f454c;

    public m(SoundPool soundPool) {
        this.f452a = soundPool;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.j.d(synchronizedMap, "synchronizedMap(...)");
        this.f453b = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.j.d(synchronizedMap2, "synchronizedMap(...)");
        this.f454c = synchronizedMap2;
    }
}
