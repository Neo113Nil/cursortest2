package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kr3;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class jd3<KeyFormatProtoT extends kr3, KeyT> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyFormatProtoT> f7094a;

    public jd3(Class<KeyFormatProtoT> cls) {
        this.f7094a = cls;
    }

    public abstract KeyFormatProtoT a(uo3 uo3Var);

    public final Class<KeyFormatProtoT> b() {
        return this.f7094a;
    }

    public abstract KeyT c(KeyFormatProtoT keyformatprotot);

    public Map<String, id3<KeyFormatProtoT>> d() {
        return Collections.emptyMap();
    }

    public abstract void e(KeyFormatProtoT keyformatprotot);
}
