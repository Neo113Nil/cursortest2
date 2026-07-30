package com.orhanobut.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class a implements c {

    @NonNull
    private final b formatStrategy;

    public a() {
        this.formatStrategy = h.newBuilder().build();
    }

    @Override // com.orhanobut.logger.c
    public boolean isLoggable(int i8, @Nullable String str) {
        return true;
    }

    @Override // com.orhanobut.logger.c
    public void log(int i8, @Nullable String str, @NonNull String str2) {
        this.formatStrategy.log(i8, str, str2);
    }

    public a(@NonNull b bVar) {
        this.formatStrategy = (b) j.checkNotNull(bVar);
    }
}
