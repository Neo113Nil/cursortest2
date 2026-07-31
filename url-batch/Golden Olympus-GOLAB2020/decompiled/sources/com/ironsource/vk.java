package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class vk implements ls<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ls<String> f20082a;

    public vk(@NotNull ls<String> serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f20082a = serverResponse;
    }

    @Override // com.ironsource.ls
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return new JSONObject(this.f20082a.a());
    }
}
