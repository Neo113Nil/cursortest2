package com.crrepa.z;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class b implements e {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final d f14068a;

    public b() {
        this.f14068a = a.a().a();
    }

    @Override // com.crrepa.z.e
    public boolean a(int i8, @Nullable String str) {
        return true;
    }

    @Override // com.crrepa.z.e
    public void log(int i8, @Nullable String str, @NonNull String str2) {
        this.f14068a.log(i8, str, str2);
    }

    public b(@NonNull d dVar) {
        this.f14068a = (d) l.a(dVar);
    }
}
