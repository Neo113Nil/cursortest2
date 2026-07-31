package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1588x implements gt<JSONObject>, et<C1576v> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, C1475h2> f20262a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f20263b;

    @Metadata
    /* renamed from: com.ironsource.x$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20264a;

        static {
            int[] iArr = new int[dt.values().length];
            try {
                iArr[dt.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dt.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dt.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dt.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dt.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f20264a = iArr;
        }
    }

    public final int a() {
        return this.f20263b;
    }

    @Override // com.ironsource.xe
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull ft mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C1475h2> entry : this.f20262a.entrySet()) {
            String key = entry.getKey();
            JSONObject a4 = entry.getValue().a(mode);
            if (a4.length() > 0) {
                jSONObject.put(key, a4);
            }
        }
        return jSONObject;
    }

    private final void b(C1576v c1576v) {
        int i4;
        int i5;
        int i6 = a.f20264a[c1576v.f().ordinal()];
        if (i6 == 2) {
            i4 = this.f20263b + 1;
        } else if ((i6 != 3 && i6 != 4 && i6 != 5) || (i5 = this.f20263b) <= 0) {
            return;
        } else {
            i4 = i5 - 1;
        }
        this.f20263b = i4;
    }

    @Override // com.ironsource.et
    public void a(@NotNull C1576v record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String c4 = record.c();
        Map<String, C1475h2> map = this.f20262a;
        C1475h2 c1475h2 = map.get(c4);
        if (c1475h2 == null) {
            c1475h2 = new C1475h2();
            map.put(c4, c1475h2);
        }
        c1475h2.a(record.a(new C1582w()));
        b(record);
    }

    public final boolean b() {
        return !this.f20262a.isEmpty();
    }
}
