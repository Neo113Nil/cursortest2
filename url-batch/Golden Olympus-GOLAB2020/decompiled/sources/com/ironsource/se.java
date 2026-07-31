package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class se implements oe {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f19563a;

    @Metadata
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f19565b = false;

        /* renamed from: d, reason: collision with root package name */
        public static final int f19567d = 24;

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f19564a = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final int f19566c = te.SendEvent.b();

        private a() {
        }

        public final int a() {
            return f19566c;
        }
    }

    public se(@Nullable JSONObject jSONObject) {
        this.f19563a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.oe
    public long a() {
        return this.f19563a.optInt(C1463f4.f16211f, 24) * 1000;
    }

    @Override // com.ironsource.oe
    @NotNull
    public te b() {
        return te.f19746b.a(this.f19563a.optInt("strategy", a.f19564a.a()));
    }

    @Override // com.ironsource.tc
    public boolean c() {
        return this.f19563a.optBoolean(com.ironsource.mediationsdk.metadata.a.f17684j, false);
    }
}
